package l50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: classes5.dex */
public class l0 implements org.bouncycastle.crypto.c0 {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.crypto.e f36801a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f36802b;

    /* renamed from: c  reason: collision with root package name */
    private u50.b1 f36803c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f36804d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f36805e;

    public l0(org.bouncycastle.crypto.e eVar) {
        this(eVar, false);
    }

    public l0(org.bouncycastle.crypto.e eVar, boolean z11) {
        this.f36805e = new byte[]{-90, -90, -90, -90, -90, -90, -90, -90};
        this.f36801a = eVar;
        this.f36802b = !z11;
    }

    @Override // org.bouncycastle.crypto.c0
    public String getAlgorithmName() {
        return this.f36801a.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.c0
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        this.f36804d = z11;
        if (iVar instanceof u50.g1) {
            iVar = ((u50.g1) iVar).a();
        }
        if (iVar instanceof u50.b1) {
            this.f36803c = (u50.b1) iVar;
        } else if (iVar instanceof u50.f1) {
            u50.f1 f1Var = (u50.f1) iVar;
            this.f36805e = f1Var.a();
            this.f36803c = (u50.b1) f1Var.b();
            if (this.f36805e.length != 8) {
                throw new IllegalArgumentException("IV not equal to 8");
            }
        }
    }

    @Override // org.bouncycastle.crypto.c0
    public byte[] unwrap(byte[] bArr, int i11, int i12) {
        if (this.f36804d) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int i13 = i12 / 8;
        if (i13 * 8 == i12) {
            byte[] bArr2 = this.f36805e;
            byte[] bArr3 = new byte[i12 - bArr2.length];
            byte[] bArr4 = new byte[bArr2.length];
            byte[] bArr5 = new byte[bArr2.length + 8];
            System.arraycopy(bArr, i11, bArr4, 0, bArr2.length);
            byte[] bArr6 = this.f36805e;
            System.arraycopy(bArr, i11 + bArr6.length, bArr3, 0, i12 - bArr6.length);
            this.f36801a.init(!this.f36802b, this.f36803c);
            int i14 = i13 - 1;
            for (int i15 = 5; i15 >= 0; i15--) {
                for (int i16 = i14; i16 >= 1; i16--) {
                    System.arraycopy(bArr4, 0, bArr5, 0, this.f36805e.length);
                    int i17 = (i16 - 1) * 8;
                    System.arraycopy(bArr3, i17, bArr5, this.f36805e.length, 8);
                    int i18 = (i14 * i15) + i16;
                    int i19 = 1;
                    while (i18 != 0) {
                        int length = this.f36805e.length - i19;
                        bArr5[length] = (byte) (((byte) i18) ^ bArr5[length]);
                        i18 >>>= 8;
                        i19++;
                    }
                    this.f36801a.processBlock(bArr5, 0, bArr5, 0);
                    System.arraycopy(bArr5, 0, bArr4, 0, 8);
                    System.arraycopy(bArr5, 8, bArr3, i17, 8);
                }
            }
            if (org.bouncycastle.util.a.u(bArr4, this.f36805e)) {
                return bArr3;
            }
            throw new InvalidCipherTextException("checksum failed");
        }
        throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
    }

    @Override // org.bouncycastle.crypto.c0
    public byte[] wrap(byte[] bArr, int i11, int i12) {
        if (this.f36804d) {
            int i13 = i12 / 8;
            if (i13 * 8 == i12) {
                byte[] bArr2 = this.f36805e;
                byte[] bArr3 = new byte[bArr2.length + i12];
                byte[] bArr4 = new byte[bArr2.length + 8];
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                System.arraycopy(bArr, i11, bArr3, this.f36805e.length, i12);
                this.f36801a.init(this.f36802b, this.f36803c);
                for (int i14 = 0; i14 != 6; i14++) {
                    for (int i15 = 1; i15 <= i13; i15++) {
                        System.arraycopy(bArr3, 0, bArr4, 0, this.f36805e.length);
                        int i16 = i15 * 8;
                        System.arraycopy(bArr3, i16, bArr4, this.f36805e.length, 8);
                        this.f36801a.processBlock(bArr4, 0, bArr4, 0);
                        int i17 = (i13 * i14) + i15;
                        int i18 = 1;
                        while (i17 != 0) {
                            int length = this.f36805e.length - i18;
                            bArr4[length] = (byte) (((byte) i17) ^ bArr4[length]);
                            i17 >>>= 8;
                            i18++;
                        }
                        System.arraycopy(bArr4, 0, bArr3, 0, 8);
                        System.arraycopy(bArr4, 8, bArr3, i16, 8);
                    }
                }
                return bArr3;
            }
            throw new DataLengthException("wrap data must be a multiple of 8 bytes");
        }
        throw new IllegalStateException("not set for wrapping");
    }
}