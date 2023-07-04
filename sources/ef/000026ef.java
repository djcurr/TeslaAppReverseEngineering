package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ContactInfoParcelCreator")
/* loaded from: classes3.dex */
public final class zzpi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpi> CREATOR = new zzpx();
    @SafeParcelable.Field(getter = "getName", id = 1)
    private final zzpm zza;
    @SafeParcelable.Field(getter = "getOrganization", id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getTitle", id = 3)
    private final String zzc;
    @SafeParcelable.Field(getter = "getPhones", id = 4)
    private final zzpn[] zzd;
    @SafeParcelable.Field(getter = "getEmails", id = 5)
    private final zzpk[] zze;
    @SafeParcelable.Field(getter = "getUrls", id = 6)
    private final String[] zzf;
    @SafeParcelable.Field(getter = "getAddresses", id = 7)
    private final zzpf[] zzg;

    @SafeParcelable.Constructor
    public zzpi(@SafeParcelable.Param(id = 1) zzpm zzpmVar, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) zzpn[] zzpnVarArr, @SafeParcelable.Param(id = 5) zzpk[] zzpkVarArr, @SafeParcelable.Param(id = 6) String[] strArr, @SafeParcelable.Param(id = 7) zzpf[] zzpfVarArr) {
        this.zza = zzpmVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzpnVarArr;
        this.zze = zzpkVarArr;
        this.zzf = strArr;
        this.zzg = zzpfVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i11, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.zzd, i11, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.zze, i11, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeTypedArray(parcel, 7, this.zzg, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzpm zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final zzpf[] zzd() {
        return this.zzg;
    }

    public final zzpk[] zze() {
        return this.zze;
    }

    public final zzpn[] zzf() {
        return this.zzd;
    }

    public final String[] zzg() {
        return this.zzf;
    }
}