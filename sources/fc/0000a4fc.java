package org.spongycastle.x509;

import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.DERSet;
import org.spongycastle.asn1.x509.Attribute;

/* loaded from: classes4.dex */
public class X509Attribute extends ASN1Object {
    Attribute attr;

    public X509Attribute(ASN1Encodable aSN1Encodable) {
        this.attr = Attribute.getInstance(aSN1Encodable);
    }

    public String getOID() {
        return this.attr.getAttrType().getId();
    }

    public ASN1Encodable[] getValues() {
        ASN1Set attrValues = this.attr.getAttrValues();
        ASN1Encodable[] aSN1EncodableArr = new ASN1Encodable[attrValues.size()];
        for (int i11 = 0; i11 != attrValues.size(); i11++) {
            aSN1EncodableArr[i11] = attrValues.getObjectAt(i11);
        }
        return aSN1EncodableArr;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.attr.toASN1Primitive();
    }

    public X509Attribute(String str, ASN1Encodable aSN1Encodable) {
        this.attr = new Attribute(new ASN1ObjectIdentifier(str), new DERSet(aSN1Encodable));
    }

    public X509Attribute(String str, ASN1EncodableVector aSN1EncodableVector) {
        this.attr = new Attribute(new ASN1ObjectIdentifier(str), new DERSet(aSN1EncodableVector));
    }
}