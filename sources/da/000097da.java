package org.spongycastle.asn1;

/* loaded from: classes6.dex */
public class DLBitString extends ASN1BitString {
    protected DLBitString(byte b11, int i11) {
        this(toByteArray(b11), i11);
    }

    static DLBitString fromOctetString(byte[] bArr) {
        if (bArr.length >= 1) {
            byte b11 = bArr[0];
            int length = bArr.length - 1;
            byte[] bArr2 = new byte[length];
            if (length != 0) {
                System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
            }
            return new DLBitString(bArr2, b11);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    public static ASN1BitString getInstance(Object obj) {
        if (obj != null && !(obj instanceof DLBitString)) {
            if (obj instanceof DERBitString) {
                return (DERBitString) obj;
            }
            if (obj instanceof byte[]) {
                try {
                    return (ASN1BitString) ASN1Primitive.fromByteArray((byte[]) obj);
                } catch (Exception e11) {
                    throw new IllegalArgumentException("encoding error in getInstance: " + e11.toString());
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (DLBitString) obj;
    }

    private static byte[] toByteArray(byte b11) {
        return new byte[]{b11};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1BitString, org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) {
        byte[] bArr = this.data;
        int length = bArr.length + 1;
        byte[] bArr2 = new byte[length];
        bArr2[0] = (byte) getPadBits();
        System.arraycopy(bArr, 0, bArr2, 1, length - 1);
        aSN1OutputStream.writeEncoded(3, bArr2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public int encodedLength() {
        return StreamUtil.calculateBodyLength(this.data.length + 1) + 1 + this.data.length + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return false;
    }

    public DLBitString(byte[] bArr, int i11) {
        super(bArr, i11);
    }

    public DLBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public DLBitString(int i11) {
        super(ASN1BitString.getBytes(i11), ASN1BitString.getPadBits(i11));
    }

    public DLBitString(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER), 0);
    }

    public static ASN1BitString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z11 && !(object instanceof DLBitString)) {
            return fromOctetString(((ASN1OctetString) object).getOctets());
        }
        return getInstance(object);
    }
}