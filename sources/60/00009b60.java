package org.spongycastle.crypto;

/* loaded from: classes4.dex */
public interface Xof extends ExtendedDigest {
    int doFinal(byte[] bArr, int i11, int i12);

    int doOutput(byte[] bArr, int i11, int i12);
}