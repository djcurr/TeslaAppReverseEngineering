package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import e50.m0;
import h60.m;
import h60.n;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import u50.b;
import u50.r;
import u50.s;
import u50.t;
import w40.p;
import z50.c;

/* loaded from: classes5.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof DSAPrivateKeySpec) {
            return new BCDSAPrivateKey((DSAPrivateKeySpec) keySpec);
        }
        if (keySpec instanceof m) {
            b c11 = z50.b.c(((m) keySpec).getEncoded());
            if (c11 instanceof s) {
                s sVar = (s) c11;
                return engineGeneratePrivate(new DSAPrivateKeySpec(sVar.c(), sVar.b().b(), sVar.b().c(), sVar.b().a()));
            }
            throw new IllegalArgumentException("openssh private key is not dsa privare key");
        }
        return super.engineGeneratePrivate(keySpec);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof DSAPublicKeySpec) {
            try {
                return new BCDSAPublicKey((DSAPublicKeySpec) keySpec);
            } catch (Exception e11) {
                throw new InvalidKeySpecException("invalid KeySpec: " + e11.getMessage()) { // from class: org.bouncycastle.jcajce.provider.asymmetric.dsa.KeyFactorySpi.1
                    @Override // java.lang.Throwable
                    public Throwable getCause() {
                        return e11;
                    }
                };
            }
        } else if (keySpec instanceof n) {
            b c11 = c.c(((n) keySpec).getEncoded());
            if (c11 instanceof t) {
                t tVar = (t) c11;
                return engineGeneratePublic(new DSAPublicKeySpec(tVar.c(), tVar.b().b(), tVar.b().c(), tVar.b().a()));
            }
            throw new IllegalArgumentException("openssh public key is not dsa public key");
        } else {
            return super.engineGeneratePublic(keySpec);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(DSAPublicKeySpec.class) && (key instanceof DSAPublicKey)) {
            DSAPublicKey dSAPublicKey = (DSAPublicKey) key;
            return new DSAPublicKeySpec(dSAPublicKey.getY(), dSAPublicKey.getParams().getP(), dSAPublicKey.getParams().getQ(), dSAPublicKey.getParams().getG());
        } else if (cls.isAssignableFrom(DSAPrivateKeySpec.class) && (key instanceof DSAPrivateKey)) {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) key;
            return new DSAPrivateKeySpec(dSAPrivateKey.getX(), dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG());
        } else if (cls.isAssignableFrom(n.class) && (key instanceof DSAPublicKey)) {
            DSAPublicKey dSAPublicKey2 = (DSAPublicKey) key;
            try {
                return new n(c.a(new t(dSAPublicKey2.getY(), new r(dSAPublicKey2.getParams().getP(), dSAPublicKey2.getParams().getQ(), dSAPublicKey2.getParams().getG()))));
            } catch (IOException e11) {
                throw new IllegalArgumentException("unable to produce encoding: " + e11.getMessage());
            }
        } else if (cls.isAssignableFrom(m.class) && (key instanceof DSAPrivateKey)) {
            DSAPrivateKey dSAPrivateKey2 = (DSAPrivateKey) key;
            try {
                return new m(z50.b.b(new s(dSAPrivateKey2.getX(), new r(dSAPrivateKey2.getParams().getP(), dSAPrivateKey2.getParams().getQ(), dSAPrivateKey2.getParams().getG()))));
            } catch (IOException e12) {
                throw new IllegalArgumentException("unable to produce encoding: " + e12.getMessage());
            }
        } else {
            return super.engineGetKeySpec(key, cls);
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) {
        if (key instanceof DSAPublicKey) {
            return new BCDSAPublicKey((DSAPublicKey) key);
        }
        if (key instanceof DSAPrivateKey) {
            return new BCDSAPrivateKey((DSAPrivateKey) key);
        }
        throw new InvalidKeyException("key type unknown");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(p pVar) {
        k e11 = pVar.i().e();
        if (DSAUtil.isDsaOid(e11)) {
            return new BCDSAPrivateKey(pVar);
        }
        throw new IOException("algorithm identifier " + e11 + " in key not recognised");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(m0 m0Var) {
        k e11 = m0Var.e().e();
        if (DSAUtil.isDsaOid(e11)) {
            return new BCDSAPublicKey(m0Var);
        }
        throw new IOException("algorithm identifier " + e11 + " in key not recognised");
    }
}