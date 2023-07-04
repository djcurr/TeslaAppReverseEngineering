package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import e50.y0;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import org.bouncycastle.asn1.k;
import r70.d;
import u50.n1;
import u50.o1;
import w40.n;

/* loaded from: classes5.dex */
public class RSAUtil {
    public static final k[] rsaOids = {n.f55541n1, y0.N, n.f55551t1, n.f55557w1};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String generateExponentFingerprint(BigInteger bigInteger) {
        return new d(bigInteger.toByteArray(), 32).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String generateKeyFingerprint(BigInteger bigInteger) {
        return new d(bigInteger.toByteArray()).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n1 generatePrivateKeyParameter(RSAPrivateKey rSAPrivateKey) {
        if (rSAPrivateKey instanceof BCRSAPrivateKey) {
            return ((BCRSAPrivateKey) rSAPrivateKey).engineGetKeyParameters();
        }
        if (rSAPrivateKey instanceof RSAPrivateCrtKey) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) rSAPrivateKey;
            return new o1(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
        }
        return new n1(true, rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n1 generatePublicKeyParameter(RSAPublicKey rSAPublicKey) {
        return rSAPublicKey instanceof BCRSAPublicKey ? ((BCRSAPublicKey) rSAPublicKey).engineGetKeyParameters() : new n1(false, rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
    }

    public static boolean isRsaOid(k kVar) {
        int i11 = 0;
        while (true) {
            k[] kVarArr = rsaOids;
            if (i11 == kVarArr.length) {
                return false;
            }
            if (kVar.j(kVarArr[i11])) {
                return true;
            }
            i11++;
        }
    }
}