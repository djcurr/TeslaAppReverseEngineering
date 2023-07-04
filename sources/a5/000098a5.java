package org.spongycastle.asn1.esf;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.Attribute;
import org.spongycastle.asn1.x509.AttributeCertificate;

/* loaded from: classes6.dex */
public class SignerAttribute extends ASN1Object {
    private Object[] values;

    private SignerAttribute(ASN1Sequence aSN1Sequence) {
        this.values = new Object[aSN1Sequence.size()];
        Enumeration objects = aSN1Sequence.getObjects();
        int i11 = 0;
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objects.nextElement());
            if (aSN1TaggedObject.getTagNo() == 0) {
                ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1TaggedObject, true);
                int size = aSN1Sequence2.size();
                Attribute[] attributeArr = new Attribute[size];
                for (int i12 = 0; i12 != size; i12++) {
                    attributeArr[i12] = Attribute.getInstance(aSN1Sequence2.getObjectAt(i12));
                }
                this.values[i11] = attributeArr;
            } else if (aSN1TaggedObject.getTagNo() == 1) {
                this.values[i11] = AttributeCertificate.getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, true));
            } else {
                throw new IllegalArgumentException("illegal tag: " + aSN1TaggedObject.getTagNo());
            }
            i11++;
        }
    }

    public static SignerAttribute getInstance(Object obj) {
        if (obj instanceof SignerAttribute) {
            return (SignerAttribute) obj;
        }
        if (obj != null) {
            return new SignerAttribute(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Object[] getValues() {
        Object[] objArr = this.values;
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        return objArr2;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        int i11 = 0;
        while (true) {
            Object[] objArr = this.values;
            if (i11 != objArr.length) {
                if (objArr[i11] instanceof Attribute[]) {
                    aSN1EncodableVector.add(new DERTaggedObject(0, new DERSequence((Attribute[]) this.values[i11])));
                } else {
                    aSN1EncodableVector.add(new DERTaggedObject(1, (AttributeCertificate) this.values[i11]));
                }
                i11++;
            } else {
                return new DERSequence(aSN1EncodableVector);
            }
        }
    }

    public SignerAttribute(Attribute[] attributeArr) {
        this.values = r0;
        Object[] objArr = {attributeArr};
    }

    public SignerAttribute(AttributeCertificate attributeCertificate) {
        this.values = r0;
        Object[] objArr = {attributeCertificate};
    }
}