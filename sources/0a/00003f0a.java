package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import java.nio.ByteBuffer;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class b {
    private static Cipher a(SecretKey secretKey, boolean z11, byte[] bArr, Provider provider) {
        try {
            Cipher a11 = i.a("AES/CBC/PKCS5Padding", provider);
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getEncoded(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            if (z11) {
                a11.init(1, secretKeySpec, ivParameterSpec);
            } else {
                a11.init(2, secretKeySpec, ivParameterSpec);
            }
            return a11;
        } catch (Exception e11) {
            throw new JOSEException(e11.getMessage(), e11);
        }
    }

    public static byte[] b(SecretKey secretKey, byte[] bArr, byte[] bArr2, Provider provider) {
        try {
            return a(secretKey, false, bArr, provider).doFinal(bArr2);
        } catch (Exception e11) {
            throw new JOSEException(e11.getMessage(), e11);
        }
    }

    public static byte[] c(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, Provider provider, Provider provider2) {
        j jVar = new j(secretKey);
        byte[] c11 = a.c(bArr3);
        if (dq.a.a(Arrays.copyOf(s.b(jVar.b(), ByteBuffer.allocate(bArr3.length + bArr.length + bArr2.length + c11.length).put(bArr3).put(bArr).put(bArr2).put(c11).array(), provider2), jVar.c()), bArr4)) {
            return b(jVar.a(), bArr, bArr2, provider);
        }
        throw new JOSEException("MAC check failed");
    }

    public static byte[] d(zp.l lVar, SecretKey secretKey, nq.c cVar, nq.c cVar2, nq.c cVar3, nq.c cVar4, Provider provider, Provider provider2) {
        byte[] a11 = lVar.d("epu") instanceof String ? new nq.c((String) lVar.d("epu")).a() : null;
        byte[] a12 = lVar.d("epv") instanceof String ? new nq.c((String) lVar.d("epv")).a() : null;
        SecretKey b11 = u.b(secretKey, lVar.t(), a11, a12);
        if (dq.a.a(cVar4.a(), s.b(b11, (lVar.h().toString() + "." + cVar.toString() + "." + cVar2.toString() + "." + cVar3.toString()).getBytes(nq.l.f41779a), provider2))) {
            return b(u.a(secretKey, lVar.t(), a11, a12), cVar2.a(), cVar3.a(), provider);
        }
        throw new JOSEException("MAC check failed");
    }

    public static byte[] e(SecretKey secretKey, byte[] bArr, byte[] bArr2, Provider provider) {
        try {
            return a(secretKey, true, bArr, provider).doFinal(bArr2);
        } catch (Exception e11) {
            throw new JOSEException(e11.getMessage(), e11);
        }
    }

    public static f f(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider, Provider provider2) {
        j jVar = new j(secretKey);
        byte[] e11 = e(jVar.a(), bArr, bArr2, provider);
        byte[] c11 = a.c(bArr3);
        return new f(e11, Arrays.copyOf(s.b(jVar.b(), ByteBuffer.allocate(bArr3.length + bArr.length + e11.length + c11.length).put(bArr3).put(bArr).put(e11).put(c11).array(), provider2), jVar.c()));
    }

    public static f g(zp.l lVar, SecretKey secretKey, nq.c cVar, byte[] bArr, byte[] bArr2, Provider provider, Provider provider2) {
        byte[] a11 = lVar.d("epu") instanceof String ? new nq.c((String) lVar.d("epu")).a() : null;
        byte[] a12 = lVar.d("epv") instanceof String ? new nq.c((String) lVar.d("epv")).a() : null;
        byte[] e11 = e(u.a(secretKey, lVar.t(), a11, a12), bArr, bArr2, provider);
        SecretKey b11 = u.b(secretKey, lVar.t(), a11, a12);
        return new f(e11, s.b(b11, (lVar.h() + "." + cVar + "." + nq.c.e(bArr) + "." + nq.c.e(e11)).getBytes(nq.l.f41779a), provider2));
    }

    public static byte[] h(SecureRandom secureRandom) {
        byte[] bArr = new byte[nq.e.c(128)];
        secureRandom.nextBytes(bArr);
        return bArr;
    }
}