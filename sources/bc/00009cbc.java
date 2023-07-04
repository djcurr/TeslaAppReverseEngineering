package org.spongycastle.crypto.prng;

import java.security.SecureRandom;

/* loaded from: classes4.dex */
public class BasicEntropySourceProvider implements EntropySourceProvider {
    private final boolean _predictionResistant;
    private final SecureRandom _sr;

    public BasicEntropySourceProvider(SecureRandom secureRandom, boolean z11) {
        this._sr = secureRandom;
        this._predictionResistant = z11;
    }

    @Override // org.spongycastle.crypto.prng.EntropySourceProvider
    public EntropySource get(final int i11) {
        return new EntropySource() { // from class: org.spongycastle.crypto.prng.BasicEntropySourceProvider.1
            @Override // org.spongycastle.crypto.prng.EntropySource
            public int entropySize() {
                return i11;
            }

            @Override // org.spongycastle.crypto.prng.EntropySource
            public byte[] getEntropy() {
                if (!(BasicEntropySourceProvider.this._sr instanceof SP800SecureRandom) && !(BasicEntropySourceProvider.this._sr instanceof X931SecureRandom)) {
                    return BasicEntropySourceProvider.this._sr.generateSeed((i11 + 7) / 8);
                }
                byte[] bArr = new byte[(i11 + 7) / 8];
                BasicEntropySourceProvider.this._sr.nextBytes(bArr);
                return bArr;
            }

            @Override // org.spongycastle.crypto.prng.EntropySource
            public boolean isPredictionResistant() {
                return BasicEntropySourceProvider.this._predictionResistant;
            }
        };
    }
}