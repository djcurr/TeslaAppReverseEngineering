package l50;

import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: classes5.dex */
public class m0 implements org.bouncycastle.crypto.c0 {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.crypto.e f36806a;

    /* renamed from: b  reason: collision with root package name */
    private u50.b1 f36807b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36808c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f36809d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f36810e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f36811f = null;

    public m0(org.bouncycastle.crypto.e eVar) {
        byte[] bArr = {-90, 89, 89, -90};
        this.f36809d = bArr;
        this.f36810e = bArr;
        this.f36806a = eVar;
    }

    private byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i11 = (8 - (length % 8)) % 8;
        byte[] bArr2 = new byte[length + i11];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        if (i11 != 0) {
            System.arraycopy(new byte[i11], 0, bArr2, length, i11);
        }
        return bArr2;
    }

    private byte[] b(byte[] bArr, int i11, int i12) {
        int i13 = i12 - 8;
        byte[] bArr2 = new byte[i13];
        byte[] bArr3 = new byte[8];
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArr, i11, bArr3, 0, 8);
        System.arraycopy(bArr, i11 + 8, bArr2, 0, i13);
        this.f36806a.init(false, this.f36807b);
        int i14 = (i12 / 8) - 1;
        for (int i15 = 5; i15 >= 0; i15--) {
            for (int i16 = i14; i16 >= 1; i16--) {
                System.arraycopy(bArr3, 0, bArr4, 0, 8);
                int i17 = (i16 - 1) * 8;
                System.arraycopy(bArr2, i17, bArr4, 8, 8);
                int i18 = (i14 * i15) + i16;
                int i19 = 1;
                while (i18 != 0) {
                    int i21 = 8 - i19;
                    bArr4[i21] = (byte) (((byte) i18) ^ bArr4[i21]);
                    i18 >>>= 8;
                    i19++;
                }
                this.f36806a.processBlock(bArr4, 0, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr2, i17, 8);
            }
        }
        this.f36811f = bArr3;
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.c0
    public String getAlgorithmName() {
        return this.f36806a.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.c0
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        this.f36808c = z11;
        if (iVar instanceof u50.g1) {
            iVar = ((u50.g1) iVar).a();
        }
        if (iVar instanceof u50.b1) {
            this.f36807b = (u50.b1) iVar;
            this.f36810e = this.f36809d;
        } else if (iVar instanceof u50.f1) {
            u50.f1 f1Var = (u50.f1) iVar;
            this.f36810e = f1Var.a();
            this.f36807b = (u50.b1) f1Var.b();
            if (this.f36810e.length != 4) {
                throw new IllegalArgumentException("IV length not equal to 4");
            }
        }
    }

    @Override // org.bouncycastle.crypto.c0
    public byte[] unwrap(byte[] bArr, int i11, int i12) {
        byte[] b11;
        if (this.f36808c) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int i13 = i12 / 8;
        if (i13 * 8 == i12) {
            if (i13 > 1) {
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i11, bArr2, 0, i12);
                byte[] bArr3 = new byte[i12];
                if (i13 == 2) {
                    this.f36806a.init(false, this.f36807b);
                    int i14 = 0;
                    while (i14 < i12) {
                        this.f36806a.processBlock(bArr2, i14, bArr3, i14);
                        i14 += this.f36806a.getBlockSize();
                    }
                    byte[] bArr4 = new byte[8];
                    this.f36811f = bArr4;
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr4.length);
                    byte[] bArr5 = this.f36811f;
                    int length = i12 - bArr5.length;
                    b11 = new byte[length];
                    System.arraycopy(bArr3, bArr5.length, b11, 0, length);
                } else {
                    b11 = b(bArr, i11, i12);
                }
                int i15 = 4;
                byte[] bArr6 = new byte[4];
                byte[] bArr7 = new byte[4];
                System.arraycopy(this.f36811f, 0, bArr6, 0, 4);
                System.arraycopy(this.f36811f, 4, bArr7, 0, 4);
                int a11 = r70.i.a(bArr7, 0);
                boolean u11 = org.bouncycastle.util.a.u(bArr6, this.f36810e);
                int length2 = b11.length;
                if (a11 <= length2 - 8) {
                    u11 = false;
                }
                if (a11 > length2) {
                    u11 = false;
                }
                int i16 = length2 - a11;
                if (i16 >= 8 || i16 < 0) {
                    u11 = false;
                } else {
                    i15 = i16;
                }
                byte[] bArr8 = new byte[i15];
                System.arraycopy(b11, b11.length - i15, bArr8, 0, i15);
                if (!org.bouncycastle.util.a.u(bArr8, new byte[i15])) {
                    u11 = false;
                }
                if (u11) {
                    byte[] bArr9 = new byte[a11];
                    System.arraycopy(b11, 0, bArr9, 0, a11);
                    return bArr9;
                }
                throw new InvalidCipherTextException("checksum failed");
            }
            throw new InvalidCipherTextException("unwrap data must be at least 16 bytes");
        }
        throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
    }

    @Override // org.bouncycastle.crypto.c0
    public byte[] wrap(byte[] bArr, int i11, int i12) {
        if (this.f36808c) {
            byte[] bArr2 = new byte[8];
            byte[] h11 = r70.i.h(i12);
            byte[] bArr3 = this.f36810e;
            int i13 = 0;
            System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
            System.arraycopy(h11, 0, bArr2, this.f36810e.length, h11.length);
            byte[] bArr4 = new byte[i12];
            System.arraycopy(bArr, i11, bArr4, 0, i12);
            byte[] a11 = a(bArr4);
            if (a11.length != 8) {
                l0 l0Var = new l0(this.f36806a);
                l0Var.init(true, new u50.f1(this.f36807b, bArr2));
                return l0Var.wrap(a11, 0, a11.length);
            }
            int length = a11.length + 8;
            byte[] bArr5 = new byte[length];
            System.arraycopy(bArr2, 0, bArr5, 0, 8);
            System.arraycopy(a11, 0, bArr5, 8, a11.length);
            this.f36806a.init(true, this.f36807b);
            while (i13 < length) {
                this.f36806a.processBlock(bArr5, i13, bArr5, i13);
                i13 += this.f36806a.getBlockSize();
            }
            return bArr5;
        }
        throw new IllegalStateException("not set for wrapping");
    }
}