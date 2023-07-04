package v70;

import e50.u0;
import e50.w;
import e50.x;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes5.dex */
public class b implements CertSelector, r70.k {

    /* renamed from: a */
    final e40.b f54331a;

    public b(e50.c cVar) {
        this.f54331a = cVar.f();
    }

    private Object[] a() {
        e40.b bVar = this.f54331a;
        w[] i11 = (bVar instanceof u0 ? ((u0) bVar).i() : (x) bVar).i();
        ArrayList arrayList = new ArrayList(i11.length);
        for (int i12 = 0; i12 != i11.length; i12++) {
            if (i11[i12].j() == 4) {
                try {
                    arrayList.add(new X500Principal(i11[i12].i().toASN1Primitive().getEncoded()));
                } catch (IOException unused) {
                    throw new RuntimeException("badly formed Name object");
                }
            }
        }
        return arrayList.toArray(new Object[arrayList.size()]);
    }

    private boolean c(X500Principal x500Principal, x xVar) {
        w[] i11 = xVar.i();
        for (int i12 = 0; i12 != i11.length; i12++) {
            w wVar = i11[i12];
            if (wVar.j() == 4) {
                try {
                    if (new X500Principal(wVar.i().toASN1Primitive().getEncoded()).equals(x500Principal)) {
                        return true;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public Principal[] b() {
        Object[] a11 = a();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 != a11.length; i11++) {
            if (a11[i11] instanceof Principal) {
                arrayList.add(a11[i11]);
            }
        }
        return (Principal[]) arrayList.toArray(new Principal[arrayList.size()]);
    }

    @Override // java.security.cert.CertSelector, r70.k
    public Object clone() {
        return new b(e50.c.e(this.f54331a));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.f54331a.equals(((b) obj).f54331a);
        }
        return false;
    }

    public int hashCode() {
        return this.f54331a.hashCode();
    }

    @Override // r70.k
    public boolean match(Object obj) {
        if (obj instanceof X509Certificate) {
            return match((Certificate) obj);
        }
        return false;
    }

    @Override // java.security.cert.CertSelector
    public boolean match(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            X509Certificate x509Certificate = (X509Certificate) certificate;
            e40.b bVar = this.f54331a;
            if (bVar instanceof u0) {
                u0 u0Var = (u0) bVar;
                if (u0Var.e() != null) {
                    return u0Var.e().i().u(x509Certificate.getSerialNumber()) && c(x509Certificate.getIssuerX500Principal(), u0Var.e().h());
                }
                if (c(x509Certificate.getSubjectX500Principal(), u0Var.i())) {
                    return true;
                }
            } else {
                if (c(x509Certificate.getSubjectX500Principal(), (x) bVar)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}