package l50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes5.dex */
public class a0 implements org.bouncycastle.crypto.b0 {

    /* renamed from: d  reason: collision with root package name */
    private byte[] f36669d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f36670e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f36671f;

    /* renamed from: a  reason: collision with root package name */
    private int[] f36666a = new int[1024];

    /* renamed from: b  reason: collision with root package name */
    private int[] f36667b = new int[1024];

    /* renamed from: c  reason: collision with root package name */
    private int f36668c = 0;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f36672g = new byte[4];

    /* renamed from: h  reason: collision with root package name */
    private int f36673h = 0;

    private byte a() {
        if (this.f36673h == 0) {
            int d11 = d();
            byte[] bArr = this.f36672g;
            bArr[0] = (byte) (d11 & 255);
            int i11 = d11 >> 8;
            bArr[1] = (byte) (i11 & 255);
            int i12 = i11 >> 8;
            bArr[2] = (byte) (i12 & 255);
            bArr[3] = (byte) ((i12 >> 8) & 255);
        }
        byte[] bArr2 = this.f36672g;
        int i13 = this.f36673h;
        byte b11 = bArr2[i13];
        this.f36673h = 3 & (i13 + 1);
        return b11;
    }

    private void b() {
        byte[] bArr = this.f36669d;
        if (bArr.length != 32 && bArr.length != 16) {
            throw new IllegalArgumentException("The key must be 128/256 bits long");
        }
        if (this.f36670e.length < 16) {
            throw new IllegalArgumentException("The IV must be at least 128 bits long");
        }
        if (bArr.length != 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            byte[] bArr3 = this.f36669d;
            System.arraycopy(bArr3, 0, bArr2, 16, bArr3.length);
            this.f36669d = bArr2;
        }
        byte[] bArr4 = this.f36670e;
        if (bArr4.length < 32) {
            byte[] bArr5 = new byte[32];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
            byte[] bArr6 = this.f36670e;
            System.arraycopy(bArr6, 0, bArr5, bArr6.length, 32 - bArr6.length);
            this.f36670e = bArr5;
        }
        this.f36673h = 0;
        this.f36668c = 0;
        int[] iArr = new int[2560];
        for (int i11 = 0; i11 < 32; i11++) {
            int i12 = i11 >> 2;
            iArr[i12] = iArr[i12] | ((this.f36669d[i11] & 255) << ((i11 & 3) * 8));
        }
        for (int i13 = 0; i13 < 32; i13++) {
            int i14 = (i13 >> 2) + 8;
            iArr[i14] = iArr[i14] | ((this.f36670e[i13] & 255) << ((i13 & 3) * 8));
        }
        for (int i15 = 16; i15 < 2560; i15++) {
            int i16 = iArr[i15 - 2];
            int i17 = iArr[i15 - 15];
            iArr[i15] = ((i16 >>> 10) ^ (c(i16, 17) ^ c(i16, 19))) + iArr[i15 - 7] + ((i17 >>> 3) ^ (c(i17, 7) ^ c(i17, 18))) + iArr[i15 - 16] + i15;
        }
        System.arraycopy(iArr, 512, this.f36666a, 0, 1024);
        System.arraycopy(iArr, 1536, this.f36667b, 0, 1024);
        for (int i18 = 0; i18 < 4096; i18++) {
            d();
        }
        this.f36668c = 0;
    }

    private static int c(int i11, int i12) {
        return (i11 << (-i12)) | (i11 >>> i12);
    }

    private int d() {
        int i11;
        int i12;
        int i13 = this.f36668c;
        int i14 = i13 & 1023;
        if (i13 < 1024) {
            int[] iArr = this.f36666a;
            int i15 = iArr[(i14 - 3) & 1023];
            int i16 = iArr[(i14 - 1023) & 1023];
            int i17 = iArr[i14];
            int c11 = iArr[(i14 - 10) & 1023] + (c(i16, 23) ^ c(i15, 10));
            int[] iArr2 = this.f36667b;
            iArr[i14] = i17 + c11 + iArr2[(i15 ^ i16) & 1023];
            int[] iArr3 = this.f36666a;
            int i18 = iArr3[(i14 - 12) & 1023];
            i11 = iArr2[i18 & 255] + iArr2[((i18 >> 8) & 255) + 256] + iArr2[((i18 >> 16) & 255) + 512] + iArr2[((i18 >> 24) & 255) + 768];
            i12 = iArr3[i14];
        } else {
            int[] iArr4 = this.f36667b;
            int i19 = iArr4[(i14 - 3) & 1023];
            int i21 = iArr4[(i14 - 1023) & 1023];
            int i22 = iArr4[i14];
            int c12 = iArr4[(i14 - 10) & 1023] + (c(i21, 23) ^ c(i19, 10));
            int[] iArr5 = this.f36666a;
            iArr4[i14] = i22 + c12 + iArr5[(i19 ^ i21) & 1023];
            int[] iArr6 = this.f36667b;
            int i23 = iArr6[(i14 - 12) & 1023];
            i11 = iArr5[i23 & 255] + iArr5[((i23 >> 8) & 255) + 256] + iArr5[((i23 >> 16) & 255) + 512] + iArr5[((i23 >> 24) & 255) + 768];
            i12 = iArr6[i14];
        }
        int i24 = i12 ^ i11;
        this.f36668c = (this.f36668c + 1) & 2047;
        return i24;
    }

    @Override // org.bouncycastle.crypto.b0
    public String getAlgorithmName() {
        return "HC-256";
    }

    @Override // org.bouncycastle.crypto.b0
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.i iVar2;
        if (iVar instanceof u50.f1) {
            u50.f1 f1Var = (u50.f1) iVar;
            this.f36670e = f1Var.a();
            iVar2 = f1Var.b();
        } else {
            this.f36670e = new byte[0];
            iVar2 = iVar;
        }
        if (iVar2 instanceof u50.b1) {
            this.f36669d = ((u50.b1) iVar2).a();
            b();
            this.f36671f = true;
            return;
        }
        throw new IllegalArgumentException("Invalid parameter passed to HC256 init - " + iVar.getClass().getName());
    }

    @Override // org.bouncycastle.crypto.b0
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (!this.f36671f) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        } else if (i11 + i12 <= bArr.length) {
            if (i13 + i12 <= bArr2.length) {
                for (int i14 = 0; i14 < i12; i14++) {
                    bArr2[i13 + i14] = (byte) (bArr[i11 + i14] ^ a());
                }
                return i12;
            }
            throw new OutputLengthException("output buffer too short");
        } else {
            throw new DataLengthException("input buffer too short");
        }
    }

    @Override // org.bouncycastle.crypto.b0
    public void reset() {
        b();
    }
}