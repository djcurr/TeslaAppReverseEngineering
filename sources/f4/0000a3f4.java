package org.spongycastle.pqc.crypto.ntru;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.pqc.crypto.ntru.NTRUSigningPrivateKeyParameters;
import org.spongycastle.pqc.math.ntru.euclid.BigIntEuclidean;
import org.spongycastle.pqc.math.ntru.polynomial.BigDecimalPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.BigIntPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.DenseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Polynomial;
import org.spongycastle.pqc.math.ntru.polynomial.ProductFormPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Resultant;

/* loaded from: classes4.dex */
public class NTRUSigningKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NTRUSigningKeyGenerationParameters params;

    /* loaded from: classes4.dex */
    private class BasisGenerationTask implements Callable<NTRUSigningPrivateKeyParameters.Basis> {
        private BasisGenerationTask() {
        }

        @Override // java.util.concurrent.Callable
        public NTRUSigningPrivateKeyParameters.Basis call() {
            return NTRUSigningKeyPairGenerator.this.generateBoundedBasis();
        }
    }

    /* loaded from: classes4.dex */
    public class FGBasis extends NTRUSigningPrivateKeyParameters.Basis {
        public IntegerPolynomial F;
        public IntegerPolynomial G;

        FGBasis(Polynomial polynomial, Polynomial polynomial2, IntegerPolynomial integerPolynomial, IntegerPolynomial integerPolynomial2, IntegerPolynomial integerPolynomial3, NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters) {
            super(polynomial, polynomial2, integerPolynomial, nTRUSigningKeyGenerationParameters);
            this.F = integerPolynomial2;
            this.G = integerPolynomial3;
        }

        boolean isNormOk() {
            NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters = this.params;
            double d11 = nTRUSigningKeyGenerationParameters.keyNormBoundSq;
            int i11 = nTRUSigningKeyGenerationParameters.f43836q;
            return ((double) this.F.centeredNormSq(i11)) < d11 && ((double) this.G.centeredNormSq(i11)) < d11;
        }
    }

    private FGBasis generateBasis() {
        int i11;
        Polynomial generateRandom;
        Polynomial polynomial;
        IntegerPolynomial integerPolynomial;
        IntegerPolynomial invertFq;
        int i12;
        Resultant resultant;
        int i13;
        IntegerPolynomial integerPolynomial2;
        int i14;
        IntegerPolynomial integerPolynomial3;
        int i15;
        Polynomial polynomial2;
        Polynomial generateRandom2;
        Polynomial polynomial3;
        IntegerPolynomial integerPolynomial4;
        Resultant resultant2;
        BigIntEuclidean calculate;
        BigIntPolynomial round;
        IntegerPolynomial mult;
        Polynomial polynomial4;
        NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters = this.params;
        int i16 = nTRUSigningKeyGenerationParameters.N;
        int i17 = nTRUSigningKeyGenerationParameters.f43836q;
        int i18 = nTRUSigningKeyGenerationParameters.f43832d;
        int i19 = nTRUSigningKeyGenerationParameters.f43833d1;
        int i21 = nTRUSigningKeyGenerationParameters.f43834d2;
        int i22 = nTRUSigningKeyGenerationParameters.f43835d3;
        int i23 = nTRUSigningKeyGenerationParameters.basisType;
        int i24 = (i16 * 2) + 1;
        boolean z11 = nTRUSigningKeyGenerationParameters.primeCheck;
        while (true) {
            if (this.params.polyType == 0) {
                generateRandom = DenseTernaryPolynomial.generateRandom(i16, i18 + 1, i18, new SecureRandom());
                i11 = i24;
            } else {
                i11 = i24;
                generateRandom = ProductFormPolynomial.generateRandom(i16, i19, i21, i22 + 1, i22, new SecureRandom());
            }
            polynomial = generateRandom;
            integerPolynomial = polynomial.toIntegerPolynomial();
            if (z11 && integerPolynomial.resultant(i11).res.equals(BigInteger.ZERO)) {
                i24 = i11;
            } else {
                invertFq = integerPolynomial.invertFq(i17);
                if (invertFq != null) {
                    break;
                }
                i24 = i11;
            }
        }
        Resultant resultant3 = integerPolynomial.resultant();
        while (true) {
            if (this.params.polyType == 0) {
                generateRandom2 = DenseTernaryPolynomial.generateRandom(i16, i18 + 1, i18, new SecureRandom());
                i12 = i18;
                i13 = i19;
                i14 = i21;
                i15 = i22;
                resultant = resultant3;
                integerPolynomial2 = invertFq;
                integerPolynomial3 = integerPolynomial;
                polynomial2 = polynomial;
            } else {
                int i25 = i19;
                i12 = i18;
                resultant = resultant3;
                int i26 = i21;
                i13 = i19;
                integerPolynomial2 = invertFq;
                i14 = i21;
                integerPolynomial3 = integerPolynomial;
                int i27 = i22;
                i15 = i22;
                polynomial2 = polynomial;
                generateRandom2 = ProductFormPolynomial.generateRandom(i16, i25, i26, i22 + 1, i27, new SecureRandom());
            }
            polynomial3 = generateRandom2;
            integerPolynomial4 = polynomial3.toIntegerPolynomial();
            if (!z11 || !integerPolynomial4.resultant(i11).res.equals(BigInteger.ZERO)) {
                if (integerPolynomial4.invertFq(i17) != null) {
                    resultant2 = integerPolynomial4.resultant();
                    calculate = BigIntEuclidean.calculate(resultant.res, resultant2.res);
                    if (calculate.gcd.equals(BigInteger.ONE)) {
                        break;
                    }
                }
            }
            resultant3 = resultant;
            invertFq = integerPolynomial2;
            integerPolynomial = integerPolynomial3;
            polynomial = polynomial2;
            i21 = i14;
            i18 = i12;
            i19 = i13;
            i22 = i15;
        }
        BigIntPolynomial bigIntPolynomial = (BigIntPolynomial) resultant.rho.clone();
        bigIntPolynomial.mult(calculate.f43880x.multiply(BigInteger.valueOf(i17)));
        BigIntPolynomial bigIntPolynomial2 = (BigIntPolynomial) resultant2.rho.clone();
        bigIntPolynomial2.mult(calculate.f43881y.multiply(BigInteger.valueOf(-i17)));
        int i28 = 0;
        if (this.params.keyGenAlg == 0) {
            int[] iArr = new int[i16];
            int[] iArr2 = new int[i16];
            iArr[0] = integerPolynomial3.coeffs[0];
            iArr2[0] = integerPolynomial4.coeffs[0];
            for (int i29 = 1; i29 < i16; i29++) {
                int i31 = i16 - i29;
                iArr[i29] = integerPolynomial3.coeffs[i31];
                iArr2[i29] = integerPolynomial4.coeffs[i31];
            }
            IntegerPolynomial integerPolynomial5 = new IntegerPolynomial(iArr);
            IntegerPolynomial integerPolynomial6 = new IntegerPolynomial(iArr2);
            IntegerPolynomial mult2 = polynomial2.mult(integerPolynomial5);
            mult2.add(polynomial3.mult(integerPolynomial6));
            Resultant resultant4 = mult2.resultant();
            BigIntPolynomial mult3 = integerPolynomial5.mult(bigIntPolynomial2);
            mult3.add(integerPolynomial6.mult(bigIntPolynomial));
            round = mult3.mult(resultant4.rho);
            round.div(resultant4.res);
        } else {
            for (int i32 = 1; i32 < i16; i32 *= 10) {
                i28++;
            }
            BigDecimalPolynomial div = resultant.rho.div(new BigDecimal(resultant.res), bigIntPolynomial2.getMaxCoeffLength() + 1 + i28);
            BigDecimalPolynomial div2 = resultant2.rho.div(new BigDecimal(resultant2.res), bigIntPolynomial.getMaxCoeffLength() + 1 + i28);
            BigDecimalPolynomial mult4 = div.mult(bigIntPolynomial2);
            mult4.add(div2.mult(bigIntPolynomial));
            mult4.halve();
            round = mult4.round();
        }
        BigIntPolynomial bigIntPolynomial3 = (BigIntPolynomial) bigIntPolynomial2.clone();
        bigIntPolynomial3.sub(polynomial2.mult(round));
        BigIntPolynomial bigIntPolynomial4 = (BigIntPolynomial) bigIntPolynomial.clone();
        bigIntPolynomial4.sub(polynomial3.mult(round));
        IntegerPolynomial integerPolynomial7 = new IntegerPolynomial(bigIntPolynomial3);
        IntegerPolynomial integerPolynomial8 = new IntegerPolynomial(bigIntPolynomial4);
        minimizeFG(integerPolynomial3, integerPolynomial4, integerPolynomial7, integerPolynomial8, i16);
        if (i23 == 0) {
            mult = polynomial3.mult(integerPolynomial2, i17);
            polynomial4 = integerPolynomial7;
        } else {
            mult = integerPolynomial7.mult(integerPolynomial2, i17);
            polynomial4 = polynomial3;
        }
        mult.modPositive(i17);
        return new FGBasis(polynomial2, polynomial4, mult, integerPolynomial7, integerPolynomial8, this.params);
    }

    private void minimizeFG(IntegerPolynomial integerPolynomial, IntegerPolynomial integerPolynomial2, IntegerPolynomial integerPolynomial3, IntegerPolynomial integerPolynomial4, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int[] iArr = integerPolynomial.coeffs;
            int i14 = iArr[i13] * iArr[i13];
            int[] iArr2 = integerPolynomial2.coeffs;
            i12 += i11 * 2 * (i14 + (iArr2[i13] * iArr2[i13]));
        }
        int i15 = i12 - 4;
        IntegerPolynomial integerPolynomial5 = (IntegerPolynomial) integerPolynomial.clone();
        IntegerPolynomial integerPolynomial6 = (IntegerPolynomial) integerPolynomial2.clone();
        int i16 = 0;
        int i17 = 0;
        while (i16 < i11 && i17 < i11) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += i11 * 4 * ((integerPolynomial3.coeffs[i19] * integerPolynomial.coeffs[i19]) + (integerPolynomial4.coeffs[i19] * integerPolynomial2.coeffs[i19]));
            }
            int sumCoeffs = i18 - ((integerPolynomial3.sumCoeffs() + integerPolynomial4.sumCoeffs()) * 4);
            if (sumCoeffs > i15) {
                integerPolynomial3.sub(integerPolynomial5);
                integerPolynomial4.sub(integerPolynomial6);
            } else if (sumCoeffs < (-i15)) {
                integerPolynomial3.add(integerPolynomial5);
                integerPolynomial4.add(integerPolynomial6);
            } else {
                i17++;
                integerPolynomial5.rotate1();
                integerPolynomial6.rotate1();
            }
            i16++;
            i17 = 0;
            i17++;
            integerPolynomial5.rotate1();
            integerPolynomial6.rotate1();
        }
    }

    public NTRUSigningPrivateKeyParameters.Basis generateBoundedBasis() {
        FGBasis generateBasis;
        do {
            generateBasis = generateBasis();
        } while (!generateBasis.isNormOk());
        return generateBasis;
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        ArrayList arrayList = new ArrayList();
        int i11 = this.params.B;
        while (true) {
            nTRUSigningPublicKeyParameters = null;
            if (i11 < 0) {
                break;
            }
            arrayList.add(newCachedThreadPool.submit(new BasisGenerationTask()));
            i11--;
        }
        newCachedThreadPool.shutdown();
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = this.params.B; i12 >= 0; i12--) {
            Future future = (Future) arrayList.get(i12);
            try {
                arrayList2.add(future.get());
                if (i12 == this.params.B) {
                    nTRUSigningPublicKeyParameters = new NTRUSigningPublicKeyParameters(((NTRUSigningPrivateKeyParameters.Basis) future.get()).f43843h, this.params.getSigningParameters());
                }
            } catch (Exception e11) {
                throw new IllegalStateException(e11);
            }
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) nTRUSigningPublicKeyParameters, (AsymmetricKeyParameter) new NTRUSigningPrivateKeyParameters(arrayList2, nTRUSigningPublicKeyParameters));
    }

    public AsymmetricCipherKeyPair generateKeyPairSingleThread() {
        ArrayList arrayList = new ArrayList();
        NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters = null;
        for (int i11 = this.params.B; i11 >= 0; i11--) {
            NTRUSigningPrivateKeyParameters.Basis generateBoundedBasis = generateBoundedBasis();
            arrayList.add(generateBoundedBasis);
            if (i11 == 0) {
                nTRUSigningPublicKeyParameters = new NTRUSigningPublicKeyParameters(generateBoundedBasis.f43843h, this.params.getSigningParameters());
            }
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) nTRUSigningPublicKeyParameters, (AsymmetricKeyParameter) new NTRUSigningPrivateKeyParameters(arrayList, nTRUSigningPublicKeyParameters));
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.params = (NTRUSigningKeyGenerationParameters) keyGenerationParameters;
    }
}