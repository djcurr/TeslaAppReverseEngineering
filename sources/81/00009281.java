package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.math.BigInteger;
import org.bouncycastle.util.a;
import r70.d;
import r70.m;
import u50.t0;

/* loaded from: classes5.dex */
class GOSTUtil {
    GOSTUtil() {
    }

    private static String generateKeyFingerprint(BigInteger bigInteger, t0 t0Var) {
        return new d(a.q(bigInteger.toByteArray(), t0Var.b().toByteArray(), t0Var.a().toByteArray())).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String privateKeyToString(String str, BigInteger bigInteger, t0 t0Var) {
        StringBuffer stringBuffer = new StringBuffer();
        String d11 = m.d();
        BigInteger modPow = t0Var.a().modPow(bigInteger, t0Var.b());
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [");
        stringBuffer.append(generateKeyFingerprint(modPow, t0Var));
        stringBuffer.append("]");
        stringBuffer.append(d11);
        stringBuffer.append("                  Y: ");
        stringBuffer.append(modPow.toString(16));
        stringBuffer.append(d11);
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String publicKeyToString(String str, BigInteger bigInteger, t0 t0Var) {
        StringBuffer stringBuffer = new StringBuffer();
        String d11 = m.d();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [");
        stringBuffer.append(generateKeyFingerprint(bigInteger, t0Var));
        stringBuffer.append("]");
        stringBuffer.append(d11);
        stringBuffer.append("                 Y: ");
        stringBuffer.append(bigInteger.toString(16));
        stringBuffer.append(d11);
        return stringBuffer.toString();
    }
}