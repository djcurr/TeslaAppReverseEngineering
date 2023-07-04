package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.generators.Poly1305KeyGenerator;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: classes4.dex */
public class Poly1305 {

    /* loaded from: classes4.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Poly1305", 256, new Poly1305KeyGenerator());
        }
    }

    /* loaded from: classes4.dex */
    public static class Mac extends BaseMac {
        public Mac() {
            super(new org.spongycastle.crypto.macs.Poly1305());
        }
    }

    /* loaded from: classes4.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Poly1305.class.getName();

        @Override // org.spongycastle.jcajce.provider.util.AlgorithmProvider
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