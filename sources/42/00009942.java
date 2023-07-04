package org.spongycastle.asn1.ua;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

/* loaded from: classes5.dex */
public class DSTU4145BinaryField extends ASN1Object {

    /* renamed from: j  reason: collision with root package name */
    private int f43388j;

    /* renamed from: k  reason: collision with root package name */
    private int f43389k;

    /* renamed from: l  reason: collision with root package name */
    private int f43390l;

    /* renamed from: m  reason: collision with root package name */
    private int f43391m;

    private DSTU4145BinaryField(ASN1Sequence aSN1Sequence) {
        this.f43391m = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getPositiveValue().intValue();
        if (aSN1Sequence.getObjectAt(1) instanceof ASN1Integer) {
            this.f43389k = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).getPositiveValue().intValue();
        } else if (aSN1Sequence.getObjectAt(1) instanceof ASN1Sequence) {
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
            this.f43389k = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(0)).getPositiveValue().intValue();
            this.f43388j = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(1)).getPositiveValue().intValue();
            this.f43390l = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(2)).getPositiveValue().intValue();
        } else {
            throw new IllegalArgumentException("object parse error");
        }
    }

    public static DSTU4145BinaryField getInstance(Object obj) {
        if (obj instanceof DSTU4145BinaryField) {
            return (DSTU4145BinaryField) obj;
        }
        if (obj != null) {
            return new DSTU4145BinaryField(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public int getK1() {
        return this.f43389k;
    }

    public int getK2() {
        return this.f43388j;
    }

    public int getK3() {
        return this.f43390l;
    }

    public int getM() {
        return this.f43391m;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.f43391m));
        if (this.f43388j == 0) {
            aSN1EncodableVector.add(new ASN1Integer(this.f43389k));
        } else {
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            aSN1EncodableVector2.add(new ASN1Integer(this.f43389k));
            aSN1EncodableVector2.add(new ASN1Integer(this.f43388j));
            aSN1EncodableVector2.add(new ASN1Integer(this.f43390l));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public DSTU4145BinaryField(int i11, int i12, int i13, int i14) {
        this.f43391m = i11;
        this.f43389k = i12;
        this.f43388j = i13;
        this.f43390l = i14;
    }

    public DSTU4145BinaryField(int i11, int i12) {
        this(i11, i12, 0, 0);
    }
}