package org.spongycastle.crypto.tls;

/* loaded from: classes4.dex */
public interface TlsSignerCredentials extends TlsCredentials {
    byte[] generateCertificateSignature(byte[] bArr);

    SignatureAndHashAlgorithm getSignatureAndHashAlgorithm();
}