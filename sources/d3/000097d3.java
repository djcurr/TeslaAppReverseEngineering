package org.spongycastle.asn1;

/* loaded from: classes6.dex */
public class DERTaggedObject extends ASN1TaggedObject {
    private static final byte[] ZERO_BYTES = new byte[0];

    public DERTaggedObject(boolean z11, int i11, ASN1Encodable aSN1Encodable) {
        super(z11, i11, aSN1Encodable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1TaggedObject, org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) {
        if (!this.empty) {
            ASN1Primitive dERObject = this.obj.toASN1Primitive().toDERObject();
            if (this.explicit) {
                aSN1OutputStream.writeTag(160, this.tagNo);
                aSN1OutputStream.writeLength(dERObject.encodedLength());
                aSN1OutputStream.writeObject(dERObject);
                return;
            }
            aSN1OutputStream.writeTag(dERObject.isConstructed() ? 160 : 128, this.tagNo);
            aSN1OutputStream.writeImplicitObject(dERObject);
            return;
        }
        aSN1OutputStream.writeEncoded(160, this.tagNo, ZERO_BYTES);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public int encodedLength() {
        int calculateTagLength;
        if (!this.empty) {
            int encodedLength = this.obj.toASN1Primitive().toDERObject().encodedLength();
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

    public DERTaggedObject(int i11, ASN1Encodable aSN1Encodable) {
        super(true, i11, aSN1Encodable);
    }
}