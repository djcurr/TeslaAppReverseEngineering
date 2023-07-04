package org.bouncycastle.asn1;

import org.spongycastle.asn1.ASN1Encoding;

/* loaded from: classes5.dex */
public class j0 extends b {
    public j0(e40.b bVar) {
        super(bVar.toASN1Primitive().d(ASN1Encoding.DER), 0);
    }

    public j0(byte[] bArr) {
        this(bArr, 0);
    }

    public j0(byte[] bArr, int i11) {
        super(bArr, i11);
    }

    static j0 u(byte[] bArr) {
        if (bArr.length >= 1) {
            byte b11 = bArr[0];
            int length = bArr.length - 1;
            byte[] bArr2 = new byte[length];
            if (length != 0) {
                System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
            }
            return new j0(bArr2, b11);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    public static j0 v(Object obj) {
        if (obj == null || (obj instanceof j0)) {
            return (j0) obj;
        }
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            return new j0(f1Var.f43019a, f1Var.f43020b);
        } else if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        } else {
            try {
                return (j0) n.k((byte[]) obj);
            } catch (Exception e11) {
                throw new IllegalArgumentException("encoding error in getInstance: " + e11.toString());
            }
        }
    }

    public static j0 w(s sVar, boolean z11) {
        n r11 = sVar.r();
        return (z11 || (r11 instanceof j0)) ? v(r11) : u(l.p(r11).r());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        int i11;
        byte[] bArr = this.f43019a;
        int length = bArr.length;
        if (length != 0 && (i11 = this.f43020b) != 0) {
            int i12 = length - 1;
            if (bArr[i12] != ((byte) (bArr[i12] & (255 << i11)))) {
                mVar.l(z11, 3, (byte) i11, bArr, 0, i12, (byte) (bArr[i12] & (255 << i11)));
                return;
            }
        }
        mVar.k(z11, 3, (byte) this.f43020b, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        return v1.a(this.f43019a.length + 1) + 1 + this.f43019a.length + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean m() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.b, org.bouncycastle.asn1.n
    public n n() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.b, org.bouncycastle.asn1.n
    public n o() {
        return this;
    }
}