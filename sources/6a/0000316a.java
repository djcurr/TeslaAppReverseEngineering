package com.google.android.libraries.places.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
abstract class zzb extends AddressComponent {
    private final String zza;
    private final String zzb;
    private final List zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzb(String str, String str2, List list) {
        Objects.requireNonNull(str, "Null name");
        this.zza = str;
        this.zzb = str2;
        Objects.requireNonNull(list, "Null types");
        this.zzc = list;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AddressComponent) {
            AddressComponent addressComponent = (AddressComponent) obj;
            if (this.zza.equals(addressComponent.getName()) && ((str = this.zzb) != null ? str.equals(addressComponent.getShortName()) : addressComponent.getShortName() == null) && this.zzc.equals(addressComponent.getTypes())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent
    public final String getName() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent
    public final String getShortName() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent
    public final List<String> getTypes() {
        return this.zzc;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        String str = this.zzb;
        return ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        String obj = this.zzc.toString();
        return "AddressComponent{name=" + str + ", shortName=" + str2 + ", types=" + obj + "}";
    }
}