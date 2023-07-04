package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;

/* loaded from: classes2.dex */
public class a0 {
    public static byte[] a(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) {
        try {
            Cipher a11 = i.a("RSA/ECB/OAEPWithSHA-1AndMGF1Padding", provider);
            a11.init(1, rSAPublicKey, new SecureRandom());
            return a11.doFinal(secretKey.getEncoded());
        } catch (IllegalBlockSizeException e11) {
            throw new JOSEException("RSA block size exception: The RSA key is too short, try a longer one", e11);
        } catch (Exception e12) {
            throw new JOSEException(e12.getMessage(), e12);
        }
    }
}