package org.bouncycastle.crypto;

/* loaded from: classes5.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    protected byte[] f43135a;

    /* renamed from: b  reason: collision with root package name */
    protected int f43136b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f43137c;

    /* renamed from: d  reason: collision with root package name */
    protected e f43138d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f43139e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f43140f;

    /* JADX INFO: Access modifiers changed from: protected */
    public f() {
    }

    public f(e eVar) {
        this.f43138d = eVar;
        this.f43135a = new byte[eVar.getBlockSize()];
        boolean z11 = false;
        this.f43136b = 0;
        String algorithmName = eVar.getAlgorithmName();
        int indexOf = algorithmName.indexOf(47) + 1;
        boolean z12 = indexOf > 0 && algorithmName.startsWith("PGP", indexOf);
        this.f43140f = z12;
        if (z12 || (eVar instanceof b0)) {
            this.f43139e = true;
            return;
        }
        if (indexOf > 0 && algorithmName.startsWith("OpenPGP", indexOf)) {
            z11 = true;
        }
        this.f43139e = z11;
    }

    public int a(byte[] bArr, int i11) {
        try {
            int i12 = this.f43136b;
            if (i11 + i12 <= bArr.length) {
                int i13 = 0;
                if (i12 != 0) {
                    if (!this.f43139e) {
                        throw new DataLengthException("data not block size aligned");
                    }
                    e eVar = this.f43138d;
                    byte[] bArr2 = this.f43135a;
                    eVar.processBlock(bArr2, 0, bArr2, 0);
                    int i14 = this.f43136b;
                    this.f43136b = 0;
                    System.arraycopy(this.f43135a, 0, bArr, i11, i14);
                    i13 = i14;
                }
                return i13;
            }
            throw new OutputLengthException("output buffer too short for doFinal()");
        } finally {
            i();
        }
    }

    public int b() {
        return this.f43138d.getBlockSize();
    }

    public int c(int i11) {
        return i11 + this.f43136b;
    }

    public e d() {
        return this.f43138d;
    }

    public int e(int i11) {
        int length;
        int i12;
        int i13 = i11 + this.f43136b;
        if (!this.f43140f) {
            length = this.f43135a.length;
        } else if (this.f43137c) {
            i12 = (i13 % this.f43135a.length) - (this.f43138d.getBlockSize() + 2);
            return i13 - i12;
        } else {
            length = this.f43135a.length;
        }
        i12 = i13 % length;
        return i13 - i12;
    }

    public void f(boolean z11, i iVar) {
        this.f43137c = z11;
        i();
        this.f43138d.init(z11, iVar);
    }

    public int g(byte b11, byte[] bArr, int i11) {
        byte[] bArr2 = this.f43135a;
        int i12 = this.f43136b;
        int i13 = i12 + 1;
        this.f43136b = i13;
        bArr2[i12] = b11;
        if (i13 == bArr2.length) {
            int processBlock = this.f43138d.processBlock(bArr2, 0, bArr, i11);
            this.f43136b = 0;
            return processBlock;
        }
        return 0;
    }

    public int h(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int i14;
        if (i12 >= 0) {
            int b11 = b();
            int e11 = e(i12);
            if (e11 <= 0 || e11 + i13 <= bArr2.length) {
                byte[] bArr3 = this.f43135a;
                int length = bArr3.length;
                int i15 = this.f43136b;
                int i16 = length - i15;
                if (i12 > i16) {
                    System.arraycopy(bArr, i11, bArr3, i15, i16);
                    i14 = this.f43138d.processBlock(this.f43135a, 0, bArr2, i13) + 0;
                    this.f43136b = 0;
                    i12 -= i16;
                    i11 += i16;
                    while (i12 > this.f43135a.length) {
                        i14 += this.f43138d.processBlock(bArr, i11, bArr2, i13 + i14);
                        i12 -= b11;
                        i11 += b11;
                    }
                } else {
                    i14 = 0;
                }
                System.arraycopy(bArr, i11, this.f43135a, this.f43136b, i12);
                int i17 = this.f43136b + i12;
                this.f43136b = i17;
                byte[] bArr4 = this.f43135a;
                if (i17 == bArr4.length) {
                    int processBlock = i14 + this.f43138d.processBlock(bArr4, 0, bArr2, i13 + i14);
                    this.f43136b = 0;
                    return processBlock;
                }
                return i14;
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }

    public void i() {
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f43135a;
            if (i11 >= bArr.length) {
                this.f43136b = 0;
                this.f43138d.reset();
                return;
            }
            bArr[i11] = 0;
            i11++;
        }
    }
}