package l50;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: classes5.dex */
public class q implements org.bouncycastle.crypto.c0 {

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f36855h = {74, -35, -94, 44, 121, -24, 33, 5};

    /* renamed from: a  reason: collision with root package name */
    private q50.c f36856a;

    /* renamed from: b  reason: collision with root package name */
    private u50.b1 f36857b;

    /* renamed from: c  reason: collision with root package name */
    private u50.f1 f36858c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f36859d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f36860e;

    /* renamed from: f  reason: collision with root package name */
    org.bouncycastle.crypto.p f36861f = z50.a.b();

    /* renamed from: g  reason: collision with root package name */
    byte[] f36862g = new byte[20];

    private byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.f36861f.update(bArr, 0, bArr.length);
        this.f36861f.doFinal(this.f36862g, 0);
        System.arraycopy(this.f36862g, 0, bArr2, 0, 8);
        return bArr2;
    }

    private boolean b(byte[] bArr, byte[] bArr2) {
        return org.bouncycastle.util.a.u(a(bArr), bArr2);
    }

    private static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i11 = 0;
        while (i11 < bArr.length) {
            int i12 = i11 + 1;
            bArr2[i11] = bArr[bArr.length - i12];
            i11 = i12;
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.c0
    public String getAlgorithmName() {
        return "DESede";
    }

    @Override // org.bouncycastle.crypto.c0
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        SecureRandom b11;
        this.f36860e = z11;
        this.f36856a = new q50.c(new p());
        if (iVar instanceof u50.g1) {
            u50.g1 g1Var = (u50.g1) iVar;
            org.bouncycastle.crypto.i a11 = g1Var.a();
            SecureRandom b12 = g1Var.b();
            iVar = a11;
            b11 = b12;
        } else {
            b11 = org.bouncycastle.crypto.k.b();
        }
        if (iVar instanceof u50.b1) {
            this.f36857b = (u50.b1) iVar;
            if (this.f36860e) {
                byte[] bArr = new byte[8];
                this.f36859d = bArr;
                b11.nextBytes(bArr);
                this.f36858c = new u50.f1(this.f36857b, this.f36859d);
            }
        } else if (iVar instanceof u50.f1) {
            u50.f1 f1Var = (u50.f1) iVar;
            this.f36858c = f1Var;
            this.f36859d = f1Var.a();
            this.f36857b = (u50.b1) this.f36858c.b();
            if (!this.f36860e) {
                throw new IllegalArgumentException("You should not supply an IV for unwrapping");
            }
            byte[] bArr2 = this.f36859d;
            if (bArr2 == null || bArr2.length != 8) {
                throw new IllegalArgumentException("IV is not 8 octets");
            }
        }
    }

    @Override // org.bouncycastle.crypto.c0
    public byte[] unwrap(byte[] bArr, int i11, int i12) {
        if (this.f36860e) {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (bArr != null) {
            int blockSize = this.f36856a.getBlockSize();
            if (i12 % blockSize != 0) {
                throw new InvalidCipherTextException("Ciphertext not multiple of " + blockSize);
            }
            this.f36856a.init(false, new u50.f1(this.f36857b, f36855h));
            byte[] bArr2 = new byte[i12];
            for (int i13 = 0; i13 != i12; i13 += blockSize) {
                this.f36856a.processBlock(bArr, i11 + i13, bArr2, i13);
            }
            byte[] c11 = c(bArr2);
            byte[] bArr3 = new byte[8];
            this.f36859d = bArr3;
            int length = c11.length - 8;
            byte[] bArr4 = new byte[length];
            System.arraycopy(c11, 0, bArr3, 0, 8);
            System.arraycopy(c11, 8, bArr4, 0, c11.length - 8);
            u50.f1 f1Var = new u50.f1(this.f36857b, this.f36859d);
            this.f36858c = f1Var;
            this.f36856a.init(false, f1Var);
            byte[] bArr5 = new byte[length];
            for (int i14 = 0; i14 != length; i14 += blockSize) {
                this.f36856a.processBlock(bArr4, i14, bArr5, i14);
            }
            int i15 = length - 8;
            byte[] bArr6 = new byte[i15];
            byte[] bArr7 = new byte[8];
            System.arraycopy(bArr5, 0, bArr6, 0, i15);
            System.arraycopy(bArr5, i15, bArr7, 0, 8);
            if (b(bArr6, bArr7)) {
                return bArr6;
            }
            throw new InvalidCipherTextException("Checksum inside ciphertext is corrupted");
        }
        throw new InvalidCipherTextException("Null pointer as ciphertext");
    }

    @Override // org.bouncycastle.crypto.c0
    public byte[] wrap(byte[] bArr, int i11, int i12) {
        if (this.f36860e) {
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, i11, bArr2, 0, i12);
            byte[] a11 = a(bArr2);
            int length = a11.length + i12;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr2, 0, bArr3, 0, i12);
            System.arraycopy(a11, 0, bArr3, i12, a11.length);
            int blockSize = this.f36856a.getBlockSize();
            if (length % blockSize == 0) {
                this.f36856a.init(true, this.f36858c);
                byte[] bArr4 = new byte[length];
                for (int i13 = 0; i13 != length; i13 += blockSize) {
                    this.f36856a.processBlock(bArr3, i13, bArr4, i13);
                }
                byte[] bArr5 = this.f36859d;
                byte[] bArr6 = new byte[bArr5.length + length];
                System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                System.arraycopy(bArr4, 0, bArr6, this.f36859d.length, length);
                byte[] c11 = c(bArr6);
                this.f36856a.init(true, new u50.f1(this.f36857b, f36855h));
                for (int i14 = 0; i14 != c11.length; i14 += blockSize) {
                    this.f36856a.processBlock(c11, i14, c11, i14);
                }
                return c11;
            }
            throw new IllegalStateException("Not multiple of block length");
        }
        throw new IllegalStateException("Not initialized for wrapping");
    }
}