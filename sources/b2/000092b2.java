package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import e50.b;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import n50.z;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.crypto.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import u50.m1;
import u50.n1;
import u50.o1;
import w40.n;

/* loaded from: classes5.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    private static final b PKCS_ALGID = new b(n.f55541n1, q0.f43085a);
    private static final b PSS_ALGID = new b(n.f55557w1);
    static final BigInteger defaultPublicExponent = BigInteger.valueOf(65537);
    b algId;
    z engine;
    m1 param;

    /* loaded from: classes5.dex */
    public static class PSS extends KeyPairGeneratorSpi {
        public PSS() {
            super("RSASSA-PSS", KeyPairGeneratorSpi.PSS_ALGID);
        }
    }

    public KeyPairGeneratorSpi() {
        this("RSA", PKCS_ALGID);
    }

    public KeyPairGeneratorSpi(String str, b bVar) {
        super(str);
        this.algId = bVar;
        this.engine = new z();
        m1 m1Var = new m1(defaultPublicExponent, k.b(), 2048, PrimeCertaintyCalculator.getDefaultCertainty(2048));
        this.param = m1Var;
        this.engine.c(m1Var);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        org.bouncycastle.crypto.b generateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCRSAPublicKey(this.algId, (n1) generateKeyPair.b()), new BCRSAPrivateCrtKey(this.algId, (o1) generateKeyPair.a()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i11, SecureRandom secureRandom) {
        m1 m1Var = new m1(defaultPublicExponent, secureRandom, i11, PrimeCertaintyCalculator.getDefaultCertainty(i11));
        this.param = m1Var;
        this.engine.c(m1Var);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (!(algorithmParameterSpec instanceof RSAKeyGenParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a RSAKeyGenParameterSpec");
        }
        RSAKeyGenParameterSpec rSAKeyGenParameterSpec = (RSAKeyGenParameterSpec) algorithmParameterSpec;
        m1 m1Var = new m1(rSAKeyGenParameterSpec.getPublicExponent(), secureRandom, rSAKeyGenParameterSpec.getKeysize(), PrimeCertaintyCalculator.getDefaultCertainty(2048));
        this.param = m1Var;
        this.engine.c(m1Var);
    }
}