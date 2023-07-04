package org.spongycastle.asn1;

import java.util.Objects;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;

/* loaded from: classes6.dex */
public class DERIA5String extends ASN1Primitive implements ASN1String {
    private final byte[] string;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DERIA5String(byte[] bArr) {
        this.string = bArr;
    }

    public static DERIA5String getInstance(Object obj) {
        if (obj != null && !(obj instanceof DERIA5String)) {
            if (obj instanceof byte[]) {
                try {
                    return (DERIA5String) ASN1Primitive.fromByteArray((byte[]) obj);
                } catch (Exception e11) {
                    throw new IllegalArgumentException("encoding error in getInstance: " + e11.toString());
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (DERIA5String) obj;
    }

    public static boolean isIA5String(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) > 127) {
                return false;
            }
        }
        return true;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof DERIA5String) {
            return Arrays.areEqual(this.string, ((DERIA5String) aSN1Primitive).string);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) {
        aSN1OutputStream.writeEncoded(22, this.string);
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

    public DERIA5String(String str) {
        this(str, false);
    }

    public DERIA5String(String str, boolean z11) {
        Objects.requireNonNull(str, "string cannot be null");
        if (z11 && !isIA5String(str)) {
            throw new IllegalArgumentException("string contains illegal characters");
        }
        this.string = Strings.toByteArray(str);
    }

    public static DERIA5String getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z11 && !(object instanceof DERIA5String)) {
            return new DERIA5String(((ASN1OctetString) object).getOctets());
        }
        return getInstance(object);
    }
}