package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.slf4j.Marker;
import org.webrtc.EglBase;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoFrame;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class AndroidVideoDecoder implements VideoDecoder, VideoSink {
    private static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String MEDIA_FORMAT_KEY_CROP_BOTTOM = "crop-bottom";
    private static final String MEDIA_FORMAT_KEY_CROP_LEFT = "crop-left";
    private static final String MEDIA_FORMAT_KEY_CROP_RIGHT = "crop-right";
    private static final String MEDIA_FORMAT_KEY_CROP_TOP = "crop-top";
    private static final String MEDIA_FORMAT_KEY_SLICE_HEIGHT = "slice-height";
    private static final String MEDIA_FORMAT_KEY_STRIDE = "stride";
    private static final String TAG = "AndroidVideoDecoder";
    private VideoDecoder.Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecMimeType codecType;
    private int colorFormat;
    private ThreadUtils.ThreadChecker decoderThreadChecker;
    private final BlockingDeque<FrameInfo> frameInfos;
    private boolean hasDecodedFirstFrame;
    private int height;
    private boolean keyFrameRequired;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private Thread outputThread;
    private ThreadUtils.ThreadChecker outputThreadChecker;
    private DecodedTextureMetadata renderedTextureMetadata;
    private volatile boolean running;
    private final EglBase.Context sharedContext;
    private volatile Exception shutdownException;
    private int sliceHeight;
    private int stride;
    private Surface surface;
    private SurfaceTextureHelper surfaceTextureHelper;
    private int width;
    private final Object dimensionLock = new Object();
    private final Object renderedTextureMetadataLock = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class DecodedTextureMetadata {
        final Integer decodeTimeMs;
        final long presentationTimestampUs;

        DecodedTextureMetadata(long j11, Integer num) {
            this.presentationTimestampUs = j11;
            this.decodeTimeMs = num;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class FrameInfo {
        final long decodeStartTimeMs;
        final int rotation;

        FrameInfo(long j11, int i11) {
            this.decodeStartTimeMs = j11;
            this.rotation = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, int i11, EglBase.Context context) {
        if (isSupportedColorFormat(i11)) {
            Logging.d(TAG, "ctor name: " + str + " type: " + videoCodecMimeType + " color format: " + i11 + " context: " + context);
            this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
            this.codecName = str;
            this.codecType = videoCodecMimeType;
            this.colorFormat = i11;
            this.sharedContext = context;
            this.frameInfos = new LinkedBlockingDeque();
            return;
        }
        throw new IllegalArgumentException("Unsupported color format: " + i11);
    }

    private VideoFrame.Buffer copyI420Buffer(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14) {
        if (i11 % 2 == 0) {
            int i15 = (i13 + 1) / 2;
            int i16 = i12 % 2;
            int i17 = i16 == 0 ? (i14 + 1) / 2 : i14 / 2;
            int i18 = i11 / 2;
            int i19 = (i11 * i12) + 0;
            int i21 = i18 * i17;
            int i22 = i19 + ((i18 * i12) / 2);
            int i23 = i22 + i21;
            VideoFrame.I420Buffer allocateI420Buffer = allocateI420Buffer(i13, i14);
            ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.limit((i11 * i14) + 0);
            ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.position(0);
            copyPlane(byteBuffer.slice(), i11, allocateI420Buffer.getDataY(), allocateI420Buffer.getStrideY(), i13, i14);
            ByteBuffer byteBuffer4 = (ByteBuffer) byteBuffer.limit(i19 + i21);
            ByteBuffer byteBuffer5 = (ByteBuffer) byteBuffer.position(i19);
            copyPlane(byteBuffer.slice(), i18, allocateI420Buffer.getDataU(), allocateI420Buffer.getStrideU(), i15, i17);
            if (i16 == 1) {
                ByteBuffer byteBuffer6 = (ByteBuffer) byteBuffer.position(i19 + ((i17 - 1) * i18));
                ByteBuffer dataU = allocateI420Buffer.getDataU();
                ByteBuffer byteBuffer7 = (ByteBuffer) dataU.position(allocateI420Buffer.getStrideU() * i17);
                dataU.put(byteBuffer);
            }
            ByteBuffer byteBuffer8 = (ByteBuffer) byteBuffer.limit(i23);
            ByteBuffer byteBuffer9 = (ByteBuffer) byteBuffer.position(i22);
            copyPlane(byteBuffer.slice(), i18, allocateI420Buffer.getDataV(), allocateI420Buffer.getStrideV(), i15, i17);
            if (i16 == 1) {
                ByteBuffer byteBuffer10 = (ByteBuffer) byteBuffer.position(i22 + (i18 * (i17 - 1)));
                ByteBuffer dataV = allocateI420Buffer.getDataV();
                ByteBuffer byteBuffer11 = (ByteBuffer) dataV.position(allocateI420Buffer.getStrideV() * i17);
                dataV.put(byteBuffer);
            }
            return allocateI420Buffer;
        }
        throw new AssertionError("Stride is not divisible by two: " + i11);
    }

    private VideoFrame.Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14) {
        return new NV12Buffer(i13, i14, i11, i12, byteBuffer, null).toI420();
    }

    private Thread createOutputThread() {
        return new Thread("AndroidVideoDecoder.outputThread") { // from class: org.webrtc.AndroidVideoDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                AndroidVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
                while (AndroidVideoDecoder.this.running) {
                    AndroidVideoDecoder.this.deliverDecodedFrame();
                }
                AndroidVideoDecoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private void deliverByteFrame(int i11, MediaCodec.BufferInfo bufferInfo, int i12, Integer num) {
        int i13;
        int i14;
        int i15;
        int i16;
        VideoFrame.Buffer copyNV12ToI420Buffer;
        synchronized (this.dimensionLock) {
            i13 = this.width;
            i14 = this.height;
            i15 = this.stride;
            i16 = this.sliceHeight;
        }
        int i17 = bufferInfo.size;
        if (i17 < ((i13 * i14) * 3) / 2) {
            Logging.e(TAG, "Insufficient output buffer size: " + i17);
            return;
        }
        int i18 = (i17 >= ((i15 * i14) * 3) / 2 || i16 != i14 || i15 <= i13) ? i15 : (i17 * 2) / (i14 * 3);
        ByteBuffer outputBuffer = this.codec.getOutputBuffer(i11);
        ByteBuffer byteBuffer = (ByteBuffer) outputBuffer.position(bufferInfo.offset);
        ByteBuffer byteBuffer2 = (ByteBuffer) outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
        ByteBuffer slice = outputBuffer.slice();
        if (this.colorFormat == 19) {
            copyNV12ToI420Buffer = copyI420Buffer(slice, i18, i16, i13, i14);
        } else {
            copyNV12ToI420Buffer = copyNV12ToI420Buffer(slice, i18, i16, i13, i14);
        }
        this.codec.releaseOutputBuffer(i11, false);
        VideoFrame videoFrame = new VideoFrame(copyNV12ToI420Buffer, i12, bufferInfo.presentationTimeUs * 1000);
        this.callback.onDecodedFrame(videoFrame, num, null);
        videoFrame.release();
    }

    private void deliverTextureFrame(int i11, MediaCodec.BufferInfo bufferInfo, int i12, Integer num) {
        int i13;
        int i14;
        synchronized (this.dimensionLock) {
            i13 = this.width;
            i14 = this.height;
        }
        synchronized (this.renderedTextureMetadataLock) {
            if (this.renderedTextureMetadata != null) {
                this.codec.releaseOutputBuffer(i11, false);
                return;
            }
            this.surfaceTextureHelper.setTextureSize(i13, i14);
            this.surfaceTextureHelper.setFrameRotation(i12);
            this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs, num);
            this.codec.releaseOutputBuffer(i11, true);
        }
    }

    private VideoCodecStatus initDecodeInternal(int i11, int i12) {
        this.decoderThreadChecker.checkIsOnValidThread();
        String str = this.codecName;
        VideoCodecMimeType videoCodecMimeType = this.codecType;
        Logging.d(TAG, "initDecodeInternal name: " + str + " type: " + videoCodecMimeType + " width: " + i11 + " height: " + i12);
        if (this.outputThread != null) {
            Logging.e(TAG, "initDecodeInternal called while the codec is already running");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        this.width = i11;
        this.height = i12;
        this.stride = i11;
        this.sliceHeight = i12;
        this.hasDecodedFirstFrame = false;
        this.keyFrameRequired = true;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            try {
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i11, i12);
                if (this.sharedContext == null) {
                    createVideoFormat.setInteger("color-format", this.colorFormat);
                }
                this.codec.configure(createVideoFormat, this.surface, null, 0);
                this.codec.start();
                this.running = true;
                Thread createOutputThread = createOutputThread();
                this.outputThread = createOutputThread;
                createOutputThread.start();
                Logging.d(TAG, "initDecodeInternal done");
                return VideoCodecStatus.OK;
            } catch (IllegalArgumentException | IllegalStateException e11) {
                Logging.e(TAG, "initDecode failed", e11);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (IOException | IllegalArgumentException | IllegalStateException unused) {
            String str2 = this.codecName;
            Logging.e(TAG, "Cannot create media decoder " + str2);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private boolean isSupportedColorFormat(int i11) {
        for (int i12 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i12 == i11) {
                return true;
            }
        }
        return false;
    }

    private void reformat(MediaFormat mediaFormat) {
        int integer;
        int integer2;
        this.outputThreadChecker.checkIsOnValidThread();
        String mediaFormat2 = mediaFormat.toString();
        Logging.d(TAG, "Decoder format changed: " + mediaFormat2);
        if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_LEFT) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_RIGHT) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_BOTTOM) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_TOP)) {
            integer = (mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_RIGHT) + 1) - mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_LEFT);
            integer2 = (mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_BOTTOM) + 1) - mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_TOP);
        } else {
            integer = mediaFormat.getInteger(Snapshot.WIDTH);
            integer2 = mediaFormat.getInteger(Snapshot.HEIGHT);
        }
        synchronized (this.dimensionLock) {
            int i11 = this.width;
            if (integer != i11 || integer2 != this.height) {
                if (this.hasDecodedFirstFrame) {
                    int i12 = this.width;
                    int i13 = this.height;
                    stopOnOutputThread(new RuntimeException("Unexpected size change. Configured " + i12 + Marker.ANY_MARKER + i13 + ". New " + integer + Marker.ANY_MARKER + integer2));
                    return;
                }
                if (integer > 0 && integer2 > 0) {
                    this.width = integer;
                    this.height = integer2;
                }
                int i14 = this.height;
                Logging.w(TAG, "Unexpected format dimensions. Configured " + i11 + Marker.ANY_MARKER + i14 + ". New " + integer + Marker.ANY_MARKER + integer2 + ". Skip it");
                return;
            }
            if (this.surfaceTextureHelper == null && mediaFormat.containsKey("color-format")) {
                int integer3 = mediaFormat.getInteger("color-format");
                this.colorFormat = integer3;
                String hexString = Integer.toHexString(integer3);
                Logging.d(TAG, "Color: 0x" + hexString);
                if (!isSupportedColorFormat(this.colorFormat)) {
                    int i15 = this.colorFormat;
                    stopOnOutputThread(new IllegalStateException("Unsupported color format: " + i15));
                    return;
                }
            }
            synchronized (this.dimensionLock) {
                if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_STRIDE)) {
                    this.stride = mediaFormat.getInteger(MEDIA_FORMAT_KEY_STRIDE);
                }
                if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_SLICE_HEIGHT)) {
                    this.sliceHeight = mediaFormat.getInteger(MEDIA_FORMAT_KEY_SLICE_HEIGHT);
                }
                int i16 = this.stride;
                int i17 = this.sliceHeight;
                Logging.d(TAG, "Frame stride and slice height: " + i16 + " x " + i17);
                this.stride = Math.max(this.width, this.stride);
                this.sliceHeight = Math.max(this.height, this.sliceHeight);
            }
        }
    }

    private VideoCodecStatus reinitDecode(int i11, int i12) {
        this.decoderThreadChecker.checkIsOnValidThread();
        VideoCodecStatus releaseInternal = releaseInternal();
        return releaseInternal != VideoCodecStatus.OK ? releaseInternal : initDecodeInternal(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e11) {
            Logging.e(TAG, "Media decoder stop failed", e11);
        }
        try {
            this.codec.release();
        } catch (Exception e12) {
            Logging.e(TAG, "Media decoder release failed", e12);
            this.shutdownException = e12;
        }
        Logging.d(TAG, "Release on output thread done");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [org.webrtc.MediaCodecWrapper, java.lang.Thread] */
    private VideoCodecStatus releaseInternal() {
        if (!this.running) {
            Logging.d(TAG, "release: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
        try {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000L)) {
                Logging.e(TAG, "Media decoder release timeout", new RuntimeException());
                return VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                Logging.e(TAG, "Media decoder release error", new RuntimeException(this.shutdownException));
                this.shutdownException = null;
                return VideoCodecStatus.ERROR;
            } else {
                this.codec = null;
                this.outputThread = null;
                return VideoCodecStatus.OK;
            }
        } finally {
            this.codec = null;
            this.outputThread = null;
        }
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    protected VideoFrame.I420Buffer allocateI420Buffer(int i11, int i12) {
        return JavaI420Buffer.allocate(i11, i12);
    }

    protected void copyPlane(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, int i13, int i14) {
        YuvHelper.copyPlane(byteBuffer, i11, byteBuffer2, i12, i13, i14);
    }

    protected SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
        int i11;
        int i12;
        VideoCodecStatus reinitDecode;
        this.decoderThreadChecker.checkIsOnValidThread();
        MediaCodecWrapper mediaCodecWrapper = this.codec;
        if (mediaCodecWrapper != null && this.callback != null) {
            ByteBuffer byteBuffer = encodedImage.buffer;
            if (byteBuffer == null) {
                Logging.e(TAG, "decode() - no input data");
                return VideoCodecStatus.ERR_PARAMETER;
            }
            int remaining = byteBuffer.remaining();
            if (remaining == 0) {
                Logging.e(TAG, "decode() - input buffer empty");
                return VideoCodecStatus.ERR_PARAMETER;
            }
            synchronized (this.dimensionLock) {
                i11 = this.width;
                i12 = this.height;
            }
            int i13 = encodedImage.encodedWidth;
            int i14 = encodedImage.encodedHeight;
            if (i13 * i14 <= 0 || ((i13 == i11 && i14 == i12) || (reinitDecode = reinitDecode(i13, i14)) == VideoCodecStatus.OK)) {
                if (this.keyFrameRequired && encodedImage.frameType != EncodedImage.FrameType.VideoFrameKey) {
                    Logging.e(TAG, "decode() - key frame required first");
                    return VideoCodecStatus.NO_OUTPUT;
                }
                try {
                    int dequeueInputBuffer = this.codec.dequeueInputBuffer(500000L);
                    if (dequeueInputBuffer < 0) {
                        Logging.e(TAG, "decode() - no HW buffers available; decoder falling behind");
                        return VideoCodecStatus.ERROR;
                    }
                    try {
                        ByteBuffer inputBuffer = this.codec.getInputBuffer(dequeueInputBuffer);
                        if (inputBuffer.capacity() < remaining) {
                            Logging.e(TAG, "decode() - HW buffer too small");
                            return VideoCodecStatus.ERROR;
                        }
                        inputBuffer.put(encodedImage.buffer);
                        this.frameInfos.offer(new FrameInfo(SystemClock.elapsedRealtime(), encodedImage.rotation));
                        try {
                            this.codec.queueInputBuffer(dequeueInputBuffer, 0, remaining, TimeUnit.NANOSECONDS.toMicros(encodedImage.captureTimeNs), 0);
                            if (this.keyFrameRequired) {
                                this.keyFrameRequired = false;
                            }
                            return VideoCodecStatus.OK;
                        } catch (IllegalStateException e11) {
                            Logging.e(TAG, "queueInputBuffer failed", e11);
                            this.frameInfos.pollLast();
                            return VideoCodecStatus.ERROR;
                        }
                    } catch (IllegalStateException e12) {
                        Logging.e(TAG, "getInputBuffer with index=" + dequeueInputBuffer + " failed", e12);
                        return VideoCodecStatus.ERROR;
                    }
                } catch (IllegalStateException e13) {
                    Logging.e(TAG, "dequeueInputBuffer failed", e13);
                    return VideoCodecStatus.ERROR;
                }
            }
            return reinitDecode;
        }
        boolean z11 = mediaCodecWrapper != null;
        VideoDecoder.Callback callback = this.callback;
        Logging.d(TAG, "decode uninitalized, codec: " + z11 + ", callback: " + callback);
        return VideoCodecStatus.UNINITIALIZED;
    }

    protected void deliverDecodedFrame() {
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (dequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
            } else if (dequeueOutputBuffer < 0) {
                Logging.v(TAG, "dequeueOutputBuffer returned " + dequeueOutputBuffer);
            } else {
                FrameInfo poll = this.frameInfos.poll();
                Integer num = null;
                int i11 = 0;
                if (poll != null) {
                    num = Integer.valueOf((int) (SystemClock.elapsedRealtime() - poll.decodeStartTimeMs));
                    i11 = poll.rotation;
                }
                this.hasDecodedFirstFrame = true;
                if (this.surfaceTextureHelper != null) {
                    deliverTextureFrame(dequeueOutputBuffer, bufferInfo, i11, num);
                } else {
                    deliverByteFrame(dequeueOutputBuffer, bufferInfo, i11, num);
                }
            }
        } catch (IllegalStateException e11) {
            Logging.e(TAG, "deliverDecodedFrame failed", e11);
        }
    }

    @Override // org.webrtc.VideoDecoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        this.decoderThreadChecker = new ThreadUtils.ThreadChecker();
        this.callback = callback;
        if (this.sharedContext != null) {
            this.surfaceTextureHelper = createSurfaceTextureHelper();
            this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
            this.surfaceTextureHelper.startListening(this);
        }
        return initDecodeInternal(settings.width, settings.height);
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        long j11;
        Integer num;
        synchronized (this.renderedTextureMetadataLock) {
            DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
            if (decodedTextureMetadata != null) {
                j11 = decodedTextureMetadata.presentationTimestampUs * 1000;
                num = decodedTextureMetadata.decodeTimeMs;
                this.renderedTextureMetadata = null;
            } else {
                throw new IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
        }
        this.callback.onDecodedFrame(new VideoFrame(videoFrame.getBuffer(), videoFrame.getRotation(), j11), num, null);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus release() {
        Logging.d(TAG, "release");
        VideoCodecStatus releaseInternal = releaseInternal();
        if (this.surface != null) {
            releaseSurface();
            this.surface = null;
            this.surfaceTextureHelper.stopListening();
            this.surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
        synchronized (this.renderedTextureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        this.frameInfos.clear();
        return releaseInternal;
    }

    protected void releaseSurface() {
        this.surface.release();
    }
}