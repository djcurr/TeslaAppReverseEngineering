package com.google.android.gms.maps.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* loaded from: classes3.dex */
public interface zzf extends IInterface {
    int zzd();

    ICameraUpdateFactoryDelegate zze();

    IMapFragmentDelegate zzf(IObjectWrapper iObjectWrapper);

    IMapViewDelegate zzg(IObjectWrapper iObjectWrapper, GoogleMapOptions googleMapOptions);

    IStreetViewPanoramaFragmentDelegate zzh(IObjectWrapper iObjectWrapper);

    IStreetViewPanoramaViewDelegate zzi(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions);

    com.google.android.gms.internal.maps.zzi zzj();

    void zzk(IObjectWrapper iObjectWrapper, int i11);

    void zzl(IObjectWrapper iObjectWrapper, int i11);
}