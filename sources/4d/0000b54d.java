package ti;

import ak.t;
import android.util.SparseArray;
import ci.i;
import java.util.ArrayList;
import java.util.Arrays;
import ti.i0;

/* loaded from: classes3.dex */
public final class p implements m {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f52169a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f52170b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f52171c;

    /* renamed from: g  reason: collision with root package name */
    private long f52175g;

    /* renamed from: i  reason: collision with root package name */
    private String f52177i;

    /* renamed from: j  reason: collision with root package name */
    private ji.x f52178j;

    /* renamed from: k  reason: collision with root package name */
    private b f52179k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f52180l;

    /* renamed from: m  reason: collision with root package name */
    private long f52181m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f52182n;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f52176h = new boolean[3];

    /* renamed from: d  reason: collision with root package name */
    private final u f52172d = new u(7, 128);

    /* renamed from: e  reason: collision with root package name */
    private final u f52173e = new u(8, 128);

    /* renamed from: f  reason: collision with root package name */
    private final u f52174f = new u(6, 128);

    /* renamed from: o  reason: collision with root package name */
    private final ak.v f52183o = new ak.v();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final ji.x f52184a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f52185b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f52186c;

        /* renamed from: f  reason: collision with root package name */
        private final ak.w f52189f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f52190g;

        /* renamed from: h  reason: collision with root package name */
        private int f52191h;

        /* renamed from: i  reason: collision with root package name */
        private int f52192i;

        /* renamed from: j  reason: collision with root package name */
        private long f52193j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f52194k;

        /* renamed from: l  reason: collision with root package name */
        private long f52195l;

        /* renamed from: o  reason: collision with root package name */
        private boolean f52198o;

        /* renamed from: p  reason: collision with root package name */
        private long f52199p;

        /* renamed from: q  reason: collision with root package name */
        private long f52200q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f52201r;

        /* renamed from: d  reason: collision with root package name */
        private final SparseArray<t.b> f52187d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        private final SparseArray<t.a> f52188e = new SparseArray<>();

        /* renamed from: m  reason: collision with root package name */
        private a f52196m = new a();

        /* renamed from: n  reason: collision with root package name */
        private a f52197n = new a();

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private boolean f52202a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f52203b;

            /* renamed from: c  reason: collision with root package name */
            private t.b f52204c;

            /* renamed from: d  reason: collision with root package name */
            private int f52205d;

            /* renamed from: e  reason: collision with root package name */
            private int f52206e;

            /* renamed from: f  reason: collision with root package name */
            private int f52207f;

            /* renamed from: g  reason: collision with root package name */
            private int f52208g;

            /* renamed from: h  reason: collision with root package name */
            private boolean f52209h;

            /* renamed from: i  reason: collision with root package name */
            private boolean f52210i;

            /* renamed from: j  reason: collision with root package name */
            private boolean f52211j;

            /* renamed from: k  reason: collision with root package name */
            private boolean f52212k;

            /* renamed from: l  reason: collision with root package name */
            private int f52213l;

            /* renamed from: m  reason: collision with root package name */
            private int f52214m;

            /* renamed from: n  reason: collision with root package name */
            private int f52215n;

            /* renamed from: o  reason: collision with root package name */
            private int f52216o;

            /* renamed from: p  reason: collision with root package name */
            private int f52217p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a aVar) {
                int i11;
                int i12;
                int i13;
                boolean z11;
                if (this.f52202a) {
                    if (aVar.f52202a) {
                        t.b bVar = (t.b) ak.a.h(this.f52204c);
                        t.b bVar2 = (t.b) ak.a.h(aVar.f52204c);
                        return (this.f52207f == aVar.f52207f && this.f52208g == aVar.f52208g && this.f52209h == aVar.f52209h && (!this.f52210i || !aVar.f52210i || this.f52211j == aVar.f52211j) && (((i11 = this.f52205d) == (i12 = aVar.f52205d) || (i11 != 0 && i12 != 0)) && (((i13 = bVar.f536k) != 0 || bVar2.f536k != 0 || (this.f52214m == aVar.f52214m && this.f52215n == aVar.f52215n)) && ((i13 != 1 || bVar2.f536k != 1 || (this.f52216o == aVar.f52216o && this.f52217p == aVar.f52217p)) && (z11 = this.f52212k) == aVar.f52212k && (!z11 || this.f52213l == aVar.f52213l))))) ? false : true;
                    }
                    return true;
                }
                return false;
            }

            public void b() {
                this.f52203b = false;
                this.f52202a = false;
            }

            public boolean d() {
                int i11;
                return this.f52203b && ((i11 = this.f52206e) == 7 || i11 == 2);
            }

            public void e(t.b bVar, int i11, int i12, int i13, int i14, boolean z11, boolean z12, boolean z13, boolean z14, int i15, int i16, int i17, int i18, int i19) {
                this.f52204c = bVar;
                this.f52205d = i11;
                this.f52206e = i12;
                this.f52207f = i13;
                this.f52208g = i14;
                this.f52209h = z11;
                this.f52210i = z12;
                this.f52211j = z13;
                this.f52212k = z14;
                this.f52213l = i15;
                this.f52214m = i16;
                this.f52215n = i17;
                this.f52216o = i18;
                this.f52217p = i19;
                this.f52202a = true;
                this.f52203b = true;
            }

            public void f(int i11) {
                this.f52206e = i11;
                this.f52203b = true;
            }
        }

        public b(ji.x xVar, boolean z11, boolean z12) {
            this.f52184a = xVar;
            this.f52185b = z11;
            this.f52186c = z12;
            byte[] bArr = new byte[128];
            this.f52190g = bArr;
            this.f52189f = new ak.w(bArr, 0, 0);
            g();
        }

        private void d(int i11) {
            boolean z11 = this.f52201r;
            this.f52184a.f(this.f52200q, z11 ? 1 : 0, (int) (this.f52193j - this.f52199p), i11, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0152  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 414
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ti.p.b.a(byte[], int, int):void");
        }

        public boolean b(long j11, int i11, boolean z11, boolean z12) {
            boolean z13 = false;
            if (this.f52192i == 9 || (this.f52186c && this.f52197n.c(this.f52196m))) {
                if (z11 && this.f52198o) {
                    d(i11 + ((int) (j11 - this.f52193j)));
                }
                this.f52199p = this.f52193j;
                this.f52200q = this.f52195l;
                this.f52201r = false;
                this.f52198o = true;
            }
            if (this.f52185b) {
                z12 = this.f52197n.d();
            }
            boolean z14 = this.f52201r;
            int i12 = this.f52192i;
            if (i12 == 5 || (z12 && i12 == 1)) {
                z13 = true;
            }
            boolean z15 = z14 | z13;
            this.f52201r = z15;
            return z15;
        }

        public boolean c() {
            return this.f52186c;
        }

        public void e(t.a aVar) {
            this.f52188e.append(aVar.f523a, aVar);
        }

        public void f(t.b bVar) {
            this.f52187d.append(bVar.f529d, bVar);
        }

        public void g() {
            this.f52194k = false;
            this.f52198o = false;
            this.f52197n.b();
        }

        public void h(long j11, int i11, long j12) {
            this.f52192i = i11;
            this.f52195l = j12;
            this.f52193j = j11;
            if (!this.f52185b || i11 != 1) {
                if (!this.f52186c) {
                    return;
                }
                if (i11 != 5 && i11 != 1 && i11 != 2) {
                    return;
                }
            }
            a aVar = this.f52196m;
            this.f52196m = this.f52197n;
            this.f52197n = aVar;
            aVar.b();
            this.f52191h = 0;
            this.f52194k = true;
        }
    }

    public p(d0 d0Var, boolean z11, boolean z12) {
        this.f52169a = d0Var;
        this.f52170b = z11;
        this.f52171c = z12;
    }

    private void b() {
        ak.a.h(this.f52178j);
        ak.k0.j(this.f52179k);
    }

    private void g(long j11, int i11, int i12, long j12) {
        if (!this.f52180l || this.f52179k.c()) {
            this.f52172d.b(i12);
            this.f52173e.b(i12);
            if (!this.f52180l) {
                if (this.f52172d.c() && this.f52173e.c()) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = this.f52172d;
                    arrayList.add(Arrays.copyOf(uVar.f52287d, uVar.f52288e));
                    u uVar2 = this.f52173e;
                    arrayList.add(Arrays.copyOf(uVar2.f52287d, uVar2.f52288e));
                    u uVar3 = this.f52172d;
                    t.b i13 = ak.t.i(uVar3.f52287d, 3, uVar3.f52288e);
                    u uVar4 = this.f52173e;
                    t.a h11 = ak.t.h(uVar4.f52287d, 3, uVar4.f52288e);
                    this.f52178j.d(new i.b().S(this.f52177i).e0("video/avc").I(ak.c.a(i13.f526a, i13.f527b, i13.f528c)).j0(i13.f530e).Q(i13.f531f).a0(i13.f532g).T(arrayList).E());
                    this.f52180l = true;
                    this.f52179k.f(i13);
                    this.f52179k.e(h11);
                    this.f52172d.d();
                    this.f52173e.d();
                }
            } else if (this.f52172d.c()) {
                u uVar5 = this.f52172d;
                this.f52179k.f(ak.t.i(uVar5.f52287d, 3, uVar5.f52288e));
                this.f52172d.d();
            } else if (this.f52173e.c()) {
                u uVar6 = this.f52173e;
                this.f52179k.e(ak.t.h(uVar6.f52287d, 3, uVar6.f52288e));
                this.f52173e.d();
            }
        }
        if (this.f52174f.b(i12)) {
            u uVar7 = this.f52174f;
            this.f52183o.M(this.f52174f.f52287d, ak.t.k(uVar7.f52287d, uVar7.f52288e));
            this.f52183o.O(4);
            this.f52169a.a(j12, this.f52183o);
        }
        if (this.f52179k.b(j11, i11, this.f52180l, this.f52182n)) {
            this.f52182n = false;
        }
    }

    private void h(byte[] bArr, int i11, int i12) {
        if (!this.f52180l || this.f52179k.c()) {
            this.f52172d.a(bArr, i11, i12);
            this.f52173e.a(bArr, i11, i12);
        }
        this.f52174f.a(bArr, i11, i12);
        this.f52179k.a(bArr, i11, i12);
    }

    private void i(long j11, int i11, long j12) {
        if (!this.f52180l || this.f52179k.c()) {
            this.f52172d.e(i11);
            this.f52173e.e(i11);
        }
        this.f52174f.e(i11);
        this.f52179k.h(j11, i11, j12);
    }

    @Override // ti.m
    public void a() {
        this.f52175g = 0L;
        this.f52182n = false;
        ak.t.a(this.f52176h);
        this.f52172d.d();
        this.f52173e.d();
        this.f52174f.d();
        b bVar = this.f52179k;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // ti.m
    public void c(ak.v vVar) {
        b();
        int e11 = vVar.e();
        int f11 = vVar.f();
        byte[] d11 = vVar.d();
        this.f52175g += vVar.a();
        this.f52178j.e(vVar, vVar.a());
        while (true) {
            int c11 = ak.t.c(d11, e11, f11, this.f52176h);
            if (c11 == f11) {
                h(d11, e11, f11);
                return;
            }
            int f12 = ak.t.f(d11, c11);
            int i11 = c11 - e11;
            if (i11 > 0) {
                h(d11, e11, c11);
            }
            int i12 = f11 - c11;
            long j11 = this.f52175g - i12;
            g(j11, i12, i11 < 0 ? -i11 : 0, this.f52181m);
            i(j11, f12, this.f52181m);
            e11 = c11 + 3;
        }
    }

    @Override // ti.m
    public void d() {
    }

    @Override // ti.m
    public void e(ji.j jVar, i0.d dVar) {
        dVar.a();
        this.f52177i = dVar.b();
        ji.x f11 = jVar.f(dVar.c(), 2);
        this.f52178j = f11;
        this.f52179k = new b(f11, this.f52170b, this.f52171c);
        this.f52169a.b(jVar, dVar);
    }

    @Override // ti.m
    public void f(long j11, int i11) {
        this.f52181m = j11;
        this.f52182n |= (i11 & 2) != 0;
    }
}