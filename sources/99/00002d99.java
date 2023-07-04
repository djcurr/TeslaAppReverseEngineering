package com.google.android.gms.maps.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes3.dex */
public interface ICameraUpdateFactoryDelegate extends IInterface {
    IObjectWrapper newCameraPosition(CameraPosition cameraPosition);

    IObjectWrapper newLatLng(LatLng latLng);

    IObjectWrapper newLatLngBounds(LatLngBounds latLngBounds, int i11);

    IObjectWrapper newLatLngBoundsWithSize(LatLngBounds latLngBounds, int i11, int i12, int i13);

    IObjectWrapper newLatLngZoom(LatLng latLng, float f11);

    IObjectWrapper scrollBy(float f11, float f12);

    IObjectWrapper zoomBy(float f11);

    IObjectWrapper zoomByWithFocus(float f11, int i11, int i12);

    IObjectWrapper zoomIn();

    IObjectWrapper zoomOut();

    IObjectWrapper zoomTo(float f11);
}