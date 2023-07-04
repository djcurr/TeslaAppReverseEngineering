package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import f50.n;
import g50.g;
import h60.u;
import i50.f;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import k60.c;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import u50.b;
import u50.d0;
import u50.i1;
import u50.y;

/* loaded from: classes5.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private static final n converter = new n();
    private g agreement;
    private String kaAlgorithm;
    private y parameters;
    private byte[] result;

    /* loaded from: classes5.dex */
    public static class ECVKO256 extends KeyAgreementSpi {
        public ECVKO256() {
            super("ECGOST3410-2012-256", new g(new f()), null);
        }
    }

    /* loaded from: classes5.dex */
    public static class ECVKO512 extends KeyAgreementSpi {
        public ECVKO512() {
            super("ECGOST3410-2012-512", new g(new f()), null);
        }
    }

    protected KeyAgreementSpi(String str, g gVar, org.bouncycastle.crypto.n nVar) {
        super(str, nVar);
        this.kaAlgorithm = str;
        this.agreement = gVar;
    }

    static b generatePublicKeyParameter(PublicKey publicKey) {
        return publicKey instanceof BCECGOST3410_2012PublicKey ? ((BCECGOST3410_2012PublicKey) publicKey).engineGetKeyParameters() : ECUtil.generatePublicKeyParameter(publicKey);
    }

    private static String getSimpleName(Class cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    private void initFromKey(Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        if (key instanceof PrivateKey) {
            d0 d0Var = (d0) ECUtil.generatePrivateKeyParameter((PrivateKey) key);
            this.parameters = d0Var.b();
            byte[] a11 = algorithmParameterSpec instanceof u ? ((u) algorithmParameterSpec).a() : null;
            this.ukmParameters = a11;
            this.agreement.c(new i1(d0Var, a11));
            return;
        }
        throw new InvalidKeyException(this.kaAlgorithm + " key agreement requires " + getSimpleName(k60.b.class) + " for initialisation");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    protected byte[] calcSecret() {
        return this.result;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key, boolean z11) {
        if (this.parameters == null) {
            throw new IllegalStateException(this.kaAlgorithm + " not initialised.");
        } else if (!z11) {
            throw new IllegalStateException(this.kaAlgorithm + " can only be between two parties.");
        } else if (!(key instanceof PublicKey)) {
            throw new InvalidKeyException(this.kaAlgorithm + " key agreement requires " + getSimpleName(c.class) + " for doPhase");
        } else {
            try {
                this.result = this.agreement.a(generatePublicKeyParameter((PublicKey) key));
                return null;
            } catch (Exception e11) {
                throw new InvalidKeyException("calculation failed: " + e11.getMessage()) { // from class: org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyAgreementSpi.1
                    @Override // java.lang.Throwable
                    public Throwable getCause() {
                        return e11;
                    }
                };
            }
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, SecureRandom secureRandom) {
        initFromKey(key, null);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof u)) {
            throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
        }
        initFromKey(key, algorithmParameterSpec);
    }
}