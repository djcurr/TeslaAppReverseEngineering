package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes3.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzbo();
    @Deprecated
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    @Deprecated
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    @Deprecated
    public static final int PRIORITY_LOW_POWER = 104;
    @Deprecated
    public static final int PRIORITY_NO_POWER = 105;
    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", id = 1)
    int zza;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_INTERVAL", id = 2)
    long zzb;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_FASTEST_INTERVAL", id = 3)
    long zzc;
    @SafeParcelable.Field(defaultValue = "false", id = 4)
    boolean zzd;
    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", id = 5)
    long zze;
    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MAX_VALUE", id = 6)
    int zzf;
    @SafeParcelable.Field(defaultValue = "0", id = 7)
    float zzg;
    @SafeParcelable.Field(defaultValue = "0", id = 8)
    long zzh;
    @SafeParcelable.Field(defaultValue = "false", id = 9)
    boolean zzi;

    @Deprecated
    public LocationRequest() {
        this(102, CoreConstants.MILLIS_IN_ONE_HOUR, 600000L, false, Long.MAX_VALUE, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, 0L, false);
    }

    public static LocationRequest create() {
        return new LocationRequest(102, CoreConstants.MILLIS_IN_ONE_HOUR, 600000L, false, Long.MAX_VALUE, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, 0L, true);
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza && this.zzb == locationRequest.zzb && this.zzc == locationRequest.zzc && this.zzd == locationRequest.zzd && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && getMaxWaitTime() == locationRequest.getMaxWaitTime() && this.zzi == locationRequest.zzi) {
                return true;
            }
        }
        return false;
    }

    public long getExpirationTime() {
        return this.zze;
    }

    public long getFastestInterval() {
        return this.zzc;
    }

    public long getInterval() {
        return this.zzb;
    }

    public long getMaxWaitTime() {
        long j11 = this.zzh;
        long j12 = this.zzb;
        return j11 < j12 ? j12 : j11;
    }

    public int getNumUpdates() {
        return this.zzf;
    }

    public int getPriority() {
        return this.zza;
    }

    public float getSmallestDisplacement() {
        return this.zzg;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Float.valueOf(this.zzg), Long.valueOf(this.zzh));
    }

    public boolean isFastestIntervalExplicitlySet() {
        return this.zzd;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzi;
    }

    public LocationRequest setExpirationDuration(long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = j11 <= Long.MAX_VALUE - elapsedRealtime ? j11 + elapsedRealtime : Long.MAX_VALUE;
        this.zze = j12;
        if (j12 < 0) {
            this.zze = 0L;
        }
        return this;
    }

    @Deprecated
    public LocationRequest setExpirationTime(long j11) {
        this.zze = j11;
        if (j11 < 0) {
            this.zze = 0L;
        }
        return this;
    }

    public LocationRequest setFastestInterval(long j11) {
        Preconditions.checkArgument(j11 >= 0, "illegal fastest interval: %d", Long.valueOf(j11));
        this.zzd = true;
        this.zzc = j11;
        return this;
    }

    public LocationRequest setInterval(long j11) {
        Preconditions.checkArgument(j11 >= 0, "illegal interval: %d", Long.valueOf(j11));
        this.zzb = j11;
        if (!this.zzd) {
            this.zzc = (long) (j11 / 6.0d);
        }
        return this;
    }

    public LocationRequest setMaxWaitTime(long j11) {
        Preconditions.checkArgument(j11 >= 0, "illegal max wait time: %d", Long.valueOf(j11));
        this.zzh = j11;
        return this;
    }

    public LocationRequest setNumUpdates(int i11) {
        if (i11 > 0) {
            this.zzf = i11;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("invalid numUpdates: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }

    public LocationRequest setPriority(int i11) {
        boolean z11;
        if (i11 != 100 && i11 != 102 && i11 != 104) {
            if (i11 != 105) {
                z11 = false;
                Preconditions.checkArgument(z11, "illegal priority: %d", Integer.valueOf(i11));
                this.zza = i11;
                return this;
            }
            i11 = 105;
        }
        z11 = true;
        Preconditions.checkArgument(z11, "illegal priority: %d", Integer.valueOf(i11));
        this.zza = i11;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float f11) {
        if (f11 >= BitmapDescriptorFactory.HUE_RED) {
            this.zzg = f11;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("invalid displacement: ");
        sb2.append(f11);
        throw new IllegalArgumentException(sb2.toString());
    }

    public LocationRequest setWaitForAccurateLocation(boolean z11) {
        this.zzi = z11;
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        int i11 = this.zza;
        sb2.append(i11 != 100 ? i11 != 102 ? i11 != 104 ? i11 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.zza != 105) {
            sb2.append(" requested=");
            sb2.append(this.zzb);
            sb2.append("ms");
        }
        sb2.append(" fastest=");
        sb2.append(this.zzc);
        sb2.append("ms");
        if (this.zzh > this.zzb) {
            sb2.append(" maxWait=");
            sb2.append(this.zzh);
            sb2.append("ms");
        }
        if (this.zzg > BitmapDescriptorFactory.HUE_RED) {
            sb2.append(" smallestDisplacement=");
            sb2.append(this.zzg);
            sb2.append("m");
        }
        long j11 = this.zze;
        if (j11 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j11 - elapsedRealtime);
            sb2.append("ms");
        }
        if (this.zzf != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.zzf);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeLong(parcel, 5, this.zze);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeFloat(parcel, 7, this.zzg);
        SafeParcelWriter.writeLong(parcel, 8, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public LocationRequest(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) long j11, @SafeParcelable.Param(id = 3) long j12, @SafeParcelable.Param(id = 4) boolean z11, @SafeParcelable.Param(id = 5) long j13, @SafeParcelable.Param(id = 6) int i12, @SafeParcelable.Param(id = 7) float f11, @SafeParcelable.Param(id = 8) long j14, @SafeParcelable.Param(id = 9) boolean z12) {
        this.zza = i11;
        this.zzb = j11;
        this.zzc = j12;
        this.zzd = z11;
        this.zze = j13;
        this.zzf = i12;
        this.zzg = f11;
        this.zzh = j14;
        this.zzi = z12;
    }
}