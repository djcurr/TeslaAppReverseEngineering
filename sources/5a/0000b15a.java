package s0;

import c1.v1;
import f2.a0;
import f2.m0;
import h2.j0;
import java.util.Map;
import m0.d0;
import o1.a;
import p0.a;
import vz.b0;
import wz.s0;

/* loaded from: classes.dex */
public final class n {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.a<r0.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v1<k> f49810a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(v1<? extends k> v1Var) {
            super(0);
            this.f49810a = v1Var;
        }

        @Override // h00.a
        /* renamed from: a */
        public final r0.f invoke() {
            return this.f49810a.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1.f f49811a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q0.h f49812b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p0.w f49813c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f49814d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f49815e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ n0.p f49816f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a.b f49817g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a.k f49818h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ a.c f49819i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ a.d f49820j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ h00.l<q0.g, b0> f49821k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f49822l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f49823m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f49824n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(o1.f fVar, q0.h hVar, p0.w wVar, boolean z11, boolean z12, n0.p pVar, a.b bVar, a.k kVar, a.c cVar, a.d dVar, h00.l<? super q0.g, b0> lVar, int i11, int i12, int i13) {
            super(2);
            this.f49811a = fVar;
            this.f49812b = hVar;
            this.f49813c = wVar;
            this.f49814d = z11;
            this.f49815e = z12;
            this.f49816f = pVar;
            this.f49817g = bVar;
            this.f49818h = kVar;
            this.f49819i = cVar;
            this.f49820j = dVar;
            this.f49821k = lVar;
            this.f49822l = i11;
            this.f49823m = i12;
            this.f49824n = i13;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            n.a(this.f49811a, this.f49812b, this.f49813c, this.f49814d, this.f49815e, this.f49816f, this.f49817g, this.f49818h, this.f49819i, this.f49820j, this.f49821k, iVar, this.f49822l | 1, this.f49823m, this.f49824n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c implements r0.r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f49825a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p0.w f49826b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f49827c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v1<k> f49828d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q0.h f49829e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j0<f> f49830f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a.k f49831g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a.d f49832h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ i f49833i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ a.b f49834j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ a.c f49835k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ n0.v f49836l;

        /* loaded from: classes.dex */
        static final class a extends kotlin.jvm.internal.u implements h00.q<Integer, Integer, h00.l<? super m0.a, ? extends b0>, a0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f2.b0 f49837a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ long f49838b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f49839c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f49840d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f2.b0 b0Var, long j11, int i11, int i12) {
                super(3);
                this.f49837a = b0Var;
                this.f49838b = j11;
                this.f49839c = i11;
                this.f49840d = i12;
            }

            public final a0 a(int i11, int i12, h00.l<? super m0.a, b0> placement) {
                Map<f2.a, Integer> i13;
                kotlin.jvm.internal.s.g(placement, "placement");
                f2.b0 b0Var = this.f49837a;
                int g11 = x2.c.g(this.f49838b, i11 + this.f49839c);
                int f11 = x2.c.f(this.f49838b, i12 + this.f49840d);
                i13 = s0.i();
                return b0Var.I(g11, f11, i13, placement);
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ a0 invoke(Integer num, Integer num2, h00.l<? super m0.a, ? extends b0> lVar) {
                return a(num.intValue(), num2.intValue(), lVar);
            }
        }

        /* loaded from: classes.dex */
        static final class b implements x {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f49841a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f49842b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ f2.b0 f49843c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f49844d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f49845e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f49846f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ a.b f49847g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ a.c f49848h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ boolean f49849i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ int f49850j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ int f49851k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ i f49852l;

            b(int i11, int i12, f2.b0 b0Var, int i13, int i14, boolean z11, a.b bVar, a.c cVar, boolean z12, int i15, int i16, i iVar) {
                this.f49841a = i11;
                this.f49842b = i12;
                this.f49843c = b0Var;
                this.f49844d = i13;
                this.f49845e = i14;
                this.f49846f = z11;
                this.f49847g = bVar;
                this.f49848h = cVar;
                this.f49849i = z12;
                this.f49850j = i15;
                this.f49851k = i16;
                this.f49852l = iVar;
            }

            @Override // s0.x
            public final u a(int i11, Object key, r0.j[] placeables) {
                kotlin.jvm.internal.s.g(key, "key");
                kotlin.jvm.internal.s.g(placeables, "placeables");
                return new u(i11, placeables, this.f49846f, this.f49847g, this.f49848h, this.f49843c.getLayoutDirection(), this.f49849i, this.f49850j, this.f49851k, this.f49852l, i11 == this.f49841a + (-1) ? 0 : this.f49842b, x2.l.a(this.f49844d, this.f49845e), key, null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(boolean z11, p0.w wVar, boolean z12, v1<? extends k> v1Var, q0.h hVar, j0<f> j0Var, a.k kVar, a.d dVar, i iVar, a.b bVar, a.c cVar, n0.v vVar) {
            this.f49825a = z11;
            this.f49826b = wVar;
            this.f49827c = z12;
            this.f49828d = v1Var;
            this.f49829e = hVar;
            this.f49830f = j0Var;
            this.f49831g = kVar;
            this.f49832h = dVar;
            this.f49833i = iVar;
            this.f49834j = bVar;
            this.f49835k = cVar;
            this.f49836l = vVar;
        }

        @Override // r0.r
        public final r0.h a(f2.b0 LazyMeasurePolicy, r0.k placeablesProvider, long j11) {
            int i11;
            float a11;
            int n11;
            kotlin.jvm.internal.s.g(LazyMeasurePolicy, "$this$LazyMeasurePolicy");
            kotlin.jvm.internal.s.g(placeablesProvider, "placeablesProvider");
            d0.b(j11, this.f49825a);
            int G = LazyMeasurePolicy.G(p0.u.f(this.f49826b, LazyMeasurePolicy.getLayoutDirection()));
            int G2 = LazyMeasurePolicy.G(p0.u.e(this.f49826b, LazyMeasurePolicy.getLayoutDirection()));
            int G3 = LazyMeasurePolicy.G(this.f49826b.d());
            int G4 = LazyMeasurePolicy.G(this.f49826b.a());
            int i12 = G3 + G4;
            int i13 = G + G2;
            boolean z11 = this.f49825a;
            int i14 = z11 ? i12 : i13;
            if (z11 && !this.f49827c) {
                i11 = G3;
            } else if (z11 && this.f49827c) {
                i11 = G4;
            } else {
                i11 = (z11 || this.f49827c) ? G2 : G;
            }
            int i15 = i14 - i11;
            long h11 = x2.c.h(j11, -i13, -i12);
            k value = this.f49828d.getValue();
            this.f49829e.y(value);
            this.f49829e.t(LazyMeasurePolicy);
            n.f(this.f49830f, LazyMeasurePolicy, h11);
            if (this.f49825a) {
                a.k kVar = this.f49831g;
                if (kVar == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                a11 = kVar.a();
            } else {
                a.d dVar = this.f49832h;
                if (dVar == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                a11 = dVar.a();
            }
            int G5 = LazyMeasurePolicy.G(a11);
            int c11 = value.c();
            boolean z12 = this.f49825a;
            v vVar = new v(h11, z12, value, placeablesProvider, new b(c11, G5, LazyMeasurePolicy, G, G3, z12, this.f49834j, this.f49835k, this.f49827c, i11, i15, this.f49833i), null);
            r0.l n12 = this.f49829e.n();
            if (n12 != null) {
                n12.d(vVar.b());
            }
            if (this.f49825a) {
                n11 = x2.b.m(j11) - i12;
            } else {
                n11 = x2.b.n(j11) - i13;
            }
            p b11 = o.b(c11, vVar, n11, i11, i15, this.f49829e.h(), this.f49829e.j(), this.f49829e.o(), h11, this.f49825a, value.e(), this.f49831g, this.f49832h, this.f49827c, LazyMeasurePolicy, LazyMeasurePolicy.getLayoutDirection(), this.f49833i, new a(LazyMeasurePolicy, j11, i13, i12));
            q0.h hVar = this.f49829e;
            n0.v vVar2 = this.f49836l;
            hVar.e(b11);
            n.d(vVar2, b11, j11, i13, i12);
            return b11.i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(o1.f r30, q0.h r31, p0.w r32, boolean r33, boolean r34, n0.p r35, o1.a.b r36, p0.a.k r37, o1.a.c r38, p0.a.d r39, h00.l<? super q0.g, vz.b0> r40, c1.i r41, int r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.n.a(o1.f, q0.h, p0.w, boolean, boolean, n0.p, o1.a$b, p0.a$k, o1.a$c, p0.a$d, h00.l, c1.i, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(n0.v vVar, p pVar, long j11, int i11, int i12) {
        boolean e11 = pVar.e();
        u g11 = pVar.g();
        boolean z11 = false;
        boolean z12 = ((g11 == null ? 0 : g11.b()) == 0 && pVar.h() == 0) ? false : true;
        long a11 = s1.m.a(x2.c.g(j11, pVar.getWidth() + i11), x2.c.f(j11, pVar.getHeight() + i12));
        if (e11 || z12) {
            z11 = true;
        }
        vVar.d(a11, z11);
    }

    private static final r0.r e(v1<? extends k> v1Var, j0<f> j0Var, q0.h hVar, n0.v vVar, p0.w wVar, boolean z11, boolean z12, a.b bVar, a.c cVar, a.d dVar, a.k kVar, i iVar, c1.i iVar2, int i11, int i12, int i13) {
        iVar2.x(208079303);
        a.b bVar2 = (i13 & 128) != 0 ? null : bVar;
        a.c cVar2 = (i13 & 256) != 0 ? null : cVar;
        a.d dVar2 = (i13 & 512) != 0 ? null : dVar;
        a.k kVar2 = (i13 & 1024) != 0 ? null : kVar;
        int i14 = 0;
        Object[] objArr = {hVar, vVar, wVar, Boolean.valueOf(z11), Boolean.valueOf(z12), bVar2, cVar2, dVar2, kVar2, iVar};
        iVar2.x(-3685570);
        boolean z13 = false;
        while (i14 < 10) {
            Object obj = objArr[i14];
            i14++;
            z13 |= iVar2.O(obj);
        }
        Object y11 = iVar2.y();
        if (z13 || y11 == c1.i.f8486a.a()) {
            y11 = new c(z12, wVar, z11, v1Var, hVar, j0Var, kVar2, dVar2, iVar, bVar2, cVar2, vVar);
            iVar2.p(y11);
        }
        iVar2.N();
        r0.r rVar = (r0.r) y11;
        iVar2.N();
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(j0<f> j0Var, x2.d dVar, long j11) {
        f a11 = j0Var.a();
        if (a11 != null && kotlin.jvm.internal.s.c(a11.b(), dVar) && x2.b.g(a11.a(), j11)) {
            return;
        }
        j0Var.b(new f(dVar, j11, null));
    }
}