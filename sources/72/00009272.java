package org.bouncycastle.jcajce.provider.asymmetric.edec;

import r70.d;
import r70.m;
import u50.b;
import u50.h0;
import u50.k0;
import u50.t1;
import u50.w1;

/* loaded from: classes5.dex */
class Utils {
    Utils() {
    }

    private static String generateKeyFingerprint(byte[] bArr) {
        return new d(bArr).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isValidPrefix(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return !isValidPrefix(bArr, bArr);
        }
        int i11 = 0;
        for (int i12 = 0; i12 != bArr.length; i12++) {
            i11 |= bArr[i12] ^ bArr2[i12];
        }
        return i11 == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String keyToString(String str, String str2, b bVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String d11 = m.d();
        byte[] encoded = bVar instanceof w1 ? ((w1) bVar).getEncoded() : bVar instanceof k0 ? ((k0) bVar).getEncoded() : bVar instanceof t1 ? ((t1) bVar).getEncoded() : ((h0) bVar).getEncoded();
        stringBuffer.append(str2);
        stringBuffer.append(" ");
        stringBuffer.append(str);
        stringBuffer.append(" [");
        stringBuffer.append(generateKeyFingerprint(encoded));
        stringBuffer.append("]");
        stringBuffer.append(d11);
        stringBuffer.append("    public data: ");
        stringBuffer.append(org.bouncycastle.util.encoders.b.f(encoded));
        stringBuffer.append(d11);
        return stringBuffer.toString();
    }
}