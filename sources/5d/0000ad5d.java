package q60;

import java.math.BigInteger;
import n60.e;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes5.dex */
public class m1 extends e.b {

    /* renamed from: k  reason: collision with root package name */
    private static final n60.f[] f47907k = {new h1(n60.d.f40585b)};

    /* renamed from: j  reason: collision with root package name */
    protected n1 f47908j;

    /* loaded from: classes5.dex */
    class a extends n60.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f47909a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long[] f47910b;

        a(int i11, long[] jArr) {
            this.f47909a = i11;
            this.f47910b = jArr;
        }

        private n60.i d(long[] jArr, long[] jArr2) {
            return m1.this.i(new h1(jArr), new h1(jArr2), m1.f47907k);
        }

        @Override // n60.g
        public int a() {
            return this.f47909a;
        }

        @Override // n60.g
        public n60.i b(int i11) {
            long[] i12 = v60.f.i();
            long[] i13 = v60.f.i();
            int i14 = 0;
            for (int i15 = 0; i15 < this.f47909a; i15++) {
                long j11 = ((i15 ^ i11) - 1) >> 31;
                for (int i16 = 0; i16 < 3; i16++) {
                    long j12 = i12[i16];
                    long[] jArr = this.f47910b;
                    i12[i16] = j12 ^ (jArr[i14 + i16] & j11);
                    i13[i16] = i13[i16] ^ (jArr[(i14 + 3) + i16] & j11);
                }
                i14 += 6;
            }
            return d(i12, i13);
        }

        @Override // n60.g
        public n60.i c(int i11) {
            long[] i12 = v60.f.i();
            long[] i13 = v60.f.i();
            int i14 = i11 * 3 * 2;
            for (int i15 = 0; i15 < 3; i15++) {
                long[] jArr = this.f47910b;
                i12[i15] = jArr[i14 + i15];
                i13[i15] = jArr[i14 + 3 + i15];
            }
            return d(i12, i13);
        }
    }

    public m1() {
        super(CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, 3, 6, 7);
        this.f47908j = new n1(this, null, null);
        this.f40591b = m(BigInteger.valueOf(1L));
        this.f40592c = m(new BigInteger(1, org.bouncycastle.util.encoders.b.b("020A601907B8C953CA1481EB10512F78744A3205FD")));
        this.f40593d = new BigInteger(1, org.bouncycastle.util.encoders.b.b("040000000000000000000292FE77E70C12A4234C33"));
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
        return new m1();
    }

    @Override // n60.e
    public n60.g e(n60.i[] iVarArr, int i11, int i12) {
        long[] jArr = new long[i12 * 3 * 2];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            n60.i iVar = iVarArr[i11 + i14];
            v60.f.f(((h1) iVar.n()).f47861g, 0, jArr, i13);
            int i15 = i13 + 3;
            v60.f.f(((h1) iVar.o()).f47861g, 0, jArr, i15);
            i13 = i15 + 3;
        }
        return new a(i12, jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i h(n60.f fVar, n60.f fVar2) {
        return new n1(this, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i i(n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
        return new n1(this, fVar, fVar2, fVarArr);
    }

    @Override // n60.e
    public n60.f m(BigInteger bigInteger) {
        return new h1(bigInteger);
    }

    @Override // n60.e
    public int t() {
        return CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384;
    }

    @Override // n60.e
    public n60.i u() {
        return this.f47908j;
    }
}