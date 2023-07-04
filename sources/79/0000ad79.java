package q60;

import java.math.BigInteger;
import java.security.SecureRandom;
import n60.e;

/* loaded from: classes5.dex */
public class s extends e.c {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f47953j = u.f47974h;

    /* renamed from: k  reason: collision with root package name */
    private static final n60.f[] f47954k = {new u(n60.d.f40585b)};

    /* renamed from: i  reason: collision with root package name */
    protected v f47955i;

    /* loaded from: classes5.dex */
    class a extends n60.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f47956a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f47957b;

        a(int i11, int[] iArr) {
            this.f47956a = i11;
            this.f47957b = iArr;
        }

        private n60.i d(int[] iArr, int[] iArr2) {
            return s.this.i(new u(iArr), new u(iArr2), s.f47954k);
        }

        @Override // n60.g
        public int a() {
            return this.f47956a;
        }

        @Override // n60.g
        public n60.i b(int i11) {
            int[] h11 = v60.f.h();
            int[] h12 = v60.f.h();
            int i12 = 0;
            for (int i13 = 0; i13 < this.f47956a; i13++) {
                int i14 = ((i13 ^ i11) - 1) >> 31;
                for (int i15 = 0; i15 < 6; i15++) {
                    int i16 = h11[i15];
                    int[] iArr = this.f47957b;
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
                int[] iArr = this.f47957b;
                h11[i13] = iArr[i12 + i13];
                h12[i13] = iArr[i12 + 6 + i13];
            }
            return d(h11, h12);
        }
    }

    public s() {
        super(f47953j);
        this.f47955i = new v(this, null, null);
        this.f40591b = m(new BigInteger(1, org.bouncycastle.util.encoders.b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC")));
        this.f40592c = m(new BigInteger(1, org.bouncycastle.util.encoders.b.b("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1")));
        this.f40593d = new BigInteger(1, org.bouncycastle.util.encoders.b.b("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831"));
        this.f40594e = BigInteger.valueOf(1L);
        this.f40595f = 2;
    }

    @Override // n60.e.c, n60.e
    public n60.f C(SecureRandom secureRandom) {
        int[] h11 = v60.f.h();
        t.k(secureRandom, h11);
        return new u(h11);
    }

    @Override // n60.e
    public boolean D(int i11) {
        return i11 == 2;
    }

    @Override // n60.e
    protected n60.e c() {
        return new s();
    }

    @Override // n60.e
    public n60.g e(n60.i[] iVarArr, int i11, int i12) {
        int[] iArr = new int[i12 * 6 * 2];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            n60.i iVar = iVarArr[i11 + i14];
            v60.f.e(((u) iVar.n()).f47975g, 0, iArr, i13);
            int i15 = i13 + 6;
            v60.f.e(((u) iVar.o()).f47975g, 0, iArr, i15);
            i13 = i15 + 6;
        }
        return new a(i12, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i h(n60.f fVar, n60.f fVar2) {
        return new v(this, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i i(n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
        return new v(this, fVar, fVar2, fVarArr);
    }

    @Override // n60.e
    public n60.f m(BigInteger bigInteger) {
        return new u(bigInteger);
    }

    @Override // n60.e
    public int t() {
        return f47953j.bitLength();
    }

    @Override // n60.e
    public n60.i u() {
        return this.f47955i;
    }
}