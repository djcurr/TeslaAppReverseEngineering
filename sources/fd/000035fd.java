package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
class s {

    /* renamed from: a  reason: collision with root package name */
    static AtomicReference<r> f15274a = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(long j11) {
        Calendar k11 = k();
        k11.setTimeInMillis(j11);
        return d(k11).getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DateFormat b(Locale locale) {
        return c("MMMEd", locale);
    }

    private static DateFormat c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(j());
        return instanceForSkeleton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Calendar d(Calendar calendar) {
        Calendar l11 = l(calendar);
        Calendar k11 = k();
        k11.set(l11.get(1), l11.get(2), l11.get(5));
        return k11;
    }

    private static java.text.DateFormat e(int i11, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i11, locale);
        dateInstance.setTimeZone(h());
        return dateInstance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static java.text.DateFormat f(Locale locale) {
        return e(0, locale);
    }

    static r g() {
        r rVar = f15274a.get();
        return rVar == null ? r.c() : rVar;
    }

    private static TimeZone h() {
        return DesugarTimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Calendar i() {
        Calendar a11 = g().a();
        a11.set(11, 0);
        a11.set(12, 0);
        a11.set(13, 0);
        a11.set(14, 0);
        a11.setTimeZone(h());
        return a11;
    }

    private static android.icu.util.TimeZone j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Calendar k() {
        return l(null);
    }

    static Calendar l(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(h());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DateFormat m(Locale locale) {
        return c("yMMMEd", locale);
    }
}