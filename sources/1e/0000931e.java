package org.bouncycastle.jcajce.provider.digest;

import i50.b;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import q40.c;

/* loaded from: classes5.dex */
public class Blake2s {

    /* loaded from: classes5.dex */
    public static class Blake2s128 extends BCMessageDigest implements Cloneable {
        public Blake2s128() {
            super(new b(128));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2s128 blake2s128 = (Blake2s128) super.clone();
            blake2s128.digest = new b((b) this.digest);
            return blake2s128;
        }
    }

    /* loaded from: classes5.dex */
    public static class Blake2s160 extends BCMessageDigest implements Cloneable {
        public Blake2s160() {
            super(new b(160));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2s160 blake2s160 = (Blake2s160) super.clone();
            blake2s160.digest = new b((b) this.digest);
            return blake2s160;
        }
    }

    /* loaded from: classes5.dex */
    public static class Blake2s224 extends BCMessageDigest implements Cloneable {
        public Blake2s224() {
            super(new b(224));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2s224 blake2s224 = (Blake2s224) super.clone();
            blake2s224.digest = new b((b) this.digest);
            return blake2s224;
        }
    }

    /* loaded from: classes5.dex */
    public static class Blake2s256 extends BCMessageDigest implements Cloneable {
        public Blake2s256() {
            super(new b(256));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2s256 blake2s256 = (Blake2s256) super.clone();
            blake2s256.digest = new b((b) this.digest);
            return blake2s256;
        }
    }

    /* loaded from: classes5.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Blake2s.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$Blake2s256");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2S-256", sb2.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + c.f47478x, "BLAKE2S-256");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2S-224", str + "$Blake2s224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + c.f47477w, "BLAKE2S-224");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2S-160", str + "$Blake2s160");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + c.f47476v, "BLAKE2S-160");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2S-128", str + "$Blake2s128");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + c.f47475u, "BLAKE2S-128");
        }
    }

    private Blake2s() {
    }
}