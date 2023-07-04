package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.internal.zzig;
import com.google.android.libraries.places.internal.zzjk;

/* loaded from: classes3.dex */
public abstract class LocalTime implements Parcelable, Comparable<LocalTime> {
    @RecentlyNonNull
    public static LocalTime newInstance(int i11, int i12) {
        try {
            zzi zziVar = new zzi();
            zziVar.zza(i11);
            zziVar.zzb(i12);
            LocalTime zzc = zziVar.zzc();
            int hours = zzc.getHours();
            zzig.zzj(zzjk.zzc(0, 23).zze(Integer.valueOf(hours)), "Hours must not be out-of-range: 0 to 23, but was: %s.", hours);
            int minutes = zzc.getMinutes();
            zzig.zzj(zzjk.zzc(0, 59).zze(Integer.valueOf(minutes)), "Minutes must not be out-of-range: 0 to 59, but was: %s.", minutes);
            return zzc;
        } catch (IllegalStateException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@RecentlyNonNull LocalTime localTime) {
        int hours;
        int hours2;
        zzig.zzc(localTime, "compare must not be null.");
        if (this == localTime) {
            return 0;
        }
        if (getHours() == localTime.getHours()) {
            hours = getMinutes();
            hours2 = localTime.getMinutes();
        } else {
            hours = getHours();
            hours2 = localTime.getHours();
        }
        return hours - hours2;
    }

    public abstract int getHours();

    public abstract int getMinutes();
}