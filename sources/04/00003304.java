package com.google.android.libraries.places.internal;

import android.location.Location;
import android.text.TextUtils;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.places.api.model.PlaceLikelihood;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzeu implements zzcs {
    private final zzgf zza;
    private final zzcx zzb;
    private final zzdd zzc;
    private final zzfr zzd;
    private final zzbx zze;
    private final zzdv zzf;
    private final zzdz zzg;
    private final zzed zzh;
    private final zzeh zzi;
    private final zzfs zzj;

    public zzeu(zzfs zzfsVar, zzgf zzgfVar, zzcx zzcxVar, zzdd zzddVar, zzfr zzfrVar, zzbx zzbxVar, zzdv zzdvVar, zzdz zzdzVar, zzed zzedVar, zzeh zzehVar, byte[] bArr) {
        this.zzj = zzfsVar;
        this.zza = zzgfVar;
        this.zzb = zzcxVar;
        this.zzc = zzddVar;
        this.zzd = zzfrVar;
        this.zze = zzbxVar;
        this.zzf = zzdvVar;
        this.zzg = zzdzVar;
        this.zzh = zzedVar;
        this.zzi = zzehVar;
    }

    public static final /* synthetic */ FetchPlaceResponse zzi(Task task) {
        zzdy zzdyVar = (zzdy) task.getResult();
        int zza = zzfb.zza(zzdyVar.status);
        if (!PlacesStatusCodes.isError(zza)) {
            zzfa zzfaVar = zzdyVar.result;
            String[] strArr = zzdyVar.htmlAttributions;
            return FetchPlaceResponse.newInstance(zzex.zzc(zzfaVar, strArr != null ? zziy.zzl(strArr) : null));
        }
        throw new ApiException(new Status(zza, zzfb.zzb(zzdyVar.status, zzdyVar.errorMessage)));
    }

    public static final /* synthetic */ FindCurrentPlaceResponse zzj(Task task) {
        zzeg zzegVar = (zzeg) task.getResult();
        int zza = zzfb.zza(zzegVar.status);
        if (!PlacesStatusCodes.isError(zza)) {
            ArrayList arrayList = new ArrayList();
            zzez[] zzezVarArr = zzegVar.predictions;
            if (zzezVarArr != null) {
                for (zzez zzezVar : zzezVarArr) {
                    if (zzezVar.zza() != null) {
                        Double zzb = zzezVar.zzb();
                        if (zzb != null) {
                            zzfa zza2 = zzezVar.zza();
                            String[] strArr = zzegVar.htmlAttributions;
                            arrayList.add(PlaceLikelihood.newInstance(zzex.zzc(zza2, strArr != null ? zziy.zzl(strArr) : null), zzb.doubleValue()));
                        } else {
                            throw new ApiException(new Status(8, "Unexpected server error: PlaceLikelihood returned without a likelihood value"));
                        }
                    } else {
                        throw new ApiException(new Status(8, "Unexpected server error: PlaceLikelihood returned without a Place value"));
                    }
                }
            }
            return FindCurrentPlaceResponse.newInstance(arrayList);
        }
        throw new ApiException(new Status(zza, zzfb.zzb(zzegVar.status, zzegVar.errorMessage)));
    }

    @Override // com.google.android.libraries.places.internal.zzcs
    public final Task zza(FetchPhotoRequest fetchPhotoRequest) {
        Integer maxWidth = fetchPhotoRequest.getMaxWidth();
        Integer maxHeight = fetchPhotoRequest.getMaxHeight();
        if (maxWidth == null && maxHeight == null) {
            return Tasks.forException(new ApiException(new Status((int) PlacesStatusCodes.INVALID_REQUEST, "Must include max width or max height in request.")));
        }
        if (maxWidth != null && maxWidth.intValue() <= 0) {
            return Tasks.forException(new ApiException(new Status((int) PlacesStatusCodes.INVALID_REQUEST, String.format("Max Width must not be < 1, but was: %d.", maxWidth))));
        }
        if (maxHeight != null && maxHeight.intValue() <= 0) {
            return Tasks.forException(new ApiException(new Status((int) PlacesStatusCodes.INVALID_REQUEST, String.format("Max Height must not be < 1, but was: %d.", maxHeight))));
        }
        String zza = this.zzj.zza();
        this.zzj.zze();
        zzdr zzdrVar = new zzdr(fetchPhotoRequest, zza, false, this.zza);
        final long zza2 = this.zze.zza();
        return this.zzc.zzb(zzdrVar, new zzds()).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzes
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return FetchPhotoResponse.newInstance(((zzdu) task.getResult()).zza);
            }
        }).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzet
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return zzeu.this.zze(zza2, task);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.zzcs
    public final Task zzb(FetchPlaceRequest fetchPlaceRequest) {
        if (TextUtils.isEmpty(fetchPlaceRequest.getPlaceId())) {
            return Tasks.forException(new ApiException(new Status((int) PlacesStatusCodes.INVALID_REQUEST, "Place ID must not be empty.")));
        }
        if (fetchPlaceRequest.getPlaceFields().isEmpty()) {
            return Tasks.forException(new ApiException(new Status((int) PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty.")));
        }
        Locale zzb = this.zzj.zzb();
        String zza = this.zzj.zza();
        this.zzj.zze();
        zzdx zzdxVar = new zzdx(fetchPlaceRequest, zzb, zza, false, this.zza);
        final long zza2 = this.zze.zza();
        return this.zzb.zza(zzdxVar, zzdy.class).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzeo
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return zzeu.zzi(task);
            }
        }).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzep
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return zzeu.this.zzf(zza2, task);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.zzcs
    public final Task zzc(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest) {
        String query = findAutocompletePredictionsRequest.getQuery();
        if (query != null && !TextUtils.isEmpty(query.trim())) {
            Locale zzb = this.zzj.zzb();
            String zza = this.zzj.zza();
            this.zzj.zze();
            zzeb zzebVar = new zzeb(findAutocompletePredictionsRequest, zzb, zza, false, this.zza);
            final long zza2 = this.zze.zza();
            return this.zzb.zza(zzebVar, zzec.class).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzem
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return zzed.zza((zzec) task.getResult());
                }
            }).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzen
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return zzeu.this.zzg(zza2, task);
                }
            });
        }
        return Tasks.forResult(FindAutocompletePredictionsResponse.newInstance(zziy.zzm()));
    }

    @Override // com.google.android.libraries.places.internal.zzcs
    public final Task zzd(FindCurrentPlaceRequest findCurrentPlaceRequest, Location location, zziy zziyVar) {
        if (findCurrentPlaceRequest.getPlaceFields().isEmpty()) {
            return Tasks.forException(new ApiException(new Status((int) PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty.")));
        }
        Locale zzb = this.zzj.zzb();
        String zza = this.zzj.zza();
        this.zzj.zze();
        zzef zzefVar = new zzef(findCurrentPlaceRequest, location, zziyVar, zzb, zza, false, this.zza);
        final long zza2 = this.zze.zza();
        return this.zzb.zza(zzefVar, zzeg.class).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzeq
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return zzeu.zzj(task);
            }
        }).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzer
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return zzeu.this.zzh(zza2, task);
            }
        });
    }

    public final /* synthetic */ FetchPhotoResponse zze(long j11, Task task) {
        this.zzd.zzb(task, j11, this.zze.zza());
        return (FetchPhotoResponse) task.getResult();
    }

    public final /* synthetic */ FetchPlaceResponse zzf(long j11, Task task) {
        this.zzd.zzd(task, j11, this.zze.zza());
        return (FetchPlaceResponse) task.getResult();
    }

    public final /* synthetic */ FindAutocompletePredictionsResponse zzg(long j11, Task task) {
        this.zzd.zzf(task, j11, this.zze.zza());
        return (FindAutocompletePredictionsResponse) task.getResult();
    }

    public final /* synthetic */ FindCurrentPlaceResponse zzh(long j11, Task task) {
        this.zzd.zzh(task, j11, this.zze.zza());
        return (FindCurrentPlaceResponse) task.getResult();
    }
}