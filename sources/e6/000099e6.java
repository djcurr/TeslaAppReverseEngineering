package org.spongycastle.cert;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DEROutputStream;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.CertificateList;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.GeneralNames;
import org.spongycastle.asn1.x509.IssuingDistributionPoint;
import org.spongycastle.asn1.x509.TBSCertList;
import org.spongycastle.operator.ContentVerifier;
import org.spongycastle.operator.ContentVerifierProvider;
import org.spongycastle.util.Encodable;

/* loaded from: classes5.dex */
public class X509CRLHolder implements Encodable {
    private Extensions extensions;
    private boolean isIndirect;
    private GeneralNames issuerName;
    private CertificateList x509CRL;

    public X509CRLHolder(byte[] bArr) {
        this(parseStream(new ByteArrayInputStream(bArr)));
    }

    private static boolean isIndirectCRL(Extensions extensions) {
        Extension extension;
        return (extensions == null || (extension = extensions.getExtension(Extension.issuingDistributionPoint)) == null || !IssuingDistributionPoint.getInstance(extension.getParsedValue()).isIndirectCRL()) ? false : true;
    }

    private static CertificateList parseStream(InputStream inputStream) {
        try {
            return CertificateList.getInstance(new ASN1InputStream(inputStream, true).readObject());
        } catch (ClassCastException e11) {
            throw new CertIOException("malformed data: " + e11.getMessage(), e11);
        } catch (IllegalArgumentException e12) {
            throw new CertIOException("malformed data: " + e12.getMessage(), e12);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X509CRLHolder) {
            return this.x509CRL.equals(((X509CRLHolder) obj).x509CRL);
        }
        return false;
    }

    public Set getCriticalExtensionOIDs() {
        return CertUtils.getCriticalExtensionOIDs(this.extensions);
    }

    @Override // org.spongycastle.util.Encodable
    public byte[] getEncoded() {
        return this.x509CRL.getEncoded();
    }

    public Extension getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Extensions extensions = this.extensions;
        if (extensions != null) {
            return extensions.getExtension(aSN1ObjectIdentifier);
        }
        return null;
    }

    public List getExtensionOIDs() {
        return CertUtils.getExtensionOIDs(this.extensions);
    }

    public Extensions getExtensions() {
        return this.extensions;
    }

    public X500Name getIssuer() {
        return X500Name.getInstance(this.x509CRL.getIssuer());
    }

    public Set getNonCriticalExtensionOIDs() {
        return CertUtils.getNonCriticalExtensionOIDs(this.extensions);
    }

    public X509CRLEntryHolder getRevokedCertificate(BigInteger bigInteger) {
        Extension extension;
        GeneralNames generalNames = this.issuerName;
        Enumeration revokedCertificateEnumeration = this.x509CRL.getRevokedCertificateEnumeration();
        while (revokedCertificateEnumeration.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement();
            if (cRLEntry.getUserCertificate().getValue().equals(bigInteger)) {
                return new X509CRLEntryHolder(cRLEntry, this.isIndirect, generalNames);
            }
            if (this.isIndirect && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                generalNames = GeneralNames.getInstance(extension.getParsedValue());
            }
        }
        return null;
    }

    public Collection getRevokedCertificates() {
        ArrayList arrayList = new ArrayList(this.x509CRL.getRevokedCertificates().length);
        GeneralNames generalNames = this.issuerName;
        Enumeration revokedCertificateEnumeration = this.x509CRL.getRevokedCertificateEnumeration();
        while (revokedCertificateEnumeration.hasMoreElements()) {
            X509CRLEntryHolder x509CRLEntryHolder = new X509CRLEntryHolder((TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement(), this.isIndirect, generalNames);
            arrayList.add(x509CRLEntryHolder);
            generalNames = x509CRLEntryHolder.getCertificateIssuer();
        }
        return arrayList;
    }

    public boolean hasExtensions() {
        return this.extensions != null;
    }

    public int hashCode() {
        return this.x509CRL.hashCode();
    }

    public boolean isSignatureValid(ContentVerifierProvider contentVerifierProvider) {
        TBSCertList tBSCertList = this.x509CRL.getTBSCertList();
        if (CertUtils.isAlgIdEqual(tBSCertList.getSignature(), this.x509CRL.getSignatureAlgorithm())) {
            try {
                ContentVerifier contentVerifier = contentVerifierProvider.get(tBSCertList.getSignature());
                OutputStream outputStream = contentVerifier.getOutputStream();
                new DEROutputStream(outputStream).writeObject(tBSCertList);
                outputStream.close();
                return contentVerifier.verify(this.x509CRL.getSignature().getOctets());
            } catch (Exception e11) {
                throw new CertException("unable to process signature: " + e11.getMessage(), e11);
            }
        }
        throw new CertException("signature invalid - algorithm identifier mismatch");
    }

    public CertificateList toASN1Structure() {
        return this.x509CRL;
    }

    public X509CRLHolder(InputStream inputStream) {
        this(parseStream(inputStream));
    }

    public X509CRLHolder(CertificateList certificateList) {
        this.x509CRL = certificateList;
        Extensions extensions = certificateList.getTBSCertList().getExtensions();
        this.extensions = extensions;
        this.isIndirect = isIndirectCRL(extensions);
        this.issuerName = new GeneralNames(new GeneralName(certificateList.getIssuer()));
    }
}