package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import f50.i;
import h60.k;
import i40.b;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import l60.d;
import l60.e;
import n50.l;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import u50.a0;
import u50.c0;
import u50.d0;
import u50.e0;
import u50.y;
import u50.z;

/* loaded from: classes5.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    String algorithm;
    Object ecParams;
    l engine;
    boolean initialised;
    a0 param;
    SecureRandom random;
    int strength;

    public KeyPairGeneratorSpi() {
        super("ECGOST3410");
        this.ecParams = null;
        this.engine = new l();
        this.algorithm = "ECGOST3410";
        this.strength = 239;
        this.random = null;
        this.initialised = false;
    }

    private void init(k kVar, SecureRandom secureRandom) {
        org.bouncycastle.asn1.k e11 = kVar.e();
        i f11 = b.f(e11);
        if (f11 == null) {
            throw new InvalidAlgorithmParameterException("unknown curve: " + e11);
        }
        this.ecParams = new d(b.g(e11), f11.e(), f11.f(), f11.j(), f11.h(), f11.k());
        a0 a0Var = new a0(new z(new c0(e11, f11), e11, kVar.b(), kVar.c()), secureRandom);
        this.param = a0Var;
        this.engine.b(a0Var);
        this.initialised = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (this.initialised) {
            org.bouncycastle.crypto.b generateKeyPair = this.engine.generateKeyPair();
            e0 e0Var = (e0) generateKeyPair.b();
            d0 d0Var = (d0) generateKeyPair.a();
            Object obj = this.ecParams;
            if (obj instanceof e) {
                e eVar = (e) obj;
                BCECGOST3410PublicKey bCECGOST3410PublicKey = new BCECGOST3410PublicKey(this.algorithm, e0Var, eVar);
                return new KeyPair(bCECGOST3410PublicKey, new BCECGOST3410PrivateKey(this.algorithm, d0Var, bCECGOST3410PublicKey, eVar));
            } else if (obj == null) {
                return new KeyPair(new BCECGOST3410PublicKey(this.algorithm, e0Var), new BCECGOST3410PrivateKey(this.algorithm, d0Var));
            } else {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
                BCECGOST3410PublicKey bCECGOST3410PublicKey2 = new BCECGOST3410PublicKey(this.algorithm, e0Var, eCParameterSpec);
                return new KeyPair(bCECGOST3410PublicKey2, new BCECGOST3410PrivateKey(this.algorithm, d0Var, bCECGOST3410PublicKey2, eCParameterSpec));
            }
        }
        throw new IllegalStateException("EC Key Pair Generator not initialised");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i11, SecureRandom secureRandom) {
        this.strength = i11;
        this.random = secureRandom;
        Object obj = this.ecParams;
        if (obj == null) {
            throw new InvalidParameterException("unknown key size.");
        }
        try {
            initialize((ECGenParameterSpec) obj, secureRandom);
        } catch (InvalidAlgorithmParameterException unused) {
            throw new InvalidParameterException("key size not configurable.");
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        a0 a0Var;
        if (algorithmParameterSpec instanceof k) {
            init((k) algorithmParameterSpec, secureRandom);
            return;
        }
        if (!(algorithmParameterSpec instanceof e)) {
            if (algorithmParameterSpec instanceof ECParameterSpec) {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
                this.ecParams = algorithmParameterSpec;
                n60.e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                a0 a0Var2 = new a0(new y(convertCurve, EC5Util.convertPoint(convertCurve, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom);
                this.param = a0Var2;
                this.engine.b(a0Var2);
                this.initialised = true;
            }
            boolean z11 = algorithmParameterSpec instanceof ECGenParameterSpec;
            if (z11 || (algorithmParameterSpec instanceof l60.b)) {
                init(new k(z11 ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : ((l60.b) algorithmParameterSpec).a()), secureRandom);
                return;
            }
            if (algorithmParameterSpec == null) {
                ProviderConfiguration providerConfiguration = BouncyCastleProvider.CONFIGURATION;
                if (providerConfiguration.getEcImplicitlyCa() != null) {
                    e ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
                    this.ecParams = algorithmParameterSpec;
                    a0Var = new a0(new y(ecImplicitlyCa.a(), ecImplicitlyCa.b(), ecImplicitlyCa.d(), ecImplicitlyCa.c()), secureRandom);
                }
            }
            if (algorithmParameterSpec == null && BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa() == null) {
                throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
            }
            throw new InvalidAlgorithmParameterException("parameter object not a ECParameterSpec: " + algorithmParameterSpec.getClass().getName());
        }
        e eVar = (e) algorithmParameterSpec;
        this.ecParams = algorithmParameterSpec;
        a0Var = new a0(new y(eVar.a(), eVar.b(), eVar.d(), eVar.c()), secureRandom);
        this.param = a0Var;
        this.engine.b(a0Var);
        this.initialised = true;
    }
}