package q60;

import java.math.BigInteger;
import n60.e;

/* loaded from: classes5.dex */
public class q1 extends e.b {

    /* renamed from: k  reason: collision with root package name */
    private static final n60.f[] f47945k = {new p1(n60.d.f40585b)};

    /* renamed from: j  reason: collision with root package name */
    protected r1 f47946j;

    /* loaded from: classes5.dex */
    class a extends n60.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f47947a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long[] f47948b;

        a(int i11, long[] jArr) {
            this.f47947a = i11;
            this.f47948b = jArr;
        }

        private n60.i d(long[] jArr, long[] jArr2) {
            return q1.this.i(new p1(jArr), new p1(jArr2), q1.f47945k);
        }

        @Override // n60.g
        public int a() {
            return this.f47947a;
        }

        @Override // n60.g
        public n60.i b(int i11) {
            long[] j11 = v60.h.j();
            long[] j12 = v60.h.j();
            int i12 = 0;
            for (int i13 = 0; i13 < this.f47947a; i13++) {
                long j13 = ((i13 ^ i11) - 1) >> 31;
                for (int i14 = 0; i14 < 4; i14++) {
                    long j14 = j11[i14];
                    long[] jArr = this.f47948b;
                    j11[i14] = j14 ^ (jArr[i12 + i14] & j13);
                    j12[i14] = j12[i14] ^ (jArr[(i12 + 4) + i14] & j13);
                }
                i12 += 8;
            }
            return d(j11, j12);
        }

        @Override // n60.g
        public n60.i c(int i11) {
            long[] j11 = v60.h.j();
            long[] j12 = v60.h.j();
            int i12 = i11 * 4 * 2;
            for (int i13 = 0; i13 < 4; i13++) {
                long[] jArr = this.f47948b;
                j11[i13] = jArr[i12 + i13];
                j12[i13] = jArr[i12 + 4 + i13];
            }
            return d(j11, j12);
        }
    }

    public q1() {
        super(193, 15, 0, 0);
        this.f47946j = new r1(this, null, null);
        this.f40591b = m(new BigInteger(1, org.bouncycastle.util.encoders.b.b("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01")));
        this.f40592c = m(new BigInteger(1, org.bouncycastle.util.encoders.b.b("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814")));
        this.f40593d = new BigInteger(1, org.bouncycastle.util.encoders.b.b("01000000000000000000000000C7F34A778F443ACC920EBA49"));
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
        return new q1();
    }

    @Override // n60.e
    public n60.g e(n60.i[] iVarArr, int i11, int i12) {
        long[] jArr = new long[i12 * 4 * 2];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            n60.i iVar = iVarArr[i11 + i14];
            v60.h.g(((p1) iVar.n()).f47936g, 0, jArr, i13);
            int i15 = i13 + 4;
            v60.h.g(((p1) iVar.o()).f47936g, 0, jArr, i15);
            i13 = i15 + 4;
        }
        return new a(i12, jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i h(n60.f fVar, n60.f fVar2) {
        return new r1(this, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i i(n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
        return new r1(this, fVar, fVar2, fVarArr);
    }

    @Override // n60.e
    public n60.f m(BigInteger bigInteger) {
        return new p1(bigInteger);
    }

    @Override // n60.e
    public int t() {
        return 193;
    }

    @Override // n60.e
    public n60.i u() {
        return this.f47946j;
    }
}