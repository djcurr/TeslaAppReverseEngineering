package q60;

import com.google.android.gms.wallet.WalletConstants;
import java.math.BigInteger;
import n60.e;

/* loaded from: classes5.dex */
public class o2 extends e.b {

    /* renamed from: k  reason: collision with root package name */
    private static final n60.f[] f47928k = {new l2(n60.d.f40585b)};

    /* renamed from: j  reason: collision with root package name */
    protected p2 f47929j;

    /* loaded from: classes5.dex */
    class a extends n60.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f47930a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long[] f47931b;

        a(int i11, long[] jArr) {
            this.f47930a = i11;
            this.f47931b = jArr;
        }

        private n60.i d(long[] jArr, long[] jArr2) {
            return o2.this.i(new l2(jArr), new l2(jArr2), o2.f47928k);
        }

        @Override // n60.g
        public int a() {
            return this.f47930a;
        }

        @Override // n60.g
        public n60.i b(int i11) {
            long[] c11 = v60.k.c();
            long[] c12 = v60.k.c();
            int i12 = 0;
            for (int i13 = 0; i13 < this.f47930a; i13++) {
                long j11 = ((i13 ^ i11) - 1) >> 31;
                for (int i14 = 0; i14 < 7; i14++) {
                    long j12 = c11[i14];
                    long[] jArr = this.f47931b;
                    c11[i14] = j12 ^ (jArr[i12 + i14] & j11);
                    c12[i14] = c12[i14] ^ (jArr[(i12 + 7) + i14] & j11);
                }
                i12 += 14;
            }
            return d(c11, c12);
        }

        @Override // n60.g
        public n60.i c(int i11) {
            long[] c11 = v60.k.c();
            long[] c12 = v60.k.c();
            int i12 = i11 * 7 * 2;
            for (int i13 = 0; i13 < 7; i13++) {
                long[] jArr = this.f47931b;
                c11[i13] = jArr[i12 + i13];
                c12[i13] = jArr[i12 + 7 + i13];
            }
            return d(c11, c12);
        }
    }

    public o2() {
        super(WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR, 87, 0, 0);
        this.f47929j = new p2(this, null, null);
        this.f40591b = m(BigInteger.valueOf(1L));
        this.f40592c = m(new BigInteger(1, org.bouncycastle.util.encoders.b.b("0021A5C2C8EE9FEB5C4B9A753B7B476B7FD6422EF1F3DD674761FA99D6AC27C8A9A197B272822F6CD57A55AA4F50AE317B13545F")));
        this.f40593d = new BigInteger(1, org.bouncycastle.util.encoders.b.b("010000000000000000000000000000000000000000000000000001E2AAD6A612F33307BE5FA47C3C9E052F838164CD37D9A21173"));
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
        return new o2();
    }

    @Override // n60.e
    public n60.g e(n60.i[] iVarArr, int i11, int i12) {
        long[] jArr = new long[i12 * 7 * 2];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            n60.i iVar = iVarArr[i11 + i14];
            v60.k.a(((l2) iVar.n()).f47898g, 0, jArr, i13);
            int i15 = i13 + 7;
            v60.k.a(((l2) iVar.o()).f47898g, 0, jArr, i15);
            i13 = i15 + 7;
        }
        return new a(i12, jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i h(n60.f fVar, n60.f fVar2) {
        return new p2(this, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n60.e
    public n60.i i(n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
        return new p2(this, fVar, fVar2, fVarArr);
    }

    @Override // n60.e
    public n60.f m(BigInteger bigInteger) {
        return new l2(bigInteger);
    }

    @Override // n60.e
    public int t() {
        return WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR;
    }

    @Override // n60.e
    public n60.i u() {
        return this.f47929j;
    }
}