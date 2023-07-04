package org.bouncycastle.jcajce.provider.digest;

import i50.w;
import org.bouncycastle.crypto.h;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import p50.g;
import r40.b;
import w40.n;

/* loaded from: classes5.dex */
public class SHA224 {

    /* loaded from: classes5.dex */
    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new w());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new w((w) this.digest);
            return digest;
        }
    }

    /* loaded from: classes5.dex */
    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new g(new w()));
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA224", 224, new h());
        }
    }

    /* loaded from: classes5.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA224.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.SHA-224", sb2.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA224", McElieceCCA2KeyGenParameterSpec.SHA224);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + b.f49147f, McElieceCCA2KeyGenParameterSpec.SHA224);
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACSHA224", str + "$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA224", str + "$HashMac", str + "$KeyGenerator");
            addHMACAlias(configurableProvider, "SHA224", n.f55527c2);
        }
    }

    private SHA224() {
    }
}