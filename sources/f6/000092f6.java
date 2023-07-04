package org.bouncycastle.jcajce.provider.asymmetric.util;

import l60.p;
import org.bouncycastle.crypto.e;
import org.bouncycastle.crypto.f;

/* loaded from: classes5.dex */
public class IESUtil {
    public static p guessParameterSpec(f fVar, byte[] bArr) {
        if (fVar == null) {
            return new p(null, null, 128);
        }
        e d11 = fVar.d();
        return (d11.getAlgorithmName().equals("DES") || d11.getAlgorithmName().equals("RC2") || d11.getAlgorithmName().equals("RC5-32") || d11.getAlgorithmName().equals("RC5-64")) ? new p(null, null, 64, 64, bArr) : d11.getAlgorithmName().equals("SKIPJACK") ? new p(null, null, 80, 80, bArr) : d11.getAlgorithmName().equals("GOST28147") ? new p(null, null, 256, 256, bArr) : new p(null, null, 128, 128, bArr);
    }
}