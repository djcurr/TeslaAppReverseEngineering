package org.spongycastle.crypto.params;

import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class DHValidationParameters {
    private int counter;
    private byte[] seed;

    public DHValidationParameters(byte[] bArr, int i11) {
        this.seed = bArr;
        this.counter = i11;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DHValidationParameters) {
            DHValidationParameters dHValidationParameters = (DHValidationParameters) obj;
            if (dHValidationParameters.counter != this.counter) {
                return false;
            }
            return Arrays.areEqual(this.seed, dHValidationParameters.seed);
        }
        return false;
    }

    public int getCounter() {
        return this.counter;
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public int hashCode() {
        return this.counter ^ Arrays.hashCode(this.seed);
    }
}