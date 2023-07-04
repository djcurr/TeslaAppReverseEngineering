package org.spongycastle.asn1.x509;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;

/* loaded from: classes5.dex */
public class GeneralSubtree extends ASN1Object {
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private GeneralName base;
    private ASN1Integer maximum;
    private ASN1Integer minimum;

    private GeneralSubtree(ASN1Sequence aSN1Sequence) {
        this.base = GeneralName.getInstance(aSN1Sequence.getObjectAt(0));
        int size = aSN1Sequence.size();
        if (size != 1) {
            if (size == 2) {
                ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1));
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    this.minimum = ASN1Integer.getInstance(aSN1TaggedObject, false);
                } else if (tagNo == 1) {
                    this.maximum = ASN1Integer.getInstance(aSN1TaggedObject, false);
                } else {
                    throw new IllegalArgumentException("Bad tag number: " + aSN1TaggedObject.getTagNo());
                }
            } else if (size == 3) {
                ASN1TaggedObject aSN1TaggedObject2 = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1));
                if (aSN1TaggedObject2.getTagNo() == 0) {
                    this.minimum = ASN1Integer.getInstance(aSN1TaggedObject2, false);
                    ASN1TaggedObject aSN1TaggedObject3 = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(2));
                    if (aSN1TaggedObject3.getTagNo() == 1) {
                        this.maximum = ASN1Integer.getInstance(aSN1TaggedObject3, false);
                        return;
                    }
                    throw new IllegalArgumentException("Bad tag number for 'maximum': " + aSN1TaggedObject3.getTagNo());
                }
                throw new IllegalArgumentException("Bad tag number for 'minimum': " + aSN1TaggedObject2.getTagNo());
            } else {
                throw new IllegalArgumentException("Bad sequence size: " + aSN1Sequence.size());
            }
        }
    }

    public static GeneralSubtree getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return new GeneralSubtree(ASN1Sequence.getInstance(aSN1TaggedObject, z11));
    }

    public GeneralName getBase() {
        return this.base;
    }

    public BigInteger getMaximum() {
        ASN1Integer aSN1Integer = this.maximum;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getValue();
    }

    public BigInteger getMinimum() {
        ASN1Integer aSN1Integer = this.minimum;
        if (aSN1Integer == null) {
            return ZERO;
        }
        return aSN1Integer.getValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.base);
        ASN1Integer aSN1Integer = this.minimum;
        if (aSN1Integer != null && !aSN1Integer.getValue().equals(ZERO)) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, this.minimum));
        }
        if (this.maximum != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, this.maximum));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static GeneralSubtree getInstance(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof GeneralSubtree) {
            return (GeneralSubtree) obj;
        }
        return new GeneralSubtree(ASN1Sequence.getInstance(obj));
    }

    public GeneralSubtree(GeneralName generalName, BigInteger bigInteger, BigInteger bigInteger2) {
        this.base = generalName;
        if (bigInteger2 != null) {
            this.maximum = new ASN1Integer(bigInteger2);
        }
        if (bigInteger == null) {
            this.minimum = null;
        } else {
            this.minimum = new ASN1Integer(bigInteger);
        }
    }

    public GeneralSubtree(GeneralName generalName) {
        this(generalName, null, null);
    }
}