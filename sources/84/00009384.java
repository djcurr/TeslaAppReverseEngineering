package org.bouncycastle.jcajce.provider.digest;

import i50.x;
import org.bouncycastle.asn1.k;
import org.bouncycastle.crypto.h;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import p50.g;
import r40.b;
import w40.n;

/* loaded from: classes5.dex */
public class SHA256 {

    /* loaded from: classes5.dex */
    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new x());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new x((x) this.digest);
            return digest;
        }
    }

    /* loaded from: classes5.dex */
    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new g(new x()));
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA256", 256, new h());
        }
    }

    /* loaded from: classes5.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA256.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.SHA-256", sb2.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA256", McElieceCCA2KeyGenParameterSpec.SHA256);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Alg.Alias.MessageDigest.");
            k kVar = b.f49141c;
            sb3.append(kVar);
            configurableProvider.addAlgorithm(sb3.toString(), McElieceCCA2KeyGenParameterSpec.SHA256);
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHHMACSHA256", str + "$PBEWithMacKeyFactory");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA-256", "PBEWITHHMACSHA256");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory." + kVar, "PBEWITHHMACSHA256");
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACSHA256", str + "$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA256", str + "$HashMac", str + "$KeyGenerator");
            addHMACAlias(configurableProvider, "SHA256", n.f55529d2);
            addHMACAlias(configurableProvider, "SHA256", kVar);
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacSHA256", null, false, 2, 4, 256, 0);
        }
    }

    private SHA256() {
    }
}