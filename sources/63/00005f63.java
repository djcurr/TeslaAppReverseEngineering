package com.tesla.TeslaV4.reactnative.module;

import android.net.Uri;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.AddressComponent;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.libraries.places.api.model.RectangularBounds;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.tesla.TeslaV4.BuildConfig;
import com.tesla.TeslaV4.reactnative.module.b0;
import ezvcard.property.Kind;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003J.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\"\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007J\"\u0010 \u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007J\u0010\u0010\"\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010!R\u001d\u0010(\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006-"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/PlacesNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "type", "Lcom/google/android/libraries/places/api/model/TypeFilter;", "getFilterType", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "placeFields", "", "isCurrentOrFetchPlace", "", "Lcom/google/android/libraries/places/api/model/Place$Field;", "getPlaceFields", "Lcom/google/android/libraries/places/api/model/Place;", "place", "", "selectedFields", "Lcom/facebook/react/bridge/WritableMap;", "propertiesMapForPlace", "getName", "placeID", "Lcom/facebook/react/bridge/ReadableArray;", "fields", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "lookUpPlaceByID", SearchIntents.EXTRA_QUERY, "Lcom/facebook/react/bridge/ReadableMap;", "options", "getAutocompletePredictions", "Lcom/google/android/libraries/places/api/model/Place$Type;", "getTypeSlug", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "placesClient$delegate", "Lvz/k;", "getPlacesClient", "()Lcom/google/android/libraries/places/api/net/PlacesClient;", "placesClient", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class PlacesNativeModule extends ReactContextBaseJavaModule {
    private final vz.k placesClient$delegate;

    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21398a;

        static {
            int[] iArr = new int[Place.Type.values().length];
            iArr[Place.Type.ACCOUNTING.ordinal()] = 1;
            iArr[Place.Type.ADMINISTRATIVE_AREA_LEVEL_1.ordinal()] = 2;
            iArr[Place.Type.ADMINISTRATIVE_AREA_LEVEL_2.ordinal()] = 3;
            iArr[Place.Type.ADMINISTRATIVE_AREA_LEVEL_3.ordinal()] = 4;
            iArr[Place.Type.ADMINISTRATIVE_AREA_LEVEL_4.ordinal()] = 5;
            iArr[Place.Type.ADMINISTRATIVE_AREA_LEVEL_5.ordinal()] = 6;
            iArr[Place.Type.AIRPORT.ordinal()] = 7;
            iArr[Place.Type.AMUSEMENT_PARK.ordinal()] = 8;
            iArr[Place.Type.AQUARIUM.ordinal()] = 9;
            iArr[Place.Type.ART_GALLERY.ordinal()] = 10;
            iArr[Place.Type.ATM.ordinal()] = 11;
            iArr[Place.Type.BAKERY.ordinal()] = 12;
            iArr[Place.Type.BANK.ordinal()] = 13;
            iArr[Place.Type.BAR.ordinal()] = 14;
            iArr[Place.Type.BEAUTY_SALON.ordinal()] = 15;
            iArr[Place.Type.BICYCLE_STORE.ordinal()] = 16;
            iArr[Place.Type.BOOK_STORE.ordinal()] = 17;
            iArr[Place.Type.BOWLING_ALLEY.ordinal()] = 18;
            iArr[Place.Type.BUS_STATION.ordinal()] = 19;
            iArr[Place.Type.CAFE.ordinal()] = 20;
            iArr[Place.Type.CAMPGROUND.ordinal()] = 21;
            iArr[Place.Type.CAR_DEALER.ordinal()] = 22;
            iArr[Place.Type.CAR_RENTAL.ordinal()] = 23;
            iArr[Place.Type.CAR_REPAIR.ordinal()] = 24;
            iArr[Place.Type.CAR_WASH.ordinal()] = 25;
            iArr[Place.Type.CASINO.ordinal()] = 26;
            iArr[Place.Type.CEMETERY.ordinal()] = 27;
            iArr[Place.Type.CHURCH.ordinal()] = 28;
            iArr[Place.Type.CITY_HALL.ordinal()] = 29;
            iArr[Place.Type.CLOTHING_STORE.ordinal()] = 30;
            iArr[Place.Type.COLLOQUIAL_AREA.ordinal()] = 31;
            iArr[Place.Type.CONVENIENCE_STORE.ordinal()] = 32;
            iArr[Place.Type.COUNTRY.ordinal()] = 33;
            iArr[Place.Type.COURTHOUSE.ordinal()] = 34;
            iArr[Place.Type.DENTIST.ordinal()] = 35;
            iArr[Place.Type.DEPARTMENT_STORE.ordinal()] = 36;
            iArr[Place.Type.DOCTOR.ordinal()] = 37;
            iArr[Place.Type.ELECTRICIAN.ordinal()] = 38;
            iArr[Place.Type.ELECTRONICS_STORE.ordinal()] = 39;
            iArr[Place.Type.EMBASSY.ordinal()] = 40;
            iArr[Place.Type.ESTABLISHMENT.ordinal()] = 41;
            iArr[Place.Type.FINANCE.ordinal()] = 42;
            iArr[Place.Type.FIRE_STATION.ordinal()] = 43;
            iArr[Place.Type.FLOOR.ordinal()] = 44;
            iArr[Place.Type.FLORIST.ordinal()] = 45;
            iArr[Place.Type.FOOD.ordinal()] = 46;
            iArr[Place.Type.FUNERAL_HOME.ordinal()] = 47;
            iArr[Place.Type.FURNITURE_STORE.ordinal()] = 48;
            iArr[Place.Type.GAS_STATION.ordinal()] = 49;
            iArr[Place.Type.GENERAL_CONTRACTOR.ordinal()] = 50;
            iArr[Place.Type.GEOCODE.ordinal()] = 51;
            iArr[Place.Type.GROCERY_OR_SUPERMARKET.ordinal()] = 52;
            iArr[Place.Type.GYM.ordinal()] = 53;
            iArr[Place.Type.HAIR_CARE.ordinal()] = 54;
            iArr[Place.Type.HARDWARE_STORE.ordinal()] = 55;
            iArr[Place.Type.HEALTH.ordinal()] = 56;
            iArr[Place.Type.HINDU_TEMPLE.ordinal()] = 57;
            iArr[Place.Type.HOME_GOODS_STORE.ordinal()] = 58;
            iArr[Place.Type.HOSPITAL.ordinal()] = 59;
            iArr[Place.Type.INSURANCE_AGENCY.ordinal()] = 60;
            iArr[Place.Type.INTERSECTION.ordinal()] = 61;
            iArr[Place.Type.JEWELRY_STORE.ordinal()] = 62;
            iArr[Place.Type.LAUNDRY.ordinal()] = 63;
            iArr[Place.Type.LAWYER.ordinal()] = 64;
            iArr[Place.Type.LIBRARY.ordinal()] = 65;
            iArr[Place.Type.LIQUOR_STORE.ordinal()] = 66;
            iArr[Place.Type.LOCALITY.ordinal()] = 67;
            iArr[Place.Type.LOCAL_GOVERNMENT_OFFICE.ordinal()] = 68;
            iArr[Place.Type.LOCKSMITH.ordinal()] = 69;
            iArr[Place.Type.LODGING.ordinal()] = 70;
            iArr[Place.Type.MEAL_DELIVERY.ordinal()] = 71;
            iArr[Place.Type.MEAL_TAKEAWAY.ordinal()] = 72;
            iArr[Place.Type.MOSQUE.ordinal()] = 73;
            iArr[Place.Type.MOVIE_RENTAL.ordinal()] = 74;
            iArr[Place.Type.MOVIE_THEATER.ordinal()] = 75;
            iArr[Place.Type.MOVING_COMPANY.ordinal()] = 76;
            iArr[Place.Type.MUSEUM.ordinal()] = 77;
            iArr[Place.Type.NATURAL_FEATURE.ordinal()] = 78;
            iArr[Place.Type.NEIGHBORHOOD.ordinal()] = 79;
            iArr[Place.Type.NIGHT_CLUB.ordinal()] = 80;
            iArr[Place.Type.OTHER.ordinal()] = 81;
            iArr[Place.Type.PAINTER.ordinal()] = 82;
            iArr[Place.Type.PARK.ordinal()] = 83;
            iArr[Place.Type.PARKING.ordinal()] = 84;
            iArr[Place.Type.PET_STORE.ordinal()] = 85;
            iArr[Place.Type.PHARMACY.ordinal()] = 86;
            iArr[Place.Type.PHYSIOTHERAPIST.ordinal()] = 87;
            iArr[Place.Type.PLACE_OF_WORSHIP.ordinal()] = 88;
            iArr[Place.Type.PLUMBER.ordinal()] = 89;
            iArr[Place.Type.POINT_OF_INTEREST.ordinal()] = 90;
            iArr[Place.Type.POLICE.ordinal()] = 91;
            iArr[Place.Type.POLITICAL.ordinal()] = 92;
            iArr[Place.Type.POSTAL_CODE.ordinal()] = 93;
            iArr[Place.Type.POSTAL_CODE_PREFIX.ordinal()] = 94;
            iArr[Place.Type.POSTAL_CODE_SUFFIX.ordinal()] = 95;
            iArr[Place.Type.POSTAL_TOWN.ordinal()] = 96;
            iArr[Place.Type.POST_BOX.ordinal()] = 97;
            iArr[Place.Type.POST_OFFICE.ordinal()] = 98;
            iArr[Place.Type.PREMISE.ordinal()] = 99;
            iArr[Place.Type.REAL_ESTATE_AGENCY.ordinal()] = 100;
            iArr[Place.Type.RESTAURANT.ordinal()] = 101;
            iArr[Place.Type.ROOFING_CONTRACTOR.ordinal()] = 102;
            iArr[Place.Type.ROOM.ordinal()] = 103;
            iArr[Place.Type.ROUTE.ordinal()] = 104;
            iArr[Place.Type.RV_PARK.ordinal()] = 105;
            iArr[Place.Type.SCHOOL.ordinal()] = 106;
            iArr[Place.Type.SHOE_STORE.ordinal()] = 107;
            iArr[Place.Type.SHOPPING_MALL.ordinal()] = 108;
            iArr[Place.Type.SPA.ordinal()] = 109;
            iArr[Place.Type.STADIUM.ordinal()] = 110;
            iArr[Place.Type.STORAGE.ordinal()] = 111;
            iArr[Place.Type.STORE.ordinal()] = 112;
            iArr[Place.Type.STREET_ADDRESS.ordinal()] = 113;
            iArr[Place.Type.SUBLOCALITY.ordinal()] = 114;
            iArr[Place.Type.SUBLOCALITY_LEVEL_1.ordinal()] = 115;
            iArr[Place.Type.SUBLOCALITY_LEVEL_2.ordinal()] = 116;
            iArr[Place.Type.SUBLOCALITY_LEVEL_3.ordinal()] = 117;
            iArr[Place.Type.SUBLOCALITY_LEVEL_4.ordinal()] = 118;
            iArr[Place.Type.SUBLOCALITY_LEVEL_5.ordinal()] = 119;
            iArr[Place.Type.SUBPREMISE.ordinal()] = 120;
            iArr[Place.Type.SUBWAY_STATION.ordinal()] = 121;
            iArr[Place.Type.SUPERMARKET.ordinal()] = 122;
            iArr[Place.Type.SYNAGOGUE.ordinal()] = 123;
            iArr[Place.Type.TAXI_STAND.ordinal()] = 124;
            iArr[Place.Type.TRAIN_STATION.ordinal()] = 125;
            iArr[Place.Type.TRANSIT_STATION.ordinal()] = 126;
            iArr[Place.Type.TRAVEL_AGENCY.ordinal()] = 127;
            iArr[Place.Type.UNIVERSITY.ordinal()] = 128;
            iArr[Place.Type.VETERINARY_CARE.ordinal()] = 129;
            iArr[Place.Type.ZOO.ordinal()] = 130;
            f21398a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.a<PlacesClient> {

        /* renamed from: a */
        final /* synthetic */ ReactApplicationContext f21399a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ReactApplicationContext reactApplicationContext) {
            super(0);
            this.f21399a = reactApplicationContext;
        }

        @Override // h00.a
        /* renamed from: a */
        public final PlacesClient invoke() {
            Places.initialize(this.f21399a.getApplicationContext(), BuildConfig.RNGP_ANDROID_API_KEY);
            return Places.createClient(this.f21399a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesNativeModule(ReactApplicationContext context) {
        super(context);
        vz.k a11;
        kotlin.jvm.internal.s.g(context, "context");
        a11 = vz.m.a(new b(context));
        this.placesClient$delegate = a11;
    }

    public static /* synthetic */ void a(PlacesNativeModule placesNativeModule, List list, Promise promise, FetchPlaceResponse fetchPlaceResponse) {
        m573lookUpPlaceByID$lambda0(placesNativeModule, list, promise, fetchPlaceResponse);
    }

    public static /* synthetic */ void b(Promise promise, Exception exc) {
        m574lookUpPlaceByID$lambda1(promise, exc);
    }

    public static /* synthetic */ void c(Promise promise, PlacesNativeModule placesNativeModule, FindAutocompletePredictionsResponse findAutocompletePredictionsResponse) {
        m571getAutocompletePredictions$lambda2(promise, placesNativeModule, findAutocompletePredictionsResponse);
    }

    public static /* synthetic */ void d(Promise promise, Exception exc) {
        m572getAutocompletePredictions$lambda3(promise, exc);
    }

    /* renamed from: getAutocompletePredictions$lambda-2 */
    public static final void m571getAutocompletePredictions$lambda2(Promise promise, PlacesNativeModule this$0, FindAutocompletePredictionsResponse findAutocompletePredictionsResponse) {
        kotlin.jvm.internal.s.g(promise, "$promise");
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (findAutocompletePredictionsResponse.getAutocompletePredictions().size() == 0) {
            Object createArray = Arguments.createArray();
            kotlin.jvm.internal.s.f(createArray, "createArray()");
            promise.resolve(createArray);
            return;
        }
        WritableArray createArray2 = Arguments.createArray();
        kotlin.jvm.internal.s.f(createArray2, "createArray()");
        for (AutocompletePrediction autocompletePrediction : findAutocompletePredictionsResponse.getAutocompletePredictions()) {
            WritableMap createMap = Arguments.createMap();
            kotlin.jvm.internal.s.f(createMap, "createMap()");
            createMap.putString("fullText", autocompletePrediction.getFullText(null).toString());
            createMap.putString("primaryText", autocompletePrediction.getPrimaryText(null).toString());
            createMap.putString("secondaryText", autocompletePrediction.getSecondaryText(null).toString());
            createMap.putString("placeID", autocompletePrediction.getPlaceId());
            if (autocompletePrediction.getPlaceTypes().size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (Place.Type type : autocompletePrediction.getPlaceTypes()) {
                    arrayList.add(this$0.getTypeSlug(type));
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                createMap.putArray("types", Arguments.fromArray(array));
            }
            createArray2.pushMap(createMap);
        }
        promise.resolve(createArray2);
    }

    /* renamed from: getAutocompletePredictions$lambda-3 */
    public static final void m572getAutocompletePredictions$lambda3(Promise promise, Exception exception) {
        kotlin.jvm.internal.s.g(promise, "$promise");
        kotlin.jvm.internal.s.g(exception, "exception");
        promise.reject("E_AUTOCOMPLETE_ERROR", new Error(exception.getMessage()));
    }

    private final TypeFilter getFilterType(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1480760809:
                    if (str.equals(PlaceTypes.ESTABLISHMENT)) {
                        return TypeFilter.ESTABLISHMENT;
                    }
                    break;
                case -1360151735:
                    if (str.equals("cities")) {
                        return TypeFilter.CITIES;
                    }
                    break;
                case -1147692044:
                    if (str.equals("address")) {
                        return TypeFilter.ADDRESS;
                    }
                    break;
                case -79287106:
                    if (str.equals(PlaceTypes.GEOCODE)) {
                        return TypeFilter.GEOCODE;
                    }
                    break;
                case 1086109695:
                    if (str.equals("regions")) {
                        return TypeFilter.REGIONS;
                    }
                    break;
            }
        }
        return null;
    }

    private final List<Place.Field> getPlaceFields(ArrayList<Object> arrayList, boolean z11) {
        b0 a11;
        List<Place.Field> B0;
        List<Place.Field> B02;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.size() == 0 && !z11) {
            B02 = wz.p.B0(Place.Field.values());
            return B02;
        } else if (arrayList.size() == 0 && z11) {
            B0 = wz.p.B0(Place.Field.values());
            List asList = Arrays.asList(Place.Field.OPENING_HOURS, Place.Field.PHONE_NUMBER, Place.Field.WEBSITE_URI, Place.Field.ADDRESS_COMPONENTS);
            kotlin.jvm.internal.s.f(asList, "asList(\n          Place.…RESS_COMPONENTS\n        )");
            B0.removeAll(asList);
            return B0;
        } else {
            Iterator<Object> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                b0.a aVar = b0.Companion;
                if (aVar.a(next.toString()) != null && (a11 = aVar.a(next.toString())) != null) {
                    arrayList2.add(a11.getField());
                }
            }
            if (arrayList.size() != 0 && z11) {
                List asList2 = Arrays.asList(Place.Field.OPENING_HOURS, Place.Field.PHONE_NUMBER, Place.Field.WEBSITE_URI, Place.Field.ADDRESS_COMPONENTS);
                kotlin.jvm.internal.s.f(asList2, "asList(\n          Place.…RESS_COMPONENTS\n        )");
                arrayList2.removeAll(asList2);
            }
            return arrayList2;
        }
    }

    private final PlacesClient getPlacesClient() {
        Object value = this.placesClient$delegate.getValue();
        kotlin.jvm.internal.s.f(value, "<get-placesClient>(...)");
        return (PlacesClient) value;
    }

    /* renamed from: lookUpPlaceByID$lambda-0 */
    public static final void m573lookUpPlaceByID$lambda0(PlacesNativeModule this$0, List selectedFields, Promise promise, FetchPlaceResponse response) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(selectedFields, "$selectedFields");
        kotlin.jvm.internal.s.g(promise, "$promise");
        kotlin.jvm.internal.s.g(response, "response");
        Place place = response.getPlace();
        kotlin.jvm.internal.s.f(place, "place");
        promise.resolve(this$0.propertiesMapForPlace(place, selectedFields));
    }

    /* renamed from: lookUpPlaceByID$lambda-1 */
    public static final void m574lookUpPlaceByID$lambda1(Promise promise, Exception exception) {
        kotlin.jvm.internal.s.g(promise, "$promise");
        kotlin.jvm.internal.s.g(exception, "exception");
        promise.reject("E_PLACE_DETAILS_ERROR", new Error(exception.getMessage()));
    }

    private final WritableMap propertiesMapForPlace(Place place, List<? extends Place.Field> list) {
        WritableMap map = Arguments.createMap();
        if (list.contains(Place.Field.LAT_LNG)) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("latitude", place.getLatLng().latitude);
            createMap.putDouble("longitude", place.getLatLng().longitude);
            map.putMap(Kind.LOCATION, createMap);
        }
        if (list.contains(Place.Field.NAME)) {
            map.putString("name", place.getName());
        }
        if (list.contains(Place.Field.ADDRESS)) {
            if (!TextUtils.isEmpty(place.getAddress())) {
                map.putString("address", place.getAddress());
            } else {
                map.putString("address", "");
            }
        }
        if (list.contains(Place.Field.ADDRESS_COMPONENTS)) {
            if (place.getAddressComponents() != null) {
                List<AddressComponent> asList = place.getAddressComponents().asList();
                WritableNativeArray writableNativeArray = new WritableNativeArray();
                for (AddressComponent addressComponent : asList) {
                    WritableMap createMap2 = Arguments.createMap();
                    createMap2.putArray("types", Arguments.fromList(addressComponent.getTypes()));
                    createMap2.putString("name", addressComponent.getName());
                    createMap2.putString("shortName", addressComponent.getShortName());
                    writableNativeArray.pushMap(createMap2);
                }
                map.putArray("addressComponents", writableNativeArray);
            } else {
                map.putArray("addressComponents", Arguments.createArray());
            }
        }
        if (list.contains(Place.Field.PHONE_NUMBER)) {
            if (!TextUtils.isEmpty(place.getPhoneNumber())) {
                map.putString("phoneNumber", place.getPhoneNumber());
            } else {
                map.putString("phoneNumber", "");
            }
        }
        if (list.contains(Place.Field.WEBSITE_URI)) {
            if (place.getWebsiteUri() != null) {
                Uri websiteUri = place.getWebsiteUri();
                map.putString("website", websiteUri == null ? null : websiteUri.toString());
            } else {
                map.putString("website", "");
            }
        }
        if (list.contains(Place.Field.ID)) {
            map.putString("placeID", place.getId());
        }
        if (place.getAttributions() != null) {
            Object[] array = new ArrayList(place.getAttributions()).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            map.putArray("attributions", Arguments.fromArray(array));
        } else {
            map.putArray("attributions", Arguments.createArray());
        }
        if (list.contains(Place.Field.TYPES)) {
            if (place.getTypes() != null) {
                ArrayList arrayList = new ArrayList();
                for (Place.Type type : place.getTypes()) {
                    arrayList.add(getTypeSlug(type));
                }
                Object[] array2 = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                map.putArray("types", Arguments.fromArray(array2));
            } else {
                map.putArray("types", Arguments.createArray());
            }
        }
        if (list.contains(Place.Field.VIEWPORT)) {
            if (place.getViewport() != null) {
                WritableMap createMap3 = Arguments.createMap();
                createMap3.putDouble("latitudeNE", place.getViewport().northeast.latitude);
                createMap3.putDouble("longitudeNE", place.getViewport().northeast.longitude);
                createMap3.putDouble("latitudeSW", place.getViewport().southwest.latitude);
                createMap3.putDouble("longitudeSW", place.getViewport().southwest.longitude);
                map.putMap("viewport", createMap3);
            } else {
                map.putMap("viewport", Arguments.createMap());
            }
        }
        if (list.contains(Place.Field.PRICE_LEVEL)) {
            if (place.getPriceLevel() != null) {
                Integer priceLevel = place.getPriceLevel();
                kotlin.jvm.internal.s.f(priceLevel, "place.priceLevel");
                map.putInt("priceLevel", priceLevel.intValue());
            } else {
                map.putInt("priceLevel", 0);
            }
        }
        if (list.contains(Place.Field.RATING)) {
            if (place.getRating() != null) {
                Double rating = place.getRating();
                kotlin.jvm.internal.s.f(rating, "place.rating");
                map.putDouble("rating", rating.doubleValue());
            } else {
                map.putDouble("rating", 0.0d);
            }
        }
        if (list.contains(Place.Field.OPENING_HOURS)) {
            if (place.getOpeningHours() != null) {
                Object[] array3 = new ArrayList(place.getOpeningHours().getWeekdayText()).toArray(new String[0]);
                Objects.requireNonNull(array3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                map.putArray("openingHours", Arguments.fromArray(array3));
            } else {
                map.putArray("openingHours", Arguments.createArray());
            }
        }
        if (list.contains(Place.Field.PLUS_CODE)) {
            if (place.getPlusCode() != null) {
                WritableMap createMap4 = Arguments.createMap();
                createMap4.putString("compoundCode", place.getPlusCode().getCompoundCode());
                createMap4.putString("globalCode", place.getPlusCode().getGlobalCode());
                map.putMap("plusCode", createMap4);
            } else {
                map.putMap("plusCode", Arguments.createMap());
            }
        }
        if (list.contains(Place.Field.USER_RATINGS_TOTAL)) {
            if (place.getUserRatingsTotal() != null) {
                Integer userRatingsTotal = place.getUserRatingsTotal();
                kotlin.jvm.internal.s.f(userRatingsTotal, "place.userRatingsTotal");
                map.putInt("userRatingsTotal", userRatingsTotal.intValue());
            } else {
                map.putInt("userRatingsTotal", 0);
            }
        }
        kotlin.jvm.internal.s.f(map, "map");
        return map;
    }

    @ReactMethod
    public final void getAutocompletePredictions(String str, ReadableMap options, final Promise promise) {
        kotlin.jvm.internal.s.g(options, "options");
        kotlin.jvm.internal.s.g(promise, "promise");
        String string = options.getString("type");
        ReadableArray array = options.getArray("types");
        ArrayList<Object> arrayList = array == null ? null : array.toArrayList();
        String string2 = options.getString("country");
        kotlin.jvm.internal.s.e(string2);
        String str2 = string2.length() == 0 ? null : string2;
        boolean z11 = options.getBoolean("useSessionToken");
        ReadableMap map = options.getMap("locationBias");
        kotlin.jvm.internal.s.e(map);
        double d11 = map.getDouble("latitudeSW");
        double d12 = map.getDouble("longitudeSW");
        double d13 = map.getDouble("latitudeNE");
        double d14 = map.getDouble("longitudeNE");
        ArrayList<Object> arrayList2 = arrayList;
        ReadableMap map2 = options.getMap("locationRestriction");
        kotlin.jvm.internal.s.e(map2);
        double d15 = map2.getDouble("latitudeSW");
        double d16 = map2.getDouble("longitudeSW");
        double d17 = map2.getDouble("latitudeNE");
        double d18 = map2.getDouble("longitudeNE");
        FindAutocompletePredictionsRequest.Builder query = FindAutocompletePredictionsRequest.builder().setQuery(str);
        kotlin.jvm.internal.s.f(query, "builder()\n        .setQuery(query)");
        if (str2 != null) {
            query.setCountry(str2);
        }
        if (!(d11 == 0.0d)) {
            if (!(d12 == 0.0d)) {
                if (!(d13 == 0.0d)) {
                    if (!(d14 == 0.0d)) {
                        query.setLocationBias(RectangularBounds.newInstance(new LatLng(d11, d12), new LatLng(d13, d14)));
                    }
                }
            }
        }
        if (!(d15 == 0.0d)) {
            if (!(d16 == 0.0d)) {
                if (!(d17 == 0.0d)) {
                    if (!(d18 == 0.0d)) {
                        query.setLocationRestriction(RectangularBounds.newInstance(new LatLng(d15, d16), new LatLng(d17, d18)));
                    }
                }
            }
        }
        query.setTypeFilter(getFilterType(string));
        query.setTypesFilter(arrayList2);
        if (z11) {
            query.setSessionToken(AutocompleteSessionToken.newInstance());
        }
        Task<FindAutocompletePredictionsResponse> findAutocompletePredictions = getPlacesClient().findAutocompletePredictions(query.build());
        kotlin.jvm.internal.s.f(findAutocompletePredictions, "placesClient.findAutocom…s(requestBuilder.build())");
        findAutocompletePredictions.addOnSuccessListener(new OnSuccessListener() { // from class: com.tesla.TeslaV4.reactnative.module.x
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                PlacesNativeModule.c(promise, this, (FindAutocompletePredictionsResponse) obj);
            }
        });
        findAutocompletePredictions.addOnFailureListener(new OnFailureListener() { // from class: com.tesla.TeslaV4.reactnative.module.w
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                PlacesNativeModule.d(promise, exc);
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PlacesModule";
    }

    public final String getTypeSlug(Place.Type type) {
        switch (type == null ? -1 : a.f21398a[type.ordinal()]) {
            case 1:
                return PlaceTypes.ACCOUNTING;
            case 2:
                return PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_1;
            case 3:
                return PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_2;
            case 4:
                return PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_3;
            case 5:
                return PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_4;
            case 6:
                return PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_5;
            case 7:
                return PlaceTypes.AIRPORT;
            case 8:
                return PlaceTypes.AMUSEMENT_PARK;
            case 9:
                return PlaceTypes.AQUARIUM;
            case 10:
                return PlaceTypes.ART_GALLERY;
            case 11:
                return PlaceTypes.ATM;
            case 12:
                return PlaceTypes.BAKERY;
            case 13:
                return PlaceTypes.BANK;
            case 14:
                return PlaceTypes.BAR;
            case 15:
                return PlaceTypes.BEAUTY_SALON;
            case 16:
                return PlaceTypes.BICYCLE_STORE;
            case 17:
                return PlaceTypes.BOOK_STORE;
            case 18:
                return PlaceTypes.BOWLING_ALLEY;
            case 19:
                return PlaceTypes.BUS_STATION;
            case 20:
                return PlaceTypes.CAFE;
            case 21:
                return PlaceTypes.CAMPGROUND;
            case 22:
                return PlaceTypes.CAR_DEALER;
            case 23:
                return PlaceTypes.CAR_RENTAL;
            case 24:
                return PlaceTypes.CAR_REPAIR;
            case 25:
                return PlaceTypes.CAR_WASH;
            case 26:
                return PlaceTypes.CASINO;
            case 27:
                return PlaceTypes.CEMETERY;
            case 28:
                return PlaceTypes.CHURCH;
            case 29:
                return PlaceTypes.CITY_HALL;
            case 30:
                return PlaceTypes.CLOTHING_STORE;
            case 31:
                return PlaceTypes.COLLOQUIAL_AREA;
            case 32:
                return PlaceTypes.CONVENIENCE_STORE;
            case 33:
                return "country";
            case 34:
                return PlaceTypes.COURTHOUSE;
            case 35:
                return PlaceTypes.DENTIST;
            case 36:
                return PlaceTypes.DEPARTMENT_STORE;
            case 37:
                return PlaceTypes.DOCTOR;
            case 38:
                return PlaceTypes.ELECTRICIAN;
            case 39:
                return PlaceTypes.ELECTRONICS_STORE;
            case 40:
                return PlaceTypes.EMBASSY;
            case 41:
                return PlaceTypes.ESTABLISHMENT;
            case 42:
                return PlaceTypes.FINANCE;
            case 43:
                return PlaceTypes.FIRE_STATION;
            case 44:
                return PlaceTypes.FLOOR;
            case 45:
                return PlaceTypes.FLORIST;
            case 46:
                return PlaceTypes.FOOD;
            case 47:
                return PlaceTypes.FUNERAL_HOME;
            case 48:
                return PlaceTypes.FURNITURE_STORE;
            case 49:
                return PlaceTypes.GAS_STATION;
            case 50:
                return PlaceTypes.GENERAL_CONTRACTOR;
            case 51:
                return PlaceTypes.GEOCODE;
            case 52:
                return "grocery_or_supermarket";
            case 53:
                return PlaceTypes.GYM;
            case 54:
                return PlaceTypes.HAIR_CARE;
            case 55:
                return PlaceTypes.HARDWARE_STORE;
            case 56:
                return PlaceTypes.HEALTH;
            case 57:
                return PlaceTypes.HINDU_TEMPLE;
            case 58:
                return PlaceTypes.HOME_GOODS_STORE;
            case 59:
                return PlaceTypes.HOSPITAL;
            case 60:
                return PlaceTypes.INSURANCE_AGENCY;
            case 61:
                return PlaceTypes.INTERSECTION;
            case 62:
                return PlaceTypes.JEWELRY_STORE;
            case 63:
                return PlaceTypes.LAUNDRY;
            case 64:
                return PlaceTypes.LAWYER;
            case 65:
                return PlaceTypes.LIBRARY;
            case 66:
                return PlaceTypes.LIQUOR_STORE;
            case 67:
                return PlaceTypes.LOCALITY;
            case 68:
                return PlaceTypes.LOCAL_GOVERNMENT_OFFICE;
            case 69:
                return PlaceTypes.LOCKSMITH;
            case 70:
                return PlaceTypes.LODGING;
            case 71:
                return PlaceTypes.MEAL_DELIVERY;
            case 72:
                return PlaceTypes.MEAL_TAKEAWAY;
            case 73:
                return PlaceTypes.MOSQUE;
            case 74:
                return PlaceTypes.MOVIE_RENTAL;
            case 75:
                return PlaceTypes.MOVIE_THEATER;
            case 76:
                return PlaceTypes.MOVING_COMPANY;
            case 77:
                return PlaceTypes.MUSEUM;
            case 78:
                return PlaceTypes.NATURAL_FEATURE;
            case 79:
                return PlaceTypes.NEIGHBORHOOD;
            case 80:
                return PlaceTypes.NIGHT_CLUB;
            case 81:
            default:
                return "other";
            case 82:
                return PlaceTypes.PAINTER;
            case 83:
                return PlaceTypes.PARK;
            case 84:
                return PlaceTypes.PARKING;
            case 85:
                return PlaceTypes.PET_STORE;
            case 86:
                return PlaceTypes.PHARMACY;
            case 87:
                return PlaceTypes.PHYSIOTHERAPIST;
            case 88:
                return PlaceTypes.PLACE_OF_WORSHIP;
            case 89:
                return PlaceTypes.PLUMBER;
            case 90:
                return PlaceTypes.POINT_OF_INTEREST;
            case 91:
                return PlaceTypes.POLICE;
            case 92:
                return PlaceTypes.POLITICAL;
            case 93:
                return PlaceTypes.POSTAL_CODE;
            case 94:
                return PlaceTypes.POSTAL_CODE_PREFIX;
            case 95:
                return PlaceTypes.POSTAL_CODE_SUFFIX;
            case 96:
                return PlaceTypes.POSTAL_TOWN;
            case 97:
                return PlaceTypes.POST_BOX;
            case 98:
                return PlaceTypes.POST_OFFICE;
            case 99:
                return PlaceTypes.PREMISE;
            case 100:
                return PlaceTypes.REAL_ESTATE_AGENCY;
            case 101:
                return PlaceTypes.RESTAURANT;
            case 102:
                return PlaceTypes.ROOFING_CONTRACTOR;
            case 103:
                return PlaceTypes.ROOM;
            case 104:
                return PlaceTypes.ROUTE;
            case 105:
                return PlaceTypes.RV_PARK;
            case 106:
                return PlaceTypes.SCHOOL;
            case 107:
                return PlaceTypes.SHOE_STORE;
            case 108:
                return PlaceTypes.SHOPPING_MALL;
            case 109:
                return PlaceTypes.SPA;
            case 110:
                return PlaceTypes.STADIUM;
            case 111:
                return PlaceTypes.STORAGE;
            case 112:
                return PlaceTypes.STORE;
            case 113:
                return PlaceTypes.STREET_ADDRESS;
            case 114:
                return PlaceTypes.SUBLOCALITY;
            case 115:
                return PlaceTypes.SUBLOCALITY_LEVEL_1;
            case 116:
                return PlaceTypes.SUBLOCALITY_LEVEL_2;
            case 117:
                return PlaceTypes.SUBLOCALITY_LEVEL_3;
            case 118:
                return PlaceTypes.SUBLOCALITY_LEVEL_4;
            case 119:
                return PlaceTypes.SUBLOCALITY_LEVEL_5;
            case 120:
                return PlaceTypes.SUBPREMISE;
            case 121:
                return PlaceTypes.SUBWAY_STATION;
            case 122:
                return PlaceTypes.SUPERMARKET;
            case 123:
                return PlaceTypes.SYNAGOGUE;
            case 124:
                return PlaceTypes.TAXI_STAND;
            case 125:
                return PlaceTypes.TRAIN_STATION;
            case 126:
                return PlaceTypes.TRANSIT_STATION;
            case 127:
                return PlaceTypes.TRAVEL_AGENCY;
            case 128:
                return PlaceTypes.UNIVERSITY;
            case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                return PlaceTypes.VETERINARY_CARE;
            case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                return PlaceTypes.ZOO;
        }
    }

    @ReactMethod
    public final void lookUpPlaceByID(String str, ReadableArray fields, final Promise promise) {
        kotlin.jvm.internal.s.g(fields, "fields");
        kotlin.jvm.internal.s.g(promise, "promise");
        if (!Places.isInitialized()) {
            promise.reject("E_API_KEY_ERROR", new Error("No API key defined in gradle.properties or errors initializing Places"));
            return;
        }
        ArrayList<Object> arrayList = fields.toArrayList();
        kotlin.jvm.internal.s.f(arrayList, "fields.toArrayList()");
        final List<Place.Field> placeFields = getPlaceFields(arrayList, false);
        getPlacesClient().fetchPlace(FetchPlaceRequest.builder(str, placeFields).build()).addOnSuccessListener(new OnSuccessListener() { // from class: com.tesla.TeslaV4.reactnative.module.y
            {
                PlacesNativeModule.this = this;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                PlacesNativeModule.a(PlacesNativeModule.this, placeFields, promise, (FetchPlaceResponse) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.tesla.TeslaV4.reactnative.module.v
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                PlacesNativeModule.b(promise, exc);
            }
        });
    }
}