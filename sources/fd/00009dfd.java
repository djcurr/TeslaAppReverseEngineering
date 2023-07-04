package org.spongycastle.jcajce.provider.asymmetric;

import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ua.UAObjectIdentifiers;
import org.spongycastle.jcajce.provider.asymmetric.dstu.KeyFactorySpi;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* loaded from: classes4.dex */
public class DSTU4145 {
    private static final String PREFIX = "org.spongycastle.jcajce.provider.asymmetric.dstu.";

    /* loaded from: classes4.dex */
    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.spongycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.DSTU4145", "org.spongycastle.jcajce.provider.asymmetric.dstu.KeyFactorySpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.DSTU-4145-2002", "DSTU4145");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.DSTU4145-3410", "DSTU4145");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = UAObjectIdentifiers.dstu4145le;
            registerOid(configurableProvider, aSN1ObjectIdentifier, "DSTU4145", new KeyFactorySpi());
            registerOidAlgorithmParameters(configurableProvider, aSN1ObjectIdentifier, "DSTU4145");
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = UAObjectIdentifiers.dstu4145be;
            registerOid(configurableProvider, aSN1ObjectIdentifier2, "DSTU4145", new KeyFactorySpi());
            registerOidAlgorithmParameters(configurableProvider, aSN1ObjectIdentifier2, "DSTU4145");
            configurableProvider.addAlgorithm("KeyPairGenerator.DSTU4145", "org.spongycastle.jcajce.provider.asymmetric.dstu.KeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.DSTU-4145", "DSTU4145");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.DSTU-4145-2002", "DSTU4145");
            configurableProvider.addAlgorithm("Signature.DSTU4145", "org.spongycastle.jcajce.provider.asymmetric.dstu.SignatureSpi");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.DSTU-4145", "DSTU4145");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.DSTU-4145-2002", "DSTU4145");
            addSignatureAlgorithm(configurableProvider, "GOST3411", "DSTU4145LE", "org.spongycastle.jcajce.provider.asymmetric.dstu.SignatureSpiLe", aSN1ObjectIdentifier);
            addSignatureAlgorithm(configurableProvider, "GOST3411", "DSTU4145", "org.spongycastle.jcajce.provider.asymmetric.dstu.SignatureSpi", aSN1ObjectIdentifier2);
        }
    }
}