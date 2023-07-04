package p50;

import org.bouncycastle.crypto.v;

/* loaded from: classes5.dex */
public class a implements v {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f46210a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f46211b;

    /* renamed from: c  reason: collision with root package name */
    private int f46212c;

    /* renamed from: d  reason: collision with root package name */
    private org.bouncycastle.crypto.e f46213d;

    /* renamed from: e  reason: collision with root package name */
    private t50.a f46214e;

    /* renamed from: f  reason: collision with root package name */
    private int f46215f;

    public a(org.bouncycastle.crypto.e eVar) {
        this(eVar, (eVar.getBlockSize() * 8) / 2, null);
    }

    public a(org.bouncycastle.crypto.e eVar, int i11) {
        this(eVar, i11, null);
    }

    public a(org.bouncycastle.crypto.e eVar, int i11, t50.a aVar) {
        if (i11 % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.f46213d = new q50.c(eVar);
        this.f46214e = aVar;
        this.f46215f = i11 / 8;
        this.f46210a = new byte[eVar.getBlockSize()];
        this.f46211b = new byte[eVar.getBlockSize()];
        this.f46212c = 0;
    }

    @Override // org.bouncycastle.crypto.v
    public int doFinal(byte[] bArr, int i11) {
        int blockSize = this.f46213d.getBlockSize();
        if (this.f46214e == null) {
            while (true) {
                int i12 = this.f46212c;
                if (i12 >= blockSize) {
                    break;
                }
                this.f46211b[i12] = 0;
                this.f46212c = i12 + 1;
            }
        } else {
            if (this.f46212c == blockSize) {
                this.f46213d.processBlock(this.f46211b, 0, this.f46210a, 0);
                this.f46212c = 0;
            }
            this.f46214e.addPadding(this.f46211b, this.f46212c);
        }
        this.f46213d.processBlock(this.f46211b, 0, this.f46210a, 0);
        System.arraycopy(this.f46210a, 0, bArr, i11, this.f46215f);
        reset();
        return this.f46215f;
    }

    @Override // org.bouncycastle.crypto.v
    public String getAlgorithmName() {
        return this.f46213d.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.v
    public int getMacSize() {
        return this.f46215f;
    }

    @Override // org.bouncycastle.crypto.v
    public void init(org.bouncycastle.crypto.i iVar) {
        reset();
        this.f46213d.init(true, iVar);
    }

    @Override // org.bouncycastle.crypto.v
    public void reset() {
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f46211b;
            if (i11 >= bArr.length) {
                this.f46212c = 0;
                this.f46213d.reset();
                return;
            }
            bArr[i11] = 0;
            i11++;
        }
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte b11) {
        int i11 = this.f46212c;
        byte[] bArr = this.f46211b;
        if (i11 == bArr.length) {
            this.f46213d.processBlock(bArr, 0, this.f46210a, 0);
            this.f46212c = 0;
        }
        byte[] bArr2 = this.f46211b;
        int i12 = this.f46212c;
        this.f46212c = i12 + 1;
        bArr2[i12] = b11;
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte[] bArr, int i11, int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = this.f46213d.getBlockSize();
        int i13 = this.f46212c;
        int i14 = blockSize - i13;
        if (i12 > i14) {
            System.arraycopy(bArr, i11, this.f46211b, i13, i14);
            this.f46213d.processBlock(this.f46211b, 0, this.f46210a, 0);
            this.f46212c = 0;
            i12 -= i14;
            i11 += i14;
            while (i12 > blockSize) {
                this.f46213d.processBlock(bArr, i11, this.f46210a, 0);
                i12 -= blockSize;
                i11 += blockSize;
            }
        }
        System.arraycopy(bArr, i11, this.f46211b, this.f46212c, i12);
        this.f46212c += i12;
    }
}