package x60;

import org.bouncycastle.crypto.p;

/* loaded from: classes5.dex */
class n {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f57191a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f57192b;

    /* renamed from: c  reason: collision with root package name */
    private final p f57193c;

    /* renamed from: d  reason: collision with root package name */
    private int f57194d;

    /* renamed from: e  reason: collision with root package name */
    private int f57195e;

    public n(byte[] bArr, byte[] bArr2, p pVar) {
        this.f57191a = bArr;
        this.f57192b = bArr2;
        this.f57193c = pVar;
    }

    public void a(byte[] bArr, boolean z11, int i11) {
        b(bArr, i11);
        if (z11) {
            this.f57195e++;
        }
    }

    public byte[] b(byte[] bArr, int i11) {
        if (bArr.length >= this.f57193c.getDigestSize()) {
            p pVar = this.f57193c;
            byte[] bArr2 = this.f57191a;
            pVar.update(bArr2, 0, bArr2.length);
            this.f57193c.update((byte) (this.f57194d >>> 24));
            this.f57193c.update((byte) (this.f57194d >>> 16));
            this.f57193c.update((byte) (this.f57194d >>> 8));
            this.f57193c.update((byte) this.f57194d);
            this.f57193c.update((byte) (this.f57195e >>> 8));
            this.f57193c.update((byte) this.f57195e);
            this.f57193c.update((byte) -1);
            p pVar2 = this.f57193c;
            byte[] bArr3 = this.f57192b;
            pVar2.update(bArr3, 0, bArr3.length);
            this.f57193c.doFinal(bArr, i11);
            return bArr;
        }
        throw new IllegalArgumentException("target length is less than digest size.");
    }

    public void c(int i11) {
        this.f57195e = i11;
    }

    public void d(int i11) {
        this.f57194d = i11;
    }
}