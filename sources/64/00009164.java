package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.math.BigInteger;
import org.bouncycastle.util.a;
import r70.d;
import r70.m;
import u50.i;

/* loaded from: classes5.dex */
class DHUtil {
    DHUtil() {
    }

    private static String generateKeyFingerprint(BigInteger bigInteger, i iVar) {
        return new d(a.q(bigInteger.toByteArray(), iVar.f().toByteArray(), iVar.b().toByteArray())).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String privateKeyToString(String str, BigInteger bigInteger, i iVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String d11 = m.d();
        BigInteger modPow = iVar.b().modPow(bigInteger, iVar.f());
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [");
        stringBuffer.append(generateKeyFingerprint(modPow, iVar));
        stringBuffer.append("]");
        stringBuffer.append(d11);
        stringBuffer.append("              Y: ");
        stringBuffer.append(modPow.toString(16));
        stringBuffer.append(d11);
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String publicKeyToString(String str, BigInteger bigInteger, i iVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String d11 = m.d();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [");
        stringBuffer.append(generateKeyFingerprint(bigInteger, iVar));
        stringBuffer.append("]");
        stringBuffer.append(d11);
        stringBuffer.append("             Y: ");
        stringBuffer.append(bigInteger.toString(16));
        stringBuffer.append(d11);
        return stringBuffer.toString();
    }
}