package c1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class z0 implements e1, y0 {

    /* renamed from: a  reason: collision with root package name */
    private o f8717a;

    /* renamed from: b  reason: collision with root package name */
    private int f8718b;

    /* renamed from: c  reason: collision with root package name */
    private d f8719c;

    /* renamed from: d  reason: collision with root package name */
    private h00.p<? super i, ? super Integer, vz.b0> f8720d;

    /* renamed from: e  reason: collision with root package name */
    private int f8721e;

    /* renamed from: f  reason: collision with root package name */
    private d1.a f8722f;

    /* renamed from: g  reason: collision with root package name */
    private d1.b<w<?>, Object> f8723g;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<l, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f8725b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d1.a f8726c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, d1.a aVar) {
            super(1);
            this.f8725b = i11;
            this.f8726c = aVar;
        }

        public final void a(l composition) {
            d1.b bVar;
            kotlin.jvm.internal.s.g(composition, "composition");
            if (z0.this.f8721e == this.f8725b && kotlin.jvm.internal.s.c(this.f8726c, z0.this.f8722f) && (composition instanceof o)) {
                d1.a aVar = this.f8726c;
                int i11 = this.f8725b;
                z0 z0Var = z0.this;
                int e11 = aVar.e();
                int i12 = 0;
                int i13 = 0;
                while (i12 < e11) {
                    int i14 = i12 + 1;
                    Object obj = aVar.d()[i12];
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Any");
                    int i15 = aVar.f()[i12];
                    boolean z11 = i15 != i11;
                    if (z11) {
                        ((o) composition).u(obj, z0Var);
                        w wVar = obj instanceof w ? (w) obj : null;
                        if (wVar != null && (bVar = z0Var.f8723g) != null) {
                            bVar.i(wVar);
                            if (bVar.f() == 0) {
                                z0Var.f8723g = null;
                            }
                        }
                    }
                    if (!z11) {
                        if (i13 != i12) {
                            aVar.d()[i13] = obj;
                            aVar.f()[i13] = i15;
                        }
                        i13++;
                    }
                    i12 = i14;
                }
                int e12 = aVar.e();
                for (int i16 = i13; i16 < e12; i16++) {
                    aVar.d()[i16] = null;
                }
                aVar.g(i13);
                if (this.f8726c.e() == 0) {
                    z0.this.f8722f = null;
                }
            }
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(l lVar) {
            a(lVar);
            return vz.b0.f54756a;
        }
    }

    public z0(o oVar) {
        this.f8717a = oVar;
    }

    private final void B(boolean z11) {
        if (z11) {
            this.f8718b |= 32;
        } else {
            this.f8718b &= -33;
        }
    }

    private final void C(boolean z11) {
        if (z11) {
            this.f8718b |= 16;
        } else {
            this.f8718b &= -17;
        }
    }

    private final boolean n() {
        return (this.f8718b & 32) != 0;
    }

    public final void A(boolean z11) {
        if (z11) {
            this.f8718b |= 8;
        } else {
            this.f8718b &= -9;
        }
    }

    public final void D(boolean z11) {
        if (z11) {
            this.f8718b |= 1;
        } else {
            this.f8718b &= -2;
        }
    }

    public final void E(int i11) {
        this.f8721e = i11;
        C(false);
    }

    @Override // c1.e1
    public void a(h00.p<? super i, ? super Integer, vz.b0> block) {
        kotlin.jvm.internal.s.g(block, "block");
        this.f8720d = block;
    }

    public final void g(i composer) {
        vz.b0 b0Var;
        kotlin.jvm.internal.s.g(composer, "composer");
        h00.p<? super i, ? super Integer, vz.b0> pVar = this.f8720d;
        if (pVar == null) {
            b0Var = null;
        } else {
            pVar.invoke(composer, 1);
            b0Var = vz.b0.f54756a;
        }
        if (b0Var == null) {
            throw new IllegalStateException("Invalid restart scope".toString());
        }
    }

    public final h00.l<l, vz.b0> h(int i11) {
        d1.a aVar = this.f8722f;
        if (aVar == null || o()) {
            return null;
        }
        int e11 = aVar.e();
        boolean z11 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= e11) {
                break;
            }
            int i13 = i12 + 1;
            Objects.requireNonNull(aVar.d()[i12], "null cannot be cast to non-null type kotlin.Any");
            if (aVar.f()[i12] != i11) {
                z11 = true;
                break;
            }
            i12 = i13;
        }
        if (z11) {
            return new a(i11, aVar);
        }
        return null;
    }

    public final d i() {
        return this.f8719c;
    }

    @Override // c1.y0
    public void invalidate() {
        o oVar = this.f8717a;
        if (oVar == null) {
            return;
        }
        oVar.s(this, null);
    }

    public final o j() {
        return this.f8717a;
    }

    public final boolean k() {
        return (this.f8718b & 2) != 0;
    }

    public final boolean l() {
        return (this.f8718b & 4) != 0;
    }

    public final boolean m() {
        return (this.f8718b & 8) != 0;
    }

    public final boolean o() {
        return (this.f8718b & 16) != 0;
    }

    public final boolean p() {
        return (this.f8718b & 1) != 0;
    }

    public final boolean q() {
        if (this.f8717a != null) {
            d dVar = this.f8719c;
            return dVar == null ? false : dVar.b();
        }
        return false;
    }

    public final g0 r(Object obj) {
        o oVar = this.f8717a;
        g0 s11 = oVar == null ? null : oVar.s(this, obj);
        return s11 == null ? g0.IGNORED : s11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean s(d1.c<Object> cVar) {
        d1.b<w<?>, Object> bVar;
        boolean z11;
        boolean z12;
        if (cVar != null && (bVar = this.f8723g) != 0 && cVar.h()) {
            if (!cVar.isEmpty()) {
                for (Object obj : cVar) {
                    if ((obj instanceof w) && kotlin.jvm.internal.s.c(bVar.d(obj), ((w) obj).getValue())) {
                        z11 = true;
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                    if (!z11) {
                        z12 = false;
                        break;
                    }
                }
            }
            z12 = true;
            if (z12) {
                return false;
            }
        }
        return true;
    }

    public final void t(Object instance) {
        kotlin.jvm.internal.s.g(instance, "instance");
        if (n()) {
            return;
        }
        d1.a aVar = this.f8722f;
        if (aVar == null) {
            aVar = new d1.a();
            this.f8722f = aVar;
        }
        aVar.a(instance, this.f8721e);
        if (instance instanceof w) {
            d1.b<w<?>, Object> bVar = this.f8723g;
            if (bVar == null) {
                bVar = new d1.b<>(0, 1, null);
                this.f8723g = bVar;
            }
            bVar.j(instance, ((w) instance).a());
        }
    }

    public final void u() {
        d1.a aVar;
        o oVar = this.f8717a;
        if (oVar == null || (aVar = this.f8722f) == null) {
            return;
        }
        B(true);
        try {
            int e11 = aVar.e();
            int i11 = 0;
            while (i11 < e11) {
                int i12 = i11 + 1;
                Object obj = aVar.d()[i11];
                if (obj != null) {
                    int i13 = aVar.f()[i11];
                    oVar.e(obj);
                    i11 = i12;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                }
            }
        } finally {
            B(false);
        }
    }

    public final void v() {
        C(true);
    }

    public final void w(d dVar) {
        this.f8719c = dVar;
    }

    public final void x(o oVar) {
        this.f8717a = oVar;
    }

    public final void y(boolean z11) {
        if (z11) {
            this.f8718b |= 2;
        } else {
            this.f8718b &= -3;
        }
    }

    public final void z(boolean z11) {
        if (z11) {
            this.f8718b |= 4;
        } else {
            this.f8718b &= -5;
        }
    }
}