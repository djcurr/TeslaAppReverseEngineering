package org.bouncycastle.jcajce.provider.digest;

import i50.a0;
import i50.b0;
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
public class SHA512 {

    /* loaded from: classes5.dex */
    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new a0());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new a0((a0) this.digest);
            return digest;
        }
    }

    /* loaded from: classes5.dex */
    public static class DigestT extends BCMessageDigest implements Cloneable {
        public DigestT(int i11) {
            super(new b0(i11));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            DigestT digestT = (DigestT) super.clone();
            digestT.digest = new b0((b0) this.digest);
            return digestT;
        }
    }

    /* loaded from: classes5.dex */
    public static class DigestT224 extends DigestT {
        public DigestT224() {
            super(224);
        }
    }

    /* loaded from: classes5.dex */
    public static class DigestT256 extends DigestT {
        public DigestT256() {
            super(256);
        }
    }

    /* loaded from: classes5.dex */
    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new g(new a0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class HashMacT224 extends BaseMac {
        public HashMacT224() {
            super(new g(new b0(224)));
        }
    }

    /* loaded from: classes5.dex */
    public static class HashMacT256 extends BaseMac {
        public HashMacT256() {
            super(new g(new b0(256)));
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA512", 512, new h());
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGeneratorT224 extends BaseKeyGenerator {
        public KeyGeneratorT224() {
            super("HMACSHA512/224", 224, new h());
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGeneratorT256 extends BaseKeyGenerator {
        public KeyGeneratorT256() {
            super("HMACSHA512/256", 256, new h());
        }
    }

    /* loaded from: classes5.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA512.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.SHA-512", sb2.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512", McElieceCCA2KeyGenParameterSpec.SHA512);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + b.f49145e, McElieceCCA2KeyGenParameterSpec.SHA512);
            configurableProvider.addAlgorithm("MessageDigest.SHA-512/224", str + "$DigestT224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512/224", "SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512224", "SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA-512(224)", "SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512(224)", "SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + b.f49149g, "SHA-512/224");
            configurableProvider.addAlgorithm("MessageDigest.SHA-512/256", str + "$DigestT256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512/256", "SHA-512/256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512256", "SHA-512/256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA-512(256)", "SHA-512/256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512(256)", "SHA-512/256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + b.f49151h, "SHA-512/256");
            configurableProvider.addAlgorithm("Mac.OLDHMACSHA512", str + "$OldSHA512");
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACSHA512", str + "$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA512", str + "$HashMac", str + "$KeyGenerator");
            addHMACAlias(configurableProvider, "SHA512", n.f55533f2);
            addHMACAlgorithm(configurableProvider, "SHA512/224", str + "$HashMacT224", str + "$KeyGeneratorT224");
            addHMACAlgorithm(configurableProvider, "SHA512/256", str + "$HashMacT256", str + "$KeyGeneratorT256");
        }
    }

    /* loaded from: classes5.dex */
    public static class OldSHA512 extends BaseMac {
        public OldSHA512() {
            super(new k(new a0()));
        }
    }

    private SHA512() {
    }
}