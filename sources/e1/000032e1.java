package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.PlacesClient;

/* loaded from: classes3.dex */
public final class zzdo implements PlacesClient {
    private final zzcs zza;
    private final zzci zzb;
    private final zzcn zzc;
    private final zzfr zzd;
    private final zzbx zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdo(zzcs zzcsVar, zzci zzciVar, zzcn zzcnVar, zzfr zzfrVar, zzbx zzbxVar) {
        this.zza = zzcsVar;
        this.zzb = zzciVar;
        this.zzc = zzcnVar;
        this.zzd = zzfrVar;
        this.zze = zzbxVar;
    }

    private static void zzg(zzcf zzcfVar, zzcg zzcgVar) {
        zzcf.zza(zzcfVar, zzcf.zzb("Duration"));
        zzcc.zza();
        zzcc.zza();
        zzcf.zza(zzcfVar, zzcf.zzb("Battery"));
        zzcc.zza();
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<FetchPhotoResponse> fetchPhoto(final FetchPhotoRequest fetchPhotoRequest) {
        try {
            zzig.zzc(fetchPhotoRequest, "Request must not be null.");
            zzcc.zza();
            final zzcg zza = zzcg.zza();
            return this.zza.zza(fetchPhotoRequest).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzdi
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return zzdo.this.zzc(fetchPhotoRequest, zza, task);
                }
            }).continueWithTask(zzdj.zza);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<FetchPlaceResponse> fetchPlace(final FetchPlaceRequest fetchPlaceRequest) {
        try {
            zzig.zzc(fetchPlaceRequest, "Request must not be null.");
            zzcc.zza();
            final zzcg zza = zzcg.zza();
            return this.zza.zzb(fetchPlaceRequest).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzdm
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return zzdo.this.zzd(fetchPlaceRequest, zza, task);
                }
            }).continueWithTask(zzdj.zza);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<FindAutocompletePredictionsResponse> findAutocompletePredictions(final FindAutocompletePredictionsRequest findAutocompletePredictionsRequest) {
        try {
            zzig.zzc(findAutocompletePredictionsRequest, "Request must not be null.");
            zzcc.zza();
            final zzcg zza = zzcg.zza();
            return this.zza.zzc(findAutocompletePredictionsRequest).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzdn
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return zzdo.this.zze(findAutocompletePredictionsRequest, zza, task);
                }
            }).continueWithTask(zzdj.zza);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<FindCurrentPlaceResponse> findCurrentPlace(FindCurrentPlaceRequest findCurrentPlaceRequest) {
        return zza(findCurrentPlaceRequest, null);
    }

    public final Task zza(final FindCurrentPlaceRequest findCurrentPlaceRequest, String str) {
        try {
            zzig.zzc(findCurrentPlaceRequest, "Request must not be null.");
            final long zza = this.zze.zza();
            zzcc.zza();
            final zzcg zza2 = zzcg.zza();
            return this.zzb.zza(findCurrentPlaceRequest.getCancellationToken()).onSuccessTask(new SuccessContinuation(findCurrentPlaceRequest, null) { // from class: com.google.android.libraries.places.internal.zzdk
                public final /* synthetic */ FindCurrentPlaceRequest zzb;

                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    return zzdo.this.zzb(this.zzb, null, (Location) obj);
                }
            }).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzdl
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return zzdo.this.zzf(findCurrentPlaceRequest, zza, zza2, task);
                }
            }).continueWithTask(zzdj.zza);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Task zzb(FindCurrentPlaceRequest findCurrentPlaceRequest, String str, Location location) {
        zzig.zzc(location, "Location must not be null.");
        return this.zza.zzd(findCurrentPlaceRequest, location, this.zzc.zza(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ FetchPhotoResponse zzc(FetchPhotoRequest fetchPhotoRequest, zzcg zzcgVar, Task task) {
        this.zzd.zza(fetchPhotoRequest);
        zzg(zzcf.zzb("FetchPhoto"), zzcgVar);
        return (FetchPhotoResponse) task.getResult();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ FetchPlaceResponse zzd(FetchPlaceRequest fetchPlaceRequest, zzcg zzcgVar, Task task) {
        this.zzd.zzc(fetchPlaceRequest);
        zzg(zzcf.zzb("FetchPlace"), zzcgVar);
        return (FetchPlaceResponse) task.getResult();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ FindAutocompletePredictionsResponse zze(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, zzcg zzcgVar, Task task) {
        this.zzd.zze(findAutocompletePredictionsRequest);
        zzg(zzcf.zzb("FindAutocompletePredictions"), zzcgVar);
        return (FindAutocompletePredictionsResponse) task.getResult();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ FindCurrentPlaceResponse zzf(FindCurrentPlaceRequest findCurrentPlaceRequest, long j11, zzcg zzcgVar, Task task) {
        this.zzd.zzg(findCurrentPlaceRequest, task, j11, this.zze.zza());
        zzg(zzcf.zzb("FindCurrentPlace"), zzcgVar);
        return (FindCurrentPlaceResponse) task.getResult();
    }
}