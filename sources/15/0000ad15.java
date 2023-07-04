package q50;

import java.util.Vector;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import u50.b1;
import u50.f1;

/* loaded from: classes5.dex */
public class u implements a {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.crypto.e f47735a;

    /* renamed from: b  reason: collision with root package name */
    private org.bouncycastle.crypto.e f47736b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f47737c;

    /* renamed from: d  reason: collision with root package name */
    private int f47738d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f47739e;

    /* renamed from: f  reason: collision with root package name */
    private Vector f47740f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f47741g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f47742h;

    /* renamed from: l  reason: collision with root package name */
    private byte[] f47746l;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f47747m;

    /* renamed from: n  reason: collision with root package name */
    private int f47748n;

    /* renamed from: o  reason: collision with root package name */
    private int f47749o;

    /* renamed from: p  reason: collision with root package name */
    private long f47750p;

    /* renamed from: q  reason: collision with root package name */
    private long f47751q;

    /* renamed from: r  reason: collision with root package name */
    private byte[] f47752r;

    /* renamed from: s  reason: collision with root package name */
    private byte[] f47753s;

    /* renamed from: u  reason: collision with root package name */
    private byte[] f47755u;

    /* renamed from: v  reason: collision with root package name */
    private byte[] f47756v;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f47743i = null;

    /* renamed from: j  reason: collision with root package name */
    private byte[] f47744j = new byte[24];

    /* renamed from: k  reason: collision with root package name */
    private byte[] f47745k = new byte[16];

    /* renamed from: t  reason: collision with root package name */
    private byte[] f47754t = new byte[16];

    public u(org.bouncycastle.crypto.e eVar, org.bouncycastle.crypto.e eVar2) {
        if (eVar == null) {
            throw new IllegalArgumentException("'hashCipher' cannot be null");
        }
        if (eVar.getBlockSize() != 16) {
            throw new IllegalArgumentException("'hashCipher' must have a block size of 16");
        }
        if (eVar2 == null) {
            throw new IllegalArgumentException("'mainCipher' cannot be null");
        }
        if (eVar2.getBlockSize() != 16) {
            throw new IllegalArgumentException("'mainCipher' must have a block size of 16");
        }
        if (!eVar.getAlgorithmName().equals(eVar2.getAlgorithmName())) {
            throw new IllegalArgumentException("'hashCipher' and 'mainCipher' must be the same algorithm");
        }
        this.f47735a = eVar;
        this.f47736b = eVar2;
    }

    protected static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) ((135 >>> ((1 - j(bArr, bArr2)) << 3)) ^ bArr2[15]);
        return bArr2;
    }

    protected static void b(byte[] bArr, int i11) {
        bArr[i11] = Byte.MIN_VALUE;
        while (true) {
            i11++;
            if (i11 >= 16) {
                return;
            }
            bArr[i11] = 0;
        }
    }

    protected static int c(long j11) {
        if (j11 == 0) {
            return 64;
        }
        int i11 = 0;
        while ((1 & j11) == 0) {
            i11++;
            j11 >>>= 1;
        }
        return i11;
    }

    protected static int j(byte[] bArr, byte[] bArr2) {
        int i11 = 16;
        int i12 = 0;
        while (true) {
            i11--;
            if (i11 < 0) {
                return i12;
            }
            int i13 = bArr[i11] & 255;
            bArr2[i11] = (byte) (i12 | (i13 << 1));
            i12 = (i13 >>> 7) & 1;
        }
    }

    protected static void l(byte[] bArr, byte[] bArr2) {
        for (int i11 = 15; i11 >= 0; i11--) {
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
        }
    }

    protected void d(byte[] bArr) {
        if (bArr != null) {
            org.bouncycastle.util.a.y(bArr, (byte) 0);
        }
    }

    @Override // q50.b
    public int doFinal(byte[] bArr, int i11) {
        byte[] bArr2;
        if (this.f47737c) {
            bArr2 = null;
        } else {
            int i12 = this.f47749o;
            int i13 = this.f47738d;
            if (i12 < i13) {
                throw new InvalidCipherTextException("data too short");
            }
            int i14 = i12 - i13;
            this.f47749o = i14;
            bArr2 = new byte[i13];
            System.arraycopy(this.f47747m, i14, bArr2, 0, i13);
        }
        int i15 = this.f47748n;
        if (i15 > 0) {
            b(this.f47746l, i15);
            k(this.f47741g);
        }
        int i16 = this.f47749o;
        if (i16 > 0) {
            if (this.f47737c) {
                b(this.f47747m, i16);
                l(this.f47755u, this.f47747m);
            }
            l(this.f47754t, this.f47741g);
            byte[] bArr3 = new byte[16];
            this.f47735a.processBlock(this.f47754t, 0, bArr3, 0);
            l(this.f47747m, bArr3);
            int length = bArr.length;
            int i17 = this.f47749o;
            if (length < i11 + i17) {
                throw new OutputLengthException("Output buffer too short");
            }
            System.arraycopy(this.f47747m, 0, bArr, i11, i17);
            if (!this.f47737c) {
                b(this.f47747m, this.f47749o);
                l(this.f47755u, this.f47747m);
            }
        }
        l(this.f47755u, this.f47754t);
        l(this.f47755u, this.f47742h);
        org.bouncycastle.crypto.e eVar = this.f47735a;
        byte[] bArr4 = this.f47755u;
        eVar.processBlock(bArr4, 0, bArr4, 0);
        l(this.f47755u, this.f47753s);
        int i18 = this.f47738d;
        byte[] bArr5 = new byte[i18];
        this.f47756v = bArr5;
        System.arraycopy(this.f47755u, 0, bArr5, 0, i18);
        int i19 = this.f47749o;
        if (this.f47737c) {
            int length2 = bArr.length;
            int i21 = i11 + i19;
            int i22 = this.f47738d;
            if (length2 < i21 + i22) {
                throw new OutputLengthException("Output buffer too short");
            }
            System.arraycopy(this.f47756v, 0, bArr, i21, i22);
            i19 += this.f47738d;
        } else if (!org.bouncycastle.util.a.u(this.f47756v, bArr2)) {
            throw new InvalidCipherTextException("mac check in OCB failed");
        }
        i(false);
        return i19;
    }

    protected byte[] e(int i11) {
        while (i11 >= this.f47740f.size()) {
            Vector vector = this.f47740f;
            vector.addElement(a((byte[]) vector.lastElement()));
        }
        return (byte[]) this.f47740f.elementAt(i11);
    }

    protected void f() {
        long j11 = this.f47750p + 1;
        this.f47750p = j11;
        k(e(c(j11)));
        this.f47748n = 0;
    }

    protected void g(byte[] bArr, int i11) {
        if (bArr.length < i11 + 16) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.f47737c) {
            l(this.f47755u, this.f47747m);
            this.f47749o = 0;
        }
        byte[] bArr2 = this.f47754t;
        long j11 = this.f47751q + 1;
        this.f47751q = j11;
        l(bArr2, e(c(j11)));
        l(this.f47747m, this.f47754t);
        org.bouncycastle.crypto.e eVar = this.f47736b;
        byte[] bArr3 = this.f47747m;
        eVar.processBlock(bArr3, 0, bArr3, 0);
        l(this.f47747m, this.f47754t);
        System.arraycopy(this.f47747m, 0, bArr, i11, 16);
        if (this.f47737c) {
            return;
        }
        l(this.f47755u, this.f47747m);
        byte[] bArr4 = this.f47747m;
        System.arraycopy(bArr4, 16, bArr4, 0, this.f47738d);
        this.f47749o = this.f47738d;
    }

    @Override // q50.b
    public String getAlgorithmName() {
        return this.f47736b.getAlgorithmName() + "/OCB";
    }

    @Override // q50.b
    public byte[] getMac() {
        byte[] bArr = this.f47756v;
        return bArr == null ? new byte[this.f47738d] : org.bouncycastle.util.a.h(bArr);
    }

    @Override // q50.b
    public int getOutputSize(int i11) {
        int i12 = i11 + this.f47749o;
        if (this.f47737c) {
            return i12 + this.f47738d;
        }
        int i13 = this.f47738d;
        if (i12 < i13) {
            return 0;
        }
        return i12 - i13;
    }

    @Override // q50.a
    public org.bouncycastle.crypto.e getUnderlyingCipher() {
        return this.f47736b;
    }

    @Override // q50.b
    public int getUpdateOutputSize(int i11) {
        int i12 = i11 + this.f47749o;
        if (!this.f47737c) {
            int i13 = this.f47738d;
            if (i12 < i13) {
                return 0;
            }
            i12 -= i13;
        }
        return i12 - (i12 % 16);
    }

    protected int h(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i11 = 0;
        System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
        bArr2[0] = (byte) (this.f47738d << 4);
        int length = 15 - bArr.length;
        bArr2[length] = (byte) (bArr2[length] | 1);
        int i12 = bArr2[15] & 63;
        bArr2[15] = (byte) (bArr2[15] & 192);
        byte[] bArr3 = this.f47743i;
        if (bArr3 == null || !org.bouncycastle.util.a.c(bArr2, bArr3)) {
            byte[] bArr4 = new byte[16];
            this.f47743i = bArr2;
            this.f47735a.processBlock(bArr2, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, this.f47744j, 0, 16);
            while (i11 < 8) {
                byte[] bArr5 = this.f47744j;
                int i13 = i11 + 16;
                byte b11 = bArr4[i11];
                i11++;
                bArr5[i13] = (byte) (b11 ^ bArr4[i11]);
            }
        }
        return i12;
    }

    protected void i(boolean z11) {
        this.f47735a.reset();
        this.f47736b.reset();
        d(this.f47746l);
        d(this.f47747m);
        this.f47748n = 0;
        this.f47749o = 0;
        this.f47750p = 0L;
        this.f47751q = 0L;
        d(this.f47752r);
        d(this.f47753s);
        System.arraycopy(this.f47745k, 0, this.f47754t, 0, 16);
        d(this.f47755u);
        if (z11) {
            this.f47756v = null;
        }
        byte[] bArr = this.f47739e;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    @Override // q50.b
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        byte[] a11;
        b1 b1Var;
        boolean z12 = this.f47737c;
        this.f47737c = z11;
        this.f47756v = null;
        if (iVar instanceof u50.a) {
            u50.a aVar = (u50.a) iVar;
            a11 = aVar.d();
            this.f47739e = aVar.a();
            int c11 = aVar.c();
            if (c11 < 64 || c11 > 128 || c11 % 8 != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + c11);
            }
            this.f47738d = c11 / 8;
            b1Var = aVar.b();
        } else if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("invalid parameters passed to OCB");
        } else {
            f1 f1Var = (f1) iVar;
            a11 = f1Var.a();
            this.f47739e = null;
            this.f47738d = 16;
            b1Var = (b1) f1Var.b();
        }
        this.f47746l = new byte[16];
        this.f47747m = new byte[z11 ? 16 : this.f47738d + 16];
        if (a11 == null) {
            a11 = new byte[0];
        }
        if (a11.length > 15) {
            throw new IllegalArgumentException("IV must be no more than 15 bytes");
        }
        if (b1Var != null) {
            this.f47735a.init(true, b1Var);
            this.f47736b.init(z11, b1Var);
            this.f47743i = null;
        } else if (z12 != z11) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
        byte[] bArr = new byte[16];
        this.f47741g = bArr;
        this.f47735a.processBlock(bArr, 0, bArr, 0);
        this.f47742h = a(this.f47741g);
        Vector vector = new Vector();
        this.f47740f = vector;
        vector.addElement(a(this.f47742h));
        int h11 = h(a11);
        int i11 = h11 % 8;
        int i12 = h11 / 8;
        if (i11 == 0) {
            System.arraycopy(this.f47744j, i12, this.f47745k, 0, 16);
        } else {
            for (int i13 = 0; i13 < 16; i13++) {
                byte[] bArr2 = this.f47744j;
                i12++;
                this.f47745k[i13] = (byte) (((bArr2[i12] & 255) >>> (8 - i11)) | ((bArr2[i12] & 255) << i11));
            }
        }
        this.f47748n = 0;
        this.f47749o = 0;
        this.f47750p = 0L;
        this.f47751q = 0L;
        this.f47752r = new byte[16];
        this.f47753s = new byte[16];
        System.arraycopy(this.f47745k, 0, this.f47754t, 0, 16);
        this.f47755u = new byte[16];
        byte[] bArr3 = this.f47739e;
        if (bArr3 != null) {
            processAADBytes(bArr3, 0, bArr3.length);
        }
    }

    protected void k(byte[] bArr) {
        l(this.f47752r, bArr);
        l(this.f47746l, this.f47752r);
        org.bouncycastle.crypto.e eVar = this.f47735a;
        byte[] bArr2 = this.f47746l;
        eVar.processBlock(bArr2, 0, bArr2, 0);
        l(this.f47753s, this.f47746l);
    }

    @Override // q50.b
    public void processAADBytes(byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            byte[] bArr2 = this.f47746l;
            int i14 = this.f47748n;
            bArr2[i14] = bArr[i11 + i13];
            int i15 = i14 + 1;
            this.f47748n = i15;
            if (i15 == bArr2.length) {
                f();
            }
        }
    }

    @Override // q50.b
    public int processByte(byte b11, byte[] bArr, int i11) {
        byte[] bArr2 = this.f47747m;
        int i12 = this.f47749o;
        bArr2[i12] = b11;
        int i13 = i12 + 1;
        this.f47749o = i13;
        if (i13 == bArr2.length) {
            g(bArr, i11);
            return 16;
        }
        return 0;
    }

    @Override // q50.b
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (bArr.length >= i11 + i12) {
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                byte[] bArr3 = this.f47747m;
                int i16 = this.f47749o;
                bArr3[i16] = bArr[i11 + i15];
                int i17 = i16 + 1;
                this.f47749o = i17;
                if (i17 == bArr3.length) {
                    g(bArr2, i13 + i14);
                    i14 += 16;
                }
            }
            return i14;
        }
        throw new DataLengthException("Input buffer too short");
    }
}