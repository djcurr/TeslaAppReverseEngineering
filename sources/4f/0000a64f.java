package org.webrtc;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.CountDownLatch;
import org.spongycastle.crypto.tls.CipherSuite;
import org.webrtc.EglBase;
import org.webrtc.VideoFrame;

/* loaded from: classes4.dex */
public class VideoFileRenderer implements VideoSink {
    private static final String TAG = "VideoFileRenderer";
    private EglBase eglBase;
    private final HandlerThread fileThread;
    private final Handler fileThreadHandler;
    private int frameCount;
    private final int outputFileHeight;
    private final String outputFileName;
    private final int outputFileWidth;
    private final ByteBuffer outputFrameBuffer;
    private final int outputFrameSize;
    private final HandlerThread renderThread;
    private final Handler renderThreadHandler;
    private final FileOutputStream videoOutFile;
    private YuvConverter yuvConverter;

    public VideoFileRenderer(String str, int i11, int i12, final EglBase.Context context) {
        if (i11 % 2 != 1 && i12 % 2 != 1) {
            this.outputFileName = str;
            this.outputFileWidth = i11;
            this.outputFileHeight = i12;
            int i13 = ((i11 * i12) * 3) / 2;
            this.outputFrameSize = i13;
            this.outputFrameBuffer = ByteBuffer.allocateDirect(i13);
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            this.videoOutFile = fileOutputStream;
            fileOutputStream.write(("YUV4MPEG2 C420 W" + i11 + " H" + i12 + " Ip F30:1 A1:1\n").getBytes(Charset.forName("US-ASCII")));
            HandlerThread handlerThread = new HandlerThread("VideoFileRendererRenderThread");
            this.renderThread = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.renderThreadHandler = handler;
            HandlerThread handlerThread2 = new HandlerThread("VideoFileRendererFileThread");
            this.fileThread = handlerThread2;
            handlerThread2.start();
            this.fileThreadHandler = new Handler(handlerThread2.getLooper());
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: org.webrtc.VideoFileRenderer.1
                {
                    VideoFileRenderer.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    VideoFileRenderer.this.eglBase = EglBase.create(context, EglBase.CONFIG_PIXEL_BUFFER);
                    VideoFileRenderer.this.eglBase.createDummyPbufferSurface();
                    VideoFileRenderer.this.eglBase.makeCurrent();
                    VideoFileRenderer.this.yuvConverter = new YuvConverter();
                }
            });
            return;
        }
        throw new IllegalArgumentException("Does not support uneven width or height");
    }

    public static /* synthetic */ void a(VideoFileRenderer videoFileRenderer) {
        videoFileRenderer.lambda$release$3();
    }

    public static /* synthetic */ void b(VideoFileRenderer videoFileRenderer, VideoFrame videoFrame) {
        videoFileRenderer.lambda$onFrame$0(videoFrame);
    }

    public static /* synthetic */ void c(VideoFileRenderer videoFileRenderer, CountDownLatch countDownLatch) {
        videoFileRenderer.lambda$release$2(countDownLatch);
    }

    public static /* synthetic */ void d(VideoFileRenderer videoFileRenderer, VideoFrame.I420Buffer i420Buffer, VideoFrame videoFrame) {
        videoFileRenderer.lambda$renderFrameOnRenderThread$1(i420Buffer, videoFrame);
    }

    public /* synthetic */ void lambda$release$2(CountDownLatch countDownLatch) {
        this.yuvConverter.release();
        this.eglBase.release();
        this.renderThread.quit();
        countDownLatch.countDown();
    }

    public /* synthetic */ void lambda$release$3() {
        try {
            this.videoOutFile.close();
            String str = this.outputFileName;
            int i11 = this.frameCount;
            int i12 = this.outputFileWidth;
            int i13 = this.outputFileHeight;
            Logging.d(TAG, "Video written to disk as " + str + ". The number of frames is " + i11 + " and the dimensions of the frames are " + i12 + "x" + i13 + ".");
            this.fileThread.quit();
        } catch (IOException e11) {
            throw new RuntimeException("Error closing output file", e11);
        }
    }

    public /* synthetic */ void lambda$renderFrameOnRenderThread$1(VideoFrame.I420Buffer i420Buffer, VideoFrame videoFrame) {
        YuvHelper.I420Rotate(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), this.outputFrameBuffer, i420Buffer.getWidth(), i420Buffer.getHeight(), videoFrame.getRotation());
        i420Buffer.release();
        try {
            this.videoOutFile.write("FRAME\n".getBytes(Charset.forName("US-ASCII")));
            this.videoOutFile.write(this.outputFrameBuffer.array(), this.outputFrameBuffer.arrayOffset(), this.outputFrameSize);
            this.frameCount++;
        } catch (IOException e11) {
            throw new RuntimeException("Error writing video to disk", e11);
        }
    }

    /* renamed from: renderFrameOnRenderThread */
    public void lambda$onFrame$0(final VideoFrame videoFrame) {
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        int i11 = videoFrame.getRotation() % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 == 0 ? this.outputFileWidth : this.outputFileHeight;
        int i12 = videoFrame.getRotation() % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 == 0 ? this.outputFileHeight : this.outputFileWidth;
        float width = buffer.getWidth() / buffer.getHeight();
        float f11 = i11 / i12;
        int width2 = buffer.getWidth();
        int height = buffer.getHeight();
        if (f11 > width) {
            height = (int) (height * (width / f11));
        } else {
            width2 = (int) (width2 * (f11 / width));
        }
        VideoFrame.Buffer cropAndScale = buffer.cropAndScale((buffer.getWidth() - width2) / 2, (buffer.getHeight() - height) / 2, width2, height, i11, i12);
        videoFrame.release();
        final VideoFrame.I420Buffer i420 = cropAndScale.toI420();
        cropAndScale.release();
        this.fileThreadHandler.post(new Runnable() { // from class: org.webrtc.e1
            {
                VideoFileRenderer.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VideoFileRenderer.d(VideoFileRenderer.this, i420, videoFrame);
            }
        });
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(final VideoFrame videoFrame) {
        videoFrame.retain();
        this.renderThreadHandler.post(new Runnable() { // from class: org.webrtc.f1
            {
                VideoFileRenderer.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VideoFileRenderer.b(VideoFileRenderer.this, videoFrame);
            }
        });
    }

    public void release() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.renderThreadHandler.post(new Runnable() { // from class: org.webrtc.d1
            {
                VideoFileRenderer.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VideoFileRenderer.c(VideoFileRenderer.this, countDownLatch);
            }
        });
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        this.fileThreadHandler.post(new Runnable() { // from class: org.webrtc.c1
            {
                VideoFileRenderer.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VideoFileRenderer.a(VideoFileRenderer.this);
            }
        });
        try {
            this.fileThread.join();
        } catch (InterruptedException e11) {
            Thread.currentThread().interrupt();
            Logging.e(TAG, "Interrupted while waiting for the write to disk to complete.", e11);
        }
    }
}