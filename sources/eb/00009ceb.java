package org.spongycastle.crypto.tls;

/* loaded from: classes4.dex */
public class AbstractTlsCipherFactory implements TlsCipherFactory {
    @Override // org.spongycastle.crypto.tls.TlsCipherFactory
    public TlsCipher createCipher(TlsContext tlsContext, int i11, int i12) {
        throw new TlsFatalAlert((short) 80);
    }
}