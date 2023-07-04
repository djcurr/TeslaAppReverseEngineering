package org.spongycastle.asn1;

import java.util.Enumeration;

/* loaded from: classes6.dex */
public class BERTaggedObject extends ASN1TaggedObject {
    public BERTaggedObject(int i11, ASN1Encodable aSN1Encodable) {
        super(true, i11, aSN1Encodable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1TaggedObject, org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) {
        Enumeration objects;
        aSN1OutputStream.writeTag(160, this.tagNo);
        aSN1OutputStream.write(128);
        if (!this.empty) {
            if (!this.explicit) {
                ASN1Encodable aSN1Encodable = this.obj;
                if (aSN1Encodable instanceof ASN1OctetString) {
                    if (aSN1Encodable instanceof BEROctetString) {
                        objects = ((BEROctetString) aSN1Encodable).getObjects();
                    } else {
                        objects = new BEROctetString(((ASN1OctetString) aSN1Encodable).getOctets()).getObjects();
                    }
                } else if (aSN1Encodable instanceof ASN1Sequence) {
                    objects = ((ASN1Sequence) aSN1Encodable).getObjects();
                } else if (aSN1Encodable instanceof ASN1Set) {
                    objects = ((ASN1Set) aSN1Encodable).getObjects();
                } else {
                    throw new ASN1Exception("not implemented: " + this.obj.getClass().getName());
                }
                while (objects.hasMoreElements()) {
                    aSN1OutputStream.writeObject((ASN1Encodable) objects.nextElement());
                }
            } else {
                aSN1OutputStream.writeObject(this.obj);
            }
        }
        aSN1OutputStream.write(0);
        aSN1OutputStream.write(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public int encodedLength() {
        int calculateTagLength;
        if (!this.empty) {
            int encodedLength = this.obj.toASN1Primitive().encodedLength();
            if (this.explicit) {
                calculateTagLength = StreamUtil.calculateTagLength(this.tagNo) + StreamUtil.calculateBodyLength(encodedLength);
            } else {
                encodedLength--;
                calculateTagLength = StreamUtil.calculateTagLength(this.tagNo);
            }
            return calculateTagLength + encodedLength;
        }
        return StreamUtil.calculateTagLength(this.tagNo) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        if (this.empty || this.explicit) {
            return true;
        }
        return this.obj.toASN1Primitive().toDERObject().isConstructed();
    }

    public BERTaggedObject(boolean z11, int i11, ASN1Encodable aSN1Encodable) {
        super(z11, i11, aSN1Encodable);
    }

    public BERTaggedObject(int i11) {
        super(false, i11, new BERSequence());
    }
}