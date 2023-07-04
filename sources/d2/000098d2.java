package org.spongycastle.asn1.ocsp;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DERTaggedObject;

/* loaded from: classes5.dex */
public class CertStatus extends ASN1Object implements ASN1Choice {
    private int tagNo;
    private ASN1Encodable value;

    public CertStatus() {
        this.tagNo = 0;
        this.value = DERNull.INSTANCE;
    }

    public static CertStatus getInstance(Object obj) {
        if (obj != null && !(obj instanceof CertStatus)) {
            if (obj instanceof ASN1TaggedObject) {
                return new CertStatus((ASN1TaggedObject) obj);
            }
            throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
        }
        return (CertStatus) obj;
    }

    public ASN1Encodable getStatus() {
        return this.value;
    }

    public int getTagNo() {
        return this.tagNo;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(false, this.tagNo, this.value);
    }

    public CertStatus(RevokedInfo revokedInfo) {
        this.tagNo = 1;
        this.value = revokedInfo;
    }

    public static CertStatus getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(aSN1TaggedObject.getObject());
    }

    public CertStatus(int i11, ASN1Encodable aSN1Encodable) {
        this.tagNo = i11;
        this.value = aSN1Encodable;
    }

    private CertStatus(ASN1TaggedObject aSN1TaggedObject) {
        this.tagNo = aSN1TaggedObject.getTagNo();
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            this.value = DERNull.INSTANCE;
        } else if (tagNo == 1) {
            this.value = RevokedInfo.getInstance(aSN1TaggedObject, false);
        } else if (tagNo == 2) {
            this.value = DERNull.INSTANCE;
        } else {
            throw new IllegalArgumentException("Unknown tag encountered: " + aSN1TaggedObject.getTagNo());
        }
    }
}