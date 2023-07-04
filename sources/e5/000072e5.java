package hb;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f29017a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(byte[] bArr) {
        return b(bArr, 0);
    }

    public static String b(byte[] bArr, int i11) {
        int length = bArr.length;
        char[] cArr = new char[(length << 1) + (i11 > 0 ? length / i11 : 0)];
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            if (i11 > 0 && i13 % i11 == 0 && i12 > 0) {
                cArr[i12] = CoreConstants.DASH_CHAR;
                i12++;
            }
            int i14 = i12 + 1;
            char[] cArr2 = f29017a;
            cArr[i12] = cArr2[(bArr[i13] & 240) >>> 4];
            i12 = i14 + 1;
            cArr[i14] = cArr2[bArr[i13] & 15];
        }
        return new String(cArr);
    }
}