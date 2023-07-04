package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.PlacesClient;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzhf implements zzgy {
    public static final /* synthetic */ int zza = 0;
    private static final zziy zzb = zziy.zzo(Place.Field.ID, Place.Field.TYPES);
    private final PlacesClient zzc;
    private final zzgr zzd;
    private final AutocompleteSessionToken zze;
    private zzhb zzf;
    private zzhc zzg;

    public zzhf(PlacesClient placesClient, zzgr zzgrVar, AutocompleteSessionToken autocompleteSessionToken) {
        this.zzc = placesClient;
        this.zzd = zzgrVar;
        this.zze = autocompleteSessionToken;
    }

    @Override // com.google.android.libraries.places.internal.zzgy
    public final Task zza(AutocompletePrediction autocompletePrediction) {
        if (zzb.containsAll(this.zzd.zzj())) {
            Place.Builder builder = Place.builder();
            builder.setId(autocompletePrediction.getPlaceId());
            builder.setTypes(autocompletePrediction.getPlaceTypes().isEmpty() ? null : autocompletePrediction.getPlaceTypes());
            return Tasks.forResult(FetchPlaceResponse.newInstance(builder.build()));
        }
        zzhc zzhcVar = this.zzg;
        if (zzhcVar != null) {
            if (zzhcVar.zzb().equals(autocompletePrediction.getPlaceId())) {
                Task zzc = zzhcVar.zzc();
                Objects.requireNonNull(zzc);
                return zzc;
            }
            zzhcVar.zza().cancel();
        }
        final zzgx zzgxVar = new zzgx(new CancellationTokenSource(), autocompletePrediction.getPlaceId());
        this.zzg = zzgxVar;
        PlacesClient placesClient = this.zzc;
        FetchPlaceRequest.Builder builder2 = FetchPlaceRequest.builder(autocompletePrediction.getPlaceId(), this.zzd.zzj());
        builder2.setSessionToken(this.zze);
        builder2.setCancellationToken(zzgxVar.zza().getToken());
        Task continueWithTask = placesClient.fetchPlace(builder2.build()).continueWithTask(new Continuation() { // from class: com.google.android.libraries.places.internal.zzgz
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                zzhc zzhcVar2 = zzhc.this;
                int i11 = zzhf.zza;
                return zzhcVar2.zza().getToken().isCancellationRequested() ? Tasks.forCanceled() : task;
            }
        });
        zzgxVar.zzd(continueWithTask);
        return continueWithTask;
    }

    @Override // com.google.android.libraries.places.internal.zzgy
    public final Task zzb(String str) {
        zzig.zzd(!TextUtils.isEmpty(str));
        zzhb zzhbVar = this.zzf;
        if (zzhbVar != null) {
            if (zzhbVar.zzb().equals(str)) {
                Task zzc = zzhbVar.zzc();
                Objects.requireNonNull(zzc);
                return zzc;
            }
            zzhbVar.zza().cancel();
        }
        final zzgw zzgwVar = new zzgw(new CancellationTokenSource(), str);
        this.zzf = zzgwVar;
        PlacesClient placesClient = this.zzc;
        FindAutocompletePredictionsRequest.Builder builder = FindAutocompletePredictionsRequest.builder();
        builder.setQuery(str);
        builder.setLocationBias(this.zzd.zzc());
        builder.setLocationRestriction(this.zzd.zzd());
        builder.setCountries(this.zzd.zzi());
        builder.setTypeFilter(this.zzd.zze());
        builder.setTypesFilter(this.zzd.zzk());
        builder.setSessionToken(this.zze);
        builder.setCancellationToken(zzgwVar.zza().getToken());
        Task continueWithTask = placesClient.findAutocompletePredictions(builder.build()).continueWithTask(new Continuation() { // from class: com.google.android.libraries.places.internal.zzha
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                zzhb zzhbVar2 = zzhb.this;
                int i11 = zzhf.zza;
                return zzhbVar2.zza().getToken().isCancellationRequested() ? Tasks.forCanceled() : task;
            }
        });
        zzgwVar.zzd(continueWithTask);
        return continueWithTask;
    }

    @Override // com.google.android.libraries.places.internal.zzgy
    public final void zzc() {
        zzhb zzhbVar = this.zzf;
        if (zzhbVar != null) {
            zzhbVar.zza().cancel();
        }
        zzhc zzhcVar = this.zzg;
        if (zzhcVar != null) {
            zzhcVar.zza().cancel();
        }
        this.zzf = null;
        this.zzg = null;
    }
}