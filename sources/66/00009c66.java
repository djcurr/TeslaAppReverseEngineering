package org.spongycastle.crypto.modes.gcm;

/* loaded from: classes4.dex */
public interface GCMExponentiator {
    void exponentiateX(long j11, byte[] bArr);

    void init(byte[] bArr);
}