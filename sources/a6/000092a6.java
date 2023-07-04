package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import i50.h0;
import i50.s;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import l50.n0;
import org.bouncycastle.crypto.p;
import y50.m;
import z50.a;

/* loaded from: classes5.dex */
public class ISOSignatureSpi extends SignatureSpi {
    private m signer;

    /* loaded from: classes5.dex */
    public static class MD5WithRSAEncryption extends ISOSignatureSpi {
        public MD5WithRSAEncryption() {
            super(a.a(), new n0());
        }
    }

    /* loaded from: classes5.dex */
    public static class RIPEMD160WithRSAEncryption extends ISOSignatureSpi {
        public RIPEMD160WithRSAEncryption() {
            super(new s(), new n0());
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA1WithRSAEncryption extends ISOSignatureSpi {
        public SHA1WithRSAEncryption() {
            super(a.b(), new n0());
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA224WithRSAEncryption extends ISOSignatureSpi {
        public SHA224WithRSAEncryption() {
            super(a.c(), new n0());
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA256WithRSAEncryption extends ISOSignatureSpi {
        public SHA256WithRSAEncryption() {
            super(a.d(), new n0());
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA384WithRSAEncryption extends ISOSignatureSpi {
        public SHA384WithRSAEncryption() {
            super(a.e(), new n0());
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA512WithRSAEncryption extends ISOSignatureSpi {
        public SHA512WithRSAEncryption() {
            super(a.j(), new n0());
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA512_224WithRSAEncryption extends ISOSignatureSpi {
        public SHA512_224WithRSAEncryption() {
            super(a.k(), new n0());
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA512_256WithRSAEncryption extends ISOSignatureSpi {
        public SHA512_256WithRSAEncryption() {
            super(a.l(), new n0());
        }
    }

    /* loaded from: classes5.dex */
    public static class WhirlpoolWithRSAEncryption extends ISOSignatureSpi {
        public WhirlpoolWithRSAEncryption() {
            super(new h0(), new n0());
        }
    }

    protected ISOSignatureSpi(p pVar, org.bouncycastle.crypto.a aVar) {
        this.signer = new m(aVar, pVar, true);
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) {
        this.signer.init(true, RSAUtil.generatePrivateKeyParameter((RSAPrivateKey) privateKey));
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        this.signer.init(false, RSAUtil.generatePublicKeyParameter((RSAPublicKey) publicKey));
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() {
        try {
            return this.signer.generateSignature();
        } catch (Exception e11) {
            throw new SignatureException(e11.toString());
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