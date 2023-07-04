package f2;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class m0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private int f25582a;

    /* renamed from: b  reason: collision with root package name */
    private int f25583b;

    /* renamed from: c  reason: collision with root package name */
    private long f25584c = x2.p.a(0, 0);

    /* renamed from: d  reason: collision with root package name */
    private long f25585d = n0.a();

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0504a f25586a = new C0504a(null);

        /* renamed from: b  reason: collision with root package name */
        private static x2.q f25587b = x2.q.Ltr;

        /* renamed from: c  reason: collision with root package name */
        private static int f25588c;

        /* renamed from: f2.m0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0504a extends a {
            private C0504a() {
            }

            public /* synthetic */ C0504a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // f2.m0.a
            public x2.q g() {
                return a.f25587b;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // f2.m0.a
            public int h() {
                return a.f25588c;
            }
        }

        public static /* synthetic */ void j(a aVar, m0 m0Var, int i11, int i12, float f11, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i13 & 4) != 0) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            aVar.i(m0Var, i11, i12, f11);
        }

        public static /* synthetic */ void l(a aVar, m0 m0Var, long j11, float f11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i11 & 2) != 0) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            aVar.k(m0Var, j11, f11);
        }

        public static /* synthetic */ void n(a aVar, m0 m0Var, int i11, int i12, float f11, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i13 & 4) != 0) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            aVar.m(m0Var, i11, i12, f11);
        }

        public static /* synthetic */ void p(a aVar, m0 m0Var, long j11, float f11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i11 & 2) != 0) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            aVar.o(m0Var, j11, f11);
        }

        public static /* synthetic */ void r(a aVar, m0 m0Var, int i11, int i12, float f11, h00.l lVar, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i13 & 4) != 0) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            float f12 = f11;
            h00.l lVar2 = lVar;
            if ((i13 & 8) != 0) {
                lVar2 = n0.b();
            }
            aVar.q(m0Var, i11, i12, f12, lVar2);
        }

        public static /* synthetic */ void t(a aVar, m0 m0Var, long j11, float f11, h00.l lVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i11 & 2) != 0) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            float f12 = f11;
            h00.l lVar2 = lVar;
            if ((i11 & 4) != 0) {
                lVar2 = n0.b();
            }
            aVar.s(m0Var, j11, f12, lVar2);
        }

        public static /* synthetic */ void v(a aVar, m0 m0Var, int i11, int i12, float f11, h00.l lVar, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i13 & 4) != 0) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            float f12 = f11;
            h00.l lVar2 = lVar;
            if ((i13 & 8) != 0) {
                lVar2 = n0.b();
            }
            aVar.u(m0Var, i11, i12, f12, lVar2);
        }

        public static /* synthetic */ void x(a aVar, m0 m0Var, long j11, float f11, h00.l lVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i11 & 2) != 0) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            float f12 = f11;
            h00.l lVar2 = lVar;
            if ((i11 & 4) != 0) {
                lVar2 = n0.b();
            }
            aVar.w(m0Var, j11, f12, lVar2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract x2.q g();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int h();

        public final void i(m0 m0Var, int i11, int i12, float f11) {
            kotlin.jvm.internal.s.g(m0Var, "<this>");
            long a11 = x2.l.a(i11, i12);
            long v02 = m0Var.v0();
            m0Var.C0(x2.l.a(x2.k.h(a11) + x2.k.h(v02), x2.k.i(a11) + x2.k.i(v02)), f11, null);
        }

        public final void k(m0 receiver, long j11, float f11) {
            kotlin.jvm.internal.s.g(receiver, "$receiver");
            long v02 = receiver.v0();
            receiver.C0(x2.l.a(x2.k.h(j11) + x2.k.h(v02), x2.k.i(j11) + x2.k.i(v02)), f11, null);
        }

        public final void m(m0 m0Var, int i11, int i12, float f11) {
            kotlin.jvm.internal.s.g(m0Var, "<this>");
            long a11 = x2.l.a(i11, i12);
            if (g() == x2.q.Ltr || h() == 0) {
                long v02 = m0Var.v0();
                m0Var.C0(x2.l.a(x2.k.h(a11) + x2.k.h(v02), x2.k.i(a11) + x2.k.i(v02)), f11, null);
                return;
            }
            long a12 = x2.l.a((h() - x2.o.g(m0Var.y0())) - x2.k.h(a11), x2.k.i(a11));
            long v03 = m0Var.v0();
            m0Var.C0(x2.l.a(x2.k.h(a12) + x2.k.h(v03), x2.k.i(a12) + x2.k.i(v03)), f11, null);
        }

        public final void o(m0 receiver, long j11, float f11) {
            kotlin.jvm.internal.s.g(receiver, "$receiver");
            if (g() == x2.q.Ltr || h() == 0) {
                long v02 = receiver.v0();
                receiver.C0(x2.l.a(x2.k.h(j11) + x2.k.h(v02), x2.k.i(j11) + x2.k.i(v02)), f11, null);
                return;
            }
            long a11 = x2.l.a((h() - x2.o.g(receiver.y0())) - x2.k.h(j11), x2.k.i(j11));
            long v03 = receiver.v0();
            receiver.C0(x2.l.a(x2.k.h(a11) + x2.k.h(v03), x2.k.i(a11) + x2.k.i(v03)), f11, null);
        }

        public final void q(m0 m0Var, int i11, int i12, float f11, h00.l<? super t1.g0, vz.b0> layerBlock) {
            kotlin.jvm.internal.s.g(m0Var, "<this>");
            kotlin.jvm.internal.s.g(layerBlock, "layerBlock");
            long a11 = x2.l.a(i11, i12);
            if (g() == x2.q.Ltr || h() == 0) {
                long v02 = m0Var.v0();
                m0Var.C0(x2.l.a(x2.k.h(a11) + x2.k.h(v02), x2.k.i(a11) + x2.k.i(v02)), f11, layerBlock);
                return;
            }
            long a12 = x2.l.a((h() - x2.o.g(m0Var.y0())) - x2.k.h(a11), x2.k.i(a11));
            long v03 = m0Var.v0();
            m0Var.C0(x2.l.a(x2.k.h(a12) + x2.k.h(v03), x2.k.i(a12) + x2.k.i(v03)), f11, layerBlock);
        }

        public final void s(m0 receiver, long j11, float f11, h00.l<? super t1.g0, vz.b0> layerBlock) {
            kotlin.jvm.internal.s.g(receiver, "$receiver");
            kotlin.jvm.internal.s.g(layerBlock, "layerBlock");
            if (g() == x2.q.Ltr || h() == 0) {
                long v02 = receiver.v0();
                receiver.C0(x2.l.a(x2.k.h(j11) + x2.k.h(v02), x2.k.i(j11) + x2.k.i(v02)), f11, layerBlock);
                return;
            }
            long a11 = x2.l.a((h() - x2.o.g(receiver.y0())) - x2.k.h(j11), x2.k.i(j11));
            long v03 = receiver.v0();
            receiver.C0(x2.l.a(x2.k.h(a11) + x2.k.h(v03), x2.k.i(a11) + x2.k.i(v03)), f11, layerBlock);
        }

        public final void u(m0 m0Var, int i11, int i12, float f11, h00.l<? super t1.g0, vz.b0> layerBlock) {
            kotlin.jvm.internal.s.g(m0Var, "<this>");
            kotlin.jvm.internal.s.g(layerBlock, "layerBlock");
            long a11 = x2.l.a(i11, i12);
            long v02 = m0Var.v0();
            m0Var.C0(x2.l.a(x2.k.h(a11) + x2.k.h(v02), x2.k.i(a11) + x2.k.i(v02)), f11, layerBlock);
        }

        public final void w(m0 receiver, long j11, float f11, h00.l<? super t1.g0, vz.b0> layerBlock) {
            kotlin.jvm.internal.s.g(receiver, "$receiver");
            kotlin.jvm.internal.s.g(layerBlock, "layerBlock");
            long v02 = receiver.v0();
            receiver.C0(x2.l.a(x2.k.h(j11) + x2.k.h(v02), x2.k.i(j11) + x2.k.i(v02)), f11, layerBlock);
        }
    }

    private final void D0() {
        int m11;
        int m12;
        m11 = m00.l.m(x2.o.g(y0()), x2.b.p(A0()), x2.b.n(A0()));
        this.f25582a = m11;
        m12 = m00.l.m(x2.o.f(y0()), x2.b.o(A0()), x2.b.m(A0()));
        this.f25583b = m12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long A0() {
        return this.f25585d;
    }

    public final int B0() {
        return this.f25582a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void C0(long j11, float f11, h00.l<? super t1.g0, vz.b0> lVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void E0(long j11) {
        if (x2.o.e(this.f25584c, j11)) {
            return;
        }
        this.f25584c = j11;
        D0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void F0(long j11) {
        if (x2.b.g(this.f25585d, j11)) {
            return;
        }
        this.f25585d = j11;
        D0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long v0() {
        return x2.l.a((this.f25582a - x2.o.g(y0())) / 2, (this.f25583b - x2.o.f(y0())) / 2);
    }

    public final int w0() {
        return this.f25583b;
    }

    public int x0() {
        return x2.o.f(y0());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long y0() {
        return this.f25584c;
    }

    public int z0() {
        return x2.o.g(y0());
    }
}