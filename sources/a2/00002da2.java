package com.google.android.gms.maps.internal;

import android.os.IInterface;

/* loaded from: classes3.dex */
public interface IUiSettingsDelegate extends IInterface {
    boolean isCompassEnabled();

    boolean isIndoorLevelPickerEnabled();

    boolean isMapToolbarEnabled();

    boolean isMyLocationButtonEnabled();

    boolean isRotateGesturesEnabled();

    boolean isScrollGesturesEnabled();

    boolean isScrollGesturesEnabledDuringRotateOrZoom();

    boolean isTiltGesturesEnabled();

    boolean isZoomControlsEnabled();

    boolean isZoomGesturesEnabled();

    void setAllGesturesEnabled(boolean z11);

    void setCompassEnabled(boolean z11);

    void setIndoorLevelPickerEnabled(boolean z11);

    void setMapToolbarEnabled(boolean z11);

    void setMyLocationButtonEnabled(boolean z11);

    void setRotateGesturesEnabled(boolean z11);

    void setScrollGesturesEnabled(boolean z11);

    void setScrollGesturesEnabledDuringRotateOrZoom(boolean z11);

    void setTiltGesturesEnabled(boolean z11);

    void setZoomControlsEnabled(boolean z11);

    void setZoomGesturesEnabled(boolean z11);
}