package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;

/* loaded from: classes2.dex */
public class n {
    public static byte[] a(zp.l lVar, byte[] bArr) {
        zp.c s11 = lVar.s();
        if (s11 == null) {
            return bArr;
        }
        if (s11.equals(zp.c.f60574b)) {
            try {
                return nq.g.a(bArr);
            } catch (Exception e11) {
                throw new JOSEException("Couldn't compress plain text: " + e11.getMessage(), e11);
            }
        }
        throw new JOSEException("Unsupported compression algorithm: " + s11);
    }

    public static byte[] b(zp.l lVar, byte[] bArr) {
        zp.c s11 = lVar.s();
        if (s11 == null) {
            return bArr;
        }
        if (s11.equals(zp.c.f60574b)) {
            try {
                return nq.g.b(bArr);
            } catch (Exception e11) {
                throw new JOSEException("Couldn't decompress plain text: " + e11.getMessage(), e11);
            }
        }
        throw new JOSEException("Unsupported compression algorithm: " + s11);
    }
}