package org.spongycastle.asn1;

import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;

/* loaded from: classes6.dex */
public class DERT61UTF8String extends ASN1Primitive implements ASN1String {
    private byte[] string;

    public DERT61UTF8String(byte[] bArr) {
        this.string = bArr;
    }

    public static DERT61UTF8String getInstance(Object obj) {
        if (obj instanceof DERT61String) {
            return new DERT61UTF8String(((DERT61String) obj).getOctets());
        }
        if (obj != null && !(obj instanceof DERT61UTF8String)) {
            if (obj instanceof byte[]) {
                try {
                    return new DERT61UTF8String(((DERT61String) ASN1Primitive.fromByteArray((byte[]) obj)).getOctets());
                } catch (Exception e11) {
                    throw new IllegalArgumentException("encoding error in getInstance: " + e11.toString());
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (DERT61UTF8String) obj;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof DERT61UTF8String) {
            return Arrays.areEqual(this.string, ((DERT61UTF8String) aSN1Primitive).string);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) {
        aSN1OutputStream.writeEncoded(20, this.string);
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
        return Strings.fromUTF8ByteArray(this.string);
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

    public DERT61UTF8String(String str) {
        this(Strings.toUTF8ByteArray(str));
    }

    public static DERT61UTF8String getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z11 && !(object instanceof DERT61String) && !(object instanceof DERT61UTF8String)) {
            return new DERT61UTF8String(ASN1OctetString.getInstance(object).getOctets());
        }
        return getInstance(object);
    }
}