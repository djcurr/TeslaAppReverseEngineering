package org.spongycastle.asn1;

import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;

/* loaded from: classes6.dex */
public class DERVisibleString extends ASN1Primitive implements ASN1String {
    private final byte[] string;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DERVisibleString(byte[] bArr) {
        this.string = bArr;
    }

    public static DERVisibleString getInstance(Object obj) {
        if (obj != null && !(obj instanceof DERVisibleString)) {
            if (obj instanceof byte[]) {
                try {
                    return (DERVisibleString) ASN1Primitive.fromByteArray((byte[]) obj);
                } catch (Exception e11) {
                    throw new IllegalArgumentException("encoding error in getInstance: " + e11.toString());
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (DERVisibleString) obj;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof DERVisibleString) {
            return Arrays.areEqual(this.string, ((DERVisibleString) aSN1Primitive).string);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) {
        aSN1OutputStream.writeEncoded(26, this.string);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public int encodedLength() {
        return StreamUtil.calculateBodyLength(this.string.length) + 1 + this.string.length;
    }

    public byte[] getOctets() {
        return Arrays.clone(this.string);
    }

    @Override // org.spongycastle.asn1.ASN1String
    public String getString() {
        return Strings.fromByteArray(this.string);
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

    public DERVisibleString(String str) {
        this.string = Strings.toByteArray(str);
    }

    public static DERVisibleString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z11 && !(object instanceof DERVisibleString)) {
            return new DERVisibleString(ASN1OctetString.getInstance(object).getOctets());
        }
        return getInstance(object);
    }
}