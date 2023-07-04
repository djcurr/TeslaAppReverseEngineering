package t;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.a0;
import androidx.camera.core.impl.g1;
import androidx.concurrent.futures.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import s.a;
import t.s;
import y.j;

/* loaded from: classes.dex */
public class s implements CameraControlInternal {

    /* renamed from: b */
    final b f51158b;

    /* renamed from: c */
    final Executor f51159c;

    /* renamed from: d */
    private final Object f51160d = new Object();

    /* renamed from: e */
    private final u.d f51161e;

    /* renamed from: f */
    private final CameraControlInternal.b f51162f;

    /* renamed from: g */
    private final g1.b f51163g;

    /* renamed from: h */
    volatile Rational f51164h;

    /* renamed from: i */
    private final p1 f51165i;

    /* renamed from: j */
    private final k2 f51166j;

    /* renamed from: k */
    private final j2 f51167k;

    /* renamed from: l */
    private final h1 f51168l;

    /* renamed from: m */
    private final y.g f51169m;

    /* renamed from: n */
    private final x.a f51170n;

    /* renamed from: o */
    private int f51171o;

    /* renamed from: p */
    private volatile boolean f51172p;

    /* renamed from: q */
    private volatile int f51173q;

    /* renamed from: r */
    private final x.b f51174r;

    /* renamed from: s */
    private final a f51175s;

    /* loaded from: classes.dex */
    public static final class a extends androidx.camera.core.impl.e {

        /* renamed from: a */
        Set<androidx.camera.core.impl.e> f51176a = new HashSet();

        /* renamed from: b */
        Map<androidx.camera.core.impl.e, Executor> f51177b = new ArrayMap();

        a() {
        }

        public static /* synthetic */ void d(androidx.camera.core.impl.e eVar, androidx.camera.core.impl.m mVar) {
            eVar.b(mVar);
        }

        public static /* synthetic */ void e(androidx.camera.core.impl.e eVar) {
            eVar.a();
        }

        public static /* synthetic */ void f(androidx.camera.core.impl.e eVar, androidx.camera.core.impl.g gVar) {
            eVar.c(gVar);
        }

        @Override // androidx.camera.core.impl.e
        public void a() {
            for (final androidx.camera.core.impl.e eVar : this.f51176a) {
                try {
                    this.f51177b.get(eVar).execute(new Runnable() { // from class: t.p
                        @Override // java.lang.Runnable
                        public final void run() {
                            s.a.e(eVar);
                        }
                    });
                } catch (RejectedExecutionException e11) {
                    androidx.camera.core.n0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e11);
                }
            }
        }

        @Override // androidx.camera.core.impl.e
        public void b(final androidx.camera.core.impl.m mVar) {
            for (final androidx.camera.core.impl.e eVar : this.f51176a) {
                try {
                    this.f51177b.get(eVar).execute(new Runnable() { // from class: t.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            s.a.d(androidx.camera.core.impl.e.this, mVar);
                        }
                    });
                } catch (RejectedExecutionException e11) {
                    androidx.camera.core.n0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e11);
                }
            }
        }

        @Override // androidx.camera.core.impl.e
        public void c(final androidx.camera.core.impl.g gVar) {
            for (final androidx.camera.core.impl.e eVar : this.f51176a) {
                try {
                    this.f51177b.get(eVar).execute(new Runnable() { // from class: t.q
                        @Override // java.lang.Runnable
                        public final void run() {
                            s.a.f(eVar, gVar);
                        }
                    });
                } catch (RejectedExecutionException e11) {
                    androidx.camera.core.n0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e11);
                }
            }
        }

        void g(Executor executor, androidx.camera.core.impl.e eVar) {
            this.f51176a.add(eVar);
            this.f51177b.put(eVar, executor);
        }

        void k(androidx.camera.core.impl.e eVar) {
            this.f51176a.remove(eVar);
            this.f51177b.remove(eVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        final Set<c> f51178a = new HashSet();

        /* renamed from: b */
        private final Executor f51179b;

        b(Executor executor) {
            this.f51179b = executor;
        }

        public static /* synthetic */ void a(b bVar, TotalCaptureResult totalCaptureResult) {
            bVar.c(totalCaptureResult);
        }

        public /* synthetic */ void c(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (c cVar : this.f51178a) {
                if (cVar.a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            this.f51178a.removeAll(hashSet);
        }

        void b(c cVar) {
            this.f51178a.add(cVar);
        }

        void d(c cVar) {
            this.f51178a.remove(cVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f51179b.execute(new Runnable() { // from class: t.t
                {
                    s.b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    s.b.a(s.b.this, totalCaptureResult);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    public s(u.d dVar, ScheduledExecutorService scheduledExecutorService, Executor executor, CameraControlInternal.b bVar, androidx.camera.core.impl.e1 e1Var) {
        g1.b bVar2 = new g1.b();
        this.f51163g = bVar2;
        this.f51164h = null;
        this.f51171o = 0;
        this.f51172p = false;
        this.f51173q = 2;
        this.f51174r = new x.b();
        a aVar = new a();
        this.f51175s = aVar;
        this.f51161e = dVar;
        this.f51162f = bVar;
        this.f51159c = executor;
        b bVar3 = new b(executor);
        this.f51158b = bVar3;
        bVar2.q(B());
        bVar2.i(y0.d(bVar3));
        bVar2.i(aVar);
        this.f51168l = new h1(this, dVar, executor);
        this.f51165i = new p1(this, scheduledExecutorService, executor);
        this.f51166j = new k2(this, dVar, executor);
        this.f51167k = new j2(this, dVar, executor);
        this.f51170n = new x.a(e1Var);
        this.f51169m = new y.g(this, executor);
        executor.execute(new Runnable() { // from class: t.i
            {
                s.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                s.n(s.this);
            }
        });
        g0();
    }

    private int G(int i11) {
        int[] iArr = (int[]) this.f51161e.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return O(i11, iArr) ? i11 : O(1, iArr) ? 1 : 0;
    }

    private int I(int i11) {
        int[] iArr = (int[]) this.f51161e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return O(i11, iArr) ? i11 : O(1, iArr) ? 1 : 0;
    }

    private boolean N() {
        return K() > 0;
    }

    private boolean O(int i11, int[] iArr) {
        for (int i12 : iArr) {
            if (i11 == i12) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void P() {
    }

    public /* synthetic */ void Q(Executor executor, androidx.camera.core.impl.e eVar) {
        this.f51175s.g(executor, eVar);
    }

    public /* synthetic */ void R(boolean z11, boolean z12) {
        this.f51165i.h(z11, z12);
    }

    public static /* synthetic */ void S() {
    }

    public /* synthetic */ void T() {
        w(this.f51169m.l());
    }

    public /* synthetic */ void U(androidx.camera.core.impl.e eVar) {
        this.f51175s.k(eVar);
    }

    public /* synthetic */ void W(b.a aVar) {
        this.f51165i.J(aVar);
    }

    public /* synthetic */ Object X(final b.a aVar) {
        this.f51159c.execute(new Runnable() { // from class: t.l
            {
                s.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                s.t(s.this, aVar);
            }
        });
        return "triggerAePrecapture";
    }

    public /* synthetic */ void Y(b.a aVar) {
        this.f51165i.K(aVar);
    }

    public /* synthetic */ Object Z(final b.a aVar) {
        this.f51159c.execute(new Runnable() { // from class: t.k
            {
                s.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                s.s(s.this, aVar);
            }
        });
        return "triggerAf";
    }

    public static /* synthetic */ void l(s sVar, androidx.camera.core.impl.e eVar) {
        sVar.U(eVar);
    }

    public static /* synthetic */ Object m(s sVar, b.a aVar) {
        return sVar.Z(aVar);
    }

    public static /* synthetic */ void n(s sVar) {
        sVar.T();
    }

    public static /* synthetic */ void o(s sVar, Executor executor, androidx.camera.core.impl.e eVar) {
        sVar.Q(executor, eVar);
    }

    public static /* synthetic */ void p() {
        S();
    }

    public static /* synthetic */ void q() {
        P();
    }

    public static /* synthetic */ void r(s sVar, boolean z11, boolean z12) {
        sVar.R(z11, z12);
    }

    public static /* synthetic */ void s(s sVar, b.a aVar) {
        sVar.Y(aVar);
    }

    public static /* synthetic */ void t(s sVar, b.a aVar) {
        sVar.W(aVar);
    }

    public static /* synthetic */ void u(s sVar, List list) {
        sVar.V(list);
    }

    public static /* synthetic */ Object v(s sVar, b.a aVar) {
        return sVar.X(aVar);
    }

    public Rect A() {
        return this.f51166j.c();
    }

    public int B() {
        return 1;
    }

    public int C() {
        Integer num = (Integer) this.f51161e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int D() {
        Integer num = (Integer) this.f51161e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int E() {
        Integer num = (Integer) this.f51161e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[LOOP:0: B:30:0x006a->B:32:0x0070, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.camera.core.impl.d0 F() {
        /*
            r7 = this;
            s.a$a r0 = new s.a$a
            r0.<init>()
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.d(r1, r3)
            t.p1 r1 = r7.f51165i
            r1.g(r0)
            x.a r1 = r7.f51170n
            r1.a(r0)
            t.k2 r1 = r7.f51166j
            r1.a(r0)
            boolean r1 = r7.f51172p
            r3 = 2
            if (r1 == 0) goto L2d
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.d(r1, r3)
            goto L33
        L2d:
            int r1 = r7.f51173q
            if (r1 == 0) goto L37
            if (r1 == r2) goto L35
        L33:
            r1 = r2
            goto L3d
        L35:
            r1 = 3
            goto L3d
        L37:
            x.b r1 = r7.f51174r
            int r1 = r1.a(r3)
        L3d:
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            int r1 = r7.G(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.d(r3, r1)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            int r2 = r7.I(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.d(r1, r2)
            t.h1 r1 = r7.f51168l
            r1.c(r0)
            y.g r1 = r7.f51169m
            s.a r1 = r1.k()
            java.util.Set r2 = r1.e()
            java.util.Iterator r2 = r2.iterator()
        L6a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L84
            java.lang.Object r3 = r2.next()
            androidx.camera.core.impl.d0$a r3 = (androidx.camera.core.impl.d0.a) r3
            androidx.camera.core.impl.w0 r4 = r0.a()
            androidx.camera.core.impl.d0$c r5 = androidx.camera.core.impl.d0.c.ALWAYS_OVERRIDE
            java.lang.Object r6 = r1.a(r3)
            r4.n(r3, r5, r6)
            goto L6a
        L84:
            s.a r0 = r0.c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t.s.F():androidx.camera.core.impl.d0");
    }

    public int H(int i11) {
        int[] iArr = (int[]) this.f51161e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (O(i11, iArr)) {
            return i11;
        }
        if (O(4, iArr)) {
            return 4;
        }
        return O(1, iArr) ? 1 : 0;
    }

    public j2 J() {
        return this.f51167k;
    }

    int K() {
        int i11;
        synchronized (this.f51160d) {
            i11 = this.f51171o;
        }
        return i11;
    }

    public k2 L() {
        return this.f51166j;
    }

    public void M() {
        synchronized (this.f51160d) {
            this.f51171o++;
        }
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public com.google.common.util.concurrent.c<androidx.camera.core.impl.m> a() {
        if (!N()) {
            return c0.f.f(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return c0.f.j(androidx.concurrent.futures.b.a(new b.c() { // from class: t.g
            {
                s.this = this;
            }

            @Override // androidx.concurrent.futures.b.c
            public final Object a(b.a aVar) {
                return s.v(s.this, aVar);
            }
        }));
    }

    public void a0(c cVar) {
        this.f51158b.d(cVar);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public Rect b() {
        return (Rect) v3.h.f((Rect) this.f51161e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    public void b0(final androidx.camera.core.impl.e eVar) {
        this.f51159c.execute(new Runnable() { // from class: t.j
            {
                s.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                s.l(s.this, eVar);
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void c(int i11) {
        if (!N()) {
            androidx.camera.core.n0.m("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f51173q = i11;
        g0();
    }

    public void c0(boolean z11) {
        this.f51165i.E(z11);
        this.f51166j.f(z11);
        this.f51167k.h(z11);
        this.f51168l.b(z11);
        this.f51169m.s(z11);
    }

    @Override // androidx.camera.core.CameraControl
    public com.google.common.util.concurrent.c<Void> d(boolean z11) {
        if (!N()) {
            return c0.f.f(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return c0.f.j(this.f51167k.c(z11));
    }

    public void d0(CaptureRequest.Builder builder) {
        this.f51165i.F(builder);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public androidx.camera.core.impl.d0 e() {
        return this.f51169m.k();
    }

    public void e0(Rational rational) {
        this.f51164h = rational;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void f(androidx.camera.core.impl.d0 d0Var) {
        this.f51169m.g(j.a.e(d0Var).d()).a(new Runnable() { // from class: t.f
            @Override // java.lang.Runnable
            public final void run() {
                s.q();
            }
        }, b0.a.a());
    }

    /* renamed from: f0 */
    public void V(List<androidx.camera.core.impl.a0> list) {
        this.f51162f.a(list);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public com.google.common.util.concurrent.c<androidx.camera.core.impl.m> g() {
        if (!N()) {
            return c0.f.f(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return c0.f.j(androidx.concurrent.futures.b.a(new b.c() { // from class: t.d
            {
                s.this = this;
            }

            @Override // androidx.concurrent.futures.b.c
            public final Object a(b.a aVar) {
                return s.m(s.this, aVar);
            }
        }));
    }

    public void g0() {
        this.f51159c.execute(new Runnable() { // from class: t.h
            {
                s.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                s.this.h0();
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void h(final boolean z11, final boolean z12) {
        if (!N()) {
            androidx.camera.core.n0.m("Camera2CameraControlImp", "Camera is not active.");
        } else {
            this.f51159c.execute(new Runnable() { // from class: t.o
                {
                    s.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    s.r(s.this, z11, z12);
                }
            });
        }
    }

    public void h0() {
        this.f51163g.p(F());
        Object H = this.f51169m.k().H(null);
        if (H != null && (H instanceof Integer)) {
            this.f51163g.l("Camera2CameraControl", (Integer) H);
        }
        this.f51162f.b(this.f51163g.m());
    }

    @Override // androidx.camera.core.CameraControl
    public com.google.common.util.concurrent.c<z.s> i(z.r rVar) {
        if (!N()) {
            return c0.f.f(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return c0.f.j(this.f51165i.H(rVar, this.f51164h));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void j() {
        this.f51169m.i().a(new Runnable() { // from class: t.e
            @Override // java.lang.Runnable
            public final void run() {
                s.p();
            }
        }, b0.a.a());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void k(final List<androidx.camera.core.impl.a0> list) {
        if (!N()) {
            androidx.camera.core.n0.m("Camera2CameraControlImp", "Camera is not active.");
        } else {
            this.f51159c.execute(new Runnable() { // from class: t.m
                {
                    s.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    s.u(s.this, list);
                }
            });
        }
    }

    public void w(c cVar) {
        this.f51158b.b(cVar);
    }

    public void x(final Executor executor, final androidx.camera.core.impl.e eVar) {
        this.f51159c.execute(new Runnable() { // from class: t.n
            {
                s.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                s.o(s.this, executor, eVar);
            }
        });
    }

    public void y() {
        synchronized (this.f51160d) {
            int i11 = this.f51171o;
            if (i11 != 0) {
                this.f51171o = i11 - 1;
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
    }

    public void z(boolean z11) {
        this.f51172p = z11;
        if (!z11) {
            a0.a aVar = new a0.a();
            aVar.n(B());
            aVar.o(true);
            a.C1090a c1090a = new a.C1090a();
            c1090a.d(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(G(1)));
            c1090a.d(CaptureRequest.FLASH_MODE, 0);
            aVar.e(c1090a.c());
            V(Collections.singletonList(aVar.h()));
        }
        h0();
    }
}