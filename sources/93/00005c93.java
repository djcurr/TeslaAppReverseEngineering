package com.stripe.android.view;

import java.util.Calendar;

/* loaded from: classes6.dex */
public final class DateUtils {
    public static final DateUtils INSTANCE = new DateUtils();
    private static final int MAX_VALID_YEAR = 9980;

    private DateUtils() {
    }

    public static final boolean isExpiryDataValid(int i11, int i12) {
        Calendar calendar = Calendar.getInstance();
        kotlin.jvm.internal.s.f(calendar, "getInstance()");
        return isExpiryDataValid(i11, i12, calendar);
    }

    public final int convertTwoDigitYearToFour(int i11) {
        Calendar calendar = Calendar.getInstance();
        kotlin.jvm.internal.s.f(calendar, "getInstance()");
        return convertTwoDigitYearToFour(i11, calendar);
    }

    public static final boolean isExpiryDataValid(int i11, int i12, Calendar calendar) {
        kotlin.jvm.internal.s.g(calendar, "calendar");
        if (1 <= i11 && i11 < 13) {
            if (i12 >= 0 && i12 <= MAX_VALID_YEAR) {
                int i13 = calendar.get(1);
                return i12 >= i13 && (i12 > i13 || i11 >= calendar.get(2) + 1);
            }
            return false;
        }
        return false;
    }

    public final int convertTwoDigitYearToFour(int i11, Calendar calendar) {
        kotlin.jvm.internal.s.g(calendar, "calendar");
        int i12 = calendar.get(1);
        int i13 = i12 / 100;
        int i14 = i12 % 100;
        if (i14 > 80 && i11 < 20) {
            i13++;
        } else if (i14 < 20 && i11 > 80) {
            i13--;
        }
        return (i13 * 100) + i11;
    }
}