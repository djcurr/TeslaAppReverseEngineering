package y0;

import androidx.compose.ui.platform.y1;
import c1.a2;
import h2.a;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a  reason: collision with root package name */
    private static final long f58150a = x2.c.a(0, 0, 0, 0);

    /* renamed from: b  reason: collision with root package name */
    private static final float f58151b = x2.g.f(1);

    /* renamed from: c  reason: collision with root package name */
    private static final float f58152c = x2.g.f(2);

    /* renamed from: d  reason: collision with root package name */
    private static final float f58153d = x2.g.f(16);

    /* renamed from: e  reason: collision with root package name */
    private static final float f58154e = x2.g.f(12);

    /* renamed from: f  reason: collision with root package name */
    private static final o1.f f58155f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f58156a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n2.a0 f58157b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Float f58158c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58159d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f58160e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f58161f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(long j11, n2.a0 a0Var, Float f11, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, int i11, int i12) {
            super(2);
            this.f58156a = j11;
            this.f58157b = a0Var;
            this.f58158c = f11;
            this.f58159d = pVar;
            this.f58160e = i11;
            this.f58161f = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            j1.a(this.f58156a, this.f58157b, this.f58158c, this.f58159d, iVar, this.f58160e | 1, this.f58161f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f58162a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Float f58163b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58164c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f58165d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Float f58166a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58167b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f58168c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ long f58169d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Float f11, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, int i11, long j11) {
                super(2);
                this.f58166a = f11;
                this.f58167b = pVar;
                this.f58168c = i11;
                this.f58169d = j11;
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
                } else if (this.f58166a != null) {
                    iVar.x(-452621457);
                    c1.r.a(new c1.x0[]{o.a().c(this.f58166a)}, this.f58167b, iVar, ((this.f58168c >> 6) & 112) | 8);
                    iVar.N();
                } else {
                    iVar.x(-452621277);
                    c1.r.a(new c1.x0[]{o.a().c(Float.valueOf(t1.a0.o(this.f58169d)))}, this.f58167b, iVar, ((this.f58168c >> 6) & 112) | 8);
                    iVar.N();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(long j11, Float f11, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, int i11) {
            super(2);
            this.f58162a = j11;
            this.f58163b = f11;
            this.f58164c = pVar;
            this.f58165d = i11;
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
            } else {
                c1.r.a(new c1.x0[]{p.a().c(t1.a0.h(this.f58162a))}, j1.c.b(iVar, -819900843, true, new a(this.f58163b, this.f58164c, this.f58165d, this.f58162a)), iVar, 56);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.u<Float, t1.a0, t1.a0, x2.g, Float, c1.i, Integer, vz.b0> {
        final /* synthetic */ t1.c1 A;
        final /* synthetic */ boolean B;

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58170a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58171b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n2.a f58172c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ o1.f f58173d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f58174e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f58175f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g1 f58176g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f58177h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ o0.m f58178i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f58179j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ n1 f58180k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ s2.a0 f58181l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ h00.l<s2.a0, vz.b0> f58182m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ boolean f58183n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ w0.v f58184o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ w0.u f58185p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ n2.a0 f58186q;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ boolean f58187t;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ int f58188w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ s2.k0 f58189x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58190y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58191z;

        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f58192a;

            static {
                int[] iArr = new int[n1.values().length];
                iArr[n1.Filled.ordinal()] = 1;
                iArr[n1.Outlined.ordinal()] = 2;
                f58192a = iArr;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ float f58193a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ long f58194b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58195c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f58196d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ boolean f58197e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ long f58198f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(float f11, long j11, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, int i11, boolean z11, long j12) {
                super(2);
                this.f58193a = f11;
                this.f58194b = j11;
                this.f58195c = pVar;
                this.f58196d = i11;
                this.f58197e = z11;
                this.f58198f = j12;
            }

            @Override // h00.p
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
                invoke(iVar, num.intValue());
                return vz.b0.f54756a;
            }

            public final void invoke(c1.i iVar, int i11) {
                n2.a0 a0Var;
                n2.a0 b11;
                if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                    iVar.G();
                    return;
                }
                h0 h0Var = h0.f58131a;
                n2.a0 a11 = n2.b0.a(h0Var.c(iVar, 6).k(), h0Var.c(iVar, 6).f(), this.f58193a);
                boolean z11 = this.f58197e;
                long j11 = this.f58198f;
                if (z11) {
                    b11 = a11.b((r44 & 1) != 0 ? a11.f() : j11, (r44 & 2) != 0 ? a11.i() : 0L, (r44 & 4) != 0 ? a11.f40266c : null, (r44 & 8) != 0 ? a11.j() : null, (r44 & 16) != 0 ? a11.k() : null, (r44 & 32) != 0 ? a11.f40269f : null, (r44 & 64) != 0 ? a11.f40270g : null, (r44 & 128) != 0 ? a11.m() : 0L, (r44 & 256) != 0 ? a11.e() : null, (r44 & 512) != 0 ? a11.f40273j : null, (r44 & 1024) != 0 ? a11.f40274k : null, (r44 & 2048) != 0 ? a11.d() : 0L, (r44 & 4096) != 0 ? a11.f40276m : null, (r44 & PKIFailureInfo.certRevoked) != 0 ? a11.f40277n : null, (r44 & 16384) != 0 ? a11.q() : null, (r44 & 32768) != 0 ? a11.s() : null, (r44 & 65536) != 0 ? a11.n() : 0L, (r44 & 131072) != 0 ? a11.f40281r : null);
                    a0Var = b11;
                } else {
                    a0Var = a11;
                }
                j1.a(this.f58194b, a0Var, null, this.f58195c, iVar, ((this.f58196d >> 6) & 14) | 384, 0);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: y0.j1$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1326c extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ float f58199a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g1 f58200b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f58201c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f58202d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f58203e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58204f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1326c(float f11, g1 g1Var, boolean z11, int i11, int i12, h00.p<? super c1.i, ? super Integer, vz.b0> pVar) {
                super(3);
                this.f58199a = f11;
                this.f58200b = g1Var;
                this.f58201c = z11;
                this.f58202d = i11;
                this.f58203e = i12;
                this.f58204f = pVar;
            }

            public final void a(o1.f modifier, c1.i iVar, int i11) {
                kotlin.jvm.internal.s.g(modifier, "modifier");
                if ((i11 & 14) == 0) {
                    i11 |= iVar.O(modifier) ? 4 : 2;
                }
                if (((i11 & 91) ^ 18) == 0 && iVar.i()) {
                    iVar.G();
                    return;
                }
                o1.f a11 = q1.a.a(modifier, this.f58199a);
                g1 g1Var = this.f58200b;
                boolean z11 = this.f58201c;
                int i12 = this.f58202d;
                int i13 = this.f58203e;
                h00.p<c1.i, Integer, vz.b0> pVar = this.f58204f;
                iVar.x(-1990474327);
                f2.z i14 = p0.c.i(o1.a.f42039a.k(), false, iVar, 0);
                iVar.x(1376089394);
                x2.d dVar = (x2.d) iVar.A(androidx.compose.ui.platform.l0.d());
                x2.q qVar = (x2.q) iVar.A(androidx.compose.ui.platform.l0.i());
                y1 y1Var = (y1) iVar.A(androidx.compose.ui.platform.l0.m());
                a.C0551a c0551a = h2.a.Y0;
                h00.a<h2.a> a12 = c0551a.a();
                h00.q<c1.g1<h2.a>, c1.i, Integer, vz.b0> b11 = f2.u.b(a11);
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
                a2.c(a13, i14, c0551a.d());
                a2.c(a13, dVar, c0551a.b());
                a2.c(a13, qVar, c0551a.c());
                a2.c(a13, y1Var, c0551a.f());
                iVar.c();
                b11.invoke(c1.g1.a(c1.g1.b(iVar)), iVar, 0);
                iVar.x(2058660585);
                iVar.x(-1253629305);
                p0.d dVar2 = p0.d.f45270a;
                iVar.x(-416783238);
                j1.a(g1Var.h(z11, iVar, ((i12 >> 3) & 14) | ((i13 >> 24) & 112)).getValue().v(), h0.f58131a.c(iVar, 6).k(), null, pVar, iVar, (i12 >> 18) & 7168, 4);
                iVar.N();
                iVar.N();
                iVar.N();
                iVar.q();
                iVar.N();
                iVar.N();
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ vz.b0 invoke(o1.f fVar, c1.i iVar, Integer num) {
                a(fVar, iVar, num.intValue());
                return vz.b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class d extends kotlin.jvm.internal.u implements h00.l<l2.v, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f58205a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f58206b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(boolean z11, String str) {
                super(1);
                this.f58205a = z11;
                this.f58206b = str;
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo12invoke(l2.v vVar) {
                invoke2(vVar);
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(l2.v semantics) {
                kotlin.jvm.internal.s.g(semantics, "$this$semantics");
                if (this.f58205a) {
                    l2.t.l(semantics, this.f58206b);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(h00.p<? super c1.i, ? super Integer, vz.b0> pVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar2, n2.a aVar, o1.f fVar, boolean z11, int i11, g1 g1Var, boolean z12, o0.m mVar, int i12, n1 n1Var, s2.a0 a0Var, h00.l<? super s2.a0, vz.b0> lVar, boolean z13, w0.v vVar, w0.u uVar, n2.a0 a0Var2, boolean z14, int i13, s2.k0 k0Var, h00.p<? super c1.i, ? super Integer, vz.b0> pVar3, h00.p<? super c1.i, ? super Integer, vz.b0> pVar4, t1.c1 c1Var, boolean z15) {
            super(7);
            this.f58170a = pVar;
            this.f58171b = pVar2;
            this.f58172c = aVar;
            this.f58173d = fVar;
            this.f58174e = z11;
            this.f58175f = i11;
            this.f58176g = g1Var;
            this.f58177h = z12;
            this.f58178i = mVar;
            this.f58179j = i12;
            this.f58180k = n1Var;
            this.f58181l = a0Var;
            this.f58182m = lVar;
            this.f58183n = z13;
            this.f58184o = vVar;
            this.f58185p = uVar;
            this.f58186q = a0Var2;
            this.f58187t = z14;
            this.f58188w = i13;
            this.f58189x = k0Var;
            this.f58190y = pVar3;
            this.f58191z = pVar4;
            this.A = c1Var;
            this.B = z15;
        }

        @Override // h00.u
        public /* bridge */ /* synthetic */ vz.b0 L(Float f11, t1.a0 a0Var, t1.a0 a0Var2, x2.g gVar, Float f12, c1.i iVar, Integer num) {
            a(f11.floatValue(), a0Var.v(), a0Var2.v(), gVar.l(), f12.floatValue(), iVar, num.intValue());
            return vz.b0.f54756a;
        }

        /* JADX WARN: Removed duplicated region for block: B:67:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0168  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01d5  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x021a  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0337  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(float r49, long r50, long r52, float r54, float r55, c1.i r56, int r57) {
            /*
                Method dump skipped, instructions count: 1094
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.j1.c.a(float, long, long, float, float, c1.i, int):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {
        final /* synthetic */ int A;

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n1 f58207a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f58208b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f58209c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ s2.a0 f58210d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h00.l<s2.a0, vz.b0> f58211e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ o1.f f58212f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f58213g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ n2.a0 f58214h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58215i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58216j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58217k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58218l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f58219m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ s2.k0 f58220n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ w0.v f58221o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ w0.u f58222p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f58223q;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ o0.m f58224t;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ t1.c1 f58225w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ g1 f58226x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ int f58227y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ int f58228z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(n1 n1Var, boolean z11, boolean z12, s2.a0 a0Var, h00.l<? super s2.a0, vz.b0> lVar, o1.f fVar, boolean z13, n2.a0 a0Var2, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar2, h00.p<? super c1.i, ? super Integer, vz.b0> pVar3, h00.p<? super c1.i, ? super Integer, vz.b0> pVar4, boolean z14, s2.k0 k0Var, w0.v vVar, w0.u uVar, int i11, o0.m mVar, t1.c1 c1Var, g1 g1Var, int i12, int i13, int i14) {
            super(2);
            this.f58207a = n1Var;
            this.f58208b = z11;
            this.f58209c = z12;
            this.f58210d = a0Var;
            this.f58211e = lVar;
            this.f58212f = fVar;
            this.f58213g = z13;
            this.f58214h = a0Var2;
            this.f58215i = pVar;
            this.f58216j = pVar2;
            this.f58217k = pVar3;
            this.f58218l = pVar4;
            this.f58219m = z14;
            this.f58220n = k0Var;
            this.f58221o = vVar;
            this.f58222p = uVar;
            this.f58223q = i11;
            this.f58224t = mVar;
            this.f58225w = c1Var;
            this.f58226x = g1Var;
            this.f58227y = i12;
            this.f58228z = i13;
            this.A = i14;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            j1.b(this.f58207a, this.f58208b, this.f58209c, this.f58210d, this.f58211e, this.f58212f, this.f58213g, this.f58214h, this.f58215i, this.f58216j, this.f58217k, this.f58218l, this.f58219m, this.f58220n, this.f58221o, this.f58222p, this.f58223q, this.f58224t, this.f58225w, this.f58226x, iVar, this.f58227y | 1, this.f58228z, this.A);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.q<e0, c1.i, Integer, t1.a0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g1 f58229a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f58230b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f58231c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ o0.m f58232d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f58233e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f58234f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(g1 g1Var, boolean z11, boolean z12, o0.m mVar, int i11, int i12) {
            super(3);
            this.f58229a = g1Var;
            this.f58230b = z11;
            this.f58231c = z12;
            this.f58232d = mVar;
            this.f58233e = i11;
            this.f58234f = i12;
        }

        public final long a(e0 it2, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(it2, "it");
            iVar.x(-1061048422);
            g1 g1Var = this.f58229a;
            boolean z11 = this.f58230b;
            boolean z12 = it2 == e0.UnfocusedEmpty ? false : this.f58231c;
            o0.m mVar = this.f58232d;
            int i12 = this.f58234f;
            long v11 = g1Var.i(z11, z12, mVar, iVar, ((this.f58233e >> 3) & 14) | ((i12 >> 15) & 896) | ((i12 >> 18) & 7168)).getValue().v();
            iVar.N();
            return v11;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ t1.a0 invoke(e0 e0Var, c1.i iVar, Integer num) {
            return t1.a0.h(a(e0Var, iVar, num.intValue()));
        }
    }

    static {
        float f11 = 48;
        f58155f = p0.e0.g(o1.f.f42062f1, x2.g.f(f11), x2.g.f(f11));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(long r16, n2.a0 r18, java.lang.Float r19, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r20, c1.i r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.j1.a(long, n2.a0, java.lang.Float, h00.p, c1.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(y0.n1 r60, boolean r61, boolean r62, s2.a0 r63, h00.l<? super s2.a0, vz.b0> r64, o1.f r65, boolean r66, n2.a0 r67, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r68, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r69, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r70, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r71, boolean r72, s2.k0 r73, w0.v r74, w0.u r75, int r76, o0.m r77, t1.c1 r78, y0.g1 r79, c1.i r80, int r81, int r82, int r83) {
        /*
            Method dump skipped, instructions count: 1340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.j1.b(y0.n1, boolean, boolean, s2.a0, h00.l, o1.f, boolean, n2.a0, h00.p, h00.p, h00.p, h00.p, boolean, s2.k0, w0.v, w0.u, int, o0.m, t1.c1, y0.g1, c1.i, int, int, int):void");
    }

    public static final float e() {
        return f58154e;
    }

    public static final o1.f f() {
        return f58155f;
    }

    public static final Object g(f2.j jVar) {
        kotlin.jvm.internal.s.g(jVar, "<this>");
        Object t11 = jVar.t();
        f2.s sVar = t11 instanceof f2.s ? (f2.s) t11 : null;
        if (sVar == null) {
            return null;
        }
        return sVar.a();
    }

    public static final float h() {
        return f58153d;
    }

    public static final long i() {
        return f58150a;
    }

    public static final int j(f2.m0 m0Var) {
        if (m0Var == null) {
            return 0;
        }
        return m0Var.w0();
    }

    public static final int k(f2.m0 m0Var) {
        if (m0Var == null) {
            return 0;
        }
        return m0Var.B0();
    }
}