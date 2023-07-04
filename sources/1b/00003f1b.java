package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECKey;

/* loaded from: classes2.dex */
public class q {
    public static int a(zp.n nVar) {
        if (nVar.equals(zp.n.f60658i) || nVar.equals(zp.n.f60659j)) {
            return 64;
        }
        if (nVar.equals(zp.n.f60660k)) {
            return 96;
        }
        if (nVar.equals(zp.n.f60661l)) {
            return 132;
        }
        throw new JOSEException(e.d(nVar, r.f17948c));
    }

    public static Signature b(zp.n nVar, Provider provider) {
        String str = "SHA256withECDSA";
        if (!nVar.equals(zp.n.f60658i) && !nVar.equals(zp.n.f60659j)) {
            if (nVar.equals(zp.n.f60660k)) {
                str = "SHA384withECDSA";
            } else if (!nVar.equals(zp.n.f60661l)) {
                throw new JOSEException(e.d(nVar, r.f17948c));
            } else {
                str = "SHA512withECDSA";
            }
        }
        try {
            if (provider != null) {
                return Signature.getInstance(str, provider);
            }
            return Signature.getInstance(str);
        } catch (NoSuchAlgorithmException e11) {
            throw new JOSEException("Unsupported ECDSA algorithm: " + e11.getMessage(), e11);
        }
    }

    public static zp.n c(fq.a aVar) {
        if (aVar != null) {
            if (fq.a.f26716c.equals(aVar)) {
                return zp.n.f60658i;
            }
            if (fq.a.f26717d.equals(aVar)) {
                return zp.n.f60659j;
            }
            if (fq.a.f26719f.equals(aVar)) {
                return zp.n.f60660k;
            }
            if (fq.a.f26720g.equals(aVar)) {
                return zp.n.f60661l;
            }
            throw new JOSEException("Unexpected curve: " + aVar);
        }
        throw new JOSEException("The EC key curve is not supported, must be P-256, P-384 or P-521");
    }

    public static zp.n d(ECKey eCKey) {
        return c(fq.a.a(eCKey.getParams()));
    }

    public static byte[] e(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length / 2;
        int i11 = length;
        while (i11 > 0 && bArr[length - i11] == 0) {
            i11--;
        }
        int i12 = length - i11;
        int i13 = bArr[i12] < 0 ? i11 + 1 : i11;
        int i14 = length;
        while (i14 > 0 && bArr[(length * 2) - i14] == 0) {
            i14--;
        }
        int i15 = (length * 2) - i14;
        int i16 = bArr[i15] < 0 ? i14 + 1 : i14;
        int i17 = i13 + 2 + 2 + i16;
        if (i17 <= 255) {
            int i18 = 1;
            if (i17 < 128) {
                bArr2 = new byte[i13 + 4 + 2 + i16];
            } else {
                bArr2 = new byte[i13 + 5 + 2 + i16];
                bArr2[1] = -127;
                i18 = 2;
            }
            bArr2[0] = 48;
            int i19 = i18 + 1;
            bArr2[i18] = (byte) i17;
            int i21 = i19 + 1;
            bArr2[i19] = 2;
            bArr2[i21] = (byte) i13;
            int i22 = i21 + 1 + i13;
            System.arraycopy(bArr, i12, bArr2, i22 - i11, i11);
            int i23 = i22 + 1;
            bArr2[i22] = 2;
            bArr2[i23] = (byte) i16;
            System.arraycopy(bArr, i15, bArr2, ((i23 + 1) + i16) - i14, i14);
            return bArr2;
        }
        throw new JOSEException("Invalid ECDSA signature format");
    }
}