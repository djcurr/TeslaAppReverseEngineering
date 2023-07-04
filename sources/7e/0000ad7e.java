package q60;

import java.math.BigInteger;
import n60.e;

/* loaded from: classes5.dex */
public class s2 extends e.b {

    /* renamed from: k  reason: collision with root package name */
    private static final n60.f[] f47966k = {new r2(n60.d.f40585b)};

    /* renamed from: j  reason: collision with root package name */
    protected t2 f47967j;

    /* loaded from: classes5.dex */
    class a extends n60.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f47968a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long[] f47969b;

        a(int i11, long[] jArr) {
            this.f47968a = i11;
            this.f47969b = jArr;
        }

        private n60.i d(long[] jArr, long[] jArr2) {
            return s2.this.i(new r2(jArr), new r2(jArr2), s2.f47966k);
        }

        @Override // n60.g
        public int a() {
            return this.f47968a;
        }

        @Override // n60.g
        public n60.i b(int i11) {
            long[] c11 = v60.m.c();
            long[] c12 = v60.m.c();
            int i12 = 0;
            for (int i13 = 0; i13 < this.f47968a; i13++) {
                long j11 = ((i13 ^ i11) - 1) >> 31;
                for (int i14 = 0; i14 < 9; i14++) {
                    long j12 = c11[i14];
                    long[] jArr = this.f47969b;
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
                long[] jArr = this.f47969b;
                c11[i13] = jArr[i12 + i13];
                c12[i13] = jArr[i12 + 9 + i13];
            }
            return d(c11, c12);
        }
    }

    public s2() {
        super(571, 2, 5, 10);
        this.f47967j = new t2(this, null, null);
        this.f40591b = m(BigInteger.valueOf(0L));
        this.f40592c = m(BigInteger.valueOf(1L));
        this.f40593d = new BigInteger(1, org.bouncycastle.util.encoders.b.b("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
        this.f40594e = BigInteger.valueOf(4L);
        this.f40595f = 6;
    }

    @Override // n60.e
    public boolean D(int i11) {
        return i11 == 6;
    }

    @Override // n60.e.b
    public boolean I() {
        return true;
    }

    @Override // n60.e
    protected n60.e c() {
        return new s2();
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

    @Override // n60.e
    protected n60.h f() {
        return new n60.y();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i h(n60.f fVar, n60.f fVar2) {
        return new t2(this, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i i(n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
        return new t2(this, fVar, fVar2, fVarArr);
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
        return this.f47967j;
    }
}