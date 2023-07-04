package v20;

import zz.g;

/* loaded from: classes5.dex */
public final class i0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.p<zz.g, g.b, zz.g> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f53943a = new a();

        a() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final zz.g invoke(zz.g gVar, g.b bVar) {
            if (bVar instanceof g0) {
                return gVar.plus(((g0) bVar).L());
            }
            return gVar.plus(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<zz.g, g.b, zz.g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.l0<zz.g> f53944a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f53945b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.l0<zz.g> l0Var, boolean z11) {
            super(2);
            this.f53944a = l0Var;
            this.f53945b = z11;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [zz.g, T] */
        @Override // h00.p
        /* renamed from: a */
        public final zz.g invoke(zz.g gVar, g.b bVar) {
            if (bVar instanceof g0) {
                g.b bVar2 = this.f53944a.f34916a.get(bVar.getKey());
                if (bVar2 == null) {
                    g0 g0Var = (g0) bVar;
                    if (this.f53945b) {
                        g0Var = g0Var.L();
                    }
                    return gVar.plus(g0Var);
                }
                kotlin.jvm.internal.l0<zz.g> l0Var = this.f53944a;
                l0Var.f34916a = l0Var.f34916a.minusKey(bVar.getKey());
                return gVar.plus(((g0) bVar).a0(bVar2));
            }
            return gVar.plus(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.p<Boolean, g.b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f53946a = new c();

        c() {
            super(2);
        }

        public final Boolean a(boolean z11, g.b bVar) {
            return Boolean.valueOf(z11 || (bVar instanceof g0));
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, g.b bVar) {
            return a(bool.booleanValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final zz.g a(zz.g gVar, zz.g gVar2, boolean z11) {
        boolean c11 = c(gVar);
        boolean c12 = c(gVar2);
        if (!c11 && !c12) {
            return gVar.plus(gVar2);
        }
        kotlin.jvm.internal.l0 l0Var = new kotlin.jvm.internal.l0();
        l0Var.f34916a = gVar2;
        zz.h hVar = zz.h.f61280a;
        zz.g gVar3 = (zz.g) gVar.fold(hVar, new b(l0Var, z11));
        if (c12) {
            l0Var.f34916a = ((zz.g) l0Var.f34916a).fold(hVar, a.f53943a);
        }
        return gVar3.plus((zz.g) l0Var.f34916a);
    }

    public static final String b(zz.g gVar) {
        m0 m0Var;
        String I0;
        if (r0.c() && (m0Var = (m0) gVar.get(m0.f53976b)) != null) {
            n0 n0Var = (n0) gVar.get(n0.f53978b);
            String str = "coroutine";
            if (n0Var != null && (I0 = n0Var.I0()) != null) {
                str = I0;
            }
            return str + '#' + m0Var.I0();
        }
        return null;
    }

    private static final boolean c(zz.g gVar) {
        return ((Boolean) gVar.fold(Boolean.FALSE, c.f53946a)).booleanValue();
    }

    public static final zz.g d(o0 o0Var, zz.g gVar) {
        zz.g a11 = a(o0Var.J(), gVar, true);
        zz.g plus = r0.c() ? a11.plus(new m0(r0.b().incrementAndGet())) : a11;
        return (a11 == e1.a() || a11.get(zz.e.f61277h3) != null) ? plus : plus.plus(e1.a());
    }

    public static final zz.g e(zz.g gVar, zz.g gVar2) {
        return !c(gVar2) ? gVar.plus(gVar2) : a(gVar, gVar2, false);
    }

    public static final g3<?> f(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof a1) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof g3) {
                return (g3) eVar;
            }
        }
        return null;
    }

    public static final g3<?> g(zz.d<?> dVar, zz.g gVar, Object obj) {
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            if (gVar.get(h3.f53942a) != null) {
                g3<?> f11 = f((kotlin.coroutines.jvm.internal.e) dVar);
                if (f11 != null) {
                    f11.c1(gVar, obj);
                }
                return f11;
            }
            return null;
        }
        return null;
    }
}