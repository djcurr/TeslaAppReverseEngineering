package org.bouncycastle.jcajce.provider.asymmetric.ec;

import h60.q;
import i50.x;
import i60.a;
import i60.c;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.i;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import u50.e1;
import u50.g1;
import y50.r;

/* loaded from: classes5.dex */
public class GMSignatureSpi extends java.security.SignatureSpi {
    private AlgorithmParameters engineParams;
    private final c helper = new a();
    private q paramSpec;
    private final r signer;

    /* loaded from: classes5.dex */
    public static class sha256WithSM2 extends GMSignatureSpi {
        public sha256WithSM2() {
            super(new r(new x()));
        }
    }

    /* loaded from: classes5.dex */
    public static class sm3WithSM2 extends GMSignatureSpi {
        public sm3WithSM2() {
            super(new r());
        }
    }

    GMSignatureSpi(r rVar) {
        this.signer = rVar;
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.paramSpec != null) {
            try {
                AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters("PSS");
                this.engineParams = createAlgorithmParameters;
                createAlgorithmParameters.init(this.paramSpec);
            } catch (Exception e11) {
                throw new RuntimeException(e11.toString());
            }
        }
        return this.engineParams;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) {
        i generatePrivateKeyParameter = ECUtil.generatePrivateKeyParameter(privateKey);
        SecureRandom secureRandom = ((java.security.SignatureSpi) this).appRandom;
        if (secureRandom != null) {
            generatePrivateKeyParameter = new g1(generatePrivateKeyParameter, secureRandom);
        }
        q qVar = this.paramSpec;
        if (qVar != null) {
            this.signer.init(true, new e1(generatePrivateKeyParameter, qVar.a()));
        } else {
            this.signer.init(true, generatePrivateKeyParameter);
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        i generatePublicKeyParameter = ECUtils.generatePublicKeyParameter(publicKey);
        q qVar = this.paramSpec;
        if (qVar != null) {
            generatePublicKeyParameter = new e1(generatePublicKeyParameter, qVar.a());
        }
        this.signer.init(false, generatePublicKeyParameter);
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        if (!(algorithmParameterSpec instanceof q)) {
            throw new InvalidAlgorithmParameterException("only SM2ParameterSpec supported");
        }
        this.paramSpec = (q) algorithmParameterSpec;
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() {
        try {
            return this.signer.generateSignature();
        } catch (CryptoException e11) {
            throw new SignatureException("unable to create signature: " + e11.getMessage());
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