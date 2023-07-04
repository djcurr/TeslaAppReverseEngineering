package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import i50.x;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import n50.j;
import org.bouncycastle.crypto.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import u50.q;
import u50.r;

/* loaded from: classes5.dex */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    protected q params;
    protected SecureRandom random;
    protected int strength = 2048;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected AlgorithmParameters engineGenerateParameters() {
        j jVar = this.strength <= 1024 ? new j() : new j(new x());
        if (this.random == null) {
            this.random = k.b();
        }
        int defaultCertainty = PrimeCertaintyCalculator.getDefaultCertainty(this.strength);
        int i11 = this.strength;
        if (i11 == 1024) {
            q qVar = new q(1024, 160, defaultCertainty, this.random);
            this.params = qVar;
            jVar.l(qVar);
        } else if (i11 > 1024) {
            q qVar2 = new q(i11, 256, defaultCertainty, this.random);
            this.params = qVar2;
            jVar.l(qVar2);
        } else {
            jVar.k(i11, defaultCertainty, this.random);
        }
        r d11 = jVar.d();
        try {
            AlgorithmParameters createParametersInstance = createParametersInstance("DSA");
            createParametersInstance.init(new DSAParameterSpec(d11.b(), d11.c(), d11.a()));
            return createParametersInstance;
        } catch (Exception e11) {
            throw new RuntimeException(e11.getMessage());
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(int i11, SecureRandom secureRandom) {
        if (i11 < 512 || i11 > 3072) {
            throw new InvalidParameterException("strength must be from 512 - 3072");
        }
        if (i11 <= 1024 && i11 % 64 != 0) {
            throw new InvalidParameterException("strength must be a multiple of 64 below 1024 bits.");
        }
        if (i11 > 1024 && i11 % 1024 != 0) {
            throw new InvalidParameterException("strength must be a multiple of 1024 above 1024 bits.");
        }
        this.strength = i11;
        this.random = secureRandom;
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSA parameter generation.");
    }
}