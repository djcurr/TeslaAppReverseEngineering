package y0;

import androidx.compose.ui.platform.y1;
import c1.a2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import f2.m0;
import h2.a;
import o1.f;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import v1.e;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f58276a = x2.g.f(20);

    /* renamed from: b  reason: collision with root package name */
    private static final float f58277b = x2.g.f(10);

    /* renamed from: c  reason: collision with root package name */
    private static final float f58278c = x2.g.f(4);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58279a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58280b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.q<o1.f, c1.i, Integer, vz.b0> f58281c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58282d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58283e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f58284f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f58285g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f58286h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ float f58287i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f58288j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h00.p<? super c1.i, ? super Integer, vz.b0> pVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar2, h00.q<? super o1.f, ? super c1.i, ? super Integer, vz.b0> qVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar3, h00.p<? super c1.i, ? super Integer, vz.b0> pVar4, boolean z11, long j11, long j12, float f11, int i11) {
            super(2);
            this.f58279a = pVar;
            this.f58280b = pVar2;
            this.f58281c = qVar;
            this.f58282d = pVar3;
            this.f58283e = pVar4;
            this.f58284f = z11;
            this.f58285g = j11;
            this.f58286h = j12;
            this.f58287i = f11;
            this.f58288j = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            k1.a(this.f58279a, this.f58280b, this.f58281c, this.f58282d, this.f58283e, this.f58284f, this.f58285g, this.f58286h, this.f58287i, iVar, this.f58288j | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<s2.a0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f58289a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.l<String, vz.b0> f58290b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c1.o0<s2.a0> f58291c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(String str, h00.l<? super String, vz.b0> lVar, c1.o0<s2.a0> o0Var) {
            super(1);
            this.f58289a = str;
            this.f58290b = lVar;
            this.f58291c = o0Var;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(s2.a0 a0Var) {
            invoke2(a0Var);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(s2.a0 it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            k1.e(this.f58291c, it2);
            if (kotlin.jvm.internal.s.c(this.f58289a, it2.h())) {
                return;
            }
            this.f58290b.mo12invoke(it2.h());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f58292a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.l<String, vz.b0> f58293b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o1.f f58294c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f58295d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f58296e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ n2.a0 f58297f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58298g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58299h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58300i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58301j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f58302k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ s2.k0 f58303l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ w0.v f58304m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ w0.u f58305n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ boolean f58306o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f58307p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ o0.m f58308q;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ t1.c1 f58309t;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ g1 f58310w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ int f58311x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ int f58312y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ int f58313z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(String str, h00.l<? super String, vz.b0> lVar, o1.f fVar, boolean z11, boolean z12, n2.a0 a0Var, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar2, h00.p<? super c1.i, ? super Integer, vz.b0> pVar3, h00.p<? super c1.i, ? super Integer, vz.b0> pVar4, boolean z13, s2.k0 k0Var, w0.v vVar, w0.u uVar, boolean z14, int i11, o0.m mVar, t1.c1 c1Var, g1 g1Var, int i12, int i13, int i14) {
            super(2);
            this.f58292a = str;
            this.f58293b = lVar;
            this.f58294c = fVar;
            this.f58295d = z11;
            this.f58296e = z12;
            this.f58297f = a0Var;
            this.f58298g = pVar;
            this.f58299h = pVar2;
            this.f58300i = pVar3;
            this.f58301j = pVar4;
            this.f58302k = z13;
            this.f58303l = k0Var;
            this.f58304m = vVar;
            this.f58305n = uVar;
            this.f58306o = z14;
            this.f58307p = i11;
            this.f58308q = mVar;
            this.f58309t = c1Var;
            this.f58310w = g1Var;
            this.f58311x = i12;
            this.f58312y = i13;
            this.f58313z = i14;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            k1.b(this.f58292a, this.f58293b, this.f58294c, this.f58295d, this.f58296e, this.f58297f, this.f58298g, this.f58299h, this.f58300i, this.f58301j, this.f58302k, this.f58303l, this.f58304m, this.f58305n, this.f58306o, this.f58307p, this.f58308q, this.f58309t, this.f58310w, iVar, this.f58311x | 1, this.f58312y, this.f58313z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s2.a0 f58314a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.l<s2.a0, vz.b0> f58315b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o1.f f58316c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f58317d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f58318e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ n2.a0 f58319f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58320g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58321h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58322i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58323j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f58324k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ s2.k0 f58325l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ w0.v f58326m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ w0.u f58327n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ boolean f58328o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f58329p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ o0.m f58330q;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ t1.c1 f58331t;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ g1 f58332w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ int f58333x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ int f58334y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ int f58335z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(s2.a0 a0Var, h00.l<? super s2.a0, vz.b0> lVar, o1.f fVar, boolean z11, boolean z12, n2.a0 a0Var2, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar2, h00.p<? super c1.i, ? super Integer, vz.b0> pVar3, h00.p<? super c1.i, ? super Integer, vz.b0> pVar4, boolean z13, s2.k0 k0Var, w0.v vVar, w0.u uVar, boolean z14, int i11, o0.m mVar, t1.c1 c1Var, g1 g1Var, int i12, int i13, int i14) {
            super(2);
            this.f58314a = a0Var;
            this.f58315b = lVar;
            this.f58316c = fVar;
            this.f58317d = z11;
            this.f58318e = z12;
            this.f58319f = a0Var2;
            this.f58320g = pVar;
            this.f58321h = pVar2;
            this.f58322i = pVar3;
            this.f58323j = pVar4;
            this.f58324k = z13;
            this.f58325l = k0Var;
            this.f58326m = vVar;
            this.f58327n = uVar;
            this.f58328o = z14;
            this.f58329p = i11;
            this.f58330q = mVar;
            this.f58331t = c1Var;
            this.f58332w = g1Var;
            this.f58333x = i12;
            this.f58334y = i13;
            this.f58335z = i14;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            k1.c(this.f58314a, this.f58315b, this.f58316c, this.f58317d, this.f58318e, this.f58319f, this.f58320g, this.f58321h, this.f58322i, this.f58323j, this.f58324k, this.f58325l, this.f58326m, this.f58327n, this.f58328o, this.f58329p, this.f58330q, this.f58331t, this.f58332w, iVar, this.f58333x | 1, this.f58334y, this.f58335z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.q<h00.p<? super c1.i, ? super Integer, ? extends vz.b0>, c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58336a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.q<o1.f, c1.i, Integer, vz.b0> f58337b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58338c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58339d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f58340e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f58341f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f58342g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f58343h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f58344i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f58345j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(h00.p<? super c1.i, ? super Integer, vz.b0> pVar, h00.q<? super o1.f, ? super c1.i, ? super Integer, vz.b0> qVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar2, h00.p<? super c1.i, ? super Integer, vz.b0> pVar3, boolean z11, long j11, long j12, float f11, int i11, int i12) {
            super(3);
            this.f58336a = pVar;
            this.f58337b = qVar;
            this.f58338c = pVar2;
            this.f58339d = pVar3;
            this.f58340e = z11;
            this.f58341f = j11;
            this.f58342g = j12;
            this.f58343h = f11;
            this.f58344i = i11;
            this.f58345j = i12;
        }

        public final void a(h00.p<? super c1.i, ? super Integer, vz.b0> coreTextField, c1.i iVar, int i11) {
            int i12;
            kotlin.jvm.internal.s.g(coreTextField, "coreTextField");
            if ((i11 & 14) == 0) {
                i12 = i11 | (iVar.O(coreTextField) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if (((i12 & 91) ^ 18) == 0 && iVar.i()) {
                iVar.G();
                return;
            }
            h00.p<c1.i, Integer, vz.b0> pVar = this.f58336a;
            h00.q<o1.f, c1.i, Integer, vz.b0> qVar = this.f58337b;
            h00.p<c1.i, Integer, vz.b0> pVar2 = this.f58338c;
            h00.p<c1.i, Integer, vz.b0> pVar3 = this.f58339d;
            boolean z11 = this.f58340e;
            long j11 = this.f58341f;
            long j12 = this.f58342g;
            float f11 = this.f58343h;
            int i13 = this.f58344i;
            k1.a(coreTextField, pVar, qVar, pVar2, pVar3, z11, j11, j12, f11, iVar, (i13 & 234881024) | (i12 & 14) | ((i13 >> 6) & 112) | (i13 & 896) | ((i13 >> 3) & 7168) | ((i13 >> 3) & 57344) | ((this.f58345j >> 9) & 458752) | (3670016 & i13) | (29360128 & i13));
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(h00.p<? super c1.i, ? super Integer, ? extends vz.b0> pVar, c1.i iVar, Integer num) {
            a(pVar, iVar, num.intValue());
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {
        final /* synthetic */ long A;
        final /* synthetic */ t1.c1 B;
        final /* synthetic */ int C;
        final /* synthetic */ int E;
        final /* synthetic */ int F;
        final /* synthetic */ int G;

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1.f f58346a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s2.a0 f58347b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.l<s2.a0, vz.b0> f58348c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f58349d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f58350e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ w0.v f58351f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ w0.u f58352g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ n2.a0 f58353h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f58354i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f58355j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ s2.k0 f58356k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ o0.m f58357l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ h00.q<o1.f, c1.i, Integer, vz.b0> f58358m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58359n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58360o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58361p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ long f58362q;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ long f58363t;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ float f58364w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ float f58365x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ long f58366y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ long f58367z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(o1.f fVar, s2.a0 a0Var, h00.l<? super s2.a0, vz.b0> lVar, boolean z11, boolean z12, w0.v vVar, w0.u uVar, n2.a0 a0Var2, boolean z13, int i11, s2.k0 k0Var, o0.m mVar, h00.q<? super o1.f, ? super c1.i, ? super Integer, vz.b0> qVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar2, h00.p<? super c1.i, ? super Integer, vz.b0> pVar3, long j11, long j12, float f11, float f12, long j13, long j14, long j15, t1.c1 c1Var, int i12, int i13, int i14, int i15) {
            super(2);
            this.f58346a = fVar;
            this.f58347b = a0Var;
            this.f58348c = lVar;
            this.f58349d = z11;
            this.f58350e = z12;
            this.f58351f = vVar;
            this.f58352g = uVar;
            this.f58353h = a0Var2;
            this.f58354i = z13;
            this.f58355j = i11;
            this.f58356k = k0Var;
            this.f58357l = mVar;
            this.f58358m = qVar;
            this.f58359n = pVar;
            this.f58360o = pVar2;
            this.f58361p = pVar3;
            this.f58362q = j11;
            this.f58363t = j12;
            this.f58364w = f11;
            this.f58365x = f12;
            this.f58366y = j13;
            this.f58367z = j14;
            this.A = j15;
            this.B = c1Var;
            this.C = i12;
            this.E = i13;
            this.F = i14;
            this.G = i15;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            k1.f(this.f58346a, this.f58347b, this.f58348c, this.f58349d, this.f58350e, this.f58351f, this.f58352g, this.f58353h, this.f58354i, this.f58355j, this.f58356k, this.f58357l, this.f58358m, this.f58359n, this.f58360o, this.f58361p, this.f58362q, this.f58363t, this.f58364w, this.f58365x, this.f58366y, this.f58367z, this.A, this.B, iVar, this.C | 1, this.E, this.F, this.G);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.l<v1.e, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f58368a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f58369b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(float f11, long j11) {
            super(1);
            this.f58368a = f11;
            this.f58369b = j11;
        }

        public final void a(v1.e drawBehind) {
            kotlin.jvm.internal.s.g(drawBehind, "$this$drawBehind");
            float density = this.f58368a * drawBehind.getDensity();
            float g11 = s1.l.g(drawBehind.c()) - (density / 2);
            e.b.f(drawBehind, this.f58369b, s1.g.a(BitmapDescriptorFactory.HUE_RED, g11), s1.g.a(s1.l.i(drawBehind.c()), g11), density, 0, null, BitmapDescriptorFactory.HUE_RED, null, 0, DownloaderService.STATUS_HTTP_EXCEPTION, null);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(v1.e eVar) {
            a(eVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(h00.p<? super c1.i, ? super Integer, vz.b0> pVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar2, h00.q<? super o1.f, ? super c1.i, ? super Integer, vz.b0> qVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar3, h00.p<? super c1.i, ? super Integer, vz.b0> pVar4, boolean z11, long j11, long j12, float f11, c1.i iVar, int i11) {
        int i12;
        f.a aVar;
        int i13;
        c1.i iVar2;
        c1.i iVar3;
        int i14;
        c1.i h11 = iVar.h(178502533);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(pVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.O(pVar2) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h11.O(qVar) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= h11.O(pVar3) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= h11.O(pVar4) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((458752 & i11) == 0) {
            i12 |= h11.a(z11) ? 131072 : 65536;
        }
        if ((3670016 & i11) == 0) {
            i12 |= h11.e(j11) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((29360128 & i11) == 0) {
            i12 |= h11.e(j12) ? 8388608 : 4194304;
        }
        if ((234881024 & i11) == 0) {
            i12 |= h11.b(f11) ? 67108864 : 33554432;
        }
        int i15 = i12;
        if (((191739611 & i15) ^ 38347922) == 0 && h11.i()) {
            h11.G();
            iVar3 = h11;
        } else {
            Boolean valueOf = Boolean.valueOf(z11);
            Float valueOf2 = Float.valueOf(f11);
            int i16 = i15 >> 21;
            h11.x(-3686552);
            boolean O = h11.O(valueOf) | h11.O(valueOf2);
            Object y11 = h11.y();
            if (O || y11 == c1.i.f8486a.a()) {
                y11 = new l1(z11, f11);
                h11.p(y11);
            }
            h11.N();
            l1 l1Var = (l1) y11;
            h11.x(1376089394);
            f.a aVar2 = o1.f.f42062f1;
            x2.d dVar = (x2.d) h11.A(androidx.compose.ui.platform.l0.d());
            x2.q qVar2 = (x2.q) h11.A(androidx.compose.ui.platform.l0.i());
            y1 y1Var = (y1) h11.A(androidx.compose.ui.platform.l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a11 = c0551a.a();
            h00.q<c1.g1<h2.a>, c1.i, Integer, vz.b0> b11 = f2.u.b(aVar2);
            if (!(h11.k() instanceof c1.e)) {
                c1.h.c();
            }
            h11.D();
            if (h11.f()) {
                h11.s(a11);
            } else {
                h11.o();
            }
            h11.E();
            c1.i a12 = a2.a(h11);
            a2.c(a12, l1Var, c0551a.d());
            a2.c(a12, dVar, c0551a.b());
            a2.c(a12, qVar2, c0551a.c());
            a2.c(a12, y1Var, c0551a.f());
            h11.c();
            b11.invoke(c1.g1.a(c1.g1.b(h11)), h11, 0);
            h11.x(2058660585);
            h11.x(-804089035);
            h11.x(-804089035);
            if (pVar3 != null) {
                o1.f g02 = f2.r.b(aVar2, "Leading").g0(j1.f());
                o1.a d11 = o1.a.f42039a.d();
                h11.x(-1990474327);
                f2.z i17 = p0.c.i(d11, false, h11, 6);
                h11.x(1376089394);
                x2.d dVar2 = (x2.d) h11.A(androidx.compose.ui.platform.l0.d());
                x2.q qVar3 = (x2.q) h11.A(androidx.compose.ui.platform.l0.i());
                y1 y1Var2 = (y1) h11.A(androidx.compose.ui.platform.l0.m());
                h00.a<h2.a> a13 = c0551a.a();
                h00.q<c1.g1<h2.a>, c1.i, Integer, vz.b0> b12 = f2.u.b(g02);
                if (!(h11.k() instanceof c1.e)) {
                    c1.h.c();
                }
                h11.D();
                if (h11.f()) {
                    h11.s(a13);
                } else {
                    h11.o();
                }
                h11.E();
                c1.i a14 = a2.a(h11);
                a2.c(a14, i17, c0551a.d());
                a2.c(a14, dVar2, c0551a.b());
                a2.c(a14, qVar3, c0551a.c());
                a2.c(a14, y1Var2, c0551a.f());
                h11.c();
                b12.invoke(c1.g1.a(c1.g1.b(h11)), h11, 0);
                h11.x(2058660585);
                h11.x(-1253629305);
                p0.d dVar3 = p0.d.f45270a;
                h11.x(-447676355);
                i13 = i15;
                aVar = aVar2;
                iVar2 = h11;
                j1.a(j11, null, null, pVar3, h11, ((i15 >> 18) & 14) | (i15 & 7168), 6);
                iVar2.N();
                iVar2.N();
                iVar2.N();
                iVar2.q();
                iVar2.N();
                iVar2.N();
            } else {
                aVar = aVar2;
                i13 = i15;
                iVar2 = h11;
            }
            iVar2.N();
            iVar3 = iVar2;
            iVar3.x(-804088631);
            if (pVar4 != null) {
                o1.f g03 = f2.r.b(aVar, "Trailing").g0(j1.f());
                o1.a d12 = o1.a.f42039a.d();
                iVar3.x(-1990474327);
                f2.z i18 = p0.c.i(d12, false, iVar3, 6);
                iVar3.x(1376089394);
                x2.d dVar4 = (x2.d) iVar3.A(androidx.compose.ui.platform.l0.d());
                x2.q qVar4 = (x2.q) iVar3.A(androidx.compose.ui.platform.l0.i());
                y1 y1Var3 = (y1) iVar3.A(androidx.compose.ui.platform.l0.m());
                h00.a<h2.a> a15 = c0551a.a();
                h00.q<c1.g1<h2.a>, c1.i, Integer, vz.b0> b13 = f2.u.b(g03);
                if (!(iVar3.k() instanceof c1.e)) {
                    c1.h.c();
                }
                iVar3.D();
                if (iVar3.f()) {
                    iVar3.s(a15);
                } else {
                    iVar3.o();
                }
                iVar3.E();
                c1.i a16 = a2.a(iVar3);
                a2.c(a16, i18, c0551a.d());
                a2.c(a16, dVar4, c0551a.b());
                a2.c(a16, qVar4, c0551a.c());
                a2.c(a16, y1Var3, c0551a.f());
                iVar3.c();
                b13.invoke(c1.g1.a(c1.g1.b(iVar3)), iVar3, 0);
                iVar3.x(2058660585);
                iVar3.x(-1253629305);
                p0.d dVar5 = p0.d.f45270a;
                iVar3.x(-447675949);
                i14 = -1253629305;
                j1.a(j12, null, null, pVar4, iVar3, (i16 & 14) | ((i13 >> 3) & 7168), 6);
                iVar3.N();
                iVar3.N();
                iVar3.N();
                iVar3.q();
                iVar3.N();
                iVar3.N();
            } else {
                i14 = -1253629305;
            }
            iVar3.N();
            float f12 = x2.g.f(j1.h() - j1.e());
            float h12 = pVar3 != null ? f12 : j1.h();
            if (pVar4 == null) {
                f12 = j1.h();
            }
            o1.f l11 = p0.u.l(aVar, h12, BitmapDescriptorFactory.HUE_RED, f12, BitmapDescriptorFactory.HUE_RED, 10, null);
            iVar3.x(-804087929);
            if (qVar != null) {
                qVar.invoke(f2.r.b(aVar, "Hint").g0(l11), iVar3, Integer.valueOf((i13 >> 3) & 112));
            }
            iVar3.N();
            iVar3.x(-804087800);
            if (pVar2 != null) {
                o1.f g04 = f2.r.b(aVar, "Label").g0(l11);
                iVar3.x(-1990474327);
                f2.z i19 = p0.c.i(o1.a.f42039a.k(), false, iVar3, 0);
                iVar3.x(1376089394);
                x2.d dVar6 = (x2.d) iVar3.A(androidx.compose.ui.platform.l0.d());
                x2.q qVar5 = (x2.q) iVar3.A(androidx.compose.ui.platform.l0.i());
                y1 y1Var4 = (y1) iVar3.A(androidx.compose.ui.platform.l0.m());
                h00.a<h2.a> a17 = c0551a.a();
                h00.q<c1.g1<h2.a>, c1.i, Integer, vz.b0> b14 = f2.u.b(g04);
                if (!(iVar3.k() instanceof c1.e)) {
                    c1.h.c();
                }
                iVar3.D();
                if (iVar3.f()) {
                    iVar3.s(a17);
                } else {
                    iVar3.o();
                }
                iVar3.E();
                c1.i a18 = a2.a(iVar3);
                a2.c(a18, i19, c0551a.d());
                a2.c(a18, dVar6, c0551a.b());
                a2.c(a18, qVar5, c0551a.c());
                a2.c(a18, y1Var4, c0551a.f());
                iVar3.c();
                b14.invoke(c1.g1.a(c1.g1.b(iVar3)), iVar3, 0);
                iVar3.x(2058660585);
                iVar3.x(i14);
                p0.d dVar7 = p0.d.f45270a;
                iVar3.x(-447675266);
                pVar2.mo160invoke(iVar3, Integer.valueOf((i13 >> 3) & 14));
                iVar3.N();
                iVar3.N();
                iVar3.N();
                iVar3.q();
                iVar3.N();
                iVar3.N();
            }
            iVar3.N();
            o1.f g05 = f2.r.b(aVar, "TextField").g0(l11);
            iVar3.x(-1990474327);
            f2.z i21 = p0.c.i(o1.a.f42039a.k(), true, iVar3, 48);
            iVar3.x(1376089394);
            x2.d dVar8 = (x2.d) iVar3.A(androidx.compose.ui.platform.l0.d());
            x2.q qVar6 = (x2.q) iVar3.A(androidx.compose.ui.platform.l0.i());
            y1 y1Var5 = (y1) iVar3.A(androidx.compose.ui.platform.l0.m());
            h00.a<h2.a> a19 = c0551a.a();
            h00.q<c1.g1<h2.a>, c1.i, Integer, vz.b0> b15 = f2.u.b(g05);
            if (!(iVar3.k() instanceof c1.e)) {
                c1.h.c();
            }
            iVar3.D();
            if (iVar3.f()) {
                iVar3.s(a19);
            } else {
                iVar3.o();
            }
            iVar3.E();
            c1.i a21 = a2.a(iVar3);
            a2.c(a21, i21, c0551a.d());
            a2.c(a21, dVar8, c0551a.b());
            a2.c(a21, qVar6, c0551a.c());
            a2.c(a21, y1Var5, c0551a.f());
            iVar3.c();
            b15.invoke(c1.g1.a(c1.g1.b(iVar3)), iVar3, 0);
            iVar3.x(2058660585);
            iVar3.x(i14);
            p0.d dVar9 = p0.d.f45270a;
            iVar3.x(-447675072);
            pVar.mo160invoke(iVar3, Integer.valueOf(i13 & 14));
            iVar3.N();
            iVar3.N();
            iVar3.N();
            iVar3.q();
            iVar3.N();
            iVar3.N();
            iVar3.N();
            iVar3.N();
            iVar3.q();
            iVar3.N();
        }
        c1.e1 l12 = iVar3.l();
        if (l12 == null) {
            return;
        }
        l12.a(new a(pVar, pVar2, qVar, pVar3, pVar4, z11, j11, j12, f11, i11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x01ac, code lost:
        if (r0.O(r86) == false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:302:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r73, h00.l<? super java.lang.String, vz.b0> r74, o1.f r75, boolean r76, boolean r77, n2.a0 r78, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r79, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r80, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r81, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r82, boolean r83, s2.k0 r84, w0.v r85, w0.u r86, boolean r87, int r88, o0.m r89, t1.c1 r90, y0.g1 r91, c1.i r92, int r93, int r94, int r95) {
        /*
            Method dump skipped, instructions count: 1428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.k1.b(java.lang.String, h00.l, o1.f, boolean, boolean, n2.a0, h00.p, h00.p, h00.p, h00.p, boolean, s2.k0, w0.v, w0.u, boolean, int, o0.m, t1.c1, y0.g1, c1.i, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x01ac, code lost:
        if (r10.O(r87) == false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(s2.a0 r74, h00.l<? super s2.a0, vz.b0> r75, o1.f r76, boolean r77, boolean r78, n2.a0 r79, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r80, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r81, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r82, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r83, boolean r84, s2.k0 r85, w0.v r86, w0.u r87, boolean r88, int r89, o0.m r90, t1.c1 r91, y0.g1 r92, c1.i r93, int r94, int r95, int r96) {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.k1.c(s2.a0, h00.l, o1.f, boolean, boolean, n2.a0, h00.p, h00.p, h00.p, h00.p, boolean, s2.k0, w0.v, w0.u, boolean, int, o0.m, t1.c1, y0.g1, c1.i, int, int, int):void");
    }

    private static final s2.a0 d(c1.o0<s2.a0> o0Var) {
        return o0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(c1.o0<s2.a0> o0Var, s2.a0 a0Var) {
        o0Var.setValue(a0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(o1.f r45, s2.a0 r46, h00.l<? super s2.a0, vz.b0> r47, boolean r48, boolean r49, w0.v r50, w0.u r51, n2.a0 r52, boolean r53, int r54, s2.k0 r55, o0.m r56, h00.q<? super o1.f, ? super c1.i, ? super java.lang.Integer, vz.b0> r57, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r58, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r59, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r60, long r61, long r63, float r65, float r66, long r67, long r69, long r71, t1.c1 r73, c1.i r74, int r75, int r76, int r77, int r78) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.k1.f(o1.f, s2.a0, h00.l, boolean, boolean, w0.v, w0.u, n2.a0, boolean, int, s2.k0, o0.m, h00.q, h00.p, h00.p, h00.p, long, long, float, float, long, long, long, t1.c1, c1.i, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(int i11, boolean z11, int i12, int i13, int i14, int i15, long j11, float f11) {
        int c11;
        float f12 = f58277b * f11;
        float f13 = f58278c * f11;
        float h11 = j1.h() * f11;
        int max = Math.max(i11, i15);
        c11 = j00.c.c(z11 ? i12 + f13 + max + f12 : (h11 * 2) + max);
        return Math.max(c11, Math.max(Math.max(i13, i14), x2.b.o(j11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(int i11, int i12, int i13, int i14, int i15, long j11) {
        return Math.max(i11 + Math.max(i13, Math.max(i14, i15)) + i12, x2.b.p(j11));
    }

    public static final o1.f r(o1.f drawIndicatorLine, float f11, long j11) {
        kotlin.jvm.internal.s.g(drawIndicatorLine, "$this$drawIndicatorLine");
        return q1.i.a(drawIndicatorLine, new g(f11, j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(m0.a aVar, int i11, int i12, f2.m0 m0Var, f2.m0 m0Var2, f2.m0 m0Var3, f2.m0 m0Var4, f2.m0 m0Var5, boolean z11, int i13, int i14, float f11, float f12) {
        int c11;
        int c12;
        c11 = j00.c.c(j1.h() * f12);
        if (m0Var4 != null) {
            m0.a.n(aVar, m0Var4, 0, o1.a.f42039a.g().a(m0Var4.w0(), i12), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (m0Var5 != null) {
            m0.a.n(aVar, m0Var5, i11 - m0Var5.B0(), o1.a.f42039a.g().a(m0Var5.w0(), i12), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (m0Var2 != null) {
            if (z11) {
                c11 = o1.a.f42039a.g().a(m0Var2.w0(), i12);
            }
            c12 = j00.c.c((c11 - i13) * f11);
            m0.a.n(aVar, m0Var2, j1.k(m0Var4), c11 - c12, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        m0.a.n(aVar, m0Var, j1.k(m0Var4), i14, BitmapDescriptorFactory.HUE_RED, 4, null);
        if (m0Var3 == null) {
            return;
        }
        m0.a.n(aVar, m0Var3, j1.k(m0Var4), i14, BitmapDescriptorFactory.HUE_RED, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(m0.a aVar, int i11, int i12, f2.m0 m0Var, f2.m0 m0Var2, f2.m0 m0Var3, f2.m0 m0Var4, boolean z11, float f11) {
        int c11;
        c11 = j00.c.c(j1.h() * f11);
        if (m0Var3 != null) {
            m0.a.n(aVar, m0Var3, 0, o1.a.f42039a.g().a(m0Var3.w0(), i12), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (m0Var4 != null) {
            m0.a.n(aVar, m0Var4, i11 - m0Var4.B0(), o1.a.f42039a.g().a(m0Var4.w0(), i12), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        m0.a.n(aVar, m0Var, j1.k(m0Var3), z11 ? o1.a.f42039a.g().a(m0Var.w0(), i12) : c11, BitmapDescriptorFactory.HUE_RED, 4, null);
        if (m0Var2 == null) {
            return;
        }
        if (z11) {
            c11 = o1.a.f42039a.g().a(m0Var2.w0(), i12);
        }
        m0.a.n(aVar, m0Var2, j1.k(m0Var3), c11, BitmapDescriptorFactory.HUE_RED, 4, null);
    }
}