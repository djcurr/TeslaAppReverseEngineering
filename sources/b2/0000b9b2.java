package v70;

import e50.w;
import e50.x;
import e50.z;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* loaded from: classes5.dex */
public class a implements CertSelector, r70.k {

    /* renamed from: a */
    final z f54330a;

    public a(org.bouncycastle.asn1.p pVar) {
        this.f54330a = z.h(pVar);
    }

    private Object[] e(w[] wVarArr) {
        ArrayList arrayList = new ArrayList(wVarArr.length);
        for (int i11 = 0; i11 != wVarArr.length; i11++) {
            if (wVarArr[i11].j() == 4) {
                try {
                    arrayList.add(new X500Principal(wVarArr[i11].i().toASN1Primitive().getEncoded()));
                } catch (IOException unused) {
                    throw new RuntimeException("badly formed Name object");
                }
            }
        }
        return arrayList.toArray(new Object[arrayList.size()]);
    }

    private Principal[] g(x xVar) {
        Object[] e11 = e(xVar.i());
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 != e11.length; i11++) {
            if (e11[i11] instanceof Principal) {
                arrayList.add(e11[i11]);
            }
        }
        return (Principal[]) arrayList.toArray(new Principal[arrayList.size()]);
    }

    private boolean i(j60.e eVar, x xVar) {
        w[] i11 = xVar.i();
        for (int i12 = 0; i12 != i11.length; i12++) {
            w wVar = i11[i12];
            if (wVar.j() == 4) {
                try {
                    if (new j60.e(wVar.i().toASN1Primitive().getEncoded()).equals(eVar)) {
                        return true;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public String a() {
        if (this.f54330a.i() != null) {
            return this.f54330a.i().e().e().t();
        }
        return null;
    }

    public int b() {
        if (this.f54330a.i() != null) {
            return this.f54330a.i().f().t();
        }
        return -1;
    }

    public Principal[] c() {
        if (this.f54330a.f() != null) {
            return g(this.f54330a.f());
        }
        return null;
    }

    @Override // java.security.cert.CertSelector, r70.k
    public Object clone() {
        return new a((org.bouncycastle.asn1.p) this.f54330a.toASN1Primitive());
    }

    public Principal[] d() {
        if (this.f54330a.e() != null) {
            return g(this.f54330a.e().h());
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return this.f54330a.equals(((a) obj).f54330a);
        }
        return false;
    }

    public byte[] f() {
        if (this.f54330a.i() != null) {
            return this.f54330a.i().j().q();
        }
        return null;
    }

    public BigInteger h() {
        if (this.f54330a.e() != null) {
            return this.f54330a.e().i().s();
        }
        return null;
    }

    public int hashCode() {
        return this.f54330a.hashCode();
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
            if (this.f54330a.e() != null) {
                return this.f54330a.e().i().u(x509Certificate.getSerialNumber()) && i(j60.c.a(x509Certificate), this.f54330a.e().h());
            } else if (this.f54330a.f() == null || !i(j60.c.b(x509Certificate), this.f54330a.f())) {
                if (this.f54330a.i() != null) {
                    MessageDigest messageDigest = MessageDigest.getInstance(a(), BouncyCastleProvider.PROVIDER_NAME);
                    int b11 = b();
                    if (b11 == 0) {
                        messageDigest.update(certificate.getPublicKey().getEncoded());
                    } else if (b11 == 1) {
                        messageDigest.update(certificate.getEncoded());
                    }
                    org.bouncycastle.util.a.c(messageDigest.digest(), f());
                }
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}