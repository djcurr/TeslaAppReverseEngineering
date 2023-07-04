package org.bouncycastle.jcajce.provider.util;

import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* loaded from: classes5.dex */
public abstract class AsymmetricAlgorithmProvider extends AlgorithmProvider {
    /* JADX INFO: Access modifiers changed from: protected */
    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        addSignatureAlgorithm(configurableProvider, str, str2, str3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3, k kVar) {
        String str4 = str + "WITH" + str2;
        String str5 = str + "with" + str2;
        String str6 = str + "With" + str2;
        configurableProvider.addAlgorithm("Signature." + str4, str3);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + str5, str4);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + str6, str4);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + (str + "/" + str2), str4);
        if (kVar != null) {
            configurableProvider.addAlgorithm("Alg.Alias.Signature." + kVar, str4);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.OID." + kVar, str4);
        }
    }

    protected void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, k kVar) {
        configurableProvider.addAlgorithm("Signature." + str, str2);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + kVar, str);
        configurableProvider.addAlgorithm("Alg.Alias.Signature.OID." + kVar, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void registerOid(ConfigurableProvider configurableProvider, k kVar, String str, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + kVar, str);
        configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator." + kVar, str);
        configurableProvider.addKeyInfoConverter(kVar, asymmetricKeyInfoConverter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void registerOidAlgorithmParameterGenerator(ConfigurableProvider configurableProvider, k kVar, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar, str);
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + kVar, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void registerOidAlgorithmParameters(ConfigurableProvider configurableProvider, k kVar, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + kVar, str);
    }
}