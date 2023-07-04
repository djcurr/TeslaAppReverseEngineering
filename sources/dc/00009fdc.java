package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.asn1.iana.IANAObjectIdentifiers;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.digests.TigerDigest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;
import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes4.dex */
public class Tiger {

    /* loaded from: classes4.dex */
    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new TigerDigest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new TigerDigest((TigerDigest) this.digest);
            return digest;
        }
    }

    /* loaded from: classes4.dex */
    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new TigerDigest()));
        }
    }

    /* loaded from: classes4.dex */
    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACTIGER", 192, new CipherKeyGenerator());
        }
    }

    /* loaded from: classes4.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Tiger.class.getName();

        @Override // org.spongycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.TIGER", sb2.toString());
            configurableProvider.addAlgorithm("MessageDigest.Tiger", str + "$Digest");
            addHMACAlgorithm(configurableProvider, "TIGER", str + "$HashMac", str + "$KeyGenerator");
            addHMACAlias(configurableProvider, "TIGER", IANAObjectIdentifiers.hmacTIGER);
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHHMACTIGER", str + "$PBEWithMacKeyFactory");
        }
    }

    /* loaded from: classes4.dex */
    public static class PBEWithHashMac extends BaseMac {
        public PBEWithHashMac() {
            super(new HMac(new TigerDigest()), 2, 3, 192);
        }
    }

    /* loaded from: classes4.dex */
    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacTiger", null, false, 2, 3, 192, 0);
        }
    }

    /* loaded from: classes4.dex */
    public static class TigerHmac extends BaseMac {
        public TigerHmac() {
            super(new HMac(new TigerDigest()));
        }
    }

    private Tiger() {
    }
}