package org.spongycastle.asn1;

import org.spongycastle.util.Arrays;

/* loaded from: classes6.dex */
public class DERBMPString extends ASN1Primitive implements ASN1String {
    private final char[] string;

    DERBMPString(byte[] bArr) {
        int length = bArr.length / 2;
        char[] cArr = new char[length];
        for (int i11 = 0; i11 != length; i11++) {
            int i12 = i11 * 2;
            cArr[i11] = (char) ((bArr[i12 + 1] & 255) | (bArr[i12] << 8));
        }
        this.string = cArr;
    }

    public static DERBMPString getInstance(Object obj) {
        if (obj != null && !(obj instanceof DERBMPString)) {
            if (obj instanceof byte[]) {
                try {
                    return (DERBMPString) ASN1Primitive.fromByteArray((byte[]) obj);
                } catch (Exception e11) {
                    throw new IllegalArgumentException("encoding error in getInstance: " + e11.toString());
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (DERBMPString) obj;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    protected boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof DERBMPString) {
            return Arrays.areEqual(this.string, ((DERBMPString) aSN1Primitive).string);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) {
        aSN1OutputStream.write(30);
        aSN1OutputStream.writeLength(this.string.length * 2);
        int i11 = 0;
        while (true) {
            char[] cArr = this.string;
            if (i11 == cArr.length) {
                return;
            }
            char c11 = cArr[i11];
            aSN1OutputStream.write((byte) (c11 >> '\b'));
            aSN1OutputStream.write((byte) c11);
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public int encodedLength() {
        return StreamUtil.calculateBodyLength(this.string.length * 2) + 1 + (this.string.length * 2);
    }

    @Override // org.spongycastle.asn1.ASN1String
    public String getString() {
        return new String(this.string);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive, org.spongycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.string);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return false;
    }

    public String toString() {
        return getString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DERBMPString(char[] cArr) {
        this.string = cArr;
    }

    public DERBMPString(String str) {
        this.string = str.toCharArray();
    }

    public static DERBMPString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z11 && !(object instanceof DERBMPString)) {
            return new DERBMPString(ASN1OctetString.getInstance(object).getOctets());
        }
        return getInstance(object);
    }
}