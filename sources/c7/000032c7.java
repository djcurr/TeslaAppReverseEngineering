package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzcp implements zzfr {
    private final zzfz zza;
    private final zzgd zzb;
    private final zzfs zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcp(zzgd zzgdVar, zzfz zzfzVar, zzfs zzfsVar, byte[] bArr) {
        this.zzb = zzgdVar;
        this.zza = zzfzVar;
        this.zzc = zzfsVar;
    }

    static final int zzi(Task task) {
        ApiException apiException;
        if (task.isSuccessful()) {
            return 2;
        }
        Exception exception = task.getException();
        Objects.requireNonNull(exception);
        if (exception instanceof ApiException) {
            apiException = (ApiException) exception;
        } else {
            apiException = new ApiException(new Status(13, exception.getMessage()));
        }
        int statusCode = apiException.getStatusCode();
        if (statusCode != 7) {
            return statusCode != 15 ? 1 : 3;
        }
        return 4;
    }

    private final zzaay zzj() {
        Locale zzb = this.zzc.zzb();
        Locale locale = Locale.getDefault();
        zzaay zza = zzaba.zza();
        zza.zzd(zzb.toString());
        if (!zzb.equals(locale)) {
            zza.zzb(locale.toString());
        }
        return zza;
    }

    private final void zzk(zzyh zzyhVar) {
        zzzj zzb = zzge.zzb(this.zza);
        zzb.zzl(16);
        zzb.zze(zzyhVar);
        zzb.zza(this.zzc.zza());
        zzl((zzzo) zzb.zzq());
    }

    private final void zzl(zzzo zzzoVar) {
        this.zzb.zza(zzge.zza(zzzoVar));
    }

    @Override // com.google.android.libraries.places.internal.zzfr
    public final void zza(FetchPhotoRequest fetchPhotoRequest) {
        zzaaq zza = zzaas.zza();
        zza.zza(2);
        zzzj zzb = zzge.zzb(this.zza);
        zzb.zzl(5);
        zzb.zzg((zzaas) zza.zzq());
        zzb.zza(this.zzc.zza());
        zzl((zzzo) zzb.zzq());
    }

    @Override // com.google.android.libraries.places.internal.zzfr
    public final void zzb(Task task, long j11, long j12) {
        zzyc zza = zzyh.zza();
        zza.zzf(15);
        zza.zze(zzi(task));
        zza.zzd((int) (j12 - j11));
        zzk((zzyh) zza.zzq());
    }

    @Override // com.google.android.libraries.places.internal.zzfr
    public final void zzc(FetchPlaceRequest fetchPlaceRequest) {
        zzzu zza = zzzv.zza();
        zza.zza(1);
        zzaat zza2 = zzaau.zza();
        zza2.zza(zzfd.zzb(fetchPlaceRequest.getPlaceFields()));
        zza.zzb((zzaau) zza2.zzq());
        zzaay zzj = zzj();
        zzj.zze(5);
        zzj.zzc((zzzv) zza.zzq());
        zzzj zzb = zzge.zzb(this.zza);
        zzb.zzl(1);
        zzb.zzh((zzaba) zzj.zzq());
        zzb.zza(this.zzc.zza());
        AutocompleteSessionToken sessionToken = fetchPlaceRequest.getSessionToken();
        if (sessionToken != null) {
            zzb.zzj(sessionToken.toString());
        }
        zzl((zzzo) zzb.zzq());
    }

    @Override // com.google.android.libraries.places.internal.zzfr
    public final void zzd(Task task, long j11, long j12) {
        boolean isSuccessful = task.isSuccessful();
        zzxu zza = zzxv.zza();
        zza.zza(1);
        zza.zzb(isSuccessful ? 1 : 0);
        zzyc zza2 = zzyh.zza();
        zza2.zzf(8);
        zza2.zzc((zzxv) zza.zzq());
        zza2.zze(zzi(task));
        zza2.zzd((int) (j12 - j11));
        zzk((zzyh) zza2.zzq());
    }

    @Override // com.google.android.libraries.places.internal.zzfr
    public final void zze(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest) {
        zzyl zza = zzym.zza();
        TypeFilter typeFilter = findAutocompletePredictionsRequest.getTypeFilter();
        if (typeFilter != null) {
            zza.zza(zzfe.zza(typeFilter));
        }
        zzym zzymVar = (zzym) zza.zzq();
        zzyx zza2 = zzyy.zza();
        if (zzymVar != null) {
            zza2.zza(zzymVar);
        }
        zzaay zzj = zzj();
        zzj.zze(6);
        zzj.zza((zzyy) zza2.zzq());
        zzzj zzb = zzge.zzb(this.zza);
        zzb.zzl(1);
        zzb.zzh((zzaba) zzj.zzq());
        zzb.zza(this.zzc.zza());
        AutocompleteSessionToken sessionToken = findAutocompletePredictionsRequest.getSessionToken();
        if (sessionToken != null) {
            zzb.zzj(sessionToken.toString());
        }
        zzl((zzzo) zzb.zzq());
    }

    @Override // com.google.android.libraries.places.internal.zzfr
    public final void zzf(Task task, long j11, long j12) {
        int size = task.isSuccessful() ? ((FindAutocompletePredictionsResponse) task.getResult()).getAutocompletePredictions().size() : 0;
        zzxp zza = zzxq.zza();
        zza.zza(size);
        zzyc zza2 = zzyh.zza();
        zza2.zzf(6);
        zza2.zzb((zzxq) zza.zzq());
        zza2.zze(zzi(task));
        zza2.zzd((int) (j12 - j11));
        zzk((zzyh) zza2.zzq());
    }

    @Override // com.google.android.libraries.places.internal.zzfr
    public final void zzg(FindCurrentPlaceRequest findCurrentPlaceRequest, Task task, long j11, long j12) {
        int i11 = true == task.isSuccessful() ? 2 : 1;
        zzaaa zza = zzaac.zza();
        zzaat zza2 = zzaau.zza();
        zza2.zza(zzfd.zzb(findCurrentPlaceRequest.getPlaceFields()));
        zza.zzb((zzaau) zza2.zzq());
        zza.zza((int) (j12 - j11));
        zza.zzc(i11);
        zzzj zzb = zzge.zzb(this.zza);
        zzb.zzl(6);
        zzb.zzd((zzaac) zza.zzq());
        zzb.zza(this.zzc.zza());
        zzl((zzzo) zzb.zzq());
    }

    @Override // com.google.android.libraries.places.internal.zzfr
    public final void zzh(Task task, long j11, long j12) {
        int size = task.isSuccessful() ? ((FindCurrentPlaceResponse) task.getResult()).getPlaceLikelihoods().size() : 0;
        zzxi zza = zzxj.zza();
        zza.zza(size);
        zzyc zza2 = zzyh.zza();
        zza2.zzf(4);
        zza2.zza((zzxj) zza.zzq());
        zza2.zze(zzi(task));
        zza2.zzd((int) (j12 - j11));
        zzk((zzyh) zza2.zzq());
    }
}