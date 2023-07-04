package org.bouncycastle.jcajce.provider.asymmetric.dh;

import h60.b;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.spec.DHParameterSpec;
import n50.d;
import n50.g;
import org.bouncycastle.crypto.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import r70.f;
import u50.e;
import u50.i;
import u50.j;

/* loaded from: classes5.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    d engine;
    boolean initialised;
    e param;
    SecureRandom random;
    int strength;
    private static Hashtable params = new Hashtable();
    private static Object lock = new Object();

    public KeyPairGeneratorSpi() {
        super("DH");
        this.engine = new d();
        this.strength = 2048;
        this.random = k.b();
        this.initialised = false;
    }

    private e convertParams(SecureRandom secureRandom, DHParameterSpec dHParameterSpec) {
        return dHParameterSpec instanceof b ? new e(secureRandom, ((b) dHParameterSpec).a()) : new e(secureRandom, new i(dHParameterSpec.getP(), dHParameterSpec.getG(), null, dHParameterSpec.getL()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        e convertParams;
        if (!this.initialised) {
            Integer d11 = f.d(this.strength);
            if (params.containsKey(d11)) {
                convertParams = (e) params.get(d11);
            } else {
                DHParameterSpec dHDefaultParameters = BouncyCastleProvider.CONFIGURATION.getDHDefaultParameters(this.strength);
                if (dHDefaultParameters != null) {
                    convertParams = convertParams(this.random, dHDefaultParameters);
                } else {
                    synchronized (lock) {
                        if (params.containsKey(d11)) {
                            this.param = (e) params.get(d11);
                        } else {
                            g gVar = new g();
                            int i11 = this.strength;
                            gVar.b(i11, PrimeCertaintyCalculator.getDefaultCertainty(i11), this.random);
                            e eVar = new e(this.random, gVar.a());
                            this.param = eVar;
                            params.put(d11, eVar);
                        }
                    }
                    this.engine.a(this.param);
                    this.initialised = true;
                }
            }
            this.param = convertParams;
            this.engine.a(this.param);
            this.initialised = true;
        }
        org.bouncycastle.crypto.b generateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCDHPublicKey((u50.k) generateKeyPair.b()), new BCDHPrivateKey((j) generateKeyPair.a()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i11, SecureRandom secureRandom) {
        this.strength = i11;
        this.random = secureRandom;
        this.initialised = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (!(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec");
        }
        try {
            e convertParams = convertParams(secureRandom, (DHParameterSpec) algorithmParameterSpec);
            this.param = convertParams;
            this.engine.a(convertParams);
            this.initialised = true;
        } catch (IllegalArgumentException e11) {
            throw new InvalidAlgorithmParameterException(e11.getMessage(), e11);
        }
    }
}