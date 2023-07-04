package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.libraries.places.api.model.TypeFilter;

/* loaded from: classes3.dex */
public final class zzfe {
    private static final zzjb zza;

    static {
        zzja zzjaVar = new zzja();
        zzjaVar.zza(TypeFilter.ADDRESS, "address");
        zzjaVar.zza(TypeFilter.CITIES, PlaceTypes.CITIES);
        zzjaVar.zza(TypeFilter.ESTABLISHMENT, PlaceTypes.ESTABLISHMENT);
        zzjaVar.zza(TypeFilter.GEOCODE, PlaceTypes.GEOCODE);
        zzjaVar.zza(TypeFilter.REGIONS, PlaceTypes.REGIONS);
        zza = zzjaVar.zzb();
    }

    public static String zza(TypeFilter typeFilter) {
        String str = (String) zza.get(typeFilter);
        return str == null ? "" : str;
    }
}