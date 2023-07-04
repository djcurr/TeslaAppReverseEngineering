package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.KeyLengthException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final SecretKey f17939a;

    /* renamed from: b  reason: collision with root package name */
    private final SecretKey f17940b;

    /* renamed from: c  reason: collision with root package name */
    private final SecretKey f17941c;

    /* renamed from: d  reason: collision with root package name */
    private final int f17942d;

    public j(SecretKey secretKey) {
        this.f17939a = secretKey;
        byte[] encoded = secretKey.getEncoded();
        if (encoded.length == 32) {
            this.f17940b = new SecretKeySpec(encoded, 0, 16, "HMACSHA256");
            this.f17941c = new SecretKeySpec(encoded, 16, 16, "AES");
            this.f17942d = 16;
        } else if (encoded.length == 48) {
            this.f17940b = new SecretKeySpec(encoded, 0, 24, "HMACSHA384");
            this.f17941c = new SecretKeySpec(encoded, 24, 24, "AES");
            this.f17942d = 24;
        } else if (encoded.length == 64) {
            this.f17940b = new SecretKeySpec(encoded, 0, 32, "HMACSHA512");
            this.f17941c = new SecretKeySpec(encoded, 32, 32, "AES");
            this.f17942d = 32;
        } else {
            throw new KeyLengthException("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
        }
    }

    public SecretKey a() {
        return this.f17941c;
    }

    public SecretKey b() {
        return this.f17940b;
    }

    public int c() {
        return this.f17942d;
    }
}