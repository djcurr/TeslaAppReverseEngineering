package q60;

import java.math.BigInteger;
import java.security.SecureRandom;
import n60.e;

/* loaded from: classes5.dex */
public class m0 extends e.c {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f47901j = o0.f47926h;

    /* renamed from: k  reason: collision with root package name */
    private static final n60.f[] f47902k = {new o0(n60.d.f40585b)};

    /* renamed from: i  reason: collision with root package name */
    protected p0 f47903i;

    /* loaded from: classes5.dex */
    class a extends n60.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f47904a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f47905b;

        a(int i11, int[] iArr) {
            this.f47904a = i11;
            this.f47905b = iArr;
        }

        private n60.i d(int[] iArr, int[] iArr2) {
            return m0.this.i(new o0(iArr), new o0(iArr2), m0.f47902k);
        }

        @Override // n60.g
        public int a() {
            return this.f47904a;
        }

        @Override // n60.g
        public n60.i b(int i11) {
            int[] k11 = v60.n.k(12);
            int[] k12 = v60.n.k(12);
            int i12 = 0;
            for (int i13 = 0; i13 < this.f47904a; i13++) {
                int i14 = ((i13 ^ i11) - 1) >> 31;
                for (int i15 = 0; i15 < 12; i15++) {
                    int i16 = k11[i15];
                    int[] iArr = this.f47905b;
                    k11[i15] = i16 ^ (iArr[i12 + i15] & i14);
                    k12[i15] = k12[i15] ^ (iArr[(i12 + 12) + i15] & i14);
                }
                i12 += 24;
            }
            return d(k11, k12);
        }

        @Override // n60.g
        public n60.i c(int i11) {
            int[] k11 = v60.n.k(12);
            int[] k12 = v60.n.k(12);
            int i12 = i11 * 12 * 2;
            for (int i13 = 0; i13 < 12; i13++) {
                int[] iArr = this.f47905b;
                k11[i13] = iArr[i12 + i13];
                k12[i13] = iArr[i12 + 12 + i13];
            }
            return d(k11, k12);
        }
    }

    public m0() {
        super(f47901j);
        this.f47903i = new p0(this, null, null);
        this.f40591b = m(new BigInteger(1, org.bouncycastle.util.encoders.b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC")));
        this.f40592c = m(new BigInteger(1, org.bouncycastle.util.encoders.b.b("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF")));
        this.f40593d = new BigInteger(1, org.bouncycastle.util.encoders.b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973"));
        this.f40594e = BigInteger.valueOf(1L);
        this.f40595f = 2;
    }

    @Override // n60.e.c, n60.e
    public n60.f C(SecureRandom secureRandom) {
        int[] k11 = v60.n.k(12);
        n0.k(secureRandom, k11);
        return new o0(k11);
    }

    @Override // n60.e
    public boolean D(int i11) {
        return i11 == 2;
    }

    @Override // n60.e
    protected n60.e c() {
        return new m0();
    }

    @Override // n60.e
    public n60.g e(n60.i[] iVarArr, int i11, int i12) {
        int[] iArr = new int[i12 * 12 * 2];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            n60.i iVar = iVarArr[i11 + i14];
            v60.n.j(12, ((o0) iVar.n()).f47927g, 0, iArr, i13);
            int i15 = i13 + 12;
            v60.n.j(12, ((o0) iVar.o()).f47927g, 0, iArr, i15);
            i13 = i15 + 12;
        }
        return new a(i12, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i h(n60.f fVar, n60.f fVar2) {
        return new p0(this, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i i(n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
        return new p0(this, fVar, fVar2, fVarArr);
    }

    @Override // n60.e
    public n60.f m(BigInteger bigInteger) {
        return new o0(bigInteger);
    }

    @Override // n60.e
    public int t() {
        return f47901j.bitLength();
    }

    @Override // n60.e
    public n60.i u() {
        return this.f47903i;
    }
}