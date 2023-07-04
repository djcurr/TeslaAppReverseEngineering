package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;

/* loaded from: classes6.dex */
public class DERExternal extends ASN1Primitive {
    private ASN1Primitive dataValueDescriptor;
    private ASN1ObjectIdentifier directReference;
    private int encoding;
    private ASN1Primitive externalContent;
    private ASN1Integer indirectReference;

    public DERExternal(ASN1EncodableVector aSN1EncodableVector) {
        int i11 = 0;
        ASN1Primitive objFromVector = getObjFromVector(aSN1EncodableVector, 0);
        if (objFromVector instanceof ASN1ObjectIdentifier) {
            this.directReference = (ASN1ObjectIdentifier) objFromVector;
            objFromVector = getObjFromVector(aSN1EncodableVector, 1);
            i11 = 1;
        }
        if (objFromVector instanceof ASN1Integer) {
            this.indirectReference = (ASN1Integer) objFromVector;
            i11++;
            objFromVector = getObjFromVector(aSN1EncodableVector, i11);
        }
        if (!(objFromVector instanceof ASN1TaggedObject)) {
            this.dataValueDescriptor = objFromVector;
            i11++;
            objFromVector = getObjFromVector(aSN1EncodableVector, i11);
        }
        if (aSN1EncodableVector.size() == i11 + 1) {
            if (objFromVector instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objFromVector;
                setEncoding(aSN1TaggedObject.getTagNo());
                this.externalContent = aSN1TaggedObject.getObject();
                return;
            }
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        throw new IllegalArgumentException("input vector too large");
    }

    private ASN1Primitive getObjFromVector(ASN1EncodableVector aSN1EncodableVector, int i11) {
        if (aSN1EncodableVector.size() > i11) {
            return aSN1EncodableVector.get(i11).toASN1Primitive();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    private void setDataValueDescriptor(ASN1Primitive aSN1Primitive) {
        this.dataValueDescriptor = aSN1Primitive;
    }

    private void setDirectReference(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.directReference = aSN1ObjectIdentifier;
    }

    private void setEncoding(int i11) {
        if (i11 >= 0 && i11 <= 2) {
            this.encoding = i11;
            return;
        }
        throw new IllegalArgumentException("invalid encoding value: " + i11);
    }

    private void setExternalContent(ASN1Primitive aSN1Primitive) {
        this.externalContent = aSN1Primitive;
    }

    private void setIndirectReference(ASN1Integer aSN1Integer) {
        this.indirectReference = aSN1Integer;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        ASN1Primitive aSN1Primitive2;
        ASN1Integer aSN1Integer;
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        if (aSN1Primitive instanceof DERExternal) {
            if (this == aSN1Primitive) {
                return true;
            }
            DERExternal dERExternal = (DERExternal) aSN1Primitive;
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = this.directReference;
            if (aSN1ObjectIdentifier2 == null || ((aSN1ObjectIdentifier = dERExternal.directReference) != null && aSN1ObjectIdentifier.equals(aSN1ObjectIdentifier2))) {
                ASN1Integer aSN1Integer2 = this.indirectReference;
                if (aSN1Integer2 == null || ((aSN1Integer = dERExternal.indirectReference) != null && aSN1Integer.equals(aSN1Integer2))) {
                    ASN1Primitive aSN1Primitive3 = this.dataValueDescriptor;
                    if (aSN1Primitive3 == null || ((aSN1Primitive2 = dERExternal.dataValueDescriptor) != null && aSN1Primitive2.equals(aSN1Primitive3))) {
                        return this.externalContent.equals(dERExternal.externalContent);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.directReference;
        if (aSN1ObjectIdentifier != null) {
            byteArrayOutputStream.write(aSN1ObjectIdentifier.getEncoded(ASN1Encoding.DER));
        }
        ASN1Integer aSN1Integer = this.indirectReference;
        if (aSN1Integer != null) {
            byteArrayOutputStream.write(aSN1Integer.getEncoded(ASN1Encoding.DER));
        }
        ASN1Primitive aSN1Primitive = this.dataValueDescriptor;
        if (aSN1Primitive != null) {
            byteArrayOutputStream.write(aSN1Primitive.getEncoded(ASN1Encoding.DER));
        }
        byteArrayOutputStream.write(new DERTaggedObject(true, this.encoding, this.externalContent).getEncoded(ASN1Encoding.DER));
        aSN1OutputStream.writeEncoded(32, 8, byteArrayOutputStream.toByteArray());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public int encodedLength() {
        return getEncoded().length;
    }

    public ASN1Primitive getDataValueDescriptor() {
        return this.dataValueDescriptor;
    }

    public ASN1ObjectIdentifier getDirectReference() {
        return this.directReference;
    }

    public int getEncoding() {
        return this.encoding;
    }

    public ASN1Primitive getExternalContent() {
        return this.externalContent;
    }

    public ASN1Integer getIndirectReference() {
        return this.indirectReference;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive, org.spongycastle.asn1.ASN1Object
    public int hashCode() {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.directReference;
        int hashCode = aSN1ObjectIdentifier != null ? aSN1ObjectIdentifier.hashCode() : 0;
        ASN1Integer aSN1Integer = this.indirectReference;
        if (aSN1Integer != null) {
            hashCode ^= aSN1Integer.hashCode();
        }
        ASN1Primitive aSN1Primitive = this.dataValueDescriptor;
        if (aSN1Primitive != null) {
            hashCode ^= aSN1Primitive.hashCode();
        }
        return hashCode ^ this.externalContent.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return true;
    }

    public DERExternal(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Integer aSN1Integer, ASN1Primitive aSN1Primitive, DERTaggedObject dERTaggedObject) {
        this(aSN1ObjectIdentifier, aSN1Integer, aSN1Primitive, dERTaggedObject.getTagNo(), dERTaggedObject.toASN1Primitive());
    }

    public DERExternal(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Integer aSN1Integer, ASN1Primitive aSN1Primitive, int i11, ASN1Primitive aSN1Primitive2) {
        setDirectReference(aSN1ObjectIdentifier);
        setIndirectReference(aSN1Integer);
        setDataValueDescriptor(aSN1Primitive);
        setEncoding(i11);
        setExternalContent(aSN1Primitive2.toASN1Primitive());
    }
}