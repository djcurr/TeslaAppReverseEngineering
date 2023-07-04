package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "ShippingAddressRequirementsCreator")
/* loaded from: classes3.dex */
public final class ShippingAddressRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ShippingAddressRequirements> CREATOR = new zzam();
    @SafeParcelable.Field(id = 1)
    ArrayList zza;

    /* loaded from: classes3.dex */
    public final class Builder {
        /* synthetic */ Builder(zzal zzalVar) {
        }

        public Builder addAllowedCountryCode(String str) {
            Preconditions.checkNotEmpty(str, "allowedCountryCode can't be null or empty! If you don't have restrictions, just leave it unset.");
            ShippingAddressRequirements shippingAddressRequirements = ShippingAddressRequirements.this;
            if (shippingAddressRequirements.zza == null) {
                shippingAddressRequirements.zza = new ArrayList();
            }
            ShippingAddressRequirements.this.zza.add(str);
            return this;
        }

        public Builder addAllowedCountryCodes(Collection<String> collection) {
            if (collection != null && !collection.isEmpty()) {
                ShippingAddressRequirements shippingAddressRequirements = ShippingAddressRequirements.this;
                if (shippingAddressRequirements.zza == null) {
                    shippingAddressRequirements.zza = new ArrayList();
                }
                ShippingAddressRequirements.this.zza.addAll(collection);
                return this;
            }
            throw new IllegalArgumentException("allowedCountryCodes can't be null or empty! If you don't have restrictions, just leave it unset.");
        }

        public ShippingAddressRequirements build() {
            return ShippingAddressRequirements.this;
        }
    }

    private ShippingAddressRequirements() {
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public ArrayList<String> getAllowedCountryCodes() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public ShippingAddressRequirements(@SafeParcelable.Param(id = 1) ArrayList arrayList) {
        this.zza = arrayList;
    }
}