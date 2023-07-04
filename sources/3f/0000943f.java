package org.bouncycastle.jcajce.provider.symmetric;

import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.IvParameterSpec;
import l50.a;
import l50.k0;
import l50.m0;
import n50.y;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.f;
import org.bouncycastle.crypto.h;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.k;
import org.bouncycastle.crypto.v;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import p50.c;
import p50.e;
import p50.l;
import q50.d;
import q50.n;
import r40.b;

/* loaded from: classes5.dex */
public final class AES {
    private static final Map<String, String> generalAesAttributes;

    /* loaded from: classes5.dex */
    public static class AESCCMMAC extends BaseMac {

        /* loaded from: classes5.dex */
        private static class CCMMac implements v {
            private final d ccm;
            private int macLength;

            private CCMMac() {
                this.ccm = new d(new a());
                this.macLength = 8;
            }

            @Override // org.bouncycastle.crypto.v
            public int doFinal(byte[] bArr, int i11) {
                try {
                    return this.ccm.doFinal(bArr, 0);
                } catch (InvalidCipherTextException e11) {
                    throw new IllegalStateException("exception on doFinal(): " + e11.toString());
                }
            }

            @Override // org.bouncycastle.crypto.v
            public String getAlgorithmName() {
                return this.ccm.getAlgorithmName() + "Mac";
            }

            @Override // org.bouncycastle.crypto.v
            public int getMacSize() {
                return this.macLength;
            }

            @Override // org.bouncycastle.crypto.v
            public void init(i iVar) {
                this.ccm.init(true, iVar);
                this.macLength = this.ccm.getMac().length;
            }

            @Override // org.bouncycastle.crypto.v
            public void reset() {
                this.ccm.g();
            }

            @Override // org.bouncycastle.crypto.v
            public void update(byte b11) {
                this.ccm.e(b11);
            }

            @Override // org.bouncycastle.crypto.v
            public void update(byte[] bArr, int i11, int i12) {
                this.ccm.processAADBytes(bArr, i11, i12);
            }
        }

        public AESCCMMAC() {
            super(new CCMMac());
        }
    }

    /* loaded from: classes5.dex */
    public static class AESCMAC extends BaseMac {
        public AESCMAC() {
            super(new c(new a()));
        }
    }

    /* loaded from: classes5.dex */
    public static class AESGMAC extends BaseMac {
        public AESGMAC() {
            super(new e(new n(new a())));
        }
    }

    /* loaded from: classes5.dex */
    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = k.b();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("AES");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e11) {
                throw new RuntimeException(e11.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    /* loaded from: classes5.dex */
    public static class AlgParamGenCCM extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("CCM");
                createParametersInstance.init(new b60.a(bArr, 12).getEncoded());
                return createParametersInstance;
            } catch (Exception e11) {
                throw new RuntimeException(e11.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    /* loaded from: classes5.dex */
    public static class AlgParamGenGCM extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance(CodePackage.GCM);
                createParametersInstance.init(new b60.c(bArr, 16).getEncoded());
                return createParametersInstance;
            } catch (Exception e11) {
                throw new RuntimeException(e11.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    /* loaded from: classes5.dex */
    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "AES IV";
        }
    }

    /* loaded from: classes5.dex */
    public static class AlgParamsCCM extends BaseAlgorithmParameters {
        private b60.a ccmParams;

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            return this.ccmParams.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str)) {
                return this.ccmParams.getEncoded();
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.ccmParams = b60.a.f(GcmSpecUtil.extractGcmParameters(algorithmParameterSpec));
            } else if (algorithmParameterSpec instanceof h60.a) {
                h60.a aVar = (h60.a) algorithmParameterSpec;
                this.ccmParams = new b60.a(aVar.c(), aVar.b() / 8);
            } else {
                throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec.getClass().getName());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) {
            this.ccmParams = b60.a.f(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) {
            if (!isASN1FormatString(str)) {
                throw new IOException("unknown format specified");
            }
            this.ccmParams = b60.a.f(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "CCM";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.isGcmSpec(cls)) {
                return GcmSpecUtil.gcmSpecExists() ? GcmSpecUtil.extractGcmSpec(this.ccmParams.toASN1Primitive()) : new h60.a(this.ccmParams.h(), this.ccmParams.e() * 8);
            } else if (cls == h60.a.class) {
                return new h60.a(this.ccmParams.h(), this.ccmParams.e() * 8);
            } else {
                if (cls == IvParameterSpec.class) {
                    return new IvParameterSpec(this.ccmParams.h());
                }
                throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class AlgParamsGCM extends BaseAlgorithmParameters {
        private b60.c gcmParams;

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            return this.gcmParams.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str)) {
                return this.gcmParams.getEncoded();
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.gcmParams = GcmSpecUtil.extractGcmParameters(algorithmParameterSpec);
            } else if (algorithmParameterSpec instanceof h60.a) {
                h60.a aVar = (h60.a) algorithmParameterSpec;
                this.gcmParams = new b60.c(aVar.c(), aVar.b() / 8);
            } else {
                throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec.getClass().getName());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) {
            this.gcmParams = b60.c.f(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) {
            if (!isASN1FormatString(str)) {
                throw new IOException("unknown format specified");
            }
            this.gcmParams = b60.c.f(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return CodePackage.GCM;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.isGcmSpec(cls)) {
                return GcmSpecUtil.gcmSpecExists() ? GcmSpecUtil.extractGcmSpec(this.gcmParams.toASN1Primitive()) : new h60.a(this.gcmParams.h(), this.gcmParams.e() * 8);
            } else if (cls == h60.a.class) {
                return new h60.a(this.gcmParams.h(), this.gcmParams.e() * 8);
            } else {
                if (cls == IvParameterSpec.class) {
                    return new IvParameterSpec(this.gcmParams.h());
                }
                throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new q50.c(new a()), 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class CCM extends BaseBlockCipher {
        public CCM() {
            super((q50.a) new d(new a()), false, 12);
        }
    }

    /* loaded from: classes5.dex */
    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new f(new q50.e(new a(), 128)), 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.AES.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public org.bouncycastle.crypto.e get() {
                    return new a();
                }
            });
        }
    }

    /* loaded from: classes5.dex */
    public static class GCM extends BaseBlockCipher {
        public GCM() {
            super(new n(new a()));
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("AES", null);
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(192);
        }

        public KeyGen(int i11) {
            super("AES", i11, new h());
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGen192 extends KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    /* loaded from: classes5.dex */
    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = AES.class.getName();
        private static final String wrongAES128 = "2.16.840.1.101.3.4.2";
        private static final String wrongAES192 = "2.16.840.1.101.3.4.22";
        private static final String wrongAES256 = "2.16.840.1.101.3.4.42";

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.AES", sb2.toString());
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.42", "AES");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Alg.Alias.AlgorithmParameters.");
            org.bouncycastle.asn1.k kVar = b.f49165u;
            sb3.append(kVar);
            configurableProvider.addAlgorithm(sb3.toString(), "AES");
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Alg.Alias.AlgorithmParameters.");
            org.bouncycastle.asn1.k kVar2 = b.C;
            sb4.append(kVar2);
            configurableProvider.addAlgorithm(sb4.toString(), "AES");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Alg.Alias.AlgorithmParameters.");
            org.bouncycastle.asn1.k kVar3 = b.K;
            sb5.append(kVar3);
            configurableProvider.addAlgorithm(sb5.toString(), "AES");
            configurableProvider.addAlgorithm("AlgorithmParameters.GCM", str + "$AlgParamsGCM");
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Alg.Alias.AlgorithmParameters.");
            org.bouncycastle.asn1.k kVar4 = b.f49169y;
            sb6.append(kVar4);
            configurableProvider.addAlgorithm(sb6.toString(), CodePackage.GCM);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Alg.Alias.AlgorithmParameters.");
            org.bouncycastle.asn1.k kVar5 = b.G;
            sb7.append(kVar5);
            configurableProvider.addAlgorithm(sb7.toString(), CodePackage.GCM);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Alg.Alias.AlgorithmParameters.");
            org.bouncycastle.asn1.k kVar6 = b.O;
            sb8.append(kVar6);
            configurableProvider.addAlgorithm(sb8.toString(), CodePackage.GCM);
            configurableProvider.addAlgorithm("AlgorithmParameters.CCM", str + "$AlgParamsCCM");
            StringBuilder sb9 = new StringBuilder();
            sb9.append("Alg.Alias.AlgorithmParameters.");
            org.bouncycastle.asn1.k kVar7 = b.f49170z;
            sb9.append(kVar7);
            configurableProvider.addAlgorithm(sb9.toString(), "CCM");
            StringBuilder sb10 = new StringBuilder();
            sb10.append("Alg.Alias.AlgorithmParameters.");
            org.bouncycastle.asn1.k kVar8 = b.H;
            sb10.append(kVar8);
            configurableProvider.addAlgorithm(sb10.toString(), "CCM");
            StringBuilder sb11 = new StringBuilder();
            sb11.append("Alg.Alias.AlgorithmParameters.");
            org.bouncycastle.asn1.k kVar9 = b.P;
            sb11.append(kVar9);
            configurableProvider.addAlgorithm(sb11.toString(), "CCM");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.AES", str + "$AlgParamGen");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.42", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar, "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar2, "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar3, "AES");
            configurableProvider.addAttributes("Cipher.AES", AES.generalAesAttributes);
            configurableProvider.addAlgorithm("Cipher.AES", str + "$ECB");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.42", "AES");
            org.bouncycastle.asn1.k kVar10 = b.f49164t;
            configurableProvider.addAlgorithm("Cipher", kVar10, str + "$ECB");
            org.bouncycastle.asn1.k kVar11 = b.B;
            configurableProvider.addAlgorithm("Cipher", kVar11, str + "$ECB");
            org.bouncycastle.asn1.k kVar12 = b.J;
            configurableProvider.addAlgorithm("Cipher", kVar12, str + "$ECB");
            configurableProvider.addAlgorithm("Cipher", kVar, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", kVar2, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", kVar3, str + "$CBC");
            org.bouncycastle.asn1.k kVar13 = b.f49166v;
            configurableProvider.addAlgorithm("Cipher", kVar13, str + "$OFB");
            org.bouncycastle.asn1.k kVar14 = b.D;
            configurableProvider.addAlgorithm("Cipher", kVar14, str + "$OFB");
            org.bouncycastle.asn1.k kVar15 = b.L;
            configurableProvider.addAlgorithm("Cipher", kVar15, str + "$OFB");
            org.bouncycastle.asn1.k kVar16 = b.f49167w;
            configurableProvider.addAlgorithm("Cipher", kVar16, str + "$CFB");
            org.bouncycastle.asn1.k kVar17 = b.E;
            configurableProvider.addAlgorithm("Cipher", kVar17, str + "$CFB");
            org.bouncycastle.asn1.k kVar18 = b.M;
            configurableProvider.addAlgorithm("Cipher", kVar18, str + "$CFB");
            configurableProvider.addAttributes("Cipher.AESWRAP", AES.generalAesAttributes);
            configurableProvider.addAlgorithm("Cipher.AESWRAP", str + "$Wrap");
            org.bouncycastle.asn1.k kVar19 = b.f49168x;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar19, "AESWRAP");
            org.bouncycastle.asn1.k kVar20 = b.F;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar20, "AESWRAP");
            org.bouncycastle.asn1.k kVar21 = b.N;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar21, "AESWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.AESKW", "AESWRAP");
            configurableProvider.addAttributes("Cipher.AESWRAPPAD", AES.generalAesAttributes);
            configurableProvider.addAlgorithm("Cipher.AESWRAPPAD", str + "$WrapPad");
            org.bouncycastle.asn1.k kVar22 = b.A;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar22, "AESWRAPPAD");
            org.bouncycastle.asn1.k kVar23 = b.I;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar23, "AESWRAPPAD");
            org.bouncycastle.asn1.k kVar24 = b.Q;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar24, "AESWRAPPAD");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.AESKWP", "AESWRAPPAD");
            configurableProvider.addAlgorithm("Cipher.AESRFC3211WRAP", str + "$RFC3211Wrap");
            configurableProvider.addAlgorithm("Cipher.AESRFC5649WRAP", str + "$RFC5649Wrap");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.CCM", str + "$AlgParamGenCCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar7, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar8, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar9, "CCM");
            configurableProvider.addAttributes("Cipher.CCM", AES.generalAesAttributes);
            configurableProvider.addAlgorithm("Cipher.CCM", str + "$CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar7, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar8, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar9, "CCM");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.GCM", str + "$AlgParamGenGCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar4, CodePackage.GCM);
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar5, CodePackage.GCM);
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar6, CodePackage.GCM);
            configurableProvider.addAttributes("Cipher.GCM", AES.generalAesAttributes);
            configurableProvider.addAlgorithm("Cipher.GCM", str + "$GCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar4, CodePackage.GCM);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar5, CodePackage.GCM);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar6, CodePackage.GCM);
            configurableProvider.addAlgorithm("KeyGenerator.AES", str + "$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.2", str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.22", str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.42", str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar10, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar13, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar16, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar11, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar2, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar14, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar17, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar12, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar3, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar15, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar18, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator.AESWRAP", str + "$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator", kVar19, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar20, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar21, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar4, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar5, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar6, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar7, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar8, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar9, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator.AESWRAPPAD", str + "$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator", kVar22, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar23, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar24, str + "$KeyGen256");
            configurableProvider.addAlgorithm("Mac.AESCMAC", str + "$AESCMAC");
            configurableProvider.addAlgorithm("Mac.AESCCMMAC", str + "$AESCCMMAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac." + kVar7.t(), "AESCCMMAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac." + kVar8.t(), "AESCCMMAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac." + kVar9.t(), "AESCCMMAC");
            org.bouncycastle.asn1.k kVar25 = g40.a.f27716g;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar25, "PBEWITHSHAAND128BITAES-CBC-BC");
            org.bouncycastle.asn1.k kVar26 = g40.a.f27717h;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar26, "PBEWITHSHAAND192BITAES-CBC-BC");
            org.bouncycastle.asn1.k kVar27 = g40.a.f27718i;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar27, "PBEWITHSHAAND256BITAES-CBC-BC");
            org.bouncycastle.asn1.k kVar28 = g40.a.f27719j;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar28, "PBEWITHSHA256AND128BITAES-CBC-BC");
            org.bouncycastle.asn1.k kVar29 = g40.a.f27720k;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar29, "PBEWITHSHA256AND192BITAES-CBC-BC");
            org.bouncycastle.asn1.k kVar30 = g40.a.f27721l;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar30, "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND128BITAES-CBC-BC", str + "$PBEWithSHA1AESCBC128");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND192BITAES-CBC-BC", str + "$PBEWithSHA1AESCBC192");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND256BITAES-CBC-BC", str + "$PBEWithSHA1AESCBC256");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", str + "$PBEWithSHA256AESCBC128");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", str + "$PBEWithSHA256AESCBC192");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHA256AND256BITAES-CBC-BC", str + "$PBEWithSHA256AESCBC256");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL", str + "$PBEWithAESCBC");
            configurableProvider.addAlgorithm("Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL", str + "$PBEWithAESCBC");
            configurableProvider.addAlgorithm("Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL", str + "$PBEWithAESCBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.AES", str + "$KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory", b.f49163s, str + "$KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL", str + "$PBEWithMD5And128BitAESCBCOpenSSL");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL", str + "$PBEWithMD5And192BitAESCBCOpenSSL");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL", str + "$PBEWithMD5And256BitAESCBCOpenSSL");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC", str + "$PBEWithSHAAnd128BitAESBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC", str + "$PBEWithSHAAnd192BitAESBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC", str + "$PBEWithSHAAnd256BitAESBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC", str + "$PBEWithSHA256And128BitAESBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC", str + "$PBEWithSHA256And192BitAESBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC", str + "$PBEWithSHA256And256BitAESBC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar25, "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar26, "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar27, "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar28, "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar29, "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar30, "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + kVar25.t(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + kVar26.t(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + kVar27.t(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + kVar28.t(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + kVar29.t(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + kVar30.t(), "PKCS12PBE");
            addGMacAlgorithm(configurableProvider, "AES", str + "$AESGMAC", str + "$KeyGen128");
            addPoly1305Algorithm(configurableProvider, "AES", str + "$Poly1305", str + "$Poly1305KeyGen");
        }
    }

    /* loaded from: classes5.dex */
    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new f(new q50.v(new a(), 128)), 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithAESCBC extends BaseBlockCipher {
        public PBEWithAESCBC() {
            super(new q50.c(new a()));
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithMD5And128BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And128BitAESCBCOpenSSL() {
            super("PBEWithMD5And128BitAES-CBC-OpenSSL", null, true, 3, 0, 128, 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithMD5And192BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And192BitAESCBCOpenSSL() {
            super("PBEWithMD5And192BitAES-CBC-OpenSSL", null, true, 3, 0, 192, 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithMD5And256BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And256BitAESCBCOpenSSL() {
            super("PBEWithMD5And256BitAES-CBC-OpenSSL", null, true, 3, 0, 256, 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithSHA1AESCBC128 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC128() {
            super(new q50.c(new a()), 2, 1, 128, 16);
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithSHA1AESCBC192 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC192() {
            super(new q50.c(new a()), 2, 1, 192, 16);
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithSHA1AESCBC256 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC256() {
            super(new q50.c(new a()), 2, 1, 256, 16);
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithSHA256AESCBC128 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC128() {
            super(new q50.c(new a()), 2, 4, 128, 16);
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithSHA256AESCBC192 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC192() {
            super(new q50.c(new a()), 2, 4, 192, 16);
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithSHA256AESCBC256 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC256() {
            super(new q50.c(new a()), 2, 4, 256, 16);
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithSHA256And128BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And128BitAESBC() {
            super("PBEWithSHA256And128BitAES-CBC-BC", null, true, 2, 4, 128, 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithSHA256And192BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And192BitAESBC() {
            super("PBEWithSHA256And192BitAES-CBC-BC", null, true, 2, 4, 192, 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithSHA256And256BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And256BitAESBC() {
            super("PBEWithSHA256And256BitAES-CBC-BC", null, true, 2, 4, 256, 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithSHAAnd128BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd128BitAESBC() {
            super("PBEWithSHA1And128BitAES-CBC-BC", null, true, 2, 1, 128, 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithSHAAnd192BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd192BitAESBC() {
            super("PBEWithSHA1And192BitAES-CBC-BC", null, true, 2, 1, 192, 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithSHAAnd256BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd256BitAESBC() {
            super("PBEWithSHA1And256BitAES-CBC-BC", null, true, 2, 1, 256, 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new l(new a()));
        }
    }

    /* loaded from: classes5.dex */
    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-AES", 256, new y());
        }
    }

    /* loaded from: classes5.dex */
    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new k0(new a()), 16);
        }
    }

    /* loaded from: classes5.dex */
    public static class RFC5649Wrap extends BaseWrapCipher {
        public RFC5649Wrap() {
            super(new m0(new a()));
        }
    }

    /* loaded from: classes5.dex */
    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new l50.b());
        }
    }

    /* loaded from: classes5.dex */
    public static class WrapPad extends BaseWrapCipher {
        public WrapPad() {
            super(new l50.c());
        }
    }

    static {
        HashMap hashMap = new HashMap();
        generalAesAttributes = hashMap;
        hashMap.put("SupportedKeyClasses", "javax.crypto.SecretKey");
        hashMap.put("SupportedKeyFormats", "RAW");
    }

    private AES() {
    }
}