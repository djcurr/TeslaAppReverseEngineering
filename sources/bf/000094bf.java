package org.bouncycastle.jcajce.provider.symmetric;

import e60.f;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import l50.k0;
import l50.o;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.k;
import org.bouncycastle.crypto.t;
import org.bouncycastle.crypto.x;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import p50.a;
import p50.b;
import p50.h;
import q50.c;
import u50.b1;
import u50.f1;
import w40.n;

/* loaded from: classes5.dex */
public final class DES {

    /* loaded from: classes5.dex */
    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = k.b();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("DES");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e11) {
                throw new RuntimeException(e11.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DES parameter generation.");
        }
    }

    /* loaded from: classes5.dex */
    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new c(new o()), 64);
        }
    }

    /* loaded from: classes5.dex */
    public static class CBCMAC extends BaseMac {
        public CBCMAC() {
            super(new a(new o()));
        }
    }

    /* loaded from: classes5.dex */
    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new p50.c(new o()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DES64 extends BaseMac {
        public DES64() {
            super(new a(new o(), 64));
        }
    }

    /* loaded from: classes5.dex */
    public static class DES64with7816d4 extends BaseMac {
        public DES64with7816d4() {
            super(new a(new o(), 64, new t50.c()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DES9797Alg3 extends BaseMac {
        public DES9797Alg3() {
            super(new h(new o()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DES9797Alg3with7816d4 extends BaseMac {
        public DES9797Alg3with7816d4() {
            super(new h(new o(), new t50.c()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DESCFB8 extends BaseMac {
        public DESCFB8() {
            super(new b(new o()));
        }
    }

    /* loaded from: classes5.dex */
    public static class DESPBEKeyFactory extends BaseSecretKeyFactory {
        private int digest;
        private boolean forCipher;
        private int ivSize;
        private int keySize;
        private int scheme;

        public DESPBEKeyFactory(String str, org.bouncycastle.asn1.k kVar, boolean z11, int i11, int i12, int i13, int i14) {
            super(str, kVar);
            this.forCipher = z11;
            this.scheme = i11;
            this.digest = i12;
            this.keySize = i13;
            this.ivSize = i14;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) {
            if (keySpec instanceof PBEKeySpec) {
                PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
                if (pBEKeySpec.getSalt() != null) {
                    i makePBEParameters = this.forCipher ? PBE.Util.makePBEParameters(pBEKeySpec, this.scheme, this.digest, this.keySize, this.ivSize) : PBE.Util.makePBEMacParameters(pBEKeySpec, this.scheme, this.digest, this.keySize);
                    u50.c.c((makePBEParameters instanceof f1 ? (b1) ((f1) makePBEParameters).b() : (b1) makePBEParameters).a());
                    return new BCPBEKey(this.algName, this.algOid, this.scheme, this.digest, this.keySize, this.ivSize, pBEKeySpec, makePBEParameters);
                }
                int i11 = this.scheme;
                if (i11 == 0 || i11 == 4) {
                    return new f(pBEKeySpec.getPassword(), this.scheme == 0 ? x.ASCII : x.UTF8);
                }
                return new BCPBEKey(this.algName, this.algOid, i11, this.digest, this.keySize, this.ivSize, pBEKeySpec, null);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    /* loaded from: classes5.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new o());
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("DES", null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) {
            return keySpec instanceof DESKeySpec ? new SecretKeySpec(((DESKeySpec) keySpec).getKey(), "DES") : super.engineGenerateSecret(keySpec);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        protected KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) {
            if (cls != null) {
                if (secretKey != null) {
                    if (SecretKeySpec.class.isAssignableFrom(cls)) {
                        return new SecretKeySpec(secretKey.getEncoded(), this.algName);
                    }
                    if (DESKeySpec.class.isAssignableFrom(cls)) {
                        try {
                            return new DESKeySpec(secretKey.getEncoded());
                        } catch (Exception e11) {
                            throw new InvalidKeySpecException(e11.toString());
                        }
                    }
                    throw new InvalidKeySpecException("Invalid KeySpec");
                }
                throw new InvalidKeySpecException("key parameter is null");
            }
            throw new InvalidKeySpecException("keySpec parameter is null");
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("DES", 64, new n50.b());
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        protected SecretKey engineGenerateKey() {
            if (this.uninitialised) {
                this.engine.b(new t(k.b(), this.defaultKeySize));
                this.uninitialised = false;
            }
            return new SecretKeySpec(this.engine.a(), this.algName);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        public void engineInit(int i11, SecureRandom secureRandom) {
            super.engineInit(i11, secureRandom);
        }
    }

    /* loaded from: classes5.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PACKAGE = "org.bouncycastle.jcajce.provider.symmetric";
        private static final String PREFIX = DES.class.getName();

        private void addAlias(ConfigurableProvider configurableProvider, org.bouncycastle.asn1.k kVar, String str) {
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + kVar.t(), str);
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + kVar.t(), str);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.DES", sb2.toString());
            org.bouncycastle.asn1.k kVar = v40.b.f54047b;
            configurableProvider.addAlgorithm("Cipher", kVar, str + "$CBC");
            addAlias(configurableProvider, kVar, "DES");
            configurableProvider.addAlgorithm("Cipher.DESRFC3211WRAP", str + "$RFC3211");
            configurableProvider.addAlgorithm("KeyGenerator.DES", str + "$KeyGenerator");
            configurableProvider.addAlgorithm("SecretKeyFactory.DES", str + "$KeyFactory");
            configurableProvider.addAlgorithm("Mac.DESCMAC", str + "$CMAC");
            configurableProvider.addAlgorithm("Mac.DESMAC", str + "$CBCMAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DES", "DESMAC");
            configurableProvider.addAlgorithm("Mac.DESMAC/CFB8", str + "$DESCFB8");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DES/CFB8", "DESMAC/CFB8");
            configurableProvider.addAlgorithm("Mac.DESMAC64", str + "$DES64");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DES64", "DESMAC64");
            configurableProvider.addAlgorithm("Mac.DESMAC64WITHISO7816-4PADDING", str + "$DES64with7816d4");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DES64WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DESISO9797ALG1MACWITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DESISO9797ALG1WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("Mac.DESWITHISO9797", str + "$DES9797Alg3");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DESISO9797MAC", "DESWITHISO9797");
            configurableProvider.addAlgorithm("Mac.ISO9797ALG3MAC", str + "$DES9797Alg3");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.ISO9797ALG3", "ISO9797ALG3MAC");
            configurableProvider.addAlgorithm("Mac.ISO9797ALG3WITHISO7816-4PADDING", str + "$DES9797Alg3with7816d4");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.ISO9797ALG3MACWITHISO7816-4PADDING", "ISO9797ALG3WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("AlgorithmParameters.DES", "org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", kVar, "DES");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.DES", str + "$AlgParamGen");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar, "DES");
            configurableProvider.addAlgorithm("Cipher.PBEWITHMD2ANDDES", str + "$PBEWithMD2");
            configurableProvider.addAlgorithm("Cipher.PBEWITHMD5ANDDES", str + "$PBEWithMD5");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHA1ANDDES", str + "$PBEWithSHA1");
            org.bouncycastle.asn1.k kVar2 = n.I1;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar2, "PBEWITHMD2ANDDES");
            org.bouncycastle.asn1.k kVar3 = n.K1;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar3, "PBEWITHMD5ANDDES");
            org.bouncycastle.asn1.k kVar4 = n.M1;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar4, "PBEWITHSHA1ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD2ANDDES", str + "$PBEWithMD2KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD5ANDDES", str + "$PBEWithMD5KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHA1ANDDES", str + "$PBEWithSHA1KeyFactory");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory." + kVar2, "PBEWITHMD2ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory." + kVar3, "PBEWITHMD5ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory." + kVar4, "PBEWITHSHA1ANDDES");
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithMD2 extends BaseBlockCipher {
        public PBEWithMD2() {
            super(new c(new o()), 0, 5, 64, 8);
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithMD2KeyFactory extends DESPBEKeyFactory {
        public PBEWithMD2KeyFactory() {
            super("PBEwithMD2andDES", n.I1, true, 0, 5, 64, 64);
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithMD5 extends BaseBlockCipher {
        public PBEWithMD5() {
            super(new c(new o()), 0, 0, 64, 8);
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithMD5KeyFactory extends DESPBEKeyFactory {
        public PBEWithMD5KeyFactory() {
            super("PBEwithMD5andDES", n.K1, true, 0, 0, 64, 64);
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithSHA1 extends BaseBlockCipher {
        public PBEWithSHA1() {
            super(new c(new o()), 0, 1, 64, 8);
        }
    }

    /* loaded from: classes5.dex */
    public static class PBEWithSHA1KeyFactory extends DESPBEKeyFactory {
        public PBEWithSHA1KeyFactory() {
            super("PBEwithSHA1andDES", n.M1, true, 0, 1, 64, 64);
        }
    }

    /* loaded from: classes5.dex */
    public static class RFC3211 extends BaseWrapCipher {
        public RFC3211() {
            super(new k0(new o()), 8);
        }
    }

    private DES() {
    }
}