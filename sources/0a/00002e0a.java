package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

@SafeParcelable.Class(creator = "MarkerOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new zzi();
    @SafeParcelable.Field(getter = "getPosition", id = 2)
    private LatLng zza;
    @SafeParcelable.Field(getter = "getTitle", id = 3)
    private String zzb;
    @SafeParcelable.Field(getter = "getSnippet", id = 4)
    private String zzc;
    @SafeParcelable.Field(getter = "getWrappedIconDescriptorImplBinder", id = 5, type = "android.os.IBinder")
    private BitmapDescriptor zzd;
    @SafeParcelable.Field(getter = "getAnchorU", id = 6)
    private float zze;
    @SafeParcelable.Field(getter = "getAnchorV", id = 7)
    private float zzf;
    @SafeParcelable.Field(getter = "isDraggable", id = 8)
    private boolean zzg;
    @SafeParcelable.Field(getter = "isVisible", id = 9)
    private boolean zzh;
    @SafeParcelable.Field(getter = "isFlat", id = 10)
    private boolean zzi;
    @SafeParcelable.Field(getter = "getRotation", id = 11)
    private float zzj;
    @SafeParcelable.Field(defaultValue = "0.5f", getter = "getInfoWindowAnchorU", id = 12)
    private float zzk;
    @SafeParcelable.Field(getter = "getInfoWindowAnchorV", id = 13)
    private float zzl;
    @SafeParcelable.Field(defaultValue = "1.0f", getter = "getAlpha", id = 14)
    private float zzm;
    @SafeParcelable.Field(getter = "getZIndex", id = 15)
    private float zzn;

    public MarkerOptions() {
        this.zze = 0.5f;
        this.zzf = 1.0f;
        this.zzh = true;
        this.zzi = false;
        this.zzj = BitmapDescriptorFactory.HUE_RED;
        this.zzk = 0.5f;
        this.zzl = BitmapDescriptorFactory.HUE_RED;
        this.zzm = 1.0f;
    }

    public MarkerOptions alpha(float f11) {
        this.zzm = f11;
        return this;
    }

    public MarkerOptions anchor(float f11, float f12) {
        this.zze = f11;
        this.zzf = f12;
        return this;
    }

    public MarkerOptions draggable(boolean z11) {
        this.zzg = z11;
        return this;
    }

    public MarkerOptions flat(boolean z11) {
        this.zzi = z11;
        return this;
    }

    public float getAlpha() {
        return this.zzm;
    }

    public float getAnchorU() {
        return this.zze;
    }

    public float getAnchorV() {
        return this.zzf;
    }

    public BitmapDescriptor getIcon() {
        return this.zzd;
    }

    public float getInfoWindowAnchorU() {
        return this.zzk;
    }

    public float getInfoWindowAnchorV() {
        return this.zzl;
    }

    public LatLng getPosition() {
        return this.zza;
    }

    public float getRotation() {
        return this.zzj;
    }

    public String getSnippet() {
        return this.zzc;
    }

    public String getTitle() {
        return this.zzb;
    }

    public float getZIndex() {
        return this.zzn;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
        this.zzd = bitmapDescriptor;
        return this;
    }

    public MarkerOptions infoWindowAnchor(float f11, float f12) {
        this.zzk = f11;
        this.zzl = f12;
        return this;
    }

    public boolean isDraggable() {
        return this.zzg;
    }

    public boolean isFlat() {
        return this.zzi;
    }

    public boolean isVisible() {
        return this.zzh;
    }

    public MarkerOptions position(LatLng latLng) {
        if (latLng != null) {
            this.zza = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    public MarkerOptions rotation(float f11) {
        this.zzj = f11;
        return this;
    }

    public MarkerOptions snippet(String str) {
        this.zzc = str;
        return this;
    }

    public MarkerOptions title(String str) {
        this.zzb = str;
        return this;
    }

    public MarkerOptions visible(boolean z11) {
        this.zzh = z11;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getPosition(), i11, false);
        SafeParcelWriter.writeString(parcel, 3, getTitle(), false);
        SafeParcelWriter.writeString(parcel, 4, getSnippet(), false);
        BitmapDescriptor bitmapDescriptor = this.zzd;
        SafeParcelWriter.writeIBinder(parcel, 5, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
        SafeParcelWriter.writeFloat(parcel, 6, getAnchorU());
        SafeParcelWriter.writeFloat(parcel, 7, getAnchorV());
        SafeParcelWriter.writeBoolean(parcel, 8, isDraggable());
        SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 10, isFlat());
        SafeParcelWriter.writeFloat(parcel, 11, getRotation());
        SafeParcelWriter.writeFloat(parcel, 12, getInfoWindowAnchorU());
        SafeParcelWriter.writeFloat(parcel, 13, getInfoWindowAnchorV());
        SafeParcelWriter.writeFloat(parcel, 14, getAlpha());
        SafeParcelWriter.writeFloat(parcel, 15, getZIndex());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public MarkerOptions zIndex(float f11) {
        this.zzn = f11;
        return this;
    }

    @SafeParcelable.Constructor
    public MarkerOptions(@SafeParcelable.Param(id = 2) LatLng latLng, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) IBinder iBinder, @SafeParcelable.Param(id = 6) float f11, @SafeParcelable.Param(id = 7) float f12, @SafeParcelable.Param(id = 8) boolean z11, @SafeParcelable.Param(id = 9) boolean z12, @SafeParcelable.Param(id = 10) boolean z13, @SafeParcelable.Param(id = 11) float f13, @SafeParcelable.Param(id = 12) float f14, @SafeParcelable.Param(id = 13) float f15, @SafeParcelable.Param(id = 14) float f16, @SafeParcelable.Param(id = 15) float f17) {
        this.zze = 0.5f;
        this.zzf = 1.0f;
        this.zzh = true;
        this.zzi = false;
        this.zzj = BitmapDescriptorFactory.HUE_RED;
        this.zzk = 0.5f;
        this.zzl = BitmapDescriptorFactory.HUE_RED;
        this.zzm = 1.0f;
        this.zza = latLng;
        this.zzb = str;
        this.zzc = str2;
        if (iBinder == null) {
            this.zzd = null;
        } else {
            this.zzd = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
        }
        this.zze = f11;
        this.zzf = f12;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
        this.zzj = f13;
        this.zzk = f14;
        this.zzl = f15;
        this.zzm = f16;
        this.zzn = f17;
    }
}