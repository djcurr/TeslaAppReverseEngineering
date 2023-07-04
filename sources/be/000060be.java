package com.tesla.logging;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f21873a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static SimpleDateFormat f21874b;

    static {
        try {
            f21874b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSXXX", Locale.getDefault());
        } catch (Exception unused) {
        }
    }

    private c() {
    }

    public final String a(Date date) {
        s.g(date, "date");
        SimpleDateFormat simpleDateFormat = f21874b;
        if (simpleDateFormat == null) {
            s.x("dateFormat");
            simpleDateFormat = null;
        }
        String format = simpleDateFormat.format(date);
        s.f(format, "dateFormat.format(date)");
        return format;
    }
}