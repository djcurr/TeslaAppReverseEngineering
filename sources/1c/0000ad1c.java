package q60;

import java.math.BigInteger;
import java.security.SecureRandom;
import n60.e;

/* loaded from: classes5.dex */
public class a extends e.c {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f47787j = c.f47808h;

    /* renamed from: k  reason: collision with root package name */
    private static final n60.f[] f47788k = {new c(n60.d.f40585b)};

    /* renamed from: i  reason: collision with root package name */
    protected d f47789i;

    /* renamed from: q60.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C1021a extends n60.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f47790a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f47791b;

        C1021a(int i11, int[] iArr) {
            this.f47790a = i11;
            this.f47791b = iArr;
        }

        private n60.i d(int[] iArr, int[] iArr2) {
            return a.this.i(new c(iArr), new c(iArr2), a.f47788k);
        }

        @Override // n60.g
        public int a() {
            return this.f47790a;
        }

        @Override // n60.g
        public n60.i b(int i11) {
            int[] f11 = v60.d.f();
            int[] f12 = v60.d.f();
            int i12 = 0;
            for (int i13 = 0; i13 < this.f47790a; i13++) {
                int i14 = ((i13 ^ i11) - 1) >> 31;
                for (int i15 = 0; i15 < 4; i15++) {
                    int i16 = f11[i15];
                    int[] iArr = this.f47791b;
                    f11[i15] = i16 ^ (iArr[i12 + i15] & i14);
                    f12[i15] = f12[i15] ^ (iArr[(i12 + 4) + i15] & i14);
                }
                i12 += 8;
            }
            return d(f11, f12);
        }

        @Override // n60.g
        public n60.i c(int i11) {
            int[] f11 = v60.d.f();
            int[] f12 = v60.d.f();
            int i12 = i11 * 4 * 2;
            for (int i13 = 0; i13 < 4; i13++) {
                int[] iArr = this.f47791b;
                f11[i13] = iArr[i12 + i13];
                f12[i13] = iArr[i12 + 4 + i13];
            }
            return d(f11, f12);
        }
    }

    public a() {
        super(f47787j);
        this.f47789i = new d(this, null, null);
        this.f40591b = m(new BigInteger(1, org.bouncycastle.util.encoders.b.b("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f40592c = m(new BigInteger(1, org.bouncycastle.util.encoders.b.b("E87579C11079F43DD824993C2CEE5ED3")));
        this.f40593d = new BigInteger(1, org.bouncycastle.util.encoders.b.b("FFFFFFFE0000000075A30D1B9038A115"));
        this.f40594e = BigInteger.valueOf(1L);
        this.f40595f = 2;
    }

    @Override // n60.e.c, n60.e
    public n60.f C(SecureRandom secureRandom) {
        int[] f11 = v60.d.f();
        b.k(secureRandom, f11);
        return new c(f11);
    }

    @Override // n60.e
    public boolean D(int i11) {
        return i11 == 2;
    }

    @Override // n60.e
    protected n60.e c() {
        return new a();
    }

    @Override // n60.e
    public n60.g e(n60.i[] iVarArr, int i11, int i12) {
        int[] iArr = new int[i12 * 4 * 2];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            n60.i iVar = iVarArr[i11 + i14];
            v60.d.c(((c) iVar.n()).f47809g, 0, iArr, i13);
            int i15 = i13 + 4;
            v60.d.c(((c) iVar.o()).f47809g, 0, iArr, i15);
            i13 = i15 + 4;
        }
        return new C1021a(i12, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i h(n60.f fVar, n60.f fVar2) {
        return new d(this, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i i(n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
        return new d(this, fVar, fVar2, fVarArr);
    }

    @Override // n60.e
    public n60.f m(BigInteger bigInteger) {
        return new c(bigInteger);
    }

    @Override // n60.e
    public int t() {
        return f47787j.bitLength();
    }

    @Override // n60.e
    public n60.i u() {
        return this.f47789i;
    }
}