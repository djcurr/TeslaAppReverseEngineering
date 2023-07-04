package i60;

import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;

/* loaded from: classes5.dex */
public interface c {
    MessageDigest a(String str);

    AlgorithmParameters createAlgorithmParameters(String str);

    CertificateFactory createCertificateFactory(String str);

    Cipher createCipher(String str);

    KeyFactory createKeyFactory(String str);

    Mac createMac(String str);

    SecretKeyFactory createSecretKeyFactory(String str);

    SecureRandom createSecureRandom(String str);

    Signature createSignature(String str);
}