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
public class GOST3410ParamSetParameters extends ASN1Object {

    /* renamed from: a  reason: collision with root package name */
    ASN1Integer f43375a;
    int keySize;

    /* renamed from: p  reason: collision with root package name */
    ASN1Integer f43376p;

    /* renamed from: q  reason: collision with root package name */
    ASN1Integer f43377q;

    public GOST3410ParamSetParameters(int i11, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.keySize = i11;
        this.f43376p = new ASN1Integer(bigInteger);
        this.f43377q = new ASN1Integer(bigInteger2);
        this.f43375a = new ASN1Integer(bigInteger3);
    }

    public static GOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z11));
    }

    public BigInteger getA() {
        return this.f43375a.getPositiveValue();
    }

    public int getKeySize() {
        return this.keySize;
    }

    public int getLKeySize() {
        return this.keySize;
    }

    public BigInteger getP() {
        return this.f43376p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f43377q.getPositiveValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.keySize));
        aSN1EncodableVector.add(this.f43376p);
        aSN1EncodableVector.add(this.f43377q);
        aSN1EncodableVector.add(this.f43375a);
        return new DERSequence(aSN1EncodableVector);
    }

    public static GOST3410ParamSetParameters getInstance(Object obj) {
        if (obj != null && !(obj instanceof GOST3410ParamSetParameters)) {
            if (obj instanceof ASN1Sequence) {
                return new GOST3410ParamSetParameters((ASN1Sequence) obj);
            }
            throw new IllegalArgumentException("Invalid GOST3410Parameter: " + obj.getClass().getName());
        }
        return (GOST3410ParamSetParameters) obj;
    }

    public GOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.keySize = ((ASN1Integer) objects.nextElement()).getValue().intValue();
        this.f43376p = (ASN1Integer) objects.nextElement();
        this.f43377q = (ASN1Integer) objects.nextElement();
        this.f43375a = (ASN1Integer) objects.nextElement();
    }
}