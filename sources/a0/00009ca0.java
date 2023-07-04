package org.spongycastle.crypto.params;

import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public final class KDFCounterParameters implements DerivationParameters {
    private byte[] fixedInputDataCounterPrefix;
    private byte[] fixedInputDataCounterSuffix;

    /* renamed from: ki  reason: collision with root package name */
    private byte[] f43609ki;

    /* renamed from: r  reason: collision with root package name */
    private int f43610r;

    public KDFCounterParameters(byte[] bArr, byte[] bArr2, int i11) {
        this(bArr, null, bArr2, i11);
    }

    public byte[] getFixedInputData() {
        return Arrays.clone(this.fixedInputDataCounterSuffix);
    }

    public byte[] getFixedInputDataCounterPrefix() {
        return Arrays.clone(this.fixedInputDataCounterPrefix);
    }

    public byte[] getFixedInputDataCounterSuffix() {
        return Arrays.clone(this.fixedInputDataCounterSuffix);
    }

    public byte[] getKI() {
        return this.f43609ki;
    }

    public int getR() {
        return this.f43610r;
    }

    public KDFCounterParameters(byte[] bArr, byte[] bArr2, byte[] bArr3, int i11) {
        if (bArr != null) {
            this.f43609ki = Arrays.clone(bArr);
            if (bArr2 == null) {
                this.fixedInputDataCounterPrefix = new byte[0];
            } else {
                this.fixedInputDataCounterPrefix = Arrays.clone(bArr2);
            }
            if (bArr3 == null) {
                this.fixedInputDataCounterSuffix = new byte[0];
            } else {
                this.fixedInputDataCounterSuffix = Arrays.clone(bArr3);
            }
            if (i11 != 8 && i11 != 16 && i11 != 24 && i11 != 32) {
                throw new IllegalArgumentException("Length of counter should be 8, 16, 24 or 32");
            }
            this.f43610r = i11;
            return;
        }
        throw new IllegalArgumentException("A KDF requires Ki (a seed) as input");
    }
}