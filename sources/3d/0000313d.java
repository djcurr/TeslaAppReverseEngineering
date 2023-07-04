package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.internal.zzig;
import com.google.android.libraries.places.internal.zziy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class OpeningHours implements Parcelable {

    /* loaded from: classes3.dex */
    public static abstract class Builder {
        @RecentlyNonNull
        public OpeningHours build() {
            OpeningHours zza = zza();
            for (String str : zza.getWeekdayText()) {
                zzig.zzi(!TextUtils.isEmpty(str), "WeekdayText must not contain null or empty values.");
            }
            setPeriods(zziy.zzk(zza.getPeriods()));
            setWeekdayText(zziy.zzk(zza.getWeekdayText()));
            return zza();
        }

        @RecentlyNonNull
        public abstract List<Period> getPeriods();

        @RecentlyNonNull
        public abstract List<String> getWeekdayText();

        @RecentlyNonNull
        public abstract Builder setPeriods(@RecentlyNonNull List<Period> list);

        @RecentlyNonNull
        public abstract Builder setWeekdayText(@RecentlyNonNull List<String> list);

        abstract OpeningHours zza();
    }

    @RecentlyNonNull
    public static Builder builder() {
        zzk zzkVar = new zzk();
        zzkVar.setPeriods(new ArrayList());
        zzkVar.setWeekdayText(new ArrayList());
        return zzkVar;
    }

    @RecentlyNonNull
    public abstract List<Period> getPeriods();

    @RecentlyNonNull
    public abstract List<String> getWeekdayText();
}