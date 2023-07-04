package org.spongycastle.crypto.params;

import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public final class KDFDoublePipelineIterationParameters implements DerivationParameters {
    private static final int UNUSED_R = 32;
    private final byte[] fixedInputData;

    /* renamed from: ki  reason: collision with root package name */
    private final byte[] f43611ki;

    /* renamed from: r  reason: collision with root package name */
    private final int f43612r;
    private final boolean useCounter;

    private KDFDoublePipelineIterationParameters(byte[] bArr, byte[] bArr2, int i11, boolean z11) {
        if (bArr != null) {
            this.f43611ki = Arrays.clone(bArr);
            if (bArr2 == null) {
                this.fixedInputData = new byte[0];
            } else {
                this.fixedInputData = Arrays.clone(bArr2);
            }
            if (i11 != 8 && i11 != 16 && i11 != 24 && i11 != 32) {
                throw new IllegalArgumentException("Length of counter should be 8, 16, 24 or 32");
            }
            this.f43612r = i11;
            this.useCounter = z11;
            return;
        }
        throw new IllegalArgumentException("A KDF requires Ki (a seed) as input");
    }

    public static KDFDoublePipelineIterationParameters createWithCounter(byte[] bArr, byte[] bArr2, int i11) {
        return new KDFDoublePipelineIterationParameters(bArr, bArr2, i11, true);
    }

    public static KDFDoublePipelineIterationParameters createWithoutCounter(byte[] bArr, byte[] bArr2) {
        return new KDFDoublePipelineIterationParameters(bArr, bArr2, 32, false);
    }

    public byte[] getFixedInputData() {
        return Arrays.clone(this.fixedInputData);
    }

    public byte[] getKI() {
        return this.f43611ki;
    }

    public int getR() {
        return this.f43612r;
    }

    public boolean useCounter() {
        return this.useCounter;
    }
}