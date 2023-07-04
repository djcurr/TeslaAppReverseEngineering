package org.spongycastle.crypto;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public interface DSA {
    BigInteger[] generateSignature(byte[] bArr);

    void init(boolean z11, CipherParameters cipherParameters);

    boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2);
}