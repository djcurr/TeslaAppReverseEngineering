package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import l50.j0;
import n50.y;
import org.bouncycastle.crypto.f;
import org.bouncycastle.crypto.h;
import org.bouncycastle.crypto.k;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import p50.l;
import q50.c;
import q50.e;
import q50.n;
import q50.v;

/* loaded from: classes5.dex */
public final class RC6 {

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
                AlgorithmParameters createParametersInstance = createParametersInstance("RC6");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e11) {
                throw new RuntimeException(e11.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for RC6 parameter generation.");
        }
    }

    /* loaded from: classes5.dex */
    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "RC6 IV";
        }
    }

    /* loaded from: classes5.dex */
    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new c(new j0()), 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new f(new e(new j0(), 128)), 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.RC6.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public org.bouncycastle.crypto.e get() {
                    return new j0();
                }
            });
        }
    }

    /* loaded from: classes5.dex */
    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new p50.e(new n(new j0())));
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("RC6", 256, new h());
        }
    }

    /* loaded from: classes5.dex */
    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = RC6.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.RC6", sb2.toString());
            configurableProvider.addAlgorithm("KeyGenerator.RC6", str + "$KeyGen");
            configurableProvider.addAlgorithm("AlgorithmParameters.RC6", str + "$AlgParams");
            addGMacAlgorithm(configurableProvider, "RC6", str + "$GMAC", str + "$KeyGen");
            addPoly1305Algorithm(configurableProvider, "RC6", str + "$Poly1305", str + "$Poly1305KeyGen");
        }
    }

    /* loaded from: classes5.dex */
    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new f(new v(new j0(), 128)), 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new l(new j0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-RC6", 256, new y());
        }
    }

    private RC6() {
    }
}