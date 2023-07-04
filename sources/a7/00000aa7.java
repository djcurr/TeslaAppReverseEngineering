package atd.i0;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import javax.crypto.KeyAgreement;

/* loaded from: classes.dex */
public final class e {
    static {
        atd.s0.a.a(-794554728770112L);
        atd.s0.a.a(-794576203606592L);
    }

    public static ECPublicKey a(d dVar, BigInteger bigInteger, BigInteger bigInteger2) {
        try {
            return (ECPublicKey) KeyFactory.getInstance(atd.s0.a.a(-795336412817984L)).generatePublic(new ECPublicKeySpec(new ECPoint(bigInteger, bigInteger2), dVar.b()));
        } catch (GeneralSecurityException e11) {
            throw atd.y.c.CRYPTO_FAILURE.a(e11);
        }
    }

    public static ECPrivateKey a(d dVar, BigInteger bigInteger) {
        try {
            return (ECPrivateKey) KeyFactory.getInstance(atd.s0.a.a(-795357887654464L)).generatePrivate(new ECPrivateKeySpec(bigInteger, dVar.b()));
        } catch (GeneralSecurityException e11) {
            throw atd.y.c.CRYPTO_FAILURE.a(e11);
        }
    }

    public static KeyPair a(d dVar) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(atd.s0.a.a(-795345002752576L));
            keyPairGenerator.initialize(dVar.b(), new SecureRandom());
            return keyPairGenerator.generateKeyPair();
        } catch (GeneralSecurityException e11) {
            throw atd.y.c.CRYPTO_FAILURE.a(e11);
        }
    }

    public static byte[] a(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance(atd.s0.a.a(-794541843868224L));
            keyAgreement.init(eCPrivateKey);
            keyAgreement.doPhase(eCPublicKey, true);
            return keyAgreement.generateSecret();
        } catch (GeneralSecurityException e11) {
            throw atd.y.c.CRYPTO_FAILURE.a(e11);
        }
    }
}