package org.spongycastle.cert;

import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROutputStream;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.AttCertValidityPeriod;
import org.spongycastle.asn1.x509.Attribute;
import org.spongycastle.asn1.x509.AttributeCertificate;
import org.spongycastle.asn1.x509.AttributeCertificateInfo;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.operator.ContentVerifier;
import org.spongycastle.operator.ContentVerifierProvider;
import org.spongycastle.util.Encodable;

/* loaded from: classes5.dex */
public class X509AttributeCertificateHolder implements Encodable {
    private static Attribute[] EMPTY_ARRAY = new Attribute[0];
    private AttributeCertificate attrCert;
    private Extensions extensions;

    public X509AttributeCertificateHolder(byte[] bArr) {
        this(parseBytes(bArr));
    }

    private static AttributeCertificate parseBytes(byte[] bArr) {
        try {
            return AttributeCertificate.getInstance(ASN1Primitive.fromByteArray(bArr));
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
        if (obj instanceof X509AttributeCertificateHolder) {
            return this.attrCert.equals(((X509AttributeCertificateHolder) obj).attrCert);
        }
        return false;
    }

    public Attribute[] getAttributes() {
        ASN1Sequence attributes = this.attrCert.getAcinfo().getAttributes();
        Attribute[] attributeArr = new Attribute[attributes.size()];
        for (int i11 = 0; i11 != attributes.size(); i11++) {
            attributeArr[i11] = Attribute.getInstance(attributes.getObjectAt(i11));
        }
        return attributeArr;
    }

    public Set getCriticalExtensionOIDs() {
        return CertUtils.getCriticalExtensionOIDs(this.extensions);
    }

    @Override // org.spongycastle.util.Encodable
    public byte[] getEncoded() {
        return this.attrCert.getEncoded();
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

    public AttributeCertificateHolder getHolder() {
        return new AttributeCertificateHolder((ASN1Sequence) this.attrCert.getAcinfo().getHolder().toASN1Primitive());
    }

    public AttributeCertificateIssuer getIssuer() {
        return new AttributeCertificateIssuer(this.attrCert.getAcinfo().getIssuer());
    }

    public boolean[] getIssuerUniqueID() {
        return CertUtils.bitStringToBoolean(this.attrCert.getAcinfo().getIssuerUniqueID());
    }

    public Set getNonCriticalExtensionOIDs() {
        return CertUtils.getNonCriticalExtensionOIDs(this.extensions);
    }

    public Date getNotAfter() {
        return CertUtils.recoverDate(this.attrCert.getAcinfo().getAttrCertValidityPeriod().getNotAfterTime());
    }

    public Date getNotBefore() {
        return CertUtils.recoverDate(this.attrCert.getAcinfo().getAttrCertValidityPeriod().getNotBeforeTime());
    }

    public BigInteger getSerialNumber() {
        return this.attrCert.getAcinfo().getSerialNumber().getValue();
    }

    public byte[] getSignature() {
        return this.attrCert.getSignatureValue().getOctets();
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return this.attrCert.getSignatureAlgorithm();
    }

    public int getVersion() {
        return this.attrCert.getAcinfo().getVersion().getValue().intValue() + 1;
    }

    public boolean hasExtensions() {
        return this.extensions != null;
    }

    public int hashCode() {
        return this.attrCert.hashCode();
    }

    public boolean isSignatureValid(ContentVerifierProvider contentVerifierProvider) {
        AttributeCertificateInfo acinfo = this.attrCert.getAcinfo();
        if (CertUtils.isAlgIdEqual(acinfo.getSignature(), this.attrCert.getSignatureAlgorithm())) {
            try {
                ContentVerifier contentVerifier = contentVerifierProvider.get(acinfo.getSignature());
                OutputStream outputStream = contentVerifier.getOutputStream();
                new DEROutputStream(outputStream).writeObject(acinfo);
                outputStream.close();
                return contentVerifier.verify(getSignature());
            } catch (Exception e11) {
                throw new CertException("unable to process signature: " + e11.getMessage(), e11);
            }
        }
        throw new CertException("signature invalid - algorithm identifier mismatch");
    }

    public boolean isValidOn(Date date) {
        AttCertValidityPeriod attrCertValidityPeriod = this.attrCert.getAcinfo().getAttrCertValidityPeriod();
        return (date.before(CertUtils.recoverDate(attrCertValidityPeriod.getNotBeforeTime())) || date.after(CertUtils.recoverDate(attrCertValidityPeriod.getNotAfterTime()))) ? false : true;
    }

    public AttributeCertificate toASN1Structure() {
        return this.attrCert;
    }

    public X509AttributeCertificateHolder(AttributeCertificate attributeCertificate) {
        this.attrCert = attributeCertificate;
        this.extensions = attributeCertificate.getAcinfo().getExtensions();
    }

    public Attribute[] getAttributes(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        ASN1Sequence attributes = this.attrCert.getAcinfo().getAttributes();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 != attributes.size(); i11++) {
            Attribute attribute = Attribute.getInstance(attributes.getObjectAt(i11));
            if (attribute.getAttrType().equals(aSN1ObjectIdentifier)) {
                arrayList.add(attribute);
            }
        }
        if (arrayList.size() == 0) {
            return EMPTY_ARRAY;
        }
        return (Attribute[]) arrayList.toArray(new Attribute[arrayList.size()]);
    }
}