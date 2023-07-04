package org.bouncycastle.jcajce.provider.asymmetric.util;

import e50.m0;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import w40.p;

/* loaded from: classes5.dex */
public abstract class BaseKeyFactorySpi extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return generatePrivate(p.f(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e11) {
                throw new InvalidKeySpecException("encoded key spec not recognized: " + e11.getMessage());
            }
        }
        throw new InvalidKeySpecException("key spec not recognized");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return generatePublic(m0.h(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e11) {
                throw new InvalidKeySpecException("encoded key spec not recognized: " + e11.getMessage());
            }
        }
        throw new InvalidKeySpecException("key spec not recognized");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(PKCS8EncodedKeySpec.class) && key.getFormat().equals("PKCS#8")) {
            return new PKCS8EncodedKeySpec(key.getEncoded());
        }
        if (cls.isAssignableFrom(X509EncodedKeySpec.class) && key.getFormat().equals("X.509")) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        throw new InvalidKeySpecException("not implemented yet " + key + " " + cls);
    }
}