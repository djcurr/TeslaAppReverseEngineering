package com.reactcommunity.rndatetimepicker;

import android.os.Bundle;
import j$.util.DesugarTimeZone;
import java.util.Calendar;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private Calendar f20024a = Calendar.getInstance();

    public d(Bundle bundle) {
        if (bundle != null && bundle.containsKey("value")) {
            e(bundle.getLong("value"));
        }
        if (bundle == null || !bundle.containsKey("timeZoneOffsetInMinutes")) {
            return;
        }
        this.f20024a.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        this.f20024a.add(14, Integer.valueOf(bundle.getInt("timeZoneOffsetInMinutes", Long.valueOf(bundle.getLong("timeZoneOffsetInMinutes")).intValue())).intValue() * 60000);
    }

    public int a() {
        return this.f20024a.get(5);
    }

    public int b() {
        return this.f20024a.get(11);
    }

    public int c() {
        return this.f20024a.get(12);
    }

    public int d() {
        return this.f20024a.get(2);
    }

    public void e(long j11) {
        this.f20024a.setTimeInMillis(j11);
    }

    public int f() {
        return this.f20024a.get(1);
    }
}