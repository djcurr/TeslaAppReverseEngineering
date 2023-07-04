package org.spongycastle.crypto.paddings;

import java.security.SecureRandom;

/* loaded from: classes4.dex */
public interface BlockCipherPadding {
    int addPadding(byte[] bArr, int i11);

    String getPaddingName();

    void init(SecureRandom secureRandom);

    int padCount(byte[] bArr);
}