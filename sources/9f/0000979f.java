package org.spongycastle.asn1;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class ASN1TaggedObject extends ASN1Primitive implements ASN1TaggedObjectParser {
    boolean empty = false;
    boolean explicit;
    ASN1Encodable obj;
    int tagNo;

    public ASN1TaggedObject(boolean z11, int i11, ASN1Encodable aSN1Encodable) {
        this.explicit = true;
        this.obj = null;
        if (aSN1Encodable instanceof ASN1Choice) {
            this.explicit = true;
        } else {
            this.explicit = z11;
        }
        this.tagNo = i11;
        if (this.explicit) {
            this.obj = aSN1Encodable;
            return;
        }
        boolean z12 = aSN1Encodable.toASN1Primitive() instanceof ASN1Set;
        this.obj = aSN1Encodable;
    }

    public static ASN1TaggedObject getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        if (z11) {
            return (ASN1TaggedObject) aSN1TaggedObject.getObject();
        }
        throw new IllegalArgumentException("implicitly tagged tagged object");
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
            if (this.tagNo == aSN1TaggedObject.tagNo && this.empty == aSN1TaggedObject.empty && this.explicit == aSN1TaggedObject.explicit) {
                ASN1Encodable aSN1Encodable = this.obj;
                return aSN1Encodable == null ? aSN1TaggedObject.obj == null : aSN1Encodable.toASN1Primitive().equals(aSN1TaggedObject.obj.toASN1Primitive());
            }
            return false;
        }
        return false;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public abstract void encode(ASN1OutputStream aSN1OutputStream);

    @Override // org.spongycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        return toASN1Primitive();
    }

    public ASN1Primitive getObject() {
        ASN1Encodable aSN1Encodable = this.obj;
        if (aSN1Encodable != null) {
            return aSN1Encodable.toASN1Primitive();
        }
        return null;
    }

    @Override // org.spongycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable getObjectParser(int i11, boolean z11) {
        if (i11 != 4) {
            if (i11 != 16) {
                if (i11 != 17) {
                    if (z11) {
                        return getObject();
                    }
                    throw new ASN1Exception("implicit tagging not implemented for tag: " + i11);
                }
                return ASN1Set.getInstance(this, z11).parser();
            }
            return ASN1Sequence.getInstance(this, z11).parser();
        }
        return ASN1OctetString.getInstance(this, z11).parser();
    }

    @Override // org.spongycastle.asn1.ASN1TaggedObjectParser
    public int getTagNo() {
        return this.tagNo;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive, org.spongycastle.asn1.ASN1Object
    public int hashCode() {
        int i11 = this.tagNo;
        ASN1Encodable aSN1Encodable = this.obj;
        return aSN1Encodable != null ? i11 ^ aSN1Encodable.hashCode() : i11;
    }

    public boolean isEmpty() {
        return this.empty;
    }

    public boolean isExplicit() {
        return this.explicit;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return new DERTaggedObject(this.explicit, this.tagNo, this.obj);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return new DLTaggedObject(this.explicit, this.tagNo, this.obj);
    }

    public String toString() {
        return "[" + this.tagNo + "]" + this.obj;
    }

    public static ASN1TaggedObject getInstance(Object obj) {
        if (obj != null && !(obj instanceof ASN1TaggedObject)) {
            if (obj instanceof byte[]) {
                try {
                    return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
                } catch (IOException e11) {
                    throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e11.getMessage());
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        return (ASN1TaggedObject) obj;
    }
}