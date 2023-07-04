package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "CardRequirementsCreator")
/* loaded from: classes3.dex */
public final class CardRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardRequirements> CREATOR = new zzg();
    @SafeParcelable.Field(id = 1)
    ArrayList zza;
    @SafeParcelable.Field(defaultValue = "true", id = 2)
    boolean zzb;
    @SafeParcelable.Field(id = 3)
    boolean zzc;
    @SafeParcelable.Field(id = 4)
    int zzd;

    /* loaded from: classes3.dex */
    public final class Builder {
        /* synthetic */ Builder(zzf zzfVar) {
        }

        public Builder addAllowedCardNetwork(int i11) {
            CardRequirements cardRequirements = CardRequirements.this;
            if (cardRequirements.zza == null) {
                cardRequirements.zza = new ArrayList();
            }
            CardRequirements.this.zza.add(Integer.valueOf(i11));
            return this;
        }

        public Builder addAllowedCardNetworks(Collection<Integer> collection) {
            boolean z11 = false;
            if (collection != null && !collection.isEmpty()) {
                z11 = true;
            }
            Preconditions.checkArgument(z11, "allowedCardNetworks can't be null or empty! You must provide a valid value from WalletConstants.CardNetwork.");
            CardRequirements cardRequirements = CardRequirements.this;
            if (cardRequirements.zza == null) {
                cardRequirements.zza = new ArrayList();
            }
            CardRequirements.this.zza.addAll(collection);
            return this;
        }

        public CardRequirements build() {
            Preconditions.checkNotNull(CardRequirements.this.zza, "Allowed card networks must be non-empty! You can set it through addAllowedCardNetwork() or addAllowedCardNetworks() in the CardRequirements Builder.");
            return CardRequirements.this;
        }

        public Builder setAllowPrepaidCards(boolean z11) {
            CardRequirements.this.zzb = z11;
            return this;
        }

        public Builder setBillingAddressFormat(int i11) {
            CardRequirements.this.zzd = i11;
            return this;
        }

        public Builder setBillingAddressRequired(boolean z11) {
            CardRequirements.this.zzc = z11;
            return this;
        }
    }

    private CardRequirements() {
        this.zzb = true;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public boolean allowPrepaidCards() {
        return this.zzb;
    }

    public ArrayList<Integer> getAllowedCardNetworks() {
        return this.zza;
    }

    public int getBillingAddressFormat() {
        return this.zzd;
    }

    public boolean isBillingAddressRequired() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public CardRequirements(@SafeParcelable.Param(id = 1) ArrayList arrayList, @SafeParcelable.Param(id = 2) boolean z11, @SafeParcelable.Param(id = 3) boolean z12, @SafeParcelable.Param(id = 4) int i11) {
        this.zza = arrayList;
        this.zzb = z11;
        this.zzc = z12;
        this.zzd = i11;
    }
}