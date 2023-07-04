package q50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.a0;

/* loaded from: classes5.dex */
public class f extends org.bouncycastle.crypto.f {

    /* renamed from: g  reason: collision with root package name */
    private int f47588g;

    public f(org.bouncycastle.crypto.e eVar) {
        if (eVar instanceof a0) {
            throw new IllegalArgumentException("CTSBlockCipher can only accept ECB, or CBC ciphers");
        }
        this.f43138d = eVar;
        int blockSize = eVar.getBlockSize();
        this.f47588g = blockSize;
        this.f43135a = new byte[blockSize * 2];
        this.f43136b = 0;
    }

    @Override // org.bouncycastle.crypto.f
    public int a(byte[] bArr, int i11) {
        if (this.f43136b + i11 <= bArr.length) {
            int blockSize = this.f43138d.getBlockSize();
            int i12 = this.f43136b;
            int i13 = i12 - blockSize;
            byte[] bArr2 = new byte[blockSize];
            if (this.f43137c) {
                if (i12 < blockSize) {
                    throw new DataLengthException("need at least one block of input for CTS");
                }
                this.f43138d.processBlock(this.f43135a, 0, bArr2, 0);
                int i14 = this.f43136b;
                if (i14 > blockSize) {
                    while (true) {
                        byte[] bArr3 = this.f43135a;
                        if (i14 == bArr3.length) {
                            break;
                        }
                        bArr3[i14] = bArr2[i14 - blockSize];
                        i14++;
                    }
                    for (int i15 = blockSize; i15 != this.f43136b; i15++) {
                        byte[] bArr4 = this.f43135a;
                        bArr4[i15] = (byte) (bArr4[i15] ^ bArr2[i15 - blockSize]);
                    }
                    org.bouncycastle.crypto.e eVar = this.f43138d;
                    if (eVar instanceof c) {
                        ((c) eVar).c().processBlock(this.f43135a, blockSize, bArr, i11);
                    } else {
                        eVar.processBlock(this.f43135a, blockSize, bArr, i11);
                    }
                    System.arraycopy(bArr2, 0, bArr, i11 + blockSize, i13);
                }
                System.arraycopy(bArr2, 0, bArr, i11, blockSize);
            } else if (i12 < blockSize) {
                throw new DataLengthException("need at least one block of input for CTS");
            } else {
                byte[] bArr5 = new byte[blockSize];
                if (i12 > blockSize) {
                    org.bouncycastle.crypto.e eVar2 = this.f43138d;
                    if (eVar2 instanceof c) {
                        ((c) eVar2).c().processBlock(this.f43135a, 0, bArr2, 0);
                    } else {
                        eVar2.processBlock(this.f43135a, 0, bArr2, 0);
                    }
                    for (int i16 = blockSize; i16 != this.f43136b; i16++) {
                        int i17 = i16 - blockSize;
                        bArr5[i17] = (byte) (bArr2[i17] ^ this.f43135a[i16]);
                    }
                    System.arraycopy(this.f43135a, blockSize, bArr2, 0, i13);
                    this.f43138d.processBlock(bArr2, 0, bArr, i11);
                    System.arraycopy(bArr5, 0, bArr, i11 + blockSize, i13);
                } else {
                    this.f43138d.processBlock(this.f43135a, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i11, blockSize);
                }
            }
            int i18 = this.f43136b;
            i();
            return i18;
        }
        throw new OutputLengthException("output buffer to small in doFinal");
    }

    @Override // org.bouncycastle.crypto.f
    public int c(int i11) {
        return i11 + this.f43136b;
    }

    @Override // org.bouncycastle.crypto.f
    public int e(int i11) {
        int i12 = i11 + this.f43136b;
        byte[] bArr = this.f43135a;
        int length = i12 % bArr.length;
        return length == 0 ? i12 - bArr.length : i12 - length;
    }

    @Override // org.bouncycastle.crypto.f
    public int g(byte b11, byte[] bArr, int i11) {
        int i12 = this.f43136b;
        byte[] bArr2 = this.f43135a;
        int i13 = 0;
        if (i12 == bArr2.length) {
            int processBlock = this.f43138d.processBlock(bArr2, 0, bArr, i11);
            byte[] bArr3 = this.f43135a;
            int i14 = this.f47588g;
            System.arraycopy(bArr3, i14, bArr3, 0, i14);
            this.f43136b = this.f47588g;
            i13 = processBlock;
        }
        byte[] bArr4 = this.f43135a;
        int i15 = this.f43136b;
        this.f43136b = i15 + 1;
        bArr4[i15] = b11;
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
                    int processBlock = this.f43138d.processBlock(this.f43135a, 0, bArr2, i13) + 0;
                    byte[] bArr4 = this.f43135a;
                    System.arraycopy(bArr4, b11, bArr4, 0, b11);
                    this.f43136b = b11;
                    i12 -= i15;
                    i11 += i15;
                    while (i12 > b11) {
                        System.arraycopy(bArr, i11, this.f43135a, this.f43136b, b11);
                        processBlock += this.f43138d.processBlock(this.f43135a, 0, bArr2, i13 + processBlock);
                        byte[] bArr5 = this.f43135a;
                        System.arraycopy(bArr5, b11, bArr5, 0, b11);
                        i12 -= b11;
                        i11 += b11;
                    }
                    i16 = processBlock;
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