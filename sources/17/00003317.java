package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzfd {
    private static final zzjb zza;

    static {
        zzja zzjaVar = new zzja();
        zzjaVar.zza(Place.Field.ADDRESS, "formatted_address");
        zzjaVar.zza(Place.Field.ADDRESS_COMPONENTS, "address_components");
        zzjaVar.zza(Place.Field.BUSINESS_STATUS, "business_status");
        zzjaVar.zza(Place.Field.ID, "place_id");
        zzjaVar.zza(Place.Field.LAT_LNG, "geometry/location");
        zzjaVar.zza(Place.Field.NAME, "name");
        zzjaVar.zza(Place.Field.OPENING_HOURS, "opening_hours");
        zzjaVar.zza(Place.Field.PHONE_NUMBER, "international_phone_number");
        zzjaVar.zza(Place.Field.PHOTO_METADATAS, "photos");
        zzjaVar.zza(Place.Field.PLUS_CODE, PlaceTypes.PLUS_CODE);
        zzjaVar.zza(Place.Field.PRICE_LEVEL, "price_level");
        zzjaVar.zza(Place.Field.RATING, "rating");
        zzjaVar.zza(Place.Field.TYPES, "types");
        zzjaVar.zza(Place.Field.USER_RATINGS_TOTAL, "user_ratings_total");
        zzjaVar.zza(Place.Field.UTC_OFFSET, "utc_offset");
        zzjaVar.zza(Place.Field.VIEWPORT, "geometry/viewport");
        zzjaVar.zza(Place.Field.WEBSITE_URI, "website");
        zzjaVar.zza(Place.Field.ICON_URL, "icon_mask_base_uri");
        zzjaVar.zza(Place.Field.ICON_BACKGROUND_COLOR, "icon_background_color");
        zza = zzjaVar.zzb();
    }

    public static String zza(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) zza.get((Place.Field) it2.next());
            if (!TextUtils.isEmpty(str)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public static List zzb(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) zza.get((Place.Field) it2.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}