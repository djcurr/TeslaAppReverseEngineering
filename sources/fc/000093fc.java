package org.bouncycastle.jcajce.provider.digest;

import i50.g0;
import m40.a;
import org.bouncycastle.crypto.h;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import p50.g;

/* loaded from: classes5.dex */
public class Tiger {

    /* loaded from: classes5.dex */
    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new g0());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new g0((g0) this.digest);
            return digest;
        }
    }

    /* loaded from: classes5.dex */
    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new g(new g0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACTIGER", 192, new h());
        }
    }

    /* loaded from: classes5.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Tiger.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.TIGER", sb2.toString());
            configurableProvider.addAlgorithm("MessageDigest.Tiger", str + "$Digest");
            addHMACAlgorithm(configurableProvider, "TIGER", str + "$HashMac", str + "$KeyGenerator");
            addHMACAlias(configurableProvider, "TIGER", a.f38411h);
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHHMACTIGER", str + "$PBEWithMacKeyFactory");
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithHashMac extends BaseMac {
        public PBEWithHashMac() {
            super(new g(new g0()), 2, 3, 192);
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacTiger", null, false, 2, 3, 192, 0);
        }
    }

    /* loaded from: classes5.dex */
    public static class TigerHmac extends BaseMac {
        public TigerHmac() {
            super(new g(new g0()));
        }
    }

    private Tiger() {
    }
}