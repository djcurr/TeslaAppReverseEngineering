package q60;

import java.math.BigInteger;
import n60.e;

/* loaded from: classes5.dex */
public class y0 extends e.b {

    /* renamed from: k  reason: collision with root package name */
    private static final n60.f[] f48007k = {new v0(n60.d.f40585b)};

    /* renamed from: j  reason: collision with root package name */
    protected z0 f48008j;

    /* loaded from: classes5.dex */
    class a extends n60.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f48009a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long[] f48010b;

        a(int i11, long[] jArr) {
            this.f48009a = i11;
            this.f48010b = jArr;
        }

        private n60.i d(long[] jArr, long[] jArr2) {
            return y0.this.i(new v0(jArr), new v0(jArr2), y0.f48007k);
        }

        @Override // n60.g
        public int a() {
            return this.f48009a;
        }

        @Override // n60.g
        public n60.i b(int i11) {
            long[] g11 = v60.d.g();
            long[] g12 = v60.d.g();
            int i12 = 0;
            for (int i13 = 0; i13 < this.f48009a; i13++) {
                long j11 = ((i13 ^ i11) - 1) >> 31;
                for (int i14 = 0; i14 < 2; i14++) {
                    long j12 = g11[i14];
                    long[] jArr = this.f48010b;
                    g11[i14] = j12 ^ (jArr[i12 + i14] & j11);
                    g12[i14] = g12[i14] ^ (jArr[(i12 + 2) + i14] & j11);
                }
                i12 += 4;
            }
            return d(g11, g12);
        }

        @Override // n60.g
        public n60.i c(int i11) {
            long[] g11 = v60.d.g();
            long[] g12 = v60.d.g();
            int i12 = i11 * 2 * 2;
            for (int i13 = 0; i13 < 2; i13++) {
                long[] jArr = this.f48010b;
                g11[i13] = jArr[i12 + i13];
                g12[i13] = jArr[i12 + 2 + i13];
            }
            return d(g11, g12);
        }
    }

    public y0() {
        super(113, 9, 0, 0);
        this.f48008j = new z0(this, null, null);
        this.f40591b = m(new BigInteger(1, org.bouncycastle.util.encoders.b.b("00689918DBEC7E5A0DD6DFC0AA55C7")));
        this.f40592c = m(new BigInteger(1, org.bouncycastle.util.encoders.b.b("0095E9A9EC9B297BD4BF36E059184F")));
        this.f40593d = new BigInteger(1, org.bouncycastle.util.encoders.b.b("010000000000000108789B2496AF93"));
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
        return new y0();
    }

    @Override // n60.e
    public n60.g e(n60.i[] iVarArr, int i11, int i12) {
        long[] jArr = new long[i12 * 2 * 2];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            n60.i iVar = iVarArr[i11 + i14];
            v60.d.d(((v0) iVar.n()).f47983g, 0, jArr, i13);
            int i15 = i13 + 2;
            v60.d.d(((v0) iVar.o()).f47983g, 0, jArr, i15);
            i13 = i15 + 2;
        }
        return new a(i12, jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i h(n60.f fVar, n60.f fVar2) {
        return new z0(this, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i i(n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
        return new z0(this, fVar, fVar2, fVarArr);
    }

    @Override // n60.e
    public n60.f m(BigInteger bigInteger) {
        return new v0(bigInteger);
    }

    @Override // n60.e
    public int t() {
        return 113;
    }

    @Override // n60.e
    public n60.i u() {
        return this.f48008j;
    }
}