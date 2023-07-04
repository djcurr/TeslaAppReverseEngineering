package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.z;
import u50.b;
import u50.g0;
import u50.h0;
import u50.j0;
import u50.k0;
import y50.i;
import y50.j;

/* loaded from: classes5.dex */
public class SignatureSpi extends java.security.SignatureSpi {
    private static final byte[] EMPTY_CONTEXT = new byte[0];
    private final String algorithm;
    private z signer;

    /* loaded from: classes5.dex */
    public static final class Ed25519 extends SignatureSpi {
        public Ed25519() {
            super("Ed25519");
        }
    }

    /* loaded from: classes5.dex */
    public static final class Ed448 extends SignatureSpi {
        public Ed448() {
            super("Ed448");
        }
    }

    /* loaded from: classes5.dex */
    public static final class EdDSA extends SignatureSpi {
        public EdDSA() {
            super(null);
        }
    }

    SignatureSpi(String str) {
        this.algorithm = str;
    }

    private static b getLwEdDSAKeyPrivate(Key key) {
        if (key instanceof BCEdDSAPrivateKey) {
            return ((BCEdDSAPrivateKey) key).engineGetKeyParameters();
        }
        throw new InvalidKeyException("cannot identify EdDSA private key");
    }

    private static b getLwEdDSAKeyPublic(Key key) {
        if (key instanceof BCEdDSAPublicKey) {
            return ((BCEdDSAPublicKey) key).engineGetKeyParameters();
        }
        throw new InvalidKeyException("cannot identify EdDSA public key");
    }

    private z getSigner(String str) {
        String str2 = this.algorithm;
        if (str2 == null || str.equals(str2)) {
            return str.equals("Ed448") ? new j(EMPTY_CONTEXT) : new i();
        }
        throw new InvalidKeyException("inappropriate key for " + this.algorithm);
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) {
        String str;
        b lwEdDSAKeyPrivate = getLwEdDSAKeyPrivate(privateKey);
        if (lwEdDSAKeyPrivate instanceof g0) {
            str = "Ed25519";
        } else if (!(lwEdDSAKeyPrivate instanceof j0)) {
            throw new IllegalStateException("unsupported private key type");
        } else {
            str = "Ed448";
        }
        this.signer = getSigner(str);
        this.signer.init(true, lwEdDSAKeyPrivate);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        String str;
        b lwEdDSAKeyPublic = getLwEdDSAKeyPublic(publicKey);
        if (lwEdDSAKeyPublic instanceof h0) {
            str = "Ed25519";
        } else if (!(lwEdDSAKeyPublic instanceof k0)) {
            throw new IllegalStateException("unsupported public key type");
        } else {
            str = "Ed448";
        }
        this.signer = getSigner(str);
        this.signer.init(false, lwEdDSAKeyPublic);
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() {
        try {
            return this.signer.generateSignature();
        } catch (CryptoException e11) {
            throw new SignatureException(e11.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b11) {
        this.signer.update(b11);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i11, int i12) {
        this.signer.update(bArr, i11, i12);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) {
        return this.signer.verifySignature(bArr);
    }
}