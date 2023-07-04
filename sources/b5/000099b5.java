package org.spongycastle.asn1.x9;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;

/* loaded from: classes5.dex */
public class DHDomainParameters extends ASN1Object {

    /* renamed from: g  reason: collision with root package name */
    private ASN1Integer f43411g;

    /* renamed from: j  reason: collision with root package name */
    private ASN1Integer f43412j;

    /* renamed from: p  reason: collision with root package name */
    private ASN1Integer f43413p;

    /* renamed from: q  reason: collision with root package name */
    private ASN1Integer f43414q;
    private DHValidationParms validationParms;

    public DHDomainParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, DHValidationParms dHValidationParms) {
        if (bigInteger == null) {
            throw new IllegalArgumentException("'p' cannot be null");
        }
        if (bigInteger2 == null) {
            throw new IllegalArgumentException("'g' cannot be null");
        }
        if (bigInteger3 != null) {
            this.f43413p = new ASN1Integer(bigInteger);
            this.f43411g = new ASN1Integer(bigInteger2);
            this.f43414q = new ASN1Integer(bigInteger3);
            this.f43412j = new ASN1Integer(bigInteger4);
            this.validationParms = dHValidationParms;
            return;
        }
        throw new IllegalArgumentException("'q' cannot be null");
    }

    public static DHDomainParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z11));
    }

    private static ASN1Encodable getNext(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (ASN1Encodable) enumeration.nextElement();
        }
        return null;
    }

    public ASN1Integer getG() {
        return this.f43411g;
    }

    public ASN1Integer getJ() {
        return this.f43412j;
    }

    public ASN1Integer getP() {
        return this.f43413p;
    }

    public ASN1Integer getQ() {
        return this.f43414q;
    }

    public DHValidationParms getValidationParms() {
        return this.validationParms;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f43413p);
        aSN1EncodableVector.add(this.f43411g);
        aSN1EncodableVector.add(this.f43414q);
        ASN1Integer aSN1Integer = this.f43412j;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        DHValidationParms dHValidationParms = this.validationParms;
        if (dHValidationParms != null) {
            aSN1EncodableVector.add(dHValidationParms);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static DHDomainParameters getInstance(Object obj) {
        if (obj != null && !(obj instanceof DHDomainParameters)) {
            if (obj instanceof ASN1Sequence) {
                return new DHDomainParameters((ASN1Sequence) obj);
            }
            throw new IllegalArgumentException("Invalid DHDomainParameters: " + obj.getClass().getName());
        }
        return (DHDomainParameters) obj;
    }

    public DHDomainParameters(ASN1Integer aSN1Integer, ASN1Integer aSN1Integer2, ASN1Integer aSN1Integer3, ASN1Integer aSN1Integer4, DHValidationParms dHValidationParms) {
        if (aSN1Integer == null) {
            throw new IllegalArgumentException("'p' cannot be null");
        }
        if (aSN1Integer2 == null) {
            throw new IllegalArgumentException("'g' cannot be null");
        }
        if (aSN1Integer3 != null) {
            this.f43413p = aSN1Integer;
            this.f43411g = aSN1Integer2;
            this.f43414q = aSN1Integer3;
            this.f43412j = aSN1Integer4;
            this.validationParms = dHValidationParms;
            return;
        }
        throw new IllegalArgumentException("'q' cannot be null");
    }

    private DHDomainParameters(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() >= 3 && aSN1Sequence.size() <= 5) {
            Enumeration objects = aSN1Sequence.getObjects();
            this.f43413p = ASN1Integer.getInstance(objects.nextElement());
            this.f43411g = ASN1Integer.getInstance(objects.nextElement());
            this.f43414q = ASN1Integer.getInstance(objects.nextElement());
            ASN1Encodable next = getNext(objects);
            if (next != null && (next instanceof ASN1Integer)) {
                this.f43412j = ASN1Integer.getInstance(next);
                next = getNext(objects);
            }
            if (next != null) {
                this.validationParms = DHValidationParms.getInstance(next.toASN1Primitive());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + aSN1Sequence.size());
    }
}