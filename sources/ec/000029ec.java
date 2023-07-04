package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "FaceDetectorOptionsParcelCreator")
/* loaded from: classes3.dex */
public final class zzou extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzou> CREATOR = new zzov();
    @SafeParcelable.Field(getter = "getPerformanceMode", id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getLandmarkMode", id = 2)
    private final int zzb;
    @SafeParcelable.Field(getter = "getClassificationMode", id = 3)
    private final int zzc;
    @SafeParcelable.Field(getter = "getContourMode", id = 4)
    private final int zzd;
    @SafeParcelable.Field(getter = "isTrackingEnabled", id = 5)
    private final boolean zze;
    @SafeParcelable.Field(getter = "getProportionalMinFaceSize", id = 6)
    private final float zzf;

    @SafeParcelable.Constructor
    public zzou(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) int i12, @SafeParcelable.Param(id = 3) int i13, @SafeParcelable.Param(id = 4) int i14, @SafeParcelable.Param(id = 5) boolean z11, @SafeParcelable.Param(id = 6) float f11) {
        this.zza = i11;
        this.zzb = i12;
        this.zzc = i13;
        this.zzd = i14;
        this.zze = z11;
        this.zzf = f11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzf);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}