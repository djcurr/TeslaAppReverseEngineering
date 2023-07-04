package v70;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;

/* loaded from: classes5.dex */
public class k extends X509CertSelector implements r70.k {
    public static k a(X509CertSelector x509CertSelector) {
        if (x509CertSelector != null) {
            k kVar = new k();
            kVar.setAuthorityKeyIdentifier(x509CertSelector.getAuthorityKeyIdentifier());
            kVar.setBasicConstraints(x509CertSelector.getBasicConstraints());
            kVar.setCertificate(x509CertSelector.getCertificate());
            kVar.setCertificateValid(x509CertSelector.getCertificateValid());
            kVar.setMatchAllSubjectAltNames(x509CertSelector.getMatchAllSubjectAltNames());
            try {
                kVar.setPathToNames(x509CertSelector.getPathToNames());
                kVar.setExtendedKeyUsage(x509CertSelector.getExtendedKeyUsage());
                kVar.setNameConstraints(x509CertSelector.getNameConstraints());
                kVar.setPolicy(x509CertSelector.getPolicy());
                kVar.setSubjectPublicKeyAlgID(x509CertSelector.getSubjectPublicKeyAlgID());
                kVar.setSubjectAlternativeNames(x509CertSelector.getSubjectAlternativeNames());
                kVar.setIssuer(x509CertSelector.getIssuer());
                kVar.setKeyUsage(x509CertSelector.getKeyUsage());
                kVar.setPrivateKeyValid(x509CertSelector.getPrivateKeyValid());
                kVar.setSerialNumber(x509CertSelector.getSerialNumber());
                kVar.setSubject(x509CertSelector.getSubject());
                kVar.setSubjectKeyIdentifier(x509CertSelector.getSubjectKeyIdentifier());
                kVar.setSubjectPublicKey(x509CertSelector.getSubjectPublicKey());
                return kVar;
            } catch (IOException e11) {
                throw new IllegalArgumentException("error in passed in selector: " + e11);
            }
        }
        throw new IllegalArgumentException("cannot create from null selector");
    }

    @Override // java.security.cert.X509CertSelector, java.security.cert.CertSelector, r70.k
    public Object clone() {
        return (k) super.clone();
    }

    @Override // r70.k
    public boolean match(Object obj) {
        if (obj instanceof X509Certificate) {
            return super.match((Certificate) ((X509Certificate) obj));
        }
        return false;
    }

    @Override // java.security.cert.X509CertSelector, java.security.cert.CertSelector
    public boolean match(Certificate certificate) {
        return match((Object) certificate);
    }
}