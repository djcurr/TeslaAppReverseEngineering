package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "TextElementParcelCreator")
/* loaded from: classes3.dex */
public final class zzpc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpc> CREATOR = new zzpd();
    @SafeParcelable.Field(getter = "getText", id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getBoundingBox", id = 2)
    private final Rect zzb;
    @SafeParcelable.Field(getter = "getCornerPointList", id = 3)
    private final List zzc;
    @SafeParcelable.Field(getter = "getRecognizedLanguage", id = 4)
    private final String zzd;
    @SafeParcelable.Field(getter = "getConfidence", id = 5)
    private final float zze;
    @SafeParcelable.Field(getter = "getAngle", id = 6)
    private final float zzf;
    @SafeParcelable.Field(getter = "getTextSymbolList", id = 7)
    private final List zzg;

    @SafeParcelable.Constructor
    public zzpc(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) Rect rect, @SafeParcelable.Param(id = 3) List list, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) float f11, @SafeParcelable.Param(id = 6) float f12, @SafeParcelable.Param(id = 7) List list2) {
        this.zza = str;
        this.zzb = rect;
        this.zzc = list;
        this.zzd = str2;
        this.zze = f11;
        this.zzf = f12;
        this.zzg = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i11, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeFloat(parcel, 5, this.zze);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzf);
        SafeParcelWriter.writeTypedList(parcel, 7, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final float zza() {
        return this.zzf;
    }

    public final float zzb() {
        return this.zze;
    }

    public final Rect zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zza;
    }

    public final List zzf() {
        return this.zzc;
    }

    public final List zzg() {
        return this.zzg;
    }
}