package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "UserAddressRequestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class UserAddressRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddressRequest> CREATOR = new zze();
    @SafeParcelable.Field(id = 2)
    List<CountrySpecification> zza;

    /* loaded from: classes3.dex */
    public final class Builder {
        /* synthetic */ Builder(zzd zzdVar) {
        }

        public Builder addAllowedCountrySpecification(CountrySpecification countrySpecification) {
            UserAddressRequest userAddressRequest = UserAddressRequest.this;
            if (userAddressRequest.zza == null) {
                userAddressRequest.zza = new ArrayList();
            }
            UserAddressRequest.this.zza.add(countrySpecification);
            return this;
        }

        public Builder addAllowedCountrySpecifications(Collection<CountrySpecification> collection) {
            UserAddressRequest userAddressRequest = UserAddressRequest.this;
            if (userAddressRequest.zza == null) {
                userAddressRequest.zza = new ArrayList();
            }
            UserAddressRequest.this.zza.addAll(collection);
            return this;
        }

        public UserAddressRequest build() {
            UserAddressRequest userAddressRequest = UserAddressRequest.this;
            List<CountrySpecification> list = userAddressRequest.zza;
            if (list != null) {
                userAddressRequest.zza = Collections.unmodifiableList(list);
            }
            return UserAddressRequest.this;
        }
    }

    UserAddressRequest() {
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public UserAddressRequest(@SafeParcelable.Param(id = 2) List<CountrySpecification> list) {
        this.zza = list;
    }
}