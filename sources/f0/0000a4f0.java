package org.spongycastle.x509;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x509.AttCertIssuer;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.GeneralNames;
import org.spongycastle.asn1.x509.V2Form;
import org.spongycastle.jce.X509Principal;
import org.spongycastle.util.Selector;

/* loaded from: classes4.dex */
public class AttributeCertificateIssuer implements CertSelector, Selector {
    final ASN1Encodable form;

    public AttributeCertificateIssuer(AttCertIssuer attCertIssuer) {
        this.form = attCertIssuer.getIssuer();
    }

    private Object[] getNames() {
        GeneralNames generalNames;
        ASN1Encodable aSN1Encodable = this.form;
        if (aSN1Encodable instanceof V2Form) {
            generalNames = ((V2Form) aSN1Encodable).getIssuerName();
        } else {
            generalNames = (GeneralNames) aSN1Encodable;
        }
        GeneralName[] names = generalNames.getNames();
        ArrayList arrayList = new ArrayList(names.length);
        for (int i11 = 0; i11 != names.length; i11++) {
            if (names[i11].getTagNo() == 4) {
                try {
                    arrayList.add(new X500Principal(names[i11].getName().toASN1Primitive().getEncoded()));
                } catch (IOException unused) {
                    throw new RuntimeException("badly formed Name object");
                }
            }
        }
        return arrayList.toArray(new Object[arrayList.size()]);
    }

    private boolean matchesDN(X500Principal x500Principal, GeneralNames generalNames) {
        GeneralName[] names = generalNames.getNames();
        for (int i11 = 0; i11 != names.length; i11++) {
            GeneralName generalName = names[i11];
            if (generalName.getTagNo() == 4) {
                try {
                    if (new X500Principal(generalName.getName().toASN1Primitive().getEncoded()).equals(x500Principal)) {
                        return true;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    @Override // java.security.cert.CertSelector, org.spongycastle.util.Selector
    public Object clone() {
        return new AttributeCertificateIssuer(AttCertIssuer.getInstance(this.form));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AttributeCertificateIssuer) {
            return this.form.equals(((AttributeCertificateIssuer) obj).form);
        }
        return false;
    }

    public Principal[] getPrincipals() {
        Object[] names = getNames();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 != names.length; i11++) {
            if (names[i11] instanceof Principal) {
                arrayList.add(names[i11]);
            }
        }
        return (Principal[]) arrayList.toArray(new Principal[arrayList.size()]);
    }

    public int hashCode() {
        return this.form.hashCode();
    }

    @Override // java.security.cert.CertSelector
    public boolean match(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            X509Certificate x509Certificate = (X509Certificate) certificate;
            ASN1Encodable aSN1Encodable = this.form;
            if (aSN1Encodable instanceof V2Form) {
                V2Form v2Form = (V2Form) aSN1Encodable;
                if (v2Form.getBaseCertificateID() != null) {
                    return v2Form.getBaseCertificateID().getSerial().getValue().equals(x509Certificate.getSerialNumber()) && matchesDN(x509Certificate.getIssuerX500Principal(), v2Form.getBaseCertificateID().getIssuer());
                }
                if (matchesDN(x509Certificate.getSubjectX500Principal(), v2Form.getIssuerName())) {
                    return true;
                }
            } else {
                if (matchesDN(x509Certificate.getSubjectX500Principal(), (GeneralNames) aSN1Encodable)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public AttributeCertificateIssuer(X500Principal x500Principal) {
        this(new X509Principal(x500Principal.getEncoded()));
    }

    public AttributeCertificateIssuer(X509Principal x509Principal) {
        this.form = new V2Form(GeneralNames.getInstance(new DERSequence(new GeneralName(x509Principal))));
    }

    @Override // org.spongycastle.util.Selector
    public boolean match(Object obj) {
        if (obj instanceof X509Certificate) {
            return match((Certificate) obj);
        }
        return false;
    }
}