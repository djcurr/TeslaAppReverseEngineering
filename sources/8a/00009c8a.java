package org.spongycastle.crypto.params;

import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class DSAValidationParameters {
    private int counter;
    private byte[] seed;
    private int usageIndex;

    public DSAValidationParameters(byte[] bArr, int i11) {
        this(bArr, i11, -1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DSAValidationParameters) {
            DSAValidationParameters dSAValidationParameters = (DSAValidationParameters) obj;
            if (dSAValidationParameters.counter != this.counter) {
                return false;
            }
            return Arrays.areEqual(this.seed, dSAValidationParameters.seed);
        }
        return false;
    }

    public int getCounter() {
        return this.counter;
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public int getUsageIndex() {
        return this.usageIndex;
    }

    public int hashCode() {
        return this.counter ^ Arrays.hashCode(this.seed);
    }

    public DSAValidationParameters(byte[] bArr, int i11, int i12) {
        this.seed = bArr;
        this.counter = i11;
        this.usageIndex = i12;
    }
}