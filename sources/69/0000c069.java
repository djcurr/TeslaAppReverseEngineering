package y0;

import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.v1;
import h2.a;
import o1.a;
import o1.f;
import p0.a;

/* loaded from: classes.dex */
public final class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v1<t1.a0> f58076a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p0.w f58077b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.q<p0.c0, c1.i, Integer, vz.b0> f58078c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f58079d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: y0.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1323a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p0.w f58080a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h00.q<p0.c0, c1.i, Integer, vz.b0> f58081b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f58082c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: y0.f$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1324a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ p0.w f58083a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ h00.q<p0.c0, c1.i, Integer, vz.b0> f58084b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ int f58085c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1324a(p0.w wVar, h00.q<? super p0.c0, ? super c1.i, ? super Integer, vz.b0> qVar, int i11) {
                    super(2);
                    this.f58083a = wVar;
                    this.f58084b = qVar;
                    this.f58085c = i11;
                }

                @Override // h00.p
                public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
                    invoke(iVar, num.intValue());
                    return vz.b0.f54756a;
                }

                public final void invoke(c1.i iVar, int i11) {
                    if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                        iVar.G();
                        return;
                    }
                    f.a aVar = o1.f.f42062f1;
                    d dVar = d.f57958a;
                    o1.f g11 = p0.u.g(p0.e0.g(aVar, dVar.e(), dVar.d()), this.f58083a);
                    a.e b11 = p0.a.f45228a.b();
                    a.c g12 = o1.a.f42039a.g();
                    h00.q<p0.c0, c1.i, Integer, vz.b0> qVar = this.f58084b;
                    int i12 = ((this.f58085c >> 18) & 7168) | 432;
                    iVar.x(-1989997165);
                    int i13 = i12 >> 3;
                    f2.z b12 = p0.b0.b(b11, g12, iVar, (i13 & 112) | (i13 & 14));
                    iVar.x(1376089394);
                    x2.d dVar2 = (x2.d) iVar.A(androidx.compose.ui.platform.l0.d());
                    x2.q qVar2 = (x2.q) iVar.A(androidx.compose.ui.platform.l0.i());
                    y1 y1Var = (y1) iVar.A(androidx.compose.ui.platform.l0.m());
                    a.C0551a c0551a = h2.a.Y0;
                    h00.a<h2.a> a11 = c0551a.a();
                    h00.q<c1.g1<h2.a>, c1.i, Integer, vz.b0> b13 = f2.u.b(g11);
                    int i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
                    if (!(iVar.k() instanceof c1.e)) {
                        c1.h.c();
                    }
                    iVar.D();
                    if (iVar.f()) {
                        iVar.s(a11);
                    } else {
                        iVar.o();
                    }
                    iVar.E();
                    c1.i a12 = a2.a(iVar);
                    a2.c(a12, b12, c0551a.d());
                    a2.c(a12, dVar2, c0551a.b());
                    a2.c(a12, qVar2, c0551a.c());
                    a2.c(a12, y1Var, c0551a.f());
                    iVar.c();
                    b13.invoke(c1.g1.a(c1.g1.b(iVar)), iVar, Integer.valueOf((i14 >> 3) & 112));
                    iVar.x(2058660585);
                    iVar.x(-326682362);
                    if (((((i14 >> 9) & 14) & 11) ^ 2) == 0 && iVar.i()) {
                        iVar.G();
                    } else {
                        qVar.invoke(p0.d0.f45271a, iVar, Integer.valueOf(((i12 >> 6) & 112) | 6));
                    }
                    iVar.N();
                    iVar.N();
                    iVar.q();
                    iVar.N();
                    iVar.N();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1323a(p0.w wVar, h00.q<? super p0.c0, ? super c1.i, ? super Integer, vz.b0> qVar, int i11) {
                super(2);
                this.f58080a = wVar;
                this.f58081b = qVar;
                this.f58082c = i11;
            }

            @Override // h00.p
            public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
                invoke(iVar, num.intValue());
                return vz.b0.f54756a;
            }

            public final void invoke(c1.i iVar, int i11) {
                if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                    iVar.G();
                } else {
                    o1.a(h0.f58131a.c(iVar, 6).e(), j1.c.b(iVar, -819891337, true, new C1324a(this.f58080a, this.f58081b, this.f58082c)), iVar, 48);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(v1<t1.a0> v1Var, p0.w wVar, h00.q<? super p0.c0, ? super c1.i, ? super Integer, vz.b0> qVar, int i11) {
            super(2);
            this.f58076a = v1Var;
            this.f58077b = wVar;
            this.f58078c = qVar;
            this.f58079d = i11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
            } else {
                c1.r.a(new c1.x0[]{o.a().c(Float.valueOf(t1.a0.o(f.b(this.f58076a))))}, j1.c.b(iVar, -819891427, true, new C1323a(this.f58077b, this.f58078c, this.f58079d)), iVar, 56);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.a<vz.b0> f58086a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1.f f58087b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f58088c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ o0.m f58089d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f58090e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t1.c1 f58091f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ m0.e f58092g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ y0.c f58093h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p0.w f58094i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ h00.q<p0.c0, c1.i, Integer, vz.b0> f58095j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f58096k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f58097l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(h00.a<vz.b0> aVar, o1.f fVar, boolean z11, o0.m mVar, e eVar, t1.c1 c1Var, m0.e eVar2, y0.c cVar, p0.w wVar, h00.q<? super p0.c0, ? super c1.i, ? super Integer, vz.b0> qVar, int i11, int i12) {
            super(2);
            this.f58086a = aVar;
            this.f58087b = fVar;
            this.f58088c = z11;
            this.f58089d = mVar;
            this.f58090e = eVar;
            this.f58091f = c1Var;
            this.f58092g = eVar2;
            this.f58093h = cVar;
            this.f58094i = wVar;
            this.f58095j = qVar;
            this.f58096k = i11;
            this.f58097l = i12;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            f.a(this.f58086a, this.f58087b, this.f58088c, this.f58089d, this.f58090e, this.f58091f, this.f58092g, this.f58093h, this.f58094i, this.f58095j, iVar, this.f58096k | 1, this.f58097l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.a<vz.b0> f58098a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1.f f58099b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f58100c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ o0.m f58101d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f58102e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t1.c1 f58103f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ m0.e f58104g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ y0.c f58105h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p0.w f58106i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ h00.q<p0.c0, c1.i, Integer, vz.b0> f58107j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f58108k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f58109l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(h00.a<vz.b0> aVar, o1.f fVar, boolean z11, o0.m mVar, e eVar, t1.c1 c1Var, m0.e eVar2, y0.c cVar, p0.w wVar, h00.q<? super p0.c0, ? super c1.i, ? super Integer, vz.b0> qVar, int i11, int i12) {
            super(2);
            this.f58098a = aVar;
            this.f58099b = fVar;
            this.f58100c = z11;
            this.f58101d = mVar;
            this.f58102e = eVar;
            this.f58103f = c1Var;
            this.f58104g = eVar2;
            this.f58105h = cVar;
            this.f58106i = wVar;
            this.f58107j = qVar;
            this.f58108k = i11;
            this.f58109l = i12;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            f.c(this.f58098a, this.f58099b, this.f58100c, this.f58101d, this.f58102e, this.f58103f, this.f58104g, this.f58105h, this.f58106i, this.f58107j, iVar, this.f58108k | 1, this.f58109l);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(h00.a<vz.b0> r34, o1.f r35, boolean r36, o0.m r37, y0.e r38, t1.c1 r39, m0.e r40, y0.c r41, p0.w r42, h00.q<? super p0.c0, ? super c1.i, ? super java.lang.Integer, vz.b0> r43, c1.i r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.f.a(h00.a, o1.f, boolean, o0.m, y0.e, t1.c1, m0.e, y0.c, p0.w, h00.q, c1.i, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(v1<t1.a0> v1Var) {
        return v1Var.getValue().v();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(h00.a<vz.b0> r31, o1.f r32, boolean r33, o0.m r34, y0.e r35, t1.c1 r36, m0.e r37, y0.c r38, p0.w r39, h00.q<? super p0.c0, ? super c1.i, ? super java.lang.Integer, vz.b0> r40, c1.i r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.f.c(h00.a, o1.f, boolean, o0.m, y0.e, t1.c1, m0.e, y0.c, p0.w, h00.q, c1.i, int, int):void");
    }
}