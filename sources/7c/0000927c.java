package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import l60.i;
import n50.o;
import n50.p;
import org.bouncycastle.crypto.b;
import org.bouncycastle.crypto.k;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import u50.l0;
import u50.n0;
import u50.o0;
import u50.p0;

/* loaded from: classes5.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    int certainty;
    o engine;
    boolean initialised;
    l0 param;
    SecureRandom random;
    int strength;

    public KeyPairGeneratorSpi() {
        super("ElGamal");
        this.engine = new o();
        this.strength = 1024;
        this.certainty = 20;
        this.random = k.b();
        this.initialised = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        l0 l0Var;
        if (!this.initialised) {
            DHParameterSpec dHDefaultParameters = BouncyCastleProvider.CONFIGURATION.getDHDefaultParameters(this.strength);
            if (dHDefaultParameters != null) {
                l0Var = new l0(this.random, new n0(dHDefaultParameters.getP(), dHDefaultParameters.getG(), dHDefaultParameters.getL()));
            } else {
                p pVar = new p();
                pVar.b(this.strength, this.certainty, this.random);
                l0Var = new l0(this.random, pVar.a());
            }
            this.param = l0Var;
            this.engine.a(this.param);
            this.initialised = true;
        }
        b generateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCElGamalPublicKey((p0) generateKeyPair.b()), new BCElGamalPrivateKey((o0) generateKeyPair.a()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i11, SecureRandom secureRandom) {
        this.strength = i11;
        this.random = secureRandom;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        l0 l0Var;
        boolean z11 = algorithmParameterSpec instanceof i;
        if (!z11 && !(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec or an ElGamalParameterSpec");
        }
        if (z11) {
            i iVar = (i) algorithmParameterSpec;
            l0Var = new l0(secureRandom, new n0(iVar.b(), iVar.a()));
        } else {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            l0Var = new l0(secureRandom, new n0(dHParameterSpec.getP(), dHParameterSpec.getG(), dHParameterSpec.getL()));
        }
        this.param = l0Var;
        this.engine.a(this.param);
        this.initialised = true;
    }
}