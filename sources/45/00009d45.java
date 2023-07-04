package org.spongycastle.crypto.tls;

import java.util.Hashtable;

/* loaded from: classes4.dex */
public class SRPTlsServer extends AbstractTlsServer {
    protected TlsSRPLoginParameters loginParameters;
    protected byte[] srpIdentity;
    protected TlsSRPIdentityManager srpIdentityManager;

    public SRPTlsServer(TlsSRPIdentityManager tlsSRPIdentityManager) {
        this(new DefaultTlsCipherFactory(), tlsSRPIdentityManager);
    }

    protected TlsKeyExchange createSRPKeyExchange(int i11) {
        return new TlsSRPKeyExchange(i11, this.supportedSignatureAlgorithms, this.srpIdentity, this.loginParameters);
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsServer
    protected int[] getCipherSuites() {
        return new int[]{CipherSuite.TLS_SRP_SHA_DSS_WITH_AES_256_CBC_SHA, CipherSuite.TLS_SRP_SHA_DSS_WITH_AES_128_CBC_SHA, CipherSuite.TLS_SRP_SHA_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_SRP_SHA_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_SRP_SHA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_SRP_SHA_WITH_AES_128_CBC_SHA};
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public TlsCredentials getCredentials() {
        switch (TlsUtils.getKeyExchangeAlgorithm(this.selectedCipherSuite)) {
            case 21:
                return null;
            case 22:
                return getDSASignerCredentials();
            case 23:
                return getRSASignerCredentials();
            default:
                throw new TlsFatalAlert((short) 80);
        }
    }

    protected TlsSignerCredentials getDSASignerCredentials() {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public TlsKeyExchange getKeyExchange() {
        int keyExchangeAlgorithm = TlsUtils.getKeyExchangeAlgorithm(this.selectedCipherSuite);
        switch (keyExchangeAlgorithm) {
            case 21:
            case 22:
            case 23:
                return createSRPKeyExchange(keyExchangeAlgorithm);
            default:
                throw new TlsFatalAlert((short) 80);
        }
    }

    protected TlsSignerCredentials getRSASignerCredentials() {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsServer, org.spongycastle.crypto.tls.TlsServer
    public int getSelectedCipherSuite() {
        int selectedCipherSuite = super.getSelectedCipherSuite();
        if (TlsSRPUtils.isSRPCipherSuite(selectedCipherSuite)) {
            byte[] bArr = this.srpIdentity;
            if (bArr != null) {
                this.loginParameters = this.srpIdentityManager.getLoginParameters(bArr);
            }
            if (this.loginParameters == null) {
                throw new TlsFatalAlert(AlertDescription.unknown_psk_identity);
            }
        }
        return selectedCipherSuite;
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsServer, org.spongycastle.crypto.tls.TlsServer
    public void processClientExtensions(Hashtable hashtable) {
        super.processClientExtensions(hashtable);
        this.srpIdentity = TlsSRPUtils.getSRPExtension(hashtable);
    }

    public SRPTlsServer(TlsCipherFactory tlsCipherFactory, TlsSRPIdentityManager tlsSRPIdentityManager) {
        super(tlsCipherFactory);
        this.srpIdentity = null;
        this.loginParameters = null;
        this.srpIdentityManager = tlsSRPIdentityManager;
    }
}