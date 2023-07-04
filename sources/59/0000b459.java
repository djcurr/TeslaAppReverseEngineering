package t10;

import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class h {
    public static final byte[] a(String[] strings) {
        int i11;
        s.g(strings, "strings");
        int i12 = 0;
        for (String str : strings) {
            i12 += str.length();
        }
        byte[] bArr = new byte[i12];
        int length = strings.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            String str2 = strings[i13];
            i13++;
            int length2 = str2.length() - 1;
            if (length2 >= 0) {
                int i15 = 0;
                while (true) {
                    int i16 = i15 + 1;
                    i11 = i14 + 1;
                    bArr[i14] = (byte) str2.charAt(i15);
                    if (i15 == length2) {
                        break;
                    }
                    i15 = i16;
                    i14 = i11;
                }
                i14 = i11;
            }
        }
        return bArr;
    }
}