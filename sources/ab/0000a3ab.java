package org.spongycastle.pqc.asn1;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;

/* loaded from: classes4.dex */
public class McEliecePublicKey extends ASN1Object {

    /* renamed from: g  reason: collision with root package name */
    private final GF2Matrix f43757g;

    /* renamed from: n  reason: collision with root package name */
    private final int f43758n;

    /* renamed from: t  reason: collision with root package name */
    private final int f43759t;

    public McEliecePublicKey(int i11, int i12, GF2Matrix gF2Matrix) {
        this.f43758n = i11;
        this.f43759t = i12;
        this.f43757g = new GF2Matrix(gF2Matrix);
    }

    public static McEliecePublicKey getInstance(Object obj) {
        if (obj instanceof McEliecePublicKey) {
            return (McEliecePublicKey) obj;
        }
        if (obj != null) {
            return new McEliecePublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GF2Matrix getG() {
        return new GF2Matrix(this.f43757g);
    }

    public int getN() {
        return this.f43758n;
    }

    public int getT() {
        return this.f43759t;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.f43758n));
        aSN1EncodableVector.add(new ASN1Integer(this.f43759t));
        aSN1EncodableVector.add(new DEROctetString(this.f43757g.getEncoded()));
        return new DERSequence(aSN1EncodableVector);
    }

    private McEliecePublicKey(ASN1Sequence aSN1Sequence) {
        this.f43758n = ((ASN1Integer) aSN1Sequence.getObjectAt(0)).getValue().intValue();
        this.f43759t = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).getValue().intValue();
        this.f43757g = new GF2Matrix(((ASN1OctetString) aSN1Sequence.getObjectAt(2)).getOctets());
    }
}