package atd.i0;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* loaded from: classes.dex */
public final class g {
    static {
        atd.s0.a.a(-791788769831488L);
    }

    public static RSAPrivateKey a(BigInteger bigInteger, BigInteger bigInteger2) {
        try {
            return (RSAPrivateKey) KeyFactory.getInstance(atd.s0.a.a(-792579043813952L)).generatePrivate(new RSAPrivateKeySpec(bigInteger, bigInteger2));
        } catch (GeneralSecurityException e11) {
            throw atd.y.c.CRYPTO_FAILURE.a(e11);
        }
    }

    public static RSAPublicKey b(BigInteger bigInteger, BigInteger bigInteger2) {
        try {
            return (RSAPublicKey) KeyFactory.getInstance(atd.s0.a.a(-792561863944768L)).generatePublic(new RSAPublicKeySpec(bigInteger, bigInteger2));
        } catch (GeneralSecurityException e11) {
            throw atd.y.c.CRYPTO_FAILURE.a(e11);
        }
    }
}