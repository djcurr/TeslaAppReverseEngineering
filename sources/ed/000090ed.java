package org.bouncycastle.asn1;

import java.util.Date;

/* loaded from: classes5.dex */
public class n0 extends g {
    public n0(Date date) {
        super(date);
    }

    public n0(byte[] bArr) {
        super(bArr);
    }

    private byte[] B() {
        byte[] bArr = this.f43042a;
        if (bArr[bArr.length - 1] == 90) {
            if (!x()) {
                byte[] bArr2 = this.f43042a;
                byte[] bArr3 = new byte[bArr2.length + 4];
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
                System.arraycopy(r70.m.f("0000Z"), 0, bArr3, this.f43042a.length - 1, 5);
                return bArr3;
            } else if (!y()) {
                byte[] bArr4 = this.f43042a;
                byte[] bArr5 = new byte[bArr4.length + 2];
                System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 1);
                System.arraycopy(r70.m.f("00Z"), 0, bArr5, this.f43042a.length - 1, 3);
                return bArr5;
            } else if (w()) {
                int length = this.f43042a.length - 2;
                while (length > 0 && this.f43042a[length] == 48) {
                    length--;
                }
                byte[] bArr6 = this.f43042a;
                if (bArr6[length] == 46) {
                    byte[] bArr7 = new byte[length + 1];
                    System.arraycopy(bArr6, 0, bArr7, 0, length);
                    bArr7[length] = 90;
                    return bArr7;
                }
                byte[] bArr8 = new byte[length + 2];
                int i11 = length + 1;
                System.arraycopy(bArr6, 0, bArr8, 0, i11);
                bArr8[i11] = 90;
                return bArr8;
            } else {
                return this.f43042a;
            }
        }
        return bArr;
    }

    @Override // org.bouncycastle.asn1.g, org.bouncycastle.asn1.n
    void f(m mVar, boolean z11) {
        mVar.n(z11, 24, B());
    }

    @Override // org.bouncycastle.asn1.g, org.bouncycastle.asn1.n
    int h() {
        int length = B().length;
        return v1.a(length) + 1 + length;
    }

    @Override // org.bouncycastle.asn1.g, org.bouncycastle.asn1.n
    n n() {
        return this;
    }

    @Override // org.bouncycastle.asn1.g, org.bouncycastle.asn1.n
    n o() {
        return this;
    }
}