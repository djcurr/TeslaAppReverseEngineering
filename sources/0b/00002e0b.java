package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class(creator = "PatternItemCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public class PatternItem extends AbstractSafeParcelable {
    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int zzb;
    @SafeParcelable.Field(getter = "getLength", id = 3)
    private final Float zzc;
    private static final String zza = PatternItem.class.getSimpleName();
    public static final Parcelable.Creator<PatternItem> CREATOR = new zzj();

    @SafeParcelable.Constructor
    public PatternItem(@SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) Float f11) {
        boolean z11 = false;
        if (i11 == 1 || (f11 != null && f11.floatValue() >= BitmapDescriptorFactory.HUE_RED)) {
            z11 = true;
        }
        String valueOf = String.valueOf(f11);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 45);
        sb2.append("Invalid PatternItem: type=");
        sb2.append(i11);
        sb2.append(" length=");
        sb2.append(valueOf);
        Preconditions.checkArgument(z11, sb2.toString());
        this.zzb = i11;
        this.zzc = f11;
    }

    public static List<PatternItem> zza(List<PatternItem> list) {
        PatternItem dash;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (PatternItem patternItem : list) {
            if (patternItem == null) {
                patternItem = null;
            } else {
                int i11 = patternItem.zzb;
                if (i11 == 0) {
                    Preconditions.checkState(patternItem.zzc != null, "length must not be null.");
                    dash = new Dash(patternItem.zzc.floatValue());
                } else if (i11 == 1) {
                    patternItem = new Dot();
                } else if (i11 != 2) {
                    String str = zza;
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Unknown PatternItem type: ");
                    sb2.append(i11);
                    Log.w(str, sb2.toString());
                } else {
                    Preconditions.checkState(patternItem.zzc != null, "length must not be null.");
                    dash = new Gap(patternItem.zzc.floatValue());
                }
                patternItem = dash;
            }
            arrayList.add(patternItem);
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PatternItem) {
            PatternItem patternItem = (PatternItem) obj;
            return this.zzb == patternItem.zzb && Objects.equal(this.zzc, patternItem.zzc);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc);
    }

    public String toString() {
        int i11 = this.zzb;
        String valueOf = String.valueOf(this.zzc);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 39);
        sb2.append("[PatternItem: type=");
        sb2.append(i11);
        sb2.append(" length=");
        sb2.append(valueOf);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeFloatObject(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}