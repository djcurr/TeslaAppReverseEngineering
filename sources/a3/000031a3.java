package com.google.android.libraries.places.api.net;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
final class zzi extends FindAutocompletePredictionsRequest.Builder {
    private String zza;
    private LocationBias zzb;
    private LocationRestriction zzc;
    private LatLng zzd;
    private List zze;
    private AutocompleteSessionToken zzf;
    private TypeFilter zzg;
    private List zzh;
    private CancellationToken zzi;

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final CancellationToken getCancellationToken() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final List<String> getCountries() {
        List<String> list = this.zze;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"countries\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final LocationBias getLocationBias() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final LocationRestriction getLocationRestriction() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final LatLng getOrigin() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final String getQuery() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final AutocompleteSessionToken getSessionToken() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final TypeFilter getTypeFilter() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final List<String> getTypesFilter() {
        List<String> list = this.zzh;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"typesFilter\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setCancellationToken(CancellationToken cancellationToken) {
        this.zzi = cancellationToken;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setCountries(List<String> list) {
        Objects.requireNonNull(list, "Null countries");
        this.zze = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setLocationBias(LocationBias locationBias) {
        this.zzb = locationBias;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setLocationRestriction(LocationRestriction locationRestriction) {
        this.zzc = locationRestriction;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setOrigin(LatLng latLng) {
        this.zzd = latLng;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setQuery(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setSessionToken(AutocompleteSessionToken autocompleteSessionToken) {
        this.zzf = autocompleteSessionToken;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setTypeFilter(TypeFilter typeFilter) {
        this.zzg = typeFilter;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setTypesFilter(List<String> list) {
        Objects.requireNonNull(list, "Null typesFilter");
        this.zzh = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    final FindAutocompletePredictionsRequest zza() {
        List list;
        List list2 = this.zze;
        if (list2 != null && (list = this.zzh) != null) {
            return new zzk(this.zza, this.zzb, this.zzc, this.zzd, list2, this.zzf, this.zzg, list, this.zzi, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zze == null) {
            sb2.append(" countries");
        }
        if (this.zzh == null) {
            sb2.append(" typesFilter");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}