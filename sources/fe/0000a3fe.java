package org.spongycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.pqc.crypto.rainbow.util.ComputeInField;
import org.spongycastle.pqc.crypto.rainbow.util.GF2Field;

/* loaded from: classes4.dex */
public class RainbowKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private short[][] A1;
    private short[][] A1inv;
    private short[][] A2;
    private short[][] A2inv;

    /* renamed from: b1  reason: collision with root package name */
    private short[] f43847b1;

    /* renamed from: b2  reason: collision with root package name */
    private short[] f43848b2;
    private boolean initialized = false;
    private Layer[] layers;
    private int numOfLayers;
    private short[][] pub_quadratic;
    private short[] pub_scalar;
    private short[][] pub_singular;
    private RainbowKeyGenerationParameters rainbowParams;

    /* renamed from: sr  reason: collision with root package name */
    private SecureRandom f43849sr;

    /* renamed from: vi  reason: collision with root package name */
    private int[] f43850vi;

    private void compactPublicKey(short[][][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        this.pub_quadratic = (short[][]) Array.newInstance(short.class, length, ((length2 + 1) * length2) / 2);
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = 0;
            for (int i13 = 0; i13 < length2; i13++) {
                for (int i14 = i13; i14 < length2; i14++) {
                    if (i14 == i13) {
                        this.pub_quadratic[i11][i12] = sArr[i11][i13][i14];
                    } else {
                        this.pub_quadratic[i11][i12] = GF2Field.addElem(sArr[i11][i13][i14], sArr[i11][i14][i13]);
                    }
                    i12++;
                }
            }
        }
    }

    private void computePublicKey() {
        Class<short> cls = short.class;
        ComputeInField computeInField = new ComputeInField();
        int[] iArr = this.f43850vi;
        int i11 = 0;
        int i12 = iArr[iArr.length - 1] - iArr[0];
        int i13 = iArr[iArr.length - 1];
        int i14 = 3;
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) cls, i12, i13, i13);
        this.pub_singular = (short[][]) Array.newInstance((Class<?>) cls, i12, i13);
        this.pub_scalar = new short[i12];
        short[] sArr2 = new short[i13];
        int i15 = 0;
        int i16 = 0;
        while (true) {
            Layer[] layerArr = this.layers;
            if (i15 >= layerArr.length) {
                break;
            }
            short[][][] coeffAlpha = layerArr[i15].getCoeffAlpha();
            short[][][] coeffBeta = this.layers[i15].getCoeffBeta();
            short[][] coeffGamma = this.layers[i15].getCoeffGamma();
            short[] coeffEta = this.layers[i15].getCoeffEta();
            int length = coeffAlpha[i11].length;
            int length2 = coeffBeta[i11].length;
            while (i11 < length) {
                int i17 = 0;
                while (i17 < length) {
                    Class<short> cls2 = cls;
                    int i18 = 0;
                    while (i18 < length2) {
                        int i19 = i12;
                        int i21 = i13;
                        int i22 = i17 + length2;
                        short[] multVect = computeInField.multVect(coeffAlpha[i11][i17][i18], this.A2[i22]);
                        int i23 = i16 + i11;
                        int i24 = i15;
                        sArr[i23] = computeInField.addSquareMatrix(sArr[i23], computeInField.multVects(multVect, this.A2[i18]));
                        short[] multVect2 = computeInField.multVect(this.f43848b2[i18], multVect);
                        short[][] sArr3 = this.pub_singular;
                        sArr3[i23] = computeInField.addVect(multVect2, sArr3[i23]);
                        short[] multVect3 = computeInField.multVect(this.f43848b2[i22], computeInField.multVect(coeffAlpha[i11][i17][i18], this.A2[i18]));
                        short[][] sArr4 = this.pub_singular;
                        sArr4[i23] = computeInField.addVect(multVect3, sArr4[i23]);
                        short multElem = GF2Field.multElem(coeffAlpha[i11][i17][i18], this.f43848b2[i22]);
                        short[] sArr5 = this.pub_scalar;
                        sArr5[i23] = GF2Field.addElem(sArr5[i23], GF2Field.multElem(multElem, this.f43848b2[i18]));
                        i18++;
                        i13 = i21;
                        i12 = i19;
                        coeffAlpha = coeffAlpha;
                        i15 = i24;
                        coeffEta = coeffEta;
                    }
                    i17++;
                    cls = cls2;
                }
                Class<short> cls3 = cls;
                int i25 = i13;
                int i26 = i12;
                int i27 = i15;
                short[][][] sArr6 = coeffAlpha;
                short[] sArr7 = coeffEta;
                for (int i28 = 0; i28 < length2; i28++) {
                    for (int i29 = 0; i29 < length2; i29++) {
                        short[] multVect4 = computeInField.multVect(coeffBeta[i11][i28][i29], this.A2[i28]);
                        int i31 = i16 + i11;
                        sArr[i31] = computeInField.addSquareMatrix(sArr[i31], computeInField.multVects(multVect4, this.A2[i29]));
                        short[] multVect5 = computeInField.multVect(this.f43848b2[i29], multVect4);
                        short[][] sArr8 = this.pub_singular;
                        sArr8[i31] = computeInField.addVect(multVect5, sArr8[i31]);
                        short[] multVect6 = computeInField.multVect(this.f43848b2[i28], computeInField.multVect(coeffBeta[i11][i28][i29], this.A2[i29]));
                        short[][] sArr9 = this.pub_singular;
                        sArr9[i31] = computeInField.addVect(multVect6, sArr9[i31]);
                        short multElem2 = GF2Field.multElem(coeffBeta[i11][i28][i29], this.f43848b2[i28]);
                        short[] sArr10 = this.pub_scalar;
                        sArr10[i31] = GF2Field.addElem(sArr10[i31], GF2Field.multElem(multElem2, this.f43848b2[i29]));
                    }
                }
                for (int i32 = 0; i32 < length2 + length; i32++) {
                    short[] multVect7 = computeInField.multVect(coeffGamma[i11][i32], this.A2[i32]);
                    short[][] sArr11 = this.pub_singular;
                    int i33 = i16 + i11;
                    sArr11[i33] = computeInField.addVect(multVect7, sArr11[i33]);
                    short[] sArr12 = this.pub_scalar;
                    sArr12[i33] = GF2Field.addElem(sArr12[i33], GF2Field.multElem(coeffGamma[i11][i32], this.f43848b2[i32]));
                }
                short[] sArr13 = this.pub_scalar;
                int i34 = i16 + i11;
                sArr13[i34] = GF2Field.addElem(sArr13[i34], sArr7[i11]);
                i11++;
                cls = cls3;
                i13 = i25;
                i12 = i26;
                coeffAlpha = sArr6;
                i15 = i27;
                coeffEta = sArr7;
            }
            i16 += length;
            i15++;
            i11 = 0;
            i14 = 3;
        }
        Class<short> cls4 = cls;
        int i35 = i13;
        int i36 = i12;
        int[] iArr2 = new int[i14];
        iArr2[2] = i35;
        iArr2[1] = i35;
        iArr2[0] = i36;
        short[][][] sArr14 = (short[][][]) Array.newInstance((Class<?>) cls4, iArr2);
        short[][] sArr15 = (short[][]) Array.newInstance((Class<?>) cls4, i36, i35);
        short[] sArr16 = new short[i36];
        for (int i37 = 0; i37 < i36; i37++) {
            int i38 = 0;
            while (true) {
                short[][] sArr17 = this.A1;
                if (i38 < sArr17.length) {
                    sArr14[i37] = computeInField.addSquareMatrix(sArr14[i37], computeInField.multMatrix(sArr17[i37][i38], sArr[i38]));
                    sArr15[i37] = computeInField.addVect(sArr15[i37], computeInField.multVect(this.A1[i37][i38], this.pub_singular[i38]));
                    sArr16[i37] = GF2Field.addElem(sArr16[i37], GF2Field.multElem(this.A1[i37][i38], this.pub_scalar[i38]));
                    i38++;
                }
            }
            sArr16[i37] = GF2Field.addElem(sArr16[i37], this.f43847b1[i37]);
        }
        this.pub_singular = sArr15;
        this.pub_scalar = sArr16;
        compactPublicKey(sArr14);
    }

    private void generateF() {
        this.layers = new Layer[this.numOfLayers];
        int i11 = 0;
        while (i11 < this.numOfLayers) {
            Layer[] layerArr = this.layers;
            int[] iArr = this.f43850vi;
            int i12 = i11 + 1;
            layerArr[i11] = new Layer(iArr[i11], iArr[i12], this.f43849sr);
            i11 = i12;
        }
    }

    private void generateL1() {
        int[] iArr = this.f43850vi;
        int i11 = iArr[iArr.length - 1] - iArr[0];
        this.A1 = (short[][]) Array.newInstance(short.class, i11, i11);
        this.A1inv = null;
        ComputeInField computeInField = new ComputeInField();
        while (this.A1inv == null) {
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < i11; i13++) {
                    this.A1[i12][i13] = (short) (this.f43849sr.nextInt() & 255);
                }
            }
            this.A1inv = computeInField.inverse(this.A1);
        }
        this.f43847b1 = new short[i11];
        for (int i14 = 0; i14 < i11; i14++) {
            this.f43847b1[i14] = (short) (this.f43849sr.nextInt() & 255);
        }
    }

    private void generateL2() {
        int[] iArr = this.f43850vi;
        int i11 = iArr[iArr.length - 1];
        this.A2 = (short[][]) Array.newInstance(short.class, i11, i11);
        this.A2inv = null;
        ComputeInField computeInField = new ComputeInField();
        while (this.A2inv == null) {
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < i11; i13++) {
                    this.A2[i12][i13] = (short) (this.f43849sr.nextInt() & 255);
                }
            }
            this.A2inv = computeInField.inverse(this.A2);
        }
        this.f43848b2 = new short[i11];
        for (int i14 = 0; i14 < i11; i14++) {
            this.f43848b2[i14] = (short) (this.f43849sr.nextInt() & 255);
        }
    }

    private void initializeDefault() {
        initialize(new RainbowKeyGenerationParameters(new SecureRandom(), new RainbowParameters()));
    }

    private void keygen() {
        generateL1();
        generateL2();
        generateF();
        computePublicKey();
    }

    public AsymmetricCipherKeyPair genKeyPair() {
        if (!this.initialized) {
            initializeDefault();
        }
        keygen();
        RainbowPrivateKeyParameters rainbowPrivateKeyParameters = new RainbowPrivateKeyParameters(this.A1inv, this.f43847b1, this.A2inv, this.f43848b2, this.f43850vi, this.layers);
        int[] iArr = this.f43850vi;
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new RainbowPublicKeyParameters(iArr[iArr.length - 1] - iArr[0], this.pub_quadratic, this.pub_singular, this.pub_scalar), (AsymmetricKeyParameter) rainbowPrivateKeyParameters);
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }

    public void initialize(KeyGenerationParameters keyGenerationParameters) {
        this.rainbowParams = (RainbowKeyGenerationParameters) keyGenerationParameters;
        this.f43849sr = new SecureRandom();
        this.f43850vi = this.rainbowParams.getParameters().getVi();
        this.numOfLayers = this.rainbowParams.getParameters().getNumOfLayers();
        this.initialized = true;
    }
}