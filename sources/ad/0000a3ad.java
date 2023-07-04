package org.spongycastle.pqc.asn1;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class ParSet extends ASN1Object {
    private static final BigInteger ZERO = BigInteger.valueOf(0);

    /* renamed from: h  reason: collision with root package name */
    private int[] f43760h;

    /* renamed from: k  reason: collision with root package name */
    private int[] f43761k;

    /* renamed from: t  reason: collision with root package name */
    private int f43762t;

    /* renamed from: w  reason: collision with root package name */
    private int[] f43763w;

    private ParSet(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 4) {
            this.f43762t = checkBigIntegerInIntRangeAndPositive(((ASN1Integer) aSN1Sequence.getObjectAt(0)).getValue());
            ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
            ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
            ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
            if (aSN1Sequence2.size() == this.f43762t && aSN1Sequence3.size() == this.f43762t && aSN1Sequence4.size() == this.f43762t) {
                this.f43760h = new int[aSN1Sequence2.size()];
                this.f43763w = new int[aSN1Sequence3.size()];
                this.f43761k = new int[aSN1Sequence4.size()];
                for (int i11 = 0; i11 < this.f43762t; i11++) {
                    this.f43760h[i11] = checkBigIntegerInIntRangeAndPositive(((ASN1Integer) aSN1Sequence2.getObjectAt(i11)).getValue());
                    this.f43763w[i11] = checkBigIntegerInIntRangeAndPositive(((ASN1Integer) aSN1Sequence3.getObjectAt(i11)).getValue());
                    this.f43761k[i11] = checkBigIntegerInIntRangeAndPositive(((ASN1Integer) aSN1Sequence4.getObjectAt(i11)).getValue());
                }
                return;
            }
            throw new IllegalArgumentException("invalid size of sequences");
        }
        throw new IllegalArgumentException("sie of seqOfParams = " + aSN1Sequence.size());
    }

    private static int checkBigIntegerInIntRangeAndPositive(BigInteger bigInteger) {
        if (bigInteger.compareTo(BigInteger.valueOf(2147483647L)) <= 0 && bigInteger.compareTo(ZERO) > 0) {
            return bigInteger.intValue();
        }
        throw new IllegalArgumentException("BigInteger not in Range: " + bigInteger.toString());
    }

    public static ParSet getInstance(Object obj) {
        if (obj instanceof ParSet) {
            return (ParSet) obj;
        }
        if (obj != null) {
            return new ParSet(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public int[] getH() {
        return Arrays.clone(this.f43760h);
    }

    public int[] getK() {
        return Arrays.clone(this.f43761k);
    }

    public int getT() {
        return this.f43762t;
    }

    public int[] getW() {
        return Arrays.clone(this.f43763w);
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        int i11 = 0;
        while (true) {
            int[] iArr = this.f43760h;
            if (i11 < iArr.length) {
                aSN1EncodableVector.add(new ASN1Integer(iArr[i11]));
                aSN1EncodableVector2.add(new ASN1Integer(this.f43763w[i11]));
                aSN1EncodableVector3.add(new ASN1Integer(this.f43761k[i11]));
                i11++;
            } else {
                ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
                aSN1EncodableVector4.add(new ASN1Integer(this.f43762t));
                aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector));
                aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector2));
                aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector3));
                return new DERSequence(aSN1EncodableVector4);
            }
        }
    }

    public ParSet(int i11, int[] iArr, int[] iArr2, int[] iArr3) {
        this.f43762t = i11;
        this.f43760h = iArr;
        this.f43763w = iArr2;
        this.f43761k = iArr3;
    }
}