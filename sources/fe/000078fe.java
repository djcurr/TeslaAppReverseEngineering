package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.f3;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
final class e0 extends FileObserver {

    /* renamed from: a  reason: collision with root package name */
    private final String f32068a;

    /* renamed from: b  reason: collision with root package name */
    private final io.sentry.b0 f32069b;

    /* renamed from: c  reason: collision with root package name */
    private final io.sentry.d0 f32070c;

    /* renamed from: d  reason: collision with root package name */
    private final long f32071d;

    /* loaded from: classes5.dex */
    private static final class a implements oz.b, oz.f, oz.k, oz.d, oz.a, oz.e {

        /* renamed from: a  reason: collision with root package name */
        boolean f32072a;

        /* renamed from: b  reason: collision with root package name */
        boolean f32073b;

        /* renamed from: c  reason: collision with root package name */
        private CountDownLatch f32074c;

        /* renamed from: d  reason: collision with root package name */
        private final long f32075d;

        /* renamed from: e  reason: collision with root package name */
        private final io.sentry.d0 f32076e;

        public a(long j11, io.sentry.d0 d0Var) {
            reset();
            this.f32075d = j11;
            this.f32076e = (io.sentry.d0) rz.j.a(d0Var, "ILogger is required.");
        }

        @Override // oz.f
        public boolean a() {
            return this.f32072a;
        }

        @Override // oz.k
        public void b(boolean z11) {
            this.f32073b = z11;
            this.f32074c.countDown();
        }

        @Override // oz.f
        public void c(boolean z11) {
            this.f32072a = z11;
        }

        @Override // oz.d
        public boolean d() {
            try {
                return this.f32074c.await(this.f32075d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                this.f32076e.b(f3.ERROR, "Exception while awaiting on lock.", e11);
                return false;
            }
        }

        @Override // oz.k
        public boolean e() {
            return this.f32073b;
        }

        @Override // oz.e
        public void reset() {
            this.f32074c = new CountDownLatch(1);
            this.f32072a = false;
            this.f32073b = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(String str, io.sentry.b0 b0Var, io.sentry.d0 d0Var, long j11) {
        super(str);
        this.f32068a = str;
        this.f32069b = (io.sentry.b0) rz.j.a(b0Var, "Envelope sender is required.");
        this.f32070c = (io.sentry.d0) rz.j.a(d0Var, "Logger is required.");
        this.f32071d = j11;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i11, String str) {
        if (str == null || i11 != 8) {
            return;
        }
        this.f32070c.c(f3.DEBUG, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", Integer.valueOf(i11), this.f32068a, str);
        io.sentry.t e11 = rz.h.e(new a(this.f32071d, this.f32070c));
        io.sentry.b0 b0Var = this.f32069b;
        b0Var.a(this.f32068a + File.separator + str, e11);
    }
}