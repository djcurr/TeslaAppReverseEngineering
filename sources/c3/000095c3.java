package org.bouncycastle.jcajce.provider.symmetric;

import l40.a;
import l50.a1;
import l50.u0;
import n50.y;
import org.bouncycastle.crypto.f;
import org.bouncycastle.crypto.h;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
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
public final class Serpent {

    /* loaded from: classes5.dex */
    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Serpent IV";
        }
    }

    /* loaded from: classes5.dex */
    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new c(new u0()), 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new f(new e(new u0(), 128)), 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public org.bouncycastle.crypto.e get() {
                    return new u0();
                }
            });
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Serpent", 192, new h());
        }
    }

    /* loaded from: classes5.dex */
    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Serpent.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.Serpent", sb2.toString());
            configurableProvider.addAlgorithm("KeyGenerator.Serpent", str + "$KeyGen");
            configurableProvider.addAlgorithm("AlgorithmParameters.Serpent", str + "$AlgParams");
            configurableProvider.addAlgorithm("Cipher.Tnepres", str + "$TECB");
            configurableProvider.addAlgorithm("KeyGenerator.Tnepres", str + "$TKeyGen");
            configurableProvider.addAlgorithm("AlgorithmParameters.Tnepres", str + "$TAlgParams");
            configurableProvider.addAlgorithm("Cipher", a.f36578c, str + "$ECB");
            configurableProvider.addAlgorithm("Cipher", a.f36582g, str + "$ECB");
            configurableProvider.addAlgorithm("Cipher", a.f36586k, str + "$ECB");
            configurableProvider.addAlgorithm("Cipher", a.f36579d, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", a.f36583h, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", a.f36587l, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", a.f36581f, str + "$CFB");
            configurableProvider.addAlgorithm("Cipher", a.f36585j, str + "$CFB");
            configurableProvider.addAlgorithm("Cipher", a.f36589n, str + "$CFB");
            configurableProvider.addAlgorithm("Cipher", a.f36580e, str + "$OFB");
            configurableProvider.addAlgorithm("Cipher", a.f36584i, str + "$OFB");
            configurableProvider.addAlgorithm("Cipher", a.f36588m, str + "$OFB");
            addGMacAlgorithm(configurableProvider, "SERPENT", str + "$SerpentGMAC", str + "$KeyGen");
            addGMacAlgorithm(configurableProvider, "TNEPRES", str + "$TSerpentGMAC", str + "$TKeyGen");
            addPoly1305Algorithm(configurableProvider, "SERPENT", str + "$Poly1305", str + "$Poly1305KeyGen");
        }
    }

    /* loaded from: classes5.dex */
    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new f(new v(new u0(), 128)), 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new l(new u0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Serpent", 256, new y());
        }
    }

    /* loaded from: classes5.dex */
    public static class SerpentGMAC extends BaseMac {
        public SerpentGMAC() {
            super(new p50.e(new n(new u0())));
        }
    }

    /* loaded from: classes5.dex */
    public static class TAlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Tnepres IV";
        }
    }

    /* loaded from: classes5.dex */
    public static class TECB extends BaseBlockCipher {
        public TECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.TECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public org.bouncycastle.crypto.e get() {
                    return new a1();
                }
            });
        }
    }

    /* loaded from: classes5.dex */
    public static class TKeyGen extends BaseKeyGenerator {
        public TKeyGen() {
            super("Tnepres", 192, new h());
        }
    }

    /* loaded from: classes5.dex */
    public static class TSerpentGMAC extends BaseMac {
        public TSerpentGMAC() {
            super(new p50.e(new n(new a1())));
        }
    }

    private Serpent() {
    }
}