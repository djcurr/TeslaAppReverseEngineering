package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class zzby extends com.google.android.gms.internal.maps.zza implements IUiSettingsDelegate {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzby(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isCompassEnabled() {
        Parcel zzH = zzH(10, zza());
        boolean zzg = com.google.android.gms.internal.maps.zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isIndoorLevelPickerEnabled() {
        Parcel zzH = zzH(17, zza());
        boolean zzg = com.google.android.gms.internal.maps.zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isMapToolbarEnabled() {
        Parcel zzH = zzH(19, zza());
        boolean zzg = com.google.android.gms.internal.maps.zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isMyLocationButtonEnabled() {
        Parcel zzH = zzH(11, zza());
        boolean zzg = com.google.android.gms.internal.maps.zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isRotateGesturesEnabled() {
        Parcel zzH = zzH(15, zza());
        boolean zzg = com.google.android.gms.internal.maps.zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isScrollGesturesEnabled() {
        Parcel zzH = zzH(12, zza());
        boolean zzg = com.google.android.gms.internal.maps.zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isScrollGesturesEnabledDuringRotateOrZoom() {
        Parcel zzH = zzH(21, zza());
        boolean zzg = com.google.android.gms.internal.maps.zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isTiltGesturesEnabled() {
        Parcel zzH = zzH(14, zza());
        boolean zzg = com.google.android.gms.internal.maps.zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isZoomControlsEnabled() {
        Parcel zzH = zzH(9, zza());
        boolean zzg = com.google.android.gms.internal.maps.zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isZoomGesturesEnabled() {
        Parcel zzH = zzH(13, zza());
        boolean zzg = com.google.android.gms.internal.maps.zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setAllGesturesEnabled(boolean z11) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(zza, z11);
        zzc(8, zza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setCompassEnabled(boolean z11) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(zza, z11);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setIndoorLevelPickerEnabled(boolean z11) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(zza, z11);
        zzc(16, zza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setMapToolbarEnabled(boolean z11) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(zza, z11);
        zzc(18, zza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setMyLocationButtonEnabled(boolean z11) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(zza, z11);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setRotateGesturesEnabled(boolean z11) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(zza, z11);
        zzc(7, zza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setScrollGesturesEnabled(boolean z11) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(zza, z11);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setScrollGesturesEnabledDuringRotateOrZoom(boolean z11) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(zza, z11);
        zzc(20, zza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setTiltGesturesEnabled(boolean z11) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(zza, z11);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setZoomControlsEnabled(boolean z11) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(zza, z11);
        zzc(1, zza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setZoomGesturesEnabled(boolean z11) {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(zza, z11);
        zzc(5, zza);
    }
}