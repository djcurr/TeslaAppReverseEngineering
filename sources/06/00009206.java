package org.bouncycastle.jcajce.provider.asymmetric.ec;

import e50.b;
import e50.m0;
import f50.o;
import h60.m;
import h60.n;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import l60.e;
import l60.f;
import l60.g;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import u50.e0;
import u50.y;
import w40.p;
import y40.a;
import z50.c;

/* loaded from: classes5.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    String algorithm;
    ProviderConfiguration configuration;

    /* loaded from: classes5.dex */
    public static class EC extends KeyFactorySpi {
        public EC() {
            super("EC", BouncyCastleProvider.CONFIGURATION);
        }
    }

    /* loaded from: classes5.dex */
    public static class ECDH extends KeyFactorySpi {
        public ECDH() {
            super("ECDH", BouncyCastleProvider.CONFIGURATION);
        }
    }

    /* loaded from: classes5.dex */
    public static class ECDHC extends KeyFactorySpi {
        public ECDHC() {
            super("ECDHC", BouncyCastleProvider.CONFIGURATION);
        }
    }

    /* loaded from: classes5.dex */
    public static class ECDSA extends KeyFactorySpi {
        public ECDSA() {
            super("ECDSA", BouncyCastleProvider.CONFIGURATION);
        }
    }

    /* loaded from: classes5.dex */
    public static class ECGOST3410 extends KeyFactorySpi {
        public ECGOST3410() {
            super("ECGOST3410", BouncyCastleProvider.CONFIGURATION);
        }
    }

    /* loaded from: classes5.dex */
    public static class ECGOST3410_2012 extends KeyFactorySpi {
        public ECGOST3410_2012() {
            super("ECGOST3410-2012", BouncyCastleProvider.CONFIGURATION);
        }
    }

    /* loaded from: classes5.dex */
    public static class ECMQV extends KeyFactorySpi {
        public ECMQV() {
            super("ECMQV", BouncyCastleProvider.CONFIGURATION);
        }
    }

    KeyFactorySpi(String str, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        this.configuration = providerConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof f) {
            return new BCECPrivateKey(this.algorithm, (f) keySpec, this.configuration);
        }
        if (keySpec instanceof ECPrivateKeySpec) {
            return new BCECPrivateKey(this.algorithm, (ECPrivateKeySpec) keySpec, this.configuration);
        }
        if (keySpec instanceof m) {
            a e11 = a.e(((m) keySpec).getEncoded());
            try {
                return new BCECPrivateKey(this.algorithm, new p(new b(o.f25891h0, e11.i()), e11), this.configuration);
            } catch (IOException e12) {
                throw new InvalidKeySpecException("bad encoding: " + e12.getMessage());
            }
        }
        return super.engineGeneratePrivate(keySpec);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        try {
            if (keySpec instanceof g) {
                return new BCECPublicKey(this.algorithm, (g) keySpec, this.configuration);
            }
            if (keySpec instanceof ECPublicKeySpec) {
                return new BCECPublicKey(this.algorithm, (ECPublicKeySpec) keySpec, this.configuration);
            }
            if (keySpec instanceof n) {
                u50.b c11 = c.c(((n) keySpec).getEncoded());
                if (c11 instanceof e0) {
                    y b11 = ((e0) c11).b();
                    return engineGeneratePublic(new g(((e0) c11).c(), new e(b11.a(), b11.b(), b11.e(), b11.c(), b11.f())));
                }
                throw new IllegalArgumentException("openssh key is not ec public key");
            }
            return super.engineGeneratePublic(keySpec);
        } catch (Exception e11) {
            throw new InvalidKeySpecException("invalid KeySpec: " + e11.getMessage(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        if ((cls.isAssignableFrom(KeySpec.class) || cls.isAssignableFrom(ECPublicKeySpec.class)) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey = (ECPublicKey) key;
            if (eCPublicKey.getParams() != null) {
                return new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            }
            e ecImplicitlyCa = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            return new ECPublicKeySpec(eCPublicKey.getW(), EC5Util.convertSpec(EC5Util.convertCurve(ecImplicitlyCa.a(), ecImplicitlyCa.e()), ecImplicitlyCa));
        } else if ((cls.isAssignableFrom(KeySpec.class) || cls.isAssignableFrom(ECPrivateKeySpec.class)) && (key instanceof ECPrivateKey)) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) key;
            if (eCPrivateKey.getParams() != null) {
                return new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
            }
            e ecImplicitlyCa2 = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            return new ECPrivateKeySpec(eCPrivateKey.getS(), EC5Util.convertSpec(EC5Util.convertCurve(ecImplicitlyCa2.a(), ecImplicitlyCa2.e()), ecImplicitlyCa2));
        } else if (cls.isAssignableFrom(g.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey2 = (ECPublicKey) key;
            if (eCPublicKey2.getParams() != null) {
                return new g(EC5Util.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), EC5Util.convertSpec(eCPublicKey2.getParams()));
            }
            return new g(EC5Util.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
        } else if (cls.isAssignableFrom(f.class) && (key instanceof ECPrivateKey)) {
            ECPrivateKey eCPrivateKey2 = (ECPrivateKey) key;
            if (eCPrivateKey2.getParams() != null) {
                return new f(eCPrivateKey2.getS(), EC5Util.convertSpec(eCPrivateKey2.getParams()));
            }
            return new f(eCPrivateKey2.getS(), BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
        } else if (cls.isAssignableFrom(n.class) && (key instanceof ECPublicKey)) {
            if (!(key instanceof BCECPublicKey)) {
                throw new IllegalArgumentException("invalid key type: " + key.getClass().getName());
            }
            BCECPublicKey bCECPublicKey = (BCECPublicKey) key;
            e parameters = bCECPublicKey.getParameters();
            try {
                return new n(c.a(new e0(bCECPublicKey.getQ(), new y(parameters.a(), parameters.b(), parameters.d(), parameters.c(), parameters.e()))));
            } catch (IOException e11) {
                throw new IllegalArgumentException("unable to produce encoding: " + e11.getMessage());
            }
        } else if (cls.isAssignableFrom(m.class) && (key instanceof ECPrivateKey)) {
            if (!(key instanceof BCECPrivateKey)) {
                throw new IllegalArgumentException("invalid key type: " + key.getClass().getName());
            }
            try {
                return new m(p.f(key.getEncoded()).n().toASN1Primitive().getEncoded());
            } catch (IOException e12) {
                throw new IllegalArgumentException("cannot encoded key: " + e12.getMessage());
            }
        } else {
            return super.engineGetKeySpec(key, cls);
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) {
        if (key instanceof ECPublicKey) {
            return new BCECPublicKey((ECPublicKey) key, this.configuration);
        }
        if (key instanceof ECPrivateKey) {
            return new BCECPrivateKey((ECPrivateKey) key, this.configuration);
        }
        throw new InvalidKeyException("key type unknown");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(p pVar) {
        k e11 = pVar.i().e();
        if (e11.j(o.f25891h0)) {
            return new BCECPrivateKey(this.algorithm, pVar, this.configuration);
        }
        throw new IOException("algorithm identifier " + e11 + " in key not recognised");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(m0 m0Var) {
        k e11 = m0Var.e().e();
        if (e11.j(o.f25891h0)) {
            return new BCECPublicKey(this.algorithm, m0Var, this.configuration);
        }
        throw new IOException("algorithm identifier " + e11 + " in key not recognised");
    }
}