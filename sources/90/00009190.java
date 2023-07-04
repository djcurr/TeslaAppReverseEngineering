package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import e50.y0;
import i50.q;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.m;
import org.bouncycastle.crypto.p;
import u50.b;
import u50.g1;
import w40.n;
import y50.a;
import y50.c;
import y50.l;
import y50.s;

/* loaded from: classes5.dex */
public class DSASigner extends SignatureSpi implements n, y0 {
    private p digest;
    private a encoding = s.f59208a;
    private SecureRandom random;
    private m signer;

    /* loaded from: classes5.dex */
    public static class detDSA extends DSASigner {
        public detDSA() {
            super(z50.a.b(), new c(new l(z50.a.b())));
        }
    }

    /* loaded from: classes5.dex */
    public static class detDSA224 extends DSASigner {
        public detDSA224() {
            super(z50.a.c(), new c(new l(z50.a.c())));
        }
    }

    /* loaded from: classes5.dex */
    public static class detDSA256 extends DSASigner {
        public detDSA256() {
            super(z50.a.d(), new c(new l(z50.a.d())));
        }
    }

    /* loaded from: classes5.dex */
    public static class detDSA384 extends DSASigner {
        public detDSA384() {
            super(z50.a.e(), new c(new l(z50.a.e())));
        }
    }

    /* loaded from: classes5.dex */
    public static class detDSA512 extends DSASigner {
        public detDSA512() {
            super(z50.a.j(), new c(new l(z50.a.j())));
        }
    }

    /* loaded from: classes5.dex */
    public static class detDSASha3_224 extends DSASigner {
        public detDSASha3_224() {
            super(z50.a.f(), new c(new l(z50.a.f())));
        }
    }

    /* loaded from: classes5.dex */
    public static class detDSASha3_256 extends DSASigner {
        public detDSASha3_256() {
            super(z50.a.g(), new c(new l(z50.a.g())));
        }
    }

    /* loaded from: classes5.dex */
    public static class detDSASha3_384 extends DSASigner {
        public detDSASha3_384() {
            super(z50.a.h(), new c(new l(z50.a.h())));
        }
    }

    /* loaded from: classes5.dex */
    public static class detDSASha3_512 extends DSASigner {
        public detDSASha3_512() {
            super(z50.a.i(), new c(new l(z50.a.i())));
        }
    }

    /* loaded from: classes5.dex */
    public static class dsa224 extends DSASigner {
        public dsa224() {
            super(z50.a.c(), new c());
        }
    }

    /* loaded from: classes5.dex */
    public static class dsa256 extends DSASigner {
        public dsa256() {
            super(z50.a.d(), new c());
        }
    }

    /* loaded from: classes5.dex */
    public static class dsa384 extends DSASigner {
        public dsa384() {
            super(z50.a.e(), new c());
        }
    }

    /* loaded from: classes5.dex */
    public static class dsa512 extends DSASigner {
        public dsa512() {
            super(z50.a.j(), new c());
        }
    }

    /* loaded from: classes5.dex */
    public static class dsaRMD160 extends DSASigner {
        public dsaRMD160() {
            super(new i50.s(), new c());
        }
    }

    /* loaded from: classes5.dex */
    public static class dsaSha3_224 extends DSASigner {
        public dsaSha3_224() {
            super(z50.a.f(), new c());
        }
    }

    /* loaded from: classes5.dex */
    public static class dsaSha3_256 extends DSASigner {
        public dsaSha3_256() {
            super(z50.a.g(), new c());
        }
    }

    /* loaded from: classes5.dex */
    public static class dsaSha3_384 extends DSASigner {
        public dsaSha3_384() {
            super(z50.a.h(), new c());
        }
    }

    /* loaded from: classes5.dex */
    public static class dsaSha3_512 extends DSASigner {
        public dsaSha3_512() {
            super(z50.a.i(), new c());
        }
    }

    /* loaded from: classes5.dex */
    public static class noneDSA extends DSASigner {
        public noneDSA() {
            super(new q(), new c());
        }
    }

    /* loaded from: classes5.dex */
    public static class stdDSA extends DSASigner {
        public stdDSA() {
            super(z50.a.b(), new c());
        }
    }

    protected DSASigner(p pVar, m mVar) {
        this.digest = pVar;
        this.signer = mVar;
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
        i generatePrivateKeyParameter = DSAUtil.generatePrivateKeyParameter(privateKey);
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            generatePrivateKeyParameter = new g1(generatePrivateKeyParameter, secureRandom);
        }
        this.digest.reset();
        this.signer.init(true, generatePrivateKeyParameter);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) {
        this.random = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        b generatePublicKeyParameter = DSAUtil.generatePublicKeyParameter(publicKey);
        this.digest.reset();
        this.signer.init(false, generatePublicKeyParameter);
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
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        try {
            BigInteger[] generateSignature = this.signer.generateSignature(bArr);
            return this.encoding.b(this.signer.getOrder(), generateSignature[0], generateSignature[1]);
        } catch (Exception e11) {
            throw new SignatureException(e11.toString());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b11) {
        this.digest.update(b11);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i11, int i12) {
        this.digest.update(bArr, i11, i12);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) {
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        try {
            BigInteger[] a11 = this.encoding.a(this.signer.getOrder(), bArr);
            return this.signer.verifySignature(bArr2, a11[0], a11[1]);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }
}