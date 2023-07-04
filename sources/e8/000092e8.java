package org.bouncycastle.jcajce.provider.asymmetric.util;

import i60.a;
import i60.c;
import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;

/* loaded from: classes5.dex */
public abstract class BaseAlgorithmParameterGeneratorSpi extends AlgorithmParameterGeneratorSpi {
    private final c helper = new a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final AlgorithmParameters createParametersInstance(String str) {
        return this.helper.createAlgorithmParameters(str);
    }
}