package org.spongycastle.cert;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.asn1.x509.GeneralNames;
import org.spongycastle.asn1.x509.TBSCertList;

/* loaded from: classes5.dex */
public class X509CRLEntryHolder {

    /* renamed from: ca  reason: collision with root package name */
    private GeneralNames f43427ca;
    private TBSCertList.CRLEntry entry;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X509CRLEntryHolder(TBSCertList.CRLEntry cRLEntry, boolean z11, GeneralNames generalNames) {
        Extension extension;
        this.entry = cRLEntry;
        this.f43427ca = generalNames;
        if (z11 && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
            this.f43427ca = GeneralNames.getInstance(extension.getParsedValue());
        }
    }

    public GeneralNames getCertificateIssuer() {
        return this.f43427ca;
    }

    public Set getCriticalExtensionOIDs() {
        return CertUtils.getCriticalExtensionOIDs(this.entry.getExtensions());
    }

    public Extension getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Extensions extensions = this.entry.getExtensions();
        if (extensions != null) {
            return extensions.getExtension(aSN1ObjectIdentifier);
        }
        return null;
    }

    public List getExtensionOIDs() {
        return CertUtils.getExtensionOIDs(this.entry.getExtensions());
    }

    public Extensions getExtensions() {
        return this.entry.getExtensions();
    }

    public Set getNonCriticalExtensionOIDs() {
        return CertUtils.getNonCriticalExtensionOIDs(this.entry.getExtensions());
    }

    public Date getRevocationDate() {
        return this.entry.getRevocationDate().getDate();
    }

    public BigInteger getSerialNumber() {
        return this.entry.getUserCertificate().getValue();
    }

    public boolean hasExtensions() {
        return this.entry.hasExtensions();
    }
}