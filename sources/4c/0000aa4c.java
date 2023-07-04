package p50;

import org.bouncycastle.crypto.v;
import u50.b1;

/* loaded from: classes5.dex */
public class n implements v {

    /* renamed from: a  reason: collision with root package name */
    protected final int f46296a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f46297b;

    /* renamed from: c  reason: collision with root package name */
    protected long f46298c;

    /* renamed from: d  reason: collision with root package name */
    protected long f46299d;

    /* renamed from: e  reason: collision with root package name */
    protected long f46300e;

    /* renamed from: f  reason: collision with root package name */
    protected long f46301f;

    /* renamed from: g  reason: collision with root package name */
    protected long f46302g;

    /* renamed from: h  reason: collision with root package name */
    protected long f46303h;

    /* renamed from: i  reason: collision with root package name */
    protected long f46304i;

    /* renamed from: j  reason: collision with root package name */
    protected int f46305j;

    /* renamed from: k  reason: collision with root package name */
    protected int f46306k;

    public n() {
        this.f46304i = 0L;
        this.f46305j = 0;
        this.f46306k = 0;
        this.f46296a = 2;
        this.f46297b = 4;
    }

    public n(int i11, int i12) {
        this.f46304i = 0L;
        this.f46305j = 0;
        this.f46306k = 0;
        this.f46296a = i11;
        this.f46297b = i12;
    }

    protected static long d(long j11, int i11) {
        return (j11 >>> (-i11)) | (j11 << i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i11) {
        long j11 = this.f46300e;
        long j12 = this.f46301f;
        long j13 = this.f46302g;
        long j14 = this.f46303h;
        for (int i12 = 0; i12 < i11; i12++) {
            long j15 = j11 + j12;
            long j16 = j13 + j14;
            long d11 = d(j12, 13) ^ j15;
            long d12 = d(j14, 16) ^ j16;
            long j17 = j16 + d11;
            j11 = d(j15, 32) + d12;
            j12 = d(d11, 17) ^ j17;
            j14 = d(d12, 21) ^ j11;
            j13 = d(j17, 32);
        }
        this.f46300e = j11;
        this.f46301f = j12;
        this.f46302g = j13;
        this.f46303h = j14;
    }

    public long b() {
        int i11;
        long j11 = this.f46304i >>> ((7 - this.f46305j) << 3);
        this.f46304i = j11;
        long j12 = j11 >>> 8;
        this.f46304i = j12;
        this.f46304i = j12 | ((((this.f46306k << 3) + i11) & 255) << 56);
        c();
        this.f46302g ^= 255;
        a(this.f46297b);
        long j13 = ((this.f46300e ^ this.f46301f) ^ this.f46302g) ^ this.f46303h;
        reset();
        return j13;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        this.f46306k++;
        this.f46303h ^= this.f46304i;
        a(this.f46296a);
        this.f46300e ^= this.f46304i;
    }

    @Override // org.bouncycastle.crypto.v
    public int doFinal(byte[] bArr, int i11) {
        r70.i.v(b(), bArr, i11);
        return 8;
    }

    @Override // org.bouncycastle.crypto.v
    public String getAlgorithmName() {
        return "SipHash-" + this.f46296a + "-" + this.f46297b;
    }

    @Override // org.bouncycastle.crypto.v
    public int getMacSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.v
    public void init(org.bouncycastle.crypto.i iVar) {
        if (!(iVar instanceof b1)) {
            throw new IllegalArgumentException("'params' must be an instance of KeyParameter");
        }
        byte[] a11 = ((b1) iVar).a();
        if (a11.length != 16) {
            throw new IllegalArgumentException("'params' must be a 128-bit key");
        }
        this.f46298c = r70.i.p(a11, 0);
        this.f46299d = r70.i.p(a11, 8);
        reset();
    }

    @Override // org.bouncycastle.crypto.v
    public void reset() {
        long j11 = this.f46298c;
        this.f46300e = 8317987319222330741L ^ j11;
        long j12 = this.f46299d;
        this.f46301f = 7237128888997146477L ^ j12;
        this.f46302g = j11 ^ 7816392313619706465L;
        this.f46303h = 8387220255154660723L ^ j12;
        this.f46304i = 0L;
        this.f46305j = 0;
        this.f46306k = 0;
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte b11) {
        long j11 = this.f46304i >>> 8;
        this.f46304i = j11;
        this.f46304i = j11 | ((b11 & 255) << 56);
        int i11 = this.f46305j + 1;
        this.f46305j = i11;
        if (i11 == 8) {
            c();
            this.f46305j = 0;
        }
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte[] bArr, int i11, int i12) {
        int i13 = i12 & (-8);
        int i14 = this.f46305j;
        int i15 = 0;
        if (i14 == 0) {
            while (i15 < i13) {
                this.f46304i = r70.i.p(bArr, i11 + i15);
                c();
                i15 += 8;
            }
            while (i15 < i12) {
                long j11 = this.f46304i >>> 8;
                this.f46304i = j11;
                this.f46304i = j11 | ((bArr[i11 + i15] & 255) << 56);
                i15++;
            }
            this.f46305j = i12 - i13;
            return;
        }
        int i16 = i14 << 3;
        int i17 = 0;
        while (i17 < i13) {
            long p11 = r70.i.p(bArr, i11 + i17);
            this.f46304i = (this.f46304i >>> (-i16)) | (p11 << i16);
            c();
            this.f46304i = p11;
            i17 += 8;
        }
        while (i17 < i12) {
            long j12 = this.f46304i >>> 8;
            this.f46304i = j12;
            this.f46304i = j12 | ((bArr[i11 + i17] & 255) << 56);
            int i18 = this.f46305j + 1;
            this.f46305j = i18;
            if (i18 == 8) {
                c();
                this.f46305j = 0;
            }
            i17++;
        }
    }
}