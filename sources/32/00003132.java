package com.google.android.libraries.places.api;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzfo;
import com.google.android.libraries.places.internal.zzfp;
import com.google.android.libraries.places.internal.zzfq;
import com.google.android.libraries.places.internal.zzfs;
import com.google.android.libraries.places.internal.zzfz;
import com.google.android.libraries.places.internal.zzgb;
import com.google.android.libraries.places.internal.zzig;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class Places {
    private static final zzfs zza = new zzfs();
    private static volatile zzfq zzb;

    private Places() {
    }

    @RecentlyNonNull
    public static synchronized PlacesClient createClient(@RecentlyNonNull Context context) {
        PlacesClient zza2;
        synchronized (Places.class) {
            try {
                zzig.zzc(context, "Context must not be null.");
                zza2 = zza(context, zzfz.zzd(context).zze());
            } catch (Error | RuntimeException e11) {
                zzgb.zzb(e11);
                throw e11;
            }
        }
        return zza2;
    }

    public static synchronized void deinitialize() {
        synchronized (Places.class) {
            zza.zzc();
        }
    }

    public static void initialize(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        try {
            zzb(context, str, null, false);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    public static synchronized boolean isInitialized() {
        boolean zzf;
        synchronized (Places.class) {
            try {
                zzf = zza.zzf();
            } catch (Error | RuntimeException e11) {
                zzgb.zzb(e11);
                throw e11;
            }
        }
        return zzf;
    }

    public static synchronized PlacesClient zza(Context context, zzfz zzfzVar) {
        PlacesClient zza2;
        synchronized (Places.class) {
            try {
                zzig.zzc(context, "Context must not be null.");
                zzig.zzi(isInitialized(), "Places must be initialized first.");
                zzfp zza3 = zzfo.zza();
                zza3.zzc(context);
                zza3.zza(zza);
                zza3.zzb(zzfzVar);
                zza2 = zza3.zzd().zza();
            } catch (Error | RuntimeException e11) {
                zzgb.zzb(e11);
                throw e11;
            }
        }
        return zza2;
    }

    public static synchronized void zzb(@RecentlyNonNull Context context, @RecentlyNonNull String str, Locale locale, boolean z11) {
        synchronized (Places.class) {
            try {
                zzig.zzc(context, "Application context must not be null.");
                zzig.zzc(str, "API Key must not be null.");
                zzig.zze(!str.isEmpty(), "API Key must not be empty.");
                zzgb.zza(context.getApplicationContext(), false);
                zza.zzd(str, locale, false);
            } catch (Error | RuntimeException e11) {
                zzgb.zzb(e11);
                throw e11;
            }
        }
    }

    public static synchronized zzfs zzc() {
        zzfs zzfsVar;
        synchronized (Places.class) {
            zzfsVar = zza;
        }
        return zzfsVar;
    }

    public static synchronized void initialize(@RecentlyNonNull Context context, @RecentlyNonNull String str, Locale locale) {
        synchronized (Places.class) {
            try {
                zzb(context, str, locale, false);
            } catch (Error | RuntimeException e11) {
                zzgb.zzb(e11);
                throw e11;
            }
        }
    }
}