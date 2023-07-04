package org.spongycastle.asn1.x9;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.math.ec.ECFieldElement;

/* loaded from: classes5.dex */
public class X9FieldElement extends ASN1Object {
    private static X9IntegerConverter converter = new X9IntegerConverter();

    /* renamed from: f  reason: collision with root package name */
    protected ECFieldElement f43425f;

    public X9FieldElement(ECFieldElement eCFieldElement) {
        this.f43425f = eCFieldElement;
    }

    public ECFieldElement getValue() {
        return this.f43425f;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DEROctetString(converter.integerToBytes(this.f43425f.toBigInteger(), converter.getByteLength(this.f43425f)));
    }

    public X9FieldElement(BigInteger bigInteger, ASN1OctetString aSN1OctetString) {
        this(new ECFieldElement.Fp(bigInteger, new BigInteger(1, aSN1OctetString.getOctets())));
    }

    public X9FieldElement(int i11, int i12, int i13, int i14, ASN1OctetString aSN1OctetString) {
        this(new ECFieldElement.F2m(i11, i12, i13, i14, new BigInteger(1, aSN1OctetString.getOctets())));
    }
}