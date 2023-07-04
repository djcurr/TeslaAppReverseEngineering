package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.Place;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
abstract class zze extends AutocompletePrediction {
    private final String zza;
    private final Integer zzb;
    private final List zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final List zzg;
    private final List zzh;
    private final List zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zze(String str, Integer num, List list, String str2, String str3, String str4, List list2, List list3, List list4) {
        Objects.requireNonNull(str, "Null placeId");
        this.zza = str;
        this.zzb = num;
        Objects.requireNonNull(list, "Null placeTypes");
        this.zzc = list;
        Objects.requireNonNull(str2, "Null fullText");
        this.zzd = str2;
        Objects.requireNonNull(str3, "Null primaryText");
        this.zze = str3;
        Objects.requireNonNull(str4, "Null secondaryText");
        this.zzf = str4;
        this.zzg = list2;
        this.zzh = list3;
        this.zzi = list4;
    }

    public final boolean equals(Object obj) {
        Integer num;
        List list;
        List list2;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutocompletePrediction) {
            AutocompletePrediction autocompletePrediction = (AutocompletePrediction) obj;
            if (this.zza.equals(autocompletePrediction.getPlaceId()) && ((num = this.zzb) != null ? num.equals(autocompletePrediction.getDistanceMeters()) : autocompletePrediction.getDistanceMeters() == null) && this.zzc.equals(autocompletePrediction.getPlaceTypes()) && this.zzd.equals(autocompletePrediction.zza()) && this.zze.equals(autocompletePrediction.zzb()) && this.zzf.equals(autocompletePrediction.zzc()) && ((list = this.zzg) != null ? list.equals(autocompletePrediction.zzd()) : autocompletePrediction.zzd() == null) && ((list2 = this.zzh) != null ? list2.equals(autocompletePrediction.zze()) : autocompletePrediction.zze() == null) && ((list3 = this.zzi) != null ? list3.equals(autocompletePrediction.zzf()) : autocompletePrediction.zzf() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final Integer getDistanceMeters() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final String getPlaceId() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final List<Place.Type> getPlaceTypes() {
        return this.zzc;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        Integer num = this.zzb;
        int hashCode2 = (((((((((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003;
        List list = this.zzg;
        int hashCode3 = (hashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.zzh;
        int hashCode4 = (hashCode3 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        List list3 = this.zzi;
        return hashCode4 ^ (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.zza;
        Integer num = this.zzb;
        String obj = this.zzc.toString();
        String str2 = this.zzd;
        String str3 = this.zze;
        String str4 = this.zzf;
        String valueOf = String.valueOf(this.zzg);
        String valueOf2 = String.valueOf(this.zzh);
        String valueOf3 = String.valueOf(this.zzi);
        return "AutocompletePrediction{placeId=" + str + ", distanceMeters=" + num + ", placeTypes=" + obj + ", fullText=" + str2 + ", primaryText=" + str3 + ", secondaryText=" + str4 + ", fullTextMatchedSubstrings=" + valueOf + ", primaryTextMatchedSubstrings=" + valueOf2 + ", secondaryTextMatchedSubstrings=" + valueOf3 + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final String zza() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final String zzb() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final String zzc() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final List zzd() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final List zze() {
        return this.zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public final List zzf() {
        return this.zzi;
    }
}