package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes3.dex */
public abstract class TimeOfWeek implements Parcelable {
    @RecentlyNonNull
    public static TimeOfWeek newInstance(@RecentlyNonNull DayOfWeek dayOfWeek, @RecentlyNonNull LocalTime localTime) {
        return new zzaz(dayOfWeek, localTime);
    }

    @RecentlyNonNull
    public abstract DayOfWeek getDay();

    @RecentlyNonNull
    public abstract LocalTime getTime();
}