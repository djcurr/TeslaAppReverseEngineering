package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;

@SafeParcelable.Class(creator = "MapStyleOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class MapStyleOptions extends AbstractSafeParcelable {
    @SafeParcelable.Field(getter = "getJson", id = 2)
    private String zzb;
    private static final String zza = MapStyleOptions.class.getSimpleName();
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new zzh();

    @SafeParcelable.Constructor
    public MapStyleOptions(@SafeParcelable.Param(id = 2) String str) {
        Preconditions.checkNotNull(str, "json must not be null");
        this.zzb = str;
    }

    public static MapStyleOptions loadRawResourceStyle(Context context, int i11) {
        try {
            return new MapStyleOptions(new String(IOUtils.readInputStreamFully(context.getResources().openRawResource(i11)), "UTF-8"));
        } catch (IOException e11) {
            String obj = e11.toString();
            StringBuilder sb2 = new StringBuilder(obj.length() + 37);
            sb2.append("Failed to read resource ");
            sb2.append(i11);
            sb2.append(": ");
            sb2.append(obj);
            throw new Resources.NotFoundException(sb2.toString());
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}