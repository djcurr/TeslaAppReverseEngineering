package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "BarcodeScannerOptionsParcelCreator")
/* loaded from: classes3.dex */
public final class zzpt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpt> CREATOR = new zzpu();
    @SafeParcelable.Field(getter = "getSupportedFormats", id = 1)
    private final int zza;

    @SafeParcelable.Constructor
    public zzpt(@SafeParcelable.Param(id = 1) int i11) {
        this.zza = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}