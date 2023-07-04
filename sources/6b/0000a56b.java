package org.webrtc;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.GlUtil;
import org.webrtc.RendererCommon;

/* loaded from: classes4.dex */
public class EglRenderer implements VideoSink {
    private static final long LOG_INTERVAL_SEC = 4;
    private static final String TAG = "EglRenderer";
    private final GlTextureFrameBuffer bitmapTextureFramebuffer;
    private final Matrix drawMatrix;
    private RendererCommon.GlDrawer drawer;
    private EglBase eglBase;
    private final EglSurfaceCreation eglSurfaceCreationRunnable;
    private volatile ErrorCallback errorCallback;
    private final Object fpsReductionLock;
    private final VideoFrameDrawer frameDrawer;
    private final ArrayList<FrameListenerAndParams> frameListeners;
    private final Object frameLock;
    private int framesDropped;
    private int framesReceived;
    private int framesRendered;
    private final Object handlerLock;
    private float layoutAspectRatio;
    private final Object layoutLock;
    private final Runnable logStatisticsRunnable;
    private long minRenderPeriodNs;
    private boolean mirrorHorizontally;
    private boolean mirrorVertically;
    protected final String name;
    private long nextFrameTimeNs;
    private VideoFrame pendingFrame;
    private long renderSwapBufferTimeNs;
    private Handler renderThreadHandler;
    private long renderTimeNs;
    private final Object statisticsLock;
    private long statisticsStartTimeNs;
    private boolean usePresentationTimeStamp;

    /* loaded from: classes4.dex */
    public class EglSurfaceCreation implements Runnable {
        private Object surface;

        private EglSurfaceCreation() {
            EglRenderer.this = r1;
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            if (this.surface != null && EglRenderer.this.eglBase != null && !EglRenderer.this.eglBase.hasSurface()) {
                Object obj = this.surface;
                if (obj instanceof Surface) {
                    EglRenderer.this.eglBase.createSurface((Surface) this.surface);
                } else if (obj instanceof SurfaceTexture) {
                    EglRenderer.this.eglBase.createSurface((SurfaceTexture) this.surface);
                } else {
                    Object obj2 = this.surface;
                    throw new IllegalStateException("Invalid surface: " + obj2);
                }
                EglRenderer.this.eglBase.makeCurrent();
                GLES20.glPixelStorei(3317, 1);
            }
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }
    }

    /* loaded from: classes4.dex */
    public interface ErrorCallback {
        void onGlOutOfMemory();
    }

    /* loaded from: classes4.dex */
    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    /* loaded from: classes4.dex */
    public static class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final RendererCommon.GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(FrameListener frameListener, float f11, RendererCommon.GlDrawer glDrawer, boolean z11) {
            this.listener = frameListener;
            this.scale = f11;
            this.drawer = glDrawer;
            this.applyFpsReduction = z11;
        }
    }

    /* loaded from: classes4.dex */
    public static class HandlerWithExceptionCallback extends Handler {
        private final Runnable exceptionCallback;

        public HandlerWithExceptionCallback(Looper looper, Runnable runnable) {
            super(looper);
            this.exceptionCallback = runnable;
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (Exception e11) {
                Logging.e(EglRenderer.TAG, "Exception on EglRenderer thread", e11);
                this.exceptionCallback.run();
                throw e11;
            }
        }
    }

    public EglRenderer(String str) {
        this(str, new VideoFrameDrawer());
    }

    public static /* synthetic */ void a(EglRenderer eglRenderer, Runnable runnable) {
        eglRenderer.lambda$releaseEglSurface$5(runnable);
    }

    private String averageTimeAsString(long j11, int i11) {
        if (i11 <= 0) {
            return "NA";
        }
        long micros = TimeUnit.NANOSECONDS.toMicros(j11 / i11);
        return micros + " us";
    }

    public static /* synthetic */ void b(EglRenderer eglRenderer, float f11, float f12, float f13, float f14) {
        eglRenderer.lambda$clearImage$6(f11, f12, f13, f14);
    }

    public static /* synthetic */ void c(EglRenderer eglRenderer, CountDownLatch countDownLatch, FrameListener frameListener) {
        eglRenderer.lambda$removeFrameListener$4(countDownLatch, frameListener);
    }

    /* renamed from: clearSurfaceOnRenderThread */
    public void lambda$clearImage$6(float f11, float f12, float f13, float f14) {
        EglBase eglBase = this.eglBase;
        if (eglBase == null || !eglBase.hasSurface()) {
            return;
        }
        logD("clearSurface");
        GLES20.glClearColor(f11, f12, f13, f14);
        GLES20.glClear(16384);
        this.eglBase.swapBuffers();
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    public static /* synthetic */ void d(EglRenderer eglRenderer, CountDownLatch countDownLatch) {
        eglRenderer.lambda$release$1(countDownLatch);
    }

    public static /* synthetic */ void e(EglRenderer eglRenderer) {
        eglRenderer.renderFrameOnRenderThread();
    }

    public static /* synthetic */ void f(EglRenderer eglRenderer, EglBase.Context context, int[] iArr) {
        eglRenderer.lambda$init$0(context, iArr);
    }

    public static /* synthetic */ void g(EglRenderer eglRenderer, Looper looper) {
        eglRenderer.lambda$release$2(looper);
    }

    public static /* synthetic */ void h(EglRenderer eglRenderer, RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f11, boolean z11) {
        eglRenderer.lambda$addFrameListener$3(glDrawer, frameListener, f11, z11);
    }

    public /* synthetic */ void lambda$addFrameListener$3(RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f11, boolean z11) {
        if (glDrawer == null) {
            glDrawer = this.drawer;
        }
        this.frameListeners.add(new FrameListenerAndParams(frameListener, f11, glDrawer, z11));
    }

    public /* synthetic */ void lambda$init$0(EglBase.Context context, int[] iArr) {
        if (context == null) {
            logD("EglBase10.create context");
            this.eglBase = EglBase.createEgl10(iArr);
            return;
        }
        logD("EglBase.create shared context");
        this.eglBase = EglBase.create(context, iArr);
    }

    public /* synthetic */ void lambda$release$1(CountDownLatch countDownLatch) {
        synchronized (EglBase.lock) {
            GLES20.glUseProgram(0);
        }
        RendererCommon.GlDrawer glDrawer = this.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            this.drawer = null;
        }
        this.frameDrawer.release();
        this.bitmapTextureFramebuffer.release();
        if (this.eglBase != null) {
            logD("eglBase detach and release.");
            this.eglBase.detachCurrent();
            this.eglBase.release();
            this.eglBase = null;
        }
        this.frameListeners.clear();
        countDownLatch.countDown();
    }

    public /* synthetic */ void lambda$release$2(Looper looper) {
        logD("Quitting render thread.");
        looper.quit();
    }

    public /* synthetic */ void lambda$releaseEglSurface$5(Runnable runnable) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null) {
            eglBase.detachCurrent();
            this.eglBase.releaseSurface();
        }
        runnable.run();
    }

    public /* synthetic */ void lambda$removeFrameListener$4(CountDownLatch countDownLatch, FrameListener frameListener) {
        countDownLatch.countDown();
        Iterator<FrameListenerAndParams> it2 = this.frameListeners.iterator();
        while (it2.hasNext()) {
            if (it2.next().listener == frameListener) {
                it2.remove();
            }
        }
    }

    private void logD(String str) {
        String str2 = this.name;
        Logging.d(TAG, str2 + str);
    }

    private void logE(String str, Throwable th2) {
        String str2 = this.name;
        Logging.e(TAG, str2 + str, th2);
    }

    public void logStatistics() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        long nanoTime = System.nanoTime();
        synchronized (this.statisticsLock) {
            long j11 = nanoTime - this.statisticsStartTimeNs;
            if (j11 > 0 && (this.minRenderPeriodNs != Long.MAX_VALUE || this.framesReceived != 0)) {
                float nanos = ((float) (this.framesRendered * TimeUnit.SECONDS.toNanos(1L))) / ((float) j11);
                long millis = TimeUnit.NANOSECONDS.toMillis(j11);
                int i11 = this.framesReceived;
                int i12 = this.framesDropped;
                int i13 = this.framesRendered;
                String format = decimalFormat.format(nanos);
                String averageTimeAsString = averageTimeAsString(this.renderTimeNs, this.framesRendered);
                String averageTimeAsString2 = averageTimeAsString(this.renderSwapBufferTimeNs, this.framesRendered);
                logD("Duration: " + millis + " ms. Frames received: " + i11 + ". Dropped: " + i12 + ". Rendered: " + i13 + ". Render fps: " + format + ". Average render time: " + averageTimeAsString + ". Average swapBuffer time: " + averageTimeAsString2 + ".");
                resetStatistics(nanoTime);
            }
        }
    }

    private void logW(String str) {
        String str2 = this.name;
        Logging.w(TAG, str2 + str);
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z11) {
        if (this.frameListeners.isEmpty()) {
            return;
        }
        this.drawMatrix.reset();
        this.drawMatrix.preTranslate(0.5f, 0.5f);
        this.drawMatrix.preScale(this.mirrorHorizontally ? -1.0f : 1.0f, this.mirrorVertically ? -1.0f : 1.0f);
        this.drawMatrix.preScale(1.0f, -1.0f);
        this.drawMatrix.preTranslate(-0.5f, -0.5f);
        Iterator<FrameListenerAndParams> it2 = this.frameListeners.iterator();
        while (it2.hasNext()) {
            FrameListenerAndParams next = it2.next();
            if (z11 || !next.applyFpsReduction) {
                it2.remove();
                int rotatedWidth = (int) (next.scale * videoFrame.getRotatedWidth());
                int rotatedHeight = (int) (next.scale * videoFrame.getRotatedHeight());
                if (rotatedWidth != 0 && rotatedHeight != 0) {
                    this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                    GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.getFrameBufferId());
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.getTextureId(), 0);
                    GLES20.glClearColor(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    GLES20.glClear(16384);
                    this.frameDrawer.drawFrame(videoFrame, next.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight);
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                    GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                    GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, allocateDirect);
                    GLES20.glBindFramebuffer(36160, 0);
                    GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                    Bitmap createBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    next.listener.onFrame(createBitmap);
                } else {
                    next.listener.onFrame(null);
                }
            }
        }
    }

    private void postToRenderThread(Runnable runnable) {
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler != null) {
                handler.post(runnable);
            }
        }
    }

    public void renderFrameOnRenderThread() {
        boolean z11;
        float f11;
        float f12;
        float f13;
        synchronized (this.frameLock) {
            VideoFrame videoFrame = this.pendingFrame;
            if (videoFrame == null) {
                return;
            }
            this.pendingFrame = null;
            EglBase eglBase = this.eglBase;
            if (eglBase != null && eglBase.hasSurface()) {
                synchronized (this.fpsReductionLock) {
                    long j11 = this.minRenderPeriodNs;
                    if (j11 != Long.MAX_VALUE) {
                        if (j11 > 0) {
                            long nanoTime = System.nanoTime();
                            long j12 = this.nextFrameTimeNs;
                            if (nanoTime < j12) {
                                logD("Skipping frame rendering - fps reduction is active.");
                            } else {
                                long j13 = j12 + this.minRenderPeriodNs;
                                this.nextFrameTimeNs = j13;
                                this.nextFrameTimeNs = Math.max(j13, nanoTime);
                            }
                        }
                        z11 = true;
                    }
                    z11 = false;
                }
                long nanoTime2 = System.nanoTime();
                float rotatedWidth = videoFrame.getRotatedWidth() / videoFrame.getRotatedHeight();
                synchronized (this.layoutLock) {
                    f11 = this.layoutAspectRatio;
                    if (f11 == BitmapDescriptorFactory.HUE_RED) {
                        f11 = rotatedWidth;
                    }
                }
                if (rotatedWidth > f11) {
                    f13 = f11 / rotatedWidth;
                    f12 = 1.0f;
                } else {
                    f12 = rotatedWidth / f11;
                    f13 = 1.0f;
                }
                this.drawMatrix.reset();
                this.drawMatrix.preTranslate(0.5f, 0.5f);
                this.drawMatrix.preScale(this.mirrorHorizontally ? -1.0f : 1.0f, this.mirrorVertically ? -1.0f : 1.0f);
                this.drawMatrix.preScale(f13, f12);
                this.drawMatrix.preTranslate(-0.5f, -0.5f);
                try {
                    if (z11) {
                        try {
                            GLES20.glClearColor(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                            GLES20.glClear(16384);
                            this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, 0, 0, this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight());
                            long nanoTime3 = System.nanoTime();
                            if (this.usePresentationTimeStamp) {
                                this.eglBase.swapBuffers(videoFrame.getTimestampNs());
                            } else {
                                this.eglBase.swapBuffers();
                            }
                            long nanoTime4 = System.nanoTime();
                            synchronized (this.statisticsLock) {
                                this.framesRendered++;
                                this.renderTimeNs += nanoTime4 - nanoTime2;
                                this.renderSwapBufferTimeNs += nanoTime4 - nanoTime3;
                            }
                        } catch (GlUtil.GlOutOfMemoryException e11) {
                            logE("Error while drawing frame", e11);
                            ErrorCallback errorCallback = this.errorCallback;
                            if (errorCallback != null) {
                                errorCallback.onGlOutOfMemory();
                            }
                            this.drawer.release();
                            this.frameDrawer.release();
                            this.bitmapTextureFramebuffer.release();
                        }
                    }
                    notifyCallbacks(videoFrame, z11);
                    return;
                } finally {
                    videoFrame.release();
                }
            }
            logD("Dropping frame - No surface");
        }
    }

    private void resetStatistics(long j11) {
        synchronized (this.statisticsLock) {
            this.statisticsStartTimeNs = j11;
            this.framesReceived = 0;
            this.framesDropped = 0;
            this.framesRendered = 0;
            this.renderTimeNs = 0L;
            this.renderSwapBufferTimeNs = 0L;
        }
    }

    public void addFrameListener(FrameListener frameListener, float f11) {
        addFrameListener(frameListener, f11, null, false);
    }

    public void clearImage() {
        clearImage(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void init(final EglBase.Context context, final int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z11) {
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                logD("Initializing EglRenderer");
                this.drawer = glDrawer;
                this.usePresentationTimeStamp = z11;
                String str = this.name;
                HandlerThread handlerThread = new HandlerThread(str + TAG);
                handlerThread.start();
                HandlerWithExceptionCallback handlerWithExceptionCallback = new HandlerWithExceptionCallback(handlerThread.getLooper(), new Runnable() { // from class: org.webrtc.EglRenderer.2
                    {
                        EglRenderer.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (EglRenderer.this.handlerLock) {
                            EglRenderer.this.renderThreadHandler = null;
                        }
                    }
                });
                this.renderThreadHandler = handlerWithExceptionCallback;
                ThreadUtils.invokeAtFrontUninterruptibly(handlerWithExceptionCallback, new Runnable() { // from class: org.webrtc.s
                    {
                        EglRenderer.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.f(EglRenderer.this, context, iArr);
                    }
                });
                this.renderThreadHandler.post(this.eglSurfaceCreationRunnable);
                resetStatistics(System.nanoTime());
                this.renderThreadHandler.postDelayed(this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(4L));
            } else {
                String str2 = this.name;
                throw new IllegalStateException(str2 + "Already initialized");
            }
        }
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        boolean z11;
        synchronized (this.statisticsLock) {
            this.framesReceived++;
        }
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                logD("Dropping frame - Not initialized or already released.");
                return;
            }
            synchronized (this.frameLock) {
                VideoFrame videoFrame2 = this.pendingFrame;
                z11 = videoFrame2 != null;
                if (z11) {
                    videoFrame2.release();
                }
                this.pendingFrame = videoFrame;
                videoFrame.retain();
                this.renderThreadHandler.post(new Runnable() { // from class: org.webrtc.m
                    {
                        EglRenderer.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.e(EglRenderer.this);
                    }
                });
            }
            if (z11) {
                synchronized (this.statisticsLock) {
                    this.framesDropped++;
                }
            }
        }
    }

    public void pauseVideo() {
        setFpsReduction(BitmapDescriptorFactory.HUE_RED);
    }

    public void printStackTrace() {
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            Thread thread = handler == null ? null : handler.getLooper().getThread();
            if (thread != null) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace.length > 0) {
                    logW("EglRenderer stack trace:");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        logW(stackTraceElement.toString());
                    }
                }
            }
        }
    }

    public void release() {
        logD("Releasing.");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler == null) {
                logD("Already released");
                return;
            }
            handler.removeCallbacks(this.logStatisticsRunnable);
            this.renderThreadHandler.postAtFrontOfQueue(new Runnable() { // from class: org.webrtc.q
                {
                    EglRenderer.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EglRenderer.d(EglRenderer.this, countDownLatch);
                }
            });
            final Looper looper = this.renderThreadHandler.getLooper();
            this.renderThreadHandler.post(new Runnable() { // from class: org.webrtc.o
                {
                    EglRenderer.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EglRenderer.g(EglRenderer.this, looper);
                }
            });
            this.renderThreadHandler = null;
            ThreadUtils.awaitUninterruptibly(countDownLatch);
            synchronized (this.frameLock) {
                VideoFrame videoFrame = this.pendingFrame;
                if (videoFrame != null) {
                    videoFrame.release();
                    this.pendingFrame = null;
                }
            }
            logD("Releasing done.");
        }
    }

    public void releaseEglSurface(final Runnable runnable) {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler != null) {
                handler.removeCallbacks(this.eglSurfaceCreationRunnable);
                this.renderThreadHandler.postAtFrontOfQueue(new Runnable() { // from class: org.webrtc.p
                    {
                        EglRenderer.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.a(EglRenderer.this, runnable);
                    }
                });
                return;
            }
            runnable.run();
        }
    }

    public void removeFrameListener(final FrameListener frameListener) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                return;
            }
            if (Thread.currentThread() != this.renderThreadHandler.getLooper().getThread()) {
                postToRenderThread(new Runnable() { // from class: org.webrtc.r
                    {
                        EglRenderer.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.c(EglRenderer.this, countDownLatch, frameListener);
                    }
                });
                ThreadUtils.awaitUninterruptibly(countDownLatch);
                return;
            }
            throw new RuntimeException("removeFrameListener must not be called on the render thread.");
        }
    }

    public void setErrorCallback(ErrorCallback errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void setFpsReduction(float f11) {
        logD("setFpsReduction: " + f11);
        synchronized (this.fpsReductionLock) {
            long j11 = this.minRenderPeriodNs;
            if (f11 <= BitmapDescriptorFactory.HUE_RED) {
                this.minRenderPeriodNs = Long.MAX_VALUE;
            } else {
                this.minRenderPeriodNs = ((float) TimeUnit.SECONDS.toNanos(1L)) / f11;
            }
            if (this.minRenderPeriodNs != j11) {
                this.nextFrameTimeNs = System.nanoTime();
            }
        }
    }

    public void setLayoutAspectRatio(float f11) {
        logD("setLayoutAspectRatio: " + f11);
        synchronized (this.layoutLock) {
            this.layoutAspectRatio = f11;
        }
    }

    public void setMirror(boolean z11) {
        logD("setMirrorHorizontally: " + z11);
        synchronized (this.layoutLock) {
            this.mirrorHorizontally = z11;
        }
    }

    public void setMirrorVertically(boolean z11) {
        logD("setMirrorVertically: " + z11);
        synchronized (this.layoutLock) {
            this.mirrorVertically = z11;
        }
    }

    public EglRenderer(String str, VideoFrameDrawer videoFrameDrawer) {
        this.handlerLock = new Object();
        this.frameListeners = new ArrayList<>();
        this.fpsReductionLock = new Object();
        this.drawMatrix = new Matrix();
        this.frameLock = new Object();
        this.layoutLock = new Object();
        this.statisticsLock = new Object();
        this.bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
        this.logStatisticsRunnable = new Runnable() { // from class: org.webrtc.EglRenderer.1
            {
                EglRenderer.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                EglRenderer.this.logStatistics();
                synchronized (EglRenderer.this.handlerLock) {
                    if (EglRenderer.this.renderThreadHandler != null) {
                        EglRenderer.this.renderThreadHandler.removeCallbacks(EglRenderer.this.logStatisticsRunnable);
                        EglRenderer.this.renderThreadHandler.postDelayed(EglRenderer.this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(4L));
                    }
                }
            }
        };
        this.eglSurfaceCreationRunnable = new EglSurfaceCreation();
        this.name = str;
        this.frameDrawer = videoFrameDrawer;
    }

    public void addFrameListener(FrameListener frameListener, float f11, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f11, glDrawer, false);
    }

    public void clearImage(final float f11, final float f12, final float f13, final float f14) {
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler == null) {
                return;
            }
            handler.postAtFrontOfQueue(new Runnable() { // from class: org.webrtc.n
                {
                    EglRenderer.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EglRenderer.b(EglRenderer.this, f11, f12, f13, f14);
                }
            });
        }
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    public void addFrameListener(final FrameListener frameListener, final float f11, final RendererCommon.GlDrawer glDrawer, final boolean z11) {
        postToRenderThread(new Runnable() { // from class: org.webrtc.t
            {
                EglRenderer.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                EglRenderer.h(EglRenderer.this, glDrawer, frameListener, f11, z11);
            }
        });
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }
}