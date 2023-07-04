package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;

/* loaded from: classes3.dex */
public interface zzfr {
    void zza(FetchPhotoRequest fetchPhotoRequest);

    void zzb(Task task, long j11, long j12);

    void zzc(FetchPlaceRequest fetchPlaceRequest);

    void zzd(Task task, long j11, long j12);

    void zze(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest);

    void zzf(Task task, long j11, long j12);

    void zzg(FindCurrentPlaceRequest findCurrentPlaceRequest, Task task, long j11, long j12);

    void zzh(Task task, long j11, long j12);
}