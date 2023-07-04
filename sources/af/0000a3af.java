package org.spongycastle.pqc.asn1;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.pqc.crypto.rainbow.util.RainbowUtil;

/* loaded from: classes4.dex */
public class RainbowPublicKey extends ASN1Object {
    private byte[][] coeffQuadratic;
    private byte[] coeffScalar;
    private byte[][] coeffSingular;
    private ASN1Integer docLength;
    private ASN1ObjectIdentifier oid;
    private ASN1Integer version;

    private RainbowPublicKey(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) {
            this.version = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        } else {
            this.oid = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        }
        this.docLength = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(2));
        this.coeffQuadratic = new byte[aSN1Sequence2.size()];
        for (int i11 = 0; i11 < aSN1Sequence2.size(); i11++) {
            this.coeffQuadratic[i11] = ASN1OctetString.getInstance(aSN1Sequence2.getObjectAt(i11)).getOctets();
        }
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        this.coeffSingular = new byte[aSN1Sequence3.size()];
        for (int i12 = 0; i12 < aSN1Sequence3.size(); i12++) {
            this.coeffSingular[i12] = ASN1OctetString.getInstance(aSN1Sequence3.getObjectAt(i12)).getOctets();
        }
        this.coeffScalar = ASN1OctetString.getInstance(((ASN1Sequence) aSN1Sequence.getObjectAt(4)).getObjectAt(0)).getOctets();
    }

    public static RainbowPublicKey getInstance(Object obj) {
        if (obj instanceof RainbowPublicKey) {
            return (RainbowPublicKey) obj;
        }
        if (obj != null) {
            return new RainbowPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public short[][] getCoeffQuadratic() {
        return RainbowUtil.convertArray(this.coeffQuadratic);
    }

    public short[] getCoeffScalar() {
        return RainbowUtil.convertArray(this.coeffScalar);
    }

    public short[][] getCoeffSingular() {
        return RainbowUtil.convertArray(this.coeffSingular);
    }

    public int getDocLength() {
        return this.docLength.getValue().intValue();
    }

    public ASN1Integer getVersion() {
        return this.version;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1Integer aSN1Integer = this.version;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        } else {
            aSN1EncodableVector.add(this.oid);
        }
        aSN1EncodableVector.add(this.docLength);
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[][] bArr = this.coeffQuadratic;
            if (i12 >= bArr.length) {
                break;
            }
            aSN1EncodableVector2.add(new DEROctetString(bArr[i12]));
            i12++;
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        while (true) {
            byte[][] bArr2 = this.coeffSingular;
            if (i11 < bArr2.length) {
                aSN1EncodableVector3.add(new DEROctetString(bArr2[i11]));
                i11++;
            } else {
                aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector3));
                ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
                aSN1EncodableVector4.add(new DEROctetString(this.coeffScalar));
                aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector4));
                return new DERSequence(aSN1EncodableVector);
            }
        }
    }

    public RainbowPublicKey(int i11, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.version = new ASN1Integer(0L);
        this.docLength = new ASN1Integer(i11);
        this.coeffQuadratic = RainbowUtil.convertArray(sArr);
        this.coeffSingular = RainbowUtil.convertArray(sArr2);
        this.coeffScalar = RainbowUtil.convertArray(sArr3);
    }
}