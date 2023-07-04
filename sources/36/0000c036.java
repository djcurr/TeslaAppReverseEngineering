package y0;

import androidx.compose.ui.platform.y1;
import c1.a2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h2.a;

/* loaded from: classes.dex */
public final class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57865a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f57866b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57867c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: y0.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1318a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57868a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f57869b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57870c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1318a(h00.p<? super c1.i, ? super Integer, vz.b0> pVar, int i11, h00.p<? super c1.i, ? super Integer, vz.b0> pVar2) {
                super(2);
                this.f57868a = pVar;
                this.f57869b = i11;
                this.f57870c = pVar2;
            }

            @Override // h00.p
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
                invoke(iVar, num.intValue());
                return vz.b0.f54756a;
            }

            public final void invoke(c1.i iVar, int i11) {
                if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                    iVar.G();
                    return;
                }
                h00.p<c1.i, Integer, vz.b0> pVar = this.f57868a;
                iVar.x(-1046483318);
                if (pVar != null) {
                    pVar.mo160invoke(iVar, Integer.valueOf((this.f57869b >> 9) & 14));
                }
                iVar.N();
                this.f57870c.mo160invoke(iVar, Integer.valueOf((this.f57869b >> 3) & 14));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h00.p<? super c1.i, ? super Integer, vz.b0> pVar, int i11, h00.p<? super c1.i, ? super Integer, vz.b0> pVar2) {
            super(2);
            this.f57865a = pVar;
            this.f57866b = i11;
            this.f57867c = pVar2;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
                return;
            }
            float f11 = 8;
            o1.f i12 = p0.u.i(p0.e0.n(o1.f.f42062f1, BitmapDescriptorFactory.HUE_RED, 1, null), x2.g.f(f11), x2.g.f(2));
            h00.p<c1.i, Integer, vz.b0> pVar = this.f57865a;
            int i13 = this.f57866b;
            h00.p<c1.i, Integer, vz.b0> pVar2 = this.f57867c;
            iVar.x(-1990474327);
            f2.z i14 = p0.c.i(o1.a.f42039a.k(), false, iVar, 0);
            iVar.x(1376089394);
            x2.d dVar = (x2.d) iVar.A(androidx.compose.ui.platform.l0.d());
            x2.q qVar = (x2.q) iVar.A(androidx.compose.ui.platform.l0.i());
            y1 y1Var = (y1) iVar.A(androidx.compose.ui.platform.l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a11 = c0551a.a();
            h00.q<c1.g1<h2.a>, c1.i, Integer, vz.b0> b11 = f2.u.b(i12);
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
            a2.c(a12, i14, c0551a.d());
            a2.c(a12, dVar, c0551a.b());
            a2.c(a12, qVar, c0551a.c());
            a2.c(a12, y1Var, c0551a.f());
            iVar.c();
            b11.invoke(c1.g1.a(c1.g1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(-1253629305);
            p0.d dVar2 = p0.d.f45270a;
            iVar.x(350577093);
            y0.a.c(x2.g.f(f11), x2.g.f(12), j1.c.b(iVar, -819893906, true, new C1318a(pVar, i13, pVar2)), iVar, 438);
            iVar.N();
            iVar.N();
            iVar.N();
            iVar.q();
            iVar.N();
            iVar.N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1319b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.a<vz.b0> f57871a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57872b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o1.f f57873c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57874d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57875e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57876f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ t1.c1 f57877g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f57878h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f57879i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.g f57880j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f57881k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f57882l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1319b(h00.a<vz.b0> aVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, o1.f fVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar2, h00.p<? super c1.i, ? super Integer, vz.b0> pVar3, h00.p<? super c1.i, ? super Integer, vz.b0> pVar4, t1.c1 c1Var, long j11, long j12, androidx.compose.ui.window.g gVar, int i11, int i12) {
            super(2);
            this.f57871a = aVar;
            this.f57872b = pVar;
            this.f57873c = fVar;
            this.f57874d = pVar2;
            this.f57875e = pVar3;
            this.f57876f = pVar4;
            this.f57877g = c1Var;
            this.f57878h = j11;
            this.f57879i = j12;
            this.f57880j = gVar;
            this.f57881k = i11;
            this.f57882l = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            b.a(this.f57871a, this.f57872b, this.f57873c, this.f57874d, this.f57875e, this.f57876f, this.f57877g, this.f57878h, this.f57879i, this.f57880j, iVar, this.f57881k | 1, this.f57882l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57883a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1.f f57884b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57885c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57886d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ t1.c1 f57887e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f57888f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f57889g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f57890h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(h00.p<? super c1.i, ? super Integer, vz.b0> pVar, o1.f fVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar2, h00.p<? super c1.i, ? super Integer, vz.b0> pVar3, t1.c1 c1Var, long j11, long j12, int i11) {
            super(2);
            this.f57883a = pVar;
            this.f57884b = fVar;
            this.f57885c = pVar2;
            this.f57886d = pVar3;
            this.f57887e = c1Var;
            this.f57888f = j11;
            this.f57889g = j12;
            this.f57890h = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
                return;
            }
            h00.p<c1.i, Integer, vz.b0> pVar = this.f57883a;
            o1.f fVar = this.f57884b;
            h00.p<c1.i, Integer, vz.b0> pVar2 = this.f57885c;
            h00.p<c1.i, Integer, vz.b0> pVar3 = this.f57886d;
            t1.c1 c1Var = this.f57887e;
            long j11 = this.f57888f;
            long j12 = this.f57889g;
            int i12 = this.f57890h;
            y0.a.b(pVar, fVar, pVar2, pVar3, c1Var, j11, j12, iVar, ((i12 >> 3) & 14) | ((i12 >> 3) & 112) | ((i12 >> 3) & 896) | ((i12 >> 3) & 7168) | (57344 & (i12 >> 3)) | (458752 & (i12 >> 3)) | ((i12 >> 3) & 3670016), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.a<vz.b0> f57891a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57892b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o1.f f57893c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57894d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57895e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t1.c1 f57896f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f57897g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f57898h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.g f57899i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f57900j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f57901k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(h00.a<vz.b0> aVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, o1.f fVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar2, h00.p<? super c1.i, ? super Integer, vz.b0> pVar3, t1.c1 c1Var, long j11, long j12, androidx.compose.ui.window.g gVar, int i11, int i12) {
            super(2);
            this.f57891a = aVar;
            this.f57892b = pVar;
            this.f57893c = fVar;
            this.f57894d = pVar2;
            this.f57895e = pVar3;
            this.f57896f = c1Var;
            this.f57897g = j11;
            this.f57898h = j12;
            this.f57899i = gVar;
            this.f57900j = i11;
            this.f57901k = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            b.b(this.f57891a, this.f57892b, this.f57893c, this.f57894d, this.f57895e, this.f57896f, this.f57897g, this.f57898h, this.f57899i, iVar, this.f57900j | 1, this.f57901k);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(h00.a<vz.b0> r31, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r32, o1.f r33, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r34, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r35, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r36, t1.c1 r37, long r38, long r40, androidx.compose.ui.window.g r42, c1.i r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.b.a(h00.a, h00.p, o1.f, h00.p, h00.p, h00.p, t1.c1, long, long, androidx.compose.ui.window.g, c1.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(h00.a<vz.b0> r28, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r29, o1.f r30, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r31, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r32, t1.c1 r33, long r34, long r36, androidx.compose.ui.window.g r38, c1.i r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.b.b(h00.a, h00.p, o1.f, h00.p, h00.p, t1.c1, long, long, androidx.compose.ui.window.g, c1.i, int, int):void");
    }
}