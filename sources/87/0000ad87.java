package q60;

import java.math.BigInteger;
import n60.e;

/* loaded from: classes5.dex */
public class u2 extends e.b {

    /* renamed from: k  reason: collision with root package name */
    private static final n60.f[] f47976k = {new r2(n60.d.f40585b)};

    /* renamed from: l  reason: collision with root package name */
    static final r2 f47977l;

    /* renamed from: m  reason: collision with root package name */
    static final r2 f47978m;

    /* renamed from: j  reason: collision with root package name */
    protected v2 f47979j;

    /* loaded from: classes5.dex */
    class a extends n60.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f47980a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long[] f47981b;

        a(int i11, long[] jArr) {
            this.f47980a = i11;
            this.f47981b = jArr;
        }

        private n60.i d(long[] jArr, long[] jArr2) {
            return u2.this.i(new r2(jArr), new r2(jArr2), u2.f47976k);
        }

        @Override // n60.g
        public int a() {
            return this.f47980a;
        }

        @Override // n60.g
        public n60.i b(int i11) {
            long[] c11 = v60.m.c();
            long[] c12 = v60.m.c();
            int i12 = 0;
            for (int i13 = 0; i13 < this.f47980a; i13++) {
                long j11 = ((i13 ^ i11) - 1) >> 31;
                for (int i14 = 0; i14 < 9; i14++) {
                    long j12 = c11[i14];
                    long[] jArr = this.f47981b;
                    c11[i14] = j12 ^ (jArr[i12 + i14] & j11);
                    c12[i14] = c12[i14] ^ (jArr[(i12 + 9) + i14] & j11);
                }
                i12 += 18;
            }
            return d(c11, c12);
        }

        @Override // n60.g
        public n60.i c(int i11) {
            long[] c11 = v60.m.c();
            long[] c12 = v60.m.c();
            int i12 = i11 * 9 * 2;
            for (int i13 = 0; i13 < 9; i13++) {
                long[] jArr = this.f47981b;
                c11[i13] = jArr[i12 + i13];
                c12[i13] = jArr[i12 + 9 + i13];
            }
            return d(c11, c12);
        }
    }

    static {
        r2 r2Var = new r2(new BigInteger(1, org.bouncycastle.util.encoders.b.b("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));
        f47977l = r2Var;
        f47978m = (r2) r2Var.n();
    }

    public u2() {
        super(571, 2, 5, 10);
        this.f47979j = new v2(this, null, null);
        this.f40591b = m(BigInteger.valueOf(1L));
        this.f40592c = f47977l;
        this.f40593d = new BigInteger(1, org.bouncycastle.util.encoders.b.b("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
        this.f40594e = BigInteger.valueOf(2L);
        this.f40595f = 6;
    }

    @Override // n60.e
    public boolean D(int i11) {
        return i11 == 6;
    }

    @Override // n60.e.b
    public boolean I() {
        return false;
    }

    @Override // n60.e
    protected n60.e c() {
        return new u2();
    }

    @Override // n60.e
    public n60.g e(n60.i[] iVarArr, int i11, int i12) {
        long[] jArr = new long[i12 * 9 * 2];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            n60.i iVar = iVarArr[i11 + i14];
            v60.m.a(((r2) iVar.n()).f47952g, 0, jArr, i13);
            int i15 = i13 + 9;
            v60.m.a(((r2) iVar.o()).f47952g, 0, jArr, i15);
            i13 = i15 + 9;
        }
        return new a(i12, jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i h(n60.f fVar, n60.f fVar2) {
        return new v2(this, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i i(n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
        return new v2(this, fVar, fVar2, fVarArr);
    }

    @Override // n60.e
    public n60.f m(BigInteger bigInteger) {
        return new r2(bigInteger);
    }

    @Override // n60.e
    public int t() {
        return 571;
    }

    @Override // n60.e
    public n60.i u() {
        return this.f47979j;
    }
}