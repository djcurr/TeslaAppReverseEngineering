package org.bouncycastle.jcajce.provider.symmetric;

import b60.a;
import b60.c;
import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import l50.d;
import l50.k0;
import n50.y;
import org.bouncycastle.crypto.f;
import org.bouncycastle.crypto.h;
import org.bouncycastle.crypto.k;
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
import p50.l;
import q50.e;
import q50.n;
import q50.v;

/* loaded from: classes5.dex */
public final class ARIA {

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
                AlgorithmParameters createParametersInstance = createParametersInstance("ARIA");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e11) {
                throw new RuntimeException(e11.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for ARIA parameter generation.");
        }
    }

    /* loaded from: classes5.dex */
    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "ARIA IV";
        }
    }

    /* loaded from: classes5.dex */
    public static class AlgParamsCCM extends BaseAlgorithmParameters {
        private a ccmParams;

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
                this.ccmParams = a.f(GcmSpecUtil.extractGcmParameters(algorithmParameterSpec));
            } else if (algorithmParameterSpec instanceof h60.a) {
                h60.a aVar = (h60.a) algorithmParameterSpec;
                this.ccmParams = new a(aVar.c(), aVar.b() / 8);
            } else {
                throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec.getClass().getName());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) {
            this.ccmParams = a.f(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) {
            if (!isASN1FormatString(str)) {
                throw new IOException("unknown format specified");
            }
            this.ccmParams = a.f(bArr);
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
        private c gcmParams;

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
                this.gcmParams = new c(aVar.c(), aVar.b() / 8);
            } else {
                throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec.getClass().getName());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) {
            this.gcmParams = c.f(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) {
            if (!isASN1FormatString(str)) {
                throw new IOException("unknown format specified");
            }
            this.gcmParams = c.f(bArr);
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
            super(new q50.c(new d()), 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class CCM extends BaseBlockCipher {
        public CCM() {
            super((q50.a) new q50.d(new d()), false, 12);
        }
    }

    /* loaded from: classes5.dex */
    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new f(new e(new d(), 128)), 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.ARIA.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public org.bouncycastle.crypto.e get() {
                    return new d();
                }
            });
        }
    }

    /* loaded from: classes5.dex */
    public static class GCM extends BaseBlockCipher {
        public GCM() {
            super(new n(new d()));
        }
    }

    /* loaded from: classes5.dex */
    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new p50.e(new n(new d())));
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("ARIA", null);
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i11) {
            super("ARIA", i11, new h());
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
        private static final String PREFIX = ARIA.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.ARIA", sb2.toString());
            org.bouncycastle.asn1.k kVar = s40.a.f50264e;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", kVar, "ARIA");
            org.bouncycastle.asn1.k kVar2 = s40.a.f50268i;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", kVar2, "ARIA");
            org.bouncycastle.asn1.k kVar3 = s40.a.f50272m;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", kVar3, "ARIA");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.ARIA", str + "$AlgParamGen");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", kVar, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", kVar2, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", kVar3, "ARIA");
            org.bouncycastle.asn1.k kVar4 = s40.a.f50266g;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", kVar4, "ARIA");
            org.bouncycastle.asn1.k kVar5 = s40.a.f50270k;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", kVar5, "ARIA");
            org.bouncycastle.asn1.k kVar6 = s40.a.f50274o;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", kVar6, "ARIA");
            org.bouncycastle.asn1.k kVar7 = s40.a.f50265f;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", kVar7, "ARIA");
            org.bouncycastle.asn1.k kVar8 = s40.a.f50269j;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", kVar8, "ARIA");
            org.bouncycastle.asn1.k kVar9 = s40.a.f50273n;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", kVar9, "ARIA");
            configurableProvider.addAlgorithm("Cipher.ARIA", str + "$ECB");
            org.bouncycastle.asn1.k kVar10 = s40.a.f50263d;
            configurableProvider.addAlgorithm("Cipher", kVar10, str + "$ECB");
            org.bouncycastle.asn1.k kVar11 = s40.a.f50267h;
            configurableProvider.addAlgorithm("Cipher", kVar11, str + "$ECB");
            org.bouncycastle.asn1.k kVar12 = s40.a.f50271l;
            configurableProvider.addAlgorithm("Cipher", kVar12, str + "$ECB");
            configurableProvider.addAlgorithm("Cipher", kVar, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", kVar2, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", kVar3, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", kVar7, str + "$CFB");
            configurableProvider.addAlgorithm("Cipher", kVar8, str + "$CFB");
            configurableProvider.addAlgorithm("Cipher", kVar9, str + "$CFB");
            configurableProvider.addAlgorithm("Cipher", kVar4, str + "$OFB");
            configurableProvider.addAlgorithm("Cipher", kVar5, str + "$OFB");
            configurableProvider.addAlgorithm("Cipher", kVar6, str + "$OFB");
            configurableProvider.addAlgorithm("Cipher.ARIARFC3211WRAP", str + "$RFC3211Wrap");
            configurableProvider.addAlgorithm("Cipher.ARIAWRAP", str + "$Wrap");
            org.bouncycastle.asn1.k kVar13 = s40.a.f50281v;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar13, "ARIAWRAP");
            org.bouncycastle.asn1.k kVar14 = s40.a.f50282w;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar14, "ARIAWRAP");
            org.bouncycastle.asn1.k kVar15 = s40.a.f50283x;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar15, "ARIAWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.ARIAKW", "ARIAWRAP");
            configurableProvider.addAlgorithm("Cipher.ARIAWRAPPAD", str + "$WrapPad");
            org.bouncycastle.asn1.k kVar16 = s40.a.f50284y;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar16, "ARIAWRAPPAD");
            org.bouncycastle.asn1.k kVar17 = s40.a.f50285z;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar17, "ARIAWRAPPAD");
            org.bouncycastle.asn1.k kVar18 = s40.a.A;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar18, "ARIAWRAPPAD");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.ARIAKWP", "ARIAWRAPPAD");
            configurableProvider.addAlgorithm("KeyGenerator.ARIA", str + "$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator", kVar13, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar14, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar15, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar16, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar17, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar18, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar10, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar11, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar12, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar2, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar3, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar7, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar8, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar9, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar4, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar5, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar6, str + "$KeyGen256");
            org.bouncycastle.asn1.k kVar19 = s40.a.f50278s;
            configurableProvider.addAlgorithm("KeyGenerator", kVar19, str + "$KeyGen128");
            org.bouncycastle.asn1.k kVar20 = s40.a.f50279t;
            configurableProvider.addAlgorithm("KeyGenerator", kVar20, str + "$KeyGen192");
            org.bouncycastle.asn1.k kVar21 = s40.a.f50280u;
            configurableProvider.addAlgorithm("KeyGenerator", kVar21, str + "$KeyGen256");
            org.bouncycastle.asn1.k kVar22 = s40.a.f50275p;
            configurableProvider.addAlgorithm("KeyGenerator", kVar22, str + "$KeyGen128");
            org.bouncycastle.asn1.k kVar23 = s40.a.f50276q;
            configurableProvider.addAlgorithm("KeyGenerator", kVar23, str + "$KeyGen192");
            org.bouncycastle.asn1.k kVar24 = s40.a.f50277r;
            configurableProvider.addAlgorithm("KeyGenerator", kVar24, str + "$KeyGen256");
            configurableProvider.addAlgorithm("SecretKeyFactory.ARIA", str + "$KeyFactory");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar2, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar3, "ARIA");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.ARIACCM", str + "$AlgParamGen");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar19, "ARIACCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar20, "ARIACCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar21, "ARIACCM");
            configurableProvider.addAlgorithm("Cipher.ARIACCM", str + "$CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar19, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar20, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar21, "CCM");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.ARIAGCM", str + "$AlgParamGen");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar22, "ARIAGCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar23, "ARIAGCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar24, "ARIAGCM");
            configurableProvider.addAlgorithm("Cipher.ARIAGCM", str + "$GCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar22, "ARIAGCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar23, "ARIAGCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar24, "ARIAGCM");
            addGMacAlgorithm(configurableProvider, "ARIA", str + "$GMAC", str + "$KeyGen");
            addPoly1305Algorithm(configurableProvider, "ARIA", str + "$Poly1305", str + "$Poly1305KeyGen");
        }
    }

    /* loaded from: classes5.dex */
    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new f(new v(new d(), 128)), 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new l(new d()));
        }
    }

    /* loaded from: classes5.dex */
    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-ARIA", 256, new y());
        }
    }

    /* loaded from: classes5.dex */
    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new k0(new d()), 16);
        }
    }

    /* loaded from: classes5.dex */
    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new l50.e());
        }
    }

    /* loaded from: classes5.dex */
    public static class WrapPad extends BaseWrapCipher {
        public WrapPad() {
            super(new l50.f());
        }
    }

    private ARIA() {
    }
}