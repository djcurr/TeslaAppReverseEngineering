package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import javax.crypto.SecretKey;
import org.bouncycastle.crypto.InvalidCipherTextException;
import u50.b1;

/* loaded from: classes2.dex */
public class t {
    public static l50.a a(SecretKey secretKey, boolean z11) {
        l50.a aVar = new l50.a();
        aVar.init(z11, new b1(secretKey.getEncoded()));
        return aVar;
    }

    private static q50.n b(SecretKey secretKey, boolean z11, byte[] bArr, byte[] bArr2) {
        q50.n nVar = new q50.n(a(secretKey, z11));
        nVar.init(z11, new u50.a(new b1(secretKey.getEncoded()), 128, bArr, bArr2));
        return nVar;
    }

    public static byte[] c(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        q50.n b11 = b(secretKey, false, bArr, bArr3);
        int length = bArr2.length + bArr4.length;
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        System.arraycopy(bArr4, 0, bArr5, bArr2.length, bArr4.length);
        byte[] bArr6 = new byte[b11.getOutputSize(length)];
        try {
            b11.doFinal(bArr6, b11.processBytes(bArr5, 0, length, bArr6, 0));
            return bArr6;
        } catch (InvalidCipherTextException e11) {
            throw new JOSEException("Couldn't validate GCM authentication tag: " + e11.getMessage(), e11);
        }
    }

    public static f d(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        q50.n b11 = b(secretKey, true, bArr, bArr3);
        byte[] bArr4 = new byte[b11.getOutputSize(bArr2.length)];
        int processBytes = b11.processBytes(bArr2, 0, bArr2.length, bArr4, 0);
        try {
            int doFinal = (processBytes + b11.doFinal(bArr4, processBytes)) - 16;
            byte[] bArr5 = new byte[doFinal];
            byte[] bArr6 = new byte[16];
            System.arraycopy(bArr4, 0, bArr5, 0, doFinal);
            System.arraycopy(bArr4, doFinal, bArr6, 0, 16);
            return new f(bArr5, bArr6);
        } catch (InvalidCipherTextException e11) {
            throw new JOSEException("Couldn't generate GCM authentication tag: " + e11.getMessage(), e11);
        }
    }
}