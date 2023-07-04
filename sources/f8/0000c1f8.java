package y50;

import java.security.SecureRandom;
import org.bouncycastle.crypto.d0;
import org.bouncycastle.crypto.z;
import u50.g1;
import u50.l1;
import u50.n1;

/* loaded from: classes5.dex */
public class o implements z {

    /* renamed from: g  reason: collision with root package name */
    private org.bouncycastle.crypto.p f59184g;

    /* renamed from: h  reason: collision with root package name */
    private org.bouncycastle.crypto.p f59185h;

    /* renamed from: i  reason: collision with root package name */
    private org.bouncycastle.crypto.a f59186i;

    /* renamed from: j  reason: collision with root package name */
    private SecureRandom f59187j;

    /* renamed from: k  reason: collision with root package name */
    private int f59188k;

    /* renamed from: l  reason: collision with root package name */
    private int f59189l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f59190m = false;

    /* renamed from: n  reason: collision with root package name */
    private int f59191n;

    /* renamed from: o  reason: collision with root package name */
    private int f59192o;

    /* renamed from: p  reason: collision with root package name */
    private byte[] f59193p;

    /* renamed from: q  reason: collision with root package name */
    private byte[] f59194q;

    /* renamed from: r  reason: collision with root package name */
    private byte[] f59195r;

    /* renamed from: s  reason: collision with root package name */
    private byte f59196s;

    public o(org.bouncycastle.crypto.a aVar, org.bouncycastle.crypto.p pVar, org.bouncycastle.crypto.p pVar2, int i11, byte b11) {
        this.f59186i = aVar;
        this.f59184g = pVar;
        this.f59185h = pVar2;
        this.f59188k = pVar.getDigestSize();
        this.f59189l = pVar2.getDigestSize();
        this.f59191n = i11;
        this.f59193p = new byte[i11];
        this.f59194q = new byte[i11 + 8 + this.f59188k];
        this.f59196s = b11;
    }

    private void a(int i11, byte[] bArr) {
        bArr[0] = (byte) (i11 >>> 24);
        bArr[1] = (byte) (i11 >>> 16);
        bArr[2] = (byte) (i11 >>> 8);
        bArr[3] = (byte) (i11 >>> 0);
    }

    private void b(byte[] bArr) {
        for (int i11 = 0; i11 != bArr.length; i11++) {
            bArr[i11] = 0;
        }
    }

    private byte[] c(byte[] bArr, int i11, int i12, int i13) {
        org.bouncycastle.crypto.p pVar = this.f59185h;
        if (pVar instanceof d0) {
            byte[] bArr2 = new byte[i13];
            pVar.update(bArr, i11, i12);
            ((d0) this.f59185h).doFinal(bArr2, 0, i13);
            return bArr2;
        }
        return d(bArr, i11, i12, i13);
    }

    private byte[] d(byte[] bArr, int i11, int i12, int i13) {
        int i14;
        byte[] bArr2 = new byte[i13];
        byte[] bArr3 = new byte[this.f59189l];
        byte[] bArr4 = new byte[4];
        this.f59185h.reset();
        int i15 = 0;
        while (true) {
            i14 = this.f59189l;
            if (i15 >= i13 / i14) {
                break;
            }
            a(i15, bArr4);
            this.f59185h.update(bArr, i11, i12);
            this.f59185h.update(bArr4, 0, 4);
            this.f59185h.doFinal(bArr3, 0);
            int i16 = this.f59189l;
            System.arraycopy(bArr3, 0, bArr2, i15 * i16, i16);
            i15++;
        }
        if (i14 * i15 < i13) {
            a(i15, bArr4);
            this.f59185h.update(bArr, i11, i12);
            this.f59185h.update(bArr4, 0, 4);
            this.f59185h.doFinal(bArr3, 0);
            int i17 = this.f59189l;
            System.arraycopy(bArr3, 0, bArr2, i15 * i17, i13 - (i15 * i17));
        }
        return bArr2;
    }

    public void e() {
        this.f59184g.reset();
    }

    @Override // org.bouncycastle.crypto.z
    public byte[] generateSignature() {
        org.bouncycastle.crypto.p pVar = this.f59184g;
        byte[] bArr = this.f59194q;
        pVar.doFinal(bArr, (bArr.length - this.f59188k) - this.f59191n);
        if (this.f59191n != 0) {
            if (!this.f59190m) {
                this.f59187j.nextBytes(this.f59193p);
            }
            byte[] bArr2 = this.f59193p;
            byte[] bArr3 = this.f59194q;
            int length = bArr3.length;
            int i11 = this.f59191n;
            System.arraycopy(bArr2, 0, bArr3, length - i11, i11);
        }
        int i12 = this.f59188k;
        byte[] bArr4 = new byte[i12];
        org.bouncycastle.crypto.p pVar2 = this.f59184g;
        byte[] bArr5 = this.f59194q;
        pVar2.update(bArr5, 0, bArr5.length);
        this.f59184g.doFinal(bArr4, 0);
        byte[] bArr6 = this.f59195r;
        int length2 = bArr6.length;
        int i13 = this.f59191n;
        int i14 = this.f59188k;
        bArr6[(((length2 - i13) - 1) - i14) - 1] = 1;
        System.arraycopy(this.f59193p, 0, bArr6, ((bArr6.length - i13) - i14) - 1, i13);
        byte[] c11 = c(bArr4, 0, i12, (this.f59195r.length - this.f59188k) - 1);
        for (int i15 = 0; i15 != c11.length; i15++) {
            byte[] bArr7 = this.f59195r;
            bArr7[i15] = (byte) (bArr7[i15] ^ c11[i15]);
        }
        byte[] bArr8 = this.f59195r;
        int length3 = bArr8.length;
        int i16 = this.f59188k;
        System.arraycopy(bArr4, 0, bArr8, (length3 - i16) - 1, i16);
        byte[] bArr9 = this.f59195r;
        bArr9[0] = (byte) ((255 >>> ((bArr9.length * 8) - this.f59192o)) & bArr9[0]);
        bArr9[bArr9.length - 1] = this.f59196s;
        byte[] processBlock = this.f59186i.processBlock(bArr9, 0, bArr9.length);
        b(this.f59195r);
        return processBlock;
    }

    @Override // org.bouncycastle.crypto.z
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.i iVar2;
        n1 n1Var;
        if (iVar instanceof g1) {
            g1 g1Var = (g1) iVar;
            iVar2 = g1Var.a();
            this.f59187j = g1Var.b();
        } else {
            if (z11) {
                this.f59187j = org.bouncycastle.crypto.k.b();
            }
            iVar2 = iVar;
        }
        if (iVar2 instanceof l1) {
            n1Var = ((l1) iVar2).a();
            this.f59186i.init(z11, iVar);
        } else {
            n1Var = (n1) iVar2;
            this.f59186i.init(z11, iVar2);
        }
        int bitLength = n1Var.c().bitLength() - 1;
        this.f59192o = bitLength;
        if (bitLength < (this.f59188k * 8) + (this.f59191n * 8) + 9) {
            throw new IllegalArgumentException("key too small for specified hash and salt lengths");
        }
        this.f59195r = new byte[(bitLength + 7) / 8];
        e();
    }

    @Override // org.bouncycastle.crypto.z
    public void update(byte b11) {
        this.f59184g.update(b11);
    }

    @Override // org.bouncycastle.crypto.z
    public void update(byte[] bArr, int i11, int i12) {
        this.f59184g.update(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.z
    public boolean verifySignature(byte[] bArr) {
        byte[] bArr2;
        int length;
        org.bouncycastle.crypto.p pVar = this.f59184g;
        byte[] bArr3 = this.f59194q;
        pVar.doFinal(bArr3, (bArr3.length - this.f59188k) - this.f59191n);
        try {
            byte[] processBlock = this.f59186i.processBlock(bArr, 0, bArr.length);
            byte[] bArr4 = this.f59195r;
            org.bouncycastle.util.a.z(bArr4, 0, bArr4.length - processBlock.length, (byte) 0);
            byte[] bArr5 = this.f59195r;
            System.arraycopy(processBlock, 0, bArr5, bArr5.length - processBlock.length, processBlock.length);
            bArr2 = this.f59195r;
            length = 255 >>> ((bArr2.length * 8) - this.f59192o);
        } catch (Exception unused) {
        }
        if ((255 & bArr2[0]) != (bArr2[0] & length) || bArr2[bArr2.length - 1] != this.f59196s) {
            b(bArr2);
            return false;
        }
        int length2 = bArr2.length;
        int i11 = this.f59188k;
        byte[] c11 = c(bArr2, (length2 - i11) - 1, i11, (bArr2.length - i11) - 1);
        for (int i12 = 0; i12 != c11.length; i12++) {
            byte[] bArr6 = this.f59195r;
            bArr6[i12] = (byte) (bArr6[i12] ^ c11[i12]);
        }
        byte[] bArr7 = this.f59195r;
        bArr7[0] = (byte) (length & bArr7[0]);
        int i13 = 0;
        while (true) {
            byte[] bArr8 = this.f59195r;
            int length3 = bArr8.length;
            int i14 = this.f59188k;
            int i15 = this.f59191n;
            if (i13 != ((length3 - i14) - i15) - 2) {
                if (bArr8[i13] != 0) {
                    b(bArr8);
                    return false;
                }
                i13++;
            } else if (bArr8[((bArr8.length - i14) - i15) - 2] != 1) {
                b(bArr8);
                return false;
            } else {
                if (this.f59190m) {
                    byte[] bArr9 = this.f59193p;
                    byte[] bArr10 = this.f59194q;
                    System.arraycopy(bArr9, 0, bArr10, bArr10.length - i15, i15);
                } else {
                    byte[] bArr11 = this.f59194q;
                    System.arraycopy(bArr8, ((bArr8.length - i15) - i14) - 1, bArr11, bArr11.length - i15, i15);
                }
                org.bouncycastle.crypto.p pVar2 = this.f59184g;
                byte[] bArr12 = this.f59194q;
                pVar2.update(bArr12, 0, bArr12.length);
                org.bouncycastle.crypto.p pVar3 = this.f59184g;
                byte[] bArr13 = this.f59194q;
                pVar3.doFinal(bArr13, bArr13.length - this.f59188k);
                int length4 = this.f59195r.length;
                int i16 = this.f59188k;
                int i17 = (length4 - i16) - 1;
                int length5 = this.f59194q.length - i16;
                while (true) {
                    byte[] bArr14 = this.f59194q;
                    if (length5 == bArr14.length) {
                        b(bArr14);
                        b(this.f59195r);
                        return true;
                    } else if ((this.f59195r[i17] ^ bArr14[length5]) != 0) {
                        b(bArr14);
                        b(this.f59195r);
                        return false;
                    } else {
                        i17++;
                        length5++;
                    }
                }
            }
        }
    }
}