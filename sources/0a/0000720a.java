package h2;

import androidx.compose.ui.platform.b1;
import androidx.compose.ui.platform.y1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.b0;
import f2.m0;
import f2.o0;
import f2.p0;
import h2.f0;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.f;

/* loaded from: classes.dex */
public final class k implements f2.y, o0, g0, f2.t, h2.a {

    /* renamed from: g1 */
    public static final d f28686g1 = new d(null);

    /* renamed from: p1 */
    private static final f f28687p1 = new c();

    /* renamed from: x1 */
    private static final h00.a<k> f28688x1 = a.f28713a;

    /* renamed from: y1 */
    private static final y1 f28689y1 = new b();
    private int A;
    private int B;
    private g C;
    private boolean E;
    private final o F;
    private final d0 G;
    private float H;
    private o K;
    private boolean L;
    private o1.f O;
    private h00.l<? super f0, vz.b0> P;
    private h00.l<? super f0, vz.b0> Q;
    private d1.e<a0> R;
    private boolean T;
    private boolean Y;

    /* renamed from: a */
    private final boolean f28690a;

    /* renamed from: b */
    private int f28691b;

    /* renamed from: b1 */
    private final Comparator<k> f28692b1;

    /* renamed from: c */
    private final d1.e<k> f28693c;

    /* renamed from: d */
    private d1.e<k> f28694d;

    /* renamed from: e */
    private boolean f28695e;

    /* renamed from: f */
    private k f28696f;

    /* renamed from: g */
    private f0 f28697g;

    /* renamed from: h */
    private int f28698h;

    /* renamed from: i */
    private e f28699i;

    /* renamed from: j */
    private d1.e<h2.b<?>> f28700j;

    /* renamed from: k */
    private boolean f28701k;

    /* renamed from: l */
    private final d1.e<k> f28702l;

    /* renamed from: m */
    private boolean f28703m;

    /* renamed from: n */
    private f2.z f28704n;

    /* renamed from: o */
    private final h2.i f28705o;

    /* renamed from: p */
    private x2.d f28706p;

    /* renamed from: q */
    private final f2.b0 f28707q;

    /* renamed from: t */
    private x2.q f28708t;

    /* renamed from: w */
    private y1 f28709w;

    /* renamed from: x */
    private final h2.l f28710x;

    /* renamed from: y */
    private boolean f28711y;

    /* renamed from: z */
    private int f28712z;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<k> {

        /* renamed from: a */
        public static final a f28713a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final k invoke() {
            return new k(false, 1, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements y1 {
        b() {
        }

        @Override // androidx.compose.ui.platform.y1
        public long a() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.y1
        public long b() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.y1
        public long c() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.y1
        public long d() {
            return x2.j.f56944a.b();
        }

        @Override // androidx.compose.ui.platform.y1
        public float e() {
            return 16.0f;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends f {
        c() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // f2.z
        public /* bridge */ /* synthetic */ f2.a0 b(f2.b0 b0Var, List list, long j11) {
            j(b0Var, list, j11);
            throw new KotlinNothingValueException();
        }

        public Void j(f2.b0 receiver, List<? extends f2.y> measurables, long j11) {
            kotlin.jvm.internal.s.g(receiver, "$receiver");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h00.a<k> a() {
            return k.f28688x1;
        }
    }

    /* loaded from: classes.dex */
    public enum e {
        NeedsRemeasure,
        Measuring,
        NeedsRelayout,
        LayingOut,
        Ready
    }

    /* loaded from: classes.dex */
    public static abstract class f implements f2.z {

        /* renamed from: a */
        private final String f28714a;

        public f(String error) {
            kotlin.jvm.internal.s.g(error, "error");
            this.f28714a = error;
        }

        @Override // f2.z
        public /* bridge */ /* synthetic */ int a(f2.k kVar, List list, int i11) {
            return ((Number) i(kVar, list, i11)).intValue();
        }

        @Override // f2.z
        public /* bridge */ /* synthetic */ int c(f2.k kVar, List list, int i11) {
            return ((Number) g(kVar, list, i11)).intValue();
        }

        @Override // f2.z
        public /* bridge */ /* synthetic */ int d(f2.k kVar, List list, int i11) {
            return ((Number) f(kVar, list, i11)).intValue();
        }

        @Override // f2.z
        public /* bridge */ /* synthetic */ int e(f2.k kVar, List list, int i11) {
            return ((Number) h(kVar, list, i11)).intValue();
        }

        public Void f(f2.k kVar, List<? extends f2.j> measurables, int i11) {
            kotlin.jvm.internal.s.g(kVar, "<this>");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            throw new IllegalStateException(this.f28714a.toString());
        }

        public Void g(f2.k kVar, List<? extends f2.j> measurables, int i11) {
            kotlin.jvm.internal.s.g(kVar, "<this>");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            throw new IllegalStateException(this.f28714a.toString());
        }

        public Void h(f2.k kVar, List<? extends f2.j> measurables, int i11) {
            kotlin.jvm.internal.s.g(kVar, "<this>");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            throw new IllegalStateException(this.f28714a.toString());
        }

        public Void i(f2.k kVar, List<? extends f2.j> measurables, int i11) {
            kotlin.jvm.internal.s.g(kVar, "<this>");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            throw new IllegalStateException(this.f28714a.toString());
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class h {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28715a;

        static {
            int[] iArr = new int[e.values().length];
            iArr[e.NeedsRemeasure.ordinal()] = 1;
            iArr[e.NeedsRelayout.ordinal()] = 2;
            iArr[e.Ready.ordinal()] = 3;
            f28715a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.u implements h00.p<f.c, Boolean, Boolean> {

        /* renamed from: a */
        final /* synthetic */ d1.e<a0> f28716a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(d1.e<a0> eVar) {
            super(2);
            this.f28716a = eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x0034, code lost:
            if (r1 == null) goto L22;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean a(o1.f.c r7, boolean r8) {
            /*
                r6 = this;
                java.lang.String r0 = "mod"
                kotlin.jvm.internal.s.g(r7, r0)
                r0 = 0
                if (r8 != 0) goto L36
                boolean r8 = r7 instanceof f2.e0
                if (r8 == 0) goto L37
                d1.e<h2.a0> r8 = r6.f28716a
                r1 = 0
                if (r8 != 0) goto L12
                goto L34
            L12:
                int r2 = r8.l()
                if (r2 <= 0) goto L32
                java.lang.Object[] r8 = r8.k()
                r3 = r0
            L1d:
                r4 = r8[r3]
                r5 = r4
                h2.a0 r5 = (h2.a0) r5
                o1.f$c r5 = r5.a2()
                boolean r5 = kotlin.jvm.internal.s.c(r7, r5)
                if (r5 == 0) goto L2e
                r1 = r4
                goto L32
            L2e:
                int r3 = r3 + 1
                if (r3 < r2) goto L1d
            L32:
                h2.a0 r1 = (h2.a0) r1
            L34:
                if (r1 != 0) goto L37
            L36:
                r0 = 1
            L37:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: h2.k.i.a(o1.f$c, boolean):java.lang.Boolean");
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Boolean invoke(f.c cVar, Boolean bool) {
            return a(cVar, bool.booleanValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends kotlin.jvm.internal.u implements h00.a<vz.b0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j() {
            super(0);
            k.this = r1;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x008f A[ORIG_RETURN, RETURN] */
        /* renamed from: invoke */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void invoke2() {
            /*
                r8 = this;
                h2.k r0 = h2.k.this
                r1 = 0
                h2.k.v(r0, r1)
                h2.k r0 = h2.k.this
                d1.e r0 = r0.j0()
                int r2 = r0.l()
                r3 = 2147483647(0x7fffffff, float:NaN)
                if (r2 <= 0) goto L40
                java.lang.Object[] r0 = r0.k()
                r4 = r1
            L1a:
                r5 = r0[r4]
                h2.k r5 = (h2.k) r5
                int r6 = r5.f0()
                h2.k.x(r5, r6)
                h2.k.w(r5, r3)
                h2.l r6 = r5.H()
                r6.r(r1)
                h2.k$g r6 = r5.Y()
                h2.k$g r7 = h2.k.g.InLayoutBlock
                if (r6 != r7) goto L3c
                h2.k$g r6 = h2.k.g.NotUsed
                r5.T0(r6)
            L3c:
                int r4 = r4 + 1
                if (r4 < r2) goto L1a
            L40:
                h2.k r0 = h2.k.this
                h2.o r0 = r0.P()
                f2.a0 r0 = r0.o1()
                r0.b()
                h2.k r0 = h2.k.this
                d1.e r0 = r0.j0()
                h2.k r2 = h2.k.this
                int r4 = r0.l()
                if (r4 <= 0) goto L8f
                java.lang.Object[] r0 = r0.k()
            L5f:
                r5 = r0[r1]
                h2.k r5 = (h2.k) r5
                int r6 = h2.k.n(r5)
                int r7 = r5.f0()
                if (r6 == r7) goto L7c
                h2.k.q(r2)
                r2.r0()
                int r6 = r5.f0()
                if (r6 != r3) goto L7c
                h2.k.p(r5)
            L7c:
                h2.l r6 = r5.H()
                h2.l r5 = r5.H()
                boolean r5 = r5.h()
                r6.o(r5)
                int r1 = r1 + 1
                if (r1 < r4) goto L5f
            L8f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h2.k.j.invoke2():void");
        }
    }

    /* renamed from: h2.k$k */
    /* loaded from: classes.dex */
    public static final class C0555k extends kotlin.jvm.internal.u implements h00.p<vz.b0, f.c, vz.b0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0555k() {
            super(2);
            k.this = r1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object[]] */
        public final void a(vz.b0 noName_0, f.c mod) {
            h2.b bVar;
            kotlin.jvm.internal.s.g(noName_0, "$noName_0");
            kotlin.jvm.internal.s.g(mod, "mod");
            d1.e eVar = k.this.f28700j;
            int l11 = eVar.l();
            if (l11 > 0) {
                int i11 = l11 - 1;
                ?? k11 = eVar.k();
                do {
                    bVar = k11[i11];
                    h2.b bVar2 = (h2.b) bVar;
                    if (bVar2.a2() == mod && !bVar2.b2()) {
                        break;
                    }
                    i11--;
                } while (i11 >= 0);
                bVar = null;
            } else {
                bVar = null;
            }
            h2.b bVar3 = bVar;
            while (bVar3 != null) {
                bVar3.h2(true);
                if (bVar3.d2()) {
                    o w12 = bVar3.w1();
                    if (w12 instanceof h2.b) {
                        bVar3 = (h2.b) w12;
                    }
                }
                bVar3 = null;
            }
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(vz.b0 b0Var, f.c cVar) {
            a(b0Var, cVar);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class l implements f2.b0, x2.d {
        l() {
            k.this = r1;
        }

        @Override // x2.d
        public int G(float f11) {
            return b0.a.d(this, f11);
        }

        @Override // f2.b0
        public f2.a0 I(int i11, int i12, Map<f2.a, Integer> map, h00.l<? super m0.a, vz.b0> lVar) {
            return b0.a.a(this, i11, i12, map, lVar);
        }

        @Override // x2.d
        public float M(long j11) {
            return b0.a.f(this, j11);
        }

        @Override // x2.d
        public float b0(int i11) {
            return b0.a.e(this, i11);
        }

        @Override // x2.d
        public float c0() {
            return k.this.K().c0();
        }

        @Override // x2.d
        public float getDensity() {
            return k.this.K().getDensity();
        }

        @Override // f2.k
        public x2.q getLayoutDirection() {
            return k.this.getLayoutDirection();
        }

        @Override // x2.d
        public float i0(float f11) {
            return b0.a.g(this, f11);
        }

        @Override // x2.d
        public int l0(long j11) {
            return b0.a.c(this, j11);
        }

        @Override // x2.d
        public long p0(long j11) {
            return b0.a.h(this, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class m extends kotlin.jvm.internal.u implements h00.p<f.c, o, o> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m() {
            super(2);
            k.this = r1;
        }

        @Override // h00.p
        /* renamed from: a */
        public final o invoke(f.c mod, o toWrap) {
            y yVar;
            kotlin.jvm.internal.s.g(mod, "mod");
            kotlin.jvm.internal.s.g(toWrap, "toWrap");
            if (mod instanceof p0) {
                ((p0) mod).D(k.this);
            }
            if (mod instanceof q1.h) {
                h2.e eVar = new h2.e(toWrap, (q1.h) mod);
                eVar.m(toWrap.i1());
                toWrap.R1(eVar);
                eVar.k();
            }
            h2.b P0 = k.this.P0(mod, toWrap);
            if (P0 == null) {
                if (mod instanceof g2.d) {
                    yVar = new z(toWrap, (g2.d) mod);
                    yVar.G1();
                    if (toWrap != yVar.v1()) {
                        ((h2.b) yVar.v1()).e2(true);
                    }
                } else {
                    yVar = toWrap;
                }
                if (mod instanceof g2.b) {
                    y yVar2 = new y(yVar, (g2.b) mod);
                    yVar2.G1();
                    if (toWrap != yVar2.v1()) {
                        ((h2.b) yVar2.v1()).e2(true);
                    }
                    yVar = yVar2;
                }
                if (mod instanceof r1.j) {
                    s sVar = new s(yVar, (r1.j) mod);
                    sVar.G1();
                    if (toWrap != sVar.v1()) {
                        ((h2.b) sVar.v1()).e2(true);
                    }
                    yVar = sVar;
                }
                if (mod instanceof r1.d) {
                    r rVar = new r(yVar, (r1.d) mod);
                    rVar.G1();
                    if (toWrap != rVar.v1()) {
                        ((h2.b) rVar.v1()).e2(true);
                    }
                    yVar = rVar;
                }
                if (mod instanceof r1.t) {
                    u uVar = new u(yVar, (r1.t) mod);
                    uVar.G1();
                    if (toWrap != uVar.v1()) {
                        ((h2.b) uVar.v1()).e2(true);
                    }
                    yVar = uVar;
                }
                if (mod instanceof r1.n) {
                    t tVar = new t(yVar, (r1.n) mod);
                    tVar.G1();
                    if (toWrap != tVar.v1()) {
                        ((h2.b) tVar.v1()).e2(true);
                    }
                    yVar = tVar;
                }
                if (mod instanceof b2.e) {
                    v vVar = new v(yVar, (b2.e) mod);
                    vVar.G1();
                    if (toWrap != vVar.v1()) {
                        ((h2.b) vVar.v1()).e2(true);
                    }
                    yVar = vVar;
                }
                if (mod instanceof d2.b0) {
                    i0 i0Var = new i0(yVar, (d2.b0) mod);
                    i0Var.G1();
                    if (toWrap != i0Var.v1()) {
                        ((h2.b) i0Var.v1()).e2(true);
                    }
                    yVar = i0Var;
                }
                if (mod instanceof c2.e) {
                    c2.b bVar = new c2.b(yVar, (c2.e) mod);
                    bVar.G1();
                    if (toWrap != bVar.v1()) {
                        ((h2.b) bVar.v1()).e2(true);
                    }
                    yVar = bVar;
                }
                if (mod instanceof f2.v) {
                    w wVar = new w(yVar, (f2.v) mod);
                    wVar.G1();
                    if (toWrap != wVar.v1()) {
                        ((h2.b) wVar.v1()).e2(true);
                    }
                    yVar = wVar;
                }
                if (mod instanceof f2.l0) {
                    x xVar = new x(yVar, (f2.l0) mod);
                    xVar.G1();
                    if (toWrap != xVar.v1()) {
                        ((h2.b) xVar.v1()).e2(true);
                    }
                    yVar = xVar;
                }
                if (mod instanceof l2.m) {
                    l2.x xVar2 = new l2.x(yVar, (l2.m) mod);
                    xVar2.G1();
                    if (toWrap != xVar2.v1()) {
                        ((h2.b) xVar2.v1()).e2(true);
                    }
                    yVar = xVar2;
                }
                if (mod instanceof f2.i0) {
                    k0 k0Var = new k0(yVar, (f2.i0) mod);
                    k0Var.G1();
                    if (toWrap != k0Var.v1()) {
                        ((h2.b) k0Var.v1()).e2(true);
                    }
                    yVar = k0Var;
                }
                if (mod instanceof f2.h0) {
                    b0 b0Var = new b0(yVar, (f2.h0) mod);
                    b0Var.G1();
                    if (toWrap != b0Var.v1()) {
                        ((h2.b) b0Var.v1()).e2(true);
                    }
                    yVar = b0Var;
                }
                if (mod instanceof f2.e0) {
                    a0 a0Var = new a0(yVar, (f2.e0) mod);
                    a0Var.G1();
                    if (toWrap != a0Var.v1()) {
                        ((h2.b) a0Var.v1()).e2(true);
                    }
                    return a0Var;
                }
                return yVar;
            }
            return P0;
        }
    }

    public k() {
        this(false, 1, null);
    }

    public k(boolean z11) {
        this.f28690a = z11;
        this.f28693c = new d1.e<>(new k[16], 0);
        this.f28699i = e.Ready;
        this.f28700j = new d1.e<>(new h2.b[16], 0);
        this.f28702l = new d1.e<>(new k[16], 0);
        this.f28703m = true;
        this.f28704n = f28687p1;
        this.f28705o = new h2.i(this);
        this.f28706p = x2.f.b(1.0f, BitmapDescriptorFactory.HUE_RED, 2, null);
        this.f28707q = new l();
        this.f28708t = x2.q.Ltr;
        this.f28709w = f28689y1;
        this.f28710x = new h2.l(this);
        this.f28712z = Integer.MAX_VALUE;
        this.A = Integer.MAX_VALUE;
        this.C = g.NotUsed;
        h2.h hVar = new h2.h(this);
        this.F = hVar;
        this.G = new d0(this, hVar);
        this.L = true;
        this.O = o1.f.f42062f1;
        this.f28692b1 = new Comparator() { // from class: h2.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return k.j((k) obj, (k) obj2);
            }
        };
    }

    private final void B() {
        o c02 = c0();
        o P = P();
        while (!kotlin.jvm.internal.s.c(c02, P)) {
            this.f28700j.b((h2.b) c02);
            c02.R1(null);
            c02 = c02.v1();
            kotlin.jvm.internal.s.e(c02);
        }
        this.F.R1(null);
    }

    private final void B0() {
        d1.e<k> j02 = j0();
        int l11 = j02.l();
        if (l11 > 0) {
            int i11 = 0;
            k[] k11 = j02.k();
            do {
                k kVar = k11[i11];
                if (kVar.R() == e.NeedsRemeasure && kVar.Y() == g.InMeasureBlock && I0(kVar, null, 1, null)) {
                    N0();
                }
                i11++;
            } while (i11 < l11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String C(int r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            if (r2 >= r8) goto L11
            int r2 = r2 + 1
            java.lang.String r3 = "  "
            r0.append(r3)
            goto L7
        L11:
            java.lang.String r2 = "|-"
            r0.append(r2)
            java.lang.String r2 = r7.toString()
            r0.append(r2)
            r2 = 10
            r0.append(r2)
            d1.e r2 = r7.j0()
            int r3 = r2.l()
            if (r3 <= 0) goto L42
            java.lang.Object[] r2 = r2.k()
            r4 = r1
        L31:
            r5 = r2[r4]
            h2.k r5 = (h2.k) r5
            int r6 = r8 + 1
            java.lang.String r5 = r5.C(r6)
            r0.append(r5)
            int r4 = r4 + 1
            if (r4 < r3) goto L31
        L42:
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "tree.toString()"
            kotlin.jvm.internal.s.f(r0, r2)
            if (r8 != 0) goto L5c
            int r8 = r0.length()
            int r8 = r8 + (-1)
            java.lang.String r0 = r0.substring(r1, r8)
            java.lang.String r8 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.s.f(r0, r8)
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.k.C(int):java.lang.String");
    }

    private final void C0() {
        N0();
        k e02 = e0();
        if (e02 != null) {
            e02.r0();
        }
        s0();
    }

    static /* synthetic */ String D(k kVar, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return kVar.C(i11);
    }

    public final void E0() {
        if (this.f28690a) {
            k e02 = e0();
            if (e02 == null) {
                return;
            }
            e02.E0();
            return;
        }
        this.f28703m = true;
    }

    private final void G0() {
        if (this.f28695e) {
            int i11 = 0;
            this.f28695e = false;
            d1.e<k> eVar = this.f28694d;
            if (eVar == null) {
                d1.e<k> eVar2 = new d1.e<>(new k[16], 0);
                this.f28694d = eVar2;
                eVar = eVar2;
            }
            eVar.g();
            d1.e<k> eVar3 = this.f28693c;
            int l11 = eVar3.l();
            if (l11 > 0) {
                k[] k11 = eVar3.k();
                do {
                    k kVar = k11[i11];
                    if (kVar.f28690a) {
                        eVar.c(eVar.l(), kVar.j0());
                    } else {
                        eVar.b(kVar);
                    }
                    i11++;
                } while (i11 < l11);
            }
        }
    }

    public static /* synthetic */ boolean I0(k kVar, x2.b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bVar = kVar.G.I0();
        }
        return kVar.H0(bVar);
    }

    private final o O() {
        if (this.L) {
            o oVar = this.F;
            o w12 = c0().w1();
            this.K = null;
            while (true) {
                if (kotlin.jvm.internal.s.c(oVar, w12)) {
                    break;
                }
                if ((oVar == null ? null : oVar.l1()) != null) {
                    this.K = oVar;
                    break;
                }
                oVar = oVar == null ? null : oVar.w1();
            }
        }
        o oVar2 = this.K;
        if (oVar2 == null || oVar2.l1() != null) {
            return oVar2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void O0(k kVar) {
        int i11 = h.f28715a[kVar.f28699i.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                throw new IllegalStateException(kotlin.jvm.internal.s.p("Unexpected state ", kVar.f28699i));
            }
            return;
        }
        kVar.f28699i = e.Ready;
        if (i11 == 1) {
            kVar.N0();
        } else {
            kVar.M0();
        }
    }

    public final h2.b<?> P0(f.c cVar, o oVar) {
        int i11;
        if (this.f28700j.n()) {
            return null;
        }
        d1.e<h2.b<?>> eVar = this.f28700j;
        int l11 = eVar.l();
        int i12 = -1;
        if (l11 > 0) {
            i11 = l11 - 1;
            h2.b<?>[] k11 = eVar.k();
            do {
                h2.b<?> bVar = k11[i11];
                if (bVar.b2() && bVar.a2() == cVar) {
                    break;
                }
                i11--;
            } while (i11 >= 0);
            i11 = -1;
        } else {
            i11 = -1;
        }
        if (i11 < 0) {
            d1.e<h2.b<?>> eVar2 = this.f28700j;
            int l12 = eVar2.l();
            if (l12 > 0) {
                int i13 = l12 - 1;
                h2.b<?>[] k12 = eVar2.k();
                while (true) {
                    h2.b<?> bVar2 = k12[i13];
                    if (!(!bVar2.b2() && kotlin.jvm.internal.s.c(b1.a(bVar2.a2()), b1.a(cVar)))) {
                        i13--;
                        if (i13 < 0) {
                            break;
                        }
                    } else {
                        i12 = i13;
                        break;
                    }
                }
            }
            i11 = i12;
        }
        if (i11 < 0) {
            return null;
        }
        int i14 = i11 - 1;
        h2.b<?> s11 = this.f28700j.s(i11);
        s11.i2(oVar);
        s11.g2(cVar);
        s11.G1();
        while (s11.d2()) {
            h2.b<?> s12 = this.f28700j.s(i14);
            s12.g2(cVar);
            s12.G1();
            i14--;
            s11 = s12;
        }
        return s11;
    }

    private final boolean V0() {
        o v12 = P().v1();
        for (o c02 = c0(); !kotlin.jvm.internal.s.c(c02, v12) && c02 != null; c02 = c02.v1()) {
            if (c02.l1() != null) {
                return false;
            }
            if (c02.i1() != null) {
                return true;
            }
        }
        return true;
    }

    public static /* synthetic */ int j(k kVar, k kVar2) {
        return k(kVar, kVar2);
    }

    public static final int k(k kVar, k kVar2) {
        float f11 = kVar.H;
        float f12 = kVar2.H;
        if (f11 == f12) {
            return kotlin.jvm.internal.s.i(kVar.f28712z, kVar2.f28712z);
        }
        return Float.compare(f11, f12);
    }

    private final boolean l0() {
        return ((Boolean) Z().a0(Boolean.FALSE, new i(this.R))).booleanValue();
    }

    public static /* synthetic */ void n0(k kVar, long j11, h2.f fVar, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        boolean z13 = z11;
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        kVar.m0(j11, fVar, z13, z12);
    }

    private final void t0() {
        k e02;
        if (this.f28691b > 0) {
            this.f28695e = true;
        }
        if (!this.f28690a || (e02 = e0()) == null) {
            return;
        }
        e02.f28695e = true;
    }

    private final void w0() {
        this.f28711y = true;
        o v12 = P().v1();
        for (o c02 = c0(); !kotlin.jvm.internal.s.c(c02, v12) && c02 != null; c02 = c02.v1()) {
            if (c02.k1()) {
                c02.A1();
            }
        }
        d1.e<k> j02 = j0();
        int l11 = j02.l();
        if (l11 > 0) {
            int i11 = 0;
            k[] k11 = j02.k();
            do {
                k kVar = k11[i11];
                if (kVar.f0() != Integer.MAX_VALUE) {
                    kVar.w0();
                    O0(kVar);
                }
                i11++;
            } while (i11 < l11);
        }
    }

    private final void x0(o1.f fVar) {
        d1.e<h2.b<?>> eVar = this.f28700j;
        int l11 = eVar.l();
        if (l11 > 0) {
            h2.b<?>[] k11 = eVar.k();
            int i11 = 0;
            do {
                k11[i11].h2(false);
                i11++;
            } while (i11 < l11);
            fVar.C(vz.b0.f54756a, new C0555k());
        }
        fVar.C(vz.b0.f54756a, new C0555k());
    }

    private final void y() {
        if (this.f28699i == e.Measuring) {
            this.f28710x.q(true);
            if (this.f28710x.a()) {
                this.f28699i = e.NeedsRelayout;
                return;
            }
            return;
        }
        this.f28710x.p(true);
    }

    public final void y0() {
        if (e()) {
            int i11 = 0;
            this.f28711y = false;
            d1.e<k> j02 = j0();
            int l11 = j02.l();
            if (l11 > 0) {
                k[] k11 = j02.k();
                do {
                    k11[i11].y0();
                    i11++;
                } while (i11 < l11);
            }
        }
    }

    public final Map<f2.a, Integer> A() {
        if (!this.G.H0()) {
            y();
        }
        v0();
        return this.f28710x.b();
    }

    public final void A0() {
        if (this.f28710x.a()) {
            return;
        }
        this.f28710x.n(true);
        k e02 = e0();
        if (e02 == null) {
            return;
        }
        if (this.f28710x.i()) {
            e02.N0();
        } else if (this.f28710x.c()) {
            e02.M0();
        }
        if (this.f28710x.g()) {
            N0();
        }
        if (this.f28710x.f()) {
            e02.M0();
        }
        e02.A0();
    }

    public final void D0() {
        k e02 = e0();
        float x12 = this.F.x1();
        o c02 = c0();
        o P = P();
        while (!kotlin.jvm.internal.s.c(c02, P)) {
            x12 += c02.x1();
            c02 = c02.v1();
            kotlin.jvm.internal.s.e(c02);
        }
        if (!(x12 == this.H)) {
            this.H = x12;
            if (e02 != null) {
                e02.E0();
            }
            if (e02 != null) {
                e02.r0();
            }
        }
        if (!e()) {
            if (e02 != null) {
                e02.r0();
            }
            w0();
        }
        if (e02 != null) {
            if (!this.Y && e02.f28699i == e.LayingOut) {
                if (this.f28712z == Integer.MAX_VALUE) {
                    int i11 = e02.B;
                    this.f28712z = i11;
                    e02.B = i11 + 1;
                } else {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
            }
        } else {
            this.f28712z = 0;
        }
        v0();
    }

    public final void E() {
        f0 f0Var = this.f28697g;
        if (f0Var == null) {
            k e02 = e0();
            throw new IllegalStateException(kotlin.jvm.internal.s.p("Cannot detach node that is already detached!  Tree: ", e02 != null ? D(e02, 0, 1, null) : null).toString());
        }
        k e03 = e0();
        if (e03 != null) {
            e03.r0();
            e03.N0();
        }
        this.f28710x.m();
        h00.l<? super f0, vz.b0> lVar = this.Q;
        if (lVar != null) {
            lVar.invoke(f0Var);
        }
        o c02 = c0();
        o P = P();
        while (!kotlin.jvm.internal.s.c(c02, P)) {
            c02.Q0();
            c02 = c02.v1();
            kotlin.jvm.internal.s.e(c02);
        }
        this.F.Q0();
        if (l2.q.j(this) != null) {
            f0Var.o();
        }
        f0Var.j(this);
        this.f28697g = null;
        this.f28698h = 0;
        d1.e<k> eVar = this.f28693c;
        int l11 = eVar.l();
        if (l11 > 0) {
            k[] k11 = eVar.k();
            int i11 = 0;
            do {
                k11[i11].E();
                i11++;
            } while (i11 < l11);
            this.f28712z = Integer.MAX_VALUE;
            this.A = Integer.MAX_VALUE;
            this.f28711y = false;
        }
        this.f28712z = Integer.MAX_VALUE;
        this.A = Integer.MAX_VALUE;
        this.f28711y = false;
    }

    public final void F() {
        d1.e<a0> eVar;
        int l11;
        if (this.f28699i == e.Ready && e() && (eVar = this.R) != null && (l11 = eVar.l()) > 0) {
            int i11 = 0;
            a0[] k11 = eVar.k();
            do {
                a0 a0Var = k11[i11];
                a0Var.a2().T(a0Var);
                i11++;
            } while (i11 < l11);
        }
    }

    public final void F0(int i11, int i12) {
        int h11;
        x2.q g11;
        m0.a.C0504a c0504a = m0.a.f25586a;
        int z02 = this.G.z0();
        x2.q layoutDirection = getLayoutDirection();
        h11 = c0504a.h();
        g11 = c0504a.g();
        m0.a.f25588c = z02;
        m0.a.f25587b = layoutDirection;
        m0.a.n(c0504a, this.G, i11, i12, BitmapDescriptorFactory.HUE_RED, 4, null);
        m0.a.f25588c = h11;
        m0.a.f25587b = g11;
    }

    public final void G(t1.u canvas) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        c0().S0(canvas);
    }

    public final h2.l H() {
        return this.f28710x;
    }

    public final boolean H0(x2.b bVar) {
        if (bVar != null) {
            return this.G.N0(bVar.s());
        }
        return false;
    }

    public final boolean I() {
        return this.E;
    }

    public final List<k> J() {
        return j0().f();
    }

    public final void J0() {
        boolean z11 = this.f28697g != null;
        int l11 = this.f28693c.l() - 1;
        if (l11 >= 0) {
            while (true) {
                int i11 = l11 - 1;
                k kVar = this.f28693c.k()[l11];
                if (z11) {
                    kVar.E();
                }
                kVar.f28696f = null;
                if (i11 < 0) {
                    break;
                }
                l11 = i11;
            }
        }
        this.f28693c.g();
        E0();
        this.f28691b = 0;
        t0();
    }

    public x2.d K() {
        return this.f28706p;
    }

    public final void K0(int i11, int i12) {
        if (i12 >= 0) {
            boolean z11 = this.f28697g != null;
            int i13 = (i12 + i11) - 1;
            if (i11 > i13) {
                return;
            }
            while (true) {
                int i14 = i13 - 1;
                k s11 = this.f28693c.s(i13);
                E0();
                if (z11) {
                    s11.E();
                }
                s11.f28696f = null;
                if (s11.f28690a) {
                    this.f28691b--;
                }
                t0();
                if (i13 == i11) {
                    return;
                }
                i13 = i14;
            }
        } else {
            throw new IllegalArgumentException(("count (" + i12 + ") must be greater than 0").toString());
        }
    }

    public final int L() {
        return this.f28698h;
    }

    public final void L0() {
        try {
            this.Y = true;
            this.G.O0();
        } finally {
            this.Y = false;
        }
    }

    public final List<k> M() {
        return this.f28693c.f();
    }

    public final void M0() {
        f0 f0Var;
        if (this.f28690a || (f0Var = this.f28697g) == null) {
            return;
        }
        f0Var.i(this);
    }

    public int N() {
        return this.G.w0();
    }

    public final void N0() {
        f0 f0Var = this.f28697g;
        if (f0Var == null || this.f28701k || this.f28690a) {
            return;
        }
        f0Var.n(this);
    }

    public final o P() {
        return this.F;
    }

    public final h2.i Q() {
        return this.f28705o;
    }

    public final void Q0(boolean z11) {
        this.E = z11;
    }

    public final e R() {
        return this.f28699i;
    }

    public final void R0(boolean z11) {
        this.L = z11;
    }

    @Override // f2.j
    public int S(int i11) {
        return this.G.S(i11);
    }

    public final void S0(e eVar) {
        kotlin.jvm.internal.s.g(eVar, "<set-?>");
        this.f28699i = eVar;
    }

    @Override // f2.j
    public int T(int i11) {
        return this.G.T(i11);
    }

    public final void T0(g gVar) {
        kotlin.jvm.internal.s.g(gVar, "<set-?>");
        this.C = gVar;
    }

    public final h2.m U() {
        return n.a(this).getSharedDrawScope();
    }

    public final void U0(boolean z11) {
        this.T = z11;
    }

    public f2.z V() {
        return this.f28704n;
    }

    public final f2.b0 W() {
        return this.f28707q;
    }

    public final void W0(h00.a<vz.b0> block) {
        kotlin.jvm.internal.s.g(block, "block");
        n.a(this).getSnapshotObserver().h(block);
    }

    @Override // f2.y
    public f2.m0 X(long j11) {
        return this.G.X(j11);
    }

    public final g Y() {
        return this.C;
    }

    public o1.f Z() {
        return this.O;
    }

    @Override // f2.j
    public int a(int i11) {
        return this.G.a(i11);
    }

    public final boolean a0() {
        return this.T;
    }

    @Override // h2.a
    public void b(f2.z value) {
        kotlin.jvm.internal.s.g(value, "value");
        if (kotlin.jvm.internal.s.c(this.f28704n, value)) {
            return;
        }
        this.f28704n = value;
        this.f28705o.g(V());
        N0();
    }

    public final d1.e<a0> b0() {
        d1.e<a0> eVar = this.R;
        if (eVar == null) {
            d1.e<a0> eVar2 = new d1.e<>(new a0[16], 0);
            this.R = eVar2;
            return eVar2;
        }
        return eVar;
    }

    @Override // f2.o0
    public void c() {
        N0();
        f0 f0Var = this.f28697g;
        if (f0Var == null) {
            return;
        }
        f0.b.a(f0Var, false, 1, null);
    }

    public final o c0() {
        return this.G.J0();
    }

    @Override // h2.a
    public void d(y1 y1Var) {
        kotlin.jvm.internal.s.g(y1Var, "<set-?>");
        this.f28709w = y1Var;
    }

    public final f0 d0() {
        return this.f28697g;
    }

    @Override // f2.t
    public boolean e() {
        return this.f28711y;
    }

    public final k e0() {
        k kVar = this.f28696f;
        boolean z11 = false;
        if (kVar != null && kVar.f28690a) {
            z11 = true;
        }
        if (z11) {
            if (kVar == null) {
                return null;
            }
            return kVar.e0();
        }
        return kVar;
    }

    @Override // h2.a
    public void f(x2.d value) {
        kotlin.jvm.internal.s.g(value, "value");
        if (kotlin.jvm.internal.s.c(this.f28706p, value)) {
            return;
        }
        this.f28706p = value;
        C0();
    }

    public final int f0() {
        return this.f28712z;
    }

    @Override // f2.t
    public f2.o g() {
        return this.F;
    }

    public y1 g0() {
        return this.f28709w;
    }

    @Override // f2.t
    public x2.q getLayoutDirection() {
        return this.f28708t;
    }

    @Override // h2.a
    public void h(x2.q value) {
        kotlin.jvm.internal.s.g(value, "value");
        if (this.f28708t != value) {
            this.f28708t = value;
            C0();
        }
    }

    public int h0() {
        return this.G.B0();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00b3  */
    @Override // h2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(o1.f r8) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.k.i(o1.f):void");
    }

    public final d1.e<k> i0() {
        if (this.f28703m) {
            this.f28702l.g();
            d1.e<k> eVar = this.f28702l;
            eVar.c(eVar.l(), j0());
            this.f28702l.v(this.f28692b1);
            this.f28703m = false;
        }
        return this.f28702l;
    }

    @Override // h2.g0
    public boolean isValid() {
        return u0();
    }

    public final d1.e<k> j0() {
        if (this.f28691b == 0) {
            return this.f28693c;
        }
        G0();
        d1.e<k> eVar = this.f28694d;
        kotlin.jvm.internal.s.e(eVar);
        return eVar;
    }

    public final void k0(f2.a0 measureResult) {
        kotlin.jvm.internal.s.g(measureResult, "measureResult");
        this.F.S1(measureResult);
    }

    public final void m0(long j11, h2.f<d2.a0> hitTestResult, boolean z11, boolean z12) {
        kotlin.jvm.internal.s.g(hitTestResult, "hitTestResult");
        c0().y1(c0().g1(j11), hitTestResult, z11, z12);
    }

    public final void o0(long j11, h2.f<l2.x> hitSemanticsWrappers, boolean z11, boolean z12) {
        kotlin.jvm.internal.s.g(hitSemanticsWrappers, "hitSemanticsWrappers");
        c0().z1(c0().g1(j11), hitSemanticsWrappers, z12);
    }

    public final void q0(int i11, k instance) {
        kotlin.jvm.internal.s.g(instance, "instance");
        if (!(instance.f28696f == null)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot insert ");
            sb2.append(instance);
            sb2.append(" because it already has a parent. This tree: ");
            sb2.append(D(this, 0, 1, null));
            sb2.append(" Other tree: ");
            k kVar = instance.f28696f;
            sb2.append((Object) (kVar != null ? D(kVar, 0, 1, null) : null));
            throw new IllegalStateException(sb2.toString().toString());
        }
        if (instance.f28697g == null) {
            instance.f28696f = this;
            this.f28693c.a(i11, instance);
            E0();
            if (instance.f28690a) {
                if (!this.f28690a) {
                    this.f28691b++;
                } else {
                    throw new IllegalArgumentException("Virtual LayoutNode can't be added into a virtual parent".toString());
                }
            }
            t0();
            instance.c0().U1(this.F);
            f0 f0Var = this.f28697g;
            if (f0Var != null) {
                instance.z(f0Var);
                return;
            }
            return;
        }
        throw new IllegalStateException(("Cannot insert " + instance + " because it already has an owner. This tree: " + D(this, 0, 1, null) + " Other tree: " + D(instance, 0, 1, null)).toString());
    }

    public final void r0() {
        o O = O();
        if (O != null) {
            O.A1();
            return;
        }
        k e02 = e0();
        if (e02 == null) {
            return;
        }
        e02.r0();
    }

    public final void s0() {
        o c02 = c0();
        o P = P();
        while (!kotlin.jvm.internal.s.c(c02, P)) {
            e0 l12 = c02.l1();
            if (l12 != null) {
                l12.invalidate();
            }
            c02 = c02.v1();
            kotlin.jvm.internal.s.e(c02);
        }
        e0 l13 = this.F.l1();
        if (l13 == null) {
            return;
        }
        l13.invalidate();
    }

    @Override // f2.j
    public Object t() {
        return this.G.t();
    }

    public String toString() {
        return b1.b(this, null) + " children: " + J().size() + " measurePolicy: " + V();
    }

    @Override // f2.j
    public int u(int i11) {
        return this.G.u(i11);
    }

    public boolean u0() {
        return this.f28697g != null;
    }

    public final void v0() {
        this.f28710x.l();
        e eVar = this.f28699i;
        e eVar2 = e.NeedsRelayout;
        if (eVar == eVar2) {
            B0();
        }
        if (this.f28699i == eVar2) {
            this.f28699i = e.LayingOut;
            n.a(this).getSnapshotObserver().c(this, new j());
            this.f28699i = e.Ready;
        }
        if (this.f28710x.h()) {
            this.f28710x.o(true);
        }
        if (this.f28710x.a() && this.f28710x.e()) {
            this.f28710x.j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c4 A[LOOP:1: B:111:0x00be->B:113:0x00c4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(h2.f0 r7) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.k.z(h2.f0):void");
    }

    public final void z0(int i11, int i12, int i13) {
        if (i11 == i12) {
            return;
        }
        int i14 = 0;
        while (i14 < i13) {
            int i15 = i14 + 1;
            int i16 = i11 > i12 ? i11 + i14 : i11;
            this.f28693c.a(i11 > i12 ? i14 + i12 : (i12 + i13) - 2, this.f28693c.s(i16));
            i14 = i15;
        }
        E0();
        t0();
        N0();
    }

    public /* synthetic */ k(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }
}