package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzeb extends zzek {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeb(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, Locale locale, String str, boolean z11, zzgf zzgfVar) {
        super(findAutocompletePredictionsRequest, locale, str, false, zzgfVar);
    }

    @Override // com.google.android.libraries.places.internal.zzek
    protected final String zze() {
        return "autocomplete/json";
    }

    @Override // com.google.android.libraries.places.internal.zzek
    public final Map zzf() {
        HashMap hashMap = new HashMap();
        FindAutocompletePredictionsRequest findAutocompletePredictionsRequest = (FindAutocompletePredictionsRequest) zzb();
        TypeFilter typeFilter = findAutocompletePredictionsRequest.getTypeFilter();
        List<String> typesFilter = findAutocompletePredictionsRequest.getTypesFilter();
        String query = findAutocompletePredictionsRequest.getQuery();
        zzek.zzg(hashMap, "input", query == null ? null : query.replaceFirst("^\\s+", "").replaceFirst("\\s+$", " "), null);
        if (!typesFilter.isEmpty()) {
            zzek.zzg(hashMap, "types", TextUtils.join("|", typesFilter), null);
        } else {
            zzek.zzg(hashMap, "types", typeFilter != null ? zzfe.zza(typeFilter) : null, null);
        }
        zzek.zzg(hashMap, "sessiontoken", findAutocompletePredictionsRequest.getSessionToken(), null);
        zzek.zzg(hashMap, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, zzfc.zzd(findAutocompletePredictionsRequest.getOrigin()), null);
        zzek.zzg(hashMap, "locationbias", zzfc.zze(findAutocompletePredictionsRequest.getLocationBias()), null);
        zzek.zzg(hashMap, "locationrestriction", zzfc.zzf(findAutocompletePredictionsRequest.getLocationRestriction()), null);
        zzek.zzg(hashMap, "components", zzfc.zzb(findAutocompletePredictionsRequest.getCountries()), null);
        return hashMap;
    }
}