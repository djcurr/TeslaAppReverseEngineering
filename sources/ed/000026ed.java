package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CalendarDateTimeParcelCreator")
/* loaded from: classes3.dex */
public final class zzpg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpg> CREATOR = new zzpv();
    @SafeParcelable.Field(getter = "getYear", id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getMonth", id = 2)
    private final int zzb;
    @SafeParcelable.Field(getter = "getDay", id = 3)
    private final int zzc;
    @SafeParcelable.Field(getter = "getHours", id = 4)
    private final int zzd;
    @SafeParcelable.Field(getter = "getMinutes", id = 5)
    private final int zze;
    @SafeParcelable.Field(getter = "getSeconds", id = 6)
    private final int zzf;
    @SafeParcelable.Field(getter = "isUtc", id = 7)
    private final boolean zzg;
    @SafeParcelable.Field(getter = "getRawValue", id = 8)
    private final String zzh;

    @SafeParcelable.Constructor
    public zzpg(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) int i12, @SafeParcelable.Param(id = 3) int i13, @SafeParcelable.Param(id = 4) int i14, @SafeParcelable.Param(id = 5) int i15, @SafeParcelable.Param(id = 6) int i16, @SafeParcelable.Param(id = 7) boolean z11, @SafeParcelable.Param(id = 8) String str) {
        this.zza = i11;
        this.zzb = i12;
        this.zzc = i13;
        this.zzd = i14;
        this.zze = i15;
        this.zzf = i16;
        this.zzg = z11;
        this.zzh = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zze;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        return this.zzf;
    }

    public final int zzf() {
        return this.zza;
    }

    public final String zzg() {
        return this.zzh;
    }

    public final boolean zzh() {
        return this.zzg;
    }
}