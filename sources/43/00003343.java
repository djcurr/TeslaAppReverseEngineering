package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzgu {
    public static Status zza(Intent intent) {
        try {
            zzig.zzc(intent, "Intent must not be null.");
            Status status = (Status) intent.getParcelableExtra("places/status");
            zzig.zzc(status, "Intent expected to contain a Status, but doesn't.");
            return status;
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    public static Place zzb(Intent intent) {
        try {
            zzig.zzc(intent, "Intent must not be null.");
            Place place = (Place) intent.getParcelableExtra("places/selected_place");
            zzig.zzc(place, "Intent expected to contain a Place, but doesn't.");
            return place;
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    public static String zzc(Context context, int i11) {
        int i12 = Build.VERSION.SDK_INT;
        Locale locale = i12 < 24 ? context.getResources().getConfiguration().locale : context.getResources().getConfiguration().getLocales().get(0);
        Locale zzb = Places.isInitialized() ? Places.zzc().zzb() : locale;
        if (zzb.equals(locale)) {
            return context.getResources().getString(i11);
        }
        Configuration configuration = context.getResources().getConfiguration();
        if (i12 >= 17) {
            Configuration configuration2 = new Configuration(configuration);
            configuration2.setLocale(zzb);
            return context.createConfigurationContext(configuration2).getResources().getString(i11);
        }
        configuration.locale = zzb;
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
        String string = context.getResources().getString(i11);
        configuration.locale = locale;
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
        return string;
    }
}