package org.spongycastle.pqc.jcajce.provider.newhope;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.pqc.crypto.newhope.NHKeyPairGenerator;
import org.spongycastle.pqc.crypto.newhope.NHPrivateKeyParameters;
import org.spongycastle.pqc.crypto.newhope.NHPublicKeyParameters;

/* loaded from: classes4.dex */
public class NHKeyPairGeneratorSpi extends KeyPairGenerator {
    NHKeyPairGenerator engine;
    boolean initialised;
    SecureRandom random;

    public NHKeyPairGeneratorSpi() {
        super("NH");
        this.engine = new NHKeyPairGenerator();
        this.random = new SecureRandom();
        this.initialised = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            this.engine.init(new KeyGenerationParameters(this.random, 1024));
            this.initialised = true;
        }
        AsymmetricCipherKeyPair generateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCNHPublicKey((NHPublicKeyParameters) generateKeyPair.getPublic()), new BCNHPrivateKey((NHPrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i11, SecureRandom secureRandom) {
        if (i11 == 1024) {
            this.engine.init(new KeyGenerationParameters(secureRandom, 1024));
            this.initialised = true;
            return;
        }
        throw new IllegalArgumentException("strength must be 1024 bits");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        throw new InvalidAlgorithmParameterException("parameter object not recognised");
    }
}