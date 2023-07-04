package y0;

import androidx.compose.ui.platform.y1;
import c1.a2;
import h2.a;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<l2.v, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f57903a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(l2.v vVar) {
            invoke2(vVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(l2.v semantics) {
            kotlin.jvm.internal.s.g(semantics, "$this$semantics");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SurfaceKt$Surface$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<d2.c0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f57904a;

        b(zz.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new b(dVar);
        }

        @Override // h00.p
        public final Object invoke(d2.c0 c0Var, zz.d<? super vz.b0> dVar) {
            return ((b) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f57904a == 0) {
                vz.r.b(obj);
                return vz.b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1.f f57905a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t1.c1 f57906b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f57907c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f57908d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m0.e f57909e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f57910f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57911g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f57912h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f57913i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(o1.f fVar, t1.c1 c1Var, long j11, long j12, m0.e eVar, float f11, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, int i11, int i12) {
            super(2);
            this.f57905a = fVar;
            this.f57906b = c1Var;
            this.f57907c = j11;
            this.f57908d = j12;
            this.f57909e = eVar;
            this.f57910f = f11;
            this.f57911g = pVar;
            this.f57912h = i11;
            this.f57913i = i12;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            b1.b(this.f57905a, this.f57906b, this.f57907c, this.f57908d, this.f57909e, this.f57910f, this.f57911g, iVar, this.f57912h | 1, this.f57913i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.a<vz.b0> f57914a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1.f f57915b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t1.c1 f57916c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f57917d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f57918e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ m0.e f57919f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f57920g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ o0.m f57921h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m0.p f57922i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f57923j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ String f57924k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ l2.h f57925l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57926m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f57927n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f57928o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f57929p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(h00.a<vz.b0> aVar, o1.f fVar, t1.c1 c1Var, long j11, long j12, m0.e eVar, float f11, o0.m mVar, m0.p pVar, boolean z11, String str, l2.h hVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar2, int i11, int i12, int i13) {
            super(2);
            this.f57914a = aVar;
            this.f57915b = fVar;
            this.f57916c = c1Var;
            this.f57917d = j11;
            this.f57918e = j12;
            this.f57919f = eVar;
            this.f57920g = f11;
            this.f57921h = mVar;
            this.f57922i = pVar;
            this.f57923j = z11;
            this.f57924k = str;
            this.f57925l = hVar;
            this.f57926m = pVar2;
            this.f57927n = i11;
            this.f57928o = i12;
            this.f57929p = i13;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            b1.a(this.f57914a, this.f57915b, this.f57916c, this.f57917d, this.f57918e, this.f57919f, this.f57920g, this.f57921h, this.f57922i, this.f57923j, this.f57924k, this.f57925l, this.f57926m, iVar, this.f57927n | 1, this.f57928o, this.f57929p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1.f f57930a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f57931b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t1.c1 f57932c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m0.e f57933d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f57934e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ o1.f f57935f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57936g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f57937h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(o1.f fVar, float f11, t1.c1 c1Var, m0.e eVar, long j11, o1.f fVar2, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, int i11) {
            super(2);
            this.f57930a = fVar;
            this.f57931b = f11;
            this.f57932c = c1Var;
            this.f57933d = eVar;
            this.f57934e = j11;
            this.f57935f = fVar2;
            this.f57936g = pVar;
            this.f57937h = i11;
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
            o1.f a11 = q1.p.a(this.f57930a, this.f57931b, this.f57932c, false);
            m0.e eVar = this.f57933d;
            o1.f g02 = q1.d.a(m0.b.a(a11.g0(eVar != null ? m0.d.f(o1.f.f42062f1, eVar, this.f57932c) : o1.f.f42062f1), this.f57934e, this.f57932c), this.f57932c).g0(this.f57935f);
            h00.p<c1.i, Integer, vz.b0> pVar = this.f57936g;
            int i12 = this.f57937h;
            iVar.x(-1990474327);
            f2.z i13 = p0.c.i(o1.a.f42039a.k(), true, iVar, 48);
            iVar.x(1376089394);
            x2.d dVar = (x2.d) iVar.A(androidx.compose.ui.platform.l0.d());
            x2.q qVar = (x2.q) iVar.A(androidx.compose.ui.platform.l0.i());
            y1 y1Var = (y1) iVar.A(androidx.compose.ui.platform.l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a12 = c0551a.a();
            h00.q<c1.g1<h2.a>, c1.i, Integer, vz.b0> b11 = f2.u.b(g02);
            if (!(iVar.k() instanceof c1.e)) {
                c1.h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.s(a12);
            } else {
                iVar.o();
            }
            iVar.E();
            c1.i a13 = a2.a(iVar);
            a2.c(a13, i13, c0551a.d());
            a2.c(a13, dVar, c0551a.b());
            a2.c(a13, qVar, c0551a.c());
            a2.c(a13, y1Var, c0551a.f());
            iVar.c();
            b11.invoke(c1.g1.a(c1.g1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(-1253629305);
            p0.d dVar2 = p0.d.f45270a;
            iVar.x(1505976207);
            pVar.invoke(iVar, Integer.valueOf((i12 >> 21) & 14));
            iVar.N();
            iVar.N();
            iVar.N();
            iVar.q();
            iVar.N();
            iVar.N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1.f f57938a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t1.c1 f57939b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f57940c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f57941d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m0.e f57942e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f57943f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ o1.f f57944g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57945h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f57946i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(o1.f fVar, t1.c1 c1Var, long j11, long j12, m0.e eVar, float f11, o1.f fVar2, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, int i11) {
            super(2);
            this.f57938a = fVar;
            this.f57939b = c1Var;
            this.f57940c = j11;
            this.f57941d = j12;
            this.f57942e = eVar;
            this.f57943f = f11;
            this.f57944g = fVar2;
            this.f57945h = pVar;
            this.f57946i = i11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            b1.c(this.f57938a, this.f57939b, this.f57940c, this.f57941d, this.f57942e, this.f57943f, this.f57944g, this.f57945h, iVar, this.f57946i | 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(h00.a<vz.b0> r32, o1.f r33, t1.c1 r34, long r35, long r37, m0.e r39, float r40, o0.m r41, m0.p r42, boolean r43, java.lang.String r44, l2.h r45, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r46, c1.i r47, int r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.b1.a(h00.a, o1.f, t1.c1, long, long, m0.e, float, o0.m, m0.p, boolean, java.lang.String, l2.h, h00.p, c1.i, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(o1.f r25, t1.c1 r26, long r27, long r29, m0.e r31, float r32, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r33, c1.i r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.b1.b(o1.f, t1.c1, long, long, m0.e, float, h00.p, c1.i, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(o1.f fVar, t1.c1 c1Var, long j11, long j12, m0.e eVar, float f11, o1.f fVar2, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, c1.i iVar, int i11) {
        int i12;
        c1.i iVar2;
        c1.i h11 = iVar.h(-750961828);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(fVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.O(c1Var) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h11.e(j11) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= h11.e(j12) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= h11.O(eVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((458752 & i11) == 0) {
            i12 |= h11.b(f11) ? 131072 : 65536;
        }
        if ((3670016 & i11) == 0) {
            i12 |= h11.O(fVar2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((29360128 & i11) == 0) {
            i12 |= h11.O(pVar) ? 8388608 : 4194304;
        }
        int i13 = i12;
        if (((i13 & 23967451) ^ 4793490) == 0 && h11.i()) {
            h11.G();
            iVar2 = h11;
        } else {
            z zVar = (z) h11.A(a0.d());
            float f12 = x2.g.f(((x2.g) h11.A(a0.c())).l() + f11);
            h11.x(-750961449);
            long a11 = (!t1.a0.n(j11, h0.f58131a.a(h11, 6).n()) || zVar == null) ? j11 : zVar.a(j11, f12, h11, (i13 >> 6) & 14);
            h11.N();
            iVar2 = h11;
            c1.r.a(new c1.x0[]{p.a().c(t1.a0.h(j12)), a0.c().c(x2.g.c(f12))}, j1.c.b(iVar2, -819902018, true, new e(fVar, f11, c1Var, eVar, a11, fVar2, pVar, i13)), iVar2, 56);
        }
        c1.e1 l11 = iVar2.l();
        if (l11 == null) {
            return;
        }
        l11.a(new f(fVar, c1Var, j11, j12, eVar, f11, fVar2, pVar, i11));
    }
}