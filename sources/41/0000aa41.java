package p50;

import org.bouncycastle.crypto.v;
import u50.b1;

/* loaded from: classes5.dex */
public class c implements v {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f46222a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f46223b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f46224c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f46225d;

    /* renamed from: e  reason: collision with root package name */
    private int f46226e;

    /* renamed from: f  reason: collision with root package name */
    private org.bouncycastle.crypto.e f46227f;

    /* renamed from: g  reason: collision with root package name */
    private int f46228g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f46229h;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f46230i;

    public c(org.bouncycastle.crypto.e eVar) {
        this(eVar, eVar.getBlockSize() * 8);
    }

    public c(org.bouncycastle.crypto.e eVar, int i11) {
        if (i11 % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (i11 > eVar.getBlockSize() * 8) {
            throw new IllegalArgumentException("MAC size must be less or equal to " + (eVar.getBlockSize() * 8));
        }
        this.f46227f = new q50.c(eVar);
        this.f46228g = i11 / 8;
        this.f46222a = b(eVar.getBlockSize());
        this.f46224c = new byte[eVar.getBlockSize()];
        this.f46225d = new byte[eVar.getBlockSize()];
        this.f46223b = new byte[eVar.getBlockSize()];
        this.f46226e = 0;
    }

    private byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i11 = (-c(bArr, bArr2)) & 255;
        int length = bArr.length - 3;
        byte b11 = bArr2[length];
        byte[] bArr3 = this.f46222a;
        bArr2[length] = (byte) (b11 ^ (bArr3[1] & i11));
        int length2 = bArr.length - 2;
        bArr2[length2] = (byte) ((bArr3[2] & i11) ^ bArr2[length2]);
        int length3 = bArr.length - 1;
        bArr2[length3] = (byte) ((i11 & bArr3[3]) ^ bArr2[length3]);
        return bArr2;
    }

    private static byte[] b(int i11) {
        int i12 = i11 * 8;
        int i13 = 135;
        switch (i12) {
            case 64:
            case 320:
                i13 = 27;
                break;
            case 128:
            case 192:
                break;
            case 160:
                i13 = 45;
                break;
            case 224:
                i13 = 777;
                break;
            case 256:
                i13 = 1061;
                break;
            case 384:
                i13 = 4109;
                break;
            case 448:
                i13 = 2129;
                break;
            case 512:
                i13 = 293;
                break;
            case 768:
                i13 = 655377;
                break;
            case 1024:
                i13 = 524355;
                break;
            case 2048:
                i13 = 548865;
                break;
            default:
                throw new IllegalArgumentException("Unknown block size for CMAC: " + i12);
        }
        return r70.i.h(i13);
    }

    private static int c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i11 = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i11;
            }
            int i12 = bArr[length] & 255;
            bArr2[length] = (byte) (i11 | (i12 << 1));
            i11 = (i12 >>> 7) & 1;
        }
    }

    void d(org.bouncycastle.crypto.i iVar) {
        if (iVar != null && !(iVar instanceof b1)) {
            throw new IllegalArgumentException("CMac mode only permits key to be set.");
        }
    }

    @Override // org.bouncycastle.crypto.v
    public int doFinal(byte[] bArr, int i11) {
        byte[] bArr2;
        if (this.f46226e == this.f46227f.getBlockSize()) {
            bArr2 = this.f46229h;
        } else {
            new t50.c().addPadding(this.f46225d, this.f46226e);
            bArr2 = this.f46230i;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr3 = this.f46224c;
            if (i12 >= bArr3.length) {
                this.f46227f.processBlock(this.f46225d, 0, bArr3, 0);
                System.arraycopy(this.f46224c, 0, bArr, i11, this.f46228g);
                reset();
                return this.f46228g;
            }
            byte[] bArr4 = this.f46225d;
            bArr4[i12] = (byte) (bArr4[i12] ^ bArr2[i12]);
            i12++;
        }
    }

    @Override // org.bouncycastle.crypto.v
    public String getAlgorithmName() {
        return this.f46227f.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.v
    public int getMacSize() {
        return this.f46228g;
    }

    @Override // org.bouncycastle.crypto.v
    public void init(org.bouncycastle.crypto.i iVar) {
        d(iVar);
        this.f46227f.init(true, iVar);
        byte[] bArr = this.f46223b;
        byte[] bArr2 = new byte[bArr.length];
        this.f46227f.processBlock(bArr, 0, bArr2, 0);
        byte[] a11 = a(bArr2);
        this.f46229h = a11;
        this.f46230i = a(a11);
        reset();
    }

    @Override // org.bouncycastle.crypto.v
    public void reset() {
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f46225d;
            if (i11 >= bArr.length) {
                this.f46226e = 0;
                this.f46227f.reset();
                return;
            }
            bArr[i11] = 0;
            i11++;
        }
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte b11) {
        int i11 = this.f46226e;
        byte[] bArr = this.f46225d;
        if (i11 == bArr.length) {
            this.f46227f.processBlock(bArr, 0, this.f46224c, 0);
            this.f46226e = 0;
        }
        byte[] bArr2 = this.f46225d;
        int i12 = this.f46226e;
        this.f46226e = i12 + 1;
        bArr2[i12] = b11;
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte[] bArr, int i11, int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = this.f46227f.getBlockSize();
        int i13 = this.f46226e;
        int i14 = blockSize - i13;
        if (i12 > i14) {
            System.arraycopy(bArr, i11, this.f46225d, i13, i14);
            this.f46227f.processBlock(this.f46225d, 0, this.f46224c, 0);
            this.f46226e = 0;
            i12 -= i14;
            i11 += i14;
            while (i12 > blockSize) {
                this.f46227f.processBlock(bArr, i11, this.f46224c, 0);
                i12 -= blockSize;
                i11 += blockSize;
            }
        }
        System.arraycopy(bArr, i11, this.f46225d, this.f46226e, i12);
        this.f46226e += i12;
    }
}