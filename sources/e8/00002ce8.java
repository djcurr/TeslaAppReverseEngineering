package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;

@SafeParcelable.Class(creator = "CurrentLocationRequestCreator")
/* loaded from: classes3.dex */
public final class CurrentLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new zzt();
    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getMaxUpdateAgeMillis", id = 1)
    private final long zza;
    @SafeParcelable.Field(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 2)
    private final int zzb;
    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", id = 3)
    private final int zzc;
    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", id = 4)
    private final long zzd;
    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", id = 5)
    private final boolean zze;
    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", id = 6)
    private final WorkSource zzf;

    /* loaded from: classes3.dex */
    public static class Builder {
        private long zza;
        private int zzb;
        private int zzc;
        private long zzd;
        private boolean zze;
        private WorkSource zzf;

        public Builder() {
            this.zza = 60000L;
            this.zzb = 0;
            this.zzc = 102;
            this.zzd = Long.MAX_VALUE;
            this.zze = false;
            this.zzf = null;
        }

        public Builder(CurrentLocationRequest currentLocationRequest) {
            this.zza = currentLocationRequest.getMaxUpdateAgeMillis();
            this.zzb = currentLocationRequest.getGranularity();
            this.zzc = currentLocationRequest.getPriority();
            this.zzd = currentLocationRequest.getDurationMillis();
            this.zze = currentLocationRequest.zzb();
            this.zzf = new WorkSource(currentLocationRequest.zza());
        }

        public CurrentLocationRequest build() {
            return new CurrentLocationRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze, new WorkSource(this.zzf));
        }

        public Builder setDurationMillis(long j11) {
            Preconditions.checkArgument(j11 > 0, "durationMillis must be greater than 0");
            this.zzd = j11;
            return this;
        }

        public Builder setGranularity(int i11) {
            zzbc.zza(i11);
            this.zzb = i11;
            return this;
        }

        public Builder setMaxUpdateAgeMillis(long j11) {
            Preconditions.checkArgument(j11 >= 0, "maxUpdateAgeMillis must be greater than or equal to 0");
            this.zza = j11;
            return this;
        }

        public Builder setPriority(int i11) {
            boolean z11;
            int i12 = 105;
            if (i11 == 100 || i11 == 102 || i11 == 104) {
                i12 = i11;
            } else if (i11 != 105) {
                i12 = i11;
                z11 = false;
                Preconditions.checkArgument(z11, "priority %d must be a Priority.PRIORITY_* constants", Integer.valueOf(i11));
                this.zzc = i12;
                return this;
            } else {
                i11 = 105;
            }
            z11 = true;
            Preconditions.checkArgument(z11, "priority %d must be a Priority.PRIORITY_* constants", Integer.valueOf(i11));
            this.zzc = i12;
            return this;
        }

        public final Builder zza(boolean z11) {
            this.zze = z11;
            return this;
        }

        public final Builder zzb(WorkSource workSource) {
            this.zzf = workSource;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public CurrentLocationRequest(@SafeParcelable.Param(id = 1) long j11, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) int i12, @SafeParcelable.Param(id = 4) long j12, @SafeParcelable.Param(id = 5) boolean z11, @SafeParcelable.Param(id = 6) WorkSource workSource) {
        this.zza = j11;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = j12;
        this.zze = z11;
        this.zzf = workSource;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CurrentLocationRequest) {
            CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
            return this.zza == currentLocationRequest.zza && this.zzb == currentLocationRequest.zzb && this.zzc == currentLocationRequest.zzc && this.zzd == currentLocationRequest.zzd && this.zze == currentLocationRequest.zze && Objects.equal(this.zzf, currentLocationRequest.zzf);
        }
        return false;
    }

    public long getDurationMillis() {
        return this.zzd;
    }

    public int getGranularity() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    public int getPriority() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Long.valueOf(this.zzd));
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CurrentLocationRequest[");
        int i11 = this.zzc;
        if (i11 == 100) {
            str = "HIGH_ACCURACY";
        } else if (i11 == 102) {
            str = "BALANCED_POWER_ACCURACY";
        } else if (i11 == 104) {
            str = "LOW_POWER";
        } else if (i11 != 105) {
            throw new IllegalArgumentException();
        } else {
            str = "PASSIVE";
        }
        sb2.append(str);
        if (this.zza != Long.MAX_VALUE) {
            sb2.append(", maxAge=");
            com.google.android.gms.internal.location.zzbo.zza(this.zza, sb2);
        }
        if (this.zzd != Long.MAX_VALUE) {
            sb2.append(", duration=");
            sb2.append(this.zzd);
            sb2.append("ms");
        }
        if (this.zzb != 0) {
            sb2.append(", ");
            sb2.append(zzbc.zzb(this.zzb));
        }
        if (this.zze) {
            sb2.append(", bypass");
        }
        if (!WorkSourceUtil.isEmpty(this.zzf)) {
            sb2.append(", workSource=");
            sb2.append(this.zzf);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 2, getGranularity());
        SafeParcelWriter.writeInt(parcel, 3, getPriority());
        SafeParcelWriter.writeLong(parcel, 4, getDurationMillis());
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final WorkSource zza() {
        return this.zzf;
    }

    public final boolean zzb() {
        return this.zze;
    }
}