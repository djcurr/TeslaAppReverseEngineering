package org.bouncycastle.jcajce.provider.digest;

import i50.y;
import org.bouncycastle.crypto.h;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import p50.g;
import p50.k;
import r40.b;
import w40.n;

/* loaded from: classes5.dex */
public class SHA384 {

    /* loaded from: classes5.dex */
    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new y());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new y((y) this.digest);
            return digest;
        }
    }

    /* loaded from: classes5.dex */
    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new g(new y()));
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA384", 384, new h());
        }
    }

    /* loaded from: classes5.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA384.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.SHA-384", sb2.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA384", McElieceCCA2KeyGenParameterSpec.SHA384);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + b.f49143d, McElieceCCA2KeyGenParameterSpec.SHA384);
            configurableProvider.addAlgorithm("Mac.OLDHMACSHA384", str + "$OldSHA384");
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACSHA384", str + "$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA384", str + "$HashMac", str + "$KeyGenerator");
            addHMACAlias(configurableProvider, "SHA384", n.f55531e2);
        }
    }

    /* loaded from: classes5.dex */
    public static class OldSHA384 extends BaseMac {
        public OldSHA384() {
            super(new k(new y()));
        }
    }

    private SHA384() {
    }
}