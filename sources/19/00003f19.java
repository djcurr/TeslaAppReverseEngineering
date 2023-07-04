package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.KeyLengthException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* loaded from: classes2.dex */
public abstract class o extends g {
    public static final Set<zp.h> SUPPORTED_ALGORITHMS;
    public static final Set<zp.d> SUPPORTED_ENCRYPTION_METHODS = l.f17945a;
    private final SecretKey cek;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(zp.h.f60604k);
        SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public o(SecretKey secretKey) {
        super(SUPPORTED_ALGORITHMS, getCompatibleEncryptionMethods(nq.e.b(secretKey.getEncoded())));
        this.cek = secretKey;
    }

    private static Set<zp.d> getCompatibleEncryptionMethods(int i11) {
        Set<zp.d> set = l.f17946b.get(Integer.valueOf(i11));
        if (set != null) {
            return set;
        }
        throw new KeyLengthException("The Content Encryption Key length must be 128 bits (16 bytes), 192 bits (24 bytes), 256 bits (32 bytes), 384 bits (48 bytes) or 512 bites (64 bytes)");
    }

    @Override // com.nimbusds.jose.crypto.impl.g, eq.a
    public /* bridge */ /* synthetic */ eq.c getJCAContext() {
        return super.getJCAContext();
    }

    public SecretKey getKey() {
        return this.cek;
    }

    @Override // com.nimbusds.jose.crypto.impl.g, zp.m
    public /* bridge */ /* synthetic */ Set supportedEncryptionMethods() {
        return super.supportedEncryptionMethods();
    }

    @Override // com.nimbusds.jose.crypto.impl.g, zp.m
    public /* bridge */ /* synthetic */ Set supportedJWEAlgorithms() {
        return super.supportedJWEAlgorithms();
    }
}