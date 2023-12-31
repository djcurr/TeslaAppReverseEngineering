package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "FaceSettingsParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();
    @SafeParcelable.Field(id = 3)
    public int landmarkType;
    @SafeParcelable.Field(id = 2)
    public int mode;
    @SafeParcelable.Field(defaultValue = "-1", id = 7)
    public float proportionalMinFaceSize;
    @SafeParcelable.Field(id = 6)
    public boolean trackingEnabled;
    @SafeParcelable.Field(id = 5)
    public boolean zzcm;
    @SafeParcelable.Field(id = 4)
    public int zzcn;

    public zze() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.mode);
        SafeParcelWriter.writeInt(parcel, 3, this.landmarkType);
        SafeParcelWriter.writeInt(parcel, 4, this.zzcn);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzcm);
        SafeParcelWriter.writeBoolean(parcel, 6, this.trackingEnabled);
        SafeParcelWriter.writeFloat(parcel, 7, this.proportionalMinFaceSize);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) int i12, @SafeParcelable.Param(id = 4) int i13, @SafeParcelable.Param(id = 5) boolean z11, @SafeParcelable.Param(id = 6) boolean z12, @SafeParcelable.Param(id = 7) float f11) {
        this.mode = i11;
        this.landmarkType = i12;
        this.zzcn = i13;
        this.zzcm = z11;
        this.trackingEnabled = z12;
        this.proportionalMinFaceSize = f11;
    }
}