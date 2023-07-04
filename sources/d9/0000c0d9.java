package y0;

import androidx.compose.ui.platform.y1;
import c1.a2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.m0;
import h2.a;
import kotlin.NoWhenBranchMatchedException;
import o1.a;
import o1.f;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f58517a = x2.g.f(4);

    /* renamed from: b  reason: collision with root package name */
    private static final float f58518b = x2.g.f(8);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58519a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.q<o1.f, c1.i, Integer, vz.b0> f58520b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58521c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58522d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58523e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f58524f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f58525g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f58526h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ float f58527i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ h00.l<s1.l, vz.b0> f58528j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ t1.c1 f58529k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ float f58530l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f58531m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ long f58532n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f58533o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f58534p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h00.p<? super c1.i, ? super Integer, vz.b0> pVar, h00.q<? super o1.f, ? super c1.i, ? super Integer, vz.b0> qVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar2, h00.p<? super c1.i, ? super Integer, vz.b0> pVar3, h00.p<? super c1.i, ? super Integer, vz.b0> pVar4, boolean z11, long j11, long j12, float f11, h00.l<? super s1.l, vz.b0> lVar, t1.c1 c1Var, float f12, long j13, long j14, int i11, int i12) {
            super(2);
            this.f58519a = pVar;
            this.f58520b = qVar;
            this.f58521c = pVar2;
            this.f58522d = pVar3;
            this.f58523e = pVar4;
            this.f58524f = z11;
            this.f58525g = j11;
            this.f58526h = j12;
            this.f58527i = f11;
            this.f58528j = lVar;
            this.f58529k = c1Var;
            this.f58530l = f12;
            this.f58531m = j13;
            this.f58532n = j14;
            this.f58533o = i11;
            this.f58534p = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            p0.a(this.f58519a, this.f58520b, this.f58521c, this.f58522d, this.f58523e, this.f58524f, this.f58525g, this.f58526h, this.f58527i, this.f58528j, this.f58529k, this.f58530l, this.f58531m, this.f58532n, iVar, this.f58533o | 1, this.f58534p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.q<h00.p<? super c1.i, ? super Integer, ? extends vz.b0>, c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c1.o0<s1.l> f58535a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.q<o1.f, c1.i, Integer, vz.b0> f58536b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58537c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58538d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58539e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f58540f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f58541g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f58542h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ float f58543i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f58544j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ t1.c1 f58545k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ float f58546l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f58547m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f58548n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f58549o;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<s1.l, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ float f58550a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c1.o0<s1.l> f58551b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(float f11, c1.o0<s1.l> o0Var) {
                super(1);
                this.f58550a = f11;
                this.f58551b = o0Var;
            }

            public final void a(long j11) {
                float i11 = s1.l.i(j11) * this.f58550a;
                float g11 = s1.l.g(j11) * this.f58550a;
                if (s1.l.i(this.f58551b.getValue().l()) == i11) {
                    if (s1.l.g(this.f58551b.getValue().l()) == g11) {
                        return;
                    }
                }
                this.f58551b.setValue(s1.l.c(s1.m.a(i11, g11)));
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo12invoke(s1.l lVar) {
                a(lVar.l());
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(c1.o0<s1.l> o0Var, h00.q<? super o1.f, ? super c1.i, ? super Integer, vz.b0> qVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar2, h00.p<? super c1.i, ? super Integer, vz.b0> pVar3, boolean z11, long j11, long j12, float f11, int i11, t1.c1 c1Var, float f12, long j13, int i12, int i13) {
            super(3);
            this.f58535a = o0Var;
            this.f58536b = qVar;
            this.f58537c = pVar;
            this.f58538d = pVar2;
            this.f58539e = pVar3;
            this.f58540f = z11;
            this.f58541g = j11;
            this.f58542h = j12;
            this.f58543i = f11;
            this.f58544j = i11;
            this.f58545k = c1Var;
            this.f58546l = f12;
            this.f58547m = j13;
            this.f58548n = i12;
            this.f58549o = i13;
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
            long l11 = this.f58535a.getValue().l();
            h00.q<o1.f, c1.i, Integer, vz.b0> qVar = this.f58536b;
            h00.p<c1.i, Integer, vz.b0> pVar = this.f58537c;
            h00.p<c1.i, Integer, vz.b0> pVar2 = this.f58538d;
            h00.p<c1.i, Integer, vz.b0> pVar3 = this.f58539e;
            boolean z11 = this.f58540f;
            long j11 = this.f58541g;
            long j12 = this.f58542h;
            float f11 = this.f58543i;
            Object valueOf = Float.valueOf(f11);
            c1.o0<s1.l> o0Var = this.f58535a;
            float f12 = this.f58543i;
            iVar.x(-3686552);
            boolean O = iVar.O(valueOf) | iVar.O(o0Var);
            Object y11 = iVar.y();
            if (O || y11 == c1.i.f8486a.a()) {
                y11 = new a(f12, o0Var);
                iVar.p(y11);
            }
            iVar.N();
            t1.c1 c1Var = this.f58545k;
            float f13 = this.f58546l;
            long j13 = this.f58547m;
            int i13 = i12 & 14;
            int i14 = this.f58544j;
            int i15 = i13 | ((i14 >> 3) & 112) | ((i14 >> 3) & 896) | ((i14 >> 3) & 7168) | (57344 & (i14 >> 3)) | (458752 & (this.f58548n >> 9)) | (3670016 & i14) | (29360128 & i14) | (234881024 & i14);
            int i16 = this.f58549o;
            p0.a(coreTextField, qVar, pVar, pVar2, pVar3, z11, j11, j12, f11, (h00.l) y11, c1Var, f13, j13, l11, iVar, i15, ((i14 >> 24) & 112) | ((i16 >> 9) & 14) | ((i16 << 6) & 896));
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(h00.p<? super c1.i, ? super Integer, ? extends vz.b0> pVar, c1.i iVar, Integer num) {
            a(pVar, iVar, num.intValue());
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {
        final /* synthetic */ long A;
        final /* synthetic */ t1.c1 B;
        final /* synthetic */ int C;
        final /* synthetic */ int E;
        final /* synthetic */ int F;
        final /* synthetic */ int G;

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1.f f58552a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s2.a0 f58553b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.l<s2.a0, vz.b0> f58554c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f58555d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f58556e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ w0.v f58557f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ w0.u f58558g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ n2.a0 f58559h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f58560i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f58561j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ s2.k0 f58562k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ o0.m f58563l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ h00.q<o1.f, c1.i, Integer, vz.b0> f58564m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58565n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58566o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58567p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ long f58568q;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ long f58569t;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ float f58570w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ float f58571x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ long f58572y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ long f58573z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(o1.f fVar, s2.a0 a0Var, h00.l<? super s2.a0, vz.b0> lVar, boolean z11, boolean z12, w0.v vVar, w0.u uVar, n2.a0 a0Var2, boolean z13, int i11, s2.k0 k0Var, o0.m mVar, h00.q<? super o1.f, ? super c1.i, ? super Integer, vz.b0> qVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar2, h00.p<? super c1.i, ? super Integer, vz.b0> pVar3, long j11, long j12, float f11, float f12, long j13, long j14, long j15, t1.c1 c1Var, int i12, int i13, int i14, int i15) {
            super(2);
            this.f58552a = fVar;
            this.f58553b = a0Var;
            this.f58554c = lVar;
            this.f58555d = z11;
            this.f58556e = z12;
            this.f58557f = vVar;
            this.f58558g = uVar;
            this.f58559h = a0Var2;
            this.f58560i = z13;
            this.f58561j = i11;
            this.f58562k = k0Var;
            this.f58563l = mVar;
            this.f58564m = qVar;
            this.f58565n = pVar;
            this.f58566o = pVar2;
            this.f58567p = pVar3;
            this.f58568q = j11;
            this.f58569t = j12;
            this.f58570w = f11;
            this.f58571x = f12;
            this.f58572y = j13;
            this.f58573z = j14;
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
            p0.b(this.f58552a, this.f58553b, this.f58554c, this.f58555d, this.f58556e, this.f58557f, this.f58558g, this.f58559h, this.f58560i, this.f58561j, this.f58562k, this.f58563l, this.f58564m, this.f58565n, this.f58566o, this.f58567p, this.f58568q, this.f58569t, this.f58570w, this.f58571x, this.f58572y, this.f58573z, this.A, this.B, iVar, this.C | 1, this.E, this.F, this.G);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.l<v1.c, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f58574a;

        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f58575a;

            static {
                int[] iArr = new int[x2.q.values().length];
                iArr[x2.q.Ltr.ordinal()] = 1;
                iArr[x2.q.Rtl.ordinal()] = 2;
                f58575a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j11) {
            super(1);
            this.f58574a = j11;
        }

        public final void a(v1.c drawWithContent) {
            float f11;
            kotlin.jvm.internal.s.g(drawWithContent, "$this$drawWithContent");
            float i11 = s1.l.i(this.f58574a);
            if (i11 > BitmapDescriptorFactory.HUE_RED) {
                float i02 = drawWithContent.i0(p0.f58517a);
                float i03 = drawWithContent.i0(j1.h()) - i02;
                float f12 = 2;
                float f13 = i11 + i03 + (i02 * f12);
                x2.q layoutDirection = drawWithContent.getLayoutDirection();
                int[] iArr = a.f58575a;
                int i12 = iArr[layoutDirection.ordinal()];
                if (i12 == 1) {
                    f11 = i03;
                } else if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    f11 = s1.l.i(drawWithContent.c()) - f13;
                }
                int i13 = iArr[drawWithContent.getLayoutDirection().ordinal()];
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f13 = s1.l.i(drawWithContent.c()) - i03;
                }
                float f14 = f13;
                float g11 = s1.l.g(this.f58574a);
                int a11 = t1.z.f51535a.a();
                v1.d j02 = drawWithContent.j0();
                long c11 = j02.c();
                j02.b().m();
                j02.a().a(f11, (-g11) / f12, f14, g11 / f12, a11);
                drawWithContent.s0();
                j02.b().h();
                j02.d(c11);
                return;
            }
            drawWithContent.s0();
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(v1.c cVar) {
            a(cVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(h00.p<? super c1.i, ? super Integer, vz.b0> pVar, h00.q<? super o1.f, ? super c1.i, ? super Integer, vz.b0> qVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar2, h00.p<? super c1.i, ? super Integer, vz.b0> pVar3, h00.p<? super c1.i, ? super Integer, vz.b0> pVar4, boolean z11, long j11, long j12, float f11, h00.l<? super s1.l, vz.b0> lVar, t1.c1 c1Var, float f12, long j13, long j14, c1.i iVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        f.a aVar;
        c1.i iVar2;
        int i16;
        c1.i iVar3;
        int i17;
        c1.i iVar4;
        c1.i h11 = iVar.h(178502739);
        if ((i11 & 14) == 0) {
            i13 = (h11.O(pVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 112) == 0) {
            i13 |= h11.O(qVar) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i13 |= h11.O(pVar2) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i13 |= h11.O(pVar3) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i13 |= h11.O(pVar4) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((458752 & i11) == 0) {
            i13 |= h11.a(z11) ? 131072 : 65536;
        }
        if ((3670016 & i11) == 0) {
            i13 |= h11.e(j11) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i11 & 29360128) == 0) {
            i13 |= h11.e(j12) ? 8388608 : 4194304;
        }
        if ((i11 & 234881024) == 0) {
            i13 |= h11.b(f11) ? 67108864 : 33554432;
        }
        if ((i11 & 1879048192) == 0) {
            i13 |= h11.O(lVar) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i12 & 14) == 0) {
            i14 = (h11.O(c1Var) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 112) == 0) {
            i14 |= h11.b(f12) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i14 |= h11.e(j13) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i14 |= h11.e(j14) ? 2048 : 1024;
        }
        if (((1533916891 & i13) ^ 306783378) == 0 && ((i14 & 5851) ^ 1170) == 0 && h11.i()) {
            h11.G();
            iVar4 = h11;
        } else {
            Boolean valueOf = Boolean.valueOf(z11);
            Float valueOf2 = Float.valueOf(f11);
            int i18 = i13 >> 18;
            h11.x(-3686095);
            boolean O = h11.O(valueOf) | h11.O(lVar) | h11.O(valueOf2);
            Object y11 = h11.y();
            if (O || y11 == c1.i.f8486a.a()) {
                y11 = new q0(lVar, z11, f11);
                h11.p(y11);
            }
            h11.N();
            q0 q0Var = (q0) y11;
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
            a2.c(a12, q0Var, c0551a.d());
            a2.c(a12, dVar, c0551a.b());
            a2.c(a12, qVar2, c0551a.c());
            a2.c(a12, y1Var, c0551a.f());
            h11.c();
            b11.invoke(c1.g1.a(c1.g1.b(h11)), h11, 0);
            h11.x(2058660585);
            h11.x(-804088231);
            p0.c.a(k(f2.r.b(aVar2, "border"), c1Var, f12, j13, j14), h11, 0);
            h11.x(-804088054);
            if (pVar3 != null) {
                o1.f g02 = f2.r.b(aVar2, "Leading").g0(j1.f());
                o1.a d11 = o1.a.f42039a.d();
                h11.x(-1990474327);
                f2.z i19 = p0.c.i(d11, false, h11, 6);
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
                a2.c(a14, i19, c0551a.d());
                a2.c(a14, dVar2, c0551a.b());
                a2.c(a14, qVar3, c0551a.c());
                a2.c(a14, y1Var2, c0551a.f());
                h11.c();
                b12.invoke(c1.g1.a(c1.g1.b(h11)), h11, 0);
                h11.x(2058660585);
                h11.x(-1253629305);
                p0.d dVar3 = p0.d.f45270a;
                h11.x(-447675374);
                i15 = i13;
                aVar = aVar2;
                iVar2 = h11;
                i16 = 6;
                j1.a(j11, null, null, pVar3, h11, (i13 & 7168) | (i18 & 14), 6);
                iVar2.N();
                iVar2.N();
                iVar2.N();
                iVar2.q();
                iVar2.N();
                iVar2.N();
            } else {
                i15 = i13;
                aVar = aVar2;
                iVar2 = h11;
                i16 = 6;
            }
            iVar2.N();
            c1.i iVar5 = iVar2;
            iVar5.x(-804087650);
            if (pVar4 != null) {
                o1.f g03 = f2.r.b(aVar, "Trailing").g0(j1.f());
                o1.a d12 = o1.a.f42039a.d();
                iVar5.x(-1990474327);
                f2.z i21 = p0.c.i(d12, false, iVar5, i16);
                iVar5.x(1376089394);
                x2.d dVar4 = (x2.d) iVar5.A(androidx.compose.ui.platform.l0.d());
                x2.q qVar4 = (x2.q) iVar5.A(androidx.compose.ui.platform.l0.i());
                y1 y1Var3 = (y1) iVar5.A(androidx.compose.ui.platform.l0.m());
                h00.a<h2.a> a15 = c0551a.a();
                h00.q<c1.g1<h2.a>, c1.i, Integer, vz.b0> b13 = f2.u.b(g03);
                if (!(iVar5.k() instanceof c1.e)) {
                    c1.h.c();
                }
                iVar5.D();
                if (iVar5.f()) {
                    iVar5.s(a15);
                } else {
                    iVar5.o();
                }
                iVar5.E();
                c1.i a16 = a2.a(iVar5);
                a2.c(a16, i21, c0551a.d());
                a2.c(a16, dVar4, c0551a.b());
                a2.c(a16, qVar4, c0551a.c());
                a2.c(a16, y1Var3, c0551a.f());
                iVar5.c();
                b13.invoke(c1.g1.a(c1.g1.b(iVar5)), iVar5, 0);
                iVar5.x(2058660585);
                iVar5.x(-1253629305);
                p0.d dVar5 = p0.d.f45270a;
                iVar5.x(-447674968);
                i17 = -1990474327;
                iVar3 = iVar5;
                j1.a(j12, null, null, pVar4, iVar5, ((i15 >> 21) & 14) | ((i15 >> 3) & 7168), 6);
                iVar3.N();
                iVar3.N();
                iVar3.N();
                iVar3.q();
                iVar3.N();
                iVar3.N();
            } else {
                iVar3 = iVar5;
                i17 = -1990474327;
            }
            iVar3.N();
            float f13 = x2.g.f(j1.h() - j1.e());
            float h12 = pVar3 != null ? f13 : j1.h();
            if (pVar4 == null) {
                f13 = j1.h();
            }
            o1.f l11 = p0.u.l(aVar, h12, BitmapDescriptorFactory.HUE_RED, f13, BitmapDescriptorFactory.HUE_RED, 10, null);
            iVar4 = iVar3;
            iVar4.x(-804086949);
            if (qVar != null) {
                qVar.invoke(f2.r.b(aVar, "Hint").g0(l11), iVar4, Integer.valueOf(i15 & 112));
            }
            iVar4.N();
            o1.f g04 = f2.r.b(aVar, "TextField").g0(l11);
            iVar4.x(i17);
            a.C0826a c0826a = o1.a.f42039a;
            f2.z i22 = p0.c.i(c0826a.k(), true, iVar4, 48);
            iVar4.x(1376089394);
            x2.d dVar6 = (x2.d) iVar4.A(androidx.compose.ui.platform.l0.d());
            x2.q qVar5 = (x2.q) iVar4.A(androidx.compose.ui.platform.l0.i());
            y1 y1Var4 = (y1) iVar4.A(androidx.compose.ui.platform.l0.m());
            h00.a<h2.a> a17 = c0551a.a();
            h00.q<c1.g1<h2.a>, c1.i, Integer, vz.b0> b14 = f2.u.b(g04);
            if (!(iVar4.k() instanceof c1.e)) {
                c1.h.c();
            }
            iVar4.D();
            if (iVar4.f()) {
                iVar4.s(a17);
            } else {
                iVar4.o();
            }
            iVar4.E();
            c1.i a18 = a2.a(iVar4);
            a2.c(a18, i22, c0551a.d());
            a2.c(a18, dVar6, c0551a.b());
            a2.c(a18, qVar5, c0551a.c());
            a2.c(a18, y1Var4, c0551a.f());
            iVar4.c();
            b14.invoke(c1.g1.a(c1.g1.b(iVar4)), iVar4, 0);
            iVar4.x(2058660585);
            iVar4.x(-1253629305);
            p0.d dVar7 = p0.d.f45270a;
            iVar4.x(-447674213);
            pVar.mo160invoke(iVar4, Integer.valueOf(i15 & 14));
            iVar4.N();
            iVar4.N();
            iVar4.N();
            iVar4.q();
            iVar4.N();
            iVar4.N();
            if (pVar2 != null) {
                o1.f b15 = f2.r.b(aVar, "Label");
                iVar4.x(-1990474327);
                f2.z i23 = p0.c.i(c0826a.k(), false, iVar4, 0);
                iVar4.x(1376089394);
                x2.d dVar8 = (x2.d) iVar4.A(androidx.compose.ui.platform.l0.d());
                x2.q qVar6 = (x2.q) iVar4.A(androidx.compose.ui.platform.l0.i());
                y1 y1Var5 = (y1) iVar4.A(androidx.compose.ui.platform.l0.m());
                h00.a<h2.a> a19 = c0551a.a();
                h00.q<c1.g1<h2.a>, c1.i, Integer, vz.b0> b16 = f2.u.b(b15);
                if (!(iVar4.k() instanceof c1.e)) {
                    c1.h.c();
                }
                iVar4.D();
                if (iVar4.f()) {
                    iVar4.s(a19);
                } else {
                    iVar4.o();
                }
                iVar4.E();
                c1.i a21 = a2.a(iVar4);
                a2.c(a21, i23, c0551a.d());
                a2.c(a21, dVar8, c0551a.b());
                a2.c(a21, qVar6, c0551a.c());
                a2.c(a21, y1Var5, c0551a.f());
                iVar4.c();
                b16.invoke(c1.g1.a(c1.g1.b(iVar4)), iVar4, 0);
                iVar4.x(2058660585);
                iVar4.x(-1253629305);
                iVar4.x(-447674092);
                pVar2.mo160invoke(iVar4, Integer.valueOf((i15 >> 6) & 14));
                iVar4.N();
                iVar4.N();
                iVar4.N();
                iVar4.q();
                iVar4.N();
                iVar4.N();
            }
            iVar4.N();
            iVar4.N();
            iVar4.q();
            iVar4.N();
        }
        c1.e1 l12 = iVar4.l();
        if (l12 == null) {
            return;
        }
        l12.a(new a(pVar, qVar, pVar2, pVar3, pVar4, z11, j11, j12, f11, lVar, c1Var, f12, j13, j14, i11, i12));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(o1.f r40, s2.a0 r41, h00.l<? super s2.a0, vz.b0> r42, boolean r43, boolean r44, w0.v r45, w0.u r46, n2.a0 r47, boolean r48, int r49, s2.k0 r50, o0.m r51, h00.q<? super o1.f, ? super c1.i, ? super java.lang.Integer, vz.b0> r52, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r53, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r54, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r55, long r56, long r58, float r60, float r61, long r62, long r64, long r66, t1.c1 r68, c1.i r69, int r70, int r71, int r72, int r73) {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.p0.b(o1.f, s2.a0, h00.l, boolean, boolean, w0.v, w0.u, n2.a0, boolean, int, s2.k0, o0.m, h00.q, h00.p, h00.p, h00.p, long, long, float, float, long, long, long, t1.c1, c1.i, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(int i11, int i12, int i13, int i14, int i15, long j11, float f11) {
        int c11;
        int max = Math.max(i13, i15);
        float h11 = j1.h() * f11;
        float max2 = max + h11 + Math.max(h11, i14 / 2.0f);
        int o11 = x2.b.o(j11);
        c11 = j00.c.c(max2);
        return Math.max(o11, Math.max(i11, Math.max(i12, c11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(int i11, int i12, int i13, int i14, int i15, long j11) {
        return Math.max(i11 + Math.max(i13, Math.max(i14, i15)) + i12, x2.b.p(j11));
    }

    private static final o1.f j(o1.f fVar, long j11) {
        return q1.i.c(fVar, new d(j11));
    }

    private static final o1.f k(o1.f fVar, t1.c1 c1Var, float f11, long j11, long j12) {
        return m0.d.g(j(fVar, j12), f11, j11, c1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(m0.a aVar, int i11, int i12, f2.m0 m0Var, f2.m0 m0Var2, f2.m0 m0Var3, f2.m0 m0Var4, f2.m0 m0Var5, f2.m0 m0Var6, float f11, boolean z11, float f12) {
        int c11;
        int c12;
        int c13;
        c11 = j00.c.c(j1.h() * f12);
        float e11 = j1.e() * f12;
        if (m0Var != null) {
            m0.a.n(aVar, m0Var, 0, o1.a.f42039a.g().a(m0Var.w0(), i11), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (m0Var2 != null) {
            m0.a.n(aVar, m0Var2, i12 - m0Var2.B0(), o1.a.f42039a.g().a(m0Var2.w0(), i11), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (m0Var4 != null) {
            float f13 = 1 - f11;
            float a11 = ((z11 ? o1.a.f42039a.g().a(m0Var4.w0(), i11) : c11) * f13) - ((m0Var4.w0() / 2) * f11);
            c12 = j00.c.c(m0Var == null ? BitmapDescriptorFactory.HUE_RED : f13 * (j1.k(m0Var) - e11));
            c13 = j00.c.c(a11);
            m0.a.n(aVar, m0Var4, c12 + c11, c13, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        m0.a.n(aVar, m0Var3, j1.k(m0Var), z11 ? o1.a.f42039a.g().a(m0Var3.w0(), i11) : c11, BitmapDescriptorFactory.HUE_RED, 4, null);
        if (m0Var5 != null) {
            if (z11) {
                c11 = o1.a.f42039a.g().a(m0Var5.w0(), i11);
            }
            m0.a.n(aVar, m0Var5, j1.k(m0Var), c11, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        m0.a.l(aVar, m0Var6, x2.k.f56947b.a(), BitmapDescriptorFactory.HUE_RED, 2, null);
    }
}