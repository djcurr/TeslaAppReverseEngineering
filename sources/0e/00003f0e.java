package com.nimbusds.jose.crypto.impl;

import java.security.AlgorithmParameters;
import java.security.Provider;

/* loaded from: classes2.dex */
public class d {
    public static AlgorithmParameters a(String str, Provider provider) {
        if (provider == null) {
            return AlgorithmParameters.getInstance(str);
        }
        return AlgorithmParameters.getInstance(str, provider);
    }
}