package com.nimbusds.jose.crypto.impl;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public class a {
    public static byte[] a(nq.c cVar) {
        return cVar.toString().getBytes(StandardCharsets.US_ASCII);
    }

    public static byte[] b(zp.l lVar) {
        return a(lVar.h());
    }

    public static byte[] c(byte[] bArr) {
        return ByteBuffer.allocate(8).putLong(nq.e.f(bArr)).array();
    }
}