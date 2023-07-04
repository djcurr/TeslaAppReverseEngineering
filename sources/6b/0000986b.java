package org.spongycastle.asn1.cryptopro;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;

/* loaded from: classes6.dex */
public class ECGOST3410ParamSetParameters extends ASN1Object {

    /* renamed from: a  reason: collision with root package name */
    ASN1Integer f43368a;

    /* renamed from: b  reason: collision with root package name */
    ASN1Integer f43369b;

    /* renamed from: p  reason: collision with root package name */
    ASN1Integer f43370p;

    /* renamed from: q  reason: collision with root package name */
    ASN1Integer f43371q;

    /* renamed from: x  reason: collision with root package name */
    ASN1Integer f43372x;

    /* renamed from: y  reason: collision with root package name */
    ASN1Integer f43373y;

    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i11, BigInteger bigInteger5) {
        this.f43368a = new ASN1Integer(bigInteger);
        this.f43369b = new ASN1Integer(bigInteger2);
        this.f43370p = new ASN1Integer(bigInteger3);
        this.f43371q = new ASN1Integer(bigInteger4);
        this.f43372x = new ASN1Integer(i11);
        this.f43373y = new ASN1Integer(bigInteger5);
    }

    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z11));
    }

    public BigInteger getA() {
        return this.f43368a.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f43370p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f43371q.getPositiveValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f43368a);
        aSN1EncodableVector.add(this.f43369b);
        aSN1EncodableVector.add(this.f43370p);
        aSN1EncodableVector.add(this.f43371q);
        aSN1EncodableVector.add(this.f43372x);
        aSN1EncodableVector.add(this.f43373y);
        return new DERSequence(aSN1EncodableVector);
    }

    public static ECGOST3410ParamSetParameters getInstance(Object obj) {
        if (obj != null && !(obj instanceof ECGOST3410ParamSetParameters)) {
            if (obj instanceof ASN1Sequence) {
                return new ECGOST3410ParamSetParameters((ASN1Sequence) obj);
            }
            throw new IllegalArgumentException("Invalid GOST3410Parameter: " + obj.getClass().getName());
        }
        return (ECGOST3410ParamSetParameters) obj;
    }

    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f43368a = (ASN1Integer) objects.nextElement();
        this.f43369b = (ASN1Integer) objects.nextElement();
        this.f43370p = (ASN1Integer) objects.nextElement();
        this.f43371q = (ASN1Integer) objects.nextElement();
        this.f43372x = (ASN1Integer) objects.nextElement();
        this.f43373y = (ASN1Integer) objects.nextElement();
    }
}