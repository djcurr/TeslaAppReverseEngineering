package org.spongycastle.crypto.tls;

/* loaded from: classes4.dex */
public interface TlsCipher {
    byte[] decodeCiphertext(long j11, short s11, byte[] bArr, int i11, int i12);

    byte[] encodePlaintext(long j11, short s11, byte[] bArr, int i11, int i12);

    int getPlaintextLimit(int i11);
}