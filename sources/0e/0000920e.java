package org.bouncycastle.jcajce.provider.asymmetric.ec;

import f50.i;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.Hashtable;
import l60.d;
import l60.e;
import n50.l;
import org.bouncycastle.crypto.b;
import org.bouncycastle.crypto.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import r70.f;
import u50.a0;
import u50.d0;
import u50.e0;
import u50.y;

/* loaded from: classes5.dex */
public abstract class KeyPairGeneratorSpi extends KeyPairGenerator {

    /* loaded from: classes5.dex */
    public static class EC extends KeyPairGeneratorSpi {
        private static Hashtable ecParameters;
        String algorithm;
        ProviderConfiguration configuration;
        Object ecParams;
        l engine;
        boolean initialised;
        a0 param;
        SecureRandom random;
        int strength;

        static {
            Hashtable hashtable = new Hashtable();
            ecParameters = hashtable;
            hashtable.put(f.d(192), new ECGenParameterSpec("prime192v1"));
            ecParameters.put(f.d(239), new ECGenParameterSpec("prime239v1"));
            ecParameters.put(f.d(256), new ECGenParameterSpec("prime256v1"));
            ecParameters.put(f.d(224), new ECGenParameterSpec("P-224"));
            ecParameters.put(f.d(384), new ECGenParameterSpec("P-384"));
            ecParameters.put(f.d(521), new ECGenParameterSpec("P-521"));
        }

        public EC() {
            super("EC");
            this.engine = new l();
            this.ecParams = null;
            this.strength = 239;
            this.random = k.b();
            this.initialised = false;
            this.algorithm = "EC";
            this.configuration = BouncyCastleProvider.CONFIGURATION;
        }

        public EC(String str, ProviderConfiguration providerConfiguration) {
            super(str);
            this.engine = new l();
            this.ecParams = null;
            this.strength = 239;
            this.random = k.b();
            this.initialised = false;
            this.algorithm = str;
            this.configuration = providerConfiguration;
        }

        protected a0 createKeyGenParamsBC(e eVar, SecureRandom secureRandom) {
            return new a0(new y(eVar.a(), eVar.b(), eVar.d(), eVar.c()), secureRandom);
        }

        protected a0 createKeyGenParamsJCE(i iVar, SecureRandom secureRandom) {
            return new a0(new y(iVar.e(), iVar.f(), iVar.j(), iVar.h()), secureRandom);
        }

        protected a0 createKeyGenParamsJCE(ECParameterSpec eCParameterSpec, SecureRandom secureRandom) {
            i domainParametersFromName;
            if (!(eCParameterSpec instanceof d) || (domainParametersFromName = ECUtils.getDomainParametersFromName(((d) eCParameterSpec).c(), this.configuration)) == null) {
                n60.e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                return new a0(new y(convertCurve, EC5Util.convertPoint(convertCurve, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom);
            }
            return createKeyGenParamsJCE(domainParametersFromName, secureRandom);
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public KeyPair generateKeyPair() {
            if (!this.initialised) {
                initialize(this.strength, new SecureRandom());
            }
            b generateKeyPair = this.engine.generateKeyPair();
            e0 e0Var = (e0) generateKeyPair.b();
            d0 d0Var = (d0) generateKeyPair.a();
            Object obj = this.ecParams;
            if (obj instanceof e) {
                e eVar = (e) obj;
                BCECPublicKey bCECPublicKey = new BCECPublicKey(this.algorithm, e0Var, eVar, this.configuration);
                return new KeyPair(bCECPublicKey, new BCECPrivateKey(this.algorithm, d0Var, bCECPublicKey, eVar, this.configuration));
            } else if (obj == null) {
                return new KeyPair(new BCECPublicKey(this.algorithm, e0Var, this.configuration), new BCECPrivateKey(this.algorithm, d0Var, this.configuration));
            } else {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
                BCECPublicKey bCECPublicKey2 = new BCECPublicKey(this.algorithm, e0Var, eCParameterSpec, this.configuration);
                return new KeyPair(bCECPublicKey2, new BCECPrivateKey(this.algorithm, d0Var, bCECPublicKey2, eCParameterSpec, this.configuration));
            }
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(int i11, SecureRandom secureRandom) {
            this.strength = i11;
            this.random = secureRandom;
            ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) ecParameters.get(f.d(i11));
            if (eCGenParameterSpec == null) {
                throw new InvalidParameterException("unknown key size.");
            }
            try {
                initialize(eCGenParameterSpec, secureRandom);
            } catch (InvalidAlgorithmParameterException unused) {
                throw new InvalidParameterException("key size not configurable.");
            }
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            String a11;
            a0 createKeyGenParamsJCE;
            e eVar;
            if (algorithmParameterSpec == null) {
                eVar = this.configuration.getEcImplicitlyCa();
                if (eVar == null) {
                    throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
                }
                this.ecParams = null;
            } else if (!(algorithmParameterSpec instanceof e)) {
                if (algorithmParameterSpec instanceof ECParameterSpec) {
                    this.ecParams = algorithmParameterSpec;
                    createKeyGenParamsJCE = createKeyGenParamsJCE((ECParameterSpec) algorithmParameterSpec, secureRandom);
                    this.param = createKeyGenParamsJCE;
                    this.engine.b(this.param);
                    this.initialised = true;
                }
                if (algorithmParameterSpec instanceof ECGenParameterSpec) {
                    a11 = ((ECGenParameterSpec) algorithmParameterSpec).getName();
                } else if (!(algorithmParameterSpec instanceof l60.b)) {
                    String nameFrom = ECUtil.getNameFrom(algorithmParameterSpec);
                    if (nameFrom != null) {
                        initializeNamedCurve(nameFrom, secureRandom);
                        this.engine.b(this.param);
                        this.initialised = true;
                    }
                    throw new InvalidAlgorithmParameterException("invalid parameterSpec: " + algorithmParameterSpec);
                } else {
                    a11 = ((l60.b) algorithmParameterSpec).a();
                }
                initializeNamedCurve(a11, secureRandom);
                this.engine.b(this.param);
                this.initialised = true;
            } else {
                this.ecParams = algorithmParameterSpec;
                eVar = (e) algorithmParameterSpec;
            }
            createKeyGenParamsJCE = createKeyGenParamsBC(eVar, secureRandom);
            this.param = createKeyGenParamsJCE;
            this.engine.b(this.param);
            this.initialised = true;
        }

        protected void initializeNamedCurve(String str, SecureRandom secureRandom) {
            i domainParametersFromName = ECUtils.getDomainParametersFromName(str, this.configuration);
            if (domainParametersFromName != null) {
                this.ecParams = new d(str, domainParametersFromName.e(), domainParametersFromName.f(), domainParametersFromName.j(), domainParametersFromName.h(), null);
                this.param = createKeyGenParamsJCE(domainParametersFromName, secureRandom);
                return;
            }
            throw new InvalidAlgorithmParameterException("unknown curve name: " + str);
        }
    }

    /* loaded from: classes5.dex */
    public static class ECDH extends EC {
        public ECDH() {
            super("ECDH", BouncyCastleProvider.CONFIGURATION);
        }
    }

    /* loaded from: classes5.dex */
    public static class ECDHC extends EC {
        public ECDHC() {
            super("ECDHC", BouncyCastleProvider.CONFIGURATION);
        }
    }

    /* loaded from: classes5.dex */
    public static class ECDSA extends EC {
        public ECDSA() {
            super("ECDSA", BouncyCastleProvider.CONFIGURATION);
        }
    }

    /* loaded from: classes5.dex */
    public static class ECMQV extends EC {
        public ECMQV() {
            super("ECMQV", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public KeyPairGeneratorSpi(String str) {
        super(str);
    }
}