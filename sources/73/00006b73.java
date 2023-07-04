package expo.modules.location;

import android.content.Context;
import android.location.Address;
import android.location.Location;
import android.location.LocationManager;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.networking.FraudDetectionData;
import expo.modules.core.Promise;
import expo.modules.core.errors.CodedException;
import ezvcard.property.Kind;
import java.util.Map;
import zx.b;

/* loaded from: classes5.dex */
public class LocationHelpers {
    private static final String TAG = "LocationHelpers";

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle addressToBundle(Address address) {
        Bundle bundle = new Bundle();
        bundle.putString("city", address.getLocality());
        bundle.putString("district", address.getSubLocality());
        bundle.putString("streetNumber", address.getSubThoroughfare());
        bundle.putString("street", address.getThoroughfare());
        bundle.putString("region", address.getAdminArea());
        bundle.putString("subregion", address.getSubAdminArea());
        bundle.putString("country", address.getCountryName());
        bundle.putString("postalCode", address.getPostalCode());
        bundle.putString("name", address.getFeatureName());
        bundle.putString("isoCountryCode", address.getCountryCode());
        bundle.putString("timezone", null);
        return bundle;
    }

    private static b.a buildLocationParamsForAccuracy(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        if (i11 != 6) {
                            return new b.a().b(zx.a.MEDIUM).c(100.0f).d(3000L);
                        }
                        return new b.a().b(zx.a.HIGH).c(BitmapDescriptorFactory.HUE_RED).d(500L);
                    }
                    return new b.a().b(zx.a.HIGH).c(25.0f).d(1000L);
                }
                return new b.a().b(zx.a.HIGH).c(50.0f).d(2000L);
            }
            return new b.a().b(zx.a.LOW).c(1000.0f).d(5000L);
        }
        return new b.a().b(zx.a.LOWEST).c(3000.0f).d(AbstractComponentTracker.LINGERING_TIMEOUT);
    }

    private static int getAccuracyFromOptions(Map<String, Object> map) {
        if (map.containsKey("accuracy")) {
            return ((Number) map.get("accuracy")).intValue();
        }
        return 3;
    }

    public static boolean hasNetworkProviderEnabled(Context context) {
        LocationManager locationManager;
        return (context == null || (locationManager = (LocationManager) context.getSystemService(Kind.LOCATION)) == null || !locationManager.isProviderEnabled("network")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle headingToBundle(double d11, double d12, int i11) {
        Bundle bundle = new Bundle();
        bundle.putDouble("trueHeading", d11);
        bundle.putDouble("magHeading", d12);
        bundle.putInt("accuracy", i11);
        return bundle;
    }

    public static boolean isAnyProviderAvailable(Context context) {
        LocationManager locationManager;
        if (context == null || (locationManager = (LocationManager) context.getSystemService(Kind.LOCATION)) == null) {
            return false;
        }
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    public static boolean isLocationValid(Location location, Map<String, Object> map) {
        if (location == null) {
            return false;
        }
        return ((double) (System.currentTimeMillis() - location.getTime())) <= (map.containsKey("maxAge") ? ((Double) map.get("maxAge")).doubleValue() : Double.MAX_VALUE) && ((double) location.getAccuracy()) <= (map.containsKey("requiredAccuracy") ? ((Double) map.get("requiredAccuracy")).doubleValue() : Double.MAX_VALUE);
    }

    public static <BundleType extends BaseBundle> BundleType locationToBundle(Location location, Class<BundleType> cls) {
        if (location == null) {
            return null;
        }
        try {
            BundleType newInstance = cls.newInstance();
            BaseBundle locationToCoordsBundle = locationToCoordsBundle(location, cls);
            if (locationToCoordsBundle == null) {
                return null;
            }
            if (newInstance instanceof PersistableBundle) {
                ((PersistableBundle) newInstance).putPersistableBundle("coords", (PersistableBundle) locationToCoordsBundle);
            } else if (newInstance instanceof Bundle) {
                ((Bundle) newInstance).putBundle("coords", (Bundle) locationToCoordsBundle);
                ((Bundle) newInstance).putBoolean("mocked", location.isFromMockProvider());
            }
            newInstance.putDouble(FraudDetectionData.KEY_TIMESTAMP, location.getTime());
            return newInstance;
        } catch (IllegalAccessException | InstantiationException e11) {
            String str = TAG;
            Log.e(str, "Unexpected exception was thrown when converting location to the bundle: " + e11.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <BundleType extends BaseBundle> BundleType locationToCoordsBundle(Location location, Class<BundleType> cls) {
        try {
            BundleType newInstance = cls.newInstance();
            newInstance.putDouble("latitude", location.getLatitude());
            newInstance.putDouble("longitude", location.getLongitude());
            newInstance.putDouble("altitude", location.getAltitude());
            newInstance.putDouble("accuracy", location.getAccuracy());
            newInstance.putDouble("heading", location.getBearing());
            newInstance.putDouble("speed", location.getSpeed());
            if (Build.VERSION.SDK_INT >= 26) {
                newInstance.putDouble("altitudeAccuracy", location.getVerticalAccuracyMeters());
            } else {
                newInstance.putString("altitudeAccuracy", null);
            }
            return newInstance;
        } catch (IllegalAccessException | InstantiationException e11) {
            String str = TAG;
            Log.e(str, "Unexpected exception was thrown when converting location to coords bundle: " + e11.toString());
            return null;
        }
    }

    private static int mapAccuracyToPriority(int i11) {
        if (i11 != 1) {
            return (i11 == 4 || i11 == 5 || i11 == 6) ? 100 : 102;
        }
        return 104;
    }

    public static zx.b mapOptionsToLocationParams(Map<String, Object> map) {
        b.a buildLocationParamsForAccuracy = buildLocationParamsForAccuracy(getAccuracyFromOptions(map));
        if (map.containsKey("timeInterval")) {
            buildLocationParamsForAccuracy.d(((Number) map.get("timeInterval")).longValue());
        }
        if (map.containsKey("distanceInterval")) {
            buildLocationParamsForAccuracy.c(((Number) map.get("distanceInterval")).floatValue());
        }
        return buildLocationParamsForAccuracy.a();
    }

    public static LocationRequest prepareLocationRequest(Map<String, Object> map) {
        zx.b mapOptionsToLocationParams = mapOptionsToLocationParams(map);
        return new LocationRequest().setFastestInterval(mapOptionsToLocationParams.c()).setInterval(mapOptionsToLocationParams.c()).setMaxWaitTime(mapOptionsToLocationParams.c()).setSmallestDisplacement(mapOptionsToLocationParams.b()).setPriority(mapAccuracyToPriority(getAccuracyFromOptions(map)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void requestContinuousUpdates(final LocationModule locationModule, LocationRequest locationRequest, final int i11, final Promise promise) {
        locationModule.requestLocationUpdates(locationRequest, Integer.valueOf(i11), new LocationRequestCallbacks() { // from class: expo.modules.location.LocationHelpers.2
            @Override // expo.modules.location.LocationRequestCallbacks
            public void onLocationChanged(Location location) {
                Bundle bundle = new Bundle();
                bundle.putBundle(Kind.LOCATION, (Bundle) LocationHelpers.locationToBundle(location, Bundle.class));
                LocationModule.this.sendLocationResponse(i11, bundle);
            }

            @Override // expo.modules.location.LocationRequestCallbacks
            public void onRequestFailed(CodedException codedException) {
                promise.reject(codedException);
            }

            @Override // expo.modules.location.LocationRequestCallbacks
            public void onRequestSuccess() {
                promise.resolve(null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void requestSingleLocation(LocationModule locationModule, LocationRequest locationRequest, final Promise promise) {
        locationRequest.setNumUpdates(1);
        locationModule.requestLocationUpdates(locationRequest, null, new LocationRequestCallbacks() { // from class: expo.modules.location.LocationHelpers.1
            @Override // expo.modules.location.LocationRequestCallbacks
            public void onLocationChanged(Location location) {
                Promise.this.resolve(LocationHelpers.locationToBundle(location, Bundle.class));
            }

            @Override // expo.modules.location.LocationRequestCallbacks
            public void onLocationError(CodedException codedException) {
                Promise.this.reject(codedException);
            }

            @Override // expo.modules.location.LocationRequestCallbacks
            public void onRequestFailed(CodedException codedException) {
                Promise.this.reject(codedException);
            }
        });
    }
}