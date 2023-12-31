package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.util.HashSet;
import java.util.Set;
import r70.m;
import v40.b;
import w40.n;

/* loaded from: classes5.dex */
public class DESUtil {
    private static final Set<String> des;

    static {
        HashSet hashSet = new HashSet();
        des = hashSet;
        hashSet.add("DES");
        hashSet.add("DESEDE");
        hashSet.add(b.f54047b.t());
        hashSet.add(n.S1.t());
        hashSet.add(n.f55526b3.t());
    }

    public static boolean isDES(String str) {
        return des.contains(m.k(str));
    }

    public static void setOddParity(byte[] bArr) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b11 = bArr[i11];
            bArr[i11] = (byte) (((((b11 >> 7) ^ ((((((b11 >> 1) ^ (b11 >> 2)) ^ (b11 >> 3)) ^ (b11 >> 4)) ^ (b11 >> 5)) ^ (b11 >> 6))) ^ 1) & 1) | (b11 & 254));
        }
    }
}