package org.spongycastle.jce.spec;

import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes4.dex */
public class ElGamalGenParameterSpec implements AlgorithmParameterSpec {
    private int primeSize;

    public ElGamalGenParameterSpec(int i11) {
        this.primeSize = i11;
    }

    public int getPrimeSize() {
        return this.primeSize;
    }
}