package v70;

import java.security.cert.X509Certificate;
import org.bouncycastle.jce.provider.X509CertificateObject;

/* loaded from: classes5.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private X509Certificate f54361a;

    /* renamed from: b  reason: collision with root package name */
    private X509Certificate f54362b;

    public l(e50.p pVar) {
        new i60.a();
        if (pVar.e() != null) {
            this.f54361a = new X509CertificateObject(pVar.e());
        }
        if (pVar.h() != null) {
            this.f54362b = new X509CertificateObject(pVar.h());
        }
    }

    public X509Certificate a() {
        return this.f54361a;
    }

    public X509Certificate b() {
        return this.f54362b;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof l)) {
            l lVar = (l) obj;
            X509Certificate x509Certificate = this.f54361a;
            boolean equals = x509Certificate != null ? x509Certificate.equals(lVar.f54361a) : lVar.f54361a == null;
            X509Certificate x509Certificate2 = this.f54362b;
            X509Certificate x509Certificate3 = lVar.f54362b;
            return equals && (x509Certificate2 != null ? x509Certificate2.equals(x509Certificate3) : x509Certificate3 == null);
        }
        return false;
    }

    public int hashCode() {
        X509Certificate x509Certificate = this.f54361a;
        int hashCode = x509Certificate != null ? (-1) ^ x509Certificate.hashCode() : -1;
        X509Certificate x509Certificate2 = this.f54362b;
        return x509Certificate2 != null ? (hashCode * 17) ^ x509Certificate2.hashCode() : hashCode;
    }
}