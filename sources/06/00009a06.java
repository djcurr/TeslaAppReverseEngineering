package org.spongycastle.cert.crmf;

/* loaded from: classes5.dex */
public interface EncryptedValuePadder {
    byte[] getPaddedData(byte[] bArr);

    byte[] getUnpaddedData(byte[] bArr);
}