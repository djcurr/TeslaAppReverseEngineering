package org.bouncycastle.jcajce.provider.digest;

import i50.h0;
import o40.a;
import org.bouncycastle.crypto.h;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import p50.g;

/* loaded from: classes5.dex */
public class Whirlpool {

    /* loaded from: classes5.dex */
    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new h0());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new h0((h0) this.digest);
            return digest;
        }
    }

    /* loaded from: classes5.dex */
    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new g(new h0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACWHIRLPOOL", 512, new h());
        }
    }

    /* loaded from: classes5.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Whirlpool.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.WHIRLPOOL", sb2.toString());
            configurableProvider.addAlgorithm("MessageDigest", a.f42272e, str + "$Digest");
            addHMACAlgorithm(configurableProvider, "WHIRLPOOL", str + "$HashMac", str + "$KeyGenerator");
        }
    }

    private Whirlpool() {
    }
}