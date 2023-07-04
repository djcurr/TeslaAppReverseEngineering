package q60;

import java.math.BigInteger;
import java.security.SecureRandom;
import n60.e;

/* loaded from: classes5.dex */
public class e0 extends e.c {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f47828j = g0.f47850h;

    /* renamed from: k  reason: collision with root package name */
    private static final n60.f[] f47829k = {new g0(n60.d.f40585b)};

    /* renamed from: i  reason: collision with root package name */
    protected h0 f47830i;

    /* loaded from: classes5.dex */
    class a extends n60.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f47831a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f47832b;

        a(int i11, int[] iArr) {
            this.f47831a = i11;
            this.f47832b = iArr;
        }

        private n60.i d(int[] iArr, int[] iArr2) {
            return e0.this.i(new g0(iArr), new g0(iArr2), e0.f47829k);
        }

        @Override // n60.g
        public int a() {
            return this.f47831a;
        }

        @Override // n60.g
        public n60.i b(int i11) {
            int[] i12 = v60.h.i();
            int[] i13 = v60.h.i();
            int i14 = 0;
            for (int i15 = 0; i15 < this.f47831a; i15++) {
                int i16 = ((i15 ^ i11) - 1) >> 31;
                for (int i17 = 0; i17 < 8; i17++) {
                    int i18 = i12[i17];
                    int[] iArr = this.f47832b;
                    i12[i17] = i18 ^ (iArr[i14 + i17] & i16);
                    i13[i17] = i13[i17] ^ (iArr[(i14 + 8) + i17] & i16);
                }
                i14 += 16;
            }
            return d(i12, i13);
        }

        @Override // n60.g
        public n60.i c(int i11) {
            int[] i12 = v60.h.i();
            int[] i13 = v60.h.i();
            int i14 = i11 * 8 * 2;
            for (int i15 = 0; i15 < 8; i15++) {
                int[] iArr = this.f47832b;
                i12[i15] = iArr[i14 + i15];
                i13[i15] = iArr[i14 + 8 + i15];
            }
            return d(i12, i13);
        }
    }

    public e0() {
        super(f47828j);
        this.f47830i = new h0(this, null, null);
        this.f40591b = m(n60.d.f40584a);
        this.f40592c = m(BigInteger.valueOf(7L));
        this.f40593d = new BigInteger(1, org.bouncycastle.util.encoders.b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141"));
        this.f40594e = BigInteger.valueOf(1L);
        this.f40595f = 2;
    }

    @Override // n60.e.c, n60.e
    public n60.f C(SecureRandom secureRandom) {
        int[] i11 = v60.h.i();
        f0.j(secureRandom, i11);
        return new g0(i11);
    }

    @Override // n60.e
    public boolean D(int i11) {
        return i11 == 2;
    }

    @Override // n60.e
    protected n60.e c() {
        return new e0();
    }

    @Override // n60.e
    public n60.g e(n60.i[] iVarArr, int i11, int i12) {
        int[] iArr = new int[i12 * 8 * 2];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            n60.i iVar = iVarArr[i11 + i14];
            v60.h.f(((g0) iVar.n()).f47851g, 0, iArr, i13);
            int i15 = i13 + 8;
            v60.h.f(((g0) iVar.o()).f47851g, 0, iArr, i15);
            i13 = i15 + 8;
        }
        return new a(i12, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i h(n60.f fVar, n60.f fVar2) {
        return new h0(this, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i i(n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
        return new h0(this, fVar, fVar2, fVarArr);
    }

    @Override // n60.e
    public n60.f m(BigInteger bigInteger) {
        return new g0(bigInteger);
    }

    @Override // n60.e
    public int t() {
        return f47828j.bitLength();
    }

    @Override // n60.e
    public n60.i u() {
        return this.f47830i;
    }
}