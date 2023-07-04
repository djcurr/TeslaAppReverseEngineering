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
public class b implements c {
    @Override // i60.c
    public MessageDigest a(String str) {
        return MessageDigest.getInstance(str);
    }

    @Override // i60.c
    public AlgorithmParameters createAlgorithmParameters(String str) {
        return AlgorithmParameters.getInstance(str);
    }

    @Override // i60.c
    public CertificateFactory createCertificateFactory(String str) {
        return CertificateFactory.getInstance(str);
    }

    @Override // i60.c
    public Cipher createCipher(String str) {
        return Cipher.getInstance(str);
    }

    @Override // i60.c
    public KeyFactory createKeyFactory(String str) {
        return KeyFactory.getInstance(str);
    }

    @Override // i60.c
    public Mac createMac(String str) {
        return Mac.getInstance(str);
    }

    @Override // i60.c
    public SecretKeyFactory createSecretKeyFactory(String str) {
        return SecretKeyFactory.getInstance(str);
    }

    @Override // i60.c
    public SecureRandom createSecureRandom(String str) {
        return SecureRandom.getInstance(str);
    }

    @Override // i60.c
    public Signature createSignature(String str) {
        return Signature.getInstance(str);
    }
}