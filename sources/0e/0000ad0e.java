package q50;

import org.bouncycastle.crypto.a0;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;
import u50.f1;

/* loaded from: classes5.dex */
public class p extends a0 {

    /* renamed from: b  reason: collision with root package name */
    private byte[] f47694b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f47695c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f47696d;

    /* renamed from: e  reason: collision with root package name */
    private int f47697e;

    /* renamed from: f  reason: collision with root package name */
    private final int f47698f;

    /* renamed from: g  reason: collision with root package name */
    private final org.bouncycastle.crypto.e f47699g;

    /* renamed from: h  reason: collision with root package name */
    boolean f47700h;

    /* renamed from: i  reason: collision with root package name */
    int f47701i;

    /* renamed from: j  reason: collision with root package name */
    int f47702j;

    public p(org.bouncycastle.crypto.e eVar) {
        super(eVar);
        this.f47700h = true;
        this.f47699g = eVar;
        int blockSize = eVar.getBlockSize();
        this.f47698f = blockSize;
        if (blockSize != 8) {
            throw new IllegalArgumentException("GCTR only for 64 bit block ciphers");
        }
        this.f47694b = new byte[eVar.getBlockSize()];
        this.f47695c = new byte[eVar.getBlockSize()];
        this.f47696d = new byte[eVar.getBlockSize()];
    }

    private int c(byte[] bArr, int i11) {
        return ((bArr[i11 + 3] << 24) & (-16777216)) + ((bArr[i11 + 2] << Tnaf.POW_2_WIDTH) & 16711680) + ((bArr[i11 + 1] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) + (bArr[i11] & 255);
    }

    private void d(int i11, byte[] bArr, int i12) {
        bArr[i12 + 3] = (byte) (i11 >>> 24);
        bArr[i12 + 2] = (byte) (i11 >>> 16);
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12] = (byte) i11;
    }

    @Override // org.bouncycastle.crypto.a0
    protected byte a(byte b11) {
        if (this.f47697e == 0) {
            if (this.f47700h) {
                this.f47700h = false;
                this.f47699g.processBlock(this.f47695c, 0, this.f47696d, 0);
                this.f47701i = c(this.f47696d, 0);
                this.f47702j = c(this.f47696d, 4);
            }
            int i11 = this.f47701i + 16843009;
            this.f47701i = i11;
            int i12 = this.f47702j + 16843012;
            this.f47702j = i12;
            if (i12 < 16843012 && i12 > 0) {
                this.f47702j = i12 + 1;
            }
            d(i11, this.f47695c, 0);
            d(this.f47702j, this.f47695c, 4);
            this.f47699g.processBlock(this.f47695c, 0, this.f47696d, 0);
        }
        byte[] bArr = this.f47696d;
        int i13 = this.f47697e;
        int i14 = i13 + 1;
        this.f47697e = i14;
        byte b12 = (byte) (b11 ^ bArr[i13]);
        int i15 = this.f47698f;
        if (i14 == i15) {
            this.f47697e = 0;
            byte[] bArr2 = this.f47695c;
            System.arraycopy(bArr2, i15, bArr2, 0, bArr2.length - i15);
            byte[] bArr3 = this.f47696d;
            byte[] bArr4 = this.f47695c;
            int length = bArr4.length;
            int i16 = this.f47698f;
            System.arraycopy(bArr3, 0, bArr4, length - i16, i16);
        }
        return b12;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.f47699g.getAlgorithmName() + "/GCTR";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return this.f47698f;
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.e eVar;
        this.f47700h = true;
        this.f47701i = 0;
        this.f47702j = 0;
        if (iVar instanceof f1) {
            f1 f1Var = (f1) iVar;
            byte[] a11 = f1Var.a();
            int length = a11.length;
            byte[] bArr = this.f47694b;
            if (length < bArr.length) {
                System.arraycopy(a11, 0, bArr, bArr.length - a11.length, a11.length);
                int i11 = 0;
                while (true) {
                    byte[] bArr2 = this.f47694b;
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
            if (f1Var.b() == null) {
                return;
            }
            eVar = this.f47699g;
            iVar = f1Var.b();
        } else {
            reset();
            if (iVar == null) {
                return;
            }
            eVar = this.f47699g;
        }
        eVar.init(true, iVar);
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        processBytes(bArr, i11, this.f47698f, bArr2, i12);
        return this.f47698f;
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        this.f47700h = true;
        this.f47701i = 0;
        this.f47702j = 0;
        byte[] bArr = this.f47694b;
        System.arraycopy(bArr, 0, this.f47695c, 0, bArr.length);
        this.f47697e = 0;
        this.f47699g.reset();
    }
}