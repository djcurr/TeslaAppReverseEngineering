package com.facebook.react.modules.core;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f11941b;

    /* renamed from: a  reason: collision with root package name */
    private Choreographer f11942a = c();

    /* renamed from: com.facebook.react.modules.core.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0228a {
        private Choreographer.FrameCallback mFrameCallback;
        private Runnable mRunnable;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.facebook.react.modules.core.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class Choreographer$FrameCallbackC0229a implements Choreographer.FrameCallback {
            Choreographer$FrameCallbackC0229a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j11) {
                AbstractC0228a.this.doFrame(j11);
            }
        }

        /* renamed from: com.facebook.react.modules.core.a$a$b */
        /* loaded from: classes3.dex */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC0228a.this.doFrame(System.nanoTime());
            }
        }

        public abstract void doFrame(long j11);

        Choreographer.FrameCallback getFrameCallback() {
            if (this.mFrameCallback == null) {
                this.mFrameCallback = new Choreographer$FrameCallbackC0229a();
            }
            return this.mFrameCallback;
        }

        Runnable getRunnable() {
            if (this.mRunnable == null) {
                this.mRunnable = new b();
            }
            return this.mRunnable;
        }
    }

    private a() {
    }

    private void a(Choreographer.FrameCallback frameCallback) {
        this.f11942a.postFrameCallback(frameCallback);
    }

    private void b(Choreographer.FrameCallback frameCallback) {
        this.f11942a.removeFrameCallback(frameCallback);
    }

    private Choreographer c() {
        return Choreographer.getInstance();
    }

    public static a d() {
        UiThreadUtil.assertOnUiThread();
        if (f11941b == null) {
            f11941b = new a();
        }
        return f11941b;
    }

    public void e(AbstractC0228a abstractC0228a) {
        a(abstractC0228a.getFrameCallback());
    }

    public void f(AbstractC0228a abstractC0228a) {
        b(abstractC0228a.getFrameCallback());
    }
}