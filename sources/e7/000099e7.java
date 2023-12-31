package org.spongycastle.cert;

import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DEROutputStream;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.Certificate;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x509.TBSCertificate;
import org.spongycastle.operator.ContentVerifier;
import org.spongycastle.operator.ContentVerifierProvider;
import org.spongycastle.util.Encodable;

/* loaded from: classes5.dex */
public class X509CertificateHolder implements Encodable {
    private Extensions extensions;
    private Certificate x509Certificate;

    public X509CertificateHolder(byte[] bArr) {
        this(parseBytes(bArr));
    }

    private static Certificate parseBytes(byte[] bArr) {
        try {
            return Certificate.getInstance(ASN1Primitive.fromByteArray(bArr));
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
        if (obj instanceof X509CertificateHolder) {
            return this.x509Certificate.equals(((X509CertificateHolder) obj).x509Certificate);
        }
        return false;
    }

    public Set getCriticalExtensionOIDs() {
        return CertUtils.getCriticalExtensionOIDs(this.extensions);
    }

    @Override // org.spongycastle.util.Encodable
    public byte[] getEncoded() {
        return this.x509Certificate.getEncoded();
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
        return X500Name.getInstance(this.x509Certificate.getIssuer());
    }

    public Set getNonCriticalExtensionOIDs() {
        return CertUtils.getNonCriticalExtensionOIDs(this.extensions);
    }

    public Date getNotAfter() {
        return this.x509Certificate.getEndDate().getDate();
    }

    public Date getNotBefore() {
        return this.x509Certificate.getStartDate().getDate();
    }

    public BigInteger getSerialNumber() {
        return this.x509Certificate.getSerialNumber().getValue();
    }

    public byte[] getSignature() {
        return this.x509Certificate.getSignature().getOctets();
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return this.x509Certificate.getSignatureAlgorithm();
    }

    public X500Name getSubject() {
        return X500Name.getInstance(this.x509Certificate.getSubject());
    }

    public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.x509Certificate.getSubjectPublicKeyInfo();
    }

    public int getVersion() {
        return this.x509Certificate.getVersionNumber();
    }

    public int getVersionNumber() {
        return this.x509Certificate.getVersionNumber();
    }

    public boolean hasExtensions() {
        return this.extensions != null;
    }

    public int hashCode() {
        return this.x509Certificate.hashCode();
    }

    public boolean isSignatureValid(ContentVerifierProvider contentVerifierProvider) {
        TBSCertificate tBSCertificate = this.x509Certificate.getTBSCertificate();
        if (CertUtils.isAlgIdEqual(tBSCertificate.getSignature(), this.x509Certificate.getSignatureAlgorithm())) {
            try {
                ContentVerifier contentVerifier = contentVerifierProvider.get(tBSCertificate.getSignature());
                OutputStream outputStream = contentVerifier.getOutputStream();
                new DEROutputStream(outputStream).writeObject(tBSCertificate);
                outputStream.close();
                return contentVerifier.verify(getSignature());
            } catch (Exception e11) {
                throw new CertException("unable to process signature: " + e11.getMessage(), e11);
            }
        }
        throw new CertException("signature invalid - algorithm identifier mismatch");
    }

    public boolean isValidOn(Date date) {
        return (date.before(this.x509Certificate.getStartDate().getDate()) || date.after(this.x509Certificate.getEndDate().getDate())) ? false : true;
    }

    public Certificate toASN1Structure() {
        return this.x509Certificate;
    }

    public X509CertificateHolder(Certificate certificate) {
        this.x509Certificate = certificate;
        this.extensions = certificate.getTBSCertificate().getExtensions();
    }
}