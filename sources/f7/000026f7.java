package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "WiFiParcelCreator")
/* loaded from: classes3.dex */
public final class zzpq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpq> CREATOR = new zzqj();
    @SafeParcelable.Field(getter = "getSsid", id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getPassword", id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getEncryptionType", id = 3)
    private final int zzc;

    @SafeParcelable.Constructor
    public zzpq(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) int i11) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}