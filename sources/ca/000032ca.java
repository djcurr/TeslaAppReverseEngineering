package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;

/* loaded from: classes3.dex */
public interface zzcs {
    Task zza(FetchPhotoRequest fetchPhotoRequest);

    Task zzb(FetchPlaceRequest fetchPlaceRequest);

    Task zzc(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest);

    Task zzd(FindCurrentPlaceRequest findCurrentPlaceRequest, Location location, zziy zziyVar);
}