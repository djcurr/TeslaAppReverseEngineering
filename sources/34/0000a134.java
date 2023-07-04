package org.spongycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.engines.Shacal2Engine;
import org.spongycastle.crypto.macs.CMac;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;
import org.spongycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.spongycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;

/* loaded from: classes4.dex */
public final class Shacal2 {

    /* loaded from: classes4.dex */
    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[32];
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("Shacal2");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e11) {
                throw new RuntimeException(e11.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for Shacal2 parameter generation.");
        }
    }

    /* loaded from: classes4.dex */
    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.spongycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Shacal2 IV";
        }
    }

    /* loaded from: classes4.dex */
    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new Shacal2Engine()), 256);
        }
    }

    /* loaded from: classes4.dex */
    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new CMac(new Shacal2Engine()));
        }
    }

    /* loaded from: classes4.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.spongycastle.jcajce.provider.symmetric.Shacal2.ECB.1
                @Override // org.spongycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new Shacal2Engine();
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("SHACAL-2", 128, new CipherKeyGenerator());
        }
    }

    /* loaded from: classes4.dex */
    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Shacal2.class.getName();

        @Override // org.spongycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$CMAC");
            configurableProvider.addAlgorithm("Mac.Shacal-2CMAC", sb2.toString());
            configurableProvider.addAlgorithm("Cipher.Shacal2", str + "$ECB");
            configurableProvider.addAlgorithm("Cipher.SHACAL-2", str + "$ECB");
            configurableProvider.addAlgorithm("KeyGenerator.Shacal2", str + "$KeyGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.Shacal2", str + "$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameters.Shacal2", str + "$AlgParams");
            configurableProvider.addAlgorithm("KeyGenerator.SHACAL-2", str + "$KeyGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.SHACAL-2", str + "$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameters.SHACAL-2", str + "$AlgParams");
        }
    }

    private Shacal2() {
    }
}