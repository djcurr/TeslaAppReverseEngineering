package org.spongycastle.asn1.x500;

import java.util.Enumeration;
import java.util.Objects;
import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x500.style.BCStyle;

/* loaded from: classes5.dex */
public class X500Name extends ASN1Object implements ASN1Choice {
    private static X500NameStyle defaultStyle = BCStyle.INSTANCE;
    private int hashCodeValue;
    private boolean isHashCodeCalculated;
    private RDN[] rdns;
    private X500NameStyle style;

    public X500Name(X500NameStyle x500NameStyle, X500Name x500Name) {
        this.rdns = x500Name.rdns;
        this.style = x500NameStyle;
    }

    public static X500NameStyle getDefaultStyle() {
        return defaultStyle;
    }

    public static X500Name getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, true));
    }

    public static void setDefaultStyle(X500NameStyle x500NameStyle) {
        Objects.requireNonNull(x500NameStyle, "cannot set style to null");
        defaultStyle = x500NameStyle;
    }

    @Override // org.spongycastle.asn1.ASN1Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof X500Name) || (obj instanceof ASN1Sequence)) {
            if (toASN1Primitive().equals(((ASN1Encodable) obj).toASN1Primitive())) {
                return true;
            }
            try {
                return this.style.areEqual(this, new X500Name(ASN1Sequence.getInstance(((ASN1Encodable) obj).toASN1Primitive())));
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }

    public ASN1ObjectIdentifier[] getAttributeTypes() {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            RDN[] rdnArr = this.rdns;
            if (i11 == rdnArr.length) {
                break;
            }
            i12 += rdnArr[i11].size();
            i11++;
        }
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[i12];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            RDN[] rdnArr2 = this.rdns;
            if (i13 == rdnArr2.length) {
                return aSN1ObjectIdentifierArr;
            }
            RDN rdn = rdnArr2[i13];
            if (rdn.isMultiValued()) {
                AttributeTypeAndValue[] typesAndValues = rdn.getTypesAndValues();
                int i15 = 0;
                while (i15 != typesAndValues.length) {
                    aSN1ObjectIdentifierArr[i14] = typesAndValues[i15].getType();
                    i15++;
                    i14++;
                }
            } else if (rdn.size() != 0) {
                aSN1ObjectIdentifierArr[i14] = rdn.getFirst().getType();
                i14++;
            }
            i13++;
        }
    }

    public RDN[] getRDNs() {
        RDN[] rdnArr = this.rdns;
        int length = rdnArr.length;
        RDN[] rdnArr2 = new RDN[length];
        System.arraycopy(rdnArr, 0, rdnArr2, 0, length);
        return rdnArr2;
    }

    @Override // org.spongycastle.asn1.ASN1Object
    public int hashCode() {
        if (this.isHashCodeCalculated) {
            return this.hashCodeValue;
        }
        this.isHashCodeCalculated = true;
        int calculateHashCode = this.style.calculateHashCode(this);
        this.hashCodeValue = calculateHashCode;
        return calculateHashCode;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.rdns);
    }

    public String toString() {
        return this.style.toString(this);
    }

    public static X500Name getInstance(Object obj) {
        if (obj instanceof X500Name) {
            return (X500Name) obj;
        }
        if (obj != null) {
            return new X500Name(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public RDN[] getRDNs(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i11;
        RDN[] rdnArr = new RDN[this.rdns.length];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            RDN[] rdnArr2 = this.rdns;
            if (i12 != rdnArr2.length) {
                RDN rdn = rdnArr2[i12];
                if (rdn.isMultiValued()) {
                    AttributeTypeAndValue[] typesAndValues = rdn.getTypesAndValues();
                    for (int i14 = 0; i14 != typesAndValues.length; i14++) {
                        if (typesAndValues[i14].getType().equals(aSN1ObjectIdentifier)) {
                            i11 = i13 + 1;
                            rdnArr[i13] = rdn;
                            i13 = i11;
                            break;
                        }
                    }
                    i12++;
                } else if (rdn.getFirst().getType().equals(aSN1ObjectIdentifier)) {
                    i11 = i13 + 1;
                    rdnArr[i13] = rdn;
                    i13 = i11;
                    break;
                    i12++;
                } else {
                    i12++;
                }
            } else {
                RDN[] rdnArr3 = new RDN[i13];
                System.arraycopy(rdnArr, 0, rdnArr3, 0, i13);
                return rdnArr3;
            }
        }
    }

    private X500Name(ASN1Sequence aSN1Sequence) {
        this(defaultStyle, aSN1Sequence);
    }

    private X500Name(X500NameStyle x500NameStyle, ASN1Sequence aSN1Sequence) {
        this.style = x500NameStyle;
        this.rdns = new RDN[aSN1Sequence.size()];
        Enumeration objects = aSN1Sequence.getObjects();
        int i11 = 0;
        while (objects.hasMoreElements()) {
            this.rdns[i11] = RDN.getInstance(objects.nextElement());
            i11++;
        }
    }

    public static X500Name getInstance(X500NameStyle x500NameStyle, Object obj) {
        if (obj instanceof X500Name) {
            return new X500Name(x500NameStyle, (X500Name) obj);
        }
        if (obj != null) {
            return new X500Name(x500NameStyle, ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public X500Name(RDN[] rdnArr) {
        this(defaultStyle, rdnArr);
    }

    public X500Name(X500NameStyle x500NameStyle, RDN[] rdnArr) {
        this.rdns = rdnArr;
        this.style = x500NameStyle;
    }

    public X500Name(String str) {
        this(defaultStyle, str);
    }

    public X500Name(X500NameStyle x500NameStyle, String str) {
        this(x500NameStyle.fromString(str));
        this.style = x500NameStyle;
    }
}