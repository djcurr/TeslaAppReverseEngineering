package org.spongycastle.asn1.dvcs;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.cmp.PKIStatusInfo;
import org.spongycastle.asn1.cms.ContentInfo;
import org.spongycastle.asn1.ess.ESSCertID;
import org.spongycastle.asn1.ocsp.CertID;
import org.spongycastle.asn1.ocsp.CertStatus;
import org.spongycastle.asn1.ocsp.OCSPResponse;
import org.spongycastle.asn1.smime.SMIMECapabilities;
import org.spongycastle.asn1.x509.Certificate;
import org.spongycastle.asn1.x509.CertificateList;
import org.spongycastle.asn1.x509.Extension;

/* loaded from: classes6.dex */
public class CertEtcToken extends ASN1Object implements ASN1Choice {
    public static final int TAG_ASSERTION = 3;
    public static final int TAG_CAPABILITIES = 8;
    public static final int TAG_CERTIFICATE = 0;
    public static final int TAG_CRL = 4;
    public static final int TAG_ESSCERTID = 1;
    public static final int TAG_OCSPCERTID = 6;
    public static final int TAG_OCSPCERTSTATUS = 5;
    public static final int TAG_OCSPRESPONSE = 7;
    public static final int TAG_PKISTATUS = 2;
    private static final boolean[] explicit = {false, true, false, true, false, true, false, false, true};
    private Extension extension;
    private int tagNo;
    private ASN1Encodable value;

    public CertEtcToken(int i11, ASN1Encodable aSN1Encodable) {
        this.tagNo = i11;
        this.value = aSN1Encodable;
    }

    public static CertEtcToken[] arrayFromSequence(ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        CertEtcToken[] certEtcTokenArr = new CertEtcToken[size];
        for (int i11 = 0; i11 != size; i11++) {
            certEtcTokenArr[i11] = getInstance(aSN1Sequence.getObjectAt(i11));
        }
        return certEtcTokenArr;
    }

    public static CertEtcToken getInstance(Object obj) {
        if (obj instanceof CertEtcToken) {
            return (CertEtcToken) obj;
        }
        if (obj instanceof ASN1TaggedObject) {
            return new CertEtcToken((ASN1TaggedObject) obj);
        }
        if (obj != null) {
            return new CertEtcToken(Extension.getInstance(obj));
        }
        return null;
    }

    public Extension getExtension() {
        return this.extension;
    }

    public int getTagNo() {
        return this.tagNo;
    }

    public ASN1Encodable getValue() {
        return this.value;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        Extension extension = this.extension;
        if (extension == null) {
            boolean[] zArr = explicit;
            int i11 = this.tagNo;
            return new DERTaggedObject(zArr[i11], i11, this.value);
        }
        return extension.toASN1Primitive();
    }

    public String toString() {
        return "CertEtcToken {\n" + this.value + "}\n";
    }

    public CertEtcToken(Extension extension) {
        this.tagNo = -1;
        this.extension = extension;
    }

    private CertEtcToken(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        this.tagNo = tagNo;
        switch (tagNo) {
            case 0:
                this.value = Certificate.getInstance(aSN1TaggedObject, false);
                return;
            case 1:
                this.value = ESSCertID.getInstance(aSN1TaggedObject.getObject());
                return;
            case 2:
                this.value = PKIStatusInfo.getInstance(aSN1TaggedObject, false);
                return;
            case 3:
                this.value = ContentInfo.getInstance(aSN1TaggedObject.getObject());
                return;
            case 4:
                this.value = CertificateList.getInstance(aSN1TaggedObject, false);
                return;
            case 5:
                this.value = CertStatus.getInstance(aSN1TaggedObject.getObject());
                return;
            case 6:
                this.value = CertID.getInstance(aSN1TaggedObject, false);
                return;
            case 7:
                this.value = OCSPResponse.getInstance(aSN1TaggedObject, false);
                return;
            case 8:
                this.value = SMIMECapabilities.getInstance(aSN1TaggedObject.getObject());
                return;
            default:
                throw new IllegalArgumentException("Unknown tag: " + this.tagNo);
        }
    }
}