package org.bouncycastle.jcajce.provider.digest;

import i50.p;
import m40.a;
import org.bouncycastle.crypto.h;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import p50.g;
import w40.n;

/* loaded from: classes5.dex */
public class MD5 {

    /* loaded from: classes5.dex */
    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new p());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new p((p) this.digest);
            return digest;
        }
    }

    /* loaded from: classes5.dex */
    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new g(new p()));
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACMD5", 128, new h());
        }
    }

    /* loaded from: classes5.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = MD5.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.MD5", sb2.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + n.Z1, "MD5");
            addHMACAlgorithm(configurableProvider, "MD5", str + "$HashMac", str + "$KeyGenerator");
            addHMACAlias(configurableProvider, "MD5", a.f38409f);
        }
    }

    private MD5() {
    }
}