package org.spongycastle.crypto.tls;

/* loaded from: classes4.dex */
public interface TlsPeer {
    TlsCipher getCipher();

    TlsCompression getCompression();

    void notifyAlertRaised(short s11, short s12, String str, Throwable th2);

    void notifyAlertReceived(short s11, short s12);

    void notifyHandshakeComplete();

    void notifySecureRenegotiation(boolean z11);

    boolean shouldUseGMTUnixTime();
}