package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;

/* loaded from: classes4.dex */
public class BaseKeyGenerator extends KeyGeneratorSpi {
    protected String algName;
    protected int defaultKeySize;
    protected CipherKeyGenerator engine;
    protected int keySize;
    protected boolean uninitialised = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseKeyGenerator(String str, int i11, CipherKeyGenerator cipherKeyGenerator) {
        this.algName = str;
        this.defaultKeySize = i11;
        this.keySize = i11;
        this.engine = cipherKeyGenerator;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected SecretKey engineGenerateKey() {
        if (this.uninitialised) {
            this.engine.init(new KeyGenerationParameters(new SecureRandom(), this.defaultKeySize));
            this.uninitialised = false;
        }
        return new SecretKeySpec(this.engine.generateKey(), this.algName);
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        throw new InvalidAlgorithmParameterException("Not Implemented");
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected void engineInit(SecureRandom secureRandom) {
        if (secureRandom != null) {
            this.engine.init(new KeyGenerationParameters(secureRandom, this.defaultKeySize));
            this.uninitialised = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(int i11, SecureRandom secureRandom) {
        if (secureRandom == null) {
            try {
                secureRandom = new SecureRandom();
            } catch (IllegalArgumentException e11) {
                throw new InvalidParameterException(e11.getMessage());
            }
        }
        this.engine.init(new KeyGenerationParameters(secureRandom, i11));
        this.uninitialised = false;
    }
}