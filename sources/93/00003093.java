package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "GiftCardWalletObjectCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class GiftCardWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GiftCardWalletObject> CREATOR = new zzn();
    @SafeParcelable.Field(id = 2)
    CommonWalletObject zza;
    @SafeParcelable.Field(id = 3)
    String zzb;
    @SafeParcelable.Field(id = 4)
    String zzc;
    @SafeParcelable.Field(id = 5)
    @Deprecated
    String zzd;
    @SafeParcelable.Field(id = 6)
    long zze;
    @SafeParcelable.Field(id = 7)
    String zzf;
    @SafeParcelable.Field(id = 8)
    long zzg;
    @SafeParcelable.Field(id = 9)
    String zzh;

    /* loaded from: classes3.dex */
    public final class Builder {
        private com.google.android.gms.wallet.wobs.zzb zzb = CommonWalletObject.zzb();

        /* synthetic */ Builder(zzm zzmVar) {
        }

        public Builder addImageModuleDataMainImageUri(UriData uriData) {
            this.zzb.zza(uriData);
            return this;
        }

        public Builder addImageModuleDataMainImageUris(Collection<UriData> collection) {
            this.zzb.zzb(collection);
            return this;
        }

        public Builder addInfoModuleDataLabelValueRow(LabelValueRow labelValueRow) {
            this.zzb.zzc(labelValueRow);
            return this;
        }

        public Builder addInfoModuleDataLabelValueRows(Collection<LabelValueRow> collection) {
            this.zzb.zzd(collection);
            return this;
        }

        public Builder addLinksModuleDataUri(UriData uriData) {
            this.zzb.zze(uriData);
            return this;
        }

        public Builder addLinksModuleDataUris(Collection<UriData> collection) {
            this.zzb.zzf(collection);
            return this;
        }

        public Builder addLocation(LatLng latLng) {
            this.zzb.zzg(latLng);
            return this;
        }

        public Builder addLocations(Collection<LatLng> collection) {
            this.zzb.zzh(collection);
            return this;
        }

        public Builder addMessage(WalletObjectMessage walletObjectMessage) {
            this.zzb.zzi(walletObjectMessage);
            return this;
        }

        public Builder addMessages(Collection<WalletObjectMessage> collection) {
            this.zzb.zzj(collection);
            return this;
        }

        public Builder addTextModuleData(TextModuleData textModuleData) {
            this.zzb.zzk(textModuleData);
            return this;
        }

        public Builder addTextModulesData(Collection<TextModuleData> collection) {
            this.zzb.zzl(collection);
            return this;
        }

        public GiftCardWalletObject build() {
            Preconditions.checkArgument(!TextUtils.isEmpty(GiftCardWalletObject.this.zzb), "Card number is required.");
            GiftCardWalletObject.this.zza = this.zzb.zzz();
            Preconditions.checkArgument(!TextUtils.isEmpty(GiftCardWalletObject.this.zza.zzm()), "Card name is required.");
            Preconditions.checkArgument(!TextUtils.isEmpty(GiftCardWalletObject.this.zza.zzl()), "Card issuer name is required.");
            return GiftCardWalletObject.this;
        }

        public Builder setBalanceCurrencyCode(String str) {
            GiftCardWalletObject.this.zzf = str;
            return this;
        }

        public Builder setBalanceMicros(long j11) {
            GiftCardWalletObject.this.zze = j11;
            return this;
        }

        public Builder setBalanceUpdateTime(long j11) {
            GiftCardWalletObject.this.zzg = j11;
            return this;
        }

        public Builder setBarcodeAlternateText(String str) {
            this.zzb.zzm(str);
            return this;
        }

        @Deprecated
        public Builder setBarcodeLabel(String str) {
            this.zzb.zzn(str);
            return this;
        }

        public Builder setBarcodeType(String str) {
            this.zzb.zzo(str);
            return this;
        }

        public Builder setBarcodeValue(String str) {
            this.zzb.zzp(str);
            return this;
        }

        @Deprecated
        public Builder setCardIdentifier(String str) {
            GiftCardWalletObject.this.zzd = str;
            return this;
        }

        public Builder setCardNumber(String str) {
            GiftCardWalletObject.this.zzb = str;
            return this;
        }

        public Builder setClassId(String str) {
            this.zzb.zzq(str);
            return this;
        }

        public Builder setEventNumber(String str) {
            GiftCardWalletObject.this.zzh = str;
            return this;
        }

        public Builder setId(String str) {
            this.zzb.zzr(str);
            return this;
        }

        @Deprecated
        public Builder setInfoModuleDataHexBackgroundColor(String str) {
            this.zzb.zzs(str);
            return this;
        }

        @Deprecated
        public Builder setInfoModuleDataHexFontColor(String str) {
            this.zzb.zzt(str);
            return this;
        }

        public Builder setInfoModuleDataShowLastUpdateTime(boolean z11) {
            this.zzb.zzu(z11);
            return this;
        }

        public Builder setIssuerName(String str) {
            this.zzb.zzv(str);
            return this;
        }

        public Builder setPin(String str) {
            GiftCardWalletObject.this.zzc = str;
            return this;
        }

        public Builder setState(int i11) {
            this.zzb.zzx(i11);
            return this;
        }

        public Builder setTitle(String str) {
            this.zzb.zzw(str);
            return this;
        }

        public Builder setValidTimeInterval(TimeInterval timeInterval) {
            this.zzb.zzy(timeInterval);
            return this;
        }
    }

    GiftCardWalletObject() {
        this.zza = CommonWalletObject.zzb().zzz();
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public String getBalanceCurrencyCode() {
        return this.zzf;
    }

    public long getBalanceMicros() {
        return this.zze;
    }

    public long getBalanceUpdateTime() {
        return this.zzg;
    }

    public String getBarcodeAlternateText() {
        return this.zza.zzd();
    }

    @Deprecated
    public String getBarcodeLabel() {
        return this.zza.zze();
    }

    public String getBarcodeType() {
        return this.zza.zzf();
    }

    public String getBarcodeValue() {
        return this.zza.zzg();
    }

    @Deprecated
    public String getCardIdentifier() {
        return this.zzd;
    }

    public String getCardNumber() {
        return this.zzb;
    }

    public String getClassId() {
        return this.zza.zzh();
    }

    public String getEventNumber() {
        return this.zzh;
    }

    public String getId() {
        return this.zza.zzi();
    }

    public ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.zza.zzn();
    }

    @Deprecated
    public String getInfoModuleDataHexBackgroundColor() {
        return this.zza.zzj();
    }

    @Deprecated
    public String getInfoModuleDataHexFontColor() {
        return this.zza.zzk();
    }

    public ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.zza.zzo();
    }

    public boolean getInfoModuleDataShowLastUpdateTime() {
        return this.zza.zzt();
    }

    public String getIssuerName() {
        return this.zza.zzl();
    }

    public ArrayList<UriData> getLinksModuleDataUris() {
        return this.zza.zzp();
    }

    public ArrayList<LatLng> getLocations() {
        return this.zza.zzq();
    }

    public ArrayList<WalletObjectMessage> getMessages() {
        return this.zza.zzr();
    }

    public String getPin() {
        return this.zzc;
    }

    public int getState() {
        return this.zza.zza();
    }

    public ArrayList<TextModuleData> getTextModulesData() {
        return this.zza.zzs();
    }

    public String getTitle() {
        return this.zza.zzm();
    }

    public TimeInterval getValidTimeInterval() {
        return this.zza.zzc();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i11, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeLong(parcel, 6, this.zze);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeLong(parcel, 8, this.zzg);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public GiftCardWalletObject(@SafeParcelable.Param(id = 2) CommonWalletObject commonWalletObject, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) long j11, @SafeParcelable.Param(id = 7) String str4, @SafeParcelable.Param(id = 8) long j12, @SafeParcelable.Param(id = 9) String str5) {
        CommonWalletObject.zzb();
        this.zza = commonWalletObject;
        this.zzb = str;
        this.zzc = str2;
        this.zze = j11;
        this.zzf = str4;
        this.zzg = j12;
        this.zzh = str5;
        this.zzd = str3;
    }
}