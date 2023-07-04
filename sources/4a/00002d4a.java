package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "UserPreferredSleepWindowCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes3.dex */
public final class zzce extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzce> CREATOR = new zzcf();
    @SafeParcelable.Field(getter = "getStartHour", id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getStartMinute", id = 2)
    private final int zzb;
    @SafeParcelable.Field(getter = "getEndHour", id = 3)
    private final int zzc;
    @SafeParcelable.Field(getter = "getEndMinute", id = 4)
    private final int zzd;

    @SafeParcelable.Constructor
    public zzce(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) int i12, @SafeParcelable.Param(id = 3) int i13, @SafeParcelable.Param(id = 4) int i14) {
        Preconditions.checkState(i11 >= 0 && i11 <= 23, "Start hour must be in range [0, 23].");
        Preconditions.checkState(i12 >= 0 && i12 <= 59, "Start minute must be in range [0, 59].");
        Preconditions.checkState(i13 >= 0 && i13 <= 23, "End hour must be in range [0, 23].");
        Preconditions.checkState(i14 >= 0 && i14 <= 59, "End minute must be in range [0, 59].");
        Preconditions.checkState(((i11 + i12) + i13) + i14 > 0, "Parameters can't be all 0.");
        this.zza = i11;
        this.zzb = i12;
        this.zzc = i13;
        this.zzd = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzce) {
            zzce zzceVar = (zzce) obj;
            return this.zza == zzceVar.zza && this.zzb == zzceVar.zzb && this.zzc == zzceVar.zzc && this.zzd == zzceVar.zzd;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        int i11 = this.zza;
        int i12 = this.zzb;
        int i13 = this.zzc;
        int i14 = this.zzd;
        StringBuilder sb2 = new StringBuilder(117);
        sb2.append("UserPreferredSleepWindow [startHour=");
        sb2.append(i11);
        sb2.append(", startMinute=");
        sb2.append(i12);
        sb2.append(", endHour=");
        sb2.append(i13);
        sb2.append(", endMinute=");
        sb2.append(i14);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}