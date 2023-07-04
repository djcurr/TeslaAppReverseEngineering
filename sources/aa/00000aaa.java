package atd.i0;

import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.CertPathValidator;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXParameters;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.X509Certificate;
import java.util.EnumSet;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final CertificateFactory f6885a;

    static {
        atd.s0.a.a(-791269078788672L);
        try {
            f6885a = CertificateFactory.getInstance(atd.s0.a.a(-791230424083008L));
        } catch (CertificateException e11) {
            throw atd.y.c.CRYPTO_FAILURE.a(e11);
        }
    }

    public static X509Certificate a(String str) {
        return a(new ByteArrayInputStream(String.format(atd.s0.a.a(-791805949700672L), str).getBytes(com.adyen.threeds2.internal.b.f9630a)));
    }

    public static void a(X509Certificate x509Certificate, List<X509Certificate> list) {
        try {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            keyStore.setCertificateEntry(atd.s0.a.a(-792076532640320L), x509Certificate);
            PKIXParameters pKIXParameters = new PKIXParameters(keyStore);
            CertPathValidator certPathValidator = CertPathValidator.getInstance(atd.s0.a.a(-792089417542208L));
            if (Build.VERSION.SDK_INT >= 24) {
                PKIXRevocationChecker pKIXRevocationChecker = (PKIXRevocationChecker) certPathValidator.getRevocationChecker();
                if (pKIXRevocationChecker.getOcspResponder() == null && Security.getProperty(atd.s0.a.a(-792102302444096L)) == null) {
                    pKIXParameters.setRevocationEnabled(false);
                }
                pKIXRevocationChecker.setOptions(EnumSet.of(PKIXRevocationChecker.Option.SOFT_FAIL));
                pKIXParameters.addCertPathChecker(pKIXRevocationChecker);
            } else {
                pKIXParameters.setRevocationEnabled(false);
            }
            if (certPathValidator.validate(f6885a.generateCertPath(list), pKIXParameters) != null) {
                return;
            }
            throw atd.y.c.CRYPTO_FAILURE.a();
        } catch (IOException | GeneralSecurityException e11) {
            throw atd.y.c.CRYPTO_FAILURE.a(e11);
        }
    }

    private static X509Certificate a(InputStream inputStream) {
        Certificate generateCertificate = f6885a.generateCertificate(inputStream);
        if (generateCertificate instanceof X509Certificate) {
            return (X509Certificate) generateCertificate;
        }
        throw new CertificateException(atd.s0.a.a(-792196791724608L));
    }
}