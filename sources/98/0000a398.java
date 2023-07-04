package org.spongycastle.pkcs.jcajce;

import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.x509.Certificate;
import org.spongycastle.operator.OutputEncryptor;
import org.spongycastle.pkcs.PKCS12SafeBagBuilder;
import org.spongycastle.pkcs.PKCSIOException;

/* loaded from: classes4.dex */
public class JcaPKCS12SafeBagBuilder extends PKCS12SafeBagBuilder {
    public JcaPKCS12SafeBagBuilder(X509Certificate x509Certificate) {
        super(convertCert(x509Certificate));
    }

    private static Certificate convertCert(X509Certificate x509Certificate) {
        try {
            return Certificate.getInstance(x509Certificate.getEncoded());
        } catch (CertificateEncodingException e11) {
            throw new PKCSIOException("cannot encode certificate: " + e11.getMessage(), e11);
        }
    }

    public JcaPKCS12SafeBagBuilder(PrivateKey privateKey, OutputEncryptor outputEncryptor) {
        super(PrivateKeyInfo.getInstance(privateKey.getEncoded()), outputEncryptor);
    }

    public JcaPKCS12SafeBagBuilder(PrivateKey privateKey) {
        super(PrivateKeyInfo.getInstance(privateKey.getEncoded()));
    }
}