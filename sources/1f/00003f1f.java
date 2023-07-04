package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f17949a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f17950b = {0, 0, 0, 0};

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f17951c = {69, 110, 99, 114, 121, 112, 116, 105, 111, 110};

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f17952d = {73, 110, 116, 101, 103, 114, 105, 116, 121};

    public static SecretKey a(SecretKey secretKey, zp.d dVar, byte[] bArr, byte[] bArr2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(f17949a);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(nq.h.a(length / 2));
            byteArrayOutputStream.write(dVar.toString().getBytes(nq.l.f41779a));
            if (bArr != null) {
                byteArrayOutputStream.write(nq.h.a(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(f17950b);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(nq.h.a(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(f17950b);
            }
            byteArrayOutputStream.write(f17951c);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byte[] digest = MessageDigest.getInstance("SHA-" + length).digest(byteArray);
                int length2 = digest.length / 2;
                byte[] bArr3 = new byte[length2];
                System.arraycopy(digest, 0, bArr3, 0, length2);
                return new SecretKeySpec(bArr3, "AES");
            } catch (NoSuchAlgorithmException e11) {
                throw new JOSEException(e11.getMessage(), e11);
            }
        } catch (IOException e12) {
            throw new JOSEException(e12.getMessage(), e12);
        }
    }

    public static SecretKey b(SecretKey secretKey, zp.d dVar, byte[] bArr, byte[] bArr2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(f17949a);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(nq.h.a(length));
            byteArrayOutputStream.write(dVar.toString().getBytes(nq.l.f41779a));
            if (bArr != null) {
                byteArrayOutputStream.write(nq.h.a(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(f17950b);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(nq.h.a(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(f17950b);
            }
            byteArrayOutputStream.write(f17952d);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byte[] digest = MessageDigest.getInstance("SHA-" + length).digest(byteArray);
                return new SecretKeySpec(digest, "HMACSHA" + length);
            } catch (NoSuchAlgorithmException e11) {
                throw new JOSEException(e11.getMessage(), e11);
            }
        } catch (IOException e12) {
            throw new JOSEException(e12.getMessage(), e12);
        }
    }
}