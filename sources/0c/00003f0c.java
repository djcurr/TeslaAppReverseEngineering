package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes2.dex */
public class c {
    private static byte[] a(Cipher cipher) {
        GCMParameterSpec b11 = b(cipher);
        byte[] iv2 = b11.getIV();
        f(iv2, b11.getTLen());
        return iv2;
    }

    private static GCMParameterSpec b(Cipher cipher) {
        AlgorithmParameters parameters = cipher.getParameters();
        if (parameters != null) {
            try {
                return (GCMParameterSpec) parameters.getParameterSpec(GCMParameterSpec.class);
            } catch (InvalidParameterSpecException e11) {
                throw new JOSEException(e11.getMessage(), e11);
            }
        }
        throw new JOSEException("AES GCM ciphers are expected to make use of algorithm parameters");
    }

    public static byte[] c(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, Provider provider) {
        Cipher cipher;
        SecretKey a11 = nq.k.a(secretKey);
        try {
            if (provider != null) {
                cipher = Cipher.getInstance("AES/GCM/NoPadding", provider);
            } else {
                cipher = Cipher.getInstance("AES/GCM/NoPadding");
            }
            cipher.init(2, a11, new GCMParameterSpec(128, bArr));
            cipher.updateAAD(bArr3);
            try {
                return cipher.doFinal(nq.e.d(bArr2, bArr4));
            } catch (BadPaddingException | IllegalBlockSizeException e11) {
                throw new JOSEException("AES/GCM/NoPadding decryption failed: " + e11.getMessage(), e11);
            }
        } catch (NoClassDefFoundError unused) {
            return t.c(a11, bArr, bArr2, bArr3, bArr4);
        } catch (InvalidAlgorithmParameterException e12) {
            e = e12;
            throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (InvalidKeyException e13) {
            e = e13;
            throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e14) {
            e = e14;
            throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (NoSuchPaddingException e15) {
            e = e15;
            throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        }
    }

    public static f d(SecretKey secretKey, nq.f<byte[]> fVar, byte[] bArr, byte[] bArr2, Provider provider) {
        Cipher cipher;
        SecretKey a11 = nq.k.a(secretKey);
        byte[] a12 = fVar.a();
        try {
            if (provider != null) {
                cipher = Cipher.getInstance("AES/GCM/NoPadding", provider);
            } else {
                cipher = Cipher.getInstance("AES/GCM/NoPadding");
            }
            cipher.init(1, a11, new GCMParameterSpec(128, a12));
            cipher.updateAAD(bArr2);
            try {
                byte[] doFinal = cipher.doFinal(bArr);
                int length = doFinal.length - nq.e.c(128);
                byte[] g11 = nq.e.g(doFinal, 0, length);
                byte[] g12 = nq.e.g(doFinal, length, nq.e.c(128));
                fVar.b(a(cipher));
                return new f(g11, g12);
            } catch (BadPaddingException | IllegalBlockSizeException e11) {
                throw new JOSEException("Couldn't encrypt with AES/GCM/NoPadding: " + e11.getMessage(), e11);
            }
        } catch (NoClassDefFoundError unused) {
            return t.d(a11, a12, bArr, bArr2);
        } catch (InvalidAlgorithmParameterException e12) {
            e = e12;
            throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (InvalidKeyException e13) {
            e = e13;
            throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e14) {
            e = e14;
            throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (NoSuchPaddingException e15) {
            e = e15;
            throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        }
    }

    public static byte[] e(SecureRandom secureRandom) {
        byte[] bArr = new byte[12];
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    private static void f(byte[] bArr, int i11) {
        if (nq.e.f(bArr) != 96) {
            throw new JOSEException(String.format("IV length of %d bits is required, got %d", 96, Integer.valueOf(nq.e.f(bArr))));
        }
        if (i11 != 128) {
            throw new JOSEException(String.format("Authentication tag length of %d bits is required, got %d", 128, Integer.valueOf(i11)));
        }
    }
}