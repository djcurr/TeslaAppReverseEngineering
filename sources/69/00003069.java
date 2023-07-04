package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@UsedByNative("wrapper.cc")
@SafeParcelable.Class(creator = "LandmarkParcelCreator")
/* loaded from: classes3.dex */
public final class LandmarkParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LandmarkParcel> CREATOR = new zzm();
    @SafeParcelable.Field(id = 4)
    public final int type;
    @SafeParcelable.VersionField(id = 1)
    private final int versionCode;
    @SafeParcelable.Field(id = 2)

    /* renamed from: x  reason: collision with root package name */
    public final float f14810x;
    @SafeParcelable.Field(id = 3)

    /* renamed from: y  reason: collision with root package name */
    public final float f14811y;

    @SafeParcelable.Constructor
    @UsedByNative("wrapper.cc")
    public LandmarkParcel(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) float f11, @SafeParcelable.Param(id = 3) float f12, @SafeParcelable.Param(id = 4) int i12) {
        this.versionCode = i11;
        this.f14810x = f11;
        this.f14811y = f12;
        this.type = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeFloat(parcel, 2, this.f14810x);
        SafeParcelWriter.writeFloat(parcel, 3, this.f14811y);
        SafeParcelWriter.writeInt(parcel, 4, this.type);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}