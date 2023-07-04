package io.sentry;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class g {
    public static double a(Date date) {
        return g(date.getTime());
    }

    public static Date b() {
        return Calendar.getInstance(tz.a.f52725a).getTime();
    }

    public static Date c(long j11) {
        Calendar calendar = Calendar.getInstance(tz.a.f52725a);
        calendar.setTimeInMillis(j11);
        return calendar.getTime();
    }

    public static Date d(String str) {
        try {
            return tz.a.f(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException("timestamp is not ISO format " + str);
        }
    }

    public static Date e(String str) {
        try {
            return c(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException("timestamp is not millis format " + str);
        }
    }

    public static String f(Date date) {
        return tz.a.b(date, true);
    }

    public static double g(double d11) {
        return d11 / 1000.0d;
    }

    public static double h(double d11) {
        return d11 / 1000000.0d;
    }
}