package org.bouncycastle.jcajce.provider.asymmetric.x509;

import e50.m0;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import w40.p;

/* loaded from: classes5.dex */
public class KeyFactory extends KeyFactorySpi {
    @Override // java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unknown KeySpec type: " + keySpec.getClass().getName());
        }
        try {
            p f11 = p.f(((PKCS8EncodedKeySpec) keySpec).getEncoded());
            PrivateKey privateKey = BouncyCastleProvider.getPrivateKey(f11);
            if (privateKey != null) {
                return privateKey;
            }
            throw new InvalidKeySpecException("no factory found for OID: " + f11.i().e());
        } catch (Exception e11) {
            throw new InvalidKeySpecException(e11.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unknown KeySpec type: " + keySpec.getClass().getName());
        }
        try {
            m0 h11 = m0.h(((X509EncodedKeySpec) keySpec).getEncoded());
            PublicKey publicKey = BouncyCastleProvider.getPublicKey(h11);
            if (publicKey != null) {
                return publicKey;
            }
            throw new InvalidKeySpecException("no factory found for OID: " + h11.e().e());
        } catch (Exception e11) {
            throw new InvalidKeySpecException(e11.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(PKCS8EncodedKeySpec.class) && key.getFormat().equals("PKCS#8")) {
            return new PKCS8EncodedKeySpec(key.getEncoded());
        }
        if (cls.isAssignableFrom(X509EncodedKeySpec.class) && key.getFormat().equals("X.509")) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        throw new InvalidKeySpecException("not implemented yet " + key + " " + cls);
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) {
        throw new InvalidKeyException("not implemented yet " + key);
    }
}