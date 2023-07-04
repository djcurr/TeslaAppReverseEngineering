package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "WordBoxParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new zzao();
    @SafeParcelable.Field(id = 6)
    private final float zzdo;
    @SafeParcelable.Field(id = 7)
    public final String zzex;
    @SafeParcelable.Field(id = 3)
    public final zzy zzfd;
    @SafeParcelable.Field(id = 4)
    private final zzy zzfe;
    @SafeParcelable.Field(id = 5)
    public final String zzfg;
    @SafeParcelable.Field(id = 2)
    private final zzai[] zzfm;
    @SafeParcelable.Field(id = 8)
    private final boolean zzfn;

    @SafeParcelable.Constructor
    public zzan(@SafeParcelable.Param(id = 2) zzai[] zzaiVarArr, @SafeParcelable.Param(id = 3) zzy zzyVar, @SafeParcelable.Param(id = 4) zzy zzyVar2, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) float f11, @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 8) boolean z11) {
        this.zzfm = zzaiVarArr;
        this.zzfd = zzyVar;
        this.zzfe = zzyVar2;
        this.zzfg = str;
        this.zzdo = f11;
        this.zzex = str2;
        this.zzfn = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zzfm, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzfd, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzfe, i11, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzfg, false);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzdo);
        SafeParcelWriter.writeString(parcel, 7, this.zzex, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzfn);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}