package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "TextSymbolParcelCreator")
/* loaded from: classes3.dex */
public final class zzpi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpi> CREATOR = new zzpj();
    @SafeParcelable.Field(getter = "getText", id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getBoundingBox", id = 2)
    private final Rect zzb;
    @SafeParcelable.Field(getter = "getCornerPointList", id = 3)
    private final List zzc;
    @SafeParcelable.Field(getter = "getConfidence", id = 4)
    private final float zzd;
    @SafeParcelable.Field(getter = "getAngle", id = 5)
    private final float zze;

    @SafeParcelable.Constructor
    public zzpi(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) Rect rect, @SafeParcelable.Param(id = 3) List list, @SafeParcelable.Param(id = 4) float f11, @SafeParcelable.Param(id = 5) float f12) {
        this.zza = str;
        this.zzb = rect;
        this.zzc = list;
        this.zzd = f11;
        this.zze = f12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i11, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeFloat(parcel, 4, this.zzd);
        SafeParcelWriter.writeFloat(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final float zza() {
        return this.zze;
    }

    public final float zzb() {
        return this.zzd;
    }

    public final Rect zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zza;
    }

    public final List zze() {
        return this.zzc;
    }
}