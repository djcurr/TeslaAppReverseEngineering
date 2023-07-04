package org.bouncycastle.jcajce.provider.util;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
import r40.b;
import r70.f;
import t40.a;
import w40.n;

/* loaded from: classes5.dex */
public class SecretKeyUtil {
    private static Map keySizes;

    static {
        HashMap hashMap = new HashMap();
        keySizes = hashMap;
        hashMap.put(n.S1.t(), f.d(192));
        keySizes.put(b.f49165u, f.d(128));
        keySizes.put(b.C, f.d(192));
        keySizes.put(b.K, f.d(256));
        keySizes.put(a.f51628a, f.d(128));
        keySizes.put(a.f51629b, f.d(192));
        keySizes.put(a.f51630c, f.d(256));
    }

    public static int getKeySize(k kVar) {
        Integer num = (Integer) keySizes.get(kVar);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }
}