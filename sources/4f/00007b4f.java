package j60;

import e50.p0;
import e50.x0;
import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.n;

/* loaded from: classes5.dex */
public class c {
    public static e a(X509Certificate x509Certificate) {
        try {
            return new e(x0.k(p0.e(n.k(x509Certificate.getTBSCertificate())).f()));
        } catch (IOException e11) {
            throw new CertificateEncodingException(e11.toString());
        }
    }

    public static e b(X509Certificate x509Certificate) {
        try {
            return new e(x0.k(p0.e(n.k(x509Certificate.getTBSCertificate())).h()));
        } catch (IOException e11) {
            throw new CertificateEncodingException(e11.toString());
        }
    }
}