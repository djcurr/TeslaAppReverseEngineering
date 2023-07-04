package com.tesla.TeslaV4.reactnative.module;

import android.util.SparseArray;
import com.google.android.libraries.places.api.model.Place;
import ezvcard.property.Kind;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum b0 {
    ADDRESS(1, "address", Place.Field.ADDRESS),
    ID(2, "placeID", Place.Field.ID),
    LAT_LNG(3, Kind.LOCATION, Place.Field.LAT_LNG),
    NAME(4, "name", Place.Field.NAME),
    OPENING_HOURS(5, "openingHours", Place.Field.OPENING_HOURS),
    PHONE_NUMBER(6, "phoneNumber", Place.Field.PHONE_NUMBER),
    PHOTO_METADATAS(7, "photos", Place.Field.PHOTO_METADATAS),
    PLUS_CODE(8, "plusCode", Place.Field.PLUS_CODE),
    PRICE_LEVEL(9, "priceLevel", Place.Field.PRICE_LEVEL),
    RATING(10, "rating", Place.Field.RATING),
    TYPES(11, "types", Place.Field.TYPES),
    USER_RATINGS_TOTAL(12, "userRatingsTotal", Place.Field.USER_RATINGS_TOTAL),
    VIEWPORT(13, "viewport", Place.Field.VIEWPORT),
    WEBSITE_URI(14, "website", Place.Field.WEBSITE_URI),
    ADDRESS_COMPONENTS(15, "addressComponents", Place.Field.ADDRESS_COMPONENTS);
    
    public static final a Companion = new a(null);
    private final Place.Field field;
    private final String key;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final b0 a(String str) {
            int i11;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1849666905:
                        if (str.equals("plusCode")) {
                            i11 = 8;
                            break;
                        }
                        break;
                    case -1699932009:
                        if (str.equals("openingHours")) {
                            i11 = 5;
                            break;
                        }
                        break;
                    case -1481154629:
                        if (str.equals("priceLevel")) {
                            i11 = 9;
                            break;
                        }
                        break;
                    case -1192969641:
                        if (str.equals("phoneNumber")) {
                            i11 = 6;
                            break;
                        }
                        break;
                    case -1147692044:
                        if (str.equals("address")) {
                            i11 = 1;
                            break;
                        }
                        break;
                    case -989034367:
                        if (str.equals("photos")) {
                            i11 = 7;
                            break;
                        }
                        break;
                    case -938102371:
                        if (str.equals("rating")) {
                            i11 = 10;
                            break;
                        }
                        break;
                    case -546280999:
                        if (str.equals("userRatingsTotal")) {
                            i11 = 12;
                            break;
                        }
                        break;
                    case -494224286:
                        if (str.equals("placeID")) {
                            i11 = 2;
                            break;
                        }
                        break;
                    case 3373707:
                        if (str.equals("name")) {
                            i11 = 4;
                            break;
                        }
                        break;
                    case 110844025:
                        if (str.equals("types")) {
                            i11 = 11;
                            break;
                        }
                        break;
                    case 691182122:
                        if (str.equals("addressComponents")) {
                            i11 = 15;
                            break;
                        }
                        break;
                    case 1196685478:
                        if (str.equals("viewport")) {
                            i11 = 13;
                            break;
                        }
                        break;
                    case 1224335515:
                        if (str.equals("website")) {
                            i11 = 14;
                            break;
                        }
                        break;
                    case 1901043637:
                        if (str.equals(Kind.LOCATION)) {
                            i11 = 3;
                            break;
                        }
                        break;
                }
                b0 b0Var = b.f21420a.a().get(i11);
                kotlin.jvm.internal.s.f(b0Var, "Indexer.index.get(fieldId)");
                return b0Var;
            }
            i11 = 16;
            b0 b0Var2 = b.f21420a.a().get(i11);
            kotlin.jvm.internal.s.f(b0Var2, "Indexer.index.get(fieldId)");
            return b0Var2;
        }
    }

    /* loaded from: classes6.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f21420a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final SparseArray<b0> f21421b = new SparseArray<>();

        private b() {
        }

        public final SparseArray<b0> a() {
            return f21421b;
        }
    }

    b0(int i11, String str, Place.Field field) {
        this.key = str;
        this.field = field;
        b.f21420a.a().put(i11, this);
    }

    public final Place.Field getField() {
        return this.field;
    }
}