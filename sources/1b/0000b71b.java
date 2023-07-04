package u4;

import ch.qos.logback.classic.spi.CallerData;

/* loaded from: classes.dex */
public class f {
    public static void a(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(CallerData.NA);
            if (i12 < i11 - 1) {
                sb2.append(",");
            }
        }
    }

    public static StringBuilder b() {
        return new StringBuilder();
    }
}