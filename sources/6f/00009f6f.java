package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.digests.SHA3Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;
import org.spongycastle.pqc.jcajce.spec.SPHINCS256KeyGenParameterSpec;

/* loaded from: classes4.dex */
public class SHA3 {

    /* loaded from: classes4.dex */
    public static class Digest224 extends DigestSHA3 {
        public Digest224() {
            super(224);
        }
    }

    /* loaded from: classes4.dex */
    public static class Digest256 extends DigestSHA3 {
        public Digest256() {
            super(256);
        }
    }

    /* loaded from: classes4.dex */
    public static class Digest384 extends DigestSHA3 {
        public Digest384() {
            super(384);
        }
    }

    /* loaded from: classes4.dex */
    public static class Digest512 extends DigestSHA3 {
        public Digest512() {
            super(512);
        }
    }

    /* loaded from: classes4.dex */
    public static class DigestSHA3 extends BCMessageDigest implements Cloneable {
        public DigestSHA3(int i11) {
            super(new SHA3Digest(i11));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SHA3Digest((SHA3Digest) this.digest);
            return bCMessageDigest;
        }
    }

    /* loaded from: classes4.dex */
    public static class HashMac224 extends HashMacSHA3 {
        public HashMac224() {
            super(224);
        }
    }

    /* loaded from: classes4.dex */
    public static class HashMac256 extends HashMacSHA3 {
        public HashMac256() {
            super(256);
        }
    }

    /* loaded from: classes4.dex */
    public static class HashMac384 extends HashMacSHA3 {
        public HashMac384() {
            super(384);
        }
    }

    /* loaded from: classes4.dex */
    public static class HashMac512 extends HashMacSHA3 {
        public HashMac512() {
            super(512);
        }
    }

    /* loaded from: classes4.dex */
    public static class HashMacSHA3 extends BaseMac {
        public HashMacSHA3(int i11) {
            super(new HMac(new SHA3Digest(i11)));
        }
    }

    /* loaded from: classes4.dex */
    public static class KeyGenerator224 extends KeyGeneratorSHA3 {
        public KeyGenerator224() {
            super(224);
        }
    }

    /* loaded from: classes4.dex */
    public static class KeyGenerator256 extends KeyGeneratorSHA3 {
        public KeyGenerator256() {
            super(256);
        }
    }

    /* loaded from: classes4.dex */
    public static class KeyGenerator384 extends KeyGeneratorSHA3 {
        public KeyGenerator384() {
            super(384);
        }
    }

    /* loaded from: classes4.dex */
    public static class KeyGenerator512 extends KeyGeneratorSHA3 {
        public KeyGenerator512() {
            super(512);
        }
    }

    /* loaded from: classes4.dex */
    public static class KeyGeneratorSHA3 extends BaseKeyGenerator {
        public KeyGeneratorSHA3(int i11) {
            super("HMACSHA3-" + i11, i11, new CipherKeyGenerator());
        }
    }

    /* loaded from: classes4.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA3.class.getName();

        @Override // org.spongycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$Digest224");
            configurableProvider.addAlgorithm("MessageDigest.SHA3-224", sb2.toString());
            configurableProvider.addAlgorithm("MessageDigest.SHA3-256", str + "$Digest256");
            configurableProvider.addAlgorithm("MessageDigest.SHA3-384", str + "$Digest384");
            configurableProvider.addAlgorithm("MessageDigest.SHA3-512", str + "$Digest512");
            configurableProvider.addAlgorithm("MessageDigest", NISTObjectIdentifiers.id_sha3_224, str + "$Digest224");
            configurableProvider.addAlgorithm("MessageDigest", NISTObjectIdentifiers.id_sha3_256, str + "$Digest256");
            configurableProvider.addAlgorithm("MessageDigest", NISTObjectIdentifiers.id_sha3_384, str + "$Digest384");
            configurableProvider.addAlgorithm("MessageDigest", NISTObjectIdentifiers.id_sha3_512, str + "$Digest512");
            addHMACAlgorithm(configurableProvider, "SHA3-224", str + "$HashMac224", str + "$KeyGenerator224");
            addHMACAlias(configurableProvider, "SHA3-224", NISTObjectIdentifiers.id_hmacWithSHA3_224);
            addHMACAlgorithm(configurableProvider, SPHINCS256KeyGenParameterSpec.SHA3_256, str + "$HashMac256", str + "$KeyGenerator256");
            addHMACAlias(configurableProvider, SPHINCS256KeyGenParameterSpec.SHA3_256, NISTObjectIdentifiers.id_hmacWithSHA3_256);
            addHMACAlgorithm(configurableProvider, "SHA3-384", str + "$HashMac384", str + "$KeyGenerator384");
            addHMACAlias(configurableProvider, "SHA3-384", NISTObjectIdentifiers.id_hmacWithSHA3_384);
            addHMACAlgorithm(configurableProvider, "SHA3-512", str + "$HashMac512", str + "$KeyGenerator512");
            addHMACAlias(configurableProvider, "SHA3-512", NISTObjectIdentifiers.id_hmacWithSHA3_512);
        }
    }

    private SHA3() {
    }
}