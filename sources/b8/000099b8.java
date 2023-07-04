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
public class DomainParameters extends ASN1Object {

    /* renamed from: g  reason: collision with root package name */
    private final ASN1Integer f43416g;

    /* renamed from: j  reason: collision with root package name */
    private final ASN1Integer f43417j;

    /* renamed from: p  reason: collision with root package name */
    private final ASN1Integer f43418p;

    /* renamed from: q  reason: collision with root package name */
    private final ASN1Integer f43419q;
    private final ValidationParams validationParams;

    public DomainParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, ValidationParams validationParams) {
        if (bigInteger == null) {
            throw new IllegalArgumentException("'p' cannot be null");
        }
        if (bigInteger2 == null) {
            throw new IllegalArgumentException("'g' cannot be null");
        }
        if (bigInteger3 != null) {
            this.f43418p = new ASN1Integer(bigInteger);
            this.f43416g = new ASN1Integer(bigInteger2);
            this.f43419q = new ASN1Integer(bigInteger3);
            if (bigInteger4 != null) {
                this.f43417j = new ASN1Integer(bigInteger4);
            } else {
                this.f43417j = null;
            }
            this.validationParams = validationParams;
            return;
        }
        throw new IllegalArgumentException("'q' cannot be null");
    }

    public static DomainParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z11));
    }

    private static ASN1Encodable getNext(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (ASN1Encodable) enumeration.nextElement();
        }
        return null;
    }

    public BigInteger getG() {
        return this.f43416g.getPositiveValue();
    }

    public BigInteger getJ() {
        ASN1Integer aSN1Integer = this.f43417j;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f43418p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f43419q.getPositiveValue();
    }

    public ValidationParams getValidationParams() {
        return this.validationParams;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f43418p);
        aSN1EncodableVector.add(this.f43416g);
        aSN1EncodableVector.add(this.f43419q);
        ASN1Integer aSN1Integer = this.f43417j;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        ValidationParams validationParams = this.validationParams;
        if (validationParams != null) {
            aSN1EncodableVector.add(validationParams);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static DomainParameters getInstance(Object obj) {
        if (obj instanceof DomainParameters) {
            return (DomainParameters) obj;
        }
        if (obj != null) {
            return new DomainParameters(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private DomainParameters(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() >= 3 && aSN1Sequence.size() <= 5) {
            Enumeration objects = aSN1Sequence.getObjects();
            this.f43418p = ASN1Integer.getInstance(objects.nextElement());
            this.f43416g = ASN1Integer.getInstance(objects.nextElement());
            this.f43419q = ASN1Integer.getInstance(objects.nextElement());
            ASN1Encodable next = getNext(objects);
            if (next != null && (next instanceof ASN1Integer)) {
                this.f43417j = ASN1Integer.getInstance(next);
                next = getNext(objects);
            } else {
                this.f43417j = null;
            }
            if (next != null) {
                this.validationParams = ValidationParams.getInstance(next.toASN1Primitive());
                return;
            } else {
                this.validationParams = null;
                return;
            }
        }
        throw new IllegalArgumentException("Bad sequence size: " + aSN1Sequence.size());
    }
}