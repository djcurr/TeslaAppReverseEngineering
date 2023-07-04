package org.spongycastle.crypto.tls;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.engines.AESEngine;
import org.spongycastle.crypto.engines.CamelliaEngine;
import org.spongycastle.crypto.engines.DESedeEngine;
import org.spongycastle.crypto.engines.RC4Engine;
import org.spongycastle.crypto.engines.SEEDEngine;
import org.spongycastle.crypto.modes.AEADBlockCipher;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.modes.CCMBlockCipher;
import org.spongycastle.crypto.modes.GCMBlockCipher;
import org.spongycastle.crypto.modes.OCBBlockCipher;

/* loaded from: classes4.dex */
public class DefaultTlsCipherFactory extends AbstractTlsCipherFactory {
    protected AEADBlockCipher createAEADBlockCipher_AES_CCM() {
        return new CCMBlockCipher(createAESEngine());
    }

    protected AEADBlockCipher createAEADBlockCipher_AES_GCM() {
        return new GCMBlockCipher(createAESEngine());
    }

    protected AEADBlockCipher createAEADBlockCipher_AES_OCB() {
        return new OCBBlockCipher(createAESEngine(), createAESEngine());
    }

    protected AEADBlockCipher createAEADBlockCipher_Camellia_GCM() {
        return new GCMBlockCipher(createCamelliaEngine());
    }

    protected BlockCipher createAESBlockCipher() {
        return new CBCBlockCipher(createAESEngine());
    }

    protected TlsBlockCipher createAESCipher(TlsContext tlsContext, int i11, int i12) {
        return new TlsBlockCipher(tlsContext, createAESBlockCipher(), createAESBlockCipher(), createHMACDigest(i12), createHMACDigest(i12), i11);
    }

    protected BlockCipher createAESEngine() {
        return new AESEngine();
    }

    protected BlockCipher createCamelliaBlockCipher() {
        return new CBCBlockCipher(createCamelliaEngine());
    }

    protected TlsBlockCipher createCamelliaCipher(TlsContext tlsContext, int i11, int i12) {
        return new TlsBlockCipher(tlsContext, createCamelliaBlockCipher(), createCamelliaBlockCipher(), createHMACDigest(i12), createHMACDigest(i12), i11);
    }

    protected BlockCipher createCamelliaEngine() {
        return new CamelliaEngine();
    }

    protected TlsCipher createChaCha20Poly1305(TlsContext tlsContext) {
        return new Chacha20Poly1305(tlsContext);
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsCipherFactory, org.spongycastle.crypto.tls.TlsCipherFactory
    public TlsCipher createCipher(TlsContext tlsContext, int i11, int i12) {
        if (i11 != 0) {
            if (i11 != 2) {
                switch (i11) {
                    case 7:
                        return createDESedeCipher(tlsContext, i12);
                    case 8:
                        return createAESCipher(tlsContext, 16, i12);
                    case 9:
                        return createAESCipher(tlsContext, 32, i12);
                    case 10:
                        return createCipher_AES_GCM(tlsContext, 16, 16);
                    case 11:
                        return createCipher_AES_GCM(tlsContext, 32, 16);
                    case 12:
                        return createCamelliaCipher(tlsContext, 16, i12);
                    case 13:
                        return createCamelliaCipher(tlsContext, 32, i12);
                    case 14:
                        return createSEEDCipher(tlsContext, i12);
                    case 15:
                        return createCipher_AES_CCM(tlsContext, 16, 16);
                    case 16:
                        return createCipher_AES_CCM(tlsContext, 16, 8);
                    case 17:
                        return createCipher_AES_CCM(tlsContext, 32, 16);
                    case 18:
                        return createCipher_AES_CCM(tlsContext, 32, 8);
                    case 19:
                        return createCipher_Camellia_GCM(tlsContext, 16, 16);
                    case 20:
                        return createCipher_Camellia_GCM(tlsContext, 32, 16);
                    default:
                        switch (i11) {
                            case 102:
                                return createChaCha20Poly1305(tlsContext);
                            case 103:
                                return createCipher_AES_OCB(tlsContext, 16, 12);
                            case 104:
                                return createCipher_AES_OCB(tlsContext, 32, 12);
                            default:
                                throw new TlsFatalAlert((short) 80);
                        }
                }
            }
            return createRC4Cipher(tlsContext, 16, i12);
        }
        return createNullCipher(tlsContext, i12);
    }

    protected TlsAEADCipher createCipher_AES_CCM(TlsContext tlsContext, int i11, int i12) {
        return new TlsAEADCipher(tlsContext, createAEADBlockCipher_AES_CCM(), createAEADBlockCipher_AES_CCM(), i11, i12);
    }

    protected TlsAEADCipher createCipher_AES_GCM(TlsContext tlsContext, int i11, int i12) {
        return new TlsAEADCipher(tlsContext, createAEADBlockCipher_AES_GCM(), createAEADBlockCipher_AES_GCM(), i11, i12);
    }

    protected TlsAEADCipher createCipher_AES_OCB(TlsContext tlsContext, int i11, int i12) {
        return new TlsAEADCipher(tlsContext, createAEADBlockCipher_AES_OCB(), createAEADBlockCipher_AES_OCB(), i11, i12, 2);
    }

    protected TlsAEADCipher createCipher_Camellia_GCM(TlsContext tlsContext, int i11, int i12) {
        return new TlsAEADCipher(tlsContext, createAEADBlockCipher_Camellia_GCM(), createAEADBlockCipher_Camellia_GCM(), i11, i12);
    }

    protected BlockCipher createDESedeBlockCipher() {
        return new CBCBlockCipher(new DESedeEngine());
    }

    protected TlsBlockCipher createDESedeCipher(TlsContext tlsContext, int i11) {
        return new TlsBlockCipher(tlsContext, createDESedeBlockCipher(), createDESedeBlockCipher(), createHMACDigest(i11), createHMACDigest(i11), 24);
    }

    protected Digest createHMACDigest(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                return TlsUtils.createHash((short) 6);
                            }
                            throw new TlsFatalAlert((short) 80);
                        }
                        return TlsUtils.createHash((short) 5);
                    }
                    return TlsUtils.createHash((short) 4);
                }
                return TlsUtils.createHash((short) 2);
            }
            return TlsUtils.createHash((short) 1);
        }
        return null;
    }

    protected TlsNullCipher createNullCipher(TlsContext tlsContext, int i11) {
        return new TlsNullCipher(tlsContext, createHMACDigest(i11), createHMACDigest(i11));
    }

    protected TlsStreamCipher createRC4Cipher(TlsContext tlsContext, int i11, int i12) {
        return new TlsStreamCipher(tlsContext, createRC4StreamCipher(), createRC4StreamCipher(), createHMACDigest(i12), createHMACDigest(i12), i11, false);
    }

    protected StreamCipher createRC4StreamCipher() {
        return new RC4Engine();
    }

    protected BlockCipher createSEEDBlockCipher() {
        return new CBCBlockCipher(new SEEDEngine());
    }

    protected TlsBlockCipher createSEEDCipher(TlsContext tlsContext, int i11) {
        return new TlsBlockCipher(tlsContext, createSEEDBlockCipher(), createSEEDBlockCipher(), createHMACDigest(i11), createHMACDigest(i11), 16);
    }
}