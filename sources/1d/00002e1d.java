package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.maps.zzai;
import com.google.android.gms.internal.maps.zzaj;

@SafeParcelable.Class(creator = "TileOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new zzv();
    @SafeParcelable.Field(getter = "getTileProviderDelegate", id = 2, type = "android.os.IBinder")
    private zzaj zza;
    private TileProvider zzb;
    @SafeParcelable.Field(getter = "isVisible", id = 3)
    private boolean zzc;
    @SafeParcelable.Field(getter = "getZIndex", id = 4)
    private float zzd;
    @SafeParcelable.Field(defaultValue = "true", getter = "getFadeIn", id = 5)
    private boolean zze;
    @SafeParcelable.Field(getter = "getTransparency", id = 6)
    private float zzf;

    public TileOverlayOptions() {
        this.zzc = true;
        this.zze = true;
        this.zzf = BitmapDescriptorFactory.HUE_RED;
    }

    public TileOverlayOptions fadeIn(boolean z11) {
        this.zze = z11;
        return this;
    }

    public boolean getFadeIn() {
        return this.zze;
    }

    public TileProvider getTileProvider() {
        return this.zzb;
    }

    public float getTransparency() {
        return this.zzf;
    }

    public float getZIndex() {
        return this.zzd;
    }

    public boolean isVisible() {
        return this.zzc;
    }

    public TileOverlayOptions tileProvider(TileProvider tileProvider) {
        this.zzb = (TileProvider) Preconditions.checkNotNull(tileProvider, "tileProvider must not be null.");
        this.zza = new zzu(this, tileProvider);
        return this;
    }

    public TileOverlayOptions transparency(float f11) {
        boolean z11 = false;
        if (f11 >= BitmapDescriptorFactory.HUE_RED && f11 <= 1.0f) {
            z11 = true;
        }
        Preconditions.checkArgument(z11, "Transparency must be in the range [0..1]");
        this.zzf = f11;
        return this;
    }

    public TileOverlayOptions visible(boolean z11) {
        this.zzc = z11;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzaj zzajVar = this.zza;
        SafeParcelWriter.writeIBinder(parcel, 2, zzajVar == null ? null : zzajVar.asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 3, isVisible());
        SafeParcelWriter.writeFloat(parcel, 4, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 5, getFadeIn());
        SafeParcelWriter.writeFloat(parcel, 6, getTransparency());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public TileOverlayOptions zIndex(float f11) {
        this.zzd = f11;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public TileOverlayOptions(@SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) boolean z11, @SafeParcelable.Param(id = 4) float f11, @SafeParcelable.Param(id = 5) boolean z12, @SafeParcelable.Param(id = 6) float f12) {
        this.zzc = true;
        this.zze = true;
        this.zzf = BitmapDescriptorFactory.HUE_RED;
        zzaj zzc = zzai.zzc(iBinder);
        this.zza = zzc;
        this.zzb = zzc == null ? null : new zzt(this);
        this.zzc = z11;
        this.zzd = f11;
        this.zze = z12;
        this.zzf = f12;
    }
}