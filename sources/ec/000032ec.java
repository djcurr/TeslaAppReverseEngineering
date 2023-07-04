package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzdx extends zzek {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdx(FetchPlaceRequest fetchPlaceRequest, Locale locale, String str, boolean z11, zzgf zzgfVar) {
        super(fetchPlaceRequest, locale, str, false, zzgfVar);
    }

    @Override // com.google.android.libraries.places.internal.zzek
    protected final String zze() {
        return "details/json";
    }

    @Override // com.google.android.libraries.places.internal.zzek
    public final Map zzf() {
        FetchPlaceRequest fetchPlaceRequest = (FetchPlaceRequest) zzb();
        HashMap hashMap = new HashMap();
        zzek.zzg(hashMap, "placeid", fetchPlaceRequest.getPlaceId(), null);
        zzek.zzg(hashMap, "sessiontoken", fetchPlaceRequest.getSessionToken(), null);
        zzek.zzg(hashMap, "fields", zzfd.zza(fetchPlaceRequest.getPlaceFields()), null);
        return hashMap;
    }
}