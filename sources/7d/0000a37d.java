package org.spongycastle.pkcs;

import java.io.OutputStream;
import java.util.ArrayList;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.pkcs.Attribute;
import org.spongycastle.asn1.pkcs.CertificationRequest;
import org.spongycastle.asn1.pkcs.CertificationRequestInfo;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.operator.ContentVerifier;
import org.spongycastle.operator.ContentVerifierProvider;

/* loaded from: classes4.dex */
public class PKCS10CertificationRequest {
    private static Attribute[] EMPTY_ARRAY = new Attribute[0];
    private CertificationRequest certificationRequest;

    public PKCS10CertificationRequest(CertificationRequest certificationRequest) {
        this.certificationRequest = certificationRequest;
    }

    private static CertificationRequest parseBytes(byte[] bArr) {
        try {
            return CertificationRequest.getInstance(ASN1Primitive.fromByteArray(bArr));
        } catch (ClassCastException e11) {
            throw new PKCSIOException("malformed data: " + e11.getMessage(), e11);
        } catch (IllegalArgumentException e12) {
            throw new PKCSIOException("malformed data: " + e12.getMessage(), e12);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PKCS10CertificationRequest) {
            return toASN1Structure().equals(((PKCS10CertificationRequest) obj).toASN1Structure());
        }
        return false;
    }

    public Attribute[] getAttributes() {
        ASN1Set attributes = this.certificationRequest.getCertificationRequestInfo().getAttributes();
        if (attributes == null) {
            return EMPTY_ARRAY;
        }
        Attribute[] attributeArr = new Attribute[attributes.size()];
        for (int i11 = 0; i11 != attributes.size(); i11++) {
            attributeArr[i11] = Attribute.getInstance(attributes.getObjectAt(i11));
        }
        return attributeArr;
    }

    public byte[] getEncoded() {
        return this.certificationRequest.getEncoded();
    }

    public byte[] getSignature() {
        return this.certificationRequest.getSignature().getOctets();
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return this.certificationRequest.getSignatureAlgorithm();
    }

    public X500Name getSubject() {
        return X500Name.getInstance(this.certificationRequest.getCertificationRequestInfo().getSubject());
    }

    public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.certificationRequest.getCertificationRequestInfo().getSubjectPublicKeyInfo();
    }

    public int hashCode() {
        return toASN1Structure().hashCode();
    }

    public boolean isSignatureValid(ContentVerifierProvider contentVerifierProvider) {
        CertificationRequestInfo certificationRequestInfo = this.certificationRequest.getCertificationRequestInfo();
        try {
            ContentVerifier contentVerifier = contentVerifierProvider.get(this.certificationRequest.getSignatureAlgorithm());
            OutputStream outputStream = contentVerifier.getOutputStream();
            outputStream.write(certificationRequestInfo.getEncoded(ASN1Encoding.DER));
            outputStream.close();
            return contentVerifier.verify(getSignature());
        } catch (Exception e11) {
            throw new PKCSException("unable to process signature: " + e11.getMessage(), e11);
        }
    }

    public CertificationRequest toASN1Structure() {
        return this.certificationRequest;
    }

    public PKCS10CertificationRequest(byte[] bArr) {
        this(parseBytes(bArr));
    }

    public Attribute[] getAttributes(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        ASN1Set attributes = this.certificationRequest.getCertificationRequestInfo().getAttributes();
        if (attributes == null) {
            return EMPTY_ARRAY;
        }
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