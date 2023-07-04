package org.spongycastle.asn1.x509;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;

/* loaded from: classes5.dex */
public class DSAParameter extends ASN1Object {

    /* renamed from: g  reason: collision with root package name */
    ASN1Integer f43406g;

    /* renamed from: p  reason: collision with root package name */
    ASN1Integer f43407p;

    /* renamed from: q  reason: collision with root package name */
    ASN1Integer f43408q;

    public DSAParameter(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f43407p = new ASN1Integer(bigInteger);
        this.f43408q = new ASN1Integer(bigInteger2);
        this.f43406g = new ASN1Integer(bigInteger3);
    }

    public static DSAParameter getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z11));
    }

    public BigInteger getG() {
        return this.f43406g.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f43407p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f43408q.getPositiveValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f43407p);
        aSN1EncodableVector.add(this.f43408q);
        aSN1EncodableVector.add(this.f43406g);
        return new DERSequence(aSN1EncodableVector);
    }

    public static DSAParameter getInstance(Object obj) {
        if (obj instanceof DSAParameter) {
            return (DSAParameter) obj;
        }
        if (obj != null) {
            return new DSAParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private DSAParameter(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 3) {
            Enumeration objects = aSN1Sequence.getObjects();
            this.f43407p = ASN1Integer.getInstance(objects.nextElement());
            this.f43408q = ASN1Integer.getInstance(objects.nextElement());
            this.f43406g = ASN1Integer.getInstance(objects.nextElement());
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + aSN1Sequence.size());
    }
}