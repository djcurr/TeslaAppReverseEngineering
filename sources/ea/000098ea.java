package org.spongycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

/* loaded from: classes5.dex */
public class DHParameter extends ASN1Object {

    /* renamed from: g  reason: collision with root package name */
    ASN1Integer f43383g;

    /* renamed from: l  reason: collision with root package name */
    ASN1Integer f43384l;

    /* renamed from: p  reason: collision with root package name */
    ASN1Integer f43385p;

    public DHParameter(BigInteger bigInteger, BigInteger bigInteger2, int i11) {
        this.f43385p = new ASN1Integer(bigInteger);
        this.f43383g = new ASN1Integer(bigInteger2);
        if (i11 != 0) {
            this.f43384l = new ASN1Integer(i11);
        } else {
            this.f43384l = null;
        }
    }

    public static DHParameter getInstance(Object obj) {
        if (obj instanceof DHParameter) {
            return (DHParameter) obj;
        }
        if (obj != null) {
            return new DHParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f43383g.getPositiveValue();
    }

    public BigInteger getL() {
        ASN1Integer aSN1Integer = this.f43384l;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f43385p.getPositiveValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f43385p);
        aSN1EncodableVector.add(this.f43383g);
        if (getL() != null) {
            aSN1EncodableVector.add(this.f43384l);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    private DHParameter(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f43385p = ASN1Integer.getInstance(objects.nextElement());
        this.f43383g = ASN1Integer.getInstance(objects.nextElement());
        if (objects.hasMoreElements()) {
            this.f43384l = (ASN1Integer) objects.nextElement();
        } else {
            this.f43384l = null;
        }
    }
}