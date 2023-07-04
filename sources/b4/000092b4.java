package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import ch.qos.logback.core.joran.action.ActionConst;
import i60.c;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import l50.n0;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.a;
import org.bouncycastle.crypto.p;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.spongycastle.pqc.jcajce.spec.SPHINCS256KeyGenParameterSpec;
import u50.g1;
import u50.n1;
import w40.n;
import y50.o;

/* loaded from: classes5.dex */
public class PSSSignatureSpi extends SignatureSpi {
    private p contentDigest;
    private AlgorithmParameters engineParams;
    private final c helper;
    private boolean isInitState;
    private boolean isRaw;
    private n1 key;
    private p mgfDigest;
    private PSSParameterSpec originalSpec;
    private PSSParameterSpec paramSpec;
    private o pss;
    private SecureRandom random;
    private int saltLength;
    private a signer;
    private byte trailer;

    /* loaded from: classes5.dex */
    public class NullPssDigest implements p {
        private p baseDigest;
        private ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        private boolean oddTime = true;

        public NullPssDigest(p pVar) {
            PSSSignatureSpi.this = r1;
            this.baseDigest = pVar;
        }

        @Override // org.bouncycastle.crypto.p
        public int doFinal(byte[] bArr, int i11) {
            byte[] byteArray = this.bOut.toByteArray();
            if (this.oddTime) {
                System.arraycopy(byteArray, 0, bArr, i11, byteArray.length);
            } else {
                this.baseDigest.update(byteArray, 0, byteArray.length);
                this.baseDigest.doFinal(bArr, i11);
            }
            reset();
            this.oddTime = !this.oddTime;
            return byteArray.length;
        }

        @Override // org.bouncycastle.crypto.p
        public String getAlgorithmName() {
            return ActionConst.NULL;
        }

        public int getByteLength() {
            return 0;
        }

        @Override // org.bouncycastle.crypto.p
        public int getDigestSize() {
            return this.baseDigest.getDigestSize();
        }

        @Override // org.bouncycastle.crypto.p
        public void reset() {
            this.bOut.reset();
            this.baseDigest.reset();
        }

        @Override // org.bouncycastle.crypto.p
        public void update(byte b11) {
            this.bOut.write(b11);
        }

        @Override // org.bouncycastle.crypto.p
        public void update(byte[] bArr, int i11, int i12) {
            this.bOut.write(bArr, i11, i12);
        }
    }

    /* loaded from: classes5.dex */
    public static class PSSwithRSA extends PSSSignatureSpi {
        public PSSwithRSA() {
            super(new n0(), null);
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA1withRSA extends PSSSignatureSpi {
        public SHA1withRSA() {
            super(new n0(), PSSParameterSpec.DEFAULT);
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA1withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA1withRSAandSHAKE128() {
            super(new n0(), new PSSParameterSpec("SHA1", "SHAKE128", null, 20, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA1withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA1withRSAandSHAKE256() {
            super(new n0(), new PSSParameterSpec("SHA1", "SHAKE256", null, 20, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA224withRSA extends PSSSignatureSpi {
        public SHA224withRSA() {
            super(new n0(), new PSSParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA224, "MGF1", new MGF1ParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA224), 28, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA224withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA224withRSAandSHAKE128() {
            super(new n0(), new PSSParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA224, "SHAKE128", null, 28, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA224withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA224withRSAandSHAKE256() {
            super(new n0(), new PSSParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA224, "SHAKE256", null, 28, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA256withRSA extends PSSSignatureSpi {
        public SHA256withRSA() {
            super(new n0(), new PSSParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA256, "MGF1", new MGF1ParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA256), 32, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA256withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA256withRSAandSHAKE128() {
            super(new n0(), new PSSParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA256, "SHAKE128", null, 32, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA256withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA256withRSAandSHAKE256() {
            super(new n0(), new PSSParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA256, "SHAKE256", null, 32, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA384withRSA extends PSSSignatureSpi {
        public SHA384withRSA() {
            super(new n0(), new PSSParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA384, "MGF1", new MGF1ParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA384), 48, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA384withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA384withRSAandSHAKE128() {
            super(new n0(), new PSSParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA384, "SHAKE128", null, 48, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA384withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA384withRSAandSHAKE256() {
            super(new n0(), new PSSParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA384, "SHAKE256", null, 48, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA3_224withRSA extends PSSSignatureSpi {
        public SHA3_224withRSA() {
            super(new n0(), new PSSParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), 28, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA3_224withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA3_224withRSAandSHAKE128() {
            super(new n0(), new PSSParameterSpec("SHA3-224", "SHAKE128", null, 28, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA3_224withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA3_224withRSAandSHAKE256() {
            super(new n0(), new PSSParameterSpec("SHA3-224", "SHAKE256", null, 28, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA3_256withRSA extends PSSSignatureSpi {
        public SHA3_256withRSA() {
            super(new n0(), new PSSParameterSpec(SPHINCS256KeyGenParameterSpec.SHA3_256, "MGF1", new MGF1ParameterSpec(SPHINCS256KeyGenParameterSpec.SHA3_256), 32, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA3_256withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA3_256withRSAandSHAKE128() {
            super(new n0(), new PSSParameterSpec(SPHINCS256KeyGenParameterSpec.SHA3_256, "SHAKE128", null, 32, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA3_256withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA3_256withRSAandSHAKE256() {
            super(new n0(), new PSSParameterSpec(SPHINCS256KeyGenParameterSpec.SHA3_256, "SHAKE256", null, 32, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA3_384withRSA extends PSSSignatureSpi {
        public SHA3_384withRSA() {
            super(new n0(), new PSSParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), 48, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA3_384withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA3_384withRSAandSHAKE128() {
            super(new n0(), new PSSParameterSpec("SHA3-384", "SHAKE128", null, 48, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA3_384withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA3_384withRSAandSHAKE256() {
            super(new n0(), new PSSParameterSpec("SHA3-384", "SHAKE256", null, 48, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA3_512withRSA extends PSSSignatureSpi {
        public SHA3_512withRSA() {
            super(new n0(), new PSSParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), 64, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA3_512withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA3_512withRSAandSHAKE128() {
            super(new n0(), new PSSParameterSpec("SHA3-512", "SHAKE128", null, 64, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA3_512withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA3_512withRSAandSHAKE256() {
            super(new n0(), new PSSParameterSpec("SHA3-512", "SHAKE256", null, 64, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA512_224withRSA extends PSSSignatureSpi {
        public SHA512_224withRSA() {
            super(new n0(), new PSSParameterSpec("SHA-512(224)", "MGF1", new MGF1ParameterSpec("SHA-512(224)"), 28, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA512_224withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA512_224withRSAandSHAKE128() {
            super(new n0(), new PSSParameterSpec("SHA-512(224)", "SHAKE128", null, 28, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA512_224withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA512_224withRSAandSHAKE256() {
            super(new n0(), new PSSParameterSpec("SHA-512(224)", "SHAKE256", null, 28, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA512_256withRSA extends PSSSignatureSpi {
        public SHA512_256withRSA() {
            super(new n0(), new PSSParameterSpec("SHA-512(256)", "MGF1", new MGF1ParameterSpec("SHA-512(256)"), 32, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA512_256withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA512_256withRSAandSHAKE128() {
            super(new n0(), new PSSParameterSpec("SHA-512(256)", "SHAKE128", null, 32, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA512_256withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA512_256withRSAandSHAKE256() {
            super(new n0(), new PSSParameterSpec("SHA-512(256)", "SHAKE256", null, 32, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA512withRSA extends PSSSignatureSpi {
        public SHA512withRSA() {
            super(new n0(), new PSSParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA512, "MGF1", new MGF1ParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA512), 64, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA512withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA512withRSAandSHAKE128() {
            super(new n0(), new PSSParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA512, "SHAKE128", null, 64, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA512withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA512withRSAandSHAKE256() {
            super(new n0(), new PSSParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA512, "SHAKE256", null, 64, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHAKE128WithRSAPSS extends PSSSignatureSpi {
        public SHAKE128WithRSAPSS() {
            super(new n0(), new PSSParameterSpec("SHAKE128", "SHAKE128", null, 32, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHAKE256WithRSAPSS extends PSSSignatureSpi {
        public SHAKE256WithRSAPSS() {
            super(new n0(), new PSSParameterSpec("SHAKE256", "SHAKE256", null, 64, 1));
        }
    }

    /* loaded from: classes5.dex */
    public static class nonePSS extends PSSSignatureSpi {
        public nonePSS() {
            super(new n0(), null, true);
        }
    }

    protected PSSSignatureSpi(a aVar, PSSParameterSpec pSSParameterSpec) {
        this(aVar, pSSParameterSpec, false);
    }

    protected PSSSignatureSpi(a aVar, PSSParameterSpec pSSParameterSpec, boolean z11) {
        this.helper = new i60.a();
        this.isInitState = true;
        this.signer = aVar;
        this.originalSpec = pSSParameterSpec;
        if (pSSParameterSpec == null) {
            this.paramSpec = PSSParameterSpec.DEFAULT;
        } else {
            this.paramSpec = pSSParameterSpec;
        }
        this.mgfDigest = DigestFactory.getDigest("MGF1".equals(this.paramSpec.getMGFAlgorithm()) ? this.paramSpec.getDigestAlgorithm() : this.paramSpec.getMGFAlgorithm());
        this.saltLength = this.paramSpec.getSaltLength();
        this.trailer = getTrailer(this.paramSpec.getTrailerField());
        this.isRaw = z11;
        setupContentDigest();
    }

    private byte getTrailer(int i11) {
        if (i11 == 1) {
            return PSSSigner.TRAILER_IMPLICIT;
        }
        throw new IllegalArgumentException("unknown trailer field");
    }

    private void setupContentDigest() {
        this.contentDigest = this.isRaw ? new NullPssDigest(this.mgfDigest) : DigestFactory.getDigest(this.paramSpec.getDigestAlgorithm());
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        PSSParameterSpec pSSParameterSpec;
        if (this.engineParams == null && (pSSParameterSpec = this.paramSpec) != null) {
            if (pSSParameterSpec.getDigestAlgorithm().equals(this.paramSpec.getMGFAlgorithm()) && this.paramSpec.getMGFParameters() == null) {
                return null;
            }
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
        if (!(privateKey instanceof RSAPrivateKey)) {
            throw new InvalidKeyException("Supplied key is not a RSAPrivateKey instance");
        }
        this.key = RSAUtil.generatePrivateKeyParameter((RSAPrivateKey) privateKey);
        o oVar = new o(this.signer, this.contentDigest, this.mgfDigest, this.saltLength, this.trailer);
        this.pss = oVar;
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            oVar.init(true, new g1(this.key, secureRandom));
        } else {
            oVar.init(true, this.key);
        }
        this.isInitState = true;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) {
        this.random = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        if (!(publicKey instanceof RSAPublicKey)) {
            throw new InvalidKeyException("Supplied key is not a RSAPublicKey instance");
        }
        this.key = RSAUtil.generatePublicKeyParameter((RSAPublicKey) publicKey);
        o oVar = new o(this.signer, this.contentDigest, this.mgfDigest, this.saltLength, this.trailer);
        this.pss = oVar;
        oVar.init(false, this.key);
        this.isInitState = true;
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        String digestAlgorithm;
        o oVar;
        boolean z11;
        if (algorithmParameterSpec == null && (algorithmParameterSpec = this.originalSpec) == null) {
            return;
        }
        if (!this.isInitState) {
            throw new ProviderException("cannot call setParameter in the middle of update");
        }
        if (!(algorithmParameterSpec instanceof PSSParameterSpec)) {
            throw new InvalidAlgorithmParameterException("Only PSSParameterSpec supported");
        }
        PSSParameterSpec pSSParameterSpec = (PSSParameterSpec) algorithmParameterSpec;
        PSSParameterSpec pSSParameterSpec2 = this.originalSpec;
        if (pSSParameterSpec2 != null && !DigestFactory.isSameDigest(pSSParameterSpec2.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
            throw new InvalidAlgorithmParameterException("parameter must be using " + this.originalSpec.getDigestAlgorithm());
        }
        if (pSSParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") || pSSParameterSpec.getMGFAlgorithm().equals(n.f55553u1.t())) {
            if (!(pSSParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec)) {
                throw new InvalidAlgorithmParameterException("unknown MGF parameters");
            }
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) pSSParameterSpec.getMGFParameters();
            if (!DigestFactory.isSameDigest(mGF1ParameterSpec.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
                throw new InvalidAlgorithmParameterException("digest algorithm for MGF should be the same as for PSS parameters.");
            }
            digestAlgorithm = mGF1ParameterSpec.getDigestAlgorithm();
        } else if (!pSSParameterSpec.getMGFAlgorithm().equals("SHAKE128") && !pSSParameterSpec.getMGFAlgorithm().equals("SHAKE256")) {
            throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
        } else {
            digestAlgorithm = pSSParameterSpec.getMGFAlgorithm();
        }
        p digest = DigestFactory.getDigest(digestAlgorithm);
        if (digest == null) {
            throw new InvalidAlgorithmParameterException("no match on MGF algorithm: " + pSSParameterSpec.getMGFAlgorithm());
        }
        this.engineParams = null;
        this.paramSpec = pSSParameterSpec;
        this.mgfDigest = digest;
        this.saltLength = pSSParameterSpec.getSaltLength();
        this.trailer = getTrailer(this.paramSpec.getTrailerField());
        setupContentDigest();
        if (this.key != null) {
            this.pss = new o(this.signer, this.contentDigest, digest, this.saltLength, this.trailer);
            if (this.key.a()) {
                oVar = this.pss;
                z11 = true;
            } else {
                oVar = this.pss;
                z11 = false;
            }
            oVar.init(z11, this.key);
        }
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() {
        this.isInitState = true;
        try {
            return this.pss.generateSignature();
        } catch (CryptoException e11) {
            throw new SignatureException(e11.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b11) {
        this.pss.update(b11);
        this.isInitState = false;
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i11, int i12) {
        this.pss.update(bArr, i11, i12);
        this.isInitState = false;
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) {
        this.isInitState = true;
        return this.pss.verifySignature(bArr);
    }
}