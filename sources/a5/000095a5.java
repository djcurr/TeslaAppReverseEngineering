package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import l50.q0;
import l50.r0;
import n50.y;
import org.bouncycastle.crypto.e;
import org.bouncycastle.crypto.h;
import org.bouncycastle.crypto.k;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import p40.a;
import p50.l;
import q50.c;
import q50.n;

/* loaded from: classes5.dex */
public final class SEED {

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
                AlgorithmParameters createParametersInstance = createParametersInstance("SEED");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e11) {
                throw new RuntimeException(e11.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for SEED parameter generation.");
        }
    }

    /* loaded from: classes5.dex */
    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "SEED IV";
        }
    }

    /* loaded from: classes5.dex */
    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new c(new q0()), 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new p50.c(new q0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.SEED.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public e get() {
                    return new q0();
                }
            });
        }
    }

    /* loaded from: classes5.dex */
    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new p50.e(new n(new q0())));
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("SEED", null);
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("SEED", 128, new h());
        }
    }

    /* loaded from: classes5.dex */
    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = SEED.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.SEED", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Alg.Alias.AlgorithmParameters.");
            org.bouncycastle.asn1.k kVar = a.f46196a;
            sb3.append(kVar);
            configurableProvider.addAlgorithm(sb3.toString(), "SEED");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.SEED", str + "$AlgParamGen");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar, "SEED");
            configurableProvider.addAlgorithm("Cipher.SEED", str + "$ECB");
            configurableProvider.addAlgorithm("Cipher", kVar, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher.SEEDWRAP", str + "$Wrap");
            org.bouncycastle.asn1.k kVar2 = a.f46198c;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar2, "SEEDWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.SEEDKW", "SEEDWRAP");
            configurableProvider.addAlgorithm("KeyGenerator.SEED", str + "$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator", kVar, str + "$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator", kVar2, str + "$KeyGen");
            configurableProvider.addAlgorithm("SecretKeyFactory.SEED", str + "$KeyFactory");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar, "SEED");
            addCMacAlgorithm(configurableProvider, "SEED", str + "$CMAC", str + "$KeyGen");
            addGMacAlgorithm(configurableProvider, "SEED", str + "$GMAC", str + "$KeyGen");
            addPoly1305Algorithm(configurableProvider, "SEED", str + "$Poly1305", str + "$Poly1305KeyGen");
        }
    }

    /* loaded from: classes5.dex */
    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new l(new q0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-SEED", 256, new y());
        }
    }

    /* loaded from: classes5.dex */
    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new r0());
        }
    }

    private SEED() {
    }
}