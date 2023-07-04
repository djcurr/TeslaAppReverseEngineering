package i50;

/* loaded from: classes5.dex */
public abstract class h implements org.bouncycastle.crypto.r, r70.h {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f30035a;

    /* renamed from: b  reason: collision with root package name */
    private int f30036b;

    /* renamed from: c  reason: collision with root package name */
    private long f30037c;

    /* JADX INFO: Access modifiers changed from: protected */
    public h() {
        this.f30035a = new byte[4];
        this.f30036b = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public h(h hVar) {
        this.f30035a = new byte[4];
        b(hVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(h hVar) {
        byte[] bArr = hVar.f30035a;
        System.arraycopy(bArr, 0, this.f30035a, 0, bArr.length);
        this.f30036b = hVar.f30036b;
        this.f30037c = hVar.f30037c;
    }

    public void c() {
        long j11 = this.f30037c << 3;
        byte b11 = Byte.MIN_VALUE;
        while (true) {
            update(b11);
            if (this.f30036b == 0) {
                e(j11);
                d();
                return;
            }
            b11 = 0;
        }
    }

    protected abstract void d();

    protected abstract void e(long j11);

    protected abstract void f(byte[] bArr, int i11);

    @Override // org.bouncycastle.crypto.r
    public int getByteLength() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.p
    public void reset() {
        this.f30037c = 0L;
        this.f30036b = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f30035a;
            if (i11 >= bArr.length) {
                return;
            }
            bArr[i11] = 0;
            i11++;
        }
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte b11) {
        byte[] bArr = this.f30035a;
        int i11 = this.f30036b;
        int i12 = i11 + 1;
        this.f30036b = i12;
        bArr[i11] = b11;
        if (i12 == bArr.length) {
            f(bArr, 0);
            this.f30036b = 0;
        }
        this.f30037c++;
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte[] bArr, int i11, int i12) {
        int i13 = 0;
        int max = Math.max(0, i12);
        if (this.f30036b != 0) {
            int i14 = 0;
            while (true) {
                if (i14 >= max) {
                    i13 = i14;
                    break;
                }
                byte[] bArr2 = this.f30035a;
                int i15 = this.f30036b;
                int i16 = i15 + 1;
                this.f30036b = i16;
                int i17 = i14 + 1;
                bArr2[i15] = bArr[i14 + i11];
                if (i16 == 4) {
                    f(bArr2, 0);
                    this.f30036b = 0;
                    i13 = i17;
                    break;
                }
                i14 = i17;
            }
        }
        int i18 = ((max - i13) & (-4)) + i13;
        while (i13 < i18) {
            f(bArr, i11 + i13);
            i13 += 4;
        }
        while (i13 < max) {
            byte[] bArr3 = this.f30035a;
            int i19 = this.f30036b;
            this.f30036b = i19 + 1;
            bArr3[i19] = bArr[i13 + i11];
            i13++;
        }
        this.f30037c += max;
    }
}