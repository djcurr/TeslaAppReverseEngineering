package org.bouncycastle.jcajce.provider.digest;

import i40.a;
import i50.d;
import i50.f;
import i50.g;
import org.bouncycastle.asn1.k;
import org.bouncycastle.crypto.h;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes5.dex */
public class GOST3411 {

    /* loaded from: classes5.dex */
    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new d());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new d((d) this.digest);
            return digest;
        }
    }

    /* loaded from: classes5.dex */
    public static class Digest2012_256 extends BCMessageDigest implements Cloneable {
        public Digest2012_256() {
            super(new f());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest2012_256 digest2012_256 = (Digest2012_256) super.clone();
            digest2012_256.digest = new f((f) this.digest);
            return digest2012_256;
        }
    }

    /* loaded from: classes5.dex */
    public static class Digest2012_512 extends BCMessageDigest implements Cloneable {
        public Digest2012_512() {
            super(new g());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest2012_512 digest2012_512 = (Digest2012_512) super.clone();
            digest2012_512.digest = new g((g) this.digest);
            return digest2012_512;
        }
    }

    /* loaded from: classes5.dex */
    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new p50.g(new d()));
        }
    }

    /* loaded from: classes5.dex */
    public static class HashMac2012_256 extends BaseMac {
        public HashMac2012_256() {
            super(new p50.g(new f()));
        }
    }

    /* loaded from: classes5.dex */
    public static class HashMac2012_512 extends BaseMac {
        public HashMac2012_512() {
            super(new p50.g(new g()));
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACGOST3411", 256, new h());
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGenerator2012_256 extends BaseKeyGenerator {
        public KeyGenerator2012_256() {
            super("HMACGOST3411", 256, new h());
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGenerator2012_512 extends BaseKeyGenerator {
        public KeyGenerator2012_512() {
            super("HMACGOST3411", 512, new h());
        }
    }

    /* loaded from: classes5.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = GOST3411.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.GOST3411", sb2.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST", "GOST3411");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-3411", "GOST3411");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Alg.Alias.MessageDigest.");
            k kVar = a.f29839b;
            sb3.append(kVar);
            configurableProvider.addAlgorithm(sb3.toString(), "GOST3411");
            addHMACAlgorithm(configurableProvider, "GOST3411", str + "$HashMac", str + "$KeyGenerator");
            addHMACAlias(configurableProvider, "GOST3411", kVar);
            configurableProvider.addAlgorithm("MessageDigest.GOST3411-2012-256", str + "$Digest2012_256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-2012-256", "GOST3411-2012-256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-3411-2012-256", "GOST3411-2012-256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + x40.a.f57029c, "GOST3411-2012-256");
            addHMACAlgorithm(configurableProvider, "GOST3411-2012-256", str + "$HashMac2012_256", str + "$KeyGenerator2012_256");
            addHMACAlias(configurableProvider, "GOST3411-2012-256", x40.a.f57031e);
            configurableProvider.addAlgorithm("MessageDigest.GOST3411-2012-512", str + "$Digest2012_512");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-2012-512", "GOST3411-2012-512");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-3411-2012-512", "GOST3411-2012-512");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + x40.a.f57030d, "GOST3411-2012-512");
            addHMACAlgorithm(configurableProvider, "GOST3411-2012-512", str + "$HashMac2012_512", str + "$KeyGenerator2012_512");
            addHMACAlias(configurableProvider, "GOST3411-2012-512", x40.a.f57032f);
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHHMACGOST3411", str + "$PBEWithMacKeyFactory");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory." + kVar, "PBEWITHHMACGOST3411");
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacGOST3411", null, false, 2, 6, 256, 0);
        }
    }

    private GOST3411() {
    }
}