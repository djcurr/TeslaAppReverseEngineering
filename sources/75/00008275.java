package l50;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: classes5.dex */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    org.bouncycastle.crypto.d f36685a;

    /* renamed from: b  reason: collision with root package name */
    org.bouncycastle.crypto.n f36686b;

    /* renamed from: c  reason: collision with root package name */
    org.bouncycastle.crypto.v f36687c;

    /* renamed from: d  reason: collision with root package name */
    org.bouncycastle.crypto.f f36688d;

    /* renamed from: e  reason: collision with root package name */
    boolean f36689e;

    /* renamed from: f  reason: collision with root package name */
    org.bouncycastle.crypto.i f36690f;

    /* renamed from: g  reason: collision with root package name */
    org.bouncycastle.crypto.i f36691g;

    /* renamed from: h  reason: collision with root package name */
    u50.x0 f36692h;

    /* renamed from: i  reason: collision with root package name */
    byte[] f36693i;

    /* renamed from: j  reason: collision with root package name */
    private n50.q f36694j;

    /* renamed from: k  reason: collision with root package name */
    private org.bouncycastle.crypto.u f36695k;

    /* renamed from: l  reason: collision with root package name */
    private byte[] f36696l;

    public c0(org.bouncycastle.crypto.d dVar, org.bouncycastle.crypto.n nVar, org.bouncycastle.crypto.v vVar) {
        this.f36685a = dVar;
        this.f36686b = nVar;
        this.f36687c = vVar;
        byte[] bArr = new byte[vVar.getMacSize()];
        this.f36688d = null;
    }

    public c0(org.bouncycastle.crypto.d dVar, org.bouncycastle.crypto.n nVar, org.bouncycastle.crypto.v vVar, org.bouncycastle.crypto.f fVar) {
        this.f36685a = dVar;
        this.f36686b = nVar;
        this.f36687c = vVar;
        byte[] bArr = new byte[vVar.getMacSize()];
        this.f36688d = fVar;
    }

    private byte[] a(byte[] bArr, int i11, int i12) {
        byte[] bArr2;
        byte[] bArr3;
        int h11;
        if (i12 >= this.f36693i.length + this.f36687c.getMacSize()) {
            if (this.f36688d == null) {
                int length = (i12 - this.f36693i.length) - this.f36687c.getMacSize();
                byte[] bArr4 = new byte[length];
                int c11 = this.f36692h.c() / 8;
                bArr2 = new byte[c11];
                int i13 = length + c11;
                byte[] bArr5 = new byte[i13];
                this.f36686b.generateBytes(bArr5, 0, i13);
                if (this.f36693i.length != 0) {
                    System.arraycopy(bArr5, 0, bArr2, 0, c11);
                    System.arraycopy(bArr5, c11, bArr4, 0, length);
                } else {
                    System.arraycopy(bArr5, 0, bArr4, 0, length);
                    System.arraycopy(bArr5, length, bArr2, 0, c11);
                }
                bArr3 = new byte[length];
                for (int i14 = 0; i14 != length; i14++) {
                    bArr3[i14] = (byte) (bArr[(this.f36693i.length + i11) + i14] ^ bArr4[i14]);
                }
                h11 = 0;
            } else {
                int d11 = ((u50.y0) this.f36692h).d() / 8;
                byte[] bArr6 = new byte[d11];
                int c12 = this.f36692h.c() / 8;
                bArr2 = new byte[c12];
                int i15 = d11 + c12;
                byte[] bArr7 = new byte[i15];
                this.f36686b.generateBytes(bArr7, 0, i15);
                System.arraycopy(bArr7, 0, bArr6, 0, d11);
                System.arraycopy(bArr7, d11, bArr2, 0, c12);
                org.bouncycastle.crypto.i b1Var = new u50.b1(bArr6);
                byte[] bArr8 = this.f36696l;
                if (bArr8 != null) {
                    b1Var = new u50.f1(b1Var, bArr8);
                }
                this.f36688d.f(false, b1Var);
                bArr3 = new byte[this.f36688d.c((i12 - this.f36693i.length) - this.f36687c.getMacSize())];
                org.bouncycastle.crypto.f fVar = this.f36688d;
                byte[] bArr9 = this.f36693i;
                h11 = fVar.h(bArr, i11 + bArr9.length, (i12 - bArr9.length) - this.f36687c.getMacSize(), bArr3, 0);
            }
            byte[] b11 = this.f36692h.b();
            byte[] e11 = this.f36693i.length != 0 ? e(b11) : null;
            int i16 = i11 + i12;
            byte[] w11 = org.bouncycastle.util.a.w(bArr, i16 - this.f36687c.getMacSize(), i16);
            int length2 = w11.length;
            byte[] bArr10 = new byte[length2];
            this.f36687c.init(new u50.b1(bArr2));
            org.bouncycastle.crypto.v vVar = this.f36687c;
            byte[] bArr11 = this.f36693i;
            vVar.update(bArr, i11 + bArr11.length, (i12 - bArr11.length) - length2);
            if (b11 != null) {
                this.f36687c.update(b11, 0, b11.length);
            }
            if (this.f36693i.length != 0) {
                this.f36687c.update(e11, 0, e11.length);
            }
            this.f36687c.doFinal(bArr10, 0);
            if (org.bouncycastle.util.a.u(w11, bArr10)) {
                org.bouncycastle.crypto.f fVar2 = this.f36688d;
                return fVar2 == null ? bArr3 : org.bouncycastle.util.a.w(bArr3, 0, h11 + fVar2.a(bArr3, h11));
            }
            throw new InvalidCipherTextException("invalid MAC");
        }
        throw new InvalidCipherTextException("Length of input must be greater than the MAC and V combined");
    }

    private byte[] b(byte[] bArr, int i11, int i12) {
        org.bouncycastle.crypto.f fVar;
        org.bouncycastle.crypto.i b1Var;
        byte[] bArr2;
        byte[] bArr3;
        if (this.f36688d == null) {
            byte[] bArr4 = new byte[i12];
            int c11 = this.f36692h.c() / 8;
            bArr3 = new byte[c11];
            int i13 = i12 + c11;
            byte[] bArr5 = new byte[i13];
            this.f36686b.generateBytes(bArr5, 0, i13);
            if (this.f36693i.length != 0) {
                System.arraycopy(bArr5, 0, bArr3, 0, c11);
                System.arraycopy(bArr5, c11, bArr4, 0, i12);
            } else {
                System.arraycopy(bArr5, 0, bArr4, 0, i12);
                System.arraycopy(bArr5, i12, bArr3, 0, c11);
            }
            bArr2 = new byte[i12];
            for (int i14 = 0; i14 != i12; i14++) {
                bArr2[i14] = (byte) (bArr[i11 + i14] ^ bArr4[i14]);
            }
        } else {
            int d11 = ((u50.y0) this.f36692h).d() / 8;
            byte[] bArr6 = new byte[d11];
            int c12 = this.f36692h.c() / 8;
            byte[] bArr7 = new byte[c12];
            int i15 = d11 + c12;
            byte[] bArr8 = new byte[i15];
            this.f36686b.generateBytes(bArr8, 0, i15);
            System.arraycopy(bArr8, 0, bArr6, 0, d11);
            System.arraycopy(bArr8, d11, bArr7, 0, c12);
            if (this.f36696l != null) {
                fVar = this.f36688d;
                b1Var = new u50.f1(new u50.b1(bArr6), this.f36696l);
            } else {
                fVar = this.f36688d;
                b1Var = new u50.b1(bArr6);
            }
            fVar.f(true, b1Var);
            bArr2 = new byte[this.f36688d.c(i12)];
            int h11 = this.f36688d.h(bArr, i11, i12, bArr2, 0);
            i12 = h11 + this.f36688d.a(bArr2, h11);
            bArr3 = bArr7;
        }
        byte[] b11 = this.f36692h.b();
        byte[] e11 = this.f36693i.length != 0 ? e(b11) : null;
        int macSize = this.f36687c.getMacSize();
        byte[] bArr9 = new byte[macSize];
        this.f36687c.init(new u50.b1(bArr3));
        this.f36687c.update(bArr2, 0, bArr2.length);
        if (b11 != null) {
            this.f36687c.update(b11, 0, b11.length);
        }
        if (this.f36693i.length != 0) {
            this.f36687c.update(e11, 0, e11.length);
        }
        this.f36687c.doFinal(bArr9, 0);
        byte[] bArr10 = this.f36693i;
        byte[] bArr11 = new byte[bArr10.length + i12 + macSize];
        System.arraycopy(bArr10, 0, bArr11, 0, bArr10.length);
        System.arraycopy(bArr2, 0, bArr11, this.f36693i.length, i12);
        System.arraycopy(bArr9, 0, bArr11, this.f36693i.length + i12, macSize);
        return bArr11;
    }

    private void c(org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof u50.f1) {
            u50.f1 f1Var = (u50.f1) iVar;
            this.f36696l = f1Var.a();
            iVar = f1Var.b();
        } else {
            this.f36696l = null;
        }
        this.f36692h = (u50.x0) iVar;
    }

    public org.bouncycastle.crypto.f d() {
        return this.f36688d;
    }

    protected byte[] e(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        if (bArr != null) {
            r70.i.s(bArr.length * 8, bArr2, 0);
        }
        return bArr2;
    }

    public org.bouncycastle.crypto.v f() {
        return this.f36687c;
    }

    public void g(u50.b bVar, org.bouncycastle.crypto.i iVar, n50.q qVar) {
        this.f36689e = true;
        this.f36691g = bVar;
        this.f36694j = qVar;
        c(iVar);
    }

    public void h(u50.b bVar, org.bouncycastle.crypto.i iVar, org.bouncycastle.crypto.u uVar) {
        this.f36689e = false;
        this.f36690f = bVar;
        this.f36695k = uVar;
        c(iVar);
    }

    public void i(boolean z11, org.bouncycastle.crypto.i iVar, org.bouncycastle.crypto.i iVar2, org.bouncycastle.crypto.i iVar3) {
        this.f36689e = z11;
        this.f36690f = iVar;
        this.f36691g = iVar2;
        this.f36693i = new byte[0];
        c(iVar3);
    }

    public byte[] j(byte[] bArr, int i11, int i12) {
        if (this.f36689e) {
            n50.q qVar = this.f36694j;
            if (qVar != null) {
                org.bouncycastle.crypto.q a11 = qVar.a();
                this.f36690f = a11.b().a();
                this.f36693i = a11.a();
            }
        } else if (this.f36695k != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i11, i12);
            try {
                this.f36691g = this.f36695k.readKey(byteArrayInputStream);
                this.f36693i = org.bouncycastle.util.a.w(bArr, i11, (i12 - byteArrayInputStream.available()) + i11);
            } catch (IOException e11) {
                throw new InvalidCipherTextException("unable to recover ephemeral public key: " + e11.getMessage(), e11);
            } catch (IllegalArgumentException e12) {
                throw new InvalidCipherTextException("unable to recover ephemeral public key: " + e12.getMessage(), e12);
            }
        }
        this.f36685a.init(this.f36690f);
        byte[] b11 = r70.a.b(this.f36685a.getFieldSize(), this.f36685a.a(this.f36691g));
        byte[] bArr2 = this.f36693i;
        if (bArr2.length != 0) {
            byte[] p11 = org.bouncycastle.util.a.p(bArr2, b11);
            org.bouncycastle.util.a.y(b11, (byte) 0);
            b11 = p11;
        }
        try {
            this.f36686b.init(new u50.a1(b11, this.f36692h.a()));
            return this.f36689e ? b(bArr, i11, i12) : a(bArr, i11, i12);
        } finally {
            org.bouncycastle.util.a.y(b11, (byte) 0);
        }
    }
}