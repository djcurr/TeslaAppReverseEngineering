package t50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.i;
import u50.g1;

/* loaded from: classes5.dex */
public class e extends org.bouncycastle.crypto.f {

    /* renamed from: g  reason: collision with root package name */
    a f51666g;

    public e(org.bouncycastle.crypto.e eVar) {
        this(eVar, new d());
    }

    public e(org.bouncycastle.crypto.e eVar, a aVar) {
        this.f43138d = eVar;
        this.f51666g = aVar;
        this.f43135a = new byte[eVar.getBlockSize()];
        this.f43136b = 0;
    }

    @Override // org.bouncycastle.crypto.f
    public int a(byte[] bArr, int i11) {
        int padCount;
        int i12;
        int blockSize = this.f43138d.getBlockSize();
        if (this.f43137c) {
            if (this.f43136b != blockSize) {
                i12 = 0;
            } else if ((blockSize * 2) + i11 > bArr.length) {
                i();
                throw new OutputLengthException("output buffer too short");
            } else {
                i12 = this.f43138d.processBlock(this.f43135a, 0, bArr, i11);
                this.f43136b = 0;
            }
            this.f51666g.addPadding(this.f43135a, this.f43136b);
            padCount = i12 + this.f43138d.processBlock(this.f43135a, 0, bArr, i11 + i12);
        } else if (this.f43136b != blockSize) {
            i();
            throw new DataLengthException("last block incomplete in decryption");
        } else {
            org.bouncycastle.crypto.e eVar = this.f43138d;
            byte[] bArr2 = this.f43135a;
            int processBlock = eVar.processBlock(bArr2, 0, bArr2, 0);
            this.f43136b = 0;
            try {
                padCount = processBlock - this.f51666g.padCount(this.f43135a);
                System.arraycopy(this.f43135a, 0, bArr, i11, padCount);
            } finally {
                i();
            }
        }
        return padCount;
    }

    @Override // org.bouncycastle.crypto.f
    public int c(int i11) {
        int i12 = i11 + this.f43136b;
        byte[] bArr = this.f43135a;
        int length = i12 % bArr.length;
        if (length != 0) {
            i12 -= length;
        } else if (!this.f43137c) {
            return i12;
        }
        return i12 + bArr.length;
    }

    @Override // org.bouncycastle.crypto.f
    public int e(int i11) {
        int i12 = i11 + this.f43136b;
        byte[] bArr = this.f43135a;
        int length = i12 % bArr.length;
        return length == 0 ? Math.max(0, i12 - bArr.length) : i12 - length;
    }

    @Override // org.bouncycastle.crypto.f
    public void f(boolean z11, i iVar) {
        org.bouncycastle.crypto.e eVar;
        this.f43137c = z11;
        i();
        if (iVar instanceof g1) {
            g1 g1Var = (g1) iVar;
            this.f51666g.init(g1Var.b());
            eVar = this.f43138d;
            iVar = g1Var.a();
        } else {
            this.f51666g.init(null);
            eVar = this.f43138d;
        }
        eVar.init(z11, iVar);
    }

    @Override // org.bouncycastle.crypto.f
    public int g(byte b11, byte[] bArr, int i11) {
        int i12 = this.f43136b;
        byte[] bArr2 = this.f43135a;
        int i13 = 0;
        if (i12 == bArr2.length) {
            int processBlock = this.f43138d.processBlock(bArr2, 0, bArr, i11);
            this.f43136b = 0;
            i13 = processBlock;
        }
        byte[] bArr3 = this.f43135a;
        int i14 = this.f43136b;
        this.f43136b = i14 + 1;
        bArr3[i14] = b11;
        return i13;
    }

    @Override // org.bouncycastle.crypto.f
    public int h(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (i12 >= 0) {
            int b11 = b();
            int e11 = e(i12);
            if (e11 <= 0 || e11 + i13 <= bArr2.length) {
                byte[] bArr3 = this.f43135a;
                int length = bArr3.length;
                int i14 = this.f43136b;
                int i15 = length - i14;
                int i16 = 0;
                if (i12 > i15) {
                    System.arraycopy(bArr, i11, bArr3, i14, i15);
                    this.f43136b = 0;
                    i12 -= i15;
                    i11 += i15;
                    i16 = this.f43138d.processBlock(this.f43135a, 0, bArr2, i13) + 0;
                    while (i12 > this.f43135a.length) {
                        i16 += this.f43138d.processBlock(bArr, i11, bArr2, i13 + i16);
                        i12 -= b11;
                        i11 += b11;
                    }
                }
                System.arraycopy(bArr, i11, this.f43135a, this.f43136b, i12);
                this.f43136b += i12;
                return i16;
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}