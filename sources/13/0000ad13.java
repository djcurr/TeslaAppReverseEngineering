package q50;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import u50.b1;
import u50.f1;

/* loaded from: classes5.dex */
public class t implements q50.a {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.crypto.e f47723a;

    /* renamed from: b  reason: collision with root package name */
    private org.bouncycastle.crypto.f f47724b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f47726d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f47727e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f47728f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f47729g;

    /* renamed from: h  reason: collision with root package name */
    private s50.a f47730h;

    /* renamed from: i  reason: collision with root package name */
    private long[] f47731i;

    /* renamed from: j  reason: collision with root package name */
    private final int f47732j;

    /* renamed from: k  reason: collision with root package name */
    private a f47733k = new a(this);

    /* renamed from: l  reason: collision with root package name */
    private a f47734l = new a(this);

    /* renamed from: c  reason: collision with root package name */
    private int f47725c = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class a extends ByteArrayOutputStream {
        public a(t tVar) {
        }

        public byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public t(org.bouncycastle.crypto.e eVar) {
        this.f47723a = eVar;
        this.f47724b = new org.bouncycastle.crypto.f(new s(eVar));
        int blockSize = this.f47723a.getBlockSize();
        this.f47732j = blockSize;
        this.f47727e = new byte[blockSize];
        this.f47729g = new byte[blockSize];
        this.f47730h = b(blockSize);
        this.f47731i = new long[blockSize >>> 3];
        this.f47728f = null;
    }

    private void a(byte[] bArr, int i11, int i12, int i13) {
        int i14 = i11 + i12;
        while (i11 < i14) {
            f(this.f47731i, bArr, i11);
            this.f47730h.b(this.f47731i);
            i11 += this.f47732j;
        }
        long[] jArr = this.f47731i;
        jArr[0] = ((i13 & 4294967295L) << 3) ^ jArr[0];
        int i15 = this.f47732j >>> 4;
        jArr[i15] = jArr[i15] ^ ((4294967295L & i12) << 3);
        byte[] z11 = r70.i.z(jArr);
        this.f47728f = z11;
        this.f47723a.processBlock(z11, 0, z11, 0);
    }

    private static s50.a b(int i11) {
        if (i11 != 16) {
            if (i11 != 32) {
                if (i11 == 64) {
                    return new s50.e();
                }
                throw new IllegalArgumentException("Only 128, 256, and 512 -bit block sizes supported");
            }
            return new s50.g();
        }
        return new s50.f();
    }

    private void c(byte[] bArr, int i11, int i12) {
        int i13 = i12 + i11;
        while (i11 < i13) {
            f(this.f47731i, bArr, i11);
            this.f47730h.b(this.f47731i);
            i11 += this.f47732j;
        }
    }

    private static void f(long[] jArr, byte[] bArr, int i11) {
        for (int i12 = 0; i12 < jArr.length; i12++) {
            jArr[i12] = jArr[i12] ^ r70.i.p(bArr, i11);
            i11 += 8;
        }
    }

    public void d(byte b11) {
        this.f47733k.write(b11);
    }

    @Override // q50.b
    public int doFinal(byte[] bArr, int i11) {
        int a11;
        int size = this.f47734l.size();
        if (this.f47726d || size >= this.f47725c) {
            byte[] bArr2 = new byte[this.f47732j];
            this.f47723a.processBlock(bArr2, 0, bArr2, 0);
            long[] jArr = new long[this.f47732j >>> 3];
            r70.i.q(bArr2, 0, jArr);
            this.f47730h.a(jArr);
            org.bouncycastle.util.a.y(bArr2, (byte) 0);
            org.bouncycastle.util.a.C(jArr, 0L);
            int size2 = this.f47733k.size();
            if (size2 > 0) {
                c(this.f47733k.a(), 0, size2);
            }
            if (!this.f47726d) {
                int i12 = size - this.f47725c;
                if (bArr.length - i11 < i12) {
                    throw new OutputLengthException("Output buffer too short");
                }
                a(this.f47734l.a(), 0, i12, size2);
                int h11 = this.f47724b.h(this.f47734l.a(), 0, i12, bArr, i11);
                a11 = h11 + this.f47724b.a(bArr, i11 + h11);
            } else if ((bArr.length - i11) - this.f47725c < size) {
                throw new OutputLengthException("Output buffer too short");
            } else {
                int h12 = this.f47724b.h(this.f47734l.a(), 0, size, bArr, i11);
                a11 = h12 + this.f47724b.a(bArr, i11 + h12);
                a(bArr, i11, size, size2);
            }
            byte[] bArr3 = this.f47728f;
            if (bArr3 != null) {
                if (this.f47726d) {
                    System.arraycopy(bArr3, 0, bArr, i11 + a11, this.f47725c);
                    e();
                    return a11 + this.f47725c;
                }
                byte[] bArr4 = new byte[this.f47725c];
                byte[] a12 = this.f47734l.a();
                int i13 = this.f47725c;
                System.arraycopy(a12, size - i13, bArr4, 0, i13);
                int i14 = this.f47725c;
                byte[] bArr5 = new byte[i14];
                System.arraycopy(this.f47728f, 0, bArr5, 0, i14);
                if (org.bouncycastle.util.a.u(bArr4, bArr5)) {
                    e();
                    return a11;
                }
                throw new InvalidCipherTextException("mac verification failed");
            }
            throw new IllegalStateException("mac is not calculated");
        }
        throw new InvalidCipherTextException("data too short");
    }

    public void e() {
        org.bouncycastle.util.a.C(this.f47731i, 0L);
        this.f47723a.reset();
        this.f47734l.reset();
        this.f47733k.reset();
        byte[] bArr = this.f47727e;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    @Override // q50.b
    public String getAlgorithmName() {
        return this.f47723a.getAlgorithmName() + "/KGCM";
    }

    @Override // q50.b
    public byte[] getMac() {
        int i11 = this.f47725c;
        byte[] bArr = new byte[i11];
        System.arraycopy(this.f47728f, 0, bArr, 0, i11);
        return bArr;
    }

    @Override // q50.b
    public int getOutputSize(int i11) {
        int size = i11 + this.f47734l.size();
        if (this.f47726d) {
            return size + this.f47725c;
        }
        int i12 = this.f47725c;
        if (size < i12) {
            return 0;
        }
        return size - i12;
    }

    @Override // q50.a
    public org.bouncycastle.crypto.e getUnderlyingCipher() {
        return this.f47723a;
    }

    @Override // q50.b
    public int getUpdateOutputSize(int i11) {
        return 0;
    }

    @Override // q50.b
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        b1 b1Var;
        this.f47726d = z11;
        if (iVar instanceof u50.a) {
            u50.a aVar = (u50.a) iVar;
            byte[] d11 = aVar.d();
            byte[] bArr = this.f47729g;
            org.bouncycastle.util.a.y(bArr, (byte) 0);
            System.arraycopy(d11, 0, this.f47729g, bArr.length - d11.length, d11.length);
            this.f47727e = aVar.a();
            int c11 = aVar.c();
            if (c11 < 64 || c11 > (this.f47732j << 3) || (c11 & 7) != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + c11);
            }
            this.f47725c = c11 >>> 3;
            b1Var = aVar.b();
            byte[] bArr2 = this.f47727e;
            if (bArr2 != null) {
                processAADBytes(bArr2, 0, bArr2.length);
            }
        } else if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("Invalid parameter passed");
        } else {
            f1 f1Var = (f1) iVar;
            byte[] a11 = f1Var.a();
            byte[] bArr3 = this.f47729g;
            org.bouncycastle.util.a.y(bArr3, (byte) 0);
            System.arraycopy(a11, 0, this.f47729g, bArr3.length - a11.length, a11.length);
            this.f47727e = null;
            this.f47725c = this.f47732j;
            b1Var = (b1) f1Var.b();
        }
        this.f47728f = new byte[this.f47732j];
        this.f47724b.f(true, new f1(b1Var, this.f47729g));
        this.f47723a.init(true, b1Var);
    }

    @Override // q50.b
    public void processAADBytes(byte[] bArr, int i11, int i12) {
        this.f47733k.write(bArr, i11, i12);
    }

    @Override // q50.b
    public int processByte(byte b11, byte[] bArr, int i11) {
        this.f47734l.write(b11);
        return 0;
    }

    @Override // q50.b
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (bArr.length >= i11 + i12) {
            this.f47734l.write(bArr, i11, i12);
            return 0;
        }
        throw new DataLengthException("input buffer too short");
    }
}