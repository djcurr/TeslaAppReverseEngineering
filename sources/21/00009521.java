package org.bouncycastle.jcajce.provider.symmetric;

import l50.w;
import org.bouncycastle.crypto.e;
import org.bouncycastle.crypto.f;
import org.bouncycastle.crypto.h;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import p50.c;
import q50.i;
import q50.j;
import q50.k;
import q50.l;

/* loaded from: classes5.dex */
public class GOST3412_2015 {

    /* loaded from: classes5.dex */
    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super((e) new i(new w()), false, 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class CTR extends BaseBlockCipher {
        public CTR() {
            super(new f(new k(new w())), true, 64);
        }
    }

    /* loaded from: classes5.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new w());
        }
    }

    /* loaded from: classes5.dex */
    public static class GCFB extends BaseBlockCipher {
        public GCFB() {
            super(new f(new j(new w())), false, 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class GCFB8 extends BaseBlockCipher {
        public GCFB8() {
            super(new f(new j(new w(), 8)), false, 128);
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i11) {
            super("GOST3412-2015", i11, new h());
        }
    }

    /* loaded from: classes5.dex */
    public static class Mac extends BaseMac {
        public Mac() {
            super(new c(new w()));
        }
    }

    /* loaded from: classes5.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = GOST3412_2015.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.GOST3412-2015", sb2.toString());
            configurableProvider.addAlgorithm("Cipher.GOST3412-2015/CFB", str + "$GCFB");
            configurableProvider.addAlgorithm("Cipher.GOST3412-2015/CFB8", str + "$GCFB8");
            configurableProvider.addAlgorithm("Cipher.GOST3412-2015/OFB", str + "$OFB");
            configurableProvider.addAlgorithm("Cipher.GOST3412-2015/CBC", str + "$CBC");
            configurableProvider.addAlgorithm("Cipher.GOST3412-2015/CTR", str + "$CTR");
            configurableProvider.addAlgorithm("KeyGenerator.GOST3412-2015", str + "$KeyGen");
            configurableProvider.addAlgorithm("Mac.GOST3412MAC", str + "$Mac");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.GOST3412-2015", "GOST3412MAC");
        }
    }

    /* loaded from: classes5.dex */
    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new f(new l(new w())), false, 128);
        }
    }
}