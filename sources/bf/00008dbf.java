package o60;

import java.math.BigInteger;
import java.security.SecureRandom;
import n60.e;
import n60.f;
import n60.g;
import n60.i;
import v60.h;

/* loaded from: classes5.dex */
public class a extends e.c {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f42290j = c.f42300h;

    /* renamed from: k  reason: collision with root package name */
    private static final BigInteger f42291k;

    /* renamed from: l  reason: collision with root package name */
    private static final BigInteger f42292l;

    /* renamed from: m  reason: collision with root package name */
    private static final f[] f42293m;

    /* renamed from: i  reason: collision with root package name */
    protected d f42294i;

    /* renamed from: o60.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C0836a extends n60.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f42295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f42296b;

        C0836a(int i11, int[] iArr) {
            this.f42295a = i11;
            this.f42296b = iArr;
        }

        private i d(int[] iArr, int[] iArr2) {
            return a.this.i(new c(iArr), new c(iArr2), a.f42293m);
        }

        @Override // n60.g
        public int a() {
            return this.f42295a;
        }

        @Override // n60.g
        public i b(int i11) {
            int[] i12 = h.i();
            int[] i13 = h.i();
            int i14 = 0;
            for (int i15 = 0; i15 < this.f42295a; i15++) {
                int i16 = ((i15 ^ i11) - 1) >> 31;
                for (int i17 = 0; i17 < 8; i17++) {
                    int i18 = i12[i17];
                    int[] iArr = this.f42296b;
                    i12[i17] = i18 ^ (iArr[i14 + i17] & i16);
                    i13[i17] = i13[i17] ^ (iArr[(i14 + 8) + i17] & i16);
                }
                i14 += 16;
            }
            return d(i12, i13);
        }

        @Override // n60.g
        public i c(int i11) {
            int[] i12 = h.i();
            int[] i13 = h.i();
            int i14 = i11 * 8 * 2;
            for (int i15 = 0; i15 < 8; i15++) {
                int[] iArr = this.f42296b;
                i12[i15] = iArr[i14 + i15];
                i13[i15] = iArr[i14 + 8 + i15];
            }
            return d(i12, i13);
        }
    }

    static {
        BigInteger bigInteger = new BigInteger(1, org.bouncycastle.util.encoders.b.b("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144"));
        f42291k = bigInteger;
        f42292l = new BigInteger(1, org.bouncycastle.util.encoders.b.b("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864"));
        f42293m = new f[]{new c(n60.d.f40585b), new c(bigInteger)};
    }

    public a() {
        super(f42290j);
        this.f42294i = new d(this, null, null);
        this.f40591b = m(f42291k);
        this.f40592c = m(f42292l);
        this.f40593d = new BigInteger(1, org.bouncycastle.util.encoders.b.b("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.f40594e = BigInteger.valueOf(8L);
        this.f40595f = 4;
    }

    @Override // n60.e.c, n60.e
    public f C(SecureRandom secureRandom) {
        int[] i11 = h.i();
        b.k(secureRandom, i11);
        return new c(i11);
    }

    @Override // n60.e
    public boolean D(int i11) {
        return i11 == 4;
    }

    @Override // n60.e
    protected e c() {
        return new a();
    }

    @Override // n60.e
    public g e(i[] iVarArr, int i11, int i12) {
        int[] iArr = new int[i12 * 8 * 2];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            i iVar = iVarArr[i11 + i14];
            h.f(((c) iVar.n()).f42302g, 0, iArr, i13);
            int i15 = i13 + 8;
            h.f(((c) iVar.o()).f42302g, 0, iArr, i15);
            i13 = i15 + 8;
        }
        return new C0836a(i12, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public i h(f fVar, f fVar2) {
        return new d(this, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public i i(f fVar, f fVar2, f[] fVarArr) {
        return new d(this, fVar, fVar2, fVarArr);
    }

    @Override // n60.e
    public f m(BigInteger bigInteger) {
        return new c(bigInteger);
    }

    @Override // n60.e
    public int t() {
        return f42290j.bitLength();
    }

    @Override // n60.e
    public i u() {
        return this.f42294i;
    }
}