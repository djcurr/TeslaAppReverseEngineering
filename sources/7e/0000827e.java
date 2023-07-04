package l50;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: classes5.dex */
public class f0 implements org.bouncycastle.crypto.c0 {

    /* renamed from: i  reason: collision with root package name */
    private static final byte[] f36715i = {74, -35, -94, 44, 121, -24, 33, 5};

    /* renamed from: a  reason: collision with root package name */
    private q50.c f36716a;

    /* renamed from: b  reason: collision with root package name */
    private org.bouncycastle.crypto.i f36717b;

    /* renamed from: c  reason: collision with root package name */
    private u50.f1 f36718c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f36719d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f36720e;

    /* renamed from: f  reason: collision with root package name */
    private SecureRandom f36721f;

    /* renamed from: g  reason: collision with root package name */
    org.bouncycastle.crypto.p f36722g = z50.a.b();

    /* renamed from: h  reason: collision with root package name */
    byte[] f36723h = new byte[20];

    private byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.f36722g.update(bArr, 0, bArr.length);
        this.f36722g.doFinal(this.f36723h, 0);
        System.arraycopy(this.f36723h, 0, bArr2, 0, 8);
        return bArr2;
    }

    private boolean b(byte[] bArr, byte[] bArr2) {
        return org.bouncycastle.util.a.u(a(bArr), bArr2);
    }

    @Override // org.bouncycastle.crypto.c0
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // org.bouncycastle.crypto.c0
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        this.f36720e = z11;
        this.f36716a = new q50.c(new e0());
        if (iVar instanceof u50.g1) {
            u50.g1 g1Var = (u50.g1) iVar;
            this.f36721f = g1Var.b();
            iVar = g1Var.a();
        } else {
            this.f36721f = org.bouncycastle.crypto.k.b();
        }
        if (!(iVar instanceof u50.f1)) {
            this.f36717b = iVar;
            if (this.f36720e) {
                byte[] bArr = new byte[8];
                this.f36719d = bArr;
                this.f36721f.nextBytes(bArr);
                this.f36718c = new u50.f1(this.f36717b, this.f36719d);
                return;
            }
            return;
        }
        u50.f1 f1Var = (u50.f1) iVar;
        this.f36718c = f1Var;
        this.f36719d = f1Var.a();
        this.f36717b = this.f36718c.b();
        if (!this.f36720e) {
            throw new IllegalArgumentException("You should not supply an IV for unwrapping");
        }
        byte[] bArr2 = this.f36719d;
        if (bArr2 == null || bArr2.length != 8) {
            throw new IllegalArgumentException("IV is not 8 octets");
        }
    }

    @Override // org.bouncycastle.crypto.c0
    public byte[] unwrap(byte[] bArr, int i11, int i12) {
        if (this.f36720e) {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (bArr != null) {
            if (i12 % this.f36716a.getBlockSize() != 0) {
                throw new InvalidCipherTextException("Ciphertext not multiple of " + this.f36716a.getBlockSize());
            }
            this.f36716a.init(false, new u50.f1(this.f36717b, f36715i));
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, i11, bArr2, 0, i12);
            for (int i13 = 0; i13 < i12 / this.f36716a.getBlockSize(); i13++) {
                int blockSize = this.f36716a.getBlockSize() * i13;
                this.f36716a.processBlock(bArr2, blockSize, bArr2, blockSize);
            }
            byte[] bArr3 = new byte[i12];
            int i14 = 0;
            while (i14 < i12) {
                int i15 = i14 + 1;
                bArr3[i14] = bArr2[i12 - i15];
                i14 = i15;
            }
            byte[] bArr4 = new byte[8];
            this.f36719d = bArr4;
            int i16 = i12 - 8;
            byte[] bArr5 = new byte[i16];
            System.arraycopy(bArr3, 0, bArr4, 0, 8);
            System.arraycopy(bArr3, 8, bArr5, 0, i16);
            u50.f1 f1Var = new u50.f1(this.f36717b, this.f36719d);
            this.f36718c = f1Var;
            this.f36716a.init(false, f1Var);
            byte[] bArr6 = new byte[i16];
            System.arraycopy(bArr5, 0, bArr6, 0, i16);
            for (int i17 = 0; i17 < i16 / this.f36716a.getBlockSize(); i17++) {
                int blockSize2 = this.f36716a.getBlockSize() * i17;
                this.f36716a.processBlock(bArr6, blockSize2, bArr6, blockSize2);
            }
            int i18 = i16 - 8;
            byte[] bArr7 = new byte[i18];
            byte[] bArr8 = new byte[8];
            System.arraycopy(bArr6, 0, bArr7, 0, i18);
            System.arraycopy(bArr6, i18, bArr8, 0, 8);
            if (b(bArr7, bArr8)) {
                if (i18 - ((bArr7[0] & 255) + 1) <= 7) {
                    int i19 = bArr7[0];
                    byte[] bArr9 = new byte[i19];
                    System.arraycopy(bArr7, 1, bArr9, 0, i19);
                    return bArr9;
                }
                throw new InvalidCipherTextException("too many pad bytes (" + (i18 - ((bArr7[0] & 255) + 1)) + ")");
            }
            throw new InvalidCipherTextException("Checksum inside ciphertext is corrupted");
        }
        throw new InvalidCipherTextException("Null pointer as ciphertext");
    }

    @Override // org.bouncycastle.crypto.c0
    public byte[] wrap(byte[] bArr, int i11, int i12) {
        if (this.f36720e) {
            int i13 = i12 + 1;
            int i14 = i13 % 8;
            int i15 = i14 != 0 ? (8 - i14) + i13 : i13;
            byte[] bArr2 = new byte[i15];
            bArr2[0] = (byte) i12;
            System.arraycopy(bArr, i11, bArr2, 1, i12);
            int i16 = (i15 - i12) - 1;
            byte[] bArr3 = new byte[i16];
            if (i16 > 0) {
                this.f36721f.nextBytes(bArr3);
                System.arraycopy(bArr3, 0, bArr2, i13, i16);
            }
            byte[] a11 = a(bArr2);
            int length = a11.length + i15;
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr2, 0, bArr4, 0, i15);
            System.arraycopy(a11, 0, bArr4, i15, a11.length);
            byte[] bArr5 = new byte[length];
            System.arraycopy(bArr4, 0, bArr5, 0, length);
            int blockSize = length / this.f36716a.getBlockSize();
            if (length % this.f36716a.getBlockSize() == 0) {
                this.f36716a.init(true, this.f36718c);
                for (int i17 = 0; i17 < blockSize; i17++) {
                    int blockSize2 = this.f36716a.getBlockSize() * i17;
                    this.f36716a.processBlock(bArr5, blockSize2, bArr5, blockSize2);
                }
                byte[] bArr6 = this.f36719d;
                int length2 = bArr6.length + length;
                byte[] bArr7 = new byte[length2];
                System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
                System.arraycopy(bArr5, 0, bArr7, this.f36719d.length, length);
                byte[] bArr8 = new byte[length2];
                int i18 = 0;
                while (i18 < length2) {
                    int i19 = i18 + 1;
                    bArr8[i18] = bArr7[length2 - i19];
                    i18 = i19;
                }
                this.f36716a.init(true, new u50.f1(this.f36717b, f36715i));
                for (int i21 = 0; i21 < blockSize + 1; i21++) {
                    int blockSize3 = this.f36716a.getBlockSize() * i21;
                    this.f36716a.processBlock(bArr8, blockSize3, bArr8, blockSize3);
                }
                return bArr8;
            }
            throw new IllegalStateException("Not multiple of block length");
        }
        throw new IllegalStateException("Not initialized for wrapping");
    }
}