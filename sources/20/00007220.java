package h2;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t1.o0;
import t1.y0;
import wz.x0;

/* loaded from: classes.dex */
public abstract class o extends f2.m0 implements f2.y, f2.o, g0, h00.l<t1.u, vz.b0> {
    private static final h00.l<o, vz.b0> A;
    private static final h00.l<o, vz.b0> B;
    private static final y0 C;

    /* renamed from: e */
    private final k f28733e;

    /* renamed from: f */
    private o f28734f;

    /* renamed from: g */
    private boolean f28735g;

    /* renamed from: h */
    private h00.l<? super t1.g0, vz.b0> f28736h;

    /* renamed from: i */
    private x2.d f28737i;

    /* renamed from: j */
    private x2.q f28738j;

    /* renamed from: k */
    private float f28739k;

    /* renamed from: l */
    private boolean f28740l;

    /* renamed from: m */
    private f2.a0 f28741m;

    /* renamed from: n */
    private Map<f2.a, Integer> f28742n;

    /* renamed from: o */
    private long f28743o;

    /* renamed from: p */
    private float f28744p;

    /* renamed from: q */
    private boolean f28745q;

    /* renamed from: t */
    private s1.d f28746t;

    /* renamed from: w */
    private h2.e f28747w;

    /* renamed from: x */
    private final h00.a<vz.b0> f28748x;

    /* renamed from: y */
    private boolean f28749y;

    /* renamed from: z */
    private e0 f28750z;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<o, vz.b0> {

        /* renamed from: a */
        public static final a f28751a = new a();

        a() {
            super(1);
        }

        public final void a(o wrapper) {
            kotlin.jvm.internal.s.g(wrapper, "wrapper");
            e0 l12 = wrapper.l1();
            if (l12 == null) {
                return;
            }
            l12.invalidate();
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(o oVar) {
            a(oVar);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<o, vz.b0> {

        /* renamed from: a */
        public static final b f28752a = new b();

        b() {
            super(1);
        }

        public final void a(o wrapper) {
            kotlin.jvm.internal.s.g(wrapper, "wrapper");
            if (wrapper.isValid()) {
                wrapper.X1();
            }
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(o oVar) {
            a(oVar);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.a<vz.b0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d() {
            super(0);
            o.this = r1;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            o w12 = o.this.w1();
            if (w12 == null) {
                return;
            }
            w12.A1();
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: b */
        final /* synthetic */ t1.u f28755b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(t1.u uVar) {
            super(0);
            o.this = r1;
            this.f28755b = uVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            o.this.U0(this.f28755b);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a */
        final /* synthetic */ h00.l<t1.g0, vz.b0> f28756a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(h00.l<? super t1.g0, vz.b0> lVar) {
            super(0);
            this.f28756a = lVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            this.f28756a.invoke(o.C);
        }
    }

    static {
        new c(null);
        A = b.f28752a;
        B = a.f28751a;
        C = new y0();
    }

    public o(k layoutNode) {
        kotlin.jvm.internal.s.g(layoutNode, "layoutNode");
        this.f28733e = layoutNode;
        this.f28737i = layoutNode.K();
        this.f28738j = layoutNode.getLayoutDirection();
        this.f28739k = 0.8f;
        this.f28743o = x2.k.f56947b.a();
        this.f28748x = new d();
    }

    private final long F1(long j11) {
        float l11 = s1.f.l(j11);
        float max = Math.max((float) BitmapDescriptorFactory.HUE_RED, l11 < BitmapDescriptorFactory.HUE_RED ? -l11 : l11 - z0());
        float m11 = s1.f.m(j11);
        return s1.g.a(max, Math.max((float) BitmapDescriptorFactory.HUE_RED, m11 < BitmapDescriptorFactory.HUE_RED ? -m11 : m11 - x0()));
    }

    public static final /* synthetic */ void J0(o oVar, long j11) {
        oVar.F0(j11);
    }

    private final void L0(o oVar, s1.d dVar, boolean z11) {
        if (oVar == this) {
            return;
        }
        o oVar2 = this.f28734f;
        if (oVar2 != null) {
            oVar2.L0(oVar, dVar, z11);
        }
        h1(dVar, z11);
    }

    private final long M0(o oVar, long j11) {
        if (oVar == this) {
            return j11;
        }
        o oVar2 = this.f28734f;
        if (oVar2 != null && !kotlin.jvm.internal.s.c(oVar, oVar2)) {
            return g1(oVar2.M0(oVar, j11));
        }
        return g1(j11);
    }

    public static /* synthetic */ void Q1(o oVar, s1.d dVar, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        oVar.P1(dVar, z11, z12);
    }

    public final void U0(t1.u uVar) {
        h2.e eVar = this.f28747w;
        if (eVar == null) {
            M1(uVar);
        } else {
            eVar.e(uVar);
        }
    }

    public final void X1() {
        e0 e0Var = this.f28750z;
        if (e0Var != null) {
            h00.l<? super t1.g0, vz.b0> lVar = this.f28736h;
            if (lVar != null) {
                y0 y0Var = C;
                y0Var.X();
                y0Var.Y(this.f28733e.K());
                u1().e(this, A, new f(lVar));
                e0Var.d(y0Var.C(), y0Var.D(), y0Var.a(), y0Var.T(), y0Var.U(), y0Var.J(), y0Var.t(), y0Var.u(), y0Var.v(), y0Var.h(), y0Var.S(), y0Var.L(), y0Var.o(), y0Var.p(), this.f28733e.getLayoutDirection(), this.f28733e.K());
                this.f28735g = y0Var.o();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            if (!(this.f28736h == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        this.f28739k = C.a();
        f0 d02 = this.f28733e.d0();
        if (d02 == null) {
            return;
        }
        d02.f(this.f28733e);
    }

    private final void h1(s1.d dVar, boolean z11) {
        float h11 = x2.k.h(r1());
        dVar.i(dVar.b() - h11);
        dVar.j(dVar.c() - h11);
        float i11 = x2.k.i(r1());
        dVar.k(dVar.d() - i11);
        dVar.h(dVar.a() - i11);
        e0 e0Var = this.f28750z;
        if (e0Var != null) {
            e0Var.g(dVar, true);
            if (this.f28735g && z11) {
                dVar.e(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, x2.o.g(e()), x2.o.f(e()));
                dVar.f();
            }
        }
    }

    private final boolean j1() {
        return this.f28741m != null;
    }

    private final h0 u1() {
        return n.a(this.f28733e).getSnapshotObserver();
    }

    public void A1() {
        e0 e0Var = this.f28750z;
        if (e0Var != null) {
            e0Var.invalidate();
            return;
        }
        o oVar = this.f28734f;
        if (oVar == null) {
            return;
        }
        oVar.A1();
    }

    public void B1(t1.u canvas) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        if (this.f28733e.e()) {
            u1().e(this, B, new e(canvas));
            this.f28749y = false;
            return;
        }
        this.f28749y = true;
    }

    @Override // f2.m0
    public void C0(long j11, float f11, h00.l<? super t1.g0, vz.b0> lVar) {
        H1(lVar);
        if (!x2.k.g(r1(), j11)) {
            this.f28743o = j11;
            e0 e0Var = this.f28750z;
            if (e0Var != null) {
                e0Var.h(j11);
            } else {
                o oVar = this.f28734f;
                if (oVar != null) {
                    oVar.A1();
                }
            }
            o v12 = v1();
            if (!kotlin.jvm.internal.s.c(v12 == null ? null : v12.f28733e, this.f28733e)) {
                this.f28733e.A0();
            } else {
                k e02 = this.f28733e.e0();
                if (e02 != null) {
                    e02.A0();
                }
            }
            f0 d02 = this.f28733e.d0();
            if (d02 != null) {
                d02.f(this.f28733e);
            }
        }
        this.f28744p = f11;
    }

    public final boolean C1(long j11) {
        float l11 = s1.f.l(j11);
        float m11 = s1.f.m(j11);
        return l11 >= BitmapDescriptorFactory.HUE_RED && m11 >= BitmapDescriptorFactory.HUE_RED && l11 < ((float) z0()) && m11 < ((float) x0());
    }

    public final boolean D1() {
        return this.f28745q;
    }

    public final boolean E1() {
        if (this.f28750z == null || this.f28739k > BitmapDescriptorFactory.HUE_RED) {
            o oVar = this.f28734f;
            Boolean valueOf = oVar == null ? null : Boolean.valueOf(oVar.E1());
            if (valueOf == null) {
                return false;
            }
            return valueOf.booleanValue();
        }
        return true;
    }

    public void G1() {
        e0 e0Var = this.f28750z;
        if (e0Var == null) {
            return;
        }
        e0Var.invalidate();
    }

    public final void H1(h00.l<? super t1.g0, vz.b0> lVar) {
        f0 d02;
        boolean z11 = (this.f28736h == lVar && kotlin.jvm.internal.s.c(this.f28737i, this.f28733e.K()) && this.f28738j == this.f28733e.getLayoutDirection()) ? false : true;
        this.f28736h = lVar;
        this.f28737i = this.f28733e.K();
        this.f28738j = this.f28733e.getLayoutDirection();
        if (h() && lVar != null) {
            if (this.f28750z != null) {
                if (z11) {
                    X1();
                    return;
                }
                return;
            }
            e0 b11 = n.a(this.f28733e).b(this, this.f28748x);
            b11.c(y0());
            b11.h(r1());
            this.f28750z = b11;
            X1();
            this.f28733e.R0(true);
            this.f28748x.invoke();
            return;
        }
        e0 e0Var = this.f28750z;
        if (e0Var != null) {
            e0Var.destroy();
            n1().R0(true);
            this.f28748x.invoke();
            if (h() && (d02 = n1().d0()) != null) {
                d02.f(n1());
            }
        }
        this.f28750z = null;
        this.f28749y = false;
    }

    protected void I1(int i11, int i12) {
        e0 e0Var = this.f28750z;
        if (e0Var != null) {
            e0Var.c(x2.p.a(i11, i12));
        } else {
            o oVar = this.f28734f;
            if (oVar != null) {
                oVar.A1();
            }
        }
        f0 d02 = this.f28733e.d0();
        if (d02 != null) {
            d02.f(this.f28733e);
        }
        E0(x2.p.a(i11, i12));
        h2.e eVar = this.f28747w;
        if (eVar == null) {
            return;
        }
        eVar.l(i11, i12);
    }

    public void J1() {
        e0 e0Var = this.f28750z;
        if (e0Var == null) {
            return;
        }
        e0Var.invalidate();
    }

    public <T> T K1(g2.a<T> modifierLocal) {
        kotlin.jvm.internal.s.g(modifierLocal, "modifierLocal");
        o oVar = this.f28734f;
        T t11 = oVar == null ? null : (T) oVar.K1(modifierLocal);
        return t11 == null ? modifierLocal.a().invoke() : t11;
    }

    public void L1() {
    }

    public void M1(t1.u canvas) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        o v12 = v1();
        if (v12 == null) {
            return;
        }
        v12.S0(canvas);
    }

    public void N0() {
        this.f28740l = true;
        H1(this.f28736h);
    }

    public void N1(r1.m focusOrder) {
        kotlin.jvm.internal.s.g(focusOrder, "focusOrder");
        o oVar = this.f28734f;
        if (oVar == null) {
            return;
        }
        oVar.N1(focusOrder);
    }

    public abstract int O0(f2.a aVar);

    public void O1(r1.w focusState) {
        kotlin.jvm.internal.s.g(focusState, "focusState");
        o oVar = this.f28734f;
        if (oVar == null) {
            return;
        }
        oVar.O1(focusState);
    }

    public final long P0(long j11) {
        return s1.m.a(Math.max((float) BitmapDescriptorFactory.HUE_RED, (s1.l.i(j11) - z0()) / 2.0f), Math.max((float) BitmapDescriptorFactory.HUE_RED, (s1.l.g(j11) - x0()) / 2.0f));
    }

    public final void P1(s1.d bounds, boolean z11, boolean z12) {
        kotlin.jvm.internal.s.g(bounds, "bounds");
        e0 e0Var = this.f28750z;
        if (e0Var != null) {
            if (this.f28735g) {
                if (z12) {
                    long q12 = q1();
                    float i11 = s1.l.i(q12) / 2.0f;
                    float g11 = s1.l.g(q12) / 2.0f;
                    bounds.e(-i11, -g11, x2.o.g(e()) + i11, x2.o.f(e()) + g11);
                } else if (z11) {
                    bounds.e(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, x2.o.g(e()), x2.o.f(e()));
                }
                if (bounds.f()) {
                    return;
                }
            }
            e0Var.g(bounds, false);
        }
        float h11 = x2.k.h(r1());
        bounds.i(bounds.b() + h11);
        bounds.j(bounds.c() + h11);
        float i12 = x2.k.i(r1());
        bounds.k(bounds.d() + i12);
        bounds.h(bounds.a() + i12);
    }

    public void Q0() {
        this.f28740l = false;
        H1(this.f28736h);
        k e02 = this.f28733e.e0();
        if (e02 == null) {
            return;
        }
        e02.r0();
    }

    public final float R0(long j11, long j12) {
        if (z0() < s1.l.i(j12) || x0() < s1.l.g(j12)) {
            long P0 = P0(j12);
            float i11 = s1.l.i(P0);
            float g11 = s1.l.g(P0);
            long F1 = F1(j11);
            if ((i11 > BitmapDescriptorFactory.HUE_RED || g11 > BitmapDescriptorFactory.HUE_RED) && s1.f.l(F1) <= i11 && s1.f.m(F1) <= g11) {
                return Math.max(s1.f.l(F1), s1.f.m(F1));
            }
            return Float.POSITIVE_INFINITY;
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void R1(h2.e eVar) {
        this.f28747w = eVar;
    }

    public final void S0(t1.u canvas) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        e0 e0Var = this.f28750z;
        if (e0Var != null) {
            e0Var.a(canvas);
            return;
        }
        float h11 = x2.k.h(r1());
        float i11 = x2.k.i(r1());
        canvas.b(h11, i11);
        U0(canvas);
        canvas.b(-h11, -i11);
    }

    public final void S1(f2.a0 value) {
        k e02;
        kotlin.jvm.internal.s.g(value, "value");
        f2.a0 a0Var = this.f28741m;
        if (value != a0Var) {
            this.f28741m = value;
            if (a0Var == null || value.getWidth() != a0Var.getWidth() || value.getHeight() != a0Var.getHeight()) {
                I1(value.getWidth(), value.getHeight());
            }
            Map<f2.a, Integer> map = this.f28742n;
            if ((!(map == null || map.isEmpty()) || (!value.c().isEmpty())) && !kotlin.jvm.internal.s.c(value.c(), this.f28742n)) {
                o v12 = v1();
                if (kotlin.jvm.internal.s.c(v12 == null ? null : v12.f28733e, this.f28733e)) {
                    k e03 = this.f28733e.e0();
                    if (e03 != null) {
                        e03.A0();
                    }
                    if (this.f28733e.H().i()) {
                        k e04 = this.f28733e.e0();
                        if (e04 != null) {
                            e04.N0();
                        }
                    } else if (this.f28733e.H().h() && (e02 = this.f28733e.e0()) != null) {
                        e02.M0();
                    }
                } else {
                    this.f28733e.A0();
                }
                this.f28733e.H().n(true);
                Map map2 = this.f28742n;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.f28742n = map2;
                }
                map2.clear();
                map2.putAll(value.c());
            }
        }
    }

    public final void T0(t1.u canvas, o0 paint) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        kotlin.jvm.internal.s.g(paint, "paint");
        canvas.p(new s1.h(0.5f, 0.5f, x2.o.g(y0()) - 0.5f, x2.o.f(y0()) - 0.5f), paint);
    }

    public final void T1(boolean z11) {
        this.f28745q = z11;
    }

    @Override // f2.o
    public long U(f2.o sourceCoordinates, long j11) {
        kotlin.jvm.internal.s.g(sourceCoordinates, "sourceCoordinates");
        o oVar = (o) sourceCoordinates;
        o V0 = V0(oVar);
        while (oVar != V0) {
            j11 = oVar.W1(j11);
            oVar = oVar.f28734f;
            kotlin.jvm.internal.s.e(oVar);
        }
        return M0(V0, j11);
    }

    public final void U1(o oVar) {
        this.f28734f = oVar;
    }

    public final o V0(o other) {
        kotlin.jvm.internal.s.g(other, "other");
        k kVar = other.f28733e;
        k kVar2 = this.f28733e;
        if (kVar == kVar2) {
            o c02 = kVar2.c0();
            o oVar = this;
            while (oVar != c02 && oVar != other) {
                oVar = oVar.f28734f;
                kotlin.jvm.internal.s.e(oVar);
            }
            return oVar == other ? other : this;
        }
        while (kVar.L() > kVar2.L()) {
            kVar = kVar.e0();
            kotlin.jvm.internal.s.e(kVar);
        }
        while (kVar2.L() > kVar.L()) {
            kVar2 = kVar2.e0();
            kotlin.jvm.internal.s.e(kVar2);
        }
        while (kVar != kVar2) {
            kVar = kVar.e0();
            kVar2 = kVar2.e0();
            if (kVar != null) {
                if (kVar2 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        return kVar2 == this.f28733e ? this : kVar == other.f28733e ? other : kVar.P();
    }

    public boolean V1() {
        return false;
    }

    public abstract s W0();

    public long W1(long j11) {
        e0 e0Var = this.f28750z;
        if (e0Var != null) {
            j11 = e0Var.b(j11, false);
        }
        return x2.l.c(j11, r1());
    }

    public abstract v X0();

    @Override // f2.o
    public final f2.o Y() {
        if (h()) {
            return this.f28733e.c0().f28734f;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public abstract s Y0(boolean z11);

    public final boolean Y1(long j11) {
        if (s1.g.b(j11)) {
            e0 e0Var = this.f28750z;
            return e0Var == null || !this.f28735g || e0Var.e(j11);
        }
        return false;
    }

    @Override // f2.c0
    public final int Z(f2.a alignmentLine) {
        int O0;
        kotlin.jvm.internal.s.g(alignmentLine, "alignmentLine");
        if (j1() && (O0 = O0(alignmentLine)) != Integer.MIN_VALUE) {
            return O0 + x2.k.i(v0());
        }
        return Integer.MIN_VALUE;
    }

    public abstract c2.b Z0();

    public final s a1() {
        o oVar = this.f28734f;
        s c12 = oVar == null ? null : oVar.c1();
        if (c12 != null) {
            return c12;
        }
        for (k e02 = this.f28733e.e0(); e02 != null; e02 = e02.e0()) {
            s W0 = e02.c0().W0();
            if (W0 != null) {
                return W0;
            }
        }
        return null;
    }

    public final v b1() {
        o oVar = this.f28734f;
        v d12 = oVar == null ? null : oVar.d1();
        if (d12 != null) {
            return d12;
        }
        for (k e02 = this.f28733e.e0(); e02 != null; e02 = e02.e0()) {
            v X0 = e02.c0().X0();
            if (X0 != null) {
                return X0;
            }
        }
        return null;
    }

    public abstract s c1();

    public abstract v d1();

    @Override // f2.o
    public final long e() {
        return y0();
    }

    public abstract c2.b e1();

    public final List<s> f1(boolean z11) {
        List<s> d11;
        o v12 = v1();
        s Y0 = v12 == null ? null : v12.Y0(z11);
        if (Y0 != null) {
            d11 = wz.v.d(Y0);
            return d11;
        }
        ArrayList arrayList = new ArrayList();
        List<k> J = this.f28733e.J();
        int size = J.size();
        for (int i11 = 0; i11 < size; i11++) {
            r1.l.a(J.get(i11), arrayList, z11);
        }
        return arrayList;
    }

    public long g1(long j11) {
        long b11 = x2.l.b(j11, r1());
        e0 e0Var = this.f28750z;
        return e0Var == null ? b11 : e0Var.b(b11, true);
    }

    @Override // f2.o
    public final boolean h() {
        if (!this.f28740l || this.f28733e.u0()) {
            return this.f28740l;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // f2.o
    public s1.h h0(f2.o sourceCoordinates, boolean z11) {
        kotlin.jvm.internal.s.g(sourceCoordinates, "sourceCoordinates");
        if (h()) {
            if (sourceCoordinates.h()) {
                o oVar = (o) sourceCoordinates;
                o V0 = V0(oVar);
                s1.d t12 = t1();
                t12.i(BitmapDescriptorFactory.HUE_RED);
                t12.k(BitmapDescriptorFactory.HUE_RED);
                t12.j(x2.o.g(sourceCoordinates.e()));
                t12.h(x2.o.f(sourceCoordinates.e()));
                while (oVar != V0) {
                    Q1(oVar, t12, z11, false, 4, null);
                    if (t12.f()) {
                        return s1.h.f49955e.a();
                    }
                    oVar = oVar.f28734f;
                    kotlin.jvm.internal.s.e(oVar);
                }
                L0(V0, t12, z11);
                return s1.e.a(t12);
            }
            throw new IllegalStateException(("LayoutCoordinates " + sourceCoordinates + " is not attached!").toString());
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public final h2.e i1() {
        return this.f28747w;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(t1.u uVar) {
        B1(uVar);
        return vz.b0.f54756a;
    }

    @Override // h2.g0
    public boolean isValid() {
        return this.f28750z != null;
    }

    public final boolean k1() {
        return this.f28749y;
    }

    public final e0 l1() {
        return this.f28750z;
    }

    public final h00.l<t1.g0, vz.b0> m1() {
        return this.f28736h;
    }

    public final k n1() {
        return this.f28733e;
    }

    @Override // f2.o
    public long o(long j11) {
        if (h()) {
            f2.o d11 = f2.p.d(this);
            return U(d11, s1.f.p(n.a(this.f28733e).l(j11), f2.p.e(d11)));
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public final f2.a0 o1() {
        f2.a0 a0Var = this.f28741m;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    public abstract f2.b0 p1();

    @Override // f2.o
    public long q0(long j11) {
        if (h()) {
            for (o oVar = this; oVar != null; oVar = oVar.f28734f) {
                j11 = oVar.W1(j11);
            }
            return j11;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public final long q1() {
        return this.f28737i.p0(n1().g0().d());
    }

    public final long r1() {
        return this.f28743o;
    }

    public Set<f2.a> s1() {
        Set<f2.a> d11;
        Map<f2.a, Integer> c11;
        f2.a0 a0Var = this.f28741m;
        Set<f2.a> set = null;
        if (a0Var != null && (c11 = a0Var.c()) != null) {
            set = c11.keySet();
        }
        if (set == null) {
            d11 = x0.d();
            return d11;
        }
        return set;
    }

    public final s1.d t1() {
        s1.d dVar = this.f28746t;
        if (dVar == null) {
            s1.d dVar2 = new s1.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.f28746t = dVar2;
            return dVar2;
        }
        return dVar;
    }

    @Override // f2.o
    public long v(long j11) {
        return n.a(this.f28733e).e(q0(j11));
    }

    public o v1() {
        return null;
    }

    public final o w1() {
        return this.f28734f;
    }

    public final float x1() {
        return this.f28744p;
    }

    public abstract void y1(long j11, h2.f<d2.a0> fVar, boolean z11, boolean z12);

    public abstract void z1(long j11, h2.f<l2.x> fVar, boolean z11);
}