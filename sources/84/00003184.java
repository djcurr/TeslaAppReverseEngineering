package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

/* loaded from: classes3.dex */
abstract class zzr extends Place {
    private final String zza;
    private final AddressComponents zzb;
    private final Place.BusinessStatus zzc;
    private final List zzd;
    private final String zze;
    private final LatLng zzf;
    private final String zzg;
    private final OpeningHours zzh;
    private final String zzi;
    private final List zzj;
    private final PlusCode zzk;
    private final Integer zzl;
    private final Double zzm;
    private final List zzn;
    private final Integer zzo;
    private final Integer zzp;
    private final LatLngBounds zzq;
    private final Uri zzr;
    private final String zzs;
    private final Integer zzt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzr(String str, AddressComponents addressComponents, Place.BusinessStatus businessStatus, List list, String str2, LatLng latLng, String str3, OpeningHours openingHours, String str4, List list2, PlusCode plusCode, Integer num, Double d11, List list3, Integer num2, Integer num3, LatLngBounds latLngBounds, Uri uri, String str5, Integer num4) {
        this.zza = str;
        this.zzb = addressComponents;
        this.zzc = businessStatus;
        this.zzd = list;
        this.zze = str2;
        this.zzf = latLng;
        this.zzg = str3;
        this.zzh = openingHours;
        this.zzi = str4;
        this.zzj = list2;
        this.zzk = plusCode;
        this.zzl = num;
        this.zzm = d11;
        this.zzn = list3;
        this.zzo = num2;
        this.zzp = num3;
        this.zzq = latLngBounds;
        this.zzr = uri;
        this.zzs = str5;
        this.zzt = num4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Place) {
            Place place = (Place) obj;
            String str = this.zza;
            if (str != null ? str.equals(place.getAddress()) : place.getAddress() == null) {
                AddressComponents addressComponents = this.zzb;
                if (addressComponents != null ? addressComponents.equals(place.getAddressComponents()) : place.getAddressComponents() == null) {
                    Place.BusinessStatus businessStatus = this.zzc;
                    if (businessStatus != null ? businessStatus.equals(place.getBusinessStatus()) : place.getBusinessStatus() == null) {
                        List list = this.zzd;
                        if (list != null ? list.equals(place.getAttributions()) : place.getAttributions() == null) {
                            String str2 = this.zze;
                            if (str2 != null ? str2.equals(place.getId()) : place.getId() == null) {
                                LatLng latLng = this.zzf;
                                if (latLng != null ? latLng.equals(place.getLatLng()) : place.getLatLng() == null) {
                                    String str3 = this.zzg;
                                    if (str3 != null ? str3.equals(place.getName()) : place.getName() == null) {
                                        OpeningHours openingHours = this.zzh;
                                        if (openingHours != null ? openingHours.equals(place.getOpeningHours()) : place.getOpeningHours() == null) {
                                            String str4 = this.zzi;
                                            if (str4 != null ? str4.equals(place.getPhoneNumber()) : place.getPhoneNumber() == null) {
                                                List list2 = this.zzj;
                                                if (list2 != null ? list2.equals(place.getPhotoMetadatas()) : place.getPhotoMetadatas() == null) {
                                                    PlusCode plusCode = this.zzk;
                                                    if (plusCode != null ? plusCode.equals(place.getPlusCode()) : place.getPlusCode() == null) {
                                                        Integer num = this.zzl;
                                                        if (num != null ? num.equals(place.getPriceLevel()) : place.getPriceLevel() == null) {
                                                            Double d11 = this.zzm;
                                                            if (d11 != null ? d11.equals(place.getRating()) : place.getRating() == null) {
                                                                List list3 = this.zzn;
                                                                if (list3 != null ? list3.equals(place.getTypes()) : place.getTypes() == null) {
                                                                    Integer num2 = this.zzo;
                                                                    if (num2 != null ? num2.equals(place.getUserRatingsTotal()) : place.getUserRatingsTotal() == null) {
                                                                        Integer num3 = this.zzp;
                                                                        if (num3 != null ? num3.equals(place.getUtcOffsetMinutes()) : place.getUtcOffsetMinutes() == null) {
                                                                            LatLngBounds latLngBounds = this.zzq;
                                                                            if (latLngBounds != null ? latLngBounds.equals(place.getViewport()) : place.getViewport() == null) {
                                                                                Uri uri = this.zzr;
                                                                                if (uri != null ? uri.equals(place.getWebsiteUri()) : place.getWebsiteUri() == null) {
                                                                                    String str5 = this.zzs;
                                                                                    if (str5 != null ? str5.equals(place.getIconUrl()) : place.getIconUrl() == null) {
                                                                                        Integer num4 = this.zzt;
                                                                                        if (num4 != null ? num4.equals(place.getIconBackgroundColor()) : place.getIconBackgroundColor() == null) {
                                                                                            return true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final String getAddress() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final AddressComponents getAddressComponents() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final List<String> getAttributions() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final Place.BusinessStatus getBusinessStatus() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final Integer getIconBackgroundColor() {
        return this.zzt;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final String getIconUrl() {
        return this.zzs;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final String getId() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final LatLng getLatLng() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final String getName() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final OpeningHours getOpeningHours() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final String getPhoneNumber() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final List<PhotoMetadata> getPhotoMetadatas() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final PlusCode getPlusCode() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final Integer getPriceLevel() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final Double getRating() {
        return this.zzm;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final List<Place.Type> getTypes() {
        return this.zzn;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final Integer getUserRatingsTotal() {
        return this.zzo;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final Integer getUtcOffsetMinutes() {
        return this.zzp;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final LatLngBounds getViewport() {
        return this.zzq;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public final Uri getWebsiteUri() {
        return this.zzr;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        AddressComponents addressComponents = this.zzb;
        int hashCode2 = (hashCode ^ (addressComponents == null ? 0 : addressComponents.hashCode())) * 1000003;
        Place.BusinessStatus businessStatus = this.zzc;
        int hashCode3 = (hashCode2 ^ (businessStatus == null ? 0 : businessStatus.hashCode())) * 1000003;
        List list = this.zzd;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        String str2 = this.zze;
        int hashCode5 = (hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        LatLng latLng = this.zzf;
        int hashCode6 = (hashCode5 ^ (latLng == null ? 0 : latLng.hashCode())) * 1000003;
        String str3 = this.zzg;
        int hashCode7 = (hashCode6 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        OpeningHours openingHours = this.zzh;
        int hashCode8 = (hashCode7 ^ (openingHours == null ? 0 : openingHours.hashCode())) * 1000003;
        String str4 = this.zzi;
        int hashCode9 = (hashCode8 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        List list2 = this.zzj;
        int hashCode10 = (hashCode9 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PlusCode plusCode = this.zzk;
        int hashCode11 = (hashCode10 ^ (plusCode == null ? 0 : plusCode.hashCode())) * 1000003;
        Integer num = this.zzl;
        int hashCode12 = (hashCode11 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Double d11 = this.zzm;
        int hashCode13 = (hashCode12 ^ (d11 == null ? 0 : d11.hashCode())) * 1000003;
        List list3 = this.zzn;
        int hashCode14 = (hashCode13 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
        Integer num2 = this.zzo;
        int hashCode15 = (hashCode14 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Integer num3 = this.zzp;
        int hashCode16 = (hashCode15 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        LatLngBounds latLngBounds = this.zzq;
        int hashCode17 = (hashCode16 ^ (latLngBounds == null ? 0 : latLngBounds.hashCode())) * 1000003;
        Uri uri = this.zzr;
        int hashCode18 = (hashCode17 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        String str5 = this.zzs;
        int hashCode19 = (hashCode18 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        Integer num4 = this.zzt;
        return hashCode19 ^ (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.zza;
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        String valueOf3 = String.valueOf(this.zzd);
        String str2 = this.zze;
        String valueOf4 = String.valueOf(this.zzf);
        String str3 = this.zzg;
        String valueOf5 = String.valueOf(this.zzh);
        String str4 = this.zzi;
        String valueOf6 = String.valueOf(this.zzj);
        String valueOf7 = String.valueOf(this.zzk);
        Integer num = this.zzl;
        Double d11 = this.zzm;
        String valueOf8 = String.valueOf(this.zzn);
        Integer num2 = this.zzo;
        Integer num3 = this.zzp;
        String valueOf9 = String.valueOf(this.zzq);
        String valueOf10 = String.valueOf(this.zzr);
        String str5 = this.zzs;
        Integer num4 = this.zzt;
        return "Place{address=" + str + ", addressComponents=" + valueOf + ", businessStatus=" + valueOf2 + ", attributions=" + valueOf3 + ", id=" + str2 + ", latLng=" + valueOf4 + ", name=" + str3 + ", openingHours=" + valueOf5 + ", phoneNumber=" + str4 + ", photoMetadatas=" + valueOf6 + ", plusCode=" + valueOf7 + ", priceLevel=" + num + ", rating=" + d11 + ", types=" + valueOf8 + ", userRatingsTotal=" + num2 + ", utcOffsetMinutes=" + num3 + ", viewport=" + valueOf9 + ", websiteUri=" + valueOf10 + ", iconUrl=" + str5 + ", iconBackgroundColor=" + num4 + "}";
    }
}