package q60;

import java.math.BigInteger;
import java.security.SecureRandom;
import n60.e;

/* loaded from: classes5.dex */
public class g extends e.c {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f47844j = i.f47862h;

    /* renamed from: k  reason: collision with root package name */
    private static final n60.f[] f47845k = {new i(n60.d.f40585b)};

    /* renamed from: i  reason: collision with root package name */
    protected j f47846i;

    /* loaded from: classes5.dex */
    class a extends n60.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f47847a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f47848b;

        a(int i11, int[] iArr) {
            this.f47847a = i11;
            this.f47848b = iArr;
        }

        private n60.i d(int[] iArr, int[] iArr2) {
            return g.this.i(new i(iArr), new i(iArr2), g.f47845k);
        }

        @Override // n60.g
        public int a() {
            return this.f47847a;
        }

        @Override // n60.g
        public n60.i b(int i11) {
            int[] d11 = v60.e.d();
            int[] d12 = v60.e.d();
            int i12 = 0;
            for (int i13 = 0; i13 < this.f47847a; i13++) {
                int i14 = ((i13 ^ i11) - 1) >> 31;
                for (int i15 = 0; i15 < 5; i15++) {
                    int i16 = d11[i15];
                    int[] iArr = this.f47848b;
                    d11[i15] = i16 ^ (iArr[i12 + i15] & i14);
                    d12[i15] = d12[i15] ^ (iArr[(i12 + 5) + i15] & i14);
                }
                i12 += 10;
            }
            return d(d11, d12);
        }

        @Override // n60.g
        public n60.i c(int i11) {
            int[] d11 = v60.e.d();
            int[] d12 = v60.e.d();
            int i12 = i11 * 5 * 2;
            for (int i13 = 0; i13 < 5; i13++) {
                int[] iArr = this.f47848b;
                d11[i13] = iArr[i12 + i13];
                d12[i13] = iArr[i12 + 5 + i13];
            }
            return d(d11, d12);
        }
    }

    public g() {
        super(f47844j);
        this.f47846i = new j(this, null, null);
        this.f40591b = m(new BigInteger(1, org.bouncycastle.util.encoders.b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC")));
        this.f40592c = m(new BigInteger(1, org.bouncycastle.util.encoders.b.b("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45")));
        this.f40593d = new BigInteger(1, org.bouncycastle.util.encoders.b.b("0100000000000000000001F4C8F927AED3CA752257"));
        this.f40594e = BigInteger.valueOf(1L);
        this.f40595f = 2;
    }

    @Override // n60.e.c, n60.e
    public n60.f C(SecureRandom secureRandom) {
        int[] d11 = v60.e.d();
        h.j(secureRandom, d11);
        return new i(d11);
    }

    @Override // n60.e
    public boolean D(int i11) {
        return i11 == 2;
    }

    @Override // n60.e
    protected n60.e c() {
        return new g();
    }

    @Override // n60.e
    public n60.g e(n60.i[] iVarArr, int i11, int i12) {
        int[] iArr = new int[i12 * 5 * 2];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            n60.i iVar = iVarArr[i11 + i14];
            v60.e.c(((i) iVar.n()).f47863g, 0, iArr, i13);
            int i15 = i13 + 5;
            v60.e.c(((i) iVar.o()).f47863g, 0, iArr, i15);
            i13 = i15 + 5;
        }
        return new a(i12, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i h(n60.f fVar, n60.f fVar2) {
        return new j(this, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i i(n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
        return new j(this, fVar, fVar2, fVarArr);
    }

    @Override // n60.e
    public n60.f m(BigInteger bigInteger) {
        return new i(bigInteger);
    }

    @Override // n60.e
    public int t() {
        return f47844j.bitLength();
    }

    @Override // n60.e
    public n60.i u() {
        return this.f47846i;
    }
}