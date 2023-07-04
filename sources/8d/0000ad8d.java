package q60;

import java.math.BigInteger;
import java.security.SecureRandom;
import n60.e;

/* loaded from: classes5.dex */
public class w extends e.c {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f47985j = y.f48004h;

    /* renamed from: k  reason: collision with root package name */
    private static final n60.f[] f47986k = {new y(n60.d.f40585b)};

    /* renamed from: i  reason: collision with root package name */
    protected z f47987i;

    /* loaded from: classes5.dex */
    class a extends n60.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f47988a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f47989b;

        a(int i11, int[] iArr) {
            this.f47988a = i11;
            this.f47989b = iArr;
        }

        private n60.i d(int[] iArr, int[] iArr2) {
            return w.this.i(new y(iArr), new y(iArr2), w.f47986k);
        }

        @Override // n60.g
        public int a() {
            return this.f47988a;
        }

        @Override // n60.g
        public n60.i b(int i11) {
            int[] e11 = v60.g.e();
            int[] e12 = v60.g.e();
            int i12 = 0;
            for (int i13 = 0; i13 < this.f47988a; i13++) {
                int i14 = ((i13 ^ i11) - 1) >> 31;
                for (int i15 = 0; i15 < 7; i15++) {
                    int i16 = e11[i15];
                    int[] iArr = this.f47989b;
                    e11[i15] = i16 ^ (iArr[i12 + i15] & i14);
                    e12[i15] = e12[i15] ^ (iArr[(i12 + 7) + i15] & i14);
                }
                i12 += 14;
            }
            return d(e11, e12);
        }

        @Override // n60.g
        public n60.i c(int i11) {
            int[] e11 = v60.g.e();
            int[] e12 = v60.g.e();
            int i12 = 0;
            for (int i13 = 0; i13 < this.f47988a; i13++) {
                int i14 = ((i13 ^ i11) - 1) >> 31;
                for (int i15 = 0; i15 < 7; i15++) {
                    int i16 = e11[i15];
                    int[] iArr = this.f47989b;
                    e11[i15] = i16 ^ (iArr[i12 + i15] & i14);
                    e12[i15] = e12[i15] ^ (iArr[(i12 + 7) + i15] & i14);
                }
                i12 += 14;
            }
            return d(e11, e12);
        }
    }

    public w() {
        super(f47985j);
        this.f47987i = new z(this, null, null);
        this.f40591b = m(n60.d.f40584a);
        this.f40592c = m(BigInteger.valueOf(5L));
        this.f40593d = new BigInteger(1, org.bouncycastle.util.encoders.b.b("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.f40594e = BigInteger.valueOf(1L);
        this.f40595f = 2;
    }

    @Override // n60.e.c, n60.e
    public n60.f C(SecureRandom secureRandom) {
        int[] e11 = v60.g.e();
        x.j(secureRandom, e11);
        return new y(e11);
    }

    @Override // n60.e
    public boolean D(int i11) {
        return i11 == 2;
    }

    @Override // n60.e
    protected n60.e c() {
        return new w();
    }

    @Override // n60.e
    public n60.g e(n60.i[] iVarArr, int i11, int i12) {
        int[] iArr = new int[i12 * 7 * 2];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            n60.i iVar = iVarArr[i11 + i14];
            v60.g.c(((y) iVar.n()).f48006g, 0, iArr, i13);
            int i15 = i13 + 7;
            v60.g.c(((y) iVar.o()).f48006g, 0, iArr, i15);
            i13 = i15 + 7;
        }
        return new a(i12, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i h(n60.f fVar, n60.f fVar2) {
        return new z(this, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i i(n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
        return new z(this, fVar, fVar2, fVarArr);
    }

    @Override // n60.e
    public n60.f m(BigInteger bigInteger) {
        return new y(bigInteger);
    }

    @Override // n60.e
    public int t() {
        return f47985j.bitLength();
    }

    @Override // n60.e
    public n60.i u() {
        return this.f47987i;
    }
}