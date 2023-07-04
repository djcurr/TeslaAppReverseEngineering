package org.spongycastle.crypto.prng;

import java.security.SecureRandom;

/* loaded from: classes4.dex */
public class X931SecureRandom extends SecureRandom {
    private final X931RNG drbg;
    private final boolean predictionResistant;
    private final SecureRandom randomSource;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X931SecureRandom(SecureRandom secureRandom, X931RNG x931rng, boolean z11) {
        this.randomSource = secureRandom;
        this.drbg = x931rng;
        this.predictionResistant = z11;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i11) {
        return EntropyUtil.generateSeed(this.drbg.getEntropySource(), i11);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        synchronized (this) {
            if (this.drbg.generate(bArr, this.predictionResistant) < 0) {
                this.drbg.reseed();
                this.drbg.generate(bArr, this.predictionResistant);
            }
        }
    }

    @Override // java.security.SecureRandom
    public void setSeed(byte[] bArr) {
        synchronized (this) {
            SecureRandom secureRandom = this.randomSource;
            if (secureRandom != null) {
                secureRandom.setSeed(bArr);
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void setSeed(long j11) {
        synchronized (this) {
            SecureRandom secureRandom = this.randomSource;
            if (secureRandom != null) {
                secureRandom.setSeed(j11);
            }
        }
    }
}