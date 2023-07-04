package n60;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Hashtable;
import java.util.Random;
import n60.f;
import n60.i;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a */
    protected u60.a f40590a;

    /* renamed from: b */
    protected n60.f f40591b;

    /* renamed from: c */
    protected n60.f f40592c;

    /* renamed from: d */
    protected BigInteger f40593d;

    /* renamed from: e */
    protected BigInteger f40594e;

    /* renamed from: f */
    protected int f40595f = 0;

    /* renamed from: g */
    protected r60.a f40596g = null;

    /* renamed from: h */
    protected h f40597h = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a extends n60.a {

        /* renamed from: a */
        final /* synthetic */ int f40598a;

        /* renamed from: b */
        final /* synthetic */ int f40599b;

        /* renamed from: c */
        final /* synthetic */ byte[] f40600c;

        a(int i11, int i12, byte[] bArr) {
            e.this = r1;
            this.f40598a = i11;
            this.f40599b = i12;
            this.f40600c = bArr;
        }

        private i d(byte[] bArr, byte[] bArr2) {
            e eVar = e.this;
            return eVar.h(eVar.m(new BigInteger(1, bArr)), e.this.m(new BigInteger(1, bArr2)));
        }

        @Override // n60.g
        public int a() {
            return this.f40598a;
        }

        @Override // n60.g
        public i b(int i11) {
            int i12;
            int i13 = this.f40599b;
            byte[] bArr = new byte[i13];
            byte[] bArr2 = new byte[i13];
            int i14 = 0;
            for (int i15 = 0; i15 < this.f40598a; i15++) {
                int i16 = ((i15 ^ i11) - 1) >> 31;
                int i17 = 0;
                while (true) {
                    i12 = this.f40599b;
                    if (i17 < i12) {
                        byte b11 = bArr[i17];
                        byte[] bArr3 = this.f40600c;
                        bArr[i17] = (byte) (b11 ^ (bArr3[i14 + i17] & i16));
                        bArr2[i17] = (byte) ((bArr3[(i12 + i14) + i17] & i16) ^ bArr2[i17]);
                        i17++;
                    }
                }
                i14 += i12 * 2;
            }
            return d(bArr, bArr2);
        }

        @Override // n60.g
        public i c(int i11) {
            int i12 = this.f40599b;
            byte[] bArr = new byte[i12];
            byte[] bArr2 = new byte[i12];
            int i13 = i11 * i12 * 2;
            int i14 = 0;
            while (true) {
                int i15 = this.f40599b;
                if (i14 >= i15) {
                    return d(bArr, bArr2);
                }
                byte[] bArr3 = this.f40600c;
                bArr[i14] = bArr3[i13 + i14];
                bArr2[i14] = bArr3[i15 + i13 + i14];
                i14++;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class b extends e {

        /* renamed from: i */
        private BigInteger[] f40602i;

        public b(int i11, int i12, int i13, int i14) {
            super(F(i11, i12, i13, i14));
            this.f40602i = null;
        }

        private static u60.a F(int i11, int i12, int i13, int i14) {
            if (i12 != 0) {
                if (i13 == 0) {
                    if (i14 == 0) {
                        return u60.b.a(new int[]{0, i12, i11});
                    }
                    throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
                } else if (i13 > i12) {
                    if (i14 > i13) {
                        return u60.b.a(new int[]{0, i12, i13, i14, i11});
                    }
                    throw new IllegalArgumentException("k3 must be > k2");
                } else {
                    throw new IllegalArgumentException("k2 must be > k1");
                }
            }
            throw new IllegalArgumentException("k1 must be > 0");
        }

        private static BigInteger H(SecureRandom secureRandom, int i11) {
            BigInteger e11;
            do {
                e11 = r70.a.e(i11, secureRandom);
            } while (e11.signum() <= 0);
            return e11;
        }

        @Override // n60.e
        public n60.f C(SecureRandom secureRandom) {
            int t11 = t();
            return m(H(secureRandom, t11)).j(m(H(secureRandom, t11)));
        }

        public synchronized BigInteger[] G() {
            if (this.f40602i == null) {
                this.f40602i = t.f(this);
            }
            return this.f40602i;
        }

        public boolean I() {
            return this.f40593d != null && this.f40594e != null && this.f40592c.h() && (this.f40591b.i() || this.f40591b.h());
        }

        public n60.f J(n60.f fVar) {
            n60.f fVar2;
            f.a aVar = (f.a) fVar;
            boolean v11 = aVar.v();
            if (!v11 || aVar.w() == 0) {
                int t11 = t();
                if ((t11 & 1) != 0) {
                    n60.f u11 = aVar.u();
                    if (v11 || u11.o().a(u11).a(fVar).i()) {
                        return u11;
                    }
                    return null;
                } else if (fVar.i()) {
                    return fVar;
                } else {
                    n60.f m11 = m(n60.d.f40584a);
                    Random random = new Random();
                    do {
                        n60.f m12 = m(new BigInteger(t11, random));
                        n60.f fVar3 = fVar;
                        fVar2 = m11;
                        for (int i11 = 1; i11 < t11; i11++) {
                            n60.f o11 = fVar3.o();
                            fVar2 = fVar2.o().a(o11.j(m12));
                            fVar3 = o11.a(fVar);
                        }
                        if (!fVar3.i()) {
                            return null;
                        }
                    } while (fVar2.o().a(fVar2).i());
                    return fVar2;
                }
            }
            return null;
        }

        @Override // n60.e
        public i g(BigInteger bigInteger, BigInteger bigInteger2) {
            n60.f m11 = m(bigInteger);
            n60.f m12 = m(bigInteger2);
            int q11 = q();
            if (q11 == 5 || q11 == 6) {
                if (!m11.i()) {
                    m12 = m12.d(m11).a(m11);
                } else if (!m12.o().equals(o())) {
                    throw new IllegalArgumentException();
                }
            }
            return h(m11, m12);
        }

        @Override // n60.e
        protected i k(int i11, BigInteger bigInteger) {
            n60.f fVar;
            n60.f m11 = m(bigInteger);
            if (m11.i()) {
                fVar = o().n();
            } else {
                n60.f J = J(m11.o().g().j(o()).a(n()).a(m11));
                if (J != null) {
                    if (J.s() != (i11 == 1)) {
                        J = J.b();
                    }
                    int q11 = q();
                    fVar = (q11 == 5 || q11 == 6) ? J.a(m11) : J.j(m11);
                } else {
                    fVar = null;
                }
            }
            if (fVar != null) {
                return h(m11, fVar);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        @Override // n60.e
        public boolean y(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= t();
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class c extends e {
        public c(BigInteger bigInteger) {
            super(u60.b.b(bigInteger));
        }

        private static BigInteger F(SecureRandom secureRandom, BigInteger bigInteger) {
            while (true) {
                BigInteger e11 = r70.a.e(bigInteger.bitLength(), secureRandom);
                if (e11.signum() > 0 && e11.compareTo(bigInteger) < 0) {
                    return e11;
                }
            }
        }

        @Override // n60.e
        public n60.f C(SecureRandom secureRandom) {
            BigInteger characteristic = s().getCharacteristic();
            return m(F(secureRandom, characteristic)).j(m(F(secureRandom, characteristic)));
        }

        @Override // n60.e
        protected i k(int i11, BigInteger bigInteger) {
            n60.f m11 = m(bigInteger);
            n60.f n11 = m11.o().a(this.f40591b).j(m11).a(this.f40592c).n();
            if (n11 != null) {
                if (n11.s() != (i11 == 1)) {
                    n11 = n11.m();
                }
                return h(m11, n11);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        @Override // n60.e
        public boolean y(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(s().getCharacteristic()) < 0;
        }
    }

    /* loaded from: classes5.dex */
    public class d {

        /* renamed from: a */
        protected int f40603a;

        /* renamed from: b */
        protected r60.a f40604b;

        /* renamed from: c */
        protected h f40605c;

        d(int i11, r60.a aVar, h hVar) {
            e.this = r1;
            this.f40603a = i11;
            this.f40604b = aVar;
            this.f40605c = hVar;
        }

        public e a() {
            if (e.this.D(this.f40603a)) {
                e c11 = e.this.c();
                if (c11 != e.this) {
                    synchronized (c11) {
                        c11.f40595f = this.f40603a;
                        c11.f40596g = this.f40604b;
                        c11.f40597h = this.f40605c;
                    }
                    return c11;
                }
                throw new IllegalStateException("implementation returned current curve");
            }
            throw new IllegalStateException("unsupported coordinate system");
        }

        public d b(r60.a aVar) {
            this.f40604b = aVar;
            return this;
        }
    }

    /* renamed from: n60.e$e */
    /* loaded from: classes5.dex */
    public static class C0796e extends b {

        /* renamed from: j */
        private int f40607j;

        /* renamed from: k */
        private int f40608k;

        /* renamed from: l */
        private int f40609l;

        /* renamed from: m */
        private int f40610m;

        /* renamed from: n */
        private i.d f40611n;

        /* renamed from: n60.e$e$a */
        /* loaded from: classes5.dex */
        class a extends n60.a {

            /* renamed from: a */
            final /* synthetic */ int f40612a;

            /* renamed from: b */
            final /* synthetic */ int f40613b;

            /* renamed from: c */
            final /* synthetic */ long[] f40614c;

            /* renamed from: d */
            final /* synthetic */ int[] f40615d;

            a(int i11, int i12, long[] jArr, int[] iArr) {
                C0796e.this = r1;
                this.f40612a = i11;
                this.f40613b = i12;
                this.f40614c = jArr;
                this.f40615d = iArr;
            }

            private i d(long[] jArr, long[] jArr2) {
                return C0796e.this.h(new f.c(C0796e.this.f40607j, this.f40615d, new o(jArr)), new f.c(C0796e.this.f40607j, this.f40615d, new o(jArr2)));
            }

            @Override // n60.g
            public int a() {
                return this.f40612a;
            }

            @Override // n60.g
            public i b(int i11) {
                int i12;
                long[] l11 = v60.n.l(this.f40613b);
                long[] l12 = v60.n.l(this.f40613b);
                int i13 = 0;
                for (int i14 = 0; i14 < this.f40612a; i14++) {
                    long j11 = ((i14 ^ i11) - 1) >> 31;
                    int i15 = 0;
                    while (true) {
                        i12 = this.f40613b;
                        if (i15 < i12) {
                            long j12 = l11[i15];
                            long[] jArr = this.f40614c;
                            l11[i15] = j12 ^ (jArr[i13 + i15] & j11);
                            l12[i15] = l12[i15] ^ (jArr[(i12 + i13) + i15] & j11);
                            i15++;
                        }
                    }
                    i13 += i12 * 2;
                }
                return d(l11, l12);
            }

            @Override // n60.g
            public i c(int i11) {
                long[] l11 = v60.n.l(this.f40613b);
                long[] l12 = v60.n.l(this.f40613b);
                int i12 = i11 * this.f40613b * 2;
                int i13 = 0;
                while (true) {
                    int i14 = this.f40613b;
                    if (i13 >= i14) {
                        return d(l11, l12);
                    }
                    long[] jArr = this.f40614c;
                    l11[i13] = jArr[i12 + i13];
                    l12[i13] = jArr[i14 + i12 + i13];
                    i13++;
                }
            }
        }

        public C0796e(int i11, int i12, int i13, int i14, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i11, i12, i13, i14, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public C0796e(int i11, int i12, int i13, int i14, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i11, i12, i13, i14);
            this.f40607j = i11;
            this.f40608k = i12;
            this.f40609l = i13;
            this.f40610m = i14;
            this.f40593d = bigInteger3;
            this.f40594e = bigInteger4;
            this.f40611n = new i.d(this, null, null);
            this.f40591b = m(bigInteger);
            this.f40592c = m(bigInteger2);
            this.f40595f = 6;
        }

        protected C0796e(int i11, int i12, int i13, int i14, n60.f fVar, n60.f fVar2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i11, i12, i13, i14);
            this.f40607j = i11;
            this.f40608k = i12;
            this.f40609l = i13;
            this.f40610m = i14;
            this.f40593d = bigInteger;
            this.f40594e = bigInteger2;
            this.f40611n = new i.d(this, null, null);
            this.f40591b = fVar;
            this.f40592c = fVar2;
            this.f40595f = 6;
        }

        public C0796e(int i11, int i12, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i11, i12, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }

        @Override // n60.e
        public boolean D(int i11) {
            return i11 == 0 || i11 == 1 || i11 == 6;
        }

        public boolean L() {
            return this.f40609l == 0 && this.f40610m == 0;
        }

        @Override // n60.e
        protected e c() {
            return new C0796e(this.f40607j, this.f40608k, this.f40609l, this.f40610m, this.f40591b, this.f40592c, this.f40593d, this.f40594e);
        }

        @Override // n60.e
        public g e(i[] iVarArr, int i11, int i12) {
            int i13 = (this.f40607j + 63) >>> 6;
            int[] iArr = L() ? new int[]{this.f40608k} : new int[]{this.f40608k, this.f40609l, this.f40610m};
            long[] jArr = new long[i12 * i13 * 2];
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                i iVar = iVarArr[i11 + i15];
                ((f.c) iVar.n()).f40623j.j(jArr, i14);
                int i16 = i14 + i13;
                ((f.c) iVar.o()).f40623j.j(jArr, i16);
                i14 = i16 + i13;
            }
            return new a(i12, i13, jArr, iArr);
        }

        @Override // n60.e
        protected h f() {
            return I() ? new y() : super.f();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n60.e
        public i h(n60.f fVar, n60.f fVar2) {
            return new i.d(this, fVar, fVar2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n60.e
        public i i(n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
            return new i.d(this, fVar, fVar2, fVarArr);
        }

        @Override // n60.e
        public n60.f m(BigInteger bigInteger) {
            return new f.c(this.f40607j, this.f40608k, this.f40609l, this.f40610m, bigInteger);
        }

        @Override // n60.e
        public int t() {
            return this.f40607j;
        }

        @Override // n60.e
        public i u() {
            return this.f40611n;
        }
    }

    /* loaded from: classes5.dex */
    public static class f extends c {

        /* renamed from: i */
        BigInteger f40617i;

        /* renamed from: j */
        BigInteger f40618j;

        /* renamed from: k */
        i.e f40619k;

        public f(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, null, null);
        }

        public f(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.f40617i = bigInteger;
            this.f40618j = f.d.u(bigInteger);
            this.f40619k = new i.e(this, null, null);
            this.f40591b = m(bigInteger2);
            this.f40592c = m(bigInteger3);
            this.f40593d = bigInteger4;
            this.f40594e = bigInteger5;
            this.f40595f = 4;
        }

        protected f(BigInteger bigInteger, BigInteger bigInteger2, n60.f fVar, n60.f fVar2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.f40617i = bigInteger;
            this.f40618j = bigInteger2;
            this.f40619k = new i.e(this, null, null);
            this.f40591b = fVar;
            this.f40592c = fVar2;
            this.f40593d = bigInteger3;
            this.f40594e = bigInteger4;
            this.f40595f = 4;
        }

        @Override // n60.e
        public boolean D(int i11) {
            return i11 == 0 || i11 == 1 || i11 == 2 || i11 == 4;
        }

        @Override // n60.e
        protected e c() {
            return new f(this.f40617i, this.f40618j, this.f40591b, this.f40592c, this.f40593d, this.f40594e);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n60.e
        public i h(n60.f fVar, n60.f fVar2) {
            return new i.e(this, fVar, fVar2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n60.e
        public i i(n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
            return new i.e(this, fVar, fVar2, fVarArr);
        }

        @Override // n60.e
        public n60.f m(BigInteger bigInteger) {
            return new f.d(this.f40617i, this.f40618j, bigInteger);
        }

        @Override // n60.e
        public int t() {
            return this.f40617i.bitLength();
        }

        @Override // n60.e
        public i u() {
            return this.f40619k;
        }

        @Override // n60.e
        public i x(i iVar) {
            int q11;
            return (this == iVar.i() || q() != 2 || iVar.u() || !((q11 = iVar.i().q()) == 2 || q11 == 3 || q11 == 4)) ? super.x(iVar) : new i.e(this, m(iVar.f40629b.t()), m(iVar.f40630c.t()), new n60.f[]{m(iVar.f40631d[0].t())});
        }
    }

    protected e(u60.a aVar) {
        this.f40590a = aVar;
    }

    public void A(i[] iVarArr, int i11, int i12, n60.f fVar) {
        b(iVarArr, i11, i12);
        int q11 = q();
        if (q11 == 0 || q11 == 5) {
            if (fVar != null) {
                throw new IllegalArgumentException("'iso' not valid for affine coordinates");
            }
            return;
        }
        n60.f[] fVarArr = new n60.f[i12];
        int[] iArr = new int[i12];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = i11 + i14;
            i iVar = iVarArr[i15];
            if (iVar != null && (fVar != null || !iVar.v())) {
                fVarArr[i13] = iVar.s(0);
                iArr[i13] = i15;
                i13++;
            }
        }
        if (i13 == 0) {
            return;
        }
        n60.c.p(fVarArr, 0, i13, fVar);
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = iArr[i16];
            iVarArr[i17] = iVarArr[i17].B(fVarArr[i16]);
        }
    }

    public q B(i iVar, String str, p pVar) {
        Hashtable hashtable;
        q a11;
        a(iVar);
        synchronized (iVar) {
            hashtable = iVar.f40632e;
            if (hashtable == null) {
                hashtable = new Hashtable(4);
                iVar.f40632e = hashtable;
            }
        }
        synchronized (hashtable) {
            q qVar = (q) hashtable.get(str);
            a11 = pVar.a(qVar);
            if (a11 != qVar) {
                hashtable.put(str, a11);
            }
        }
        return a11;
    }

    public abstract n60.f C(SecureRandom secureRandom);

    public boolean D(int i11) {
        return i11 == 0;
    }

    public i E(BigInteger bigInteger, BigInteger bigInteger2) {
        i g11 = g(bigInteger, bigInteger2);
        if (g11.w()) {
            return g11;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    protected void a(i iVar) {
        if (iVar == null || this != iVar.i()) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
    }

    protected void b(i[] iVarArr, int i11, int i12) {
        if (iVarArr == null) {
            throw new IllegalArgumentException("'points' cannot be null");
        }
        if (i11 < 0 || i12 < 0 || i11 > iVarArr.length - i12) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        }
        for (int i13 = 0; i13 < i12; i13++) {
            i iVar = iVarArr[i11 + i13];
            if (iVar != null && this != iVar.i()) {
                throw new IllegalArgumentException("'points' entries must be null or on this curve");
            }
        }
    }

    protected abstract e c();

    public synchronized d d() {
        return new d(this.f40595f, this.f40596g, this.f40597h);
    }

    public g e(i[] iVarArr, int i11, int i12) {
        int t11 = (t() + 7) >>> 3;
        byte[] bArr = new byte[i12 * t11 * 2];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            i iVar = iVarArr[i11 + i14];
            byte[] byteArray = iVar.n().t().toByteArray();
            byte[] byteArray2 = iVar.o().t().toByteArray();
            int i15 = 1;
            int i16 = byteArray.length > t11 ? 1 : 0;
            int length = byteArray.length - i16;
            if (byteArray2.length <= t11) {
                i15 = 0;
            }
            int length2 = byteArray2.length - i15;
            int i17 = i13 + t11;
            System.arraycopy(byteArray, i16, bArr, i17 - length, length);
            i13 = i17 + t11;
            System.arraycopy(byteArray2, i15, bArr, i13 - length2, length2);
        }
        return new a(i12, t11, bArr);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof e) && l((e) obj));
    }

    protected h f() {
        r60.a aVar = this.f40596g;
        return aVar instanceof r60.d ? new n(this, (r60.d) aVar) : new v();
    }

    public i g(BigInteger bigInteger, BigInteger bigInteger2) {
        return h(m(bigInteger), m(bigInteger2));
    }

    public abstract i h(n60.f fVar, n60.f fVar2);

    public int hashCode() {
        return (s().hashCode() ^ r70.f.c(n().t().hashCode(), 8)) ^ r70.f.c(o().t().hashCode(), 16);
    }

    public abstract i i(n60.f fVar, n60.f fVar2, n60.f[] fVarArr);

    public i j(byte[] bArr) {
        i u11;
        int t11 = (t() + 7) / 8;
        byte b11 = bArr[0];
        if (b11 != 0) {
            if (b11 == 2 || b11 == 3) {
                if (bArr.length != t11 + 1) {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
                u11 = k(b11 & 1, r70.a.h(bArr, 1, t11));
                if (!u11.t(true, true)) {
                    throw new IllegalArgumentException("Invalid point");
                }
            } else if (b11 != 4) {
                if (b11 != 6 && b11 != 7) {
                    throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(b11, 16));
                } else if (bArr.length != (t11 * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                } else {
                    BigInteger h11 = r70.a.h(bArr, 1, t11);
                    BigInteger h12 = r70.a.h(bArr, t11 + 1, t11);
                    if (h12.testBit(0) != (b11 == 7)) {
                        throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                    }
                    u11 = E(h11, h12);
                }
            } else if (bArr.length != (t11 * 2) + 1) {
                throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
            } else {
                u11 = E(r70.a.h(bArr, 1, t11), r70.a.h(bArr, t11 + 1, t11));
            }
        } else if (bArr.length != 1) {
            throw new IllegalArgumentException("Incorrect length for infinity encoding");
        } else {
            u11 = u();
        }
        if (b11 == 0 || !u11.u()) {
            return u11;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    protected abstract i k(int i11, BigInteger bigInteger);

    public boolean l(e eVar) {
        return this == eVar || (eVar != null && s().equals(eVar.s()) && n().t().equals(eVar.n().t()) && o().t().equals(eVar.o().t()));
    }

    public abstract n60.f m(BigInteger bigInteger);

    public n60.f n() {
        return this.f40591b;
    }

    public n60.f o() {
        return this.f40592c;
    }

    public BigInteger p() {
        return this.f40594e;
    }

    public int q() {
        return this.f40595f;
    }

    public r60.a r() {
        return this.f40596g;
    }

    public u60.a s() {
        return this.f40590a;
    }

    public abstract int t();

    public abstract i u();

    public h v() {
        if (this.f40597h == null) {
            this.f40597h = f();
        }
        return this.f40597h;
    }

    public BigInteger w() {
        return this.f40593d;
    }

    public i x(i iVar) {
        if (this == iVar.i()) {
            return iVar;
        }
        if (iVar.u()) {
            return u();
        }
        i A = iVar.A();
        return g(A.q().t(), A.r().t());
    }

    public abstract boolean y(BigInteger bigInteger);

    public void z(i[] iVarArr) {
        A(iVarArr, 0, iVarArr.length, null);
    }
}