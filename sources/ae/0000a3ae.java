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
import org.spongycastle.pqc.crypto.rainbow.Layer;
import org.spongycastle.pqc.crypto.rainbow.util.RainbowUtil;

/* loaded from: classes4.dex */
public class RainbowPrivateKey extends ASN1Object {

    /* renamed from: b1  reason: collision with root package name */
    private byte[] f43764b1;

    /* renamed from: b2  reason: collision with root package name */
    private byte[] f43765b2;
    private byte[][] invA1;
    private byte[][] invA2;
    private Layer[] layers;
    private ASN1ObjectIdentifier oid;
    private ASN1Integer version;

    /* renamed from: vi  reason: collision with root package name */
    private byte[] f43766vi;

    private RainbowPrivateKey(ASN1Sequence aSN1Sequence) {
        int i11 = 0;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) {
            this.version = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        } else {
            this.oid = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        }
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        this.invA1 = new byte[aSN1Sequence2.size()];
        for (int i12 = 0; i12 < aSN1Sequence2.size(); i12++) {
            this.invA1[i12] = ((ASN1OctetString) aSN1Sequence2.getObjectAt(i12)).getOctets();
        }
        this.f43764b1 = ((ASN1OctetString) ((ASN1Sequence) aSN1Sequence.getObjectAt(2)).getObjectAt(0)).getOctets();
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        this.invA2 = new byte[aSN1Sequence3.size()];
        for (int i13 = 0; i13 < aSN1Sequence3.size(); i13++) {
            this.invA2[i13] = ((ASN1OctetString) aSN1Sequence3.getObjectAt(i13)).getOctets();
        }
        this.f43765b2 = ((ASN1OctetString) ((ASN1Sequence) aSN1Sequence.getObjectAt(4)).getObjectAt(0)).getOctets();
        this.f43766vi = ((ASN1OctetString) ((ASN1Sequence) aSN1Sequence.getObjectAt(5)).getObjectAt(0)).getOctets();
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(6);
        byte[][][][] bArr = new byte[aSN1Sequence4.size()][][];
        byte[][][][] bArr2 = new byte[aSN1Sequence4.size()][][];
        byte[][][] bArr3 = new byte[aSN1Sequence4.size()][];
        byte[][] bArr4 = new byte[aSN1Sequence4.size()];
        int i14 = 0;
        while (i14 < aSN1Sequence4.size()) {
            ASN1Sequence aSN1Sequence5 = (ASN1Sequence) aSN1Sequence4.getObjectAt(i14);
            ASN1Sequence aSN1Sequence6 = (ASN1Sequence) aSN1Sequence5.getObjectAt(i11);
            bArr[i14] = new byte[aSN1Sequence6.size()][];
            for (int i15 = i11; i15 < aSN1Sequence6.size(); i15++) {
                ASN1Sequence aSN1Sequence7 = (ASN1Sequence) aSN1Sequence6.getObjectAt(i15);
                bArr[i14][i15] = new byte[aSN1Sequence7.size()];
                for (int i16 = 0; i16 < aSN1Sequence7.size(); i16++) {
                    bArr[i14][i15][i16] = ((ASN1OctetString) aSN1Sequence7.getObjectAt(i16)).getOctets();
                }
            }
            ASN1Sequence aSN1Sequence8 = (ASN1Sequence) aSN1Sequence5.getObjectAt(1);
            bArr2[i14] = new byte[aSN1Sequence8.size()][];
            for (int i17 = 0; i17 < aSN1Sequence8.size(); i17++) {
                ASN1Sequence aSN1Sequence9 = (ASN1Sequence) aSN1Sequence8.getObjectAt(i17);
                bArr2[i14][i17] = new byte[aSN1Sequence9.size()];
                for (int i18 = 0; i18 < aSN1Sequence9.size(); i18++) {
                    bArr2[i14][i17][i18] = ((ASN1OctetString) aSN1Sequence9.getObjectAt(i18)).getOctets();
                }
            }
            ASN1Sequence aSN1Sequence10 = (ASN1Sequence) aSN1Sequence5.getObjectAt(2);
            bArr3[i14] = new byte[aSN1Sequence10.size()];
            for (int i19 = 0; i19 < aSN1Sequence10.size(); i19++) {
                bArr3[i14][i19] = ((ASN1OctetString) aSN1Sequence10.getObjectAt(i19)).getOctets();
            }
            bArr4[i14] = ((ASN1OctetString) aSN1Sequence5.getObjectAt(3)).getOctets();
            i14++;
            i11 = 0;
        }
        int length = this.f43766vi.length - 1;
        this.layers = new Layer[length];
        int i21 = 0;
        while (i21 < length) {
            byte[] bArr5 = this.f43766vi;
            int i22 = i21 + 1;
            this.layers[i21] = new Layer(bArr5[i21], bArr5[i22], RainbowUtil.convertArray(bArr[i21]), RainbowUtil.convertArray(bArr2[i21]), RainbowUtil.convertArray(bArr3[i21]), RainbowUtil.convertArray(bArr4[i21]));
            i21 = i22;
        }
    }

    public static RainbowPrivateKey getInstance(Object obj) {
        if (obj instanceof RainbowPrivateKey) {
            return (RainbowPrivateKey) obj;
        }
        if (obj != null) {
            return new RainbowPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public short[] getB1() {
        return RainbowUtil.convertArray(this.f43764b1);
    }

    public short[] getB2() {
        return RainbowUtil.convertArray(this.f43765b2);
    }

    public short[][] getInvA1() {
        return RainbowUtil.convertArray(this.invA1);
    }

    public short[][] getInvA2() {
        return RainbowUtil.convertArray(this.invA2);
    }

    public Layer[] getLayers() {
        return this.layers;
    }

    public ASN1Integer getVersion() {
        return this.version;
    }

    public int[] getVi() {
        return RainbowUtil.convertArraytoInt(this.f43766vi);
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
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        int i11 = 0;
        while (true) {
            byte[][] bArr = this.invA1;
            if (i11 >= bArr.length) {
                break;
            }
            aSN1EncodableVector2.add(new DEROctetString(bArr[i11]));
            i11++;
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        aSN1EncodableVector3.add(new DEROctetString(this.f43764b1));
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector3));
        ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
        int i12 = 0;
        while (true) {
            byte[][] bArr2 = this.invA2;
            if (i12 >= bArr2.length) {
                break;
            }
            aSN1EncodableVector4.add(new DEROctetString(bArr2[i12]));
            i12++;
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector4));
        ASN1EncodableVector aSN1EncodableVector5 = new ASN1EncodableVector();
        aSN1EncodableVector5.add(new DEROctetString(this.f43765b2));
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector5));
        ASN1EncodableVector aSN1EncodableVector6 = new ASN1EncodableVector();
        aSN1EncodableVector6.add(new DEROctetString(this.f43766vi));
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector6));
        ASN1EncodableVector aSN1EncodableVector7 = new ASN1EncodableVector();
        for (int i13 = 0; i13 < this.layers.length; i13++) {
            ASN1EncodableVector aSN1EncodableVector8 = new ASN1EncodableVector();
            byte[][][] convertArray = RainbowUtil.convertArray(this.layers[i13].getCoeffAlpha());
            ASN1EncodableVector aSN1EncodableVector9 = new ASN1EncodableVector();
            for (int i14 = 0; i14 < convertArray.length; i14++) {
                ASN1EncodableVector aSN1EncodableVector10 = new ASN1EncodableVector();
                for (int i15 = 0; i15 < convertArray[i14].length; i15++) {
                    aSN1EncodableVector10.add(new DEROctetString(convertArray[i14][i15]));
                }
                aSN1EncodableVector9.add(new DERSequence(aSN1EncodableVector10));
            }
            aSN1EncodableVector8.add(new DERSequence(aSN1EncodableVector9));
            byte[][][] convertArray2 = RainbowUtil.convertArray(this.layers[i13].getCoeffBeta());
            ASN1EncodableVector aSN1EncodableVector11 = new ASN1EncodableVector();
            for (int i16 = 0; i16 < convertArray2.length; i16++) {
                ASN1EncodableVector aSN1EncodableVector12 = new ASN1EncodableVector();
                for (int i17 = 0; i17 < convertArray2[i16].length; i17++) {
                    aSN1EncodableVector12.add(new DEROctetString(convertArray2[i16][i17]));
                }
                aSN1EncodableVector11.add(new DERSequence(aSN1EncodableVector12));
            }
            aSN1EncodableVector8.add(new DERSequence(aSN1EncodableVector11));
            byte[][] convertArray3 = RainbowUtil.convertArray(this.layers[i13].getCoeffGamma());
            ASN1EncodableVector aSN1EncodableVector13 = new ASN1EncodableVector();
            for (byte[] bArr3 : convertArray3) {
                aSN1EncodableVector13.add(new DEROctetString(bArr3));
            }
            aSN1EncodableVector8.add(new DERSequence(aSN1EncodableVector13));
            aSN1EncodableVector8.add(new DEROctetString(RainbowUtil.convertArray(this.layers[i13].getCoeffEta())));
            aSN1EncodableVector7.add(new DERSequence(aSN1EncodableVector8));
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector7));
        return new DERSequence(aSN1EncodableVector);
    }

    public RainbowPrivateKey(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, Layer[] layerArr) {
        this.version = new ASN1Integer(1L);
        this.invA1 = RainbowUtil.convertArray(sArr);
        this.f43764b1 = RainbowUtil.convertArray(sArr2);
        this.invA2 = RainbowUtil.convertArray(sArr3);
        this.f43765b2 = RainbowUtil.convertArray(sArr4);
        this.f43766vi = RainbowUtil.convertIntArray(iArr);
        this.layers = layerArr;
    }
}