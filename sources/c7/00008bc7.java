package net.time4j.history;

import net.time4j.engine.z;
import net.time4j.g0;

/* loaded from: classes5.dex */
public enum e {
    WESTERN,
    EASTERN;

    public g0 easterSunday(int i11) {
        int i12;
        int marchDay = marchDay(i11);
        if (marchDay > 31) {
            i12 = 4;
            marchDay -= 31;
        } else {
            i12 = 3;
        }
        if (this == WESTERN && i11 > 1582) {
            return g0.N0(i11, i12, marchDay);
        }
        return g0.V0(m.h(i11, i12, marchDay), z.MODIFIED_JULIAN_DATE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int marchDay(int i11) {
        if (i11 >= 532) {
            int i12 = i11 / 100;
            int i13 = 15;
            int i14 = 0;
            if (this == WESTERN && i11 > 1582) {
                int i15 = ((i12 * 3) + 3) / 4;
                i14 = 2 - i15;
                i13 = (i15 + 15) - (((i12 * 8) + 13) / 25);
            }
            int i16 = i11 % 19;
            int i17 = ((i16 * 19) + i13) % 30;
            int i18 = i17 / 29;
            int i19 = (i17 + 21) - (i18 + (((i17 / 28) - i18) * (i16 / 11)));
            return i19 + (7 - ((i19 - (7 - (((i11 + (i11 / 4)) + i14) % 7))) % 7));
        }
        throw new IllegalArgumentException("Out of range: " + i11);
    }
}