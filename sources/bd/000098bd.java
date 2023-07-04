package org.spongycastle.asn1.isismtt.x509;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERPrintableString;
import org.spongycastle.asn1.DERSequence;

/* loaded from: classes6.dex */
public class MonetaryLimit extends ASN1Object {
    ASN1Integer amount;
    DERPrintableString currency;
    ASN1Integer exponent;

    private MonetaryLimit(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 3) {
            Enumeration objects = aSN1Sequence.getObjects();
            this.currency = DERPrintableString.getInstance(objects.nextElement());
            this.amount = ASN1Integer.getInstance(objects.nextElement());
            this.exponent = ASN1Integer.getInstance(objects.nextElement());
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + aSN1Sequence.size());
    }

    public static MonetaryLimit getInstance(Object obj) {
        if (obj != null && !(obj instanceof MonetaryLimit)) {
            if (obj instanceof ASN1Sequence) {
                return new MonetaryLimit(ASN1Sequence.getInstance(obj));
            }
            throw new IllegalArgumentException("unknown object in getInstance");
        }
        return (MonetaryLimit) obj;
    }

    public BigInteger getAmount() {
        return this.amount.getValue();
    }

    public String getCurrency() {
        return this.currency.getString();
    }

    public BigInteger getExponent() {
        return this.exponent.getValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.currency);
        aSN1EncodableVector.add(this.amount);
        aSN1EncodableVector.add(this.exponent);
        return new DERSequence(aSN1EncodableVector);
    }

    public MonetaryLimit(String str, int i11, int i12) {
        this.currency = new DERPrintableString(str, true);
        this.amount = new ASN1Integer(i11);
        this.exponent = new ASN1Integer(i12);
    }
}