package org.spongycastle.cert.selector.jcajce;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.X509CertSelector;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.cert.selector.X509CertificateHolderSelector;

/* loaded from: classes5.dex */
public class JcaX509CertSelectorConverter {
    /* JADX INFO: Access modifiers changed from: protected */
    public X509CertSelector doConversion(X500Name x500Name, BigInteger bigInteger, byte[] bArr) {
        X509CertSelector x509CertSelector = new X509CertSelector();
        if (x500Name != null) {
            try {
                x509CertSelector.setIssuer(x500Name.getEncoded());
            } catch (IOException e11) {
                throw new IllegalArgumentException("unable to convert issuer: " + e11.getMessage());
            }
        }
        if (bigInteger != null) {
            x509CertSelector.setSerialNumber(bigInteger);
        }
        if (bArr != null) {
            try {
                x509CertSelector.setSubjectKeyIdentifier(new DEROctetString(bArr).getEncoded());
            } catch (IOException e12) {
                throw new IllegalArgumentException("unable to convert issuer: " + e12.getMessage());
            }
        }
        return x509CertSelector;
    }

    public X509CertSelector getCertSelector(X509CertificateHolderSelector x509CertificateHolderSelector) {
        return doConversion(x509CertificateHolderSelector.getIssuer(), x509CertificateHolderSelector.getSerialNumber(), x509CertificateHolderSelector.getSubjectKeyIdentifier());
    }
}