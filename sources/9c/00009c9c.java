package org.spongycastle.crypto.params;

import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class HKDFParameters implements DerivationParameters {
    private final byte[] ikm;
    private final byte[] info;
    private final byte[] salt;
    private final boolean skipExpand;

    private HKDFParameters(byte[] bArr, boolean z11, byte[] bArr2, byte[] bArr3) {
        if (bArr != null) {
            this.ikm = Arrays.clone(bArr);
            this.skipExpand = z11;
            if (bArr2 != null && bArr2.length != 0) {
                this.salt = Arrays.clone(bArr2);
            } else {
                this.salt = null;
            }
            if (bArr3 == null) {
                this.info = new byte[0];
                return;
            } else {
                this.info = Arrays.clone(bArr3);
                return;
            }
        }
        throw new IllegalArgumentException("IKM (input keying material) should not be null");
    }

    public static HKDFParameters defaultParameters(byte[] bArr) {
        return new HKDFParameters(bArr, false, null, null);
    }

    public static HKDFParameters skipExtractParameters(byte[] bArr, byte[] bArr2) {
        return new HKDFParameters(bArr, true, null, bArr2);
    }

    public byte[] getIKM() {
        return Arrays.clone(this.ikm);
    }

    public byte[] getInfo() {
        return Arrays.clone(this.info);
    }

    public byte[] getSalt() {
        return Arrays.clone(this.salt);
    }

    public boolean skipExtract() {
        return this.skipExpand;
    }

    public HKDFParameters(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(bArr, false, bArr2, bArr3);
    }
}