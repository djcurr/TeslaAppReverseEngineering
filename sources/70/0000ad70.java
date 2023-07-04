package q60;

import java.math.BigInteger;
import java.security.SecureRandom;
import n60.e;

/* loaded from: classes5.dex */
public class q0 extends e.c {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f47939j = s0.f47959h;

    /* renamed from: k  reason: collision with root package name */
    private static final n60.f[] f47940k = {new s0(n60.d.f40585b)};

    /* renamed from: i  reason: collision with root package name */
    protected t0 f47941i;

    /* loaded from: classes5.dex */
    class a extends n60.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f47942a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f47943b;

        a(int i11, int[] iArr) {
            this.f47942a = i11;
            this.f47943b = iArr;
        }

        private n60.i d(int[] iArr, int[] iArr2) {
            return q0.this.i(new s0(iArr), new s0(iArr2), q0.f47940k);
        }

        @Override // n60.g
        public int a() {
            return this.f47942a;
        }

        @Override // n60.g
        public n60.i b(int i11) {
            int[] k11 = v60.n.k(17);
            int[] k12 = v60.n.k(17);
            int i12 = 0;
            for (int i13 = 0; i13 < this.f47942a; i13++) {
                int i14 = ((i13 ^ i11) - 1) >> 31;
                for (int i15 = 0; i15 < 17; i15++) {
                    int i16 = k11[i15];
                    int[] iArr = this.f47943b;
                    k11[i15] = i16 ^ (iArr[i12 + i15] & i14);
                    k12[i15] = k12[i15] ^ (iArr[(i12 + 17) + i15] & i14);
                }
                i12 += 34;
            }
            return d(k11, k12);
        }

        @Override // n60.g
        public n60.i c(int i11) {
            int[] k11 = v60.n.k(17);
            int[] k12 = v60.n.k(17);
            int i12 = i11 * 17 * 2;
            for (int i13 = 0; i13 < 17; i13++) {
                int i14 = k11[i13];
                int[] iArr = this.f47943b;
                k11[i13] = i14 ^ iArr[i12 + i13];
                k12[i13] = k12[i13] ^ iArr[(i12 + 17) + i13];
            }
            return d(k11, k12);
        }
    }

    public q0() {
        super(f47939j);
        this.f47941i = new t0(this, null, null);
        this.f40591b = m(new BigInteger(1, org.bouncycastle.util.encoders.b.b("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f40592c = m(new BigInteger(1, org.bouncycastle.util.encoders.b.b("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00")));
        this.f40593d = new BigInteger(1, org.bouncycastle.util.encoders.b.b("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409"));
        this.f40594e = BigInteger.valueOf(1L);
        this.f40595f = 2;
    }

    @Override // n60.e.c, n60.e
    public n60.f C(SecureRandom secureRandom) {
        int[] k11 = v60.n.k(17);
        r0.k(secureRandom, k11);
        return new s0(k11);
    }

    @Override // n60.e
    public boolean D(int i11) {
        return i11 == 2;
    }

    @Override // n60.e
    protected n60.e c() {
        return new q0();
    }

    @Override // n60.e
    public n60.g e(n60.i[] iVarArr, int i11, int i12) {
        int[] iArr = new int[i12 * 17 * 2];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            n60.i iVar = iVarArr[i11 + i14];
            v60.n.j(17, ((s0) iVar.n()).f47960g, 0, iArr, i13);
            int i15 = i13 + 17;
            v60.n.j(17, ((s0) iVar.o()).f47960g, 0, iArr, i15);
            i13 = i15 + 17;
        }
        return new a(i12, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i h(n60.f fVar, n60.f fVar2) {
        return new t0(this, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i i(n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
        return new t0(this, fVar, fVar2, fVarArr);
    }

    @Override // n60.e
    public n60.f m(BigInteger bigInteger) {
        return new s0(bigInteger);
    }

    @Override // n60.e
    public int t() {
        return f47939j.bitLength();
    }

    @Override // n60.e
    public n60.i u() {
        return this.f47941i;
    }
}