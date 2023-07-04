package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "IsReadyToPayRequestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IsReadyToPayRequest> CREATOR = new zzq();
    @SafeParcelable.Field(id = 2)
    ArrayList zza;
    @SafeParcelable.Field(id = 4)
    String zzb;
    @SafeParcelable.Field(id = 5)
    String zzc;
    @SafeParcelable.Field(id = 6)
    ArrayList zzd;
    @SafeParcelable.Field(id = 7)
    boolean zze;
    @SafeParcelable.Field(id = 8)
    String zzf;

    @Deprecated
    /* loaded from: classes3.dex */
    public final class Builder {
        /* synthetic */ Builder(zzp zzpVar) {
        }

        public Builder addAllowedCardNetwork(int i11) {
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.zza == null) {
                isReadyToPayRequest.zza = new ArrayList();
            }
            IsReadyToPayRequest.this.zza.add(Integer.valueOf(i11));
            return this;
        }

        public Builder addAllowedCardNetworks(Collection<Integer> collection) {
            boolean z11 = false;
            if (collection != null && !collection.isEmpty()) {
                z11 = true;
            }
            Preconditions.checkArgument(z11, "allowedCardNetworks can't be null or empty. If you want the defaults, leave it unset.");
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.zza == null) {
                isReadyToPayRequest.zza = new ArrayList();
            }
            IsReadyToPayRequest.this.zza.addAll(collection);
            return this;
        }

        public Builder addAllowedPaymentMethod(int i11) {
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.zzd == null) {
                isReadyToPayRequest.zzd = new ArrayList();
            }
            IsReadyToPayRequest.this.zzd.add(Integer.valueOf(i11));
            return this;
        }

        public Builder addAllowedPaymentMethods(Collection<Integer> collection) {
            boolean z11 = false;
            if (collection != null && !collection.isEmpty()) {
                z11 = true;
            }
            Preconditions.checkArgument(z11, "allowedPaymentMethods can't be null or empty. If you want the default, leave it unset.");
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.zzd == null) {
                isReadyToPayRequest.zzd = new ArrayList();
            }
            IsReadyToPayRequest.this.zzd.addAll(collection);
            return this;
        }

        public IsReadyToPayRequest build() {
            return IsReadyToPayRequest.this;
        }

        public Builder setExistingPaymentMethodRequired(boolean z11) {
            IsReadyToPayRequest.this.zze = z11;
            return this;
        }
    }

    IsReadyToPayRequest() {
    }

    public static IsReadyToPayRequest fromJson(String str) {
        Builder newBuilder = newBuilder();
        IsReadyToPayRequest.this.zzf = (String) Preconditions.checkNotNull(str, "isReadyToPayRequestJson cannot be null!");
        return newBuilder.build();
    }

    @Deprecated
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @Deprecated
    public ArrayList<Integer> getAllowedCardNetworks() {
        return this.zza;
    }

    @Deprecated
    public ArrayList<Integer> getAllowedPaymentMethods() {
        return this.zzd;
    }

    @Deprecated
    public boolean isExistingPaymentMethodRequired() {
        return this.zze;
    }

    public String toJson() {
        return this.zzf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzc, false);
        SafeParcelWriter.writeIntegerList(parcel, 6, this.zzd, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zze);
        SafeParcelWriter.writeString(parcel, 8, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public IsReadyToPayRequest(@SafeParcelable.Param(id = 2) ArrayList arrayList, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) ArrayList arrayList2, @SafeParcelable.Param(id = 7) boolean z11, @SafeParcelable.Param(id = 8) String str3) {
        this.zza = arrayList;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = arrayList2;
        this.zze = z11;
        this.zzf = str3;
    }
}