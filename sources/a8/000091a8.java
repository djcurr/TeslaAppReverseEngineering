package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import i50.x;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.util.Hashtable;
import n50.i;
import n50.j;
import org.bouncycastle.crypto.b;
import org.bouncycastle.crypto.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import r70.f;
import u50.o;
import u50.q;
import u50.r;
import u50.s;
import u50.t;

/* loaded from: classes5.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    i engine;
    boolean initialised;
    o param;
    SecureRandom random;
    int strength;
    private static Hashtable params = new Hashtable();
    private static Object lock = new Object();

    public KeyPairGeneratorSpi() {
        super("DSA");
        this.engine = new i();
        this.strength = 2048;
        this.random = k.b();
        this.initialised = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        j jVar;
        int i11;
        SecureRandom secureRandom;
        if (!this.initialised) {
            Integer d11 = f.d(this.strength);
            if (params.containsKey(d11)) {
                this.param = (o) params.get(d11);
            } else {
                synchronized (lock) {
                    if (params.containsKey(d11)) {
                        this.param = (o) params.get(d11);
                    } else {
                        int defaultCertainty = PrimeCertaintyCalculator.getDefaultCertainty(this.strength);
                        int i12 = this.strength;
                        if (i12 == 1024) {
                            jVar = new j();
                            if (r70.j.c("org.bouncycastle.dsa.FIPS186-2for1024bits")) {
                                i11 = this.strength;
                                secureRandom = this.random;
                                jVar.k(i11, defaultCertainty, secureRandom);
                                o oVar = new o(this.random, jVar.d());
                                this.param = oVar;
                                params.put(d11, oVar);
                            } else {
                                jVar.l(new q(1024, 160, defaultCertainty, this.random));
                                o oVar2 = new o(this.random, jVar.d());
                                this.param = oVar2;
                                params.put(d11, oVar2);
                            }
                        } else if (i12 > 1024) {
                            q qVar = new q(i12, 256, defaultCertainty, this.random);
                            jVar = new j(new x());
                            jVar.l(qVar);
                            o oVar22 = new o(this.random, jVar.d());
                            this.param = oVar22;
                            params.put(d11, oVar22);
                        } else {
                            jVar = new j();
                            i11 = this.strength;
                            secureRandom = this.random;
                            jVar.k(i11, defaultCertainty, secureRandom);
                            o oVar222 = new o(this.random, jVar.d());
                            this.param = oVar222;
                            params.put(d11, oVar222);
                        }
                    }
                }
            }
            this.engine.c(this.param);
            this.initialised = true;
        }
        b generateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCDSAPublicKey((t) generateKeyPair.b()), new BCDSAPrivateKey((s) generateKeyPair.a()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i11, SecureRandom secureRandom) {
        boolean z11;
        if (i11 < 512 || i11 > 4096 || ((i11 < 1024 && i11 % 64 != 0) || (i11 >= 1024 && i11 % 1024 != 0))) {
            throw new InvalidParameterException("strength must be from 512 - 4096 and a multiple of 1024 above 1024");
        }
        DSAParameterSpec dSADefaultParameters = BouncyCastleProvider.CONFIGURATION.getDSADefaultParameters(i11);
        if (dSADefaultParameters != null) {
            o oVar = new o(secureRandom, new r(dSADefaultParameters.getP(), dSADefaultParameters.getQ(), dSADefaultParameters.getG()));
            this.param = oVar;
            this.engine.c(oVar);
            z11 = true;
        } else {
            this.strength = i11;
            this.random = secureRandom;
            z11 = false;
        }
        this.initialised = z11;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (!(algorithmParameterSpec instanceof DSAParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a DSAParameterSpec");
        }
        DSAParameterSpec dSAParameterSpec = (DSAParameterSpec) algorithmParameterSpec;
        o oVar = new o(secureRandom, new r(dSAParameterSpec.getP(), dSAParameterSpec.getQ(), dSAParameterSpec.getG()));
        this.param = oVar;
        this.engine.c(oVar);
        this.initialised = true;
    }
}