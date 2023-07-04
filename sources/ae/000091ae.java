package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import java.io.IOException;
import java.security.SignatureException;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.s0;

/* loaded from: classes5.dex */
public class SignatureSpiLe extends SignatureSpi {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi, java.security.SignatureSpi
    public byte[] engineSign() {
        byte[] r11 = l.p(super.engineSign()).r();
        reverseBytes(r11);
        try {
            return new s0(r11).getEncoded();
        } catch (Exception e11) {
            throw new SignatureException(e11.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi, java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) {
        try {
            byte[] r11 = ((l) n.k(bArr)).r();
            reverseBytes(r11);
            try {
                return super.engineVerify(new s0(r11).getEncoded());
            } catch (SignatureException e11) {
                throw e11;
            } catch (Exception e12) {
                throw new SignatureException(e12.toString());
            }
        } catch (IOException unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    void reverseBytes(byte[] bArr) {
        for (int i11 = 0; i11 < bArr.length / 2; i11++) {
            byte b11 = bArr[i11];
            bArr[i11] = bArr[(bArr.length - 1) - i11];
            bArr[(bArr.length - 1) - i11] = b11;
        }
    }
}