package q60;

import java.math.BigInteger;
import n60.e;

/* loaded from: classes5.dex */
public class w0 extends e.b {

    /* renamed from: k  reason: collision with root package name */
    private static final n60.f[] f47991k = {new v0(n60.d.f40585b)};

    /* renamed from: j  reason: collision with root package name */
    protected x0 f47992j;

    /* loaded from: classes5.dex */
    class a extends n60.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f47993a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long[] f47994b;

        a(int i11, long[] jArr) {
            this.f47993a = i11;
            this.f47994b = jArr;
        }

        private n60.i d(long[] jArr, long[] jArr2) {
            return w0.this.i(new v0(jArr), new v0(jArr2), w0.f47991k);
        }

        @Override // n60.g
        public int a() {
            return this.f47993a;
        }

        @Override // n60.g
        public n60.i b(int i11) {
            long[] g11 = v60.d.g();
            long[] g12 = v60.d.g();
            int i12 = 0;
            for (int i13 = 0; i13 < this.f47993a; i13++) {
                long j11 = ((i13 ^ i11) - 1) >> 31;
                for (int i14 = 0; i14 < 2; i14++) {
                    long j12 = g11[i14];
                    long[] jArr = this.f47994b;
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
                long[] jArr = this.f47994b;
                g11[i13] = jArr[i12 + i13];
                g12[i13] = jArr[i12 + 2 + i13];
            }
            return d(g11, g12);
        }
    }

    public w0() {
        super(113, 9, 0, 0);
        this.f47992j = new x0(this, null, null);
        this.f40591b = m(new BigInteger(1, org.bouncycastle.util.encoders.b.b("003088250CA6E7C7FE649CE85820F7")));
        this.f40592c = m(new BigInteger(1, org.bouncycastle.util.encoders.b.b("00E8BEE4D3E2260744188BE0E9C723")));
        this.f40593d = new BigInteger(1, org.bouncycastle.util.encoders.b.b("0100000000000000D9CCEC8A39E56F"));
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
        return new w0();
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
        return new x0(this, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i i(n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
        return new x0(this, fVar, fVar2, fVarArr);
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
        return this.f47992j;
    }
}