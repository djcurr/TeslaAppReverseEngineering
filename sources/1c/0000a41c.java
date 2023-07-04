package org.spongycastle.pqc.jcajce.provider;

import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.spongycastle.pqc.asn1.PQCObjectIdentifiers;
import org.spongycastle.pqc.jcajce.provider.newhope.NHKeyFactorySpi;

/* loaded from: classes4.dex */
public class NH {
    private static final String PREFIX = "org.spongycastle.pqc.jcajce.provider.newhope.";

    /* loaded from: classes4.dex */
    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.spongycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.NH", "org.spongycastle.pqc.jcajce.provider.newhope.NHKeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.NH", "org.spongycastle.pqc.jcajce.provider.newhope.NHKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("KeyAgreement.NH", "org.spongycastle.pqc.jcajce.provider.newhope.KeyAgreementSpi");
            NHKeyFactorySpi nHKeyFactorySpi = new NHKeyFactorySpi();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PQCObjectIdentifiers.newHope;
            registerOid(configurableProvider, aSN1ObjectIdentifier, "NH", nHKeyFactorySpi);
            registerOidAlgorithmParameters(configurableProvider, aSN1ObjectIdentifier, "NH");
        }
    }
}