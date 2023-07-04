package org.spongycastle.asn1.oiw;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

/* loaded from: classes5.dex */
public class ElGamalParameter extends ASN1Object {

    /* renamed from: g  reason: collision with root package name */
    ASN1Integer f43381g;

    /* renamed from: p  reason: collision with root package name */
    ASN1Integer f43382p;

    public ElGamalParameter(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f43382p = new ASN1Integer(bigInteger);
        this.f43381g = new ASN1Integer(bigInteger2);
    }

    public static ElGamalParameter getInstance(Object obj) {
        if (obj instanceof ElGamalParameter) {
            return (ElGamalParameter) obj;
        }
        if (obj != null) {
            return new ElGamalParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f43381g.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f43382p.getPositiveValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f43382p);
        aSN1EncodableVector.add(this.f43381g);
        return new DERSequence(aSN1EncodableVector);
    }

    private ElGamalParameter(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f43382p = (ASN1Integer) objects.nextElement();
        this.f43381g = (ASN1Integer) objects.nextElement();
    }
}