package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.components.model.payments.request.Address;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "DeviceOrientationRequestInternalCreator")
/* loaded from: classes3.dex */
public final class zzh extends AbstractSafeParcelable {
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_DEVICE_ORIENTATION_REQUEST", id = 1)
    final com.google.android.gms.location.zzw zzc;
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_CLIENTS", id = 2)
    final List zzd;
    @SafeParcelable.Field(defaultValueUnchecked = Address.ADDRESS_NULL_PLACEHOLDER, id = 3)
    final String zze;
    @VisibleForTesting
    static final List zza = Collections.emptyList();
    static final com.google.android.gms.location.zzw zzb = new com.google.android.gms.location.zzw();
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzh(@SafeParcelable.Param(id = 1) com.google.android.gms.location.zzw zzwVar, @SafeParcelable.Param(id = 2) List list, @SafeParcelable.Param(id = 3) String str) {
        this.zzc = zzwVar;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzh) {
            zzh zzhVar = (zzh) obj;
            return Objects.equal(this.zzc, zzhVar.zzc) && Objects.equal(this.zzd, zzhVar.zzd) && Objects.equal(this.zze, zzhVar.zze);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzd);
        String str = this.zze;
        int length = valueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 77 + valueOf2.length() + String.valueOf(str).length());
        sb2.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb2.append(valueOf);
        sb2.append(", clients=");
        sb2.append(valueOf2);
        sb2.append(", tag='");
        sb2.append(str);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zzc, i11, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 3, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}