package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "WalletObjectMessageCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class WalletObjectMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletObjectMessage> CREATOR = new zzo();
    @SafeParcelable.Field(id = 2)
    String zza;
    @SafeParcelable.Field(id = 3)
    String zzb;
    @SafeParcelable.Field(id = 4)
    TimeInterval zzc;
    @SafeParcelable.Field(id = 5)
    @Deprecated
    UriData zzd;
    @SafeParcelable.Field(id = 6)
    @Deprecated
    UriData zze;

    /* loaded from: classes3.dex */
    public final class Builder {
        /* synthetic */ Builder(zzn zznVar) {
        }

        public WalletObjectMessage build() {
            return WalletObjectMessage.this;
        }

        @Deprecated
        public Builder setActionUri(UriData uriData) {
            WalletObjectMessage.this.zzd = uriData;
            return this;
        }

        public Builder setBody(String str) {
            WalletObjectMessage.this.zzb = str;
            return this;
        }

        public Builder setDisplayInterval(TimeInterval timeInterval) {
            WalletObjectMessage.this.zzc = timeInterval;
            return this;
        }

        public Builder setHeader(String str) {
            WalletObjectMessage.this.zza = str;
            return this;
        }

        @Deprecated
        public Builder setImageUri(UriData uriData) {
            WalletObjectMessage.this.zze = uriData;
            return this;
        }
    }

    WalletObjectMessage() {
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    @Deprecated
    public UriData getActionUri() {
        return this.zzd;
    }

    public String getBody() {
        return this.zzb;
    }

    public TimeInterval getDisplayInterval() {
        return this.zzc;
    }

    public String getHeader() {
        return this.zza;
    }

    @Deprecated
    public UriData getImageUri() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zze, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public WalletObjectMessage(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) TimeInterval timeInterval, @SafeParcelable.Param(id = 5) UriData uriData, @SafeParcelable.Param(id = 6) UriData uriData2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = timeInterval;
        this.zzd = uriData;
        this.zze = uriData2;
    }
}