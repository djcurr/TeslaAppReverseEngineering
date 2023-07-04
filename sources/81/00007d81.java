package k50;

import java.security.SecureRandom;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.k;
import org.bouncycastle.crypto.p;
import u50.g1;

/* loaded from: classes5.dex */
public class b implements org.bouncycastle.crypto.a {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f34457a;

    /* renamed from: b  reason: collision with root package name */
    private p f34458b;

    /* renamed from: c  reason: collision with root package name */
    private org.bouncycastle.crypto.a f34459c;

    /* renamed from: d  reason: collision with root package name */
    private SecureRandom f34460d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f34461e;

    public b(org.bouncycastle.crypto.a aVar, p pVar, p pVar2, byte[] bArr) {
        this.f34459c = aVar;
        this.f34458b = pVar2;
        this.f34457a = new byte[pVar.getDigestSize()];
        pVar.reset();
        if (bArr != null) {
            pVar.update(bArr, 0, bArr.length);
        }
        pVar.doFinal(this.f34457a, 0);
    }

    public b(org.bouncycastle.crypto.a aVar, p pVar, byte[] bArr) {
        this(aVar, pVar, pVar, bArr);
    }

    private void a(int i11, byte[] bArr) {
        bArr[0] = (byte) (i11 >>> 24);
        bArr[1] = (byte) (i11 >>> 16);
        bArr[2] = (byte) (i11 >>> 8);
        bArr[3] = (byte) (i11 >>> 0);
    }

    private byte[] d(byte[] bArr, int i11, int i12, int i13) {
        byte[] bArr2 = new byte[i13];
        int digestSize = this.f34458b.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        byte[] bArr4 = new byte[4];
        this.f34458b.reset();
        int i14 = 0;
        while (i14 < i13 / digestSize) {
            a(i14, bArr4);
            this.f34458b.update(bArr, i11, i12);
            this.f34458b.update(bArr4, 0, 4);
            this.f34458b.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i14 * digestSize, digestSize);
            i14++;
        }
        int i15 = digestSize * i14;
        if (i15 < i13) {
            a(i14, bArr4);
            this.f34458b.update(bArr, i11, i12);
            this.f34458b.update(bArr4, 0, 4);
            this.f34458b.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i15, i13 - i15);
        }
        return bArr2;
    }

    public byte[] b(byte[] bArr, int i11, int i12) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] processBlock = this.f34459c.processBlock(bArr, i11, i12);
        int outputBlockSize = this.f34459c.getOutputBlockSize();
        byte[] bArr4 = new byte[outputBlockSize];
        boolean z11 = outputBlockSize < (this.f34457a.length * 2) + 1;
        if (processBlock.length <= outputBlockSize) {
            System.arraycopy(processBlock, 0, bArr4, outputBlockSize - processBlock.length, processBlock.length);
        } else {
            System.arraycopy(processBlock, 0, bArr4, 0, outputBlockSize);
            z11 = true;
        }
        byte[] bArr5 = this.f34457a;
        byte[] d11 = d(bArr4, bArr5.length, outputBlockSize - bArr5.length, bArr5.length);
        int i13 = 0;
        while (true) {
            bArr2 = this.f34457a;
            if (i13 == bArr2.length) {
                break;
            }
            bArr4[i13] = (byte) (bArr4[i13] ^ d11[i13]);
            i13++;
        }
        byte[] d12 = d(bArr4, 0, bArr2.length, outputBlockSize - bArr2.length);
        for (int length = this.f34457a.length; length != outputBlockSize; length++) {
            bArr4[length] = (byte) (bArr4[length] ^ d12[length - this.f34457a.length]);
        }
        int i14 = 0;
        boolean z12 = false;
        while (true) {
            bArr3 = this.f34457a;
            if (i14 == bArr3.length) {
                break;
            }
            if (bArr3[i14] != bArr4[bArr3.length + i14]) {
                z12 = true;
            }
            i14++;
        }
        int i15 = outputBlockSize;
        for (int length2 = bArr3.length * 2; length2 != outputBlockSize; length2++) {
            if ((bArr4[length2] != 0) & (i15 == outputBlockSize)) {
                i15 = length2;
            }
        }
        boolean z13 = i15 > outputBlockSize + (-1);
        boolean z14 = bArr4[i15] != 1;
        int i16 = i15 + 1;
        if ((z13 | z14) || (z11 | z12)) {
            org.bouncycastle.util.a.y(bArr4, (byte) 0);
            throw new InvalidCipherTextException("data wrong");
        }
        int i17 = outputBlockSize - i16;
        byte[] bArr6 = new byte[i17];
        System.arraycopy(bArr4, i16, bArr6, 0, i17);
        org.bouncycastle.util.a.y(bArr4, (byte) 0);
        return bArr6;
    }

    public byte[] c(byte[] bArr, int i11, int i12) {
        if (i12 <= getInputBlockSize()) {
            int inputBlockSize = getInputBlockSize() + 1 + (this.f34457a.length * 2);
            byte[] bArr2 = new byte[inputBlockSize];
            int i13 = inputBlockSize - i12;
            System.arraycopy(bArr, i11, bArr2, i13, i12);
            bArr2[i13 - 1] = 1;
            byte[] bArr3 = this.f34457a;
            System.arraycopy(bArr3, 0, bArr2, bArr3.length, bArr3.length);
            int length = this.f34457a.length;
            byte[] bArr4 = new byte[length];
            this.f34460d.nextBytes(bArr4);
            byte[] d11 = d(bArr4, 0, length, inputBlockSize - this.f34457a.length);
            for (int length2 = this.f34457a.length; length2 != inputBlockSize; length2++) {
                bArr2[length2] = (byte) (bArr2[length2] ^ d11[length2 - this.f34457a.length]);
            }
            System.arraycopy(bArr4, 0, bArr2, 0, this.f34457a.length);
            byte[] bArr5 = this.f34457a;
            byte[] d12 = d(bArr2, bArr5.length, inputBlockSize - bArr5.length, bArr5.length);
            for (int i14 = 0; i14 != this.f34457a.length; i14++) {
                bArr2[i14] = (byte) (bArr2[i14] ^ d12[i14]);
            }
            return this.f34459c.processBlock(bArr2, 0, inputBlockSize);
        }
        throw new DataLengthException("input data too long");
    }

    @Override // org.bouncycastle.crypto.a
    public int getInputBlockSize() {
        int inputBlockSize = this.f34459c.getInputBlockSize();
        return this.f34461e ? (inputBlockSize - 1) - (this.f34457a.length * 2) : inputBlockSize;
    }

    @Override // org.bouncycastle.crypto.a
    public int getOutputBlockSize() {
        int outputBlockSize = this.f34459c.getOutputBlockSize();
        return this.f34461e ? outputBlockSize : (outputBlockSize - 1) - (this.f34457a.length * 2);
    }

    @Override // org.bouncycastle.crypto.a
    public void init(boolean z11, i iVar) {
        this.f34460d = iVar instanceof g1 ? ((g1) iVar).b() : k.b();
        this.f34459c.init(z11, iVar);
        this.f34461e = z11;
    }

    @Override // org.bouncycastle.crypto.a
    public byte[] processBlock(byte[] bArr, int i11, int i12) {
        return this.f34461e ? c(bArr, i11, i12) : b(bArr, i11, i12);
    }
}