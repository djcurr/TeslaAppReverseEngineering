package h2;

import androidx.compose.ui.platform.b1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.m0;
import java.util.Map;
import o1.f;
import o1.f.c;
import wz.s0;

/* loaded from: classes.dex */
public class b<T extends f.c> extends o {
    private o E;
    private T F;
    private boolean G;
    private boolean H;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<Boolean, vz.b0> f28607a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h00.l<? super Boolean, vz.b0> lVar) {
            super(0);
            this.f28607a = lVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f28607a.invoke(Boolean.FALSE);
        }
    }

    /* renamed from: h2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0553b extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<Boolean, vz.b0> f28608a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f28609b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0553b(h00.l<? super Boolean, vz.b0> lVar, boolean z11) {
            super(0);
            this.f28608a = lVar;
            this.f28609b = z11;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f28608a.invoke(Boolean.valueOf(this.f28609b));
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<Boolean, vz.b0> f28610a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f28611b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(h00.l<? super Boolean, vz.b0> lVar, boolean z11) {
            super(0);
            this.f28610a = lVar;
            this.f28611b = z11;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f28610a.invoke(Boolean.valueOf(this.f28611b));
        }
    }

    /* loaded from: classes.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<Boolean, vz.b0> f28612a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f28613b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(h00.l<? super Boolean, vz.b0> lVar, boolean z11) {
            super(0);
            this.f28612a = lVar;
            this.f28613b = z11;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f28612a.invoke(Boolean.valueOf(this.f28613b));
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements f2.a0 {

        /* renamed from: a  reason: collision with root package name */
        private final int f28614a;

        /* renamed from: b  reason: collision with root package name */
        private final int f28615b;

        /* renamed from: c  reason: collision with root package name */
        private final Map<f2.a, Integer> f28616c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b<T> f28617d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f2.m0 f28618e;

        e(b<T> bVar, f2.m0 m0Var) {
            Map<f2.a, Integer> i11;
            this.f28617d = bVar;
            this.f28618e = m0Var;
            this.f28614a = bVar.v1().o1().getWidth();
            this.f28615b = bVar.v1().o1().getHeight();
            i11 = s0.i();
            this.f28616c = i11;
        }

        @Override // f2.a0
        public void b() {
            m0.a.C0504a c0504a = m0.a.f25586a;
            f2.m0 m0Var = this.f28618e;
            long v02 = this.f28617d.v0();
            m0.a.l(c0504a, m0Var, x2.l.a(-x2.k.h(v02), -x2.k.i(v02)), BitmapDescriptorFactory.HUE_RED, 2, null);
        }

        @Override // f2.a0
        public Map<f2.a, Integer> c() {
            return this.f28616c;
        }

        @Override // f2.a0
        public int getHeight() {
            return this.f28615b;
        }

        @Override // f2.a0
        public int getWidth() {
            return this.f28614a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o wrapped, T modifier) {
        super(wrapped.n1());
        kotlin.jvm.internal.s.g(wrapped, "wrapped");
        kotlin.jvm.internal.s.g(modifier, "modifier");
        this.E = wrapped;
        this.F = modifier;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h2.o, f2.m0
    public void C0(long j11, float f11, h00.l<? super t1.g0, vz.b0> lVar) {
        int h11;
        x2.q g11;
        super.C0(j11, f11, lVar);
        o w12 = w1();
        boolean z11 = false;
        if (w12 != null && w12.D1()) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        L1();
        m0.a.C0504a c0504a = m0.a.f25586a;
        int g12 = x2.o.g(y0());
        x2.q layoutDirection = p1().getLayoutDirection();
        h11 = c0504a.h();
        g11 = c0504a.g();
        m0.a.f25588c = g12;
        m0.a.f25587b = layoutDirection;
        o1().b();
        m0.a.f25588c = h11;
        m0.a.f25587b = g11;
    }

    @Override // h2.o
    public void G1() {
        super.G1();
        v1().U1(this);
    }

    @Override // h2.o
    public void M1(t1.u canvas) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        v1().S0(canvas);
    }

    @Override // h2.o
    public int O0(f2.a alignmentLine) {
        kotlin.jvm.internal.s.g(alignmentLine, "alignmentLine");
        return v1().Z(alignmentLine);
    }

    @Override // f2.j
    public int S(int i11) {
        return v1().S(i11);
    }

    @Override // f2.j
    public int T(int i11) {
        return v1().T(i11);
    }

    @Override // h2.o
    public boolean V1() {
        return v1().V1();
    }

    @Override // h2.o
    public s W0() {
        s sVar = null;
        for (s Y0 = Y0(false); Y0 != null; Y0 = Y0.v1().Y0(false)) {
            sVar = Y0;
        }
        return sVar;
    }

    @Override // f2.y
    public f2.m0 X(long j11) {
        o.J0(this, j11);
        S1(new e(this, v1().X(j11)));
        return this;
    }

    @Override // h2.o
    public v X0() {
        v d12 = n1().P().d1();
        if (d12 != this) {
            return d12;
        }
        return null;
    }

    @Override // h2.o
    public s Y0(boolean z11) {
        return v1().Y0(z11);
    }

    @Override // h2.o
    public c2.b Z0() {
        return v1().Z0();
    }

    @Override // f2.j
    public int a(int i11) {
        return v1().a(i11);
    }

    public T a2() {
        return this.F;
    }

    public final boolean b2() {
        return this.H;
    }

    @Override // h2.o
    public s c1() {
        o w12 = w1();
        if (w12 == null) {
            return null;
        }
        return w12.c1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <T> void c2(long j11, f<T> hitTestResult, boolean z11, boolean z12, boolean z13, T t11, h00.l<? super Boolean, vz.b0> block) {
        kotlin.jvm.internal.s.g(hitTestResult, "hitTestResult");
        kotlin.jvm.internal.s.g(block, "block");
        boolean z14 = true;
        if (!Y1(j11)) {
            if (z12) {
                float R0 = R0(j11, q1());
                if (Float.isInfinite(R0) || Float.isNaN(R0)) {
                    z14 = false;
                }
                if (z14 && hitTestResult.o(R0, false)) {
                    hitTestResult.n(t11, R0, false, new a(block));
                }
            }
        } else if (C1(j11)) {
            hitTestResult.m(t11, z13, new C0553b(block, z13));
        } else {
            float R02 = !z12 ? Float.POSITIVE_INFINITY : R0(j11, q1());
            if (Float.isInfinite(R02) || Float.isNaN(R02)) {
                z14 = false;
            }
            if (z14 && hitTestResult.o(R02, z13)) {
                hitTestResult.n(t11, R02, z13, new c(block, z13));
            } else if (z11) {
                hitTestResult.q(t11, R02, z13, new d(block, z13));
            } else {
                block.invoke(Boolean.valueOf(z13));
            }
        }
    }

    @Override // h2.o
    public v d1() {
        o w12 = w1();
        if (w12 == null) {
            return null;
        }
        return w12.d1();
    }

    public final boolean d2() {
        return this.G;
    }

    @Override // h2.o
    public c2.b e1() {
        o w12 = w1();
        if (w12 == null) {
            return null;
        }
        return w12.e1();
    }

    public final void e2(boolean z11) {
        this.G = z11;
    }

    public void f2(T t11) {
        kotlin.jvm.internal.s.g(t11, "<set-?>");
        this.F = t11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g2(f.c modifier) {
        kotlin.jvm.internal.s.g(modifier, "modifier");
        if (modifier != a2()) {
            if (kotlin.jvm.internal.s.c(b1.a(modifier), b1.a(a2()))) {
                f2(modifier);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final void h2(boolean z11) {
        this.H = z11;
    }

    public void i2(o oVar) {
        kotlin.jvm.internal.s.g(oVar, "<set-?>");
        this.E = oVar;
    }

    @Override // h2.o
    public f2.b0 p1() {
        return v1().p1();
    }

    @Override // f2.j
    public Object t() {
        return v1().t();
    }

    @Override // f2.j
    public int u(int i11) {
        return v1().u(i11);
    }

    @Override // h2.o
    public o v1() {
        return this.E;
    }

    @Override // h2.o
    public void y1(long j11, f<d2.a0> hitTestResult, boolean z11, boolean z12) {
        kotlin.jvm.internal.s.g(hitTestResult, "hitTestResult");
        boolean Y1 = Y1(j11);
        if (!Y1) {
            if (!z11) {
                return;
            }
            float R0 = R0(j11, q1());
            if (!((Float.isInfinite(R0) || Float.isNaN(R0)) ? false : true)) {
                return;
            }
        }
        v1().y1(v1().g1(j11), hitTestResult, z11, z12 && Y1);
    }

    @Override // h2.o
    public void z1(long j11, f<l2.x> hitSemanticsWrappers, boolean z11) {
        kotlin.jvm.internal.s.g(hitSemanticsWrappers, "hitSemanticsWrappers");
        boolean Y1 = Y1(j11);
        boolean z12 = true;
        if (!Y1) {
            float R0 = R0(j11, q1());
            if (!((Float.isInfinite(R0) || Float.isNaN(R0)) ? false : true)) {
                return;
            }
        }
        long g12 = v1().g1(j11);
        if (!z11 || !Y1) {
            z12 = false;
        }
        v1().z1(g12, hitSemanticsWrappers, z12);
    }
}