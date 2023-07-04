package q50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import u50.f1;

/* loaded from: classes5.dex */
public class x implements org.bouncycastle.crypto.e {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f47770a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f47771b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f47772c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f47773d;

    /* renamed from: e  reason: collision with root package name */
    private org.bouncycastle.crypto.e f47774e;

    /* renamed from: f  reason: collision with root package name */
    private int f47775f;

    /* renamed from: g  reason: collision with root package name */
    private int f47776g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f47777h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f47778i;

    public x(org.bouncycastle.crypto.e eVar, boolean z11) {
        this.f47774e = eVar;
        this.f47778i = z11;
        int blockSize = eVar.getBlockSize();
        this.f47776g = blockSize;
        this.f47770a = new byte[blockSize];
        this.f47771b = new byte[blockSize];
        this.f47772c = new byte[blockSize];
        this.f47773d = new byte[blockSize];
    }

    private int a(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = this.f47776g;
        if (i11 + i13 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i13 + i12 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i14 = 0;
        this.f47774e.processBlock(this.f47771b, 0, this.f47772c, 0);
        for (int i15 = 0; i15 < this.f47776g; i15++) {
            bArr2[i12 + i15] = e(bArr[i11 + i15], i15);
        }
        while (true) {
            int i16 = this.f47776g;
            if (i14 >= i16) {
                return i16;
            }
            this.f47771b[i14] = bArr[i11 + i14];
            i14++;
        }
    }

    private int b(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13;
        int i14 = this.f47776g;
        if (i11 + i14 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + i14 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i15 = this.f47775f;
        if (i15 == 0) {
            for (int i16 = 0; i16 < this.f47776g; i16++) {
                this.f47771b[i16] = bArr[i11 + i16];
            }
            this.f47774e.processBlock(this.f47771b, 0, this.f47772c, 0);
            this.f47775f += this.f47776g;
            return 0;
        } else if (i15 != i14) {
            if (i15 >= i14 + 2) {
                System.arraycopy(bArr, i11, this.f47773d, 0, i14);
                bArr2[i12 + 0] = e(this.f47773d[0], this.f47776g - 2);
                bArr2[i12 + 1] = e(this.f47773d[1], this.f47776g - 1);
                System.arraycopy(this.f47773d, 0, this.f47771b, this.f47776g - 2, 2);
                this.f47774e.processBlock(this.f47771b, 0, this.f47772c, 0);
                int i17 = 0;
                while (true) {
                    i13 = this.f47776g;
                    if (i17 >= i13 - 2) {
                        break;
                    }
                    bArr2[i12 + i17 + 2] = e(this.f47773d[i17 + 2], i17);
                    i17++;
                }
                System.arraycopy(this.f47773d, 2, this.f47771b, 0, i13 - 2);
            }
            return this.f47776g;
        } else {
            System.arraycopy(bArr, i11, this.f47773d, 0, i14);
            byte[] bArr3 = this.f47771b;
            System.arraycopy(bArr3, 2, bArr3, 0, this.f47776g - 2);
            byte[] bArr4 = this.f47771b;
            int i18 = this.f47776g;
            byte[] bArr5 = this.f47773d;
            bArr4[i18 - 2] = bArr5[0];
            bArr4[i18 - 1] = bArr5[1];
            this.f47774e.processBlock(bArr4, 0, this.f47772c, 0);
            int i19 = 0;
            while (true) {
                int i21 = this.f47776g;
                if (i19 >= i21 - 2) {
                    System.arraycopy(this.f47773d, 2, this.f47771b, 0, i21 - 2);
                    this.f47775f += 2;
                    return this.f47776g - 2;
                }
                bArr2[i12 + i19] = e(this.f47773d[i19 + 2], i19);
                i19++;
            }
        }
    }

    private int c(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = this.f47776g;
        if (i11 + i13 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i13 + i12 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i14 = 0;
        this.f47774e.processBlock(this.f47771b, 0, this.f47772c, 0);
        for (int i15 = 0; i15 < this.f47776g; i15++) {
            bArr2[i12 + i15] = e(bArr[i11 + i15], i15);
        }
        while (true) {
            int i16 = this.f47776g;
            if (i14 >= i16) {
                return i16;
            }
            this.f47771b[i14] = bArr2[i12 + i14];
            i14++;
        }
    }

    private int d(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13;
        int i14;
        int i15 = this.f47776g;
        if (i11 + i15 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        int i16 = this.f47775f;
        if (i16 != 0) {
            if (i16 >= i15 + 2) {
                if (i15 + i12 > bArr2.length) {
                    throw new OutputLengthException("output buffer too short");
                }
                this.f47774e.processBlock(this.f47771b, 0, this.f47772c, 0);
                int i17 = 0;
                while (true) {
                    i13 = this.f47776g;
                    if (i17 >= i13) {
                        break;
                    }
                    bArr2[i12 + i17] = e(bArr[i11 + i17], i17);
                    i17++;
                }
                System.arraycopy(bArr2, i12, this.f47771b, 0, i13);
            }
            return this.f47776g;
        } else if ((i15 * 2) + i12 + 2 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        } else {
            this.f47774e.processBlock(this.f47771b, 0, this.f47772c, 0);
            int i18 = 0;
            while (true) {
                i14 = this.f47776g;
                if (i18 >= i14) {
                    break;
                }
                bArr2[i12 + i18] = e(this.f47770a[i18], i18);
                i18++;
            }
            System.arraycopy(bArr2, i12, this.f47771b, 0, i14);
            this.f47774e.processBlock(this.f47771b, 0, this.f47772c, 0);
            int i19 = this.f47776g;
            bArr2[i12 + i19] = e(this.f47770a[i19 - 2], 0);
            int i21 = this.f47776g;
            bArr2[i12 + i21 + 1] = e(this.f47770a[i21 - 1], 1);
            System.arraycopy(bArr2, i12 + 2, this.f47771b, 0, this.f47776g);
            this.f47774e.processBlock(this.f47771b, 0, this.f47772c, 0);
            int i22 = 0;
            while (true) {
                int i23 = this.f47776g;
                if (i22 >= i23) {
                    System.arraycopy(bArr2, i12 + i23 + 2, this.f47771b, 0, i23);
                    int i24 = this.f47775f;
                    int i25 = this.f47776g;
                    this.f47775f = i24 + (i25 * 2) + 2;
                    return (i25 * 2) + 2;
                }
                bArr2[i23 + i12 + 2 + i22] = e(bArr[i11 + i22], i22);
                i22++;
            }
        }
    }

    private byte e(byte b11, int i11) {
        return (byte) (b11 ^ this.f47772c[i11]);
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        StringBuilder sb2;
        String str;
        if (this.f47778i) {
            sb2 = new StringBuilder();
            sb2.append(this.f47774e.getAlgorithmName());
            str = "/PGPCFBwithIV";
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f47774e.getAlgorithmName());
            str = "/PGPCFB";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return this.f47774e.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.e eVar;
        this.f47777h = z11;
        if (iVar instanceof f1) {
            f1 f1Var = (f1) iVar;
            byte[] a11 = f1Var.a();
            int length = a11.length;
            byte[] bArr = this.f47770a;
            if (length < bArr.length) {
                System.arraycopy(a11, 0, bArr, bArr.length - a11.length, a11.length);
                int i11 = 0;
                while (true) {
                    byte[] bArr2 = this.f47770a;
                    if (i11 >= bArr2.length - a11.length) {
                        break;
                    }
                    bArr2[i11] = 0;
                    i11++;
                }
            } else {
                System.arraycopy(a11, 0, bArr, 0, bArr.length);
            }
            reset();
            eVar = this.f47774e;
            iVar = f1Var.b();
        } else {
            reset();
            eVar = this.f47774e;
        }
        eVar.init(true, iVar);
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        return this.f47778i ? this.f47777h ? d(bArr, i11, bArr2, i12) : b(bArr, i11, bArr2, i12) : this.f47777h ? c(bArr, i11, bArr2, i12) : a(bArr, i11, bArr2, i12);
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        this.f47775f = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f47771b;
            if (i11 == bArr.length) {
                this.f47774e.reset();
                return;
            }
            if (this.f47778i) {
                bArr[i11] = 0;
            } else {
                bArr[i11] = this.f47770a[i11];
            }
            i11++;
        }
    }
}