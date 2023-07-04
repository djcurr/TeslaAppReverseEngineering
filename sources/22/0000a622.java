package org.webrtc;

import android.graphics.Matrix;
import android.os.Handler;
import java.util.concurrent.Callable;
import org.webrtc.VideoFrame;

/* loaded from: classes4.dex */
public class TextureBufferImpl implements VideoFrame.TextureBuffer {
    private final int height;

    /* renamed from: id */
    private final int f43894id;
    private final RefCountDelegate refCountDelegate;
    private final RefCountMonitor refCountMonitor;
    private final Handler toI420Handler;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int unscaledHeight;
    private final int unscaledWidth;
    private final int width;
    private final YuvConverter yuvConverter;

    /* loaded from: classes4.dex */
    public interface RefCountMonitor {
        void onDestroy(TextureBufferImpl textureBufferImpl);

        void onRelease(TextureBufferImpl textureBufferImpl);

        void onRetain(TextureBufferImpl textureBufferImpl);
    }

    public TextureBufferImpl(int i11, int i12, VideoFrame.TextureBuffer.Type type, int i13, Matrix matrix, Handler handler, YuvConverter yuvConverter, final Runnable runnable) {
        this(i11, i12, i11, i12, type, i13, matrix, handler, yuvConverter, new RefCountMonitor() { // from class: org.webrtc.TextureBufferImpl.1
            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onDestroy(TextureBufferImpl textureBufferImpl) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRelease(TextureBufferImpl textureBufferImpl) {
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRetain(TextureBufferImpl textureBufferImpl) {
            }
        });
    }

    public static /* synthetic */ void a(TextureBufferImpl textureBufferImpl, RefCountMonitor refCountMonitor) {
        textureBufferImpl.lambda$new$0(refCountMonitor);
    }

    public static /* synthetic */ VideoFrame.I420Buffer b(TextureBufferImpl textureBufferImpl) {
        return textureBufferImpl.lambda$toI420$1();
    }

    public /* synthetic */ void lambda$new$0(RefCountMonitor refCountMonitor) {
        refCountMonitor.onDestroy(this);
    }

    public /* synthetic */ VideoFrame.I420Buffer lambda$toI420$1() {
        return this.yuvConverter.convert(this);
    }

    public TextureBufferImpl applyTransformMatrix(Matrix matrix, int i11, int i12) {
        return applyTransformMatrix(matrix, i11, i12, i11, i12);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i11, int i12, int i13, int i14, int i15, int i16) {
        Matrix matrix = new Matrix();
        int i17 = this.height;
        matrix.preTranslate(i11 / this.width, (i17 - (i12 + i14)) / i17);
        matrix.preScale(i13 / this.width, i14 / this.height);
        return applyTransformMatrix(matrix, Math.round((this.unscaledWidth * i13) / this.width), Math.round((this.unscaledHeight * i14) / this.height), i15, i16);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getTextureId() {
        return this.f43894id;
    }

    public Handler getToI420Handler() {
        return this.toI420Handler;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    public int getUnscaledHeight() {
        return this.unscaledHeight;
    }

    public int getUnscaledWidth() {
        return this.unscaledWidth;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    public YuvConverter getYuvConverter() {
        return this.yuvConverter;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
        this.refCountMonitor.onRelease(this);
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        this.refCountMonitor.onRetain(this);
        this.refCountDelegate.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable() { // from class: org.webrtc.z0
            {
                TextureBufferImpl.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TextureBufferImpl.b(TextureBufferImpl.this);
            }
        });
    }

    public TextureBufferImpl(int i11, int i12, VideoFrame.TextureBuffer.Type type, int i13, Matrix matrix, Handler handler, YuvConverter yuvConverter, RefCountMonitor refCountMonitor) {
        this(i11, i12, i11, i12, type, i13, matrix, handler, yuvConverter, refCountMonitor);
    }

    private TextureBufferImpl applyTransformMatrix(Matrix matrix, int i11, int i12, int i13, int i14) {
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        retain();
        return new TextureBufferImpl(i11, i12, i13, i14, this.type, this.f43894id, matrix2, this.toI420Handler, this.yuvConverter, new RefCountMonitor() { // from class: org.webrtc.TextureBufferImpl.2
            {
                TextureBufferImpl.this = this;
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onDestroy(TextureBufferImpl textureBufferImpl) {
                TextureBufferImpl.this.release();
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRelease(TextureBufferImpl textureBufferImpl) {
                TextureBufferImpl.this.refCountMonitor.onRelease(TextureBufferImpl.this);
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRetain(TextureBufferImpl textureBufferImpl) {
                TextureBufferImpl.this.refCountMonitor.onRetain(TextureBufferImpl.this);
            }
        });
    }

    private TextureBufferImpl(int i11, int i12, int i13, int i14, VideoFrame.TextureBuffer.Type type, int i15, Matrix matrix, Handler handler, YuvConverter yuvConverter, final RefCountMonitor refCountMonitor) {
        this.unscaledWidth = i11;
        this.unscaledHeight = i12;
        this.width = i13;
        this.height = i14;
        this.type = type;
        this.f43894id = i15;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter;
        this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: org.webrtc.y0
            {
                TextureBufferImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TextureBufferImpl.a(TextureBufferImpl.this, refCountMonitor);
            }
        });
        this.refCountMonitor = refCountMonitor;
    }
}