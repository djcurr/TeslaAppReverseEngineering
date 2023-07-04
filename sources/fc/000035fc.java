package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes3.dex */
class r {

    /* renamed from: c  reason: collision with root package name */
    private static final r f15271c = new r(null, null);

    /* renamed from: a  reason: collision with root package name */
    private final Long f15272a;

    /* renamed from: b  reason: collision with root package name */
    private final TimeZone f15273b;

    private r(Long l11, TimeZone timeZone) {
        this.f15272a = l11;
        this.f15273b = timeZone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r c() {
        return f15271c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Calendar a() {
        return b(this.f15273b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l11 = this.f15272a;
        if (l11 != null) {
            calendar.setTimeInMillis(l11.longValue());
        }
        return calendar;
    }
}