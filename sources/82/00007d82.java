package k50;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.k;
import r70.j;
import u50.g1;

/* loaded from: classes5.dex */
public class c implements org.bouncycastle.crypto.a {

    /* renamed from: a  reason: collision with root package name */
    private SecureRandom f34462a;

    /* renamed from: b  reason: collision with root package name */
    private org.bouncycastle.crypto.a f34463b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f34464c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f34465d;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f34469h;

    /* renamed from: f  reason: collision with root package name */
    private int f34467f = -1;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f34468g = null;

    /* renamed from: e  reason: collision with root package name */
    private boolean f34466e = f();

    public c(org.bouncycastle.crypto.a aVar) {
        this.f34463b = aVar;
    }

    private static int a(byte[] bArr, int i11) {
        int i12 = 0 | (bArr[0] ^ 2);
        int i13 = i11 + 1;
        int length = bArr.length - i13;
        for (int i14 = 1; i14 < length; i14++) {
            byte b11 = bArr[i14];
            int i15 = b11 | (b11 >> 1);
            int i16 = i15 | (i15 >> 2);
            i12 |= ((i16 | (i16 >> 4)) & 1) - 1;
        }
        int i17 = bArr[bArr.length - i13] | i12;
        int i18 = i17 | (i17 >> 1);
        int i19 = i18 | (i18 >> 2);
        return ~(((i19 | (i19 >> 4)) & 1) - 1);
    }

    private byte[] b(byte[] bArr, int i11, int i12) {
        if (this.f34467f != -1) {
            return c(bArr, i11, i12);
        }
        byte[] processBlock = this.f34463b.processBlock(bArr, i11, i12);
        boolean z11 = this.f34466e & (processBlock.length != this.f34463b.getOutputBlockSize());
        if (processBlock.length < getOutputBlockSize()) {
            processBlock = this.f34469h;
        }
        byte b11 = processBlock[0];
        boolean z12 = !this.f34465d ? b11 == 1 : b11 == 2;
        int e11 = e(b11, processBlock) + 1;
        if (z12 || (e11 < 10)) {
            org.bouncycastle.util.a.y(processBlock, (byte) 0);
            throw new InvalidCipherTextException("block incorrect");
        } else if (z11) {
            org.bouncycastle.util.a.y(processBlock, (byte) 0);
            throw new InvalidCipherTextException("block incorrect size");
        } else {
            int length = processBlock.length - e11;
            byte[] bArr2 = new byte[length];
            System.arraycopy(processBlock, e11, bArr2, 0, length);
            return bArr2;
        }
    }

    private byte[] c(byte[] bArr, int i11, int i12) {
        if (!this.f34465d) {
            throw new InvalidCipherTextException("sorry, this method is only for decryption, not for signing");
        }
        byte[] processBlock = this.f34463b.processBlock(bArr, i11, i12);
        byte[] bArr2 = this.f34468g;
        if (bArr2 == null) {
            bArr2 = new byte[this.f34467f];
            this.f34462a.nextBytes(bArr2);
        }
        if (this.f34466e & (processBlock.length != this.f34463b.getOutputBlockSize())) {
            processBlock = this.f34469h;
        }
        int a11 = a(processBlock, this.f34467f);
        byte[] bArr3 = new byte[this.f34467f];
        int i13 = 0;
        while (true) {
            int i14 = this.f34467f;
            if (i13 >= i14) {
                org.bouncycastle.util.a.y(processBlock, (byte) 0);
                return bArr3;
            }
            bArr3[i13] = (byte) ((processBlock[(processBlock.length - i14) + i13] & (~a11)) | (bArr2[i13] & a11));
            i13++;
        }
    }

    private byte[] d(byte[] bArr, int i11, int i12) {
        if (i12 <= getInputBlockSize()) {
            int inputBlockSize = this.f34463b.getInputBlockSize();
            byte[] bArr2 = new byte[inputBlockSize];
            if (this.f34465d) {
                bArr2[0] = 1;
                for (int i13 = 1; i13 != (inputBlockSize - i12) - 1; i13++) {
                    bArr2[i13] = -1;
                }
            } else {
                this.f34462a.nextBytes(bArr2);
                bArr2[0] = 2;
                for (int i14 = 1; i14 != (inputBlockSize - i12) - 1; i14++) {
                    while (bArr2[i14] == 0) {
                        bArr2[i14] = (byte) this.f34462a.nextInt();
                    }
                }
            }
            int i15 = inputBlockSize - i12;
            bArr2[i15 - 1] = 0;
            System.arraycopy(bArr, i11, bArr2, i15, i12);
            return this.f34463b.processBlock(bArr2, 0, inputBlockSize);
        }
        throw new IllegalArgumentException("input data too large");
    }

    private int e(byte b11, byte[] bArr) {
        int i11 = -1;
        boolean z11 = false;
        for (int i12 = 1; i12 != bArr.length; i12++) {
            byte b12 = bArr[i12];
            if ((b12 == 0) & (i11 < 0)) {
                i11 = i12;
            }
            z11 |= (b12 != -1) & (b11 == 1) & (i11 < 0);
        }
        if (z11) {
            return -1;
        }
        return i11;
    }

    private boolean f() {
        if (j.d("org.bouncycastle.pkcs1.not_strict", true)) {
            return false;
        }
        return !j.d("org.bouncycastle.pkcs1.strict", false);
    }

    @Override // org.bouncycastle.crypto.a
    public int getInputBlockSize() {
        int inputBlockSize = this.f34463b.getInputBlockSize();
        return this.f34464c ? inputBlockSize - 10 : inputBlockSize;
    }

    @Override // org.bouncycastle.crypto.a
    public int getOutputBlockSize() {
        int outputBlockSize = this.f34463b.getOutputBlockSize();
        return this.f34464c ? outputBlockSize : outputBlockSize - 10;
    }

    @Override // org.bouncycastle.crypto.a
    public void init(boolean z11, i iVar) {
        u50.b bVar;
        if (iVar instanceof g1) {
            g1 g1Var = (g1) iVar;
            this.f34462a = g1Var.b();
            bVar = (u50.b) g1Var.a();
        } else {
            bVar = (u50.b) iVar;
            if (!bVar.a() && z11) {
                this.f34462a = k.b();
            }
        }
        this.f34463b.init(z11, iVar);
        this.f34465d = bVar.a();
        this.f34464c = z11;
        this.f34469h = new byte[this.f34463b.getOutputBlockSize()];
        if (this.f34467f > 0 && this.f34468g == null && this.f34462a == null) {
            throw new IllegalArgumentException("encoder requires random");
        }
    }

    @Override // org.bouncycastle.crypto.a
    public byte[] processBlock(byte[] bArr, int i11, int i12) {
        return this.f34464c ? d(bArr, i11, i12) : b(bArr, i11, i12);
    }
}