package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes3.dex */
class e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(long j11) {
        return b(j11, Locale.getDefault());
    }

    static String b(long j11, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return s.b(locale).format(new Date(j11));
        }
        return s.f(locale).format(new Date(j11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(Context context, long j11) {
        return DateUtils.formatDateTime(context, j11 - TimeZone.getDefault().getOffset(j11), 36);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d(long j11) {
        return e(j11, Locale.getDefault());
    }

    static String e(long j11, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return s.m(locale).format(new Date(j11));
        }
        return s.f(locale).format(new Date(j11));
    }
}