package org.spongycastle.pqc.crypto;

import org.spongycastle.crypto.CipherParameters;

/* loaded from: classes4.dex */
public interface MessageEncryptor {
    void init(boolean z11, CipherParameters cipherParameters);

    byte[] messageDecrypt(byte[] bArr);

    byte[] messageEncrypt(byte[] bArr);
}