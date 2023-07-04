package ti;

import android.util.Pair;
import java.util.Arrays;
import org.spongycastle.crypto.tls.CipherSuite;
import ti.i0;

/* loaded from: classes3.dex */
public final class n implements m {

    /* renamed from: q  reason: collision with root package name */
    private static final double[] f52121q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    private String f52122a;

    /* renamed from: b  reason: collision with root package name */
    private ji.x f52123b;

    /* renamed from: c  reason: collision with root package name */
    private final k0 f52124c;

    /* renamed from: d  reason: collision with root package name */
    private final ak.v f52125d;

    /* renamed from: e  reason: collision with root package name */
    private final u f52126e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean[] f52127f;

    /* renamed from: g  reason: collision with root package name */
    private final a f52128g;

    /* renamed from: h  reason: collision with root package name */
    private long f52129h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f52130i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f52131j;

    /* renamed from: k  reason: collision with root package name */
    private long f52132k;

    /* renamed from: l  reason: collision with root package name */
    private long f52133l;

    /* renamed from: m  reason: collision with root package name */
    private long f52134m;

    /* renamed from: n  reason: collision with root package name */
    private long f52135n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f52136o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f52137p;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        private static final byte[] f52138e = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        private boolean f52139a;

        /* renamed from: b  reason: collision with root package name */
        public int f52140b;

        /* renamed from: c  reason: collision with root package name */
        public int f52141c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f52142d;

        public a(int i11) {
            this.f52142d = new byte[i11];
        }

        public void a(byte[] bArr, int i11, int i12) {
            if (this.f52139a) {
                int i13 = i12 - i11;
                byte[] bArr2 = this.f52142d;
                int length = bArr2.length;
                int i14 = this.f52140b;
                if (length < i14 + i13) {
                    this.f52142d = Arrays.copyOf(bArr2, (i14 + i13) * 2);
                }
                System.arraycopy(bArr, i11, this.f52142d, this.f52140b, i13);
                this.f52140b += i13;
            }
        }

        public boolean b(int i11, int i12) {
            if (this.f52139a) {
                int i13 = this.f52140b - i12;
                this.f52140b = i13;
                if (this.f52141c == 0 && i11 == 181) {
                    this.f52141c = i13;
                } else {
                    this.f52139a = false;
                    return true;
                }
            } else if (i11 == 179) {
                this.f52139a = true;
            }
            byte[] bArr = f52138e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f52139a = false;
            this.f52140b = 0;
            this.f52141c = 0;
        }
    }

    public n() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair<ci.i, java.lang.Long> b(ti.n.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f52142d
            int r1 = r8.f52140b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 6
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r6 = r4 >> 4
            r2 = r2 | r6
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r5
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3d
            r7 = 3
            if (r6 == r7) goto L37
            if (r6 == r1) goto L31
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L31:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L42
        L37:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L42
        L3d:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L42:
            float r6 = (float) r6
            float r1 = r1 / r6
        L44:
            ci.i$b r6 = new ci.i$b
            r6.<init>()
            ci.i$b r9 = r6.S(r9)
            java.lang.String r6 = "video/mpeg2"
            ci.i$b r9 = r9.e0(r6)
            ci.i$b r9 = r9.j0(r2)
            ci.i$b r9 = r9.Q(r4)
            ci.i$b r9 = r9.a0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            ci.i$b r9 = r9.T(r1)
            ci.i r9 = r9.E()
            r1 = 0
            r4 = r0[r5]
            r4 = r4 & 15
            int r4 = r4 + (-1)
            if (r4 < 0) goto L9c
            double[] r5 = ti.n.f52121q
            int r6 = r5.length
            if (r4 >= r6) goto L9c
            r1 = r5[r4]
            int r8 = r8.f52141c
            int r8 = r8 + 9
            r4 = r0[r8]
            r4 = r4 & 96
            int r3 = r4 >> 5
            r8 = r0[r8]
            r8 = r8 & 31
            if (r3 == r8) goto L95
            double r3 = (double) r3
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L95:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r1 = (long) r3
        L9c:
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.n.b(ti.n$a, java.lang.String):android.util.Pair");
    }

    @Override // ti.m
    public void a() {
        ak.t.a(this.f52127f);
        this.f52128g.c();
        u uVar = this.f52126e;
        if (uVar != null) {
            uVar.d();
        }
        this.f52129h = 0L;
        this.f52130i = false;
    }

    @Override // ti.m
    public void c(ak.v vVar) {
        int i11;
        ak.a.h(this.f52123b);
        int e11 = vVar.e();
        int f11 = vVar.f();
        byte[] d11 = vVar.d();
        this.f52129h += vVar.a();
        this.f52123b.e(vVar, vVar.a());
        while (true) {
            int c11 = ak.t.c(d11, e11, f11, this.f52127f);
            if (c11 == f11) {
                break;
            }
            int i12 = c11 + 3;
            int i13 = vVar.d()[i12] & 255;
            int i14 = c11 - e11;
            if (!this.f52131j) {
                if (i14 > 0) {
                    this.f52128g.a(d11, e11, c11);
                }
                if (this.f52128g.b(i13, i14 < 0 ? -i14 : 0)) {
                    Pair<ci.i, Long> b11 = b(this.f52128g, (String) ak.a.e(this.f52122a));
                    this.f52123b.d((ci.i) b11.first);
                    this.f52132k = ((Long) b11.second).longValue();
                    this.f52131j = true;
                }
            }
            u uVar = this.f52126e;
            if (uVar != null) {
                if (i14 > 0) {
                    uVar.a(d11, e11, c11);
                    i11 = 0;
                } else {
                    i11 = -i14;
                }
                if (this.f52126e.b(i11)) {
                    u uVar2 = this.f52126e;
                    ((ak.v) ak.k0.j(this.f52125d)).M(this.f52126e.f52287d, ak.t.k(uVar2.f52287d, uVar2.f52288e));
                    ((k0) ak.k0.j(this.f52124c)).a(this.f52135n, this.f52125d);
                }
                if (i13 == 178 && vVar.d()[c11 + 2] == 1) {
                    this.f52126e.e(i13);
                }
            }
            if (i13 == 0 || i13 == 179) {
                int i15 = f11 - c11;
                if (this.f52130i && this.f52137p && this.f52131j) {
                    this.f52123b.f(this.f52135n, this.f52136o ? 1 : 0, ((int) (this.f52129h - this.f52134m)) - i15, i15, null);
                }
                boolean z11 = this.f52130i;
                if (!z11 || this.f52137p) {
                    this.f52134m = this.f52129h - i15;
                    long j11 = this.f52133l;
                    if (j11 == -9223372036854775807L) {
                        j11 = z11 ? this.f52135n + this.f52132k : 0L;
                    }
                    this.f52135n = j11;
                    this.f52136o = false;
                    this.f52133l = -9223372036854775807L;
                    this.f52130i = true;
                }
                this.f52137p = i13 == 0;
            } else if (i13 == 184) {
                this.f52136o = true;
            }
            e11 = i12;
        }
        if (!this.f52131j) {
            this.f52128g.a(d11, e11, f11);
        }
        u uVar3 = this.f52126e;
        if (uVar3 != null) {
            uVar3.a(d11, e11, f11);
        }
    }

    @Override // ti.m
    public void d() {
    }

    @Override // ti.m
    public void e(ji.j jVar, i0.d dVar) {
        dVar.a();
        this.f52122a = dVar.b();
        this.f52123b = jVar.f(dVar.c(), 2);
        k0 k0Var = this.f52124c;
        if (k0Var != null) {
            k0Var.b(jVar, dVar);
        }
    }

    @Override // ti.m
    public void f(long j11, int i11) {
        this.f52133l = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(k0 k0Var) {
        this.f52124c = k0Var;
        this.f52127f = new boolean[4];
        this.f52128g = new a(128);
        if (k0Var != null) {
            this.f52126e = new u(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, 128);
            this.f52125d = new ak.v();
            return;
        }
        this.f52126e = null;
        this.f52125d = null;
    }
}