package org.spongycastle.jcajce.spec;

import javax.crypto.spec.IvParameterSpec;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class AEADParameterSpec extends IvParameterSpec {
    private final byte[] associatedData;
    private final int macSizeInBits;

    public AEADParameterSpec(byte[] bArr, int i11) {
        this(bArr, i11, null);
    }

    public byte[] getAssociatedData() {
        return Arrays.clone(this.associatedData);
    }

    public int getMacSizeInBits() {
        return this.macSizeInBits;
    }

    public byte[] getNonce() {
        return getIV();
    }

    public AEADParameterSpec(byte[] bArr, int i11, byte[] bArr2) {
        super(bArr);
        this.macSizeInBits = i11;
        this.associatedData = Arrays.clone(bArr2);
    }
}