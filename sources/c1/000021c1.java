package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SleepSegmentRequest;

/* loaded from: classes3.dex */
public final class zzal extends zza implements zzam {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final Location zzd() {
        Parcel zzA = zzA(7, zza());
        Location location = (Location) zzc.zza(zzA, Location.CREATOR);
        zzA.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final ICancelToken zze(CurrentLocationRequest currentLocationRequest, zzao zzaoVar) {
        Parcel zza = zza();
        zzc.zzc(zza, currentLocationRequest);
        zzc.zzd(zza, zzaoVar);
        Parcel zzA = zzA(87, zza);
        ICancelToken asInterface = ICancelToken.Stub.asInterface(zzA.readStrongBinder());
        zzA.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final LocationAvailability zzf(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzA = zzA(34, zza);
        LocationAvailability locationAvailability = (LocationAvailability) zzc.zza(zzA, LocationAvailability.CREATOR);
        zzA.recycle();
        return locationAvailability;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzg(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzak zzakVar) {
        Parcel zza = zza();
        zzc.zzc(zza, geofencingRequest);
        zzc.zzc(zza, pendingIntent);
        zzc.zzd(zza, zzakVar);
        zzB(57, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzh(LocationSettingsRequest locationSettingsRequest, zzaq zzaqVar, String str) {
        Parcel zza = zza();
        zzc.zzc(zza, locationSettingsRequest);
        zzc.zzd(zza, zzaqVar);
        zza.writeString(null);
        zzB(63, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzi(zzai zzaiVar) {
        Parcel zza = zza();
        zzc.zzd(zza, zzaiVar);
        zzB(67, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzj(LastLocationRequest lastLocationRequest, zzao zzaoVar) {
        Parcel zza = zza();
        zzc.zzc(zza, lastLocationRequest);
        zzc.zzd(zza, zzaoVar);
        zzB(82, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzk(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
        Parcel zza = zza();
        zzc.zzc(zza, pendingIntent);
        zzc.zzd(zza, iStatusCallback);
        zzB(73, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzl(PendingIntent pendingIntent) {
        Parcel zza = zza();
        zzc.zzc(zza, pendingIntent);
        zzB(6, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzm(com.google.android.gms.location.zzbx zzbxVar, zzak zzakVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzbxVar);
        zzc.zzd(zza, zzakVar);
        zzB(74, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzn(PendingIntent pendingIntent, zzak zzakVar, String str) {
        Parcel zza = zza();
        zzc.zzc(zza, pendingIntent);
        zzc.zzd(zza, zzakVar);
        zza.writeString(str);
        zzB(2, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzo(String[] strArr, zzak zzakVar, String str) {
        Parcel zza = zza();
        zza.writeStringArray(strArr);
        zzc.zzd(zza, zzakVar);
        zza.writeString(str);
        zzB(3, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzp(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
        Parcel zza = zza();
        zzc.zzc(zza, pendingIntent);
        zzc.zzd(zza, iStatusCallback);
        zzB(69, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzq(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
        Parcel zza = zza();
        zzc.zzc(zza, activityTransitionRequest);
        zzc.zzc(zza, pendingIntent);
        zzc.zzd(zza, iStatusCallback);
        zzB(72, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzr(long j11, boolean z11, PendingIntent pendingIntent) {
        Parcel zza = zza();
        zza.writeLong(j11);
        zzc.zzb(zza, true);
        zzc.zzc(zza, pendingIntent);
        zzB(5, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzs(com.google.android.gms.location.zzl zzlVar, PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
        Parcel zza = zza();
        zzc.zzc(zza, zzlVar);
        zzc.zzc(zza, pendingIntent);
        zzc.zzd(zza, iStatusCallback);
        zzB(70, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzt(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, IStatusCallback iStatusCallback) {
        Parcel zza = zza();
        zzc.zzc(zza, pendingIntent);
        zzc.zzc(zza, sleepSegmentRequest);
        zzc.zzd(zza, iStatusCallback);
        zzB(79, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzu(Location location) {
        Parcel zza = zza();
        zzc.zzc(zza, location);
        zzB(13, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzv(Location location, IStatusCallback iStatusCallback) {
        Parcel zza = zza();
        zzc.zzc(zza, location);
        zzc.zzd(zza, iStatusCallback);
        zzB(85, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzw(boolean z11) {
        Parcel zza = zza();
        zzc.zzb(zza, z11);
        zzB(12, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzx(boolean z11, IStatusCallback iStatusCallback) {
        Parcel zza = zza();
        zzc.zzb(zza, z11);
        zzc.zzd(zza, iStatusCallback);
        zzB(84, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzy(zzj zzjVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzjVar);
        zzB(75, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzz(zzbh zzbhVar) {
        Parcel zza = zza();
        zzc.zzc(zza, zzbhVar);
        zzB(59, zza);
    }
}