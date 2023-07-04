package com.henninghall.date_picker;

import android.text.format.DateFormat;
import android.text.format.DateUtils;
import com.facebook.react.bridge.ReactApplicationContext;
import j$.util.DesugarTimeZone;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import net.time4j.PrettyTime;

/* loaded from: classes2.dex */
public class k {
    public static String a(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static String b(Calendar calendar) {
        return d().format(calendar.getTime());
    }

    public static boolean c() {
        return !DateFormat.is24HourFormat(a.f17465a);
    }

    private static SimpleDateFormat d() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    public static String e(Locale locale, String str) {
        ReactApplicationContext reactApplicationContext = a.f17465a;
        return f.g(locale, reactApplicationContext.getResources().getIdentifier(str, "string", reactApplicationContext.getPackageName()), reactApplicationContext);
    }

    public static int f(int i11, int i12, int i13, boolean z11) {
        int i14 = i13 + 1;
        int i15 = i12 - i11;
        int i16 = i15 > 0 ? i15 - i14 : i14 + i15;
        if (z11) {
            return Math.abs(i15) < Math.abs(i16) ? i15 : i16;
        }
        int i17 = i11 + i15;
        return (i17 <= i13 && i17 >= 0) ? i15 : i16;
    }

    public static boolean g(Calendar calendar) {
        return DateUtils.isToday(calendar.getTimeInMillis());
    }

    public static Calendar h(String str, TimeZone timeZone) {
        if (str == null) {
            return null;
        }
        try {
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(d().parse(str));
            return calendar;
        } catch (ParseException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static qp.d i(char c11) {
        if (c11 != 'H') {
            if (c11 == 'M') {
                return qp.d.MONTH;
            }
            if (c11 == 'a') {
                return qp.d.AM_PM;
            }
            if (c11 == 'd') {
                return qp.d.DATE;
            }
            if (c11 != 'h') {
                if (c11 != 'm') {
                    if (c11 == 'y') {
                        return qp.d.YEAR;
                    }
                    throw new Exception("Invalid pattern char: " + c11);
                }
                return qp.d.MINUTE;
            }
        }
        return qp.d.HOUR;
    }

    public static String j(Locale locale) {
        return PrettyTime.b(locale).c();
    }

    public static int k(int i11) {
        return (int) (i11 * a.f17465a.getResources().getDisplayMetrics().density);
    }

    public static String l(int i11) {
        return new DecimalFormat("00").format(i11);
    }
}