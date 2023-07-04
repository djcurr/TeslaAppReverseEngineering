package k30;

import net.time4j.format.j;

/* loaded from: classes5.dex */
public class b {
    public static String a(j jVar, char c11, int i11) {
        if (jVar.isDecimal()) {
            int i12 = c11 - '0';
            String num = Integer.toString(i11);
            if (i12 == 0) {
                return num;
            }
            StringBuilder sb2 = new StringBuilder();
            int length = num.length();
            for (int i13 = 0; i13 < length; i13++) {
                sb2.append((char) (num.charAt(i13) + i12));
            }
            return sb2.toString();
        }
        return jVar.toNumeral(i11);
    }
}