package org.bouncycastle.jcajce.provider.asymmetric.gost;

import i40.a;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import l60.l;
import l60.n;
import n50.r;
import org.bouncycastle.crypto.b;
import org.bouncycastle.crypto.k;
import u50.r0;
import u50.t0;
import u50.u0;
import u50.v0;

/* loaded from: classes5.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    r engine;
    l gost3410Params;
    boolean initialised;
    r0 param;
    SecureRandom random;
    int strength;

    public KeyPairGeneratorSpi() {
        super("GOST3410");
        this.engine = new r();
        this.strength = 1024;
        this.random = null;
        this.initialised = false;
    }

    private void init(l lVar, SecureRandom secureRandom) {
        n publicKeyParameters = lVar.getPublicKeyParameters();
        r0 r0Var = new r0(secureRandom, new t0(publicKeyParameters.b(), publicKeyParameters.c(), publicKeyParameters.a()));
        this.param = r0Var;
        this.engine.a(r0Var);
        this.initialised = true;
        this.gost3410Params = lVar;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            init(new l(a.f29854q.t()), k.b());
        }
        b generateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCGOST3410PublicKey((v0) generateKeyPair.b(), this.gost3410Params), new BCGOST3410PrivateKey((u0) generateKeyPair.a(), this.gost3410Params));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i11, SecureRandom secureRandom) {
        this.strength = i11;
        this.random = secureRandom;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (!(algorithmParameterSpec instanceof l)) {
            throw new InvalidAlgorithmParameterException("parameter object not a GOST3410ParameterSpec");
        }
        init((l) algorithmParameterSpec, secureRandom);
    }
}