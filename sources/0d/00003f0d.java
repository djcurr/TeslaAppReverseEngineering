package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import java.security.GeneralSecurityException;
import javax.crypto.SecretKey;

/* loaded from: classes2.dex */
public class c0 {
    public static byte[] a(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        try {
            try {
                return new pl.y(secretKey.getEncoded()).decrypt(nq.e.d(bArr, bArr2, bArr4), bArr3);
            } catch (GeneralSecurityException e11) {
                throw new JOSEException("XChaCha20Poly1305 decryption failed: " + e11.getMessage(), e11);
            }
        } catch (GeneralSecurityException e12) {
            throw new JOSEException("Invalid XChaCha20Poly1305 key: " + e12.getMessage(), e12);
        }
    }

    public static f b(SecretKey secretKey, nq.f<byte[]> fVar, byte[] bArr, byte[] bArr2) {
        try {
            try {
                byte[] a11 = new pl.y(secretKey.getEncoded()).a(bArr, bArr2);
                int length = a11.length - nq.e.c(128);
                int c11 = nq.e.c(192);
                byte[] g11 = nq.e.g(a11, 0, c11);
                byte[] g12 = nq.e.g(a11, c11, length - c11);
                byte[] g13 = nq.e.g(a11, length, nq.e.c(128));
                fVar.b(g11);
                return new f(g12, g13);
            } catch (GeneralSecurityException e11) {
                throw new JOSEException("Couldn't encrypt with XChaCha20Poly1305: " + e11.getMessage(), e11);
            }
        } catch (GeneralSecurityException e12) {
            throw new JOSEException("Invalid XChaCha20Poly1305 key: " + e12.getMessage(), e12);
        }
    }
}