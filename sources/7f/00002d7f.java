package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

@SafeParcelable.Class(creator = "GoogleMapOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new zzab();
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZOrderOnTopForParcel", id = 2, type = "byte")
    private Boolean zza;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getUseViewLifecycleInFragmentForParcel", id = 3, type = "byte")
    private Boolean zzb;
    @SafeParcelable.Field(getter = "getMapType", id = 4)
    private int zzc;
    @SafeParcelable.Field(getter = "getCamera", id = 5)
    private CameraPosition zzd;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomControlsEnabledForParcel", id = 6, type = "byte")
    private Boolean zze;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getCompassEnabledForParcel", id = 7, type = "byte")
    private Boolean zzf;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledForParcel", id = 8, type = "byte")
    private Boolean zzg;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomGesturesEnabledForParcel", id = 9, type = "byte")
    private Boolean zzh;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getTiltGesturesEnabledForParcel", id = 10, type = "byte")
    private Boolean zzi;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getRotateGesturesEnabledForParcel", id = 11, type = "byte")
    private Boolean zzj;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLiteModeForParcel", id = 12, type = "byte")
    private Boolean zzk;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getMapToolbarEnabledForParcel", id = 14, type = "byte")
    private Boolean zzl;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getAmbientEnabledForParcel", id = 15, type = "byte")
    private Boolean zzm;
    @SafeParcelable.Field(getter = "getMinZoomPreference", id = 16)
    private Float zzn;
    @SafeParcelable.Field(getter = "getMaxZoomPreference", id = 17)
    private Float zzo;
    @SafeParcelable.Field(getter = "getLatLngBoundsForCameraTarget", id = 18)
    private LatLngBounds zzp;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledDuringRotateOrZoomForParcel", id = 19, type = "byte")
    private Boolean zzq;
    @SafeParcelable.Field(getter = "getBackgroundColor", id = 20)
    private Integer zzr;
    @SafeParcelable.Field(getter = "getMapId", id = 21)
    private String zzs;

    public GoogleMapOptions() {
        this.zzc = -1;
        this.zzn = null;
        this.zzo = null;
        this.zzp = null;
        this.zzr = null;
        this.zzs = null;
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        int i11 = R.styleable.MapAttrs_mapType;
        if (obtainAttributes.hasValue(i11)) {
            googleMapOptions.mapType(obtainAttributes.getInt(i11, -1));
        }
        int i12 = R.styleable.MapAttrs_zOrderOnTop;
        if (obtainAttributes.hasValue(i12)) {
            googleMapOptions.zOrderOnTop(obtainAttributes.getBoolean(i12, false));
        }
        int i13 = R.styleable.MapAttrs_useViewLifecycle;
        if (obtainAttributes.hasValue(i13)) {
            googleMapOptions.useViewLifecycleInFragment(obtainAttributes.getBoolean(i13, false));
        }
        int i14 = R.styleable.MapAttrs_uiCompass;
        if (obtainAttributes.hasValue(i14)) {
            googleMapOptions.compassEnabled(obtainAttributes.getBoolean(i14, true));
        }
        int i15 = R.styleable.MapAttrs_uiRotateGestures;
        if (obtainAttributes.hasValue(i15)) {
            googleMapOptions.rotateGesturesEnabled(obtainAttributes.getBoolean(i15, true));
        }
        int i16 = R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom;
        if (obtainAttributes.hasValue(i16)) {
            googleMapOptions.scrollGesturesEnabledDuringRotateOrZoom(obtainAttributes.getBoolean(i16, true));
        }
        int i17 = R.styleable.MapAttrs_uiScrollGestures;
        if (obtainAttributes.hasValue(i17)) {
            googleMapOptions.scrollGesturesEnabled(obtainAttributes.getBoolean(i17, true));
        }
        int i18 = R.styleable.MapAttrs_uiTiltGestures;
        if (obtainAttributes.hasValue(i18)) {
            googleMapOptions.tiltGesturesEnabled(obtainAttributes.getBoolean(i18, true));
        }
        int i19 = R.styleable.MapAttrs_uiZoomGestures;
        if (obtainAttributes.hasValue(i19)) {
            googleMapOptions.zoomGesturesEnabled(obtainAttributes.getBoolean(i19, true));
        }
        int i21 = R.styleable.MapAttrs_uiZoomControls;
        if (obtainAttributes.hasValue(i21)) {
            googleMapOptions.zoomControlsEnabled(obtainAttributes.getBoolean(i21, true));
        }
        int i22 = R.styleable.MapAttrs_liteMode;
        if (obtainAttributes.hasValue(i22)) {
            googleMapOptions.liteMode(obtainAttributes.getBoolean(i22, false));
        }
        int i23 = R.styleable.MapAttrs_uiMapToolbar;
        if (obtainAttributes.hasValue(i23)) {
            googleMapOptions.mapToolbarEnabled(obtainAttributes.getBoolean(i23, true));
        }
        int i24 = R.styleable.MapAttrs_ambientEnabled;
        if (obtainAttributes.hasValue(i24)) {
            googleMapOptions.ambientEnabled(obtainAttributes.getBoolean(i24, false));
        }
        int i25 = R.styleable.MapAttrs_cameraMinZoomPreference;
        if (obtainAttributes.hasValue(i25)) {
            googleMapOptions.minZoomPreference(obtainAttributes.getFloat(i25, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(i25)) {
            googleMapOptions.maxZoomPreference(obtainAttributes.getFloat(R.styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, new int[]{zzc(context, "backgroundColor"), zzc(context, "mapId")});
        if (obtainAttributes2.hasValue(0)) {
            googleMapOptions.backgroundColor(Integer.valueOf(obtainAttributes2.getColor(0, 0)));
        }
        if (obtainAttributes2.hasValue(1) && (string = obtainAttributes2.getString(1)) != null && !string.isEmpty()) {
            googleMapOptions.mapId(string);
        }
        obtainAttributes2.recycle();
        googleMapOptions.latLngBoundsForCameraTarget(zzb(context, attributeSet));
        googleMapOptions.camera(zza(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public static CameraPosition zza(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        int i11 = R.styleable.MapAttrs_cameraTargetLat;
        float f11 = obtainAttributes.hasValue(i11) ? obtainAttributes.getFloat(i11, BitmapDescriptorFactory.HUE_RED) : 0.0f;
        int i12 = R.styleable.MapAttrs_cameraTargetLng;
        LatLng latLng = new LatLng(f11, obtainAttributes.hasValue(i12) ? obtainAttributes.getFloat(i12, BitmapDescriptorFactory.HUE_RED) : 0.0f);
        CameraPosition.Builder builder = CameraPosition.builder();
        builder.target(latLng);
        int i13 = R.styleable.MapAttrs_cameraZoom;
        if (obtainAttributes.hasValue(i13)) {
            builder.zoom(obtainAttributes.getFloat(i13, BitmapDescriptorFactory.HUE_RED));
        }
        int i14 = R.styleable.MapAttrs_cameraBearing;
        if (obtainAttributes.hasValue(i14)) {
            builder.bearing(obtainAttributes.getFloat(i14, BitmapDescriptorFactory.HUE_RED));
        }
        int i15 = R.styleable.MapAttrs_cameraTilt;
        if (obtainAttributes.hasValue(i15)) {
            builder.tilt(obtainAttributes.getFloat(i15, BitmapDescriptorFactory.HUE_RED));
        }
        obtainAttributes.recycle();
        return builder.build();
    }

    public static LatLngBounds zzb(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        int i11 = R.styleable.MapAttrs_latLngBoundsSouthWestLatitude;
        Float valueOf = obtainAttributes.hasValue(i11) ? Float.valueOf(obtainAttributes.getFloat(i11, BitmapDescriptorFactory.HUE_RED)) : null;
        int i12 = R.styleable.MapAttrs_latLngBoundsSouthWestLongitude;
        Float valueOf2 = obtainAttributes.hasValue(i12) ? Float.valueOf(obtainAttributes.getFloat(i12, BitmapDescriptorFactory.HUE_RED)) : null;
        int i13 = R.styleable.MapAttrs_latLngBoundsNorthEastLatitude;
        Float valueOf3 = obtainAttributes.hasValue(i13) ? Float.valueOf(obtainAttributes.getFloat(i13, BitmapDescriptorFactory.HUE_RED)) : null;
        int i14 = R.styleable.MapAttrs_latLngBoundsNorthEastLongitude;
        Float valueOf4 = obtainAttributes.hasValue(i14) ? Float.valueOf(obtainAttributes.getFloat(i14, BitmapDescriptorFactory.HUE_RED)) : null;
        obtainAttributes.recycle();
        if (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(valueOf.floatValue(), valueOf2.floatValue()), new LatLng(valueOf3.floatValue(), valueOf4.floatValue()));
    }

    private static int zzc(Context context, String str) {
        return context.getResources().getIdentifier(str, "attr", context.getPackageName());
    }

    public GoogleMapOptions ambientEnabled(boolean z11) {
        this.zzm = Boolean.valueOf(z11);
        return this;
    }

    public GoogleMapOptions backgroundColor(Integer num) {
        this.zzr = num;
        return this;
    }

    public GoogleMapOptions camera(CameraPosition cameraPosition) {
        this.zzd = cameraPosition;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean z11) {
        this.zzf = Boolean.valueOf(z11);
        return this;
    }

    public Boolean getAmbientEnabled() {
        return this.zzm;
    }

    public Integer getBackgroundColor() {
        return this.zzr;
    }

    public CameraPosition getCamera() {
        return this.zzd;
    }

    public Boolean getCompassEnabled() {
        return this.zzf;
    }

    public LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.zzp;
    }

    public Boolean getLiteMode() {
        return this.zzk;
    }

    public String getMapId() {
        return this.zzs;
    }

    public Boolean getMapToolbarEnabled() {
        return this.zzl;
    }

    public int getMapType() {
        return this.zzc;
    }

    public Float getMaxZoomPreference() {
        return this.zzo;
    }

    public Float getMinZoomPreference() {
        return this.zzn;
    }

    public Boolean getRotateGesturesEnabled() {
        return this.zzj;
    }

    public Boolean getScrollGesturesEnabled() {
        return this.zzg;
    }

    public Boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.zzq;
    }

    public Boolean getTiltGesturesEnabled() {
        return this.zzi;
    }

    public Boolean getUseViewLifecycleInFragment() {
        return this.zzb;
    }

    public Boolean getZOrderOnTop() {
        return this.zza;
    }

    public Boolean getZoomControlsEnabled() {
        return this.zze;
    }

    public Boolean getZoomGesturesEnabled() {
        return this.zzh;
    }

    public GoogleMapOptions latLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
        this.zzp = latLngBounds;
        return this;
    }

    public GoogleMapOptions liteMode(boolean z11) {
        this.zzk = Boolean.valueOf(z11);
        return this;
    }

    public GoogleMapOptions mapId(String str) {
        this.zzs = str;
        return this;
    }

    public GoogleMapOptions mapToolbarEnabled(boolean z11) {
        this.zzl = Boolean.valueOf(z11);
        return this;
    }

    public GoogleMapOptions mapType(int i11) {
        this.zzc = i11;
        return this;
    }

    public GoogleMapOptions maxZoomPreference(float f11) {
        this.zzo = Float.valueOf(f11);
        return this;
    }

    public GoogleMapOptions minZoomPreference(float f11) {
        this.zzn = Float.valueOf(f11);
        return this;
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean z11) {
        this.zzj = Boolean.valueOf(z11);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean z11) {
        this.zzg = Boolean.valueOf(z11);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabledDuringRotateOrZoom(boolean z11) {
        this.zzq = Boolean.valueOf(z11);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean z11) {
        this.zzi = Boolean.valueOf(z11);
        return this;
    }

    public String toString() {
        return Objects.toStringHelper(this).add("MapType", Integer.valueOf(this.zzc)).add("LiteMode", this.zzk).add("Camera", this.zzd).add("CompassEnabled", this.zzf).add("ZoomControlsEnabled", this.zze).add("ScrollGesturesEnabled", this.zzg).add("ZoomGesturesEnabled", this.zzh).add("TiltGesturesEnabled", this.zzi).add("RotateGesturesEnabled", this.zzj).add("ScrollGesturesEnabledDuringRotateOrZoom", this.zzq).add("MapToolbarEnabled", this.zzl).add("AmbientEnabled", this.zzm).add("MinZoomPreference", this.zzn).add("MaxZoomPreference", this.zzo).add("BackgroundColor", this.zzr).add("LatLngBoundsForCameraTarget", this.zzp).add("ZOrderOnTop", this.zza).add("UseViewLifecycleInFragment", this.zzb).toString();
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean z11) {
        this.zzb = Boolean.valueOf(z11);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, com.google.android.gms.maps.internal.zza.zza(this.zza));
        SafeParcelWriter.writeByte(parcel, 3, com.google.android.gms.maps.internal.zza.zza(this.zzb));
        SafeParcelWriter.writeInt(parcel, 4, getMapType());
        SafeParcelWriter.writeParcelable(parcel, 5, getCamera(), i11, false);
        SafeParcelWriter.writeByte(parcel, 6, com.google.android.gms.maps.internal.zza.zza(this.zze));
        SafeParcelWriter.writeByte(parcel, 7, com.google.android.gms.maps.internal.zza.zza(this.zzf));
        SafeParcelWriter.writeByte(parcel, 8, com.google.android.gms.maps.internal.zza.zza(this.zzg));
        SafeParcelWriter.writeByte(parcel, 9, com.google.android.gms.maps.internal.zza.zza(this.zzh));
        SafeParcelWriter.writeByte(parcel, 10, com.google.android.gms.maps.internal.zza.zza(this.zzi));
        SafeParcelWriter.writeByte(parcel, 11, com.google.android.gms.maps.internal.zza.zza(this.zzj));
        SafeParcelWriter.writeByte(parcel, 12, com.google.android.gms.maps.internal.zza.zza(this.zzk));
        SafeParcelWriter.writeByte(parcel, 14, com.google.android.gms.maps.internal.zza.zza(this.zzl));
        SafeParcelWriter.writeByte(parcel, 15, com.google.android.gms.maps.internal.zza.zza(this.zzm));
        SafeParcelWriter.writeFloatObject(parcel, 16, getMinZoomPreference(), false);
        SafeParcelWriter.writeFloatObject(parcel, 17, getMaxZoomPreference(), false);
        SafeParcelWriter.writeParcelable(parcel, 18, getLatLngBoundsForCameraTarget(), i11, false);
        SafeParcelWriter.writeByte(parcel, 19, com.google.android.gms.maps.internal.zza.zza(this.zzq));
        SafeParcelWriter.writeIntegerObject(parcel, 20, getBackgroundColor(), false);
        SafeParcelWriter.writeString(parcel, 21, getMapId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public GoogleMapOptions zOrderOnTop(boolean z11) {
        this.zza = Boolean.valueOf(z11);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean z11) {
        this.zze = Boolean.valueOf(z11);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean z11) {
        this.zzh = Boolean.valueOf(z11);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public GoogleMapOptions(@SafeParcelable.Param(id = 2) byte b11, @SafeParcelable.Param(id = 3) byte b12, @SafeParcelable.Param(id = 4) int i11, @SafeParcelable.Param(id = 5) CameraPosition cameraPosition, @SafeParcelable.Param(id = 6) byte b13, @SafeParcelable.Param(id = 7) byte b14, @SafeParcelable.Param(id = 8) byte b15, @SafeParcelable.Param(id = 9) byte b16, @SafeParcelable.Param(id = 10) byte b17, @SafeParcelable.Param(id = 11) byte b18, @SafeParcelable.Param(id = 12) byte b19, @SafeParcelable.Param(id = 14) byte b21, @SafeParcelable.Param(id = 15) byte b22, @SafeParcelable.Param(id = 16) Float f11, @SafeParcelable.Param(id = 17) Float f12, @SafeParcelable.Param(id = 18) LatLngBounds latLngBounds, @SafeParcelable.Param(id = 19) byte b23, @SafeParcelable.Param(id = 20) Integer num, @SafeParcelable.Param(id = 21) String str) {
        this.zzc = -1;
        this.zzn = null;
        this.zzo = null;
        this.zzp = null;
        this.zzr = null;
        this.zzs = null;
        this.zza = com.google.android.gms.maps.internal.zza.zzb(b11);
        this.zzb = com.google.android.gms.maps.internal.zza.zzb(b12);
        this.zzc = i11;
        this.zzd = cameraPosition;
        this.zze = com.google.android.gms.maps.internal.zza.zzb(b13);
        this.zzf = com.google.android.gms.maps.internal.zza.zzb(b14);
        this.zzg = com.google.android.gms.maps.internal.zza.zzb(b15);
        this.zzh = com.google.android.gms.maps.internal.zza.zzb(b16);
        this.zzi = com.google.android.gms.maps.internal.zza.zzb(b17);
        this.zzj = com.google.android.gms.maps.internal.zza.zzb(b18);
        this.zzk = com.google.android.gms.maps.internal.zza.zzb(b19);
        this.zzl = com.google.android.gms.maps.internal.zza.zzb(b21);
        this.zzm = com.google.android.gms.maps.internal.zza.zzb(b22);
        this.zzn = f11;
        this.zzo = f12;
        this.zzp = latLngBounds;
        this.zzq = com.google.android.gms.maps.internal.zza.zzb(b23);
        this.zzr = num;
        this.zzs = str;
    }
}