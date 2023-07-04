package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.internal.zzil;
import com.google.android.libraries.places.internal.zzjk;

/* loaded from: classes3.dex */
public abstract class PlaceLikelihood implements Parcelable {
    public static final double LIKELIHOOD_MAX_VALUE = 1.0d;
    public static final double LIKELIHOOD_MIN_VALUE = 0.0d;

    @RecentlyNonNull
    public static PlaceLikelihood newInstance(@RecentlyNonNull Place place, double d11) {
        Double valueOf = Double.valueOf(0.0d);
        Double valueOf2 = Double.valueOf(1.0d);
        zzjk zzc = zzjk.zzc(valueOf, valueOf2);
        Double valueOf3 = Double.valueOf(d11);
        if (zzc.zze(valueOf3)) {
            return new zzat(place, d11);
        }
        throw new IllegalArgumentException(zzil.zza("Likelihood must not be out-of-range: %s to %s, but was: %s.", valueOf, valueOf2, valueOf3));
    }

    public abstract double getLikelihood();

    @RecentlyNonNull
    public abstract Place getPlace();
}