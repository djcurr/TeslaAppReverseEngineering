package q60;

import java.math.BigInteger;
import java.security.SecureRandom;
import n60.e;

/* loaded from: classes5.dex */
public class o extends e.c {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f47920j = q.f47937h;

    /* renamed from: k  reason: collision with root package name */
    private static final n60.f[] f47921k = {new q(n60.d.f40585b)};

    /* renamed from: i  reason: collision with root package name */
    protected r f47922i;

    /* loaded from: classes5.dex */
    class a extends n60.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f47923a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f47924b;

        a(int i11, int[] iArr) {
            this.f47923a = i11;
            this.f47924b = iArr;
        }

        private n60.i d(int[] iArr, int[] iArr2) {
            return o.this.i(new q(iArr), new q(iArr2), o.f47921k);
        }

        @Override // n60.g
        public int a() {
            return this.f47923a;
        }

        @Override // n60.g
        public n60.i b(int i11) {
            int[] h11 = v60.f.h();
            int[] h12 = v60.f.h();
            int i12 = 0;
            for (int i13 = 0; i13 < this.f47923a; i13++) {
                int i14 = ((i13 ^ i11) - 1) >> 31;
                for (int i15 = 0; i15 < 6; i15++) {
                    int i16 = h11[i15];
                    int[] iArr = this.f47924b;
                    h11[i15] = i16 ^ (iArr[i12 + i15] & i14);
                    h12[i15] = h12[i15] ^ (iArr[(i12 + 6) + i15] & i14);
                }
                i12 += 12;
            }
            return d(h11, h12);
        }

        @Override // n60.g
        public n60.i c(int i11) {
            int[] h11 = v60.f.h();
            int[] h12 = v60.f.h();
            int i12 = i11 * 6 * 2;
            for (int i13 = 0; i13 < 6; i13++) {
                int[] iArr = this.f47924b;
                h11[i13] = iArr[i12 + i13];
                h12[i13] = iArr[i12 + 6 + i13];
            }
            return d(h11, h12);
        }
    }

    public o() {
        super(f47920j);
        this.f47922i = new r(this, null, null);
        this.f40591b = m(n60.d.f40584a);
        this.f40592c = m(BigInteger.valueOf(3L));
        this.f40593d = new BigInteger(1, org.bouncycastle.util.encoders.b.b("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D"));
        this.f40594e = BigInteger.valueOf(1L);
        this.f40595f = 2;
    }

    @Override // n60.e.c, n60.e
    public n60.f C(SecureRandom secureRandom) {
        int[] h11 = v60.f.h();
        p.j(secureRandom, h11);
        return new q(h11);
    }

    @Override // n60.e
    public boolean D(int i11) {
        return i11 == 2;
    }

    @Override // n60.e
    protected n60.e c() {
        return new o();
    }

    @Override // n60.e
    public n60.g e(n60.i[] iVarArr, int i11, int i12) {
        int[] iArr = new int[i12 * 6 * 2];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            n60.i iVar = iVarArr[i11 + i14];
            v60.f.e(((q) iVar.n()).f47938g, 0, iArr, i13);
            int i15 = i13 + 6;
            v60.f.e(((q) iVar.o()).f47938g, 0, iArr, i15);
            i13 = i15 + 6;
        }
        return new a(i12, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i h(n60.f fVar, n60.f fVar2) {
        return new r(this, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i i(n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
        return new r(this, fVar, fVar2, fVarArr);
    }

    @Override // n60.e
    public n60.f m(BigInteger bigInteger) {
        return new q(bigInteger);
    }

    @Override // n60.e
    public int t() {
        return f47920j.bitLength();
    }

    @Override // n60.e
    public n60.i u() {
        return this.f47922i;
    }
}