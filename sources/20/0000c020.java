package y;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.d0;
import androidx.concurrent.futures.b;
import java.util.concurrent.Executor;
import s.a;
import t.s;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c */
    private final s f57805c;

    /* renamed from: d */
    final Executor f57806d;

    /* renamed from: g */
    b.a<Void> f57809g;

    /* renamed from: a */
    private boolean f57803a = false;

    /* renamed from: b */
    private boolean f57804b = false;

    /* renamed from: e */
    final Object f57807e = new Object();

    /* renamed from: f */
    private a.C1090a f57808f = new a.C1090a();

    /* renamed from: h */
    private final s.c f57810h = new s.c() { // from class: y.f
        @Override // t.s.c
        public final boolean a(TotalCaptureResult totalCaptureResult) {
            boolean q11;
            q11 = g.this.q(totalCaptureResult);
            return q11;
        }
    };

    public g(s sVar, Executor executor) {
        this.f57805c = sVar;
        this.f57806d = executor;
    }

    public static /* synthetic */ void a(g gVar, b.a aVar) {
        gVar.o(aVar);
    }

    public static /* synthetic */ void b(g gVar, b.a aVar) {
        gVar.m(aVar);
    }

    public static /* synthetic */ Object d(g gVar, b.a aVar) {
        return gVar.p(aVar);
    }

    public static /* synthetic */ void e(g gVar, boolean z11) {
        gVar.r(z11);
    }

    public static /* synthetic */ Object f(g gVar, b.a aVar) {
        return gVar.n(aVar);
    }

    private void h(j jVar) {
        synchronized (this.f57807e) {
            for (d0.a<?> aVar : jVar.e()) {
                this.f57808f.a().p(aVar, jVar.a(aVar));
            }
        }
    }

    private void j() {
        synchronized (this.f57807e) {
            this.f57808f = new a.C1090a();
        }
    }

    public /* synthetic */ Object n(final b.a aVar) {
        this.f57806d.execute(new Runnable() { // from class: y.d
            {
                g.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                g.b(g.this, aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    public /* synthetic */ Object p(final b.a aVar) {
        this.f57806d.execute(new Runnable() { // from class: y.c
            {
                g.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                g.a(g.this, aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ boolean q(android.hardware.camera2.TotalCaptureResult r3) {
        /*
            r2 = this;
            androidx.concurrent.futures.b$a<java.lang.Void> r0 = r2.f57809g
            r1 = 0
            if (r0 == 0) goto L30
            android.hardware.camera2.CaptureRequest r3 = r3.getRequest()
            java.lang.Object r3 = r3.getTag()
            boolean r0 = r3 instanceof androidx.camera.core.impl.l1
            if (r0 == 0) goto L30
            androidx.camera.core.impl.l1 r3 = (androidx.camera.core.impl.l1) r3
            java.lang.String r0 = "Camera2CameraControl"
            java.lang.Integer r3 = r3.c(r0)
            if (r3 == 0) goto L30
            androidx.concurrent.futures.b$a<java.lang.Void> r0 = r2.f57809g
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L30
            androidx.concurrent.futures.b$a<java.lang.Void> r3 = r2.f57809g
            r2.f57809g = r1
            goto L31
        L30:
            r3 = r1
        L31:
            if (r3 == 0) goto L36
            r3.c(r1)
        L36:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y.g.q(android.hardware.camera2.TotalCaptureResult):boolean");
    }

    /* renamed from: t */
    public void r(boolean z11) {
        if (this.f57803a == z11) {
            return;
        }
        this.f57803a = z11;
        if (z11) {
            if (this.f57804b) {
                v();
                return;
            }
            return;
        }
        j();
        b.a<Void> aVar = this.f57809g;
        if (aVar != null) {
            aVar.f(new CameraControl.OperationCanceledException("The camera control has became inactive."));
            this.f57809g = null;
        }
    }

    /* renamed from: u */
    public void o(b.a<Void> aVar) {
        this.f57804b = true;
        b.a<Void> aVar2 = this.f57809g;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.f57809g = aVar;
        if (this.f57803a) {
            v();
        }
        if (aVar2 != null) {
            aVar2.f(new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options."));
        }
    }

    private void v() {
        this.f57805c.g0();
        this.f57804b = false;
    }

    public com.google.common.util.concurrent.c<Void> g(j jVar) {
        h(jVar);
        return c0.f.j(androidx.concurrent.futures.b.a(new b.c() { // from class: y.b
            {
                g.this = this;
            }

            @Override // androidx.concurrent.futures.b.c
            public final Object a(b.a aVar) {
                return g.f(g.this, aVar);
            }
        }));
    }

    public com.google.common.util.concurrent.c<Void> i() {
        j();
        return c0.f.j(androidx.concurrent.futures.b.a(new b.c() { // from class: y.a
            {
                g.this = this;
            }

            @Override // androidx.concurrent.futures.b.c
            public final Object a(b.a aVar) {
                return g.d(g.this, aVar);
            }
        }));
    }

    public s.a k() {
        s.a c11;
        synchronized (this.f57807e) {
            if (this.f57809g != null) {
                this.f57808f.a().p(s.a.f49769y, Integer.valueOf(this.f57809g.hashCode()));
            }
            c11 = this.f57808f.c();
        }
        return c11;
    }

    public s.c l() {
        return this.f57810h;
    }

    public void s(final boolean z11) {
        this.f57806d.execute(new Runnable() { // from class: y.e
            {
                g.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                g.e(g.this, z11);
            }
        });
    }
}