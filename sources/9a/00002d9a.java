package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;

/* loaded from: classes3.dex */
public interface IGoogleMapDelegate extends IInterface {
    com.google.android.gms.internal.maps.zzl addCircle(CircleOptions circleOptions);

    com.google.android.gms.internal.maps.zzo addGroundOverlay(GroundOverlayOptions groundOverlayOptions);

    com.google.android.gms.internal.maps.zzx addMarker(MarkerOptions markerOptions);

    com.google.android.gms.internal.maps.zzaa addPolygon(PolygonOptions polygonOptions);

    com.google.android.gms.internal.maps.zzad addPolyline(PolylineOptions polylineOptions);

    com.google.android.gms.internal.maps.zzag addTileOverlay(TileOverlayOptions tileOverlayOptions);

    void animateCamera(IObjectWrapper iObjectWrapper);

    void animateCameraWithCallback(IObjectWrapper iObjectWrapper, zzd zzdVar);

    void animateCameraWithDurationAndCallback(IObjectWrapper iObjectWrapper, int i11, zzd zzdVar);

    void clear();

    CameraPosition getCameraPosition();

    com.google.android.gms.internal.maps.zzr getFocusedBuilding();

    void getMapAsync(zzar zzarVar);

    int getMapType();

    float getMaxZoomLevel();

    float getMinZoomLevel();

    Location getMyLocation();

    IProjectionDelegate getProjection();

    IUiSettingsDelegate getUiSettings();

    boolean isBuildingsEnabled();

    boolean isIndoorEnabled();

    boolean isMyLocationEnabled();

    boolean isTrafficEnabled();

    void moveCamera(IObjectWrapper iObjectWrapper);

    void onCreate(Bundle bundle);

    void onDestroy();

    void onEnterAmbient(Bundle bundle);

    void onExitAmbient();

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();

    void resetMinMaxZoomPreference();

    void setBuildingsEnabled(boolean z11);

    void setContentDescription(String str);

    boolean setIndoorEnabled(boolean z11);

    void setInfoWindowAdapter(zzi zziVar);

    void setLatLngBoundsForCameraTarget(LatLngBounds latLngBounds);

    void setLocationSource(ILocationSourceDelegate iLocationSourceDelegate);

    boolean setMapStyle(MapStyleOptions mapStyleOptions);

    void setMapType(int i11);

    void setMaxZoomPreference(float f11);

    void setMinZoomPreference(float f11);

    void setMyLocationEnabled(boolean z11);

    void setOnCameraChangeListener(zzn zznVar);

    void setOnCameraIdleListener(zzp zzpVar);

    void setOnCameraMoveCanceledListener(zzr zzrVar);

    void setOnCameraMoveListener(zzt zztVar);

    void setOnCameraMoveStartedListener(zzv zzvVar);

    void setOnCircleClickListener(zzx zzxVar);

    void setOnGroundOverlayClickListener(zzz zzzVar);

    void setOnIndoorStateChangeListener(zzab zzabVar);

    void setOnInfoWindowClickListener(zzad zzadVar);

    void setOnInfoWindowCloseListener(zzaf zzafVar);

    void setOnInfoWindowLongClickListener(zzah zzahVar);

    void setOnMapClickListener(zzal zzalVar);

    void setOnMapLoadedCallback(zzan zzanVar);

    void setOnMapLongClickListener(zzap zzapVar);

    void setOnMarkerClickListener(zzat zzatVar);

    void setOnMarkerDragListener(zzav zzavVar);

    void setOnMyLocationButtonClickListener(zzax zzaxVar);

    void setOnMyLocationChangeListener(zzaz zzazVar);

    void setOnMyLocationClickListener(zzbb zzbbVar);

    void setOnPoiClickListener(zzbd zzbdVar);

    void setOnPolygonClickListener(zzbf zzbfVar);

    void setOnPolylineClickListener(zzbh zzbhVar);

    void setPadding(int i11, int i12, int i13, int i14);

    void setTrafficEnabled(boolean z11);

    void setWatermarkEnabled(boolean z11);

    void snapshot(zzbu zzbuVar, IObjectWrapper iObjectWrapper);

    void snapshotForTest(zzbu zzbuVar);

    void stopAnimation();

    boolean useViewLifecycleWhenInFragment();
}