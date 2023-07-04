package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
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

@SafeParcelable.Class(creator = "OfferWalletObjectCreator")
/* loaded from: classes3.dex */
public final class OfferWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OfferWalletObject> CREATOR = new zzv();
    @SafeParcelable.Field(id = 2)
    String zza;
    @SafeParcelable.Field(id = 3)
    String zzb;
    @SafeParcelable.Field(id = 4)
    CommonWalletObject zzc;
    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int zzd;

    /* loaded from: classes3.dex */
    public final class Builder {
        private com.google.android.gms.wallet.wobs.zzb zzb = CommonWalletObject.zzb();

        /* synthetic */ Builder(zzu zzuVar) {
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

        public OfferWalletObject build() {
            OfferWalletObject.this.zzc = this.zzb.zzz();
            return OfferWalletObject.this;
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

        public Builder setClassId(String str) {
            this.zzb.zzq(str);
            return this;
        }

        public Builder setId(String str) {
            this.zzb.zzr(str);
            OfferWalletObject.this.zza = str;
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

        public Builder setRedemptionCode(String str) {
            OfferWalletObject.this.zzb = str;
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

    OfferWalletObject() {
        this.zzd = 3;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public String getBarcodeAlternateText() {
        return this.zzc.zzd();
    }

    @Deprecated
    public String getBarcodeLabel() {
        return this.zzc.zze();
    }

    public String getBarcodeType() {
        return this.zzc.zzf();
    }

    public String getBarcodeValue() {
        return this.zzc.zzg();
    }

    public String getClassId() {
        return this.zzc.zzh();
    }

    public String getId() {
        return this.zzc.zzi();
    }

    public ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.zzc.zzn();
    }

    @Deprecated
    public String getInfoModuleDataHexBackgroundColor() {
        return this.zzc.zzj();
    }

    @Deprecated
    public String getInfoModuleDataHexFontColor() {
        return this.zzc.zzk();
    }

    public ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.zzc.zzo();
    }

    public boolean getInfoModuleDataShowLastUpdateTime() {
        return this.zzc.zzt();
    }

    public String getIssuerName() {
        return this.zzc.zzl();
    }

    public ArrayList<UriData> getLinksModuleDataUris() {
        return this.zzc.zzp();
    }

    public ArrayList<LatLng> getLocations() {
        return this.zzc.zzq();
    }

    public ArrayList<WalletObjectMessage> getMessages() {
        return this.zzc.zzr();
    }

    public String getRedemptionCode() {
        return this.zzb;
    }

    public int getState() {
        return this.zzc.zza();
    }

    public ArrayList<TextModuleData> getTextModulesData() {
        return this.zzc.zzs();
    }

    public String getTitle() {
        return this.zzc.zzm();
    }

    public TimeInterval getValidTimeInterval() {
        return this.zzc.zzc();
    }

    public int getVersionCode() {
        return this.zzd;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public OfferWalletObject(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) CommonWalletObject commonWalletObject) {
        this.zzd = i11;
        this.zzb = str2;
        if (i11 >= 3) {
            this.zzc = commonWalletObject;
            return;
        }
        com.google.android.gms.wallet.wobs.zzb zzb = CommonWalletObject.zzb();
        zzb.zzr(str);
        this.zzc = zzb.zzz();
    }
}