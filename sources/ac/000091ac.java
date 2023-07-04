package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import a50.c;
import h60.f;
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
import n50.k;
import n50.l;
import n60.i;
import org.bouncycastle.crypto.b;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import u50.a0;
import u50.d0;
import u50.e0;
import u50.v;
import u50.y;

/* loaded from: classes5.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    String algorithm;
    Object ecParams;
    l engine;
    boolean initialised;
    a0 param;
    SecureRandom random;

    public KeyPairGeneratorSpi() {
        super("DSTU4145");
        this.ecParams = null;
        this.engine = new k();
        this.algorithm = "DSTU4145";
        this.random = null;
        this.initialised = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (this.initialised) {
            b generateKeyPair = this.engine.generateKeyPair();
            e0 e0Var = (e0) generateKeyPair.b();
            d0 d0Var = (d0) generateKeyPair.a();
            Object obj = this.ecParams;
            if (obj instanceof e) {
                e eVar = (e) obj;
                BCDSTU4145PublicKey bCDSTU4145PublicKey = new BCDSTU4145PublicKey(this.algorithm, e0Var, eVar);
                return new KeyPair(bCDSTU4145PublicKey, new BCDSTU4145PrivateKey(this.algorithm, d0Var, bCDSTU4145PublicKey, eVar));
            } else if (obj == null) {
                return new KeyPair(new BCDSTU4145PublicKey(this.algorithm, e0Var), new BCDSTU4145PrivateKey(this.algorithm, d0Var));
            } else {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
                BCDSTU4145PublicKey bCDSTU4145PublicKey2 = new BCDSTU4145PublicKey(this.algorithm, e0Var, eCParameterSpec);
                return new KeyPair(bCDSTU4145PublicKey2, new BCDSTU4145PrivateKey(this.algorithm, d0Var, bCDSTU4145PublicKey2, eCParameterSpec));
            }
        }
        throw new IllegalStateException("DSTU Key Pair Generator not initialised");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i11, SecureRandom secureRandom) {
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
        if (!(algorithmParameterSpec instanceof e)) {
            if (algorithmParameterSpec instanceof ECParameterSpec) {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
                this.ecParams = algorithmParameterSpec;
                n60.e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                i convertPoint = EC5Util.convertPoint(convertCurve, eCParameterSpec.getGenerator());
                if (eCParameterSpec instanceof f) {
                    this.param = new a0(new v(new y(convertCurve, convertPoint, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), ((f) eCParameterSpec).a()), secureRandom);
                } else {
                    this.param = new a0(new y(convertCurve, convertPoint, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom);
                }
                this.engine.b(this.param);
            } else {
                boolean z11 = algorithmParameterSpec instanceof ECGenParameterSpec;
                if (!z11 && !(algorithmParameterSpec instanceof l60.b)) {
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
                String name = z11 ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : ((l60.b) algorithmParameterSpec).a();
                y a11 = c.a(new org.bouncycastle.asn1.k(name));
                if (a11 == null) {
                    throw new InvalidAlgorithmParameterException("unknown curve name: " + name);
                }
                d dVar = new d(name, a11.a(), a11.b(), a11.e(), a11.c(), a11.f());
                this.ecParams = dVar;
                d dVar2 = dVar;
                n60.e convertCurve2 = EC5Util.convertCurve(dVar2.getCurve());
                a0 a0Var2 = new a0(new y(convertCurve2, EC5Util.convertPoint(convertCurve2, dVar2.getGenerator()), dVar2.getOrder(), BigInteger.valueOf(dVar2.getCofactor())), secureRandom);
                this.param = a0Var2;
                this.engine.b(a0Var2);
            }
            this.initialised = true;
        }
        e eVar = (e) algorithmParameterSpec;
        this.ecParams = algorithmParameterSpec;
        a0Var = new a0(new y(eVar.a(), eVar.b(), eVar.d(), eVar.c()), secureRandom);
        this.param = a0Var;
        this.engine.b(a0Var);
        this.initialised = true;
    }
}