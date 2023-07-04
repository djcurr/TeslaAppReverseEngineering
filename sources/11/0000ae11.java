package qi;

import ak.g0;
import ak.k0;
import ak.t;
import ak.v;
import android.util.Pair;
import android.util.SparseArray;
import ci.i;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import ji.u;
import ji.v;
import ji.x;
import qi.a;

/* loaded from: classes3.dex */
public class g implements ji.h {
    private static final byte[] I;
    private static final ci.i J;
    private int A;
    private int B;
    private int C;
    private boolean D;
    private ji.j E;
    private x[] F;
    private x[] G;
    private boolean H;

    /* renamed from: a */
    private final int f48209a;

    /* renamed from: b */
    private final o f48210b;

    /* renamed from: c */
    private final List<ci.i> f48211c;

    /* renamed from: d */
    private final SparseArray<b> f48212d;

    /* renamed from: e */
    private final v f48213e;

    /* renamed from: f */
    private final v f48214f;

    /* renamed from: g */
    private final v f48215g;

    /* renamed from: h */
    private final byte[] f48216h;

    /* renamed from: i */
    private final v f48217i;

    /* renamed from: j */
    private final g0 f48218j;

    /* renamed from: k */
    private final yi.c f48219k;

    /* renamed from: l */
    private final v f48220l;

    /* renamed from: m */
    private final ArrayDeque<a.C1029a> f48221m;

    /* renamed from: n */
    private final ArrayDeque<a> f48222n;

    /* renamed from: o */
    private final x f48223o;

    /* renamed from: p */
    private int f48224p;

    /* renamed from: q */
    private int f48225q;

    /* renamed from: r */
    private long f48226r;

    /* renamed from: s */
    private int f48227s;

    /* renamed from: t */
    private v f48228t;

    /* renamed from: u */
    private long f48229u;

    /* renamed from: v */
    private int f48230v;

    /* renamed from: w */
    private long f48231w;

    /* renamed from: x */
    private long f48232x;

    /* renamed from: y */
    private long f48233y;

    /* renamed from: z */
    private b f48234z;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        public final long f48235a;

        /* renamed from: b */
        public final int f48236b;

        public a(long j11, int i11) {
            this.f48235a = j11;
            this.f48236b = i11;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        public final x f48237a;

        /* renamed from: d */
        public r f48240d;

        /* renamed from: e */
        public c f48241e;

        /* renamed from: f */
        public int f48242f;

        /* renamed from: g */
        public int f48243g;

        /* renamed from: h */
        public int f48244h;

        /* renamed from: i */
        public int f48245i;

        /* renamed from: l */
        private boolean f48248l;

        /* renamed from: b */
        public final q f48238b = new q();

        /* renamed from: c */
        public final v f48239c = new v();

        /* renamed from: j */
        private final v f48246j = new v(1);

        /* renamed from: k */
        private final v f48247k = new v();

        public b(x xVar, r rVar, c cVar) {
            this.f48237a = xVar;
            this.f48240d = rVar;
            this.f48241e = cVar;
            j(rVar, cVar);
        }

        public int c() {
            int i11;
            if (!this.f48248l) {
                i11 = this.f48240d.f48332g[this.f48242f];
            } else {
                i11 = this.f48238b.f48318l[this.f48242f] ? 1 : 0;
            }
            return g() != null ? i11 | 1073741824 : i11;
        }

        public long d() {
            if (!this.f48248l) {
                return this.f48240d.f48328c[this.f48242f];
            }
            return this.f48238b.f48313g[this.f48244h];
        }

        public long e() {
            if (!this.f48248l) {
                return this.f48240d.f48331f[this.f48242f];
            }
            return this.f48238b.c(this.f48242f);
        }

        public int f() {
            if (!this.f48248l) {
                return this.f48240d.f48329d[this.f48242f];
            }
            return this.f48238b.f48315i[this.f48242f];
        }

        public p g() {
            if (this.f48248l) {
                int i11 = ((c) k0.j(this.f48238b.f48307a)).f48197a;
                p pVar = this.f48238b.f48321o;
                if (pVar == null) {
                    pVar = this.f48240d.f48326a.a(i11);
                }
                if (pVar == null || !pVar.f48302a) {
                    return null;
                }
                return pVar;
            }
            return null;
        }

        public boolean h() {
            this.f48242f++;
            if (this.f48248l) {
                int i11 = this.f48243g + 1;
                this.f48243g = i11;
                int[] iArr = this.f48238b.f48314h;
                int i12 = this.f48244h;
                if (i11 == iArr[i12]) {
                    this.f48244h = i12 + 1;
                    this.f48243g = 0;
                    return false;
                }
                return true;
            }
            return false;
        }

        public int i(int i11, int i12) {
            v vVar;
            p g11 = g();
            if (g11 == null) {
                return 0;
            }
            int i13 = g11.f48305d;
            if (i13 != 0) {
                vVar = this.f48238b.f48322p;
            } else {
                byte[] bArr = (byte[]) k0.j(g11.f48306e);
                this.f48247k.M(bArr, bArr.length);
                v vVar2 = this.f48247k;
                i13 = bArr.length;
                vVar = vVar2;
            }
            boolean g12 = this.f48238b.g(this.f48242f);
            boolean z11 = g12 || i12 != 0;
            this.f48246j.d()[0] = (byte) ((z11 ? 128 : 0) | i13);
            this.f48246j.O(0);
            this.f48237a.c(this.f48246j, 1, 1);
            this.f48237a.c(vVar, i13, 1);
            if (z11) {
                if (!g12) {
                    this.f48239c.K(8);
                    byte[] d11 = this.f48239c.d();
                    d11[0] = 0;
                    d11[1] = 1;
                    d11[2] = (byte) ((i12 >> 8) & 255);
                    d11[3] = (byte) (i12 & 255);
                    d11[4] = (byte) ((i11 >> 24) & 255);
                    d11[5] = (byte) ((i11 >> 16) & 255);
                    d11[6] = (byte) ((i11 >> 8) & 255);
                    d11[7] = (byte) (i11 & 255);
                    this.f48237a.c(this.f48239c, 8, 1);
                    return i13 + 1 + 8;
                }
                v vVar3 = this.f48238b.f48322p;
                int I = vVar3.I();
                vVar3.P(-2);
                int i14 = (I * 6) + 2;
                if (i12 != 0) {
                    this.f48239c.K(i14);
                    byte[] d12 = this.f48239c.d();
                    vVar3.j(d12, 0, i14);
                    int i15 = (((d12[2] & 255) << 8) | (d12[3] & 255)) + i12;
                    d12[2] = (byte) ((i15 >> 8) & 255);
                    d12[3] = (byte) (i15 & 255);
                    vVar3 = this.f48239c;
                }
                this.f48237a.c(vVar3, i14, 1);
                return i13 + 1 + i14;
            }
            return i13 + 1;
        }

        public void j(r rVar, c cVar) {
            this.f48240d = rVar;
            this.f48241e = cVar;
            this.f48237a.d(rVar.f48326a.f48296f);
            k();
        }

        public void k() {
            this.f48238b.f();
            this.f48242f = 0;
            this.f48244h = 0;
            this.f48243g = 0;
            this.f48245i = 0;
            this.f48248l = false;
        }

        public void l(long j11) {
            int i11 = this.f48242f;
            while (true) {
                q qVar = this.f48238b;
                if (i11 >= qVar.f48312f || qVar.c(i11) >= j11) {
                    return;
                }
                if (this.f48238b.f48318l[i11]) {
                    this.f48245i = i11;
                }
                i11++;
            }
        }

        public void m() {
            p g11 = g();
            if (g11 == null) {
                return;
            }
            v vVar = this.f48238b.f48322p;
            int i11 = g11.f48305d;
            if (i11 != 0) {
                vVar.P(i11);
            }
            if (this.f48238b.g(this.f48242f)) {
                vVar.P(vVar.I() * 6);
            }
        }

        public void n(com.google.android.exoplayer2.drm.e eVar) {
            p a11 = this.f48240d.f48326a.a(((c) k0.j(this.f48238b.f48307a)).f48197a);
            this.f48237a.d(this.f48240d.f48326a.f48296f.a().L(eVar.c(a11 != null ? a11.f48303b : null)).E());
        }
    }

    static {
        f fVar = new ji.l() { // from class: qi.f
            @Override // ji.l
            public final ji.h[] b() {
                return g.c();
            }
        };
        I = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        J = new i.b().e0("application/x-emsg").E();
    }

    public g() {
        this(0);
    }

    private static void A(v vVar, q qVar) {
        z(vVar, 0, qVar);
    }

    private static Pair<Long, ji.c> B(v vVar, long j11) {
        long H;
        long H2;
        int[] iArr;
        vVar.O(8);
        int c11 = qi.a.c(vVar.m());
        vVar.P(4);
        long E = vVar.E();
        if (c11 == 0) {
            H = vVar.E();
            H2 = vVar.E();
        } else {
            H = vVar.H();
            H2 = vVar.H();
        }
        long j12 = H;
        long j13 = j11 + H2;
        long I0 = k0.I0(j12, 1000000L, E);
        vVar.P(2);
        int I2 = vVar.I();
        int[] iArr2 = new int[I2];
        long[] jArr = new long[I2];
        long[] jArr2 = new long[I2];
        long[] jArr3 = new long[I2];
        long j14 = I0;
        int i11 = 0;
        long j15 = j12;
        while (i11 < I2) {
            int m11 = vVar.m();
            if ((m11 & Integer.MIN_VALUE) == 0) {
                long E2 = vVar.E();
                iArr2[i11] = m11 & Integer.MAX_VALUE;
                jArr[i11] = j13;
                jArr3[i11] = j14;
                long j16 = j15 + E2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i12 = I2;
                long I02 = k0.I0(j16, 1000000L, E);
                jArr4[i11] = I02 - jArr5[i11];
                vVar.P(4);
                j13 += iArr[i11];
                i11++;
                iArr2 = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                I2 = i12;
                j15 = j16;
                j14 = I02;
            } else {
                throw new ParserException("Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(I0), new ji.c(iArr2, jArr, jArr2, jArr3));
    }

    private static long C(v vVar) {
        vVar.O(8);
        return qi.a.c(vVar.m()) == 1 ? vVar.H() : vVar.E();
    }

    private static b D(v vVar, SparseArray<b> sparseArray) {
        int i11;
        int i12;
        int i13;
        int i14;
        vVar.O(8);
        int b11 = qi.a.b(vVar.m());
        b k11 = k(sparseArray, vVar.m());
        if (k11 == null) {
            return null;
        }
        if ((b11 & 1) != 0) {
            long H = vVar.H();
            q qVar = k11.f48238b;
            qVar.f48309c = H;
            qVar.f48310d = H;
        }
        c cVar = k11.f48241e;
        if ((b11 & 2) != 0) {
            i11 = vVar.m() - 1;
        } else {
            i11 = cVar.f48197a;
        }
        if ((b11 & 8) != 0) {
            i12 = vVar.m();
        } else {
            i12 = cVar.f48198b;
        }
        if ((b11 & 16) != 0) {
            i13 = vVar.m();
        } else {
            i13 = cVar.f48199c;
        }
        if ((b11 & 32) != 0) {
            i14 = vVar.m();
        } else {
            i14 = cVar.f48200d;
        }
        k11.f48238b.f48307a = new c(i11, i12, i13, i14);
        return k11;
    }

    private static void E(a.C1029a c1029a, SparseArray<b> sparseArray, int i11, byte[] bArr) {
        b D = D(((a.b) ak.a.e(c1029a.g(1952868452))).f48171b, sparseArray);
        if (D == null) {
            return;
        }
        q qVar = D.f48238b;
        long j11 = qVar.f48324r;
        boolean z11 = qVar.f48325s;
        D.k();
        D.f48248l = true;
        a.b g11 = c1029a.g(1952867444);
        if (g11 != null && (i11 & 2) == 0) {
            qVar.f48324r = C(g11.f48171b);
            qVar.f48325s = true;
        } else {
            qVar.f48324r = j11;
            qVar.f48325s = z11;
        }
        H(c1029a, D, i11);
        p a11 = D.f48240d.f48326a.a(((c) ak.a.e(qVar.f48307a)).f48197a);
        a.b g12 = c1029a.g(1935763834);
        if (g12 != null) {
            x((p) ak.a.e(a11), g12.f48171b, qVar);
        }
        a.b g13 = c1029a.g(1935763823);
        if (g13 != null) {
            w(g13.f48171b, qVar);
        }
        a.b g14 = c1029a.g(1936027235);
        if (g14 != null) {
            A(g14.f48171b, qVar);
        }
        y(c1029a, a11 != null ? a11.f48303b : null, qVar);
        int size = c1029a.f48169c.size();
        for (int i12 = 0; i12 < size; i12++) {
            a.b bVar = c1029a.f48169c.get(i12);
            if (bVar.f48167a == 1970628964) {
                I(bVar.f48171b, qVar, bArr);
            }
        }
    }

    private static Pair<Integer, c> F(v vVar) {
        vVar.O(12);
        return Pair.create(Integer.valueOf(vVar.m()), new c(vVar.m() - 1, vVar.m(), vVar.m(), vVar.m()));
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int G(qi.g.b r36, int r37, int r38, ak.v r39, int r40) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qi.g.G(qi.g$b, int, int, ak.v, int):int");
    }

    private static void H(a.C1029a c1029a, b bVar, int i11) {
        List<a.b> list = c1029a.f48169c;
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            a.b bVar2 = list.get(i14);
            if (bVar2.f48167a == 1953658222) {
                v vVar = bVar2.f48171b;
                vVar.O(12);
                int G = vVar.G();
                if (G > 0) {
                    i13 += G;
                    i12++;
                }
            }
        }
        bVar.f48244h = 0;
        bVar.f48243g = 0;
        bVar.f48242f = 0;
        bVar.f48238b.e(i12, i13);
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            a.b bVar3 = list.get(i17);
            if (bVar3.f48167a == 1953658222) {
                i16 = G(bVar, i15, i11, bVar3.f48171b, i16);
                i15++;
            }
        }
    }

    private static void I(v vVar, q qVar, byte[] bArr) {
        vVar.O(8);
        vVar.j(bArr, 0, 16);
        if (Arrays.equals(bArr, I)) {
            z(vVar, 16, qVar);
        }
    }

    private void J(long j11) {
        while (!this.f48221m.isEmpty() && this.f48221m.peek().f48168b == j11) {
            o(this.f48221m.pop());
        }
        g();
    }

    private boolean K(ji.i iVar) {
        if (this.f48227s == 0) {
            if (!iVar.e(this.f48220l.d(), 0, 8, true)) {
                return false;
            }
            this.f48227s = 8;
            this.f48220l.O(0);
            this.f48226r = this.f48220l.E();
            this.f48225q = this.f48220l.m();
        }
        long j11 = this.f48226r;
        if (j11 == 1) {
            iVar.readFully(this.f48220l.d(), 8, 8);
            this.f48227s += 8;
            this.f48226r = this.f48220l.H();
        } else if (j11 == 0) {
            long length = iVar.getLength();
            if (length == -1 && !this.f48221m.isEmpty()) {
                length = this.f48221m.peek().f48168b;
            }
            if (length != -1) {
                this.f48226r = (length - iVar.getPosition()) + this.f48227s;
            }
        }
        if (this.f48226r >= this.f48227s) {
            long position = iVar.getPosition() - this.f48227s;
            int i11 = this.f48225q;
            if ((i11 == 1836019558 || i11 == 1835295092) && !this.H) {
                this.E.p(new v.b(this.f48232x, position));
                this.H = true;
            }
            if (this.f48225q == 1836019558) {
                int size = this.f48212d.size();
                for (int i12 = 0; i12 < size; i12++) {
                    q qVar = this.f48212d.valueAt(i12).f48238b;
                    qVar.f48308b = position;
                    qVar.f48310d = position;
                    qVar.f48309c = position;
                }
            }
            int i13 = this.f48225q;
            if (i13 == 1835295092) {
                this.f48234z = null;
                this.f48229u = position + this.f48226r;
                this.f48224p = 2;
                return true;
            }
            if (O(i13)) {
                long position2 = (iVar.getPosition() + this.f48226r) - 8;
                this.f48221m.push(new a.C1029a(this.f48225q, position2));
                if (this.f48226r == this.f48227s) {
                    J(position2);
                } else {
                    g();
                }
            } else if (P(this.f48225q)) {
                if (this.f48227s == 8) {
                    long j12 = this.f48226r;
                    if (j12 <= 2147483647L) {
                        ak.v vVar = new ak.v((int) j12);
                        System.arraycopy(this.f48220l.d(), 0, vVar.d(), 0, 8);
                        this.f48228t = vVar;
                        this.f48224p = 1;
                    } else {
                        throw new ParserException("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw new ParserException("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.f48226r <= 2147483647L) {
                this.f48228t = null;
                this.f48224p = 1;
            } else {
                throw new ParserException("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw new ParserException("Atom size less than header length (unsupported).");
    }

    private void L(ji.i iVar) {
        int i11 = ((int) this.f48226r) - this.f48227s;
        ak.v vVar = this.f48228t;
        if (vVar != null) {
            iVar.readFully(vVar.d(), 8, i11);
            q(new a.b(this.f48225q, vVar), iVar.getPosition());
        } else {
            iVar.k(i11);
        }
        J(iVar.getPosition());
    }

    private void M(ji.i iVar) {
        int size = this.f48212d.size();
        b bVar = null;
        long j11 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = this.f48212d.valueAt(i11).f48238b;
            if (qVar.f48323q) {
                long j12 = qVar.f48310d;
                if (j12 < j11) {
                    bVar = this.f48212d.valueAt(i11);
                    j11 = j12;
                }
            }
        }
        if (bVar == null) {
            this.f48224p = 3;
            return;
        }
        int position = (int) (j11 - iVar.getPosition());
        if (position >= 0) {
            iVar.k(position);
            bVar.f48238b.b(iVar);
            return;
        }
        throw new ParserException("Offset to encryption data was negative.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean N(ji.i iVar) {
        int a11;
        b bVar = this.f48234z;
        if (bVar == null) {
            bVar = j(this.f48212d);
            if (bVar == null) {
                int position = (int) (this.f48229u - iVar.getPosition());
                if (position >= 0) {
                    iVar.k(position);
                    g();
                    return false;
                }
                throw new ParserException("Offset to end of mdat was negative.");
            }
            int d11 = (int) (bVar.d() - iVar.getPosition());
            if (d11 < 0) {
                ak.o.h("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                d11 = 0;
            }
            iVar.k(d11);
            this.f48234z = bVar;
        }
        int i11 = 4;
        int i12 = 1;
        if (this.f48224p == 3) {
            int f11 = bVar.f();
            this.A = f11;
            if (bVar.f48242f < bVar.f48245i) {
                iVar.k(f11);
                bVar.m();
                if (!bVar.h()) {
                    this.f48234z = null;
                }
                this.f48224p = 3;
                return true;
            }
            if (bVar.f48240d.f48326a.f48297g == 1) {
                this.A = f11 - 8;
                iVar.k(8);
            }
            if ("audio/ac4".equals(bVar.f48240d.f48326a.f48296f.f9205l)) {
                this.B = bVar.i(this.A, 7);
                ei.c.a(this.A, this.f48217i);
                bVar.f48237a.e(this.f48217i, 7);
                this.B += 7;
            } else {
                this.B = bVar.i(this.A, 0);
            }
            this.A += this.B;
            this.f48224p = 4;
            this.C = 0;
        }
        o oVar = bVar.f48240d.f48326a;
        x xVar = bVar.f48237a;
        long e11 = bVar.e();
        g0 g0Var = this.f48218j;
        if (g0Var != null) {
            e11 = g0Var.a(e11);
        }
        long j11 = e11;
        if (oVar.f48300j == 0) {
            while (true) {
                int i13 = this.B;
                int i14 = this.A;
                if (i13 >= i14) {
                    break;
                }
                this.B += xVar.a(iVar, i14 - i13, false);
            }
        } else {
            byte[] d12 = this.f48214f.d();
            d12[0] = 0;
            d12[1] = 0;
            d12[2] = 0;
            int i15 = oVar.f48300j;
            int i16 = i15 + 1;
            int i17 = 4 - i15;
            while (this.B < this.A) {
                int i18 = this.C;
                if (i18 == 0) {
                    iVar.readFully(d12, i17, i16);
                    this.f48214f.O(0);
                    int m11 = this.f48214f.m();
                    if (m11 >= i12) {
                        this.C = m11 - 1;
                        this.f48213e.O(0);
                        xVar.e(this.f48213e, i11);
                        xVar.e(this.f48214f, i12);
                        this.D = (this.G.length <= 0 || !t.g(oVar.f48296f.f9205l, d12[i11])) ? 0 : i12;
                        this.B += 5;
                        this.A += i17;
                    } else {
                        throw new ParserException("Invalid NAL length");
                    }
                } else {
                    if (this.D) {
                        this.f48215g.K(i18);
                        iVar.readFully(this.f48215g.d(), 0, this.C);
                        xVar.e(this.f48215g, this.C);
                        a11 = this.C;
                        int k11 = t.k(this.f48215g.d(), this.f48215g.f());
                        this.f48215g.O("video/hevc".equals(oVar.f48296f.f9205l) ? 1 : 0);
                        this.f48215g.N(k11);
                        ji.b.a(j11, this.f48215g, this.G);
                    } else {
                        a11 = xVar.a(iVar, i18, false);
                    }
                    this.B += a11;
                    this.C -= a11;
                    i11 = 4;
                    i12 = 1;
                }
            }
        }
        int c11 = bVar.c();
        p g11 = bVar.g();
        xVar.f(j11, c11, this.A, 0, g11 != null ? g11.f48304c : null);
        t(j11);
        if (!bVar.h()) {
            this.f48234z = null;
        }
        this.f48224p = 3;
        return true;
    }

    private static boolean O(int i11) {
        return i11 == 1836019574 || i11 == 1953653099 || i11 == 1835297121 || i11 == 1835626086 || i11 == 1937007212 || i11 == 1836019558 || i11 == 1953653094 || i11 == 1836475768 || i11 == 1701082227;
    }

    private static boolean P(int i11) {
        return i11 == 1751411826 || i11 == 1835296868 || i11 == 1836476516 || i11 == 1936286840 || i11 == 1937011556 || i11 == 1937011827 || i11 == 1668576371 || i11 == 1937011555 || i11 == 1937011578 || i11 == 1937013298 || i11 == 1937007471 || i11 == 1668232756 || i11 == 1937011571 || i11 == 1952867444 || i11 == 1952868452 || i11 == 1953196132 || i11 == 1953654136 || i11 == 1953658222 || i11 == 1886614376 || i11 == 1935763834 || i11 == 1935763823 || i11 == 1936027235 || i11 == 1970628964 || i11 == 1935828848 || i11 == 1936158820 || i11 == 1701606260 || i11 == 1835362404 || i11 == 1701671783;
    }

    public static /* synthetic */ ji.h[] c() {
        return m();
    }

    private static int f(int i11) {
        if (i11 >= 0) {
            return i11;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("Unexpected negative value: ");
        sb2.append(i11);
        throw new ParserException(sb2.toString());
    }

    private void g() {
        this.f48224p = 0;
        this.f48227s = 0;
    }

    private c h(SparseArray<c> sparseArray, int i11) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (c) ak.a.e(sparseArray.get(i11));
    }

    private static com.google.android.exoplayer2.drm.e i(List<a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < size; i11++) {
            a.b bVar = list.get(i11);
            if (bVar.f48167a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] d11 = bVar.f48171b.d();
                UUID f11 = l.f(d11);
                if (f11 == null) {
                    ak.o.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new e.b(f11, "video/mp4", d11));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new com.google.android.exoplayer2.drm.e(arrayList);
    }

    private static b j(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j11 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            b valueAt = sparseArray.valueAt(i11);
            if ((valueAt.f48248l || valueAt.f48242f != valueAt.f48240d.f48327b) && (!valueAt.f48248l || valueAt.f48244h != valueAt.f48238b.f48311e)) {
                long d11 = valueAt.d();
                if (d11 < j11) {
                    bVar = valueAt;
                    j11 = d11;
                }
            }
        }
        return bVar;
    }

    private static b k(SparseArray<b> sparseArray, int i11) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i11);
    }

    private void l() {
        int i11;
        x[] xVarArr = new x[2];
        this.F = xVarArr;
        x xVar = this.f48223o;
        int i12 = 0;
        if (xVar != null) {
            xVarArr[0] = xVar;
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i13 = 100;
        if ((this.f48209a & 4) != 0) {
            xVarArr[i11] = this.E.f(100, 5);
            i11++;
            i13 = 101;
        }
        x[] xVarArr2 = (x[]) k0.B0(this.F, i11);
        this.F = xVarArr2;
        for (x xVar2 : xVarArr2) {
            xVar2.d(J);
        }
        this.G = new x[this.f48211c.size()];
        while (i12 < this.G.length) {
            x f11 = this.E.f(i13, 3);
            f11.d(this.f48211c.get(i12));
            this.G[i12] = f11;
            i12++;
            i13++;
        }
    }

    public static /* synthetic */ ji.h[] m() {
        return new ji.h[]{new g()};
    }

    private void o(a.C1029a c1029a) {
        int i11 = c1029a.f48167a;
        if (i11 == 1836019574) {
            s(c1029a);
        } else if (i11 == 1836019558) {
            r(c1029a);
        } else if (this.f48221m.isEmpty()) {
        } else {
            this.f48221m.peek().d(c1029a);
        }
    }

    private void p(ak.v vVar) {
        long I0;
        String str;
        long I02;
        String str2;
        long E;
        long j11;
        x[] xVarArr;
        if (this.F.length == 0) {
            return;
        }
        vVar.O(8);
        int c11 = qi.a.c(vVar.m());
        if (c11 == 0) {
            String str3 = (String) ak.a.e(vVar.w());
            String str4 = (String) ak.a.e(vVar.w());
            long E2 = vVar.E();
            I0 = k0.I0(vVar.E(), 1000000L, E2);
            long j12 = this.f48233y;
            long j13 = j12 != -9223372036854775807L ? j12 + I0 : -9223372036854775807L;
            str = str3;
            I02 = k0.I0(vVar.E(), 1000L, E2);
            str2 = str4;
            E = vVar.E();
            j11 = j13;
        } else if (c11 != 1) {
            StringBuilder sb2 = new StringBuilder(46);
            sb2.append("Skipping unsupported emsg version: ");
            sb2.append(c11);
            ak.o.h("FragmentedMp4Extractor", sb2.toString());
            return;
        } else {
            long E3 = vVar.E();
            j11 = k0.I0(vVar.H(), 1000000L, E3);
            long I03 = k0.I0(vVar.E(), 1000L, E3);
            long E4 = vVar.E();
            str = (String) ak.a.e(vVar.w());
            I02 = I03;
            E = E4;
            str2 = (String) ak.a.e(vVar.w());
            I0 = -9223372036854775807L;
        }
        byte[] bArr = new byte[vVar.a()];
        vVar.j(bArr, 0, vVar.a());
        ak.v vVar2 = new ak.v(this.f48219k.a(new yi.a(str, str2, I02, E, bArr)));
        int a11 = vVar2.a();
        for (x xVar : this.F) {
            vVar2.O(0);
            xVar.e(vVar2, a11);
        }
        if (j11 == -9223372036854775807L) {
            this.f48222n.addLast(new a(I0, a11));
            this.f48230v += a11;
            return;
        }
        g0 g0Var = this.f48218j;
        if (g0Var != null) {
            j11 = g0Var.a(j11);
        }
        for (x xVar2 : this.F) {
            xVar2.f(j11, 1, a11, 0, null);
        }
    }

    private void q(a.b bVar, long j11) {
        if (!this.f48221m.isEmpty()) {
            this.f48221m.peek().e(bVar);
            return;
        }
        int i11 = bVar.f48167a;
        if (i11 != 1936286840) {
            if (i11 == 1701671783) {
                p(bVar.f48171b);
                return;
            }
            return;
        }
        Pair<Long, ji.c> B = B(bVar.f48171b, j11);
        this.f48233y = ((Long) B.first).longValue();
        this.E.p((ji.v) B.second);
        this.H = true;
    }

    private void r(a.C1029a c1029a) {
        v(c1029a, this.f48212d, this.f48209a, this.f48216h);
        com.google.android.exoplayer2.drm.e i11 = i(c1029a.f48169c);
        if (i11 != null) {
            int size = this.f48212d.size();
            for (int i12 = 0; i12 < size; i12++) {
                this.f48212d.valueAt(i12).n(i11);
            }
        }
        if (this.f48231w != -9223372036854775807L) {
            int size2 = this.f48212d.size();
            for (int i13 = 0; i13 < size2; i13++) {
                this.f48212d.valueAt(i13).l(this.f48231w);
            }
            this.f48231w = -9223372036854775807L;
        }
    }

    private void s(a.C1029a c1029a) {
        int i11 = 0;
        ak.a.g(this.f48210b == null, "Unexpected moov box.");
        com.google.android.exoplayer2.drm.e i12 = i(c1029a.f48169c);
        a.C1029a c1029a2 = (a.C1029a) ak.a.e(c1029a.f(1836475768));
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = c1029a2.f48169c.size();
        long j11 = -9223372036854775807L;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar = c1029a2.f48169c.get(i13);
            int i14 = bVar.f48167a;
            if (i14 == 1953654136) {
                Pair<Integer, c> F = F(bVar.f48171b);
                sparseArray.put(((Integer) F.first).intValue(), (c) F.second);
            } else if (i14 == 1835362404) {
                j11 = u(bVar.f48171b);
            }
        }
        List<r> z11 = qi.b.z(c1029a, new ji.r(), j11, i12, (this.f48209a & 16) != 0, false, new com.google.common.base.l() { // from class: qi.e
            {
                g.this = this;
            }

            @Override // com.google.common.base.l
            public final Object apply(Object obj) {
                return g.this.n((o) obj);
            }
        });
        int size2 = z11.size();
        if (this.f48212d.size() == 0) {
            while (i11 < size2) {
                r rVar = z11.get(i11);
                o oVar = rVar.f48326a;
                this.f48212d.put(oVar.f48291a, new b(this.E.f(i11, oVar.f48292b), rVar, h(sparseArray, oVar.f48291a)));
                this.f48232x = Math.max(this.f48232x, oVar.f48295e);
                i11++;
            }
            this.E.s();
            return;
        }
        ak.a.f(this.f48212d.size() == size2);
        while (i11 < size2) {
            r rVar2 = z11.get(i11);
            o oVar2 = rVar2.f48326a;
            this.f48212d.get(oVar2.f48291a).j(rVar2, h(sparseArray, oVar2.f48291a));
            i11++;
        }
    }

    private void t(long j11) {
        while (!this.f48222n.isEmpty()) {
            a removeFirst = this.f48222n.removeFirst();
            this.f48230v -= removeFirst.f48236b;
            long j12 = removeFirst.f48235a + j11;
            g0 g0Var = this.f48218j;
            if (g0Var != null) {
                j12 = g0Var.a(j12);
            }
            for (x xVar : this.F) {
                xVar.f(j12, 1, removeFirst.f48236b, this.f48230v, null);
            }
        }
    }

    private static long u(ak.v vVar) {
        vVar.O(8);
        return qi.a.c(vVar.m()) == 0 ? vVar.E() : vVar.H();
    }

    private static void v(a.C1029a c1029a, SparseArray<b> sparseArray, int i11, byte[] bArr) {
        int size = c1029a.f48170d.size();
        for (int i12 = 0; i12 < size; i12++) {
            a.C1029a c1029a2 = c1029a.f48170d.get(i12);
            if (c1029a2.f48167a == 1953653094) {
                E(c1029a2, sparseArray, i11, bArr);
            }
        }
    }

    private static void w(ak.v vVar, q qVar) {
        vVar.O(8);
        int m11 = vVar.m();
        if ((qi.a.b(m11) & 1) == 1) {
            vVar.P(8);
        }
        int G = vVar.G();
        if (G == 1) {
            qVar.f48310d += qi.a.c(m11) == 0 ? vVar.E() : vVar.H();
            return;
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Unexpected saio entry count: ");
        sb2.append(G);
        throw new ParserException(sb2.toString());
    }

    private static void x(p pVar, ak.v vVar, q qVar) {
        int i11;
        int i12 = pVar.f48305d;
        vVar.O(8);
        if ((qi.a.b(vVar.m()) & 1) == 1) {
            vVar.P(8);
        }
        int C = vVar.C();
        int G = vVar.G();
        if (G <= qVar.f48312f) {
            if (C == 0) {
                boolean[] zArr = qVar.f48320n;
                i11 = 0;
                for (int i13 = 0; i13 < G; i13++) {
                    int C2 = vVar.C();
                    i11 += C2;
                    zArr[i13] = C2 > i12;
                }
            } else {
                i11 = (C * G) + 0;
                Arrays.fill(qVar.f48320n, 0, G, C > i12);
            }
            Arrays.fill(qVar.f48320n, G, qVar.f48312f, false);
            if (i11 > 0) {
                qVar.d(i11);
                return;
            }
            return;
        }
        int i14 = qVar.f48312f;
        StringBuilder sb2 = new StringBuilder(78);
        sb2.append("Saiz sample count ");
        sb2.append(G);
        sb2.append(" is greater than fragment sample count");
        sb2.append(i14);
        throw new ParserException(sb2.toString());
    }

    private static void y(a.C1029a c1029a, String str, q qVar) {
        byte[] bArr = null;
        ak.v vVar = null;
        ak.v vVar2 = null;
        for (int i11 = 0; i11 < c1029a.f48169c.size(); i11++) {
            a.b bVar = c1029a.f48169c.get(i11);
            ak.v vVar3 = bVar.f48171b;
            int i12 = bVar.f48167a;
            if (i12 == 1935828848) {
                vVar3.O(12);
                if (vVar3.m() == 1936025959) {
                    vVar = vVar3;
                }
            } else if (i12 == 1936158820) {
                vVar3.O(12);
                if (vVar3.m() == 1936025959) {
                    vVar2 = vVar3;
                }
            }
        }
        if (vVar == null || vVar2 == null) {
            return;
        }
        vVar.O(8);
        int c11 = qi.a.c(vVar.m());
        vVar.P(4);
        if (c11 == 1) {
            vVar.P(4);
        }
        if (vVar.m() == 1) {
            vVar2.O(8);
            int c12 = qi.a.c(vVar2.m());
            vVar2.P(4);
            if (c12 == 1) {
                if (vVar2.E() == 0) {
                    throw new ParserException("Variable length description in sgpd found (unsupported)");
                }
            } else if (c12 >= 2) {
                vVar2.P(4);
            }
            if (vVar2.E() == 1) {
                vVar2.P(1);
                int C = vVar2.C();
                int i13 = (C & 240) >> 4;
                int i14 = C & 15;
                boolean z11 = vVar2.C() == 1;
                if (z11) {
                    int C2 = vVar2.C();
                    byte[] bArr2 = new byte[16];
                    vVar2.j(bArr2, 0, 16);
                    if (C2 == 0) {
                        int C3 = vVar2.C();
                        bArr = new byte[C3];
                        vVar2.j(bArr, 0, C3);
                    }
                    qVar.f48319m = true;
                    qVar.f48321o = new p(z11, str, C2, bArr2, i13, i14, bArr);
                    return;
                }
                return;
            }
            throw new ParserException("Entry count in sgpd != 1 (unsupported).");
        }
        throw new ParserException("Entry count in sbgp != 1 (unsupported).");
    }

    private static void z(ak.v vVar, int i11, q qVar) {
        vVar.O(i11 + 8);
        int b11 = qi.a.b(vVar.m());
        if ((b11 & 1) == 0) {
            boolean z11 = (b11 & 2) != 0;
            int G = vVar.G();
            if (G == 0) {
                Arrays.fill(qVar.f48320n, 0, qVar.f48312f, false);
                return;
            } else if (G == qVar.f48312f) {
                Arrays.fill(qVar.f48320n, 0, G, z11);
                qVar.d(vVar.a());
                qVar.a(vVar);
                return;
            } else {
                int i12 = qVar.f48312f;
                StringBuilder sb2 = new StringBuilder(80);
                sb2.append("Senc sample count ");
                sb2.append(G);
                sb2.append(" is different from fragment sample count");
                sb2.append(i12);
                throw new ParserException(sb2.toString());
            }
        }
        throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    @Override // ji.h
    public void a(long j11, long j12) {
        int size = this.f48212d.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f48212d.valueAt(i11).k();
        }
        this.f48222n.clear();
        this.f48230v = 0;
        this.f48231w = j12;
        this.f48221m.clear();
        g();
    }

    @Override // ji.h
    public void b(ji.j jVar) {
        this.E = jVar;
        g();
        l();
        o oVar = this.f48210b;
        if (oVar != null) {
            this.f48212d.put(0, new b(jVar.f(0, oVar.f48292b), new r(this.f48210b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0)));
            this.E.s();
        }
    }

    @Override // ji.h
    public boolean d(ji.i iVar) {
        return n.b(iVar);
    }

    @Override // ji.h
    public int e(ji.i iVar, u uVar) {
        while (true) {
            int i11 = this.f48224p;
            if (i11 != 0) {
                if (i11 == 1) {
                    L(iVar);
                } else if (i11 != 2) {
                    if (N(iVar)) {
                        return 0;
                    }
                } else {
                    M(iVar);
                }
            } else if (!K(iVar)) {
                return -1;
            }
        }
    }

    public o n(o oVar) {
        return oVar;
    }

    @Override // ji.h
    public void release() {
    }

    public g(int i11) {
        this(i11, null);
    }

    public g(int i11, g0 g0Var) {
        this(i11, g0Var, null, Collections.emptyList());
    }

    public g(int i11, g0 g0Var, o oVar) {
        this(i11, g0Var, oVar, Collections.emptyList());
    }

    public g(int i11, g0 g0Var, o oVar, List<ci.i> list) {
        this(i11, g0Var, oVar, list, null);
    }

    public g(int i11, g0 g0Var, o oVar, List<ci.i> list, x xVar) {
        this.f48209a = i11;
        this.f48218j = g0Var;
        this.f48210b = oVar;
        this.f48211c = Collections.unmodifiableList(list);
        this.f48223o = xVar;
        this.f48219k = new yi.c();
        this.f48220l = new ak.v(16);
        this.f48213e = new ak.v(t.f519a);
        this.f48214f = new ak.v(5);
        this.f48215g = new ak.v();
        byte[] bArr = new byte[16];
        this.f48216h = bArr;
        this.f48217i = new ak.v(bArr);
        this.f48221m = new ArrayDeque<>();
        this.f48222n = new ArrayDeque<>();
        this.f48212d = new SparseArray<>();
        this.f48232x = -9223372036854775807L;
        this.f48231w = -9223372036854775807L;
        this.f48233y = -9223372036854775807L;
        this.E = ji.j.f33742a1;
        this.F = new x[0];
        this.G = new x[0];
    }
}