package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AddressParcelCreator")
/* loaded from: classes3.dex */
public final class zzpf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpf> CREATOR = new zzpe();
    @SafeParcelable.Field(getter = "getType", id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getAddressLines", id = 2)
    private final String[] zzb;

    @SafeParcelable.Constructor
    public zzpf(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) String[] strArr) {
        this.zza = i11;
        this.zzb = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeStringArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zza;
    }

    public final String[] zzb() {
        return this.zzb;
    }
}