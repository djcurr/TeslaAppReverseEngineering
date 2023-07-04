package q60;

import java.math.BigInteger;
import n60.e;

/* loaded from: classes5.dex */
public class y1 extends e.b {

    /* renamed from: k  reason: collision with root package name */
    private static final n60.f[] f48012k = {new v1(n60.d.f40585b)};

    /* renamed from: j  reason: collision with root package name */
    protected z1 f48013j;

    /* loaded from: classes5.dex */
    class a extends n60.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f48014a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long[] f48015b;

        a(int i11, long[] jArr) {
            this.f48014a = i11;
            this.f48015b = jArr;
        }

        private n60.i d(long[] jArr, long[] jArr2) {
            return y1.this.i(new v1(jArr), new v1(jArr2), y1.f48012k);
        }

        @Override // n60.g
        public int a() {
            return this.f48014a;
        }

        @Override // n60.g
        public n60.i b(int i11) {
            long[] j11 = v60.h.j();
            long[] j12 = v60.h.j();
            int i12 = 0;
            for (int i13 = 0; i13 < this.f48014a; i13++) {
                long j13 = ((i13 ^ i11) - 1) >> 31;
                for (int i14 = 0; i14 < 4; i14++) {
                    long j14 = j11[i14];
                    long[] jArr = this.f48015b;
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
                long[] jArr = this.f48015b;
                j11[i13] = jArr[i12 + i13];
                j12[i13] = jArr[i12 + 4 + i13];
            }
            return d(j11, j12);
        }
    }

    public y1() {
        super(233, 74, 0, 0);
        this.f48013j = new z1(this, null, null);
        this.f40591b = m(BigInteger.valueOf(1L));
        this.f40592c = m(new BigInteger(1, org.bouncycastle.util.encoders.b.b("0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD")));
        this.f40593d = new BigInteger(1, org.bouncycastle.util.encoders.b.b("01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7"));
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
        return new y1();
    }

    @Override // n60.e
    public n60.g e(n60.i[] iVarArr, int i11, int i12) {
        long[] jArr = new long[i12 * 4 * 2];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            n60.i iVar = iVarArr[i11 + i14];
            v60.h.g(((v1) iVar.n()).f47984g, 0, jArr, i13);
            int i15 = i13 + 4;
            v60.h.g(((v1) iVar.o()).f47984g, 0, jArr, i15);
            i13 = i15 + 4;
        }
        return new a(i12, jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i h(n60.f fVar, n60.f fVar2) {
        return new z1(this, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i i(n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
        return new z1(this, fVar, fVar2, fVarArr);
    }

    @Override // n60.e
    public n60.f m(BigInteger bigInteger) {
        return new v1(bigInteger);
    }

    @Override // n60.e
    public int t() {
        return 233;
    }

    @Override // n60.e
    public n60.i u() {
        return this.f48013j;
    }
}