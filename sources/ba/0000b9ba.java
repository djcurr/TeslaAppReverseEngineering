package v70;

import e50.u;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;

/* loaded from: classes5.dex */
public class i extends X509CRLSelector implements r70.k {

    /* renamed from: a  reason: collision with root package name */
    private boolean f54352a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f54353b = false;

    /* renamed from: c  reason: collision with root package name */
    private BigInteger f54354c = null;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f54355d = null;

    /* renamed from: e  reason: collision with root package name */
    private boolean f54356e = false;

    /* renamed from: f  reason: collision with root package name */
    private h f54357f;

    public static i b(X509CRLSelector x509CRLSelector) {
        if (x509CRLSelector != null) {
            i iVar = new i();
            iVar.setCertificateChecking(x509CRLSelector.getCertificateChecking());
            iVar.setDateAndTime(x509CRLSelector.getDateAndTime());
            try {
                iVar.setIssuerNames(x509CRLSelector.getIssuerNames());
                iVar.setIssuers(x509CRLSelector.getIssuers());
                iVar.setMaxCRLNumber(x509CRLSelector.getMaxCRL());
                iVar.setMinCRLNumber(x509CRLSelector.getMinCRL());
                return iVar;
            } catch (IOException e11) {
                throw new IllegalArgumentException(e11.getMessage());
            }
        }
        throw new IllegalArgumentException("cannot create from null selector");
    }

    public h a() {
        return this.f54357f;
    }

    public boolean c() {
        return this.f54353b;
    }

    @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector, r70.k
    public Object clone() {
        i b11 = b(this);
        b11.f54352a = this.f54352a;
        b11.f54353b = this.f54353b;
        b11.f54354c = this.f54354c;
        b11.f54357f = this.f54357f;
        b11.f54356e = this.f54356e;
        b11.f54355d = org.bouncycastle.util.a.h(this.f54355d);
        return b11;
    }

    public boolean d() {
        return this.f54352a;
    }

    @Override // r70.k
    public boolean match(Object obj) {
        if (obj instanceof X509CRL) {
            X509CRL x509crl = (X509CRL) obj;
            try {
                byte[] extensionValue = x509crl.getExtensionValue(u.f24787j.t());
                org.bouncycastle.asn1.i p11 = extensionValue != null ? org.bouncycastle.asn1.i.p(w70.a.a(extensionValue)) : null;
                if (d() && p11 == null) {
                    return false;
                }
                if (!c() || p11 == null) {
                    if (p11 == null || this.f54354c == null || p11.r().compareTo(this.f54354c) != 1) {
                        if (this.f54356e) {
                            byte[] extensionValue2 = x509crl.getExtensionValue(u.f24788k.t());
                            byte[] bArr = this.f54355d;
                            if (bArr == null) {
                                if (extensionValue2 != null) {
                                    return false;
                                }
                            } else if (!org.bouncycastle.util.a.c(extensionValue2, bArr)) {
                                return false;
                            }
                        }
                        return super.match((CRL) x509crl);
                    }
                    return false;
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }

    @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector
    public boolean match(CRL crl) {
        return match((Object) crl);
    }
}