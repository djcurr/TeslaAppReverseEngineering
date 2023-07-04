package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: classes5.dex */
abstract class DigestAlgorithmProvider extends AlgorithmProvider {
    /* JADX INFO: Access modifiers changed from: protected */
    public void addHMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String str4 = "HMAC" + str;
        configurableProvider.addAlgorithm("Mac." + str4, str2);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC-" + str, str4);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC/" + str, str4);
        configurableProvider.addAlgorithm("KeyGenerator." + str4, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC-" + str, str4);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC/" + str, str4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addHMACAlias(ConfigurableProvider configurableProvider, String str, k kVar) {
        String str2 = "HMAC" + str;
        configurableProvider.addAlgorithm("Alg.Alias.Mac." + kVar, str2);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + kVar, str2);
    }
}