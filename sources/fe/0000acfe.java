package q50;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import u50.f1;

/* loaded from: classes5.dex */
public class d implements q50.a {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.crypto.e f47570a;

    /* renamed from: b  reason: collision with root package name */
    private int f47571b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f47572c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f47573d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f47574e;

    /* renamed from: f  reason: collision with root package name */
    private int f47575f;

    /* renamed from: g  reason: collision with root package name */
    private org.bouncycastle.crypto.i f47576g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f47577h;

    /* renamed from: i  reason: collision with root package name */
    private a f47578i = new a(this);

    /* renamed from: j  reason: collision with root package name */
    private a f47579j = new a(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class a extends ByteArrayOutputStream {
        public a(d dVar) {
        }

        public byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public d(org.bouncycastle.crypto.e eVar) {
        this.f47570a = eVar;
        int blockSize = eVar.getBlockSize();
        this.f47571b = blockSize;
        this.f47577h = new byte[blockSize];
        if (blockSize != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
    }

    private int a(byte[] bArr, int i11, int i12, byte[] bArr2) {
        p50.a aVar = new p50.a(this.f47570a, this.f47575f * 8);
        aVar.init(this.f47576g);
        byte[] bArr3 = new byte[16];
        if (d()) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        int i13 = 2;
        bArr3[0] = (byte) (bArr3[0] | ((((aVar.getMacSize() - 2) / 2) & 7) << 3));
        byte b11 = bArr3[0];
        byte[] bArr4 = this.f47573d;
        bArr3[0] = (byte) (b11 | (((15 - bArr4.length) - 1) & 7));
        System.arraycopy(bArr4, 0, bArr3, 1, bArr4.length);
        int i14 = i12;
        int i15 = 1;
        while (i14 > 0) {
            bArr3[16 - i15] = (byte) (i14 & 255);
            i14 >>>= 8;
            i15++;
        }
        aVar.update(bArr3, 0, 16);
        if (d()) {
            int b12 = b();
            if (b12 < 65280) {
                aVar.update((byte) (b12 >> 8));
                aVar.update((byte) b12);
            } else {
                aVar.update((byte) -1);
                aVar.update((byte) -2);
                aVar.update((byte) (b12 >> 24));
                aVar.update((byte) (b12 >> 16));
                aVar.update((byte) (b12 >> 8));
                aVar.update((byte) b12);
                i13 = 6;
            }
            byte[] bArr5 = this.f47574e;
            if (bArr5 != null) {
                aVar.update(bArr5, 0, bArr5.length);
            }
            if (this.f47578i.size() > 0) {
                aVar.update(this.f47578i.a(), 0, this.f47578i.size());
            }
            int i16 = (i13 + b12) % 16;
            if (i16 != 0) {
                while (i16 != 16) {
                    aVar.update((byte) 0);
                    i16++;
                }
            }
        }
        aVar.update(bArr, i11, i12);
        return aVar.doFinal(bArr2, 0);
    }

    private int b() {
        int size = this.f47578i.size();
        byte[] bArr = this.f47574e;
        return size + (bArr == null ? 0 : bArr.length);
    }

    private int c(boolean z11, int i11) {
        if (!z11 || (i11 >= 32 && i11 <= 128 && (i11 & 15) == 0)) {
            return i11 >>> 3;
        }
        throw new IllegalArgumentException("tag length in octets must be one of {4,6,8,10,12,14,16}");
    }

    private boolean d() {
        return b() > 0;
    }

    @Override // q50.b
    public int doFinal(byte[] bArr, int i11) {
        int f11 = f(this.f47579j.a(), 0, this.f47579j.size(), bArr, i11);
        g();
        return f11;
    }

    public void e(byte b11) {
        this.f47578i.write(b11);
    }

    public int f(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int i14;
        if (this.f47576g == null) {
            throw new IllegalStateException("CCM cipher unitialized.");
        }
        byte[] bArr3 = this.f47573d;
        int length = 15 - bArr3.length;
        if (length < 4 && i12 >= (1 << (length * 8))) {
            throw new IllegalStateException("CCM packet too large for choice of q.");
        }
        byte[] bArr4 = new byte[this.f47571b];
        bArr4[0] = (byte) ((length - 1) & 7);
        System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
        y yVar = new y(this.f47570a);
        yVar.init(this.f47572c, new f1(this.f47576g, bArr4));
        if (!this.f47572c) {
            int i15 = this.f47575f;
            if (i12 >= i15) {
                int i16 = i12 - i15;
                if (bArr2.length >= i16 + i13) {
                    int i17 = i11 + i16;
                    System.arraycopy(bArr, i17, this.f47577h, 0, i15);
                    byte[] bArr5 = this.f47577h;
                    yVar.processBlock(bArr5, 0, bArr5, 0);
                    int i18 = this.f47575f;
                    while (true) {
                        byte[] bArr6 = this.f47577h;
                        if (i18 == bArr6.length) {
                            break;
                        }
                        bArr6[i18] = 0;
                        i18++;
                    }
                    int i19 = i11;
                    int i21 = i13;
                    while (true) {
                        i14 = this.f47571b;
                        if (i19 >= i17 - i14) {
                            break;
                        }
                        yVar.processBlock(bArr, i19, bArr2, i21);
                        int i22 = this.f47571b;
                        i21 += i22;
                        i19 += i22;
                    }
                    byte[] bArr7 = new byte[i14];
                    int i23 = i16 - (i19 - i11);
                    System.arraycopy(bArr, i19, bArr7, 0, i23);
                    yVar.processBlock(bArr7, 0, bArr7, 0);
                    System.arraycopy(bArr7, 0, bArr2, i21, i23);
                    byte[] bArr8 = new byte[this.f47571b];
                    a(bArr2, i13, i16, bArr8);
                    if (org.bouncycastle.util.a.u(this.f47577h, bArr8)) {
                        return i16;
                    }
                    throw new InvalidCipherTextException("mac check in CCM failed");
                }
                throw new OutputLengthException("Output buffer too short.");
            }
            throw new InvalidCipherTextException("data too short");
        }
        int i24 = this.f47575f + i12;
        if (bArr2.length < i24 + i13) {
            throw new OutputLengthException("Output buffer too short.");
        }
        a(bArr, i11, i12, this.f47577h);
        byte[] bArr9 = new byte[this.f47571b];
        yVar.processBlock(this.f47577h, 0, bArr9, 0);
        int i25 = i11;
        int i26 = i13;
        while (true) {
            int i27 = i11 + i12;
            int i28 = this.f47571b;
            if (i25 >= i27 - i28) {
                byte[] bArr10 = new byte[i28];
                int i29 = i27 - i25;
                System.arraycopy(bArr, i25, bArr10, 0, i29);
                yVar.processBlock(bArr10, 0, bArr10, 0);
                System.arraycopy(bArr10, 0, bArr2, i26, i29);
                System.arraycopy(bArr9, 0, bArr2, i13 + i12, this.f47575f);
                return i24;
            }
            yVar.processBlock(bArr, i25, bArr2, i26);
            int i31 = this.f47571b;
            i26 += i31;
            i25 += i31;
        }
    }

    public void g() {
        this.f47570a.reset();
        this.f47578i.reset();
        this.f47579j.reset();
    }

    @Override // q50.b
    public String getAlgorithmName() {
        return this.f47570a.getAlgorithmName() + "/CCM";
    }

    @Override // q50.b
    public byte[] getMac() {
        int i11 = this.f47575f;
        byte[] bArr = new byte[i11];
        System.arraycopy(this.f47577h, 0, bArr, 0, i11);
        return bArr;
    }

    @Override // q50.b
    public int getOutputSize(int i11) {
        int size = i11 + this.f47579j.size();
        if (this.f47572c) {
            return size + this.f47575f;
        }
        int i12 = this.f47575f;
        if (size < i12) {
            return 0;
        }
        return size - i12;
    }

    @Override // q50.a
    public org.bouncycastle.crypto.e getUnderlyingCipher() {
        return this.f47570a;
    }

    @Override // q50.b
    public int getUpdateOutputSize(int i11) {
        return 0;
    }

    @Override // q50.b
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.i b11;
        this.f47572c = z11;
        if (iVar instanceof u50.a) {
            u50.a aVar = (u50.a) iVar;
            this.f47573d = aVar.d();
            this.f47574e = aVar.a();
            this.f47575f = c(z11, aVar.c());
            b11 = aVar.b();
        } else if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("invalid parameters passed to CCM: " + iVar.getClass().getName());
        } else {
            f1 f1Var = (f1) iVar;
            this.f47573d = f1Var.a();
            this.f47574e = null;
            this.f47575f = c(z11, 64);
            b11 = f1Var.b();
        }
        if (b11 != null) {
            this.f47576g = b11;
        }
        byte[] bArr = this.f47573d;
        if (bArr == null || bArr.length < 7 || bArr.length > 13) {
            throw new IllegalArgumentException("nonce must have length from 7 to 13 octets");
        }
        g();
    }

    @Override // q50.b
    public void processAADBytes(byte[] bArr, int i11, int i12) {
        this.f47578i.write(bArr, i11, i12);
    }

    @Override // q50.b
    public int processByte(byte b11, byte[] bArr, int i11) {
        this.f47579j.write(b11);
        return 0;
    }

    @Override // q50.b
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (bArr.length >= i11 + i12) {
            this.f47579j.write(bArr, i11, i12);
            return 0;
        }
        throw new DataLengthException("Input buffer too short");
    }
}