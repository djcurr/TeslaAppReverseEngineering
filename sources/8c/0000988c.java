package org.spongycastle.asn1.eac;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

/* loaded from: classes6.dex */
public class RSAPublicKey extends PublicKeyDataObject {
    private static int exponentValid = 2;
    private static int modulusValid = 1;
    private BigInteger exponent;
    private BigInteger modulus;
    private ASN1ObjectIdentifier usage;
    private int valid = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RSAPublicKey(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.usage = ASN1ObjectIdentifier.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            UnsignedInteger unsignedInteger = UnsignedInteger.getInstance(objects.nextElement());
            int tagNo = unsignedInteger.getTagNo();
            if (tagNo == 1) {
                setModulus(unsignedInteger);
            } else if (tagNo == 2) {
                setExponent(unsignedInteger);
            } else {
                throw new IllegalArgumentException("Unknown DERTaggedObject :" + unsignedInteger.getTagNo() + "-> not an Iso7816RSAPublicKeyStructure");
            }
        }
        if (this.valid != 3) {
            throw new IllegalArgumentException("missing argument -> not an Iso7816RSAPublicKeyStructure");
        }
    }

    private void setExponent(UnsignedInteger unsignedInteger) {
        int i11 = this.valid;
        int i12 = exponentValid;
        if ((i11 & i12) == 0) {
            this.valid = i11 | i12;
            this.exponent = unsignedInteger.getValue();
            return;
        }
        throw new IllegalArgumentException("Exponent already set");
    }

    private void setModulus(UnsignedInteger unsignedInteger) {
        int i11 = this.valid;
        int i12 = modulusValid;
        if ((i11 & i12) == 0) {
            this.valid = i11 | i12;
            this.modulus = unsignedInteger.getValue();
            return;
        }
        throw new IllegalArgumentException("Modulus already set");
    }

    public BigInteger getModulus() {
        return this.modulus;
    }

    public BigInteger getPublicExponent() {
        return this.exponent;
    }

    @Override // org.spongycastle.asn1.eac.PublicKeyDataObject
    public ASN1ObjectIdentifier getUsage() {
        return this.usage;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.usage);
        aSN1EncodableVector.add(new UnsignedInteger(1, getModulus()));
        aSN1EncodableVector.add(new UnsignedInteger(2, getPublicExponent()));
        return new DERSequence(aSN1EncodableVector);
    }

    public RSAPublicKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, BigInteger bigInteger, BigInteger bigInteger2) {
        this.usage = aSN1ObjectIdentifier;
        this.modulus = bigInteger;
        this.exponent = bigInteger2;
    }
}