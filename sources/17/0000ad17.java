package q50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes5.dex */
public class w implements org.bouncycastle.crypto.e {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f47763a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f47764b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f47765c;

    /* renamed from: d  reason: collision with root package name */
    private org.bouncycastle.crypto.e f47766d;

    /* renamed from: e  reason: collision with root package name */
    private int f47767e;

    /* renamed from: f  reason: collision with root package name */
    private int f47768f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f47769g;

    public w(org.bouncycastle.crypto.e eVar) {
        this.f47766d = eVar;
        int blockSize = eVar.getBlockSize();
        this.f47768f = blockSize;
        this.f47763a = new byte[blockSize];
        this.f47764b = new byte[blockSize];
        this.f47765c = new byte[blockSize];
    }

    private int a(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13;
        int i14;
        int i15;
        int i16 = this.f47768f;
        if (i11 + i16 <= bArr.length) {
            if (i12 + i16 <= bArr2.length) {
                int i17 = this.f47767e;
                int i18 = 2;
                int i19 = 0;
                if (i17 > i16) {
                    byte b11 = bArr[i11];
                    this.f47764b[i16 - 2] = b11;
                    bArr2[i12] = c(b11, i16 - 2);
                    byte b12 = bArr[i11 + 1];
                    byte[] bArr3 = this.f47764b;
                    int i21 = this.f47768f;
                    bArr3[i21 - 1] = b12;
                    bArr2[i12 + 1] = c(b12, i21 - 1);
                    this.f47766d.processBlock(this.f47764b, 0, this.f47765c, 0);
                    while (i18 < this.f47768f) {
                        byte b13 = bArr[i11 + i18];
                        int i22 = i18 - 2;
                        this.f47764b[i22] = b13;
                        bArr2[i12 + i18] = c(b13, i22);
                        i18++;
                    }
                } else {
                    if (i17 == 0) {
                        this.f47766d.processBlock(this.f47764b, 0, this.f47765c, 0);
                        while (true) {
                            i15 = this.f47768f;
                            if (i19 >= i15) {
                                break;
                            }
                            int i23 = i11 + i19;
                            this.f47764b[i19] = bArr[i23];
                            bArr2[i19] = c(bArr[i23], i19);
                            i19++;
                        }
                        i14 = this.f47767e + i15;
                    } else if (i17 == i16) {
                        this.f47766d.processBlock(this.f47764b, 0, this.f47765c, 0);
                        byte b14 = bArr[i11];
                        byte b15 = bArr[i11 + 1];
                        bArr2[i12] = c(b14, 0);
                        bArr2[i12 + 1] = c(b15, 1);
                        byte[] bArr4 = this.f47764b;
                        System.arraycopy(bArr4, 2, bArr4, 0, this.f47768f - 2);
                        byte[] bArr5 = this.f47764b;
                        int i24 = this.f47768f;
                        bArr5[i24 - 2] = b14;
                        bArr5[i24 - 1] = b15;
                        this.f47766d.processBlock(bArr5, 0, this.f47765c, 0);
                        while (true) {
                            i13 = this.f47768f;
                            if (i18 >= i13) {
                                break;
                            }
                            byte b16 = bArr[i11 + i18];
                            int i25 = i18 - 2;
                            this.f47764b[i25] = b16;
                            bArr2[i12 + i18] = c(b16, i25);
                            i18++;
                        }
                        i14 = this.f47767e + i13;
                    }
                    this.f47767e = i14;
                }
                return this.f47768f;
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new DataLengthException("input buffer too short");
    }

    private int b(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13;
        int i14 = this.f47768f;
        if (i11 + i14 <= bArr.length) {
            if (i12 + i14 <= bArr2.length) {
                int i15 = this.f47767e;
                int i16 = 2;
                int i17 = 0;
                if (i15 > i14) {
                    byte[] bArr3 = this.f47764b;
                    int i18 = i14 - 2;
                    byte c11 = c(bArr[i11], i14 - 2);
                    bArr2[i12] = c11;
                    bArr3[i18] = c11;
                    byte[] bArr4 = this.f47764b;
                    int i19 = this.f47768f;
                    int i21 = i19 - 1;
                    byte c12 = c(bArr[i11 + 1], i19 - 1);
                    bArr2[i12 + 1] = c12;
                    bArr4[i21] = c12;
                    this.f47766d.processBlock(this.f47764b, 0, this.f47765c, 0);
                    while (i16 < this.f47768f) {
                        byte[] bArr5 = this.f47764b;
                        int i22 = i16 - 2;
                        byte c13 = c(bArr[i11 + i16], i22);
                        bArr2[i12 + i16] = c13;
                        bArr5[i22] = c13;
                        i16++;
                    }
                } else {
                    if (i15 != 0) {
                        if (i15 == i14) {
                            this.f47766d.processBlock(this.f47764b, 0, this.f47765c, 0);
                            bArr2[i12] = c(bArr[i11], 0);
                            bArr2[i12 + 1] = c(bArr[i11 + 1], 1);
                            byte[] bArr6 = this.f47764b;
                            System.arraycopy(bArr6, 2, bArr6, 0, this.f47768f - 2);
                            System.arraycopy(bArr2, i12, this.f47764b, this.f47768f - 2, 2);
                            this.f47766d.processBlock(this.f47764b, 0, this.f47765c, 0);
                            while (true) {
                                i13 = this.f47768f;
                                if (i16 >= i13) {
                                    break;
                                }
                                byte[] bArr7 = this.f47764b;
                                int i23 = i16 - 2;
                                byte c14 = c(bArr[i11 + i16], i23);
                                bArr2[i12 + i16] = c14;
                                bArr7[i23] = c14;
                                i16++;
                            }
                        }
                    } else {
                        this.f47766d.processBlock(this.f47764b, 0, this.f47765c, 0);
                        while (true) {
                            i13 = this.f47768f;
                            if (i17 >= i13) {
                                break;
                            }
                            byte[] bArr8 = this.f47764b;
                            byte c15 = c(bArr[i11 + i17], i17);
                            bArr2[i12 + i17] = c15;
                            bArr8[i17] = c15;
                            i17++;
                        }
                    }
                    this.f47767e += i13;
                }
                return this.f47768f;
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new DataLengthException("input buffer too short");
    }

    private byte c(byte b11, int i11) {
        return (byte) (b11 ^ this.f47765c[i11]);
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.f47766d.getAlgorithmName() + "/OpenPGPCFB";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return this.f47766d.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        this.f47769g = z11;
        reset();
        this.f47766d.init(true, iVar);
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        return this.f47769g ? b(bArr, i11, bArr2, i12) : a(bArr, i11, bArr2, i12);
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        this.f47767e = 0;
        byte[] bArr = this.f47763a;
        byte[] bArr2 = this.f47764b;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.f47766d.reset();
    }
}