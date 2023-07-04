package org.spongycastle.crypto.tls;

/* loaded from: classes4.dex */
public interface TlsEncryptionCredentials extends TlsCredentials {
    byte[] decryptPreMasterSecret(byte[] bArr);
}