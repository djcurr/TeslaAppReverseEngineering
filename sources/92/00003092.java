package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

@SafeParcelable.Class(creator = "FullWalletCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new zzl();
    @SafeParcelable.Field(id = 2)
    String zza;
    @SafeParcelable.Field(id = 3)
    String zzb;
    @SafeParcelable.Field(id = 4)
    zzaj zzc;
    @SafeParcelable.Field(id = 5)
    String zzd;
    @SafeParcelable.Field(id = 6)
    zza zze;
    @SafeParcelable.Field(id = 7)
    zza zzf;
    @SafeParcelable.Field(id = 8)
    String[] zzg;
    @SafeParcelable.Field(id = 9)
    UserAddress zzh;
    @SafeParcelable.Field(id = 10)
    UserAddress zzi;
    @SafeParcelable.Field(id = 11)
    InstrumentInfo[] zzj;
    @SafeParcelable.Field(id = 12)
    PaymentMethodToken zzk;

    private FullWallet() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i11, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zze, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i11, false);
        SafeParcelWriter.writeStringArray(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i11, false);
        SafeParcelWriter.writeTypedArray(parcel, 11, this.zzj, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public FullWallet(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) zzaj zzajVar, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) zza zzaVar, @SafeParcelable.Param(id = 7) zza zzaVar2, @SafeParcelable.Param(id = 8) String[] strArr, @SafeParcelable.Param(id = 9) UserAddress userAddress, @SafeParcelable.Param(id = 10) UserAddress userAddress2, @SafeParcelable.Param(id = 11) InstrumentInfo[] instrumentInfoArr, @SafeParcelable.Param(id = 12) PaymentMethodToken paymentMethodToken) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzajVar;
        this.zzd = str3;
        this.zze = zzaVar;
        this.zzf = zzaVar2;
        this.zzg = strArr;
        this.zzh = userAddress;
        this.zzi = userAddress2;
        this.zzj = instrumentInfoArr;
        this.zzk = paymentMethodToken;
    }
}