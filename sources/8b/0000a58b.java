package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase14;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoFrame;

/* loaded from: classes4.dex */
public class HardwareVideoEncoder implements VideoEncoder {
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final String KEY_BITRATE_MODE = "bitrate-mode";
    private static final int MAX_ENCODER_Q_SIZE = 2;
    private static final int MAX_VIDEO_FRAMERATE = 30;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final int REQUIRED_RESOLUTION_ALIGNMENT = 16;
    private static final String TAG = "HardwareVideoEncoder";
    private static final int VIDEO_AVC_LEVEL_3 = 256;
    private static final int VIDEO_AVC_PROFILE_HIGH = 8;
    private static final int VIDEO_ControlRateConstant = 2;
    private int adjustedBitrate;
    private boolean automaticResizeOn;
    private final BitrateAdjuster bitrateAdjuster;
    private VideoEncoder.Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecMimeType codecType;
    private ByteBuffer configBuffer;
    private final ThreadUtils.ThreadChecker encodeThreadChecker;
    private final long forcedKeyFrameNs;
    private int height;
    private final int keyFrameIntervalSec;
    private long lastKeyFrameNs;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private long nextPresentationTimestampUs;
    private final BusyCount outputBuffersBusyCount;
    private Thread outputThread;
    private final ThreadUtils.ThreadChecker outputThreadChecker;
    private final Map<String, String> params;
    private volatile boolean running;
    private final EglBase14.Context sharedContext;
    private volatile Exception shutdownException;
    private int sliceHeight;
    private int stride;
    private final Integer surfaceColorFormat;
    private EglBase14 textureEglBase;
    private Surface textureInputSurface;
    private boolean useSurfaceMode;
    private int width;
    private final Integer yuvColorFormat;
    private final YuvFormat yuvFormat;
    private final GlRectDrawer textureDrawer = new GlRectDrawer();
    private final VideoFrameDrawer videoFrameDrawer = new VideoFrameDrawer();
    private final BlockingDeque<EncodedImage.Builder> outputBuilders = new LinkedBlockingDeque();

    /* loaded from: classes4.dex */
    public static class BusyCount {
        private int count;
        private final Object countLock;

        private BusyCount() {
            this.countLock = new Object();
        }

        public void decrement() {
            synchronized (this.countLock) {
                int i11 = this.count - 1;
                this.count = i11;
                if (i11 == 0) {
                    this.countLock.notifyAll();
                }
            }
        }

        public void increment() {
            synchronized (this.countLock) {
                this.count++;
            }
        }

        public void waitForZero() {
            boolean z11;
            synchronized (this.countLock) {
                z11 = false;
                while (this.count > 0) {
                    try {
                        this.countLock.wait();
                    } catch (InterruptedException e11) {
                        Logging.e(HardwareVideoEncoder.TAG, "Interrupted while waiting on busy count", e11);
                        z11 = true;
                    }
                }
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class YuvFormat {
        private static final /* synthetic */ YuvFormat[] $VALUES;
        public static final YuvFormat I420;
        public static final YuvFormat NV12;

        /* renamed from: org.webrtc.HardwareVideoEncoder$YuvFormat$1 */
        /* loaded from: classes4.dex */
        enum AnonymousClass1 extends YuvFormat {
            private AnonymousClass1(String str, int i11) {
                super(str, i11);
            }

            @Override // org.webrtc.HardwareVideoEncoder.YuvFormat
            void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer, int i11, int i12) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight(), i11, i12, i11 / 2, i12 / 2);
                i420.release();
            }
        }

        /* renamed from: org.webrtc.HardwareVideoEncoder$YuvFormat$2 */
        /* loaded from: classes4.dex */
        enum AnonymousClass2 extends YuvFormat {
            private AnonymousClass2(String str, int i11) {
                super(str, i11);
            }

            @Override // org.webrtc.HardwareVideoEncoder.YuvFormat
            void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer, int i11, int i12) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight(), i11, i12);
                i420.release();
            }
        }

        static {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1("I420", 0);
            I420 = anonymousClass1;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2("NV12", 1);
            NV12 = anonymousClass2;
            $VALUES = new YuvFormat[]{anonymousClass1, anonymousClass2};
        }

        private YuvFormat(String str, int i11) {
            super(str, i11);
        }

        public static YuvFormat valueOf(String str) {
            return (YuvFormat) Enum.valueOf(YuvFormat.class, str);
        }

        public static YuvFormat[] values() {
            return (YuvFormat[]) $VALUES.clone();
        }

        abstract void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer, int i11, int i12);

        static YuvFormat valueOf(int i11) {
            if (i11 != 19) {
                if (i11 != 21 && i11 != 2141391872 && i11 != 2141391876) {
                    throw new IllegalArgumentException("Unsupported colorFormat: " + i11);
                }
                return NV12;
            }
            return I420;
        }
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, Integer num, Integer num2, Map<String, String> map, int i11, int i12, BitrateAdjuster bitrateAdjuster, EglBase14.Context context) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.encodeThreadChecker = threadChecker;
        this.outputThreadChecker = new ThreadUtils.ThreadChecker();
        this.outputBuffersBusyCount = new BusyCount();
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecMimeType;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue());
        this.params = map;
        this.keyFrameIntervalSec = i11;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos(i12);
        this.bitrateAdjuster = bitrateAdjuster;
        this.sharedContext = context;
        threadChecker.detachThread();
    }

    public static /* synthetic */ void a(HardwareVideoEncoder hardwareVideoEncoder, int i11) {
        hardwareVideoEncoder.lambda$deliverEncodedImage$0(i11);
    }

    private boolean canUseSurface() {
        return (this.sharedContext == null || this.surfaceColorFormat == null) ? false : true;
    }

    private Thread createOutputThread() {
        return new Thread() { // from class: org.webrtc.HardwareVideoEncoder.1
            {
                HardwareVideoEncoder.this = this;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (HardwareVideoEncoder.this.running) {
                    HardwareVideoEncoder.this.deliverEncodedImage();
                }
                HardwareVideoEncoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private VideoCodecStatus encodeByteBuffer(VideoFrame videoFrame, long j11, VideoFrame.Buffer buffer, int i11) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(0L);
            if (dequeueInputBuffer == -1) {
                Logging.d(TAG, "Dropped frame, no input buffers available");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                fillInputBuffer(this.codec.getInputBuffer(dequeueInputBuffer), buffer);
                try {
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, i11, j11, 0);
                    return VideoCodecStatus.OK;
                } catch (IllegalStateException e11) {
                    Logging.e(TAG, "queueInputBuffer failed", e11);
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

    private VideoCodecStatus encodeTextureBuffer(VideoFrame videoFrame, long j11) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            GLES20.glClear(16384);
            this.videoFrameDrawer.drawFrame(new VideoFrame(videoFrame.getBuffer(), 0, videoFrame.getTimestampNs()), this.textureDrawer, null);
            this.textureEglBase.swapBuffers(TimeUnit.MICROSECONDS.toNanos(j11));
            return VideoCodecStatus.OK;
        } catch (RuntimeException e11) {
            Logging.e(TAG, "encodeTexture failed", e11);
            return VideoCodecStatus.ERROR;
        }
    }

    private static int getSliceHeight(MediaFormat mediaFormat, int i11) {
        return (Build.VERSION.SDK_INT < 23 || mediaFormat == null || !mediaFormat.containsKey("slice-height")) ? i11 : mediaFormat.getInteger("slice-height");
    }

    private static int getStride(MediaFormat mediaFormat, int i11) {
        return (Build.VERSION.SDK_INT < 23 || mediaFormat == null || !mediaFormat.containsKey("stride")) ? i11 : mediaFormat.getInteger("stride");
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0092, code lost:
        if (r5 == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0094, code lost:
        org.webrtc.Logging.w(org.webrtc.HardwareVideoEncoder.TAG, "Unknown profile level id: " + r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.webrtc.VideoCodecStatus initEncodeInternal() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.initEncodeInternal():org.webrtc.VideoCodecStatus");
    }

    public /* synthetic */ void lambda$deliverEncodedImage$0(int i11) {
        try {
            this.codec.releaseOutputBuffer(i11, false);
        } catch (Exception e11) {
            Logging.e(TAG, "releaseOutputBuffer failed", e11);
        }
        this.outputBuffersBusyCount.decrement();
    }

    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "Releasing MediaCodec on output thread");
        this.outputBuffersBusyCount.waitForZero();
        try {
            this.codec.stop();
        } catch (Exception e11) {
            Logging.e(TAG, "Media encoder stop failed", e11);
        }
        try {
            this.codec.release();
        } catch (Exception e12) {
            Logging.e(TAG, "Media encoder release failed", e12);
            this.shutdownException = e12;
        }
        this.configBuffer = null;
        Logging.d(TAG, "Release on output thread done");
    }

    private void requestKeyFrame(long j11) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j11;
        } catch (IllegalStateException e11) {
            Logging.e(TAG, "requestKeyFrame failed", e11);
        }
    }

    private VideoCodecStatus resetCodec(int i11, int i12, boolean z11) {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus release = release();
        if (release != VideoCodecStatus.OK) {
            return release;
        }
        if (i11 % 16 == 0 && i12 % 16 == 0) {
            this.width = i11;
            this.height = i12;
            this.useSurfaceMode = z11;
            return initEncodeInternal();
        }
        Logging.e(TAG, "MediaCodec is only tested with resolutions that are 16x16 aligned.");
        return VideoCodecStatus.ERR_SIZE;
    }

    private boolean shouldForceKeyFrame(long j11) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long j12 = this.forcedKeyFrameNs;
        return j12 > 0 && j11 > this.lastKeyFrameNs + j12;
    }

    private VideoCodecStatus updateBitrate() {
        this.outputThreadChecker.checkIsOnValidThread();
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", this.adjustedBitrate);
            this.codec.setParameters(bundle);
            return VideoCodecStatus.OK;
        } catch (IllegalStateException e11) {
            Logging.e(TAG, "updateBitrate failed", e11);
            return VideoCodecStatus.ERROR;
        }
    }

    protected void deliverEncodedImage() {
        ByteBuffer slice;
        EncodedImage.FrameType frameType;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            final int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (dequeueOutputBuffer < 0) {
                if (dequeueOutputBuffer == -3) {
                    this.outputBuffersBusyCount.waitForZero();
                    return;
                }
                return;
            }
            ByteBuffer outputBuffer = this.codec.getOutputBuffer(dequeueOutputBuffer);
            ByteBuffer byteBuffer = (ByteBuffer) outputBuffer.position(bufferInfo.offset);
            ByteBuffer byteBuffer2 = (ByteBuffer) outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
            if ((bufferInfo.flags & 2) != 0) {
                int i11 = bufferInfo.offset;
                int i12 = bufferInfo.size;
                Logging.d(TAG, "Config frame generated. Offset: " + i11 + ". Size: " + i12);
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                this.configBuffer = allocateDirect;
                allocateDirect.put(outputBuffer);
                return;
            }
            this.bitrateAdjuster.reportEncodedFrame(bufferInfo.size);
            if (this.adjustedBitrate != this.bitrateAdjuster.getAdjustedBitrateBps()) {
                updateBitrate();
            }
            boolean z11 = true;
            if ((bufferInfo.flags & 1) == 0) {
                z11 = false;
            }
            if (z11) {
                Logging.d(TAG, "Sync frame generated");
            }
            if (z11 && this.codecType == VideoCodecMimeType.H264) {
                int capacity = this.configBuffer.capacity();
                int i13 = bufferInfo.offset;
                int i14 = bufferInfo.size;
                Logging.d(TAG, "Prepending config frame of size " + capacity + " to output buffer with offset " + i13 + ", size " + i14);
                slice = ByteBuffer.allocateDirect(bufferInfo.size + this.configBuffer.capacity());
                ByteBuffer byteBuffer3 = (ByteBuffer) this.configBuffer.rewind();
                slice.put(this.configBuffer);
                slice.put(outputBuffer);
                ByteBuffer byteBuffer4 = (ByteBuffer) slice.rewind();
            } else {
                slice = outputBuffer.slice();
            }
            if (z11) {
                frameType = EncodedImage.FrameType.VideoFrameKey;
            } else {
                frameType = EncodedImage.FrameType.VideoFrameDelta;
            }
            this.outputBuffersBusyCount.increment();
            EncodedImage createEncodedImage = this.outputBuilders.poll().setBuffer(slice, new Runnable() { // from class: org.webrtc.y
                {
                    HardwareVideoEncoder.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    HardwareVideoEncoder.a(HardwareVideoEncoder.this, dequeueOutputBuffer);
                }
            }).setFrameType(frameType).createEncodedImage();
            this.callback.onEncodedFrame(createEncodedImage, new VideoEncoder.CodecSpecificInfo());
            createEncodedImage.release();
        } catch (IllegalStateException e11) {
            Logging.e(TAG, "deliverOutput failed", e11);
        }
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        VideoCodecStatus resetCodec;
        VideoCodecStatus encodeByteBuffer;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.codec == null) {
            return VideoCodecStatus.UNINITIALIZED;
        }
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        boolean z11 = buffer instanceof VideoFrame.TextureBuffer;
        int width = videoFrame.getBuffer().getWidth();
        int height = videoFrame.getBuffer().getHeight();
        boolean z12 = canUseSurface() && z11;
        if ((width == this.width && height == this.height && z12 == this.useSurfaceMode) || (resetCodec = resetCodec(width, height, z12)) == VideoCodecStatus.OK) {
            if (this.outputBuilders.size() > 2) {
                Logging.e(TAG, "Dropped frame, encoder queue full");
                return VideoCodecStatus.NO_OUTPUT;
            }
            boolean z13 = false;
            for (EncodedImage.FrameType frameType : encodeInfo.frameTypes) {
                if (frameType == EncodedImage.FrameType.VideoFrameKey) {
                    z13 = true;
                }
            }
            if (z13 || shouldForceKeyFrame(videoFrame.getTimestampNs())) {
                requestKeyFrame(videoFrame.getTimestampNs());
            }
            int height2 = ((buffer.getHeight() * buffer.getWidth()) * 3) / 2;
            this.outputBuilders.offer(EncodedImage.builder().setCaptureTimeNs(videoFrame.getTimestampNs()).setEncodedWidth(videoFrame.getBuffer().getWidth()).setEncodedHeight(videoFrame.getBuffer().getHeight()).setRotation(videoFrame.getRotation()));
            long j11 = this.nextPresentationTimestampUs;
            this.nextPresentationTimestampUs += (long) (TimeUnit.SECONDS.toMicros(1L) / this.bitrateAdjuster.getAdjustedFramerateFps());
            if (this.useSurfaceMode) {
                encodeByteBuffer = encodeTextureBuffer(videoFrame, j11);
            } else {
                encodeByteBuffer = encodeByteBuffer(videoFrame, j11, buffer, height2);
            }
            if (encodeByteBuffer != VideoCodecStatus.OK) {
                this.outputBuilders.pollLast();
            }
            return encodeByteBuffer;
        }
        return resetCodec;
    }

    protected void fillInputBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
        this.yuvFormat.fillBuffer(byteBuffer, buffer, this.stride, this.sliceHeight);
    }

    @Override // org.webrtc.VideoEncoder
    public VideoEncoder.EncoderInfo getEncoderInfo() {
        return new VideoEncoder.EncoderInfo(16, false);
    }

    @Override // org.webrtc.VideoEncoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoEncoder.ScalingSettings getScalingSettings() {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.automaticResizeOn) {
            VideoCodecMimeType videoCodecMimeType = this.codecType;
            if (videoCodecMimeType == VideoCodecMimeType.VP8) {
                return new VideoEncoder.ScalingSettings(29, 95);
            }
            if (videoCodecMimeType == VideoCodecMimeType.H264) {
                return new VideoEncoder.ScalingSettings(24, 37);
            }
        }
        return VideoEncoder.ScalingSettings.OFF;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        int i11;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.callback = callback;
        this.automaticResizeOn = settings.automaticResizeOn;
        int i12 = settings.width;
        if (i12 % 16 == 0) {
            int i13 = settings.height;
            if (i13 % 16 == 0) {
                this.width = i12;
                this.height = i13;
                this.useSurfaceMode = canUseSurface();
                int i14 = settings.startBitrate;
                if (i14 != 0 && (i11 = settings.maxFramerate) != 0) {
                    this.bitrateAdjuster.setTargets(i14 * 1000, i11);
                }
                this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
                int i15 = this.width;
                int i16 = this.height;
                int i17 = settings.startBitrate;
                int i18 = settings.maxFramerate;
                boolean z11 = this.useSurfaceMode;
                Logging.d(TAG, "initEncode: " + i15 + " x " + i16 + ". @ " + i17 + "kbps. Fps: " + i18 + " Use surface mode: " + z11);
                return initEncodeInternal();
            }
        }
        Logging.e(TAG, "MediaCodec is only tested with resolutions that are 16x16 aligned.");
        return VideoCodecStatus.ERR_SIZE;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus release() {
        VideoCodecStatus videoCodecStatus;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.outputThread == null) {
            videoCodecStatus = VideoCodecStatus.OK;
        } else {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000L)) {
                Logging.e(TAG, "Media encoder release timeout");
                videoCodecStatus = VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                Logging.e(TAG, "Media encoder release exception", this.shutdownException);
                videoCodecStatus = VideoCodecStatus.ERROR;
            } else {
                videoCodecStatus = VideoCodecStatus.OK;
            }
        }
        this.textureDrawer.release();
        this.videoFrameDrawer.release();
        EglBase14 eglBase14 = this.textureEglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.textureEglBase = null;
        }
        Surface surface = this.textureInputSurface;
        if (surface != null) {
            surface.release();
            this.textureInputSurface = null;
        }
        this.outputBuilders.clear();
        this.codec = null;
        this.outputThread = null;
        this.encodeThreadChecker.detachThread();
        return videoCodecStatus;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i11) {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (i11 > 30) {
            i11 = 30;
        }
        this.bitrateAdjuster.setTargets(bitrateAllocation.getSum(), i11);
        return VideoCodecStatus.OK;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.bitrateAdjuster.setTargets(rateControlParameters.bitrate.getSum(), rateControlParameters.framerateFps);
        return VideoCodecStatus.OK;
    }
}