package org.spongycastle.crypto;

import java.security.SecureRandom;

/* loaded from: classes4.dex */
public class KeyGenerationParameters {
    private SecureRandom random;
    private int strength;

    public KeyGenerationParameters(SecureRandom secureRandom, int i11) {
        this.random = secureRandom;
        this.strength = i11;
    }

    public SecureRandom getRandom() {
        return this.random;
    }

    public int getStrength() {
        return this.strength;
    }
}