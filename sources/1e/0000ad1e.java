package q60;

import java.math.BigInteger;
import java.security.SecureRandom;
import n60.e;

/* loaded from: classes5.dex */
public class a0 extends e.c {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f47793j = c0.f47810h;

    /* renamed from: k  reason: collision with root package name */
    private static final n60.f[] f47794k = {new c0(n60.d.f40585b)};

    /* renamed from: i  reason: collision with root package name */
    protected d0 f47795i;

    /* loaded from: classes5.dex */
    class a extends n60.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f47796a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f47797b;

        a(int i11, int[] iArr) {
            this.f47796a = i11;
            this.f47797b = iArr;
        }

        private n60.i d(int[] iArr, int[] iArr2) {
            return a0.this.i(new c0(iArr), new c0(iArr2), a0.f47794k);
        }

        @Override // n60.g
        public int a() {
            return this.f47796a;
        }

        @Override // n60.g
        public n60.i b(int i11) {
            int[] e11 = v60.g.e();
            int[] e12 = v60.g.e();
            int i12 = 0;
            for (int i13 = 0; i13 < this.f47796a; i13++) {
                int i14 = ((i13 ^ i11) - 1) >> 31;
                for (int i15 = 0; i15 < 7; i15++) {
                    int i16 = e11[i15];
                    int[] iArr = this.f47797b;
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
            int i12 = i11 * 7 * 2;
            for (int i13 = 0; i13 < 7; i13++) {
                int[] iArr = this.f47797b;
                e11[i13] = iArr[i12 + i13];
                e12[i13] = iArr[i12 + 7 + i13];
            }
            return d(e11, e12);
        }
    }

    public a0() {
        super(f47793j);
        this.f47795i = new d0(this, null, null);
        this.f40591b = m(new BigInteger(1, org.bouncycastle.util.encoders.b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE")));
        this.f40592c = m(new BigInteger(1, org.bouncycastle.util.encoders.b.b("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4")));
        this.f40593d = new BigInteger(1, org.bouncycastle.util.encoders.b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"));
        this.f40594e = BigInteger.valueOf(1L);
        this.f40595f = 2;
    }

    @Override // n60.e.c, n60.e
    public n60.f C(SecureRandom secureRandom) {
        int[] e11 = v60.g.e();
        b0.k(secureRandom, e11);
        return new c0(e11);
    }

    @Override // n60.e
    public boolean D(int i11) {
        return i11 == 2;
    }

    @Override // n60.e
    protected n60.e c() {
        return new a0();
    }

    @Override // n60.e
    public n60.g e(n60.i[] iVarArr, int i11, int i12) {
        int[] iArr = new int[i12 * 7 * 2];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            n60.i iVar = iVarArr[i11 + i14];
            v60.g.c(((c0) iVar.n()).f47811g, 0, iArr, i13);
            int i15 = i13 + 7;
            v60.g.c(((c0) iVar.o()).f47811g, 0, iArr, i15);
            i13 = i15 + 7;
        }
        return new a(i12, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i h(n60.f fVar, n60.f fVar2) {
        return new d0(this, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i i(n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
        return new d0(this, fVar, fVar2, fVarArr);
    }

    @Override // n60.e
    public n60.f m(BigInteger bigInteger) {
        return new c0(bigInteger);
    }

    @Override // n60.e
    public int t() {
        return f47793j.bitLength();
    }

    @Override // n60.e
    public n60.i u() {
        return this.f47795i;
    }
}