package nq;

import java.io.ByteArrayInputStream;
import java.security.Provider;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* loaded from: classes2.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static Provider f41780a;

    public static X509Certificate a(byte[] bArr) {
        try {
            return b(bArr);
        } catch (CertificateException unused) {
            return null;
        }
    }

    public static X509Certificate b(byte[] bArr) {
        CertificateFactory certificateFactory;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        Provider provider = f41780a;
        if (provider != null) {
            certificateFactory = CertificateFactory.getInstance("X.509", provider);
        } else {
            certificateFactory = CertificateFactory.getInstance("X.509");
        }
        Certificate generateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
        if (generateCertificate instanceof X509Certificate) {
            return (X509Certificate) generateCertificate;
        }
        throw new CertificateException("Not a X.509 certificate: " + generateCertificate.getType());
    }
}