package org.spongycastle.crypto.tls;

/* loaded from: classes4.dex */
public interface TlsPSKIdentityManager {
    byte[] getHint();

    byte[] getPSK(byte[] bArr);
}