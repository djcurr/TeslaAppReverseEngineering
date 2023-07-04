package e60;

import java.io.IOException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import java.util.Collection;

/* loaded from: classes5.dex */
public class q<T extends Certificate> implements r70.k<T> {

    /* renamed from: a  reason: collision with root package name */
    private final CertSelector f24898a;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final CertSelector f24899a;

        public b(CertSelector certSelector) {
            this.f24899a = (CertSelector) certSelector.clone();
        }

        public q<? extends Certificate> a() {
            return new q<>(this.f24899a);
        }
    }

    /* loaded from: classes5.dex */
    private static class c extends X509CertSelector {

        /* renamed from: a  reason: collision with root package name */
        private final q f24900a;

        c(q qVar) {
            this.f24900a = qVar;
            if (qVar.f24898a instanceof X509CertSelector) {
                X509CertSelector x509CertSelector = (X509CertSelector) qVar.f24898a;
                setAuthorityKeyIdentifier(x509CertSelector.getAuthorityKeyIdentifier());
                setBasicConstraints(x509CertSelector.getBasicConstraints());
                setCertificate(x509CertSelector.getCertificate());
                setCertificateValid(x509CertSelector.getCertificateValid());
                setKeyUsage(x509CertSelector.getKeyUsage());
                setMatchAllSubjectAltNames(x509CertSelector.getMatchAllSubjectAltNames());
                setPrivateKeyValid(x509CertSelector.getPrivateKeyValid());
                setSerialNumber(x509CertSelector.getSerialNumber());
                setSubjectKeyIdentifier(x509CertSelector.getSubjectKeyIdentifier());
                setSubjectPublicKey(x509CertSelector.getSubjectPublicKey());
                try {
                    setExtendedKeyUsage(x509CertSelector.getExtendedKeyUsage());
                    setIssuer(x509CertSelector.getIssuerAsBytes());
                    setNameConstraints(x509CertSelector.getNameConstraints());
                    setPathToNames(x509CertSelector.getPathToNames());
                    setPolicy(x509CertSelector.getPolicy());
                    setSubject(x509CertSelector.getSubjectAsBytes());
                    setSubjectAlternativeNames(x509CertSelector.getSubjectAlternativeNames());
                    setSubjectPublicKeyAlgID(x509CertSelector.getSubjectPublicKeyAlgID());
                } catch (IOException e11) {
                    throw new IllegalStateException("base selector invalid: " + e11.getMessage(), e11);
                }
            }
        }

        @Override // java.security.cert.X509CertSelector, java.security.cert.CertSelector
        public boolean match(Certificate certificate) {
            q qVar = this.f24900a;
            return qVar == null ? certificate != null : qVar.match(certificate);
        }
    }

    private q(CertSelector certSelector) {
        this.f24898a = certSelector;
    }

    public static Collection<? extends Certificate> c(q qVar, CertStore certStore) {
        return certStore.getCertificates(new c(qVar));
    }

    public Certificate b() {
        CertSelector certSelector = this.f24898a;
        if (certSelector instanceof X509CertSelector) {
            return ((X509CertSelector) certSelector).getCertificate();
        }
        return null;
    }

    @Override // r70.k
    public Object clone() {
        return new q(this.f24898a);
    }

    @Override // r70.k
    public boolean match(Certificate certificate) {
        return this.f24898a.match(certificate);
    }
}