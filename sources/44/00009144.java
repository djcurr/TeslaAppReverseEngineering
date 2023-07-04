package org.bouncycastle.jcajce.provider.asymmetric;

import e50.m0;
import e60.d;
import e60.e;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import q40.c;
import w40.p;

/* loaded from: classes5.dex */
public class COMPOSITE {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE";
    private static AsymmetricKeyInfoConverter baseConverter;
    private static final Map<String, String> compositeAttributes;

    /* loaded from: classes5.dex */
    private static class CompositeKeyInfoConverter implements AsymmetricKeyInfoConverter {
        private final ConfigurableProvider provider;

        public CompositeKeyInfoConverter(ConfigurableProvider configurableProvider) {
            this.provider = configurableProvider;
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PrivateKey generatePrivate(p pVar) {
            org.bouncycastle.asn1.p p11 = org.bouncycastle.asn1.p.p(pVar.h().r());
            PrivateKey[] privateKeyArr = new PrivateKey[p11.size()];
            for (int i11 = 0; i11 != p11.size(); i11++) {
                p f11 = p.f(p11.r(i11));
                privateKeyArr[i11] = this.provider.getKeyInfoConverter(f11.i().e()).generatePrivate(f11);
            }
            return new d(privateKeyArr);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PublicKey generatePublic(m0 m0Var) {
            org.bouncycastle.asn1.p p11 = org.bouncycastle.asn1.p.p(m0Var.i().q());
            PublicKey[] publicKeyArr = new PublicKey[p11.size()];
            for (int i11 = 0; i11 != p11.size(); i11++) {
                m0 h11 = m0.h(p11.r(i11));
                publicKeyArr[i11] = this.provider.getKeyInfoConverter(h11.e().e()).generatePublic(h11);
            }
            return new e(publicKeyArr);
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyFactory extends BaseKeyFactorySpi {
        @Override // java.security.KeyFactorySpi
        protected Key engineTranslateKey(Key key) {
            try {
                if (key instanceof PrivateKey) {
                    return generatePrivate(p.f(key.getEncoded()));
                }
                if (key instanceof PublicKey) {
                    return generatePublic(m0.h(key.getEncoded()));
                }
                throw new InvalidKeyException("key not recognized");
            } catch (IOException e11) {
                throw new InvalidKeyException("key could not be parsed: " + e11.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PrivateKey generatePrivate(p pVar) {
            return COMPOSITE.baseConverter.generatePrivate(pVar);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PublicKey generatePublic(m0 m0Var) {
            return COMPOSITE.baseConverter.generatePublic(m0Var);
        }
    }

    /* loaded from: classes5.dex */
    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.COMPOSITE", "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("KeyFactory.");
            k kVar = c.f47480z;
            sb2.append(kVar);
            configurableProvider.addAlgorithm(sb2.toString(), "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory");
            configurableProvider.addAlgorithm("KeyFactory.OID." + kVar, "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory");
            AsymmetricKeyInfoConverter unused = COMPOSITE.baseConverter = new CompositeKeyInfoConverter(configurableProvider);
            configurableProvider.addKeyInfoConverter(kVar, COMPOSITE.baseConverter);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        compositeAttributes = hashMap;
        hashMap.put("SupportedKeyClasses", "org.bouncycastle.jcajce.CompositePublicKey|org.bouncycastle.jcajce.CompositePrivateKey");
        hashMap.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}