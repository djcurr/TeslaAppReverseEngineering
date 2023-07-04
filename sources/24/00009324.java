package org.bouncycastle.jcajce.provider.digest;

import a50.f;
import i50.c;
import org.bouncycastle.crypto.h;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import p50.d;

/* loaded from: classes5.dex */
public class DSTU7564 {

    /* loaded from: classes5.dex */
    public static class Digest256 extends DigestDSTU7564 {
        public Digest256() {
            super(256);
        }
    }

    /* loaded from: classes5.dex */
    public static class Digest384 extends DigestDSTU7564 {
        public Digest384() {
            super(384);
        }
    }

    /* loaded from: classes5.dex */
    public static class Digest512 extends DigestDSTU7564 {
        public Digest512() {
            super(512);
        }
    }

    /* loaded from: classes5.dex */
    public static class DigestDSTU7564 extends BCMessageDigest implements Cloneable {
        public DigestDSTU7564(int i11) {
            super(new c(i11));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new c((c) this.digest);
            return bCMessageDigest;
        }
    }

    /* loaded from: classes5.dex */
    public static class HashMac256 extends BaseMac {
        public HashMac256() {
            super(new d(256));
        }
    }

    /* loaded from: classes5.dex */
    public static class HashMac384 extends BaseMac {
        public HashMac384() {
            super(new d(384));
        }
    }

    /* loaded from: classes5.dex */
    public static class HashMac512 extends BaseMac {
        public HashMac512() {
            super(new d(512));
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGenerator256 extends BaseKeyGenerator {
        public KeyGenerator256() {
            super("HMACDSTU7564-256", 256, new h());
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGenerator384 extends BaseKeyGenerator {
        public KeyGenerator384() {
            super("HMACDSTU7564-384", 384, new h());
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGenerator512 extends BaseKeyGenerator {
        public KeyGenerator512() {
            super("HMACDSTU7564-512", 512, new h());
        }
    }

    /* loaded from: classes5.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = DSTU7564.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$Digest256");
            configurableProvider.addAlgorithm("MessageDigest.DSTU7564-256", sb2.toString());
            configurableProvider.addAlgorithm("MessageDigest.DSTU7564-384", str + "$Digest384");
            configurableProvider.addAlgorithm("MessageDigest.DSTU7564-512", str + "$Digest512");
            configurableProvider.addAlgorithm("MessageDigest", f.f255d, str + "$Digest256");
            configurableProvider.addAlgorithm("MessageDigest", f.f256e, str + "$Digest384");
            configurableProvider.addAlgorithm("MessageDigest", f.f257f, str + "$Digest512");
            addHMACAlgorithm(configurableProvider, "DSTU7564-256", str + "$HashMac256", str + "$KeyGenerator256");
            addHMACAlgorithm(configurableProvider, "DSTU7564-384", str + "$HashMac384", str + "$KeyGenerator384");
            addHMACAlgorithm(configurableProvider, "DSTU7564-512", str + "$HashMac512", str + "$KeyGenerator512");
            addHMACAlias(configurableProvider, "DSTU7564-256", f.f258g);
            addHMACAlias(configurableProvider, "DSTU7564-384", f.f259h);
            addHMACAlias(configurableProvider, "DSTU7564-512", f.f260i);
        }
    }

    private DSTU7564() {
    }
}