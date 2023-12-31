package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LineBoxParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new zzaf();
    @SafeParcelable.Field(id = 7)
    private final float zzdo;
    @SafeParcelable.Field(id = 8)
    public final String zzex;
    @SafeParcelable.Field(id = 2)
    public final zzan[] zzfc;
    @SafeParcelable.Field(id = 3)
    public final zzy zzfd;
    @SafeParcelable.Field(id = 4)
    private final zzy zzfe;
    @SafeParcelable.Field(id = 5)
    private final zzy zzff;
    @SafeParcelable.Field(id = 6)
    public final String zzfg;
    @SafeParcelable.Field(id = 9)
    private final int zzfh;
    @SafeParcelable.Field(id = 10)
    public final boolean zzfi;
    @SafeParcelable.Field(id = 11)
    public final int zzfj;
    @SafeParcelable.Field(id = 12)
    public final int zzfk;

    @SafeParcelable.Constructor
    public zzae(@SafeParcelable.Param(id = 2) zzan[] zzanVarArr, @SafeParcelable.Param(id = 3) zzy zzyVar, @SafeParcelable.Param(id = 4) zzy zzyVar2, @SafeParcelable.Param(id = 5) zzy zzyVar3, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) float f11, @SafeParcelable.Param(id = 8) String str2, @SafeParcelable.Param(id = 9) int i11, @SafeParcelable.Param(id = 10) boolean z11, @SafeParcelable.Param(id = 11) int i12, @SafeParcelable.Param(id = 12) int i13) {
        this.zzfc = zzanVarArr;
        this.zzfd = zzyVar;
        this.zzfe = zzyVar2;
        this.zzff = zzyVar3;
        this.zzfg = str;
        this.zzdo = f11;
        this.zzex = str2;
        this.zzfh = i11;
        this.zzfi = z11;
        this.zzfj = i12;
        this.zzfk = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zzfc, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzfd, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzfe, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzff, i11, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzfg, false);
        SafeParcelWriter.writeFloat(parcel, 7, this.zzdo);
        SafeParcelWriter.writeString(parcel, 8, this.zzex, false);
        SafeParcelWriter.writeInt(parcel, 9, this.zzfh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzfi);
        SafeParcelWriter.writeInt(parcel, 11, this.zzfj);
        SafeParcelWriter.writeInt(parcel, 12, this.zzfk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}