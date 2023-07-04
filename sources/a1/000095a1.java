package org.bouncycastle.jcajce.provider.symmetric;

import h60.r;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import n50.a0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.crypto.x;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import q40.c;
import u50.b1;

/* loaded from: classes5.dex */
public class SCRYPT {

    /* loaded from: classes5.dex */
    public static class BasePBKDF2 extends BaseSecretKeyFactory {
        private int scheme;

        public BasePBKDF2(String str, int i11) {
            super(str, c.f47479y);
            this.scheme = i11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) {
            if (keySpec instanceof r) {
                r rVar = (r) keySpec;
                if (rVar.f() != null) {
                    if (rVar.b() > 1) {
                        if (rVar.c() > 0) {
                            if (rVar.e().length != 0) {
                                return new BCPBEKey(this.algName, new b1(a0.i(x.UTF8.convert(rVar.e()), rVar.f(), rVar.b(), rVar.a(), rVar.d(), rVar.c() / 8)));
                            }
                            throw new IllegalArgumentException("password empty");
                        }
                        throw new InvalidKeySpecException("positive key length required: " + rVar.c());
                    }
                    throw new IllegalArgumentException("Cost parameter N must be > 1.");
                }
                throw new IllegalArgumentException("Salt S must be provided.");
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    /* loaded from: classes5.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = SCRYPT.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$ScryptWithUTF8");
            configurableProvider.addAlgorithm("SecretKeyFactory.SCRYPT", sb2.toString());
            k kVar = c.f47479y;
            configurableProvider.addAlgorithm("SecretKeyFactory", kVar, str + "$ScryptWithUTF8");
        }
    }

    /* loaded from: classes5.dex */
    public static class ScryptWithUTF8 extends BasePBKDF2 {
        public ScryptWithUTF8() {
            super("SCRYPT", 5);
        }
    }

    private SCRYPT() {
    }
}