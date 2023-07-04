package expo.modules.location;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.hardware.GeomagneticField;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import expo.modules.core.ExportedModule;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.Promise;
import expo.modules.core.interfaces.ActivityEventListener;
import expo.modules.core.interfaces.ActivityProvider;
import expo.modules.core.interfaces.ExpoMethod;
import expo.modules.core.interfaces.LifecycleEventListener;
import expo.modules.core.interfaces.services.EventEmitter;
import expo.modules.core.interfaces.services.UIManager;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.interfaces.permissions.PermissionsResponseListener;
import expo.modules.interfaces.permissions.PermissionsStatus;
import expo.modules.interfaces.taskManager.TaskManagerInterface;
import expo.modules.location.exceptions.LocationBackgroundUnauthorizedException;
import expo.modules.location.exceptions.LocationRequestRejectedException;
import expo.modules.location.exceptions.LocationSettingsUnsatisfiedException;
import expo.modules.location.exceptions.LocationUnauthorizedException;
import expo.modules.location.exceptions.LocationUnavailableException;
import expo.modules.location.taskConsumers.GeofencingTaskConsumer;
import expo.modules.location.taskConsumers.LocationTaskConsumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import tx.e;

/* loaded from: classes5.dex */
public class LocationModule extends ExportedModule implements LifecycleEventListener, SensorEventListener, ActivityEventListener {
    public static final int ACCURACY_BALANCED = 3;
    public static final int ACCURACY_BEST_FOR_NAVIGATION = 6;
    public static final int ACCURACY_HIGH = 4;
    public static final int ACCURACY_HIGHEST = 5;
    public static final int ACCURACY_LOW = 2;
    public static final int ACCURACY_LOWEST = 1;
    private static final int CHECK_SETTINGS_REQUEST_CODE = 42;
    private static final double DEGREE_DELTA = 0.0355d;
    public static final int GEOFENCING_EVENT_ENTER = 1;
    public static final int GEOFENCING_EVENT_EXIT = 2;
    public static final int GEOFENCING_REGION_STATE_INSIDE = 1;
    public static final int GEOFENCING_REGION_STATE_OUTSIDE = 2;
    public static final int GEOFENCING_REGION_STATE_UNKNOWN = 0;
    private static final String HEADING_EVENT_NAME = "Expo.headingChanged";
    private static final String LOCATION_EVENT_NAME = "Expo.locationChanged";
    private static final String SHOW_USER_SETTINGS_DIALOG_KEY = "mayShowUserSettingsDialog";
    private static final String TAG = LocationModule.class.getSimpleName();
    private static final float TIME_DELTA = 50.0f;
    private int mAccuracy;
    private ActivityProvider mActivityProvider;
    private Context mContext;
    private EventEmitter mEventEmitter;
    private boolean mGeocoderPaused;
    private GeomagneticField mGeofield;
    private float[] mGeomagnetic;
    private float[] mGravity;
    private int mHeadingId;
    private float mLastAzimuth;
    private long mLastUpdate;
    private Map<Integer, LocationCallback> mLocationCallbacks;
    private FusedLocationProviderClient mLocationProvider;
    private Map<Integer, LocationRequest> mLocationRequests;
    private List<LocationActivityResultListener> mPendingLocationRequests;
    private Permissions mPermissionsManager;
    private SensorManager mSensorManager;
    private TaskManagerInterface mTaskManager;
    private UIManager mUIManager;

    /* loaded from: classes5.dex */
    public interface OnResultListener {
        void onResult(Location location);
    }

    public LocationModule(Context context) {
        super(context);
        this.mLocationCallbacks = new HashMap();
        this.mLocationRequests = new HashMap();
        this.mPendingLocationRequests = new ArrayList();
        this.mLastAzimuth = BitmapDescriptorFactory.HUE_RED;
        this.mAccuracy = 0;
        this.mLastUpdate = 0L;
        this.mGeocoderPaused = false;
        this.mContext = context;
    }

    public static /* synthetic */ void a(LocationModule locationModule, LocationRequest locationRequest, int i11, Promise promise, int i12) {
        locationModule.lambda$watchPositionImplAsync$8(locationRequest, i11, promise, i12);
    }

    private void addPendingLocationRequest(LocationRequest locationRequest, LocationActivityResultListener locationActivityResultListener) {
        this.mPendingLocationRequests.add(locationActivityResultListener);
        if (this.mPendingLocationRequests.size() == 1) {
            resolveUserSettingsForRequest(locationRequest);
        }
    }

    public static /* synthetic */ void b(Promise promise, int i11) {
        lambda$enableNetworkProviderAsync$11(promise, i11);
    }

    public static /* synthetic */ void c(LocationModule locationModule, Location location) {
        locationModule.lambda$startHeadingUpdate$17(location);
    }

    private float calcMagNorth(float f11) {
        return (((float) Math.toDegrees(f11)) + 360.0f) % 360.0f;
    }

    private float calcTrueNorth(float f11) {
        GeomagneticField geomagneticField;
        if (isMissingForegroundPermissions() || (geomagneticField = this.mGeofield) == null) {
            return -1.0f;
        }
        return f11 + geomagneticField.getDeclination();
    }

    public static /* synthetic */ void d(LocationModule locationModule, Promise promise, Location location, List list) {
        locationModule.lambda$reverseGeocodeAsync$10(promise, location, list);
    }

    private void destroyHeadingWatch() {
        stopHeadingWatch();
        this.mSensorManager = null;
        this.mGravity = null;
        this.mGeomagnetic = null;
        this.mGeofield = null;
        this.mHeadingId = 0;
        this.mLastAzimuth = BitmapDescriptorFactory.HUE_RED;
        this.mAccuracy = 0;
    }

    public static /* synthetic */ void e(LocationModule locationModule, Activity activity, Exception exc) {
        locationModule.lambda$resolveUserSettingsForRequest$16(activity, exc);
    }

    private void executePendingRequests(int i11) {
        for (LocationActivityResultListener locationActivityResultListener : this.mPendingLocationRequests) {
            locationActivityResultListener.onResult(i11);
        }
        this.mPendingLocationRequests.clear();
    }

    public static /* synthetic */ void f(LocationModule locationModule, Promise promise, Map map) {
        locationModule.lambda$requestBackgroundPermissionsAsync$3(promise, map);
    }

    public static /* synthetic */ void g(LocationModule locationModule, Promise promise, Map map) {
        locationModule.lambda$requestForegroundPermissionsAsync$2(promise, map);
    }

    private void getLastKnownLocation(final OnResultListener onResultListener) {
        try {
            getLocationProvider().getLastLocation().addOnSuccessListener(new OnSuccessListener() { // from class: expo.modules.location.l
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    LocationModule.k(onResultListener, (Location) obj);
                }
            }).addOnCanceledListener(new OnCanceledListener() { // from class: expo.modules.location.a
                @Override // com.google.android.gms.tasks.OnCanceledListener
                public final void onCanceled() {
                    LocationModule.n(onResultListener);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: expo.modules.location.j
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    LocationModule.i(onResultListener, exc);
                }
            });
        } catch (SecurityException unused) {
            onResultListener.onResult(null);
        }
    }

    private FusedLocationProviderClient getLocationProvider() {
        if (this.mLocationProvider == null) {
            this.mLocationProvider = LocationServices.getFusedLocationProviderClient(this.mContext);
        }
        return this.mLocationProvider;
    }

    public static /* synthetic */ void h(LocationModule locationModule, Promise promise, Map map) {
        locationModule.lambda$getBackgroundPermissionsAsync$5(promise, map);
    }

    private Bundle handleBackgroundLocationPermissions(Map<String, PermissionsResponse> map) {
        PermissionsResponse permissionsResponse = map.get("android.permission.ACCESS_BACKGROUND_LOCATION");
        Objects.requireNonNull(permissionsResponse);
        PermissionsStatus status = permissionsResponse.getStatus();
        boolean canAskAgain = permissionsResponse.getCanAskAgain();
        Bundle bundle = new Bundle();
        bundle.putString(PermissionsResponse.STATUS_KEY, status.getStatus());
        bundle.putString(PermissionsResponse.EXPIRES_KEY, PermissionsResponse.PERMISSION_EXPIRES_NEVER);
        bundle.putBoolean(PermissionsResponse.CAN_ASK_AGAIN_KEY, canAskAgain);
        bundle.putBoolean(PermissionsResponse.GRANTED_KEY, status == PermissionsStatus.GRANTED);
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.os.Bundle handleForegroundLocationPermissions(java.util.Map<java.lang.String, expo.modules.interfaces.permissions.PermissionsResponse> r9) {
        /*
            r8 = this;
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.Object r0 = r9.get(r0)
            expo.modules.interfaces.permissions.PermissionsResponse r0 = (expo.modules.interfaces.permissions.PermissionsResponse) r0
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.Object r9 = r9.get(r1)
            expo.modules.interfaces.permissions.PermissionsResponse r9 = (expo.modules.interfaces.permissions.PermissionsResponse) r9
            java.util.Objects.requireNonNull(r0)
            java.util.Objects.requireNonNull(r9)
            expo.modules.interfaces.permissions.PermissionsStatus r1 = expo.modules.interfaces.permissions.PermissionsStatus.UNDETERMINED
            boolean r2 = r9.getCanAskAgain()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L28
            boolean r2 = r0.getCanAskAgain()
            if (r2 == 0) goto L28
            r2 = r3
            goto L29
        L28:
            r2 = r4
        L29:
            expo.modules.interfaces.permissions.PermissionsStatus r5 = r0.getStatus()
            expo.modules.interfaces.permissions.PermissionsStatus r6 = expo.modules.interfaces.permissions.PermissionsStatus.GRANTED
            java.lang.String r7 = "none"
            if (r5 != r6) goto L37
            java.lang.String r7 = "fine"
        L35:
            r1 = r6
            goto L4f
        L37:
            expo.modules.interfaces.permissions.PermissionsStatus r5 = r9.getStatus()
            if (r5 != r6) goto L40
            java.lang.String r7 = "coarse"
            goto L35
        L40:
            expo.modules.interfaces.permissions.PermissionsStatus r0 = r0.getStatus()
            expo.modules.interfaces.permissions.PermissionsStatus r5 = expo.modules.interfaces.permissions.PermissionsStatus.DENIED
            if (r0 != r5) goto L4f
            expo.modules.interfaces.permissions.PermissionsStatus r9 = r9.getStatus()
            if (r9 != r5) goto L4f
            r1 = r5
        L4f:
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r0 = r1.getStatus()
            java.lang.String r5 = "status"
            r9.putString(r5, r0)
            java.lang.String r0 = "expires"
            java.lang.String r5 = "never"
            r9.putString(r0, r5)
            java.lang.String r0 = "canAskAgain"
            r9.putBoolean(r0, r2)
            if (r1 != r6) goto L6c
            goto L6d
        L6c:
            r3 = r4
        L6d:
            java.lang.String r0 = "granted"
            r9.putBoolean(r0, r3)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "scoped"
            r0.putString(r1, r7)
            java.lang.String r1 = "accuracy"
            r0.putString(r1, r7)
            java.lang.String r1 = "android"
            r9.putBundle(r1, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.location.LocationModule.handleForegroundLocationPermissions(java.util.Map):android.os.Bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.os.Bundle handleLegacyPermissions(java.util.Map<java.lang.String, expo.modules.interfaces.permissions.PermissionsResponse> r9) {
        /*
            r8 = this;
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.Object r0 = r9.get(r0)
            expo.modules.interfaces.permissions.PermissionsResponse r0 = (expo.modules.interfaces.permissions.PermissionsResponse) r0
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.Object r1 = r9.get(r1)
            expo.modules.interfaces.permissions.PermissionsResponse r1 = (expo.modules.interfaces.permissions.PermissionsResponse) r1
            java.lang.String r2 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            java.lang.Object r9 = r9.get(r2)
            expo.modules.interfaces.permissions.PermissionsResponse r9 = (expo.modules.interfaces.permissions.PermissionsResponse) r9
            java.util.Objects.requireNonNull(r0)
            java.util.Objects.requireNonNull(r1)
            java.util.Objects.requireNonNull(r9)
            expo.modules.interfaces.permissions.PermissionsStatus r9 = expo.modules.interfaces.permissions.PermissionsStatus.UNDETERMINED
            boolean r2 = r1.getCanAskAgain()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            boolean r2 = r0.getCanAskAgain()
            if (r2 == 0) goto L33
            r2 = r3
            goto L34
        L33:
            r2 = r4
        L34:
            expo.modules.interfaces.permissions.PermissionsStatus r5 = r0.getStatus()
            expo.modules.interfaces.permissions.PermissionsStatus r6 = expo.modules.interfaces.permissions.PermissionsStatus.GRANTED
            java.lang.String r7 = "none"
            if (r5 != r6) goto L42
            java.lang.String r7 = "fine"
        L40:
            r9 = r6
            goto L5a
        L42:
            expo.modules.interfaces.permissions.PermissionsStatus r5 = r1.getStatus()
            if (r5 != r6) goto L4b
            java.lang.String r7 = "coarse"
            goto L40
        L4b:
            expo.modules.interfaces.permissions.PermissionsStatus r0 = r0.getStatus()
            expo.modules.interfaces.permissions.PermissionsStatus r5 = expo.modules.interfaces.permissions.PermissionsStatus.DENIED
            if (r0 != r5) goto L5a
            expo.modules.interfaces.permissions.PermissionsStatus r0 = r1.getStatus()
            if (r0 != r5) goto L5a
            r9 = r5
        L5a:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = r9.getStatus()
            java.lang.String r5 = "status"
            r0.putString(r5, r1)
            java.lang.String r1 = "expires"
            java.lang.String r5 = "never"
            r0.putString(r1, r5)
            java.lang.String r1 = "canAskAgain"
            r0.putBoolean(r1, r2)
            if (r9 != r6) goto L77
            goto L78
        L77:
            r3 = r4
        L78:
            java.lang.String r9 = "granted"
            r0.putBoolean(r9, r3)
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r1 = "accuracy"
            r9.putString(r1, r7)
            java.lang.String r1 = "android"
            r0.putBundle(r1, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.location.LocationModule.handleLegacyPermissions(java.util.Map):android.os.Bundle");
    }

    public static /* synthetic */ void i(OnResultListener onResultListener, Exception exc) {
        onResultListener.onResult(null);
    }

    private boolean isBackgroundPermissionInManifest() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.mPermissionsManager.isPermissionPresentInManifest("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        return true;
    }

    private boolean isMissingBackgroundPermissions() {
        Permissions permissions = this.mPermissionsManager;
        return permissions == null || (Build.VERSION.SDK_INT >= 29 && !permissions.hasGrantedPermissions("android.permission.ACCESS_BACKGROUND_LOCATION"));
    }

    private boolean isMissingForegroundPermissions() {
        Permissions permissions = this.mPermissionsManager;
        if (permissions == null) {
            return true;
        }
        return (permissions.hasGrantedPermissions("android.permission.ACCESS_FINE_LOCATION") || this.mPermissionsManager.hasGrantedPermissions("android.permission.ACCESS_COARSE_LOCATION")) ? false : true;
    }

    public static /* synthetic */ void j(LocationModule locationModule, LocationSettingsResponse locationSettingsResponse) {
        locationModule.lambda$resolveUserSettingsForRequest$15(locationSettingsResponse);
    }

    public static /* synthetic */ void k(OnResultListener onResultListener, Location location) {
        onResultListener.onResult(location);
    }

    public static /* synthetic */ void l(LocationModule locationModule, Promise promise, Map map) {
        locationModule.lambda$getPermissionsAsync$1(promise, map);
    }

    public static /* synthetic */ void lambda$enableNetworkProviderAsync$11(Promise promise, int i11) {
        if (i11 == -1) {
            promise.resolve(null);
        } else {
            promise.reject(new LocationSettingsUnsatisfiedException());
        }
    }

    public /* synthetic */ void lambda$geocodeAsync$9(Promise promise, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Bundle bundle = (Bundle) LocationHelpers.locationToCoordsBundle(((wx.a) it2.next()).a(), Bundle.class);
            if (bundle != null) {
                arrayList.add(bundle);
            }
        }
        tx.e.h(this.mContext).d().h();
        promise.resolve(arrayList);
    }

    public /* synthetic */ void lambda$getBackgroundPermissionsAsync$5(Promise promise, Map map) {
        promise.resolve(handleBackgroundLocationPermissions(map));
    }

    public /* synthetic */ void lambda$getCurrentPositionAsync$7(LocationRequest locationRequest, Promise promise, int i11) {
        if (i11 == -1) {
            LocationHelpers.requestSingleLocation(this, locationRequest, promise);
        } else {
            promise.reject(new LocationSettingsUnsatisfiedException());
        }
    }

    public /* synthetic */ void lambda$getForegroundPermissionsAsync$4(Promise promise, Map map) {
        promise.resolve(handleForegroundLocationPermissions(map));
    }

    public static /* synthetic */ void lambda$getLastKnownPositionAsync$6(Map map, Promise promise, Location location) {
        if (LocationHelpers.isLocationValid(location, map)) {
            promise.resolve(LocationHelpers.locationToBundle(location, Bundle.class));
        } else {
            promise.resolve(null);
        }
    }

    public /* synthetic */ void lambda$getPermissionsAsync$1(Promise promise, Map map) {
        promise.resolve(handleLegacyPermissions(map));
    }

    public /* synthetic */ void lambda$requestBackgroundPermissionsAsync$3(Promise promise, Map map) {
        promise.resolve(handleBackgroundLocationPermissions(map));
    }

    public /* synthetic */ void lambda$requestForegroundPermissionsAsync$2(Promise promise, Map map) {
        promise.resolve(handleForegroundLocationPermissions(map));
    }

    public /* synthetic */ void lambda$requestPermissionsAsync$0(Promise promise, Map map) {
        promise.resolve(handleLegacyPermissions(map));
    }

    public /* synthetic */ void lambda$resolveUserSettingsForRequest$15(LocationSettingsResponse locationSettingsResponse) {
        executePendingRequests(-1);
    }

    public /* synthetic */ void lambda$resolveUserSettingsForRequest$16(Activity activity, Exception exc) {
        if (((ApiException) exc).getStatusCode() == 6) {
            try {
                this.mUIManager.registerActivityEventListener(this);
                ((ResolvableApiException) exc).startResolutionForResult(activity, 42);
                return;
            } catch (IntentSender.SendIntentException unused) {
                executePendingRequests(0);
                return;
            }
        }
        executePendingRequests(0);
    }

    public /* synthetic */ void lambda$reverseGeocodeAsync$10(Promise promise, Location location, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(LocationHelpers.addressToBundle((Address) it2.next()));
        }
        tx.e.h(this.mContext).d().h();
        promise.resolve(arrayList);
    }

    public /* synthetic */ void lambda$startHeadingUpdate$17(Location location) {
        this.mGeofield = new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), System.currentTimeMillis());
    }

    public /* synthetic */ void lambda$watchPositionImplAsync$8(LocationRequest locationRequest, int i11, Promise promise, int i12) {
        if (i12 == -1) {
            LocationHelpers.requestContinuousUpdates(this, locationRequest, i11, promise);
        } else {
            promise.reject(new LocationSettingsUnsatisfiedException());
        }
    }

    public static /* synthetic */ void m(LocationModule locationModule, Promise promise, String str, List list) {
        locationModule.lambda$geocodeAsync$9(promise, str, list);
    }

    public static /* synthetic */ void n(OnResultListener onResultListener) {
        onResultListener.onResult(null);
    }

    public static /* synthetic */ void o(Map map, Promise promise, Location location) {
        lambda$getLastKnownPositionAsync$6(map, promise, location);
    }

    public static /* synthetic */ void p(LocationModule locationModule, LocationRequest locationRequest, Promise promise, int i11) {
        locationModule.lambda$getCurrentPositionAsync$7(locationRequest, promise, i11);
    }

    private void pauseLocationUpdatesForRequest(Integer num) {
        LocationCallback locationCallback = this.mLocationCallbacks.get(num);
        if (locationCallback != null) {
            getLocationProvider().removeLocationUpdates(locationCallback);
        }
    }

    public static /* synthetic */ void q(LocationModule locationModule, Promise promise, Map map) {
        locationModule.lambda$requestPermissionsAsync$0(promise, map);
    }

    public static /* synthetic */ void r(LocationModule locationModule, Promise promise, Map map) {
        locationModule.lambda$getForegroundPermissionsAsync$4(promise, map);
    }

    private void removeLocationUpdatesForRequest(Integer num) {
        pauseLocationUpdatesForRequest(num);
        this.mLocationCallbacks.remove(num);
        this.mLocationRequests.remove(num);
    }

    private void resolveUserSettingsForRequest(LocationRequest locationRequest) {
        final Activity currentActivity = this.mActivityProvider.getCurrentActivity();
        if (currentActivity == null) {
            executePendingRequests(0);
            return;
        }
        Task<LocationSettingsResponse> checkLocationSettings = LocationServices.getSettingsClient(this.mContext).checkLocationSettings(new LocationSettingsRequest.Builder().addLocationRequest(locationRequest).build());
        checkLocationSettings.addOnSuccessListener(new OnSuccessListener() { // from class: expo.modules.location.m
            {
                LocationModule.this = this;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                LocationModule.j(LocationModule.this, (LocationSettingsResponse) obj);
            }
        });
        checkLocationSettings.addOnFailureListener(new OnFailureListener() { // from class: expo.modules.location.k
            {
                LocationModule.this = this;
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                LocationModule.e(LocationModule.this, currentActivity, exc);
            }
        });
    }

    private void resumeLocationUpdates() {
        FusedLocationProviderClient locationProvider = getLocationProvider();
        for (Integer num : this.mLocationCallbacks.keySet()) {
            LocationCallback locationCallback = this.mLocationCallbacks.get(num);
            LocationRequest locationRequest = this.mLocationRequests.get(num);
            if (locationCallback != null && locationRequest != null) {
                try {
                    locationProvider.requestLocationUpdates(locationRequest, locationCallback, Looper.myLooper());
                } catch (SecurityException e11) {
                    String str = TAG;
                    Log.e(str, "Error occurred while resuming location updates: " + e11.toString());
                }
            }
        }
    }

    private void sendUpdate() {
        float[] fArr = new float[9];
        if (SensorManager.getRotationMatrix(fArr, new float[9], this.mGravity, this.mGeomagnetic)) {
            float[] fArr2 = new float[3];
            SensorManager.getOrientation(fArr, fArr2);
            if (Math.abs(fArr2[0] - this.mLastAzimuth) <= DEGREE_DELTA || ((float) (System.currentTimeMillis() - this.mLastUpdate)) <= TIME_DELTA) {
                return;
            }
            this.mLastAzimuth = fArr2[0];
            this.mLastUpdate = System.currentTimeMillis();
            float calcMagNorth = calcMagNorth(fArr2[0]);
            float calcTrueNorth = calcTrueNorth(calcMagNorth);
            Bundle bundle = new Bundle();
            Bundle headingToBundle = LocationHelpers.headingToBundle(calcTrueNorth, calcMagNorth, this.mAccuracy);
            bundle.putInt("watchId", this.mHeadingId);
            bundle.putBundle("heading", headingToBundle);
            this.mEventEmitter.emit(HEADING_EVENT_NAME, bundle);
        }
    }

    private boolean shouldAskBackgroundPermissions() {
        return Build.VERSION.SDK_INT >= 29;
    }

    private void startHeadingUpdate() {
        Context context;
        if (this.mSensorManager == null || (context = this.mContext) == null) {
            return;
        }
        e.d a11 = tx.e.h(context).f().c().a(zx.b.f61259d);
        Location b11 = a11.b();
        if (b11 != null) {
            this.mGeofield = new GeomagneticField((float) b11.getLatitude(), (float) b11.getLongitude(), (float) b11.getAltitude(), System.currentTimeMillis());
        } else {
            a11.d(new tx.c() { // from class: expo.modules.location.h
                {
                    LocationModule.this = this;
                }

                @Override // tx.c
                public final void a(Location location) {
                    LocationModule.c(LocationModule.this, location);
                }
            });
        }
    }

    private void startWatching() {
        if (this.mContext == null) {
            return;
        }
        if (!isMissingForegroundPermissions()) {
            this.mGeocoderPaused = false;
        }
        resumeLocationUpdates();
    }

    private void stopHeadingWatch() {
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager == null) {
            return;
        }
        sensorManager.unregisterListener(this);
    }

    private void stopWatching() {
        if (this.mContext == null) {
            return;
        }
        if (Geocoder.isPresent() && !isMissingForegroundPermissions()) {
            tx.e.h(this.mContext).d().h();
            this.mGeocoderPaused = true;
        }
        for (Integer num : this.mLocationCallbacks.keySet()) {
            pauseLocationUpdatesForRequest(num);
        }
    }

    @ExpoMethod
    public void enableNetworkProviderAsync(final Promise promise) {
        if (LocationHelpers.hasNetworkProviderEnabled(this.mContext)) {
            promise.resolve(null);
        } else {
            addPendingLocationRequest(LocationHelpers.prepareLocationRequest(new HashMap()), new LocationActivityResultListener() { // from class: expo.modules.location.c
                @Override // expo.modules.location.LocationActivityResultListener
                public final void onResult(int i11) {
                    LocationModule.b(promise, i11);
                }
            });
        }
    }

    @ExpoMethod
    public void geocodeAsync(String str, final Promise promise) {
        if (this.mGeocoderPaused) {
            promise.reject("E_CANNOT_GEOCODE", "Geocoder is not running.");
        } else if (isMissingForegroundPermissions()) {
            promise.reject(new LocationUnauthorizedException());
        } else if (Geocoder.isPresent()) {
            tx.e.h(this.mContext).d().c(str, new tx.b() { // from class: expo.modules.location.g
                {
                    LocationModule.this = this;
                }

                @Override // tx.b
                public final void a(String str2, List list) {
                    LocationModule.m(LocationModule.this, promise, str2, list);
                }
            });
        } else {
            promise.reject("E_NO_GEOCODER", "Geocoder service is not available for this device.");
        }
    }

    @ExpoMethod
    public void getBackgroundPermissionsAsync(final Promise promise) {
        if (this.mPermissionsManager == null) {
            promise.reject("E_NO_PERMISSIONS", "Permissions module is null. Are you sure all the installed Expo modules are properly linked?");
        } else if (!isBackgroundPermissionInManifest()) {
            promise.reject("ERR_NO_PERMISSIONS", "You need to add `ACCESS_BACKGROUND_LOCATION` to the AndroidManifest.");
        } else if (!shouldAskBackgroundPermissions()) {
            getForegroundPermissionsAsync(promise);
        } else {
            this.mPermissionsManager.getPermissions(new PermissionsResponseListener() { // from class: expo.modules.location.p
                {
                    LocationModule.this = this;
                }

                @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
                public final void onResult(Map map) {
                    LocationModule.h(LocationModule.this, promise, map);
                }
            }, "android.permission.ACCESS_BACKGROUND_LOCATION");
        }
    }

    @ExpoMethod
    public void getCurrentPositionAsync(Map<String, Object> map, final Promise promise) {
        final LocationRequest prepareLocationRequest = LocationHelpers.prepareLocationRequest(map);
        boolean z11 = !map.containsKey(SHOW_USER_SETTINGS_DIALOG_KEY) || ((Boolean) map.get(SHOW_USER_SETTINGS_DIALOG_KEY)).booleanValue();
        if (isMissingForegroundPermissions()) {
            promise.reject(new LocationUnauthorizedException());
        } else if (!LocationHelpers.hasNetworkProviderEnabled(this.mContext) && z11) {
            addPendingLocationRequest(prepareLocationRequest, new LocationActivityResultListener() { // from class: expo.modules.location.e
                @Override // expo.modules.location.LocationActivityResultListener
                public final void onResult(int i11) {
                    LocationModule.p(LocationModule.this, prepareLocationRequest, promise, i11);
                }
            });
        } else {
            LocationHelpers.requestSingleLocation(this, prepareLocationRequest, promise);
        }
    }

    @ExpoMethod
    public void getForegroundPermissionsAsync(final Promise promise) {
        Permissions permissions = this.mPermissionsManager;
        if (permissions == null) {
            promise.reject("E_NO_PERMISSIONS", "Permissions module is null. Are you sure all the installed Expo modules are properly linked?");
        } else {
            permissions.getPermissions(new PermissionsResponseListener() { // from class: expo.modules.location.b
                {
                    LocationModule.this = this;
                }

                @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
                public final void onResult(Map map) {
                    LocationModule.r(LocationModule.this, promise, map);
                }
            }, "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
        }
    }

    @ExpoMethod
    public void getLastKnownPositionAsync(final Map<String, Object> map, final Promise promise) {
        if (isMissingForegroundPermissions()) {
            promise.reject(new LocationUnauthorizedException());
        } else {
            getLastKnownLocation(new OnResultListener() { // from class: expo.modules.location.f
                @Override // expo.modules.location.LocationModule.OnResultListener
                public final void onResult(Location location) {
                    LocationModule.o(map, promise, location);
                }
            });
        }
    }

    @Override // expo.modules.core.ExportedModule
    public String getName() {
        return "ExpoLocation";
    }

    @ExpoMethod
    @Deprecated
    public void getPermissionsAsync(final Promise promise) {
        Permissions permissions = this.mPermissionsManager;
        if (permissions == null) {
            promise.reject("E_NO_PERMISSIONS", "Permissions module is null. Are you sure all the installed Expo modules are properly linked?");
        } else if (Build.VERSION.SDK_INT == 29) {
            permissions.getPermissions(new PermissionsResponseListener() { // from class: expo.modules.location.q
                {
                    LocationModule.this = this;
                }

                @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
                public final void onResult(Map map) {
                    LocationModule.l(LocationModule.this, promise, map);
                }
            }, "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION");
        } else {
            getForegroundPermissionsAsync(promise);
        }
    }

    @ExpoMethod
    public void getProviderStatusAsync(Promise promise) {
        Context context = this.mContext;
        if (context == null) {
            promise.reject("E_CONTEXT_UNAVAILABLE", "Context is not available");
            return;
        }
        by.a e11 = tx.e.h(context).f().e();
        Bundle bundle = new Bundle();
        bundle.putBoolean("locationServicesEnabled", e11.d());
        bundle.putBoolean("gpsAvailable", e11.a());
        bundle.putBoolean("networkAvailable", e11.b());
        bundle.putBoolean("passiveAvailable", e11.c());
        bundle.putBoolean("backgroundModeEnabled", e11.d());
        promise.resolve(bundle);
    }

    @ExpoMethod
    public void hasServicesEnabledAsync(Promise promise) {
        promise.resolve(Boolean.valueOf(LocationHelpers.isAnyProviderAvailable(getContext())));
    }

    @ExpoMethod
    public void hasStartedGeofencingAsync(String str, Promise promise) {
        if (isMissingBackgroundPermissions()) {
            promise.reject(new LocationBackgroundUnauthorizedException());
        } else {
            promise.resolve(Boolean.valueOf(this.mTaskManager.taskHasConsumerOfClass(str, GeofencingTaskConsumer.class)));
        }
    }

    @ExpoMethod
    public void hasStartedLocationUpdatesAsync(String str, Promise promise) {
        promise.resolve(Boolean.valueOf(this.mTaskManager.taskHasConsumerOfClass(str, LocationTaskConsumer.class)));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i11) {
        this.mAccuracy = i11;
    }

    @Override // expo.modules.core.interfaces.ActivityEventListener
    public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
        if (i11 != 42) {
            return;
        }
        executePendingRequests(i12);
        this.mUIManager.unregisterActivityEventListener(this);
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onCreate(ModuleRegistry moduleRegistry) {
        UIManager uIManager = this.mUIManager;
        if (uIManager != null) {
            uIManager.unregisterLifecycleEventListener(this);
        }
        this.mEventEmitter = (EventEmitter) moduleRegistry.getModule(EventEmitter.class);
        this.mUIManager = (UIManager) moduleRegistry.getModule(UIManager.class);
        this.mPermissionsManager = (Permissions) moduleRegistry.getModule(Permissions.class);
        this.mTaskManager = (TaskManagerInterface) moduleRegistry.getModule(TaskManagerInterface.class);
        this.mActivityProvider = (ActivityProvider) moduleRegistry.getModule(ActivityProvider.class);
        UIManager uIManager2 = this.mUIManager;
        if (uIManager2 != null) {
            uIManager2.registerLifecycleEventListener(this);
        }
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostDestroy() {
        stopWatching();
        stopHeadingWatch();
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostPause() {
        stopWatching();
        stopHeadingWatch();
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostResume() {
        startWatching();
        startHeadingUpdate();
    }

    @Override // expo.modules.core.interfaces.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            this.mGravity = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 2) {
            this.mGeomagnetic = sensorEvent.values;
        }
        if (this.mGravity == null || this.mGeomagnetic == null) {
            return;
        }
        sendUpdate();
    }

    @ExpoMethod
    public void removeWatchAsync(int i11, Promise promise) {
        if (isMissingForegroundPermissions()) {
            promise.reject(new LocationUnauthorizedException());
            return;
        }
        if (i11 == this.mHeadingId) {
            destroyHeadingWatch();
        } else {
            removeLocationUpdatesForRequest(Integer.valueOf(i11));
        }
        promise.resolve(null);
    }

    @ExpoMethod
    public void requestBackgroundPermissionsAsync(final Promise promise) {
        if (this.mPermissionsManager == null) {
            promise.reject("E_NO_PERMISSIONS", "Permissions module is null. Are you sure all the installed Expo modules are properly linked?");
        } else if (!isBackgroundPermissionInManifest()) {
            promise.reject("ERR_NO_PERMISSIONS", "You need to add `ACCESS_BACKGROUND_LOCATION` to the AndroidManifest.");
        } else if (!shouldAskBackgroundPermissions()) {
            requestForegroundPermissionsAsync(promise);
        } else {
            this.mPermissionsManager.askForPermissions(new PermissionsResponseListener() { // from class: expo.modules.location.n
                {
                    LocationModule.this = this;
                }

                @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
                public final void onResult(Map map) {
                    LocationModule.f(LocationModule.this, promise, map);
                }
            }, "android.permission.ACCESS_BACKGROUND_LOCATION");
        }
    }

    @ExpoMethod
    public void requestForegroundPermissionsAsync(final Promise promise) {
        Permissions permissions = this.mPermissionsManager;
        if (permissions == null) {
            promise.reject("E_NO_PERMISSIONS", "Permissions module is null. Are you sure all the installed Expo modules are properly linked?");
        } else {
            permissions.askForPermissions(new PermissionsResponseListener() { // from class: expo.modules.location.o
                {
                    LocationModule.this = this;
                }

                @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
                public final void onResult(Map map) {
                    LocationModule.g(LocationModule.this, promise, map);
                }
            }, "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
        }
    }

    public void requestLocationUpdates(LocationRequest locationRequest, Integer num, final LocationRequestCallbacks locationRequestCallbacks) {
        FusedLocationProviderClient locationProvider = getLocationProvider();
        LocationCallback locationCallback = new LocationCallback() { // from class: expo.modules.location.LocationModule.1
            boolean isLocationAvailable = false;

            {
                LocationModule.this = this;
            }

            @Override // com.google.android.gms.location.LocationCallback
            public void onLocationAvailability(LocationAvailability locationAvailability) {
                this.isLocationAvailable = locationAvailability.isLocationAvailable();
            }

            @Override // com.google.android.gms.location.LocationCallback
            public void onLocationResult(LocationResult locationResult) {
                Location lastLocation = locationResult != null ? locationResult.getLastLocation() : null;
                if (lastLocation != null) {
                    locationRequestCallbacks.onLocationChanged(lastLocation);
                } else if (this.isLocationAvailable) {
                } else {
                    locationRequestCallbacks.onLocationError(new LocationUnavailableException());
                }
            }
        };
        if (num != null) {
            this.mLocationCallbacks.put(num, locationCallback);
            this.mLocationRequests.put(num, locationRequest);
        }
        try {
            locationProvider.requestLocationUpdates(locationRequest, locationCallback, Looper.myLooper());
            locationRequestCallbacks.onRequestSuccess();
        } catch (SecurityException e11) {
            locationRequestCallbacks.onRequestFailed(new LocationRequestRejectedException(e11));
        }
    }

    @ExpoMethod
    @Deprecated
    public void requestPermissionsAsync(final Promise promise) {
        Permissions permissions = this.mPermissionsManager;
        if (permissions == null) {
            promise.reject("E_NO_PERMISSIONS", "Permissions module is null. Are you sure all the installed Expo modules are properly linked?");
        } else if (Build.VERSION.SDK_INT == 29) {
            permissions.askForPermissions(new PermissionsResponseListener() { // from class: expo.modules.location.s
                {
                    LocationModule.this = this;
                }

                @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
                public final void onResult(Map map) {
                    LocationModule.q(LocationModule.this, promise, map);
                }
            }, "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION");
        } else {
            requestForegroundPermissionsAsync(promise);
        }
    }

    @ExpoMethod
    public void reverseGeocodeAsync(Map<String, Object> map, final Promise promise) {
        if (this.mGeocoderPaused) {
            promise.reject("E_CANNOT_GEOCODE", "Geocoder is not running.");
        } else if (isMissingForegroundPermissions()) {
            promise.reject(new LocationUnauthorizedException());
        } else {
            Location location = new Location("");
            location.setLatitude(((Double) map.get("latitude")).doubleValue());
            location.setLongitude(((Double) map.get("longitude")).doubleValue());
            if (Geocoder.isPresent()) {
                tx.e.h(this.mContext).d().d(location, new tx.d() { // from class: expo.modules.location.i
                    {
                        LocationModule.this = this;
                    }

                    @Override // tx.d
                    public final void a(Location location2, List list) {
                        LocationModule.d(LocationModule.this, promise, location2, list);
                    }
                });
            } else {
                promise.reject("E_NO_GEOCODER", "Geocoder service is not available for this device.");
            }
        }
    }

    public void sendLocationResponse(int i11, Bundle bundle) {
        bundle.putInt("watchId", i11);
        this.mEventEmitter.emit(LOCATION_EVENT_NAME, bundle);
    }

    @ExpoMethod
    public void startGeofencingAsync(String str, Map<String, Object> map, Promise promise) {
        if (isMissingBackgroundPermissions()) {
            promise.reject(new LocationBackgroundUnauthorizedException());
            return;
        }
        try {
            this.mTaskManager.registerTask(str, GeofencingTaskConsumer.class, map);
            promise.resolve(null);
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    @ExpoMethod
    public void startLocationUpdatesAsync(String str, Map<String, Object> map, Promise promise) {
        if (!LocationTaskConsumer.shouldUseForegroundService(map) && isMissingBackgroundPermissions()) {
            promise.reject(new LocationBackgroundUnauthorizedException());
            return;
        }
        try {
            this.mTaskManager.registerTask(str, LocationTaskConsumer.class, map);
            promise.resolve(null);
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    @ExpoMethod
    public void stopGeofencingAsync(String str, Promise promise) {
        if (isMissingBackgroundPermissions()) {
            promise.reject(new LocationBackgroundUnauthorizedException());
            return;
        }
        try {
            this.mTaskManager.unregisterTask(str, GeofencingTaskConsumer.class);
            promise.resolve(null);
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    @ExpoMethod
    public void stopLocationUpdatesAsync(String str, Promise promise) {
        try {
            this.mTaskManager.unregisterTask(str, LocationTaskConsumer.class);
            promise.resolve(null);
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    @ExpoMethod
    public void watchDeviceHeading(int i11, Promise promise) {
        this.mSensorManager = (SensorManager) this.mContext.getSystemService("sensor");
        this.mHeadingId = i11;
        startHeadingUpdate();
        promise.resolve(null);
    }

    @ExpoMethod
    public void watchPositionImplAsync(final int i11, Map<String, Object> map, final Promise promise) {
        if (isMissingForegroundPermissions()) {
            promise.reject(new LocationUnauthorizedException());
            return;
        }
        final LocationRequest prepareLocationRequest = LocationHelpers.prepareLocationRequest(map);
        boolean z11 = !map.containsKey(SHOW_USER_SETTINGS_DIALOG_KEY) || ((Boolean) map.get(SHOW_USER_SETTINGS_DIALOG_KEY)).booleanValue();
        if (!LocationHelpers.hasNetworkProviderEnabled(this.mContext) && z11) {
            addPendingLocationRequest(prepareLocationRequest, new LocationActivityResultListener() { // from class: expo.modules.location.d
                @Override // expo.modules.location.LocationActivityResultListener
                public final void onResult(int i12) {
                    LocationModule.a(LocationModule.this, prepareLocationRequest, i11, promise, i12);
                }
            });
        } else {
            LocationHelpers.requestContinuousUpdates(this, prepareLocationRequest, i11, promise);
        }
    }
}