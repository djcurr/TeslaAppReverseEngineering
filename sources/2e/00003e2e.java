package com.henninghall.date_picker;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.henninghall.date_picker.d;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes2.dex */
public class f {
    public static String a(String str) {
        return e(str, d.c.d);
    }

    public static String b(Locale locale) {
        return ((SimpleDateFormat) DateFormat.getDateInstance(0, locale)).toLocalizedPattern().replaceAll(",", "").replaceAll("([a-zA-Z]+)", " $1").trim();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(Locale locale) {
        return ((SimpleDateFormat) DateFormat.getDateTimeInstance(0, 0, locale)).toLocalizedPattern().replace(",", "");
    }

    public static String d(String str) {
        return e(str, d.c.MMMEd);
    }

    private static String e(String str, d.c cVar) {
        try {
            return d.b(str, cVar);
        } catch (d.C0315d unused) {
            try {
                return d.b(str.substring(0, str.indexOf("_")), cVar);
            } catch (d.C0315d | IndexOutOfBoundsException unused2) {
                return d.f17469a.get(cVar);
            }
        }
    }

    public static Locale f(String str) {
        try {
            return w30.a.e(str);
        } catch (Exception unused) {
            return w30.a.e(str.substring(0, str.indexOf("_")));
        }
    }

    public static String g(Locale locale, int i11, Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                Configuration configuration = new Configuration(context.getResources().getConfiguration());
                configuration.setLocale(locale);
                return context.createConfigurationContext(configuration).getText(i11).toString();
            }
            Resources resources = context.getResources();
            Configuration configuration2 = resources.getConfiguration();
            Locale locale2 = configuration2.locale;
            configuration2.locale = locale;
            resources.updateConfiguration(configuration2, null);
            String string = resources.getString(i11);
            configuration2.locale = locale2;
            resources.updateConfiguration(configuration2, null);
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String h(String str) {
        return e(str, d.c.y);
    }

    public static boolean i(Locale locale) {
        DateFormat timeInstance = DateFormat.getTimeInstance(0, locale);
        return (timeInstance instanceof SimpleDateFormat) && ((SimpleDateFormat) timeInstance).toPattern().contains("a");
    }
}