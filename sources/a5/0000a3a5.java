package org.spongycastle.pkix.jcajce;

import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.cert.jcajce.JcaX509CertificateHolder;
import org.spongycastle.pkix.PKIXIdentity;

/* loaded from: classes4.dex */
public class JcaPKIXIdentity extends PKIXIdentity {
    private final X509Certificate[] certs;
    private final PrivateKey privKey;

    public JcaPKIXIdentity(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
        super(getPrivateKeyInfo(privateKey), getCertificates(x509CertificateArr));
        this.privKey = privateKey;
        X509Certificate[] x509CertificateArr2 = new X509Certificate[x509CertificateArr.length];
        this.certs = x509CertificateArr2;
        System.arraycopy(x509CertificateArr, 0, x509CertificateArr2, 0, x509CertificateArr.length);
    }

    private static X509CertificateHolder[] getCertificates(X509Certificate[] x509CertificateArr) {
        int length = x509CertificateArr.length;
        X509CertificateHolder[] x509CertificateHolderArr = new X509CertificateHolder[length];
        for (int i11 = 0; i11 != length; i11++) {
            try {
                x509CertificateHolderArr[i11] = new JcaX509CertificateHolder(x509CertificateArr[i11]);
            } catch (CertificateEncodingException e11) {
                throw new IllegalArgumentException("Unable to process certificates: " + e11.getMessage());
            }
        }
        return x509CertificateHolderArr;
    }

    private static PrivateKeyInfo getPrivateKeyInfo(PrivateKey privateKey) {
        try {
            return PrivateKeyInfo.getInstance(privateKey.getEncoded());
        } catch (Exception unused) {
            return null;
        }
    }

    public PrivateKey getPrivateKey() {
        return this.privKey;
    }

    public X509Certificate getX509Certificate() {
        return this.certs[0];
    }
}