package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CalendarEventParcelCreator")
/* loaded from: classes3.dex */
public final class zzph extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzph> CREATOR = new zzpw();
    @SafeParcelable.Field(getter = "getSummary", id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getDescription", id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getLocation", id = 3)
    private final String zzc;
    @SafeParcelable.Field(getter = "getOrganizer", id = 4)
    private final String zzd;
    @SafeParcelable.Field(getter = "getStatus", id = 5)
    private final String zze;
    @SafeParcelable.Field(getter = "getStart", id = 6)
    private final zzpg zzf;
    @SafeParcelable.Field(getter = "getEnd", id = 7)
    private final zzpg zzg;

    @SafeParcelable.Constructor
    public zzph(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) String str4, @SafeParcelable.Param(id = 5) String str5, @SafeParcelable.Param(id = 6) zzpg zzpgVar, @SafeParcelable.Param(id = 7) zzpg zzpgVar2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = zzpgVar;
        this.zzg = zzpgVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzpg zza() {
        return this.zzg;
    }

    public final zzpg zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zza;
    }
}