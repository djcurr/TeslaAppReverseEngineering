package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class s {
    public static byte[] a(String str, byte[] bArr, byte[] bArr2, Provider provider) {
        return b(new SecretKeySpec(bArr, str), bArr2, provider);
    }

    public static byte[] b(SecretKey secretKey, byte[] bArr, Provider provider) {
        Mac c11 = c(secretKey, provider);
        c11.update(bArr);
        return c11.doFinal();
    }

    public static Mac c(SecretKey secretKey, Provider provider) {
        Mac mac;
        try {
            if (provider != null) {
                mac = Mac.getInstance(secretKey.getAlgorithm(), provider);
            } else {
                mac = Mac.getInstance(secretKey.getAlgorithm());
            }
            mac.init(secretKey);
            return mac;
        } catch (InvalidKeyException e11) {
            throw new JOSEException("Invalid HMAC key: " + e11.getMessage(), e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new JOSEException("Unsupported HMAC algorithm: " + e12.getMessage(), e12);
        }
    }
}