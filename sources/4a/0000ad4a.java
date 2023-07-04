package q60;

import java.math.BigInteger;
import n60.e;

/* loaded from: classes5.dex */
public class i2 extends e.b {

    /* renamed from: k  reason: collision with root package name */
    private static final n60.f[] f47875k = {new f2(n60.d.f40585b)};

    /* renamed from: j  reason: collision with root package name */
    protected j2 f47876j;

    /* loaded from: classes5.dex */
    class a extends n60.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f47877a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long[] f47878b;

        a(int i11, long[] jArr) {
            this.f47877a = i11;
            this.f47878b = jArr;
        }

        private n60.i d(long[] jArr, long[] jArr2) {
            return i2.this.i(new f2(jArr), new f2(jArr2), i2.f47875k);
        }

        @Override // n60.g
        public int a() {
            return this.f47877a;
        }

        @Override // n60.g
        public n60.i b(int i11) {
            long[] c11 = v60.i.c();
            long[] c12 = v60.i.c();
            int i12 = 0;
            for (int i13 = 0; i13 < this.f47877a; i13++) {
                long j11 = ((i13 ^ i11) - 1) >> 31;
                for (int i14 = 0; i14 < 5; i14++) {
                    long j12 = c11[i14];
                    long[] jArr = this.f47878b;
                    c11[i14] = j12 ^ (jArr[i12 + i14] & j11);
                    c12[i14] = c12[i14] ^ (jArr[(i12 + 5) + i14] & j11);
                }
                i12 += 10;
            }
            return d(c11, c12);
        }

        @Override // n60.g
        public n60.i c(int i11) {
            long[] c11 = v60.i.c();
            long[] c12 = v60.i.c();
            int i12 = i11 * 5 * 2;
            for (int i13 = 0; i13 < 5; i13++) {
                long[] jArr = this.f47878b;
                c11[i13] = jArr[i12 + i13];
                c12[i13] = jArr[i12 + 5 + i13];
            }
            return d(c11, c12);
        }
    }

    public i2() {
        super(283, 5, 7, 12);
        this.f47876j = new j2(this, null, null);
        this.f40591b = m(BigInteger.valueOf(1L));
        this.f40592c = m(new BigInteger(1, org.bouncycastle.util.encoders.b.b("027B680AC8B8596DA5A4AF8A19A0303FCA97FD7645309FA2A581485AF6263E313B79A2F5")));
        this.f40593d = new BigInteger(1, org.bouncycastle.util.encoders.b.b("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEF90399660FC938A90165B042A7CEFADB307"));
        this.f40594e = BigInteger.valueOf(2L);
        this.f40595f = 6;
    }

    @Override // n60.e
    public boolean D(int i11) {
        return i11 == 6;
    }

    @Override // n60.e.b
    public boolean I() {
        return false;
    }

    @Override // n60.e
    protected n60.e c() {
        return new i2();
    }

    @Override // n60.e
    public n60.g e(n60.i[] iVarArr, int i11, int i12) {
        long[] jArr = new long[i12 * 5 * 2];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            n60.i iVar = iVarArr[i11 + i14];
            v60.i.a(((f2) iVar.n()).f47843g, 0, jArr, i13);
            int i15 = i13 + 5;
            v60.i.a(((f2) iVar.o()).f47843g, 0, jArr, i15);
            i13 = i15 + 5;
        }
        return new a(i12, jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i h(n60.f fVar, n60.f fVar2) {
        return new j2(this, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i i(n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
        return new j2(this, fVar, fVar2, fVarArr);
    }

    @Override // n60.e
    public n60.f m(BigInteger bigInteger) {
        return new f2(bigInteger);
    }

    @Override // n60.e
    public int t() {
        return 283;
    }

    @Override // n60.e
    public n60.i u() {
        return this.f47876j;
    }
}