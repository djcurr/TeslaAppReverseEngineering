package org.spongycastle.pqc.crypto.rainbow;

import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.pqc.crypto.MessageSigner;
import org.spongycastle.pqc.crypto.rainbow.util.ComputeInField;
import org.spongycastle.pqc.crypto.rainbow.util.GF2Field;

/* loaded from: classes4.dex */
public class RainbowSigner implements MessageSigner {

    /* renamed from: cf  reason: collision with root package name */
    private ComputeInField f43855cf = new ComputeInField();
    RainbowKeyParameters key;
    private SecureRandom random;
    int signableDocumentLength;

    /* renamed from: x  reason: collision with root package name */
    private short[] f43856x;

    private short[] initSign(Layer[] layerArr, short[] sArr) {
        short[] sArr2 = new short[sArr.length];
        short[] multiplyMatrix = this.f43855cf.multiplyMatrix(((RainbowPrivateKeyParameters) this.key).getInvA1(), this.f43855cf.addVect(((RainbowPrivateKeyParameters) this.key).getB1(), sArr));
        for (int i11 = 0; i11 < layerArr[0].getVi(); i11++) {
            this.f43856x[i11] = (short) this.random.nextInt();
            short[] sArr3 = this.f43856x;
            sArr3[i11] = (short) (sArr3[i11] & 255);
        }
        return multiplyMatrix;
    }

    private short[] makeMessageRepresentative(byte[] bArr) {
        int i11 = this.signableDocumentLength;
        short[] sArr = new short[i11];
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            sArr[i12] = bArr[i13];
            sArr[i12] = (short) (sArr[i12] & 255);
            i13++;
            i12++;
            if (i12 >= i11) {
                break;
            }
        }
        return sArr;
    }

    private short[] verifySignatureIntern(short[] sArr) {
        short[][] coeffQuadratic = ((RainbowPublicKeyParameters) this.key).getCoeffQuadratic();
        short[][] coeffSingular = ((RainbowPublicKeyParameters) this.key).getCoeffSingular();
        short[] coeffScalar = ((RainbowPublicKeyParameters) this.key).getCoeffScalar();
        short[] sArr2 = new short[coeffQuadratic.length];
        int length = coeffSingular[0].length;
        for (int i11 = 0; i11 < coeffQuadratic.length; i11++) {
            int i12 = 0;
            for (int i13 = 0; i13 < length; i13++) {
                for (int i14 = i13; i14 < length; i14++) {
                    sArr2[i11] = GF2Field.addElem(sArr2[i11], GF2Field.multElem(coeffQuadratic[i11][i12], GF2Field.multElem(sArr[i13], sArr[i14])));
                    i12++;
                }
                sArr2[i11] = GF2Field.addElem(sArr2[i11], GF2Field.multElem(coeffSingular[i11][i13], sArr[i13]));
            }
            sArr2[i11] = GF2Field.addElem(sArr2[i11], coeffScalar[i11]);
        }
        return sArr2;
    }

    @Override // org.spongycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        boolean z11;
        Layer[] layers = ((RainbowPrivateKeyParameters) this.key).getLayers();
        int length = layers.length;
        this.f43856x = new short[((RainbowPrivateKeyParameters) this.key).getInvA2().length];
        int viNext = layers[length - 1].getViNext();
        byte[] bArr2 = new byte[viNext];
        short[] makeMessageRepresentative = makeMessageRepresentative(bArr);
        do {
            z11 = false;
            try {
                short[] initSign = initSign(layers, makeMessageRepresentative);
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    short[] sArr = new short[layers[i12].getOi()];
                    short[] sArr2 = new short[layers[i12].getOi()];
                    for (int i13 = 0; i13 < layers[i12].getOi(); i13++) {
                        sArr[i13] = initSign[i11];
                        i11++;
                    }
                    short[] solveEquation = this.f43855cf.solveEquation(layers[i12].plugInVinegars(this.f43856x), sArr);
                    if (solveEquation != null) {
                        for (int i14 = 0; i14 < solveEquation.length; i14++) {
                            this.f43856x[layers[i12].getVi() + i14] = solveEquation[i14];
                        }
                    } else {
                        throw new Exception("LES is not solveable!");
                        break;
                    }
                }
                short[] multiplyMatrix = this.f43855cf.multiplyMatrix(((RainbowPrivateKeyParameters) this.key).getInvA2(), this.f43855cf.addVect(((RainbowPrivateKeyParameters) this.key).getB2(), this.f43856x));
                for (int i15 = 0; i15 < viNext; i15++) {
                    bArr2[i15] = (byte) multiplyMatrix[i15];
                }
                z11 = true;
                continue;
            } catch (Exception unused) {
            }
        } while (!z11);
        return bArr2;
    }

    @Override // org.spongycastle.pqc.crypto.MessageSigner
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (z11) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.random = parametersWithRandom.getRandom();
                this.key = (RainbowPrivateKeyParameters) parametersWithRandom.getParameters();
            } else {
                this.random = new SecureRandom();
                this.key = (RainbowPrivateKeyParameters) cipherParameters;
            }
        } else {
            this.key = (RainbowPublicKeyParameters) cipherParameters;
        }
        this.signableDocumentLength = this.key.getDocLength();
    }

    @Override // org.spongycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        short[] sArr = new short[bArr2.length];
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            sArr[i11] = (short) (bArr2[i11] & 255);
        }
        short[] makeMessageRepresentative = makeMessageRepresentative(bArr);
        short[] verifySignatureIntern = verifySignatureIntern(sArr);
        if (makeMessageRepresentative.length != verifySignatureIntern.length) {
            return false;
        }
        boolean z11 = true;
        for (int i12 = 0; i12 < makeMessageRepresentative.length; i12++) {
            z11 = z11 && makeMessageRepresentative[i12] == verifySignatureIntern[i12];
        }
        return z11;
    }
}