package org.bouncycastle.crypto;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public interface l {
    BigInteger[] generateSignature(byte[] bArr);

    void init(boolean z11, i iVar);

    boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2);
}