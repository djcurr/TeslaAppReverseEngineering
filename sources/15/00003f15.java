package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class k implements eq.a<eq.b> {

    /* renamed from: a  reason: collision with root package name */
    private final String f17943a;

    /* renamed from: b  reason: collision with root package name */
    private final eq.b f17944b = new eq.b();

    public k(String str) {
        if (str != null) {
            this.f17943a = str;
            return;
        }
        throw new IllegalArgumentException("The JCA hash algorithm must not be null");
    }

    public static byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return nq.e.d(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    public static int d(int i11, int i12) {
        return ((i12 + i11) - 1) / i11;
    }

    public static byte[] g(nq.c cVar) {
        return h(cVar != null ? cVar.a() : null);
    }

    public static byte[] h(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        return nq.e.d(nq.h.a(bArr.length), bArr);
    }

    public static byte[] i(int i11) {
        return nq.h.a(i11);
    }

    public static byte[] j() {
        return new byte[0];
    }

    public static byte[] k(String str) {
        return h(str != null ? str.getBytes(nq.l.f41779a) : null);
    }

    private MessageDigest l() {
        Provider a11 = getJCAContext().a();
        try {
            if (a11 == null) {
                return MessageDigest.getInstance(this.f17943a);
            }
            return MessageDigest.getInstance(this.f17943a, a11);
        } catch (NoSuchAlgorithmException e11) {
            throw new JOSEException("Couldn't get message digest for KDF: " + e11.getMessage(), e11);
        }
    }

    public SecretKey e(SecretKey secretKey, int i11, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        MessageDigest l11 = l();
        for (int i12 = 1; i12 <= d(nq.e.e(l11.getDigestLength()), i11); i12++) {
            l11.update(nq.h.a(i12));
            l11.update(secretKey.getEncoded());
            if (bArr != null) {
                l11.update(bArr);
            }
            try {
                byteArrayOutputStream.write(l11.digest());
            } catch (IOException e11) {
                throw new JOSEException("Couldn't write derived key: " + e11.getMessage(), e11);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int c11 = nq.e.c(i11);
        if (byteArray.length == c11) {
            return new SecretKeySpec(byteArray, "AES");
        }
        return new SecretKeySpec(nq.e.g(byteArray, 0, c11), "AES");
    }

    public SecretKey f(SecretKey secretKey, int i11, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return e(secretKey, i11, c(bArr, bArr2, bArr3, bArr4, bArr5));
    }

    @Override // eq.a
    public eq.b getJCAContext() {
        return this.f17944b;
    }
}