package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

@SafeParcelable.Class(creator = "CardInfoCreator")
/* loaded from: classes3.dex */
public final class CardInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardInfo> CREATOR = new zze();
    @SafeParcelable.Field(id = 1)
    String zza;
    @SafeParcelable.Field(id = 2)
    String zzb;
    @SafeParcelable.Field(id = 3)
    String zzc;
    @SafeParcelable.Field(id = 4)
    int zzd;
    @SafeParcelable.Field(id = 5)
    UserAddress zze;

    private CardInfo() {
    }

    public UserAddress getBillingAddress() {
        return this.zze;
    }

    public int getCardClass() {
        int i11 = this.zzd;
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return i11;
        }
        return 0;
    }

    public String getCardDescription() {
        return this.zza;
    }

    public String getCardDetails() {
        return this.zzc;
    }

    public String getCardNetwork() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public CardInfo(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) int i11, @SafeParcelable.Param(id = 5) UserAddress userAddress) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = i11;
        this.zze = userAddress;
    }
}