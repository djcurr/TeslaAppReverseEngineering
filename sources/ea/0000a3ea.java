package org.spongycastle.pqc.crypto.ntru;

import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.pqc.math.ntru.polynomial.DenseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Polynomial;
import org.spongycastle.pqc.math.ntru.polynomial.ProductFormPolynomial;
import org.spongycastle.pqc.math.ntru.util.Util;

/* loaded from: classes4.dex */
public class NTRUEncryptionKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NTRUEncryptionKeyGenerationParameters params;

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        Polynomial generateRandomTernary;
        IntegerPolynomial integerPolynomial;
        IntegerPolynomial invertFq;
        IntegerPolynomial integerPolynomial2;
        DenseTernaryPolynomial generateRandom;
        NTRUEncryptionKeyGenerationParameters nTRUEncryptionKeyGenerationParameters = this.params;
        int i11 = nTRUEncryptionKeyGenerationParameters.N;
        int i12 = nTRUEncryptionKeyGenerationParameters.f43821q;
        int i13 = nTRUEncryptionKeyGenerationParameters.f43818df;
        int i14 = nTRUEncryptionKeyGenerationParameters.df1;
        int i15 = nTRUEncryptionKeyGenerationParameters.df2;
        int i16 = nTRUEncryptionKeyGenerationParameters.df3;
        int i17 = nTRUEncryptionKeyGenerationParameters.f43819dg;
        boolean z11 = nTRUEncryptionKeyGenerationParameters.fastFp;
        boolean z12 = nTRUEncryptionKeyGenerationParameters.sparse;
        IntegerPolynomial integerPolynomial3 = null;
        while (true) {
            if (z11) {
                NTRUEncryptionKeyGenerationParameters nTRUEncryptionKeyGenerationParameters2 = this.params;
                generateRandomTernary = nTRUEncryptionKeyGenerationParameters2.polyType == 0 ? Util.generateRandomTernary(i11, i13, i13, z12, nTRUEncryptionKeyGenerationParameters2.getRandom()) : ProductFormPolynomial.generateRandom(i11, i14, i15, i16, i16, nTRUEncryptionKeyGenerationParameters2.getRandom());
                integerPolynomial = generateRandomTernary.toIntegerPolynomial();
                integerPolynomial.mult(3);
                int[] iArr = integerPolynomial.coeffs;
                iArr[0] = iArr[0] + 1;
            } else {
                NTRUEncryptionKeyGenerationParameters nTRUEncryptionKeyGenerationParameters3 = this.params;
                generateRandomTernary = nTRUEncryptionKeyGenerationParameters3.polyType == 0 ? Util.generateRandomTernary(i11, i13, i13 - 1, z12, nTRUEncryptionKeyGenerationParameters3.getRandom()) : ProductFormPolynomial.generateRandom(i11, i14, i15, i16, i16 - 1, nTRUEncryptionKeyGenerationParameters3.getRandom());
                integerPolynomial = generateRandomTernary.toIntegerPolynomial();
                integerPolynomial3 = integerPolynomial.invertF3();
                if (integerPolynomial3 == null) {
                    continue;
                }
            }
            invertFq = integerPolynomial.invertFq(i12);
            if (invertFq != null) {
                break;
            }
        }
        if (z11) {
            integerPolynomial2 = new IntegerPolynomial(i11);
            integerPolynomial2.coeffs[0] = 1;
        } else {
            integerPolynomial2 = integerPolynomial3;
        }
        do {
            generateRandom = DenseTernaryPolynomial.generateRandom(i11, i17, i17 - 1, this.params.getRandom());
        } while (generateRandom.invertFq(i12) == null);
        IntegerPolynomial mult = generateRandom.mult(invertFq, i12);
        mult.mult3(i12);
        mult.ensurePositive(i12);
        generateRandom.clear();
        invertFq.clear();
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new NTRUEncryptionPublicKeyParameters(mult, this.params.getEncryptionParameters()), (AsymmetricKeyParameter) new NTRUEncryptionPrivateKeyParameters(mult, generateRandomTernary, integerPolynomial2, this.params.getEncryptionParameters()));
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.params = (NTRUEncryptionKeyGenerationParameters) keyGenerationParameters;
    }
}