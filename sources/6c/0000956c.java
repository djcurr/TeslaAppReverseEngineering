package org.bouncycastle.jcajce.provider.symmetric;

import n50.y;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import p50.l;

/* loaded from: classes5.dex */
public class Poly1305 {

    /* loaded from: classes5.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Poly1305", 256, new y());
        }
    }

    /* loaded from: classes5.dex */
    public static class Mac extends BaseMac {
        public Mac() {
            super(new l());
        }
    }

    /* loaded from: classes5.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Poly1305.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$Mac");
            configurableProvider.addAlgorithm("Mac.POLY1305", sb2.toString());
            configurableProvider.addAlgorithm("KeyGenerator.POLY1305", str + "$KeyGen");
        }
    }

    private Poly1305() {
    }
}