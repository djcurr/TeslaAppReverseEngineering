package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.DayOfWeek;
import com.google.android.libraries.places.api.model.LocalTime;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.libraries.places.api.model.TimeOfWeek;
import com.google.android.libraries.places.internal.zzfa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzex {
    private static final zzjb zza;
    private static final zzjb zzb;

    static {
        zzja zzjaVar = new zzja();
        zzjaVar.zza("OPERATIONAL", Place.BusinessStatus.OPERATIONAL);
        zzjaVar.zza("CLOSED_TEMPORARILY", Place.BusinessStatus.CLOSED_TEMPORARILY);
        zzjaVar.zza("CLOSED_PERMANENTLY", Place.BusinessStatus.CLOSED_PERMANENTLY);
        zza = zzjaVar.zzb();
        zzja zzjaVar2 = new zzja();
        zzjaVar2.zza(PlaceTypes.ACCOUNTING, Place.Type.ACCOUNTING);
        zzjaVar2.zza(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_1, Place.Type.ADMINISTRATIVE_AREA_LEVEL_1);
        zzjaVar2.zza(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_2, Place.Type.ADMINISTRATIVE_AREA_LEVEL_2);
        zzjaVar2.zza(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_3, Place.Type.ADMINISTRATIVE_AREA_LEVEL_3);
        zzjaVar2.zza(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_4, Place.Type.ADMINISTRATIVE_AREA_LEVEL_4);
        zzjaVar2.zza(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_5, Place.Type.ADMINISTRATIVE_AREA_LEVEL_5);
        zzjaVar2.zza(PlaceTypes.AIRPORT, Place.Type.AIRPORT);
        zzjaVar2.zza(PlaceTypes.AMUSEMENT_PARK, Place.Type.AMUSEMENT_PARK);
        zzjaVar2.zza(PlaceTypes.AQUARIUM, Place.Type.AQUARIUM);
        zzjaVar2.zza(PlaceTypes.ARCHIPELAGO, Place.Type.ARCHIPELAGO);
        zzjaVar2.zza(PlaceTypes.ART_GALLERY, Place.Type.ART_GALLERY);
        zzjaVar2.zza(PlaceTypes.ATM, Place.Type.ATM);
        zzjaVar2.zza(PlaceTypes.BAKERY, Place.Type.BAKERY);
        zzjaVar2.zza(PlaceTypes.BANK, Place.Type.BANK);
        zzjaVar2.zza(PlaceTypes.BAR, Place.Type.BAR);
        zzjaVar2.zza(PlaceTypes.BEAUTY_SALON, Place.Type.BEAUTY_SALON);
        zzjaVar2.zza(PlaceTypes.BICYCLE_STORE, Place.Type.BICYCLE_STORE);
        zzjaVar2.zza(PlaceTypes.BOOK_STORE, Place.Type.BOOK_STORE);
        zzjaVar2.zza(PlaceTypes.BOWLING_ALLEY, Place.Type.BOWLING_ALLEY);
        zzjaVar2.zza(PlaceTypes.BUS_STATION, Place.Type.BUS_STATION);
        zzjaVar2.zza(PlaceTypes.CAFE, Place.Type.CAFE);
        zzjaVar2.zza(PlaceTypes.CAMPGROUND, Place.Type.CAMPGROUND);
        zzjaVar2.zza(PlaceTypes.CAR_DEALER, Place.Type.CAR_DEALER);
        zzjaVar2.zza(PlaceTypes.CAR_RENTAL, Place.Type.CAR_RENTAL);
        zzjaVar2.zza(PlaceTypes.CAR_REPAIR, Place.Type.CAR_REPAIR);
        zzjaVar2.zza(PlaceTypes.CAR_WASH, Place.Type.CAR_WASH);
        zzjaVar2.zza(PlaceTypes.CASINO, Place.Type.CASINO);
        zzjaVar2.zza(PlaceTypes.CEMETERY, Place.Type.CEMETERY);
        zzjaVar2.zza(PlaceTypes.CHURCH, Place.Type.CHURCH);
        zzjaVar2.zza(PlaceTypes.CITY_HALL, Place.Type.CITY_HALL);
        zzjaVar2.zza(PlaceTypes.CLOTHING_STORE, Place.Type.CLOTHING_STORE);
        zzjaVar2.zza(PlaceTypes.COLLOQUIAL_AREA, Place.Type.COLLOQUIAL_AREA);
        zzjaVar2.zza(PlaceTypes.CONTINENT, Place.Type.CONTINENT);
        zzjaVar2.zza(PlaceTypes.CONVENIENCE_STORE, Place.Type.CONVENIENCE_STORE);
        zzjaVar2.zza("country", Place.Type.COUNTRY);
        zzjaVar2.zza(PlaceTypes.COURTHOUSE, Place.Type.COURTHOUSE);
        zzjaVar2.zza(PlaceTypes.DENTIST, Place.Type.DENTIST);
        zzjaVar2.zza(PlaceTypes.DEPARTMENT_STORE, Place.Type.DEPARTMENT_STORE);
        zzjaVar2.zza(PlaceTypes.DOCTOR, Place.Type.DOCTOR);
        zzjaVar2.zza(PlaceTypes.DRUGSTORE, Place.Type.DRUGSTORE);
        zzjaVar2.zza(PlaceTypes.ELECTRICIAN, Place.Type.ELECTRICIAN);
        zzjaVar2.zza(PlaceTypes.ELECTRONICS_STORE, Place.Type.ELECTRONICS_STORE);
        zzjaVar2.zza(PlaceTypes.EMBASSY, Place.Type.EMBASSY);
        zzjaVar2.zza(PlaceTypes.ESTABLISHMENT, Place.Type.ESTABLISHMENT);
        zzjaVar2.zza(PlaceTypes.FINANCE, Place.Type.FINANCE);
        zzjaVar2.zza(PlaceTypes.FIRE_STATION, Place.Type.FIRE_STATION);
        zzjaVar2.zza(PlaceTypes.FLOOR, Place.Type.FLOOR);
        zzjaVar2.zza(PlaceTypes.FLORIST, Place.Type.FLORIST);
        zzjaVar2.zza(PlaceTypes.FOOD, Place.Type.FOOD);
        zzjaVar2.zza(PlaceTypes.FUNERAL_HOME, Place.Type.FUNERAL_HOME);
        zzjaVar2.zza(PlaceTypes.FURNITURE_STORE, Place.Type.FURNITURE_STORE);
        zzjaVar2.zza(PlaceTypes.GAS_STATION, Place.Type.GAS_STATION);
        zzjaVar2.zza(PlaceTypes.GENERAL_CONTRACTOR, Place.Type.GENERAL_CONTRACTOR);
        zzjaVar2.zza(PlaceTypes.GEOCODE, Place.Type.GEOCODE);
        zzjaVar2.zza("grocery_or_supermarket", Place.Type.GROCERY_OR_SUPERMARKET);
        zzjaVar2.zza(PlaceTypes.GYM, Place.Type.GYM);
        zzjaVar2.zza(PlaceTypes.HAIR_CARE, Place.Type.HAIR_CARE);
        zzjaVar2.zza(PlaceTypes.HARDWARE_STORE, Place.Type.HARDWARE_STORE);
        zzjaVar2.zza(PlaceTypes.HEALTH, Place.Type.HEALTH);
        zzjaVar2.zza(PlaceTypes.HINDU_TEMPLE, Place.Type.HINDU_TEMPLE);
        zzjaVar2.zza(PlaceTypes.HOME_GOODS_STORE, Place.Type.HOME_GOODS_STORE);
        zzjaVar2.zza(PlaceTypes.HOSPITAL, Place.Type.HOSPITAL);
        zzjaVar2.zza(PlaceTypes.INSURANCE_AGENCY, Place.Type.INSURANCE_AGENCY);
        zzjaVar2.zza(PlaceTypes.INTERSECTION, Place.Type.INTERSECTION);
        zzjaVar2.zza(PlaceTypes.JEWELRY_STORE, Place.Type.JEWELRY_STORE);
        zzjaVar2.zza(PlaceTypes.LAUNDRY, Place.Type.LAUNDRY);
        zzjaVar2.zza(PlaceTypes.LAWYER, Place.Type.LAWYER);
        zzjaVar2.zza(PlaceTypes.LIBRARY, Place.Type.LIBRARY);
        zzjaVar2.zza(PlaceTypes.LIGHT_RAIL_STATION, Place.Type.LIGHT_RAIL_STATION);
        zzjaVar2.zza(PlaceTypes.LIQUOR_STORE, Place.Type.LIQUOR_STORE);
        zzjaVar2.zza(PlaceTypes.LOCAL_GOVERNMENT_OFFICE, Place.Type.LOCAL_GOVERNMENT_OFFICE);
        zzjaVar2.zza(PlaceTypes.LOCALITY, Place.Type.LOCALITY);
        zzjaVar2.zza(PlaceTypes.LOCKSMITH, Place.Type.LOCKSMITH);
        zzjaVar2.zza(PlaceTypes.LODGING, Place.Type.LODGING);
        zzjaVar2.zza(PlaceTypes.MEAL_DELIVERY, Place.Type.MEAL_DELIVERY);
        zzjaVar2.zza(PlaceTypes.MEAL_TAKEAWAY, Place.Type.MEAL_TAKEAWAY);
        zzjaVar2.zza(PlaceTypes.MOSQUE, Place.Type.MOSQUE);
        zzjaVar2.zza(PlaceTypes.MOVIE_RENTAL, Place.Type.MOVIE_RENTAL);
        zzjaVar2.zza(PlaceTypes.MOVIE_THEATER, Place.Type.MOVIE_THEATER);
        zzjaVar2.zza(PlaceTypes.MOVING_COMPANY, Place.Type.MOVING_COMPANY);
        zzjaVar2.zza(PlaceTypes.MUSEUM, Place.Type.MUSEUM);
        zzjaVar2.zza(PlaceTypes.NATURAL_FEATURE, Place.Type.NATURAL_FEATURE);
        zzjaVar2.zza(PlaceTypes.NEIGHBORHOOD, Place.Type.NEIGHBORHOOD);
        zzjaVar2.zza(PlaceTypes.NIGHT_CLUB, Place.Type.NIGHT_CLUB);
        zzjaVar2.zza(PlaceTypes.PAINTER, Place.Type.PAINTER);
        zzjaVar2.zza(PlaceTypes.PARK, Place.Type.PARK);
        zzjaVar2.zza(PlaceTypes.PARKING, Place.Type.PARKING);
        zzjaVar2.zza(PlaceTypes.PET_STORE, Place.Type.PET_STORE);
        zzjaVar2.zza(PlaceTypes.PHARMACY, Place.Type.PHARMACY);
        zzjaVar2.zza(PlaceTypes.PHYSIOTHERAPIST, Place.Type.PHYSIOTHERAPIST);
        zzjaVar2.zza(PlaceTypes.PLACE_OF_WORSHIP, Place.Type.PLACE_OF_WORSHIP);
        zzjaVar2.zza(PlaceTypes.PLUMBER, Place.Type.PLUMBER);
        zzjaVar2.zza(PlaceTypes.PLUS_CODE, Place.Type.PLUS_CODE);
        zzjaVar2.zza(PlaceTypes.POINT_OF_INTEREST, Place.Type.POINT_OF_INTEREST);
        zzjaVar2.zza(PlaceTypes.POLICE, Place.Type.POLICE);
        zzjaVar2.zza(PlaceTypes.POLITICAL, Place.Type.POLITICAL);
        zzjaVar2.zza(PlaceTypes.POST_BOX, Place.Type.POST_BOX);
        zzjaVar2.zza(PlaceTypes.POST_OFFICE, Place.Type.POST_OFFICE);
        zzjaVar2.zza(PlaceTypes.POSTAL_CODE_PREFIX, Place.Type.POSTAL_CODE_PREFIX);
        zzjaVar2.zza(PlaceTypes.POSTAL_CODE_SUFFIX, Place.Type.POSTAL_CODE_SUFFIX);
        zzjaVar2.zza(PlaceTypes.POSTAL_CODE, Place.Type.POSTAL_CODE);
        zzjaVar2.zza(PlaceTypes.POSTAL_TOWN, Place.Type.POSTAL_TOWN);
        zzjaVar2.zza(PlaceTypes.PREMISE, Place.Type.PREMISE);
        zzjaVar2.zza(PlaceTypes.PRIMARY_SCHOOL, Place.Type.PRIMARY_SCHOOL);
        zzjaVar2.zza(PlaceTypes.REAL_ESTATE_AGENCY, Place.Type.REAL_ESTATE_AGENCY);
        zzjaVar2.zza(PlaceTypes.RESTAURANT, Place.Type.RESTAURANT);
        zzjaVar2.zza(PlaceTypes.ROOFING_CONTRACTOR, Place.Type.ROOFING_CONTRACTOR);
        zzjaVar2.zza(PlaceTypes.ROOM, Place.Type.ROOM);
        zzjaVar2.zza(PlaceTypes.ROUTE, Place.Type.ROUTE);
        zzjaVar2.zza(PlaceTypes.RV_PARK, Place.Type.RV_PARK);
        zzjaVar2.zza(PlaceTypes.SCHOOL, Place.Type.SCHOOL);
        zzjaVar2.zza(PlaceTypes.SECONDARY_SCHOOL, Place.Type.SECONDARY_SCHOOL);
        zzjaVar2.zza(PlaceTypes.SHOE_STORE, Place.Type.SHOE_STORE);
        zzjaVar2.zza(PlaceTypes.SHOPPING_MALL, Place.Type.SHOPPING_MALL);
        zzjaVar2.zza(PlaceTypes.SPA, Place.Type.SPA);
        zzjaVar2.zza(PlaceTypes.STADIUM, Place.Type.STADIUM);
        zzjaVar2.zza(PlaceTypes.STORAGE, Place.Type.STORAGE);
        zzjaVar2.zza(PlaceTypes.STORE, Place.Type.STORE);
        zzjaVar2.zza(PlaceTypes.STREET_ADDRESS, Place.Type.STREET_ADDRESS);
        zzjaVar2.zza(PlaceTypes.STREET_NUMBER, Place.Type.STREET_NUMBER);
        zzjaVar2.zza(PlaceTypes.SUBLOCALITY_LEVEL_1, Place.Type.SUBLOCALITY_LEVEL_1);
        zzjaVar2.zza(PlaceTypes.SUBLOCALITY_LEVEL_2, Place.Type.SUBLOCALITY_LEVEL_2);
        zzjaVar2.zza(PlaceTypes.SUBLOCALITY_LEVEL_3, Place.Type.SUBLOCALITY_LEVEL_3);
        zzjaVar2.zza(PlaceTypes.SUBLOCALITY_LEVEL_4, Place.Type.SUBLOCALITY_LEVEL_4);
        zzjaVar2.zza(PlaceTypes.SUBLOCALITY_LEVEL_5, Place.Type.SUBLOCALITY_LEVEL_5);
        zzjaVar2.zza(PlaceTypes.SUBLOCALITY, Place.Type.SUBLOCALITY);
        zzjaVar2.zza(PlaceTypes.SUBPREMISE, Place.Type.SUBPREMISE);
        zzjaVar2.zza(PlaceTypes.SUBWAY_STATION, Place.Type.SUBWAY_STATION);
        zzjaVar2.zza(PlaceTypes.SUPERMARKET, Place.Type.SUPERMARKET);
        zzjaVar2.zza(PlaceTypes.SYNAGOGUE, Place.Type.SYNAGOGUE);
        zzjaVar2.zza(PlaceTypes.TAXI_STAND, Place.Type.TAXI_STAND);
        zzjaVar2.zza(PlaceTypes.TOURIST_ATTRACTION, Place.Type.TOURIST_ATTRACTION);
        zzjaVar2.zza(PlaceTypes.TOWN_SQUARE, Place.Type.TOWN_SQUARE);
        zzjaVar2.zza(PlaceTypes.TRAIN_STATION, Place.Type.TRAIN_STATION);
        zzjaVar2.zza(PlaceTypes.TRANSIT_STATION, Place.Type.TRANSIT_STATION);
        zzjaVar2.zza(PlaceTypes.TRAVEL_AGENCY, Place.Type.TRAVEL_AGENCY);
        zzjaVar2.zza(PlaceTypes.UNIVERSITY, Place.Type.UNIVERSITY);
        zzjaVar2.zza(PlaceTypes.VETERINARY_CARE, Place.Type.VETERINARY_CARE);
        zzjaVar2.zza(PlaceTypes.ZOO, Place.Type.ZOO);
        zzb = zzjaVar2.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List zza(List list) {
        return list != null ? list : new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List zzb(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        zzjw listIterator = ((zziy) list).listIterator(0);
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            zzjb zzjbVar = zzb;
            if (zzjbVar.containsKey(str)) {
                arrayList.add((Place.Type) zzjbVar.get(str));
            } else {
                z11 = true;
            }
        }
        if (z11) {
            arrayList.add(Place.Type.OTHER);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.google.android.libraries.places.api.model.Place zzc(com.google.android.libraries.places.internal.zzfa r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzex.zzc(com.google.android.libraries.places.internal.zzfa, java.util.List):com.google.android.libraries.places.api.model.Place");
    }

    private static ApiException zzd(String str) {
        return new ApiException(new Status(8, "Unexpected server error: ".concat(String.valueOf(str))));
    }

    private static LatLng zze(zzfa.zzb.zza zzaVar) {
        if (zzaVar == null) {
            return null;
        }
        Double zza2 = zzaVar.zza();
        Double zzb2 = zzaVar.zzb();
        if (zza2 == null || zzb2 == null) {
            return null;
        }
        return new LatLng(zza2.doubleValue(), zzb2.doubleValue());
    }

    private static TimeOfWeek zzf(zzfa.zzc.zzb zzbVar) {
        DayOfWeek dayOfWeek;
        if (zzbVar != null) {
            try {
                Integer zza2 = zzbVar.zza();
                zzig.zzc(zza2, "Unable to convert Pablo response to TimeOfWeek: The \"day\" field is missing.");
                String zzb2 = zzbVar.zzb();
                zzig.zzc(zzb2, "Unable to convert Pablo response to TimeOfWeek: The \"time\" field is missing.");
                boolean z11 = true;
                String format = String.format("Unable to convert %s to LocalTime, must be of format \"hhmm\".", zzb2);
                if (zzb2.length() != 4) {
                    z11 = false;
                }
                zzig.zze(z11, format);
                try {
                    LocalTime newInstance = LocalTime.newInstance(Integer.parseInt(zzb2.substring(0, 2)), Integer.parseInt(zzb2.substring(2, 4)));
                    switch (zza2.intValue()) {
                        case 0:
                            dayOfWeek = DayOfWeek.SUNDAY;
                            break;
                        case 1:
                            dayOfWeek = DayOfWeek.MONDAY;
                            break;
                        case 2:
                            dayOfWeek = DayOfWeek.TUESDAY;
                            break;
                        case 3:
                            dayOfWeek = DayOfWeek.WEDNESDAY;
                            break;
                        case 4:
                            dayOfWeek = DayOfWeek.THURSDAY;
                            break;
                        case 5:
                            dayOfWeek = DayOfWeek.FRIDAY;
                            break;
                        case 6:
                            dayOfWeek = DayOfWeek.SATURDAY;
                            break;
                        default:
                            throw new IllegalArgumentException("pabloDayOfWeek can only be an integer between 0 and 6");
                    }
                    return TimeOfWeek.newInstance(dayOfWeek, newInstance);
                } catch (NumberFormatException e11) {
                    throw new IllegalArgumentException(format, e11);
                }
            } catch (NullPointerException e12) {
                throw new IllegalArgumentException(e12.getMessage(), e12);
            }
        }
        return null;
    }

    private static boolean zzg(Collection collection, Object obj) {
        if (obj != null) {
            return collection.add(obj);
        }
        return false;
    }
}