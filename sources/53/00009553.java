package org.bouncycastle.jcajce.provider.symmetric;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import n50.u;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import r70.m;
import u50.b1;

/* loaded from: classes5.dex */
public final class OpenSSLPBKDF {

    /* loaded from: classes5.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = OpenSSLPBKDF.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("SecretKeyFactory.PBKDF-OPENSSL", PREFIX + "$PBKDF");
        }
    }

    /* loaded from: classes5.dex */
    public static class PBKDF extends BaseSecretKeyFactory {
        public PBKDF() {
            super("PBKDF-OpenSSL", null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) {
            if (keySpec instanceof PBEKeySpec) {
                PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
                if (pBEKeySpec.getSalt() != null) {
                    if (pBEKeySpec.getIterationCount() <= 0) {
                        throw new InvalidKeySpecException("positive iteration count required: " + pBEKeySpec.getIterationCount());
                    } else if (pBEKeySpec.getKeyLength() <= 0) {
                        throw new InvalidKeySpecException("positive key length required: " + pBEKeySpec.getKeyLength());
                    } else if (pBEKeySpec.getPassword().length != 0) {
                        u uVar = new u();
                        uVar.b(m.j(pBEKeySpec.getPassword()), pBEKeySpec.getSalt());
                        return new SecretKeySpec(((b1) uVar.generateDerivedParameters(pBEKeySpec.getKeyLength())).a(), "OpenSSLPBKDF");
                    } else {
                        throw new IllegalArgumentException("password empty");
                    }
                }
                throw new InvalidKeySpecException("missing required salt");
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    private OpenSSLPBKDF() {
    }
}