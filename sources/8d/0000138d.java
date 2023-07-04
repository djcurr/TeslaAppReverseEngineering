package com.airbnb.android.react.maps;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.n0;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AirMapManager extends ViewGroupManager<l> {
    private static final int ANIMATE_CAMERA = 12;
    private static final int ANIMATE_TO_BEARING = 4;
    private static final int ANIMATE_TO_COORDINATE = 2;
    private static final int ANIMATE_TO_NAVIGATION = 9;
    private static final int ANIMATE_TO_REGION = 1;
    private static final int ANIMATE_TO_VIEWING_ANGLE = 3;
    private static final int FIT_TO_COORDINATES = 7;
    private static final int FIT_TO_ELEMENTS = 5;
    private static final int FIT_TO_SUPPLIED_MARKERS = 6;
    private static final String REACT_CLASS = "AIRMap";
    private static final int SET_CAMERA = 11;
    private static final int SET_INDOOR_ACTIVE_LEVEL_INDEX = 10;
    private static final int SET_MAP_BOUNDARIES = 8;
    private final ReactApplicationContext appContext;
    private AirMapMarkerManager markerManager;
    private final Map<String, Integer> MAP_TYPES = yf.c.h("standard", 1, "satellite", 2, "hybrid", 4, "terrain", 3, PermissionsResponse.SCOPE_NONE, 0);
    private final Map<String, Integer> MY_LOCATION_PRIORITY = yf.c.g("balanced", 102, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH, 100, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_LOW, 104, "passive", 105);
    protected GoogleMapOptions googleMapOptions = new GoogleMapOptions();

    public AirMapManager(ReactApplicationContext reactApplicationContext) {
        this.appContext = reactApplicationContext;
    }

    public static <K, V> Map<K, V> CreateMap(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19, K k21, V v21) {
        HashMap hashMap = new HashMap();
        hashMap.put(k11, v11);
        hashMap.put(k12, v12);
        hashMap.put(k13, v13);
        hashMap.put(k14, v14);
        hashMap.put(k15, v15);
        hashMap.put(k16, v16);
        hashMap.put(k17, v17);
        hashMap.put(k18, v18);
        hashMap.put(k19, v19);
        hashMap.put(k21, v21);
        return hashMap;
    }

    private void emitMapError(n0 n0Var, String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", str);
        createMap.putString("type", str2);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) n0Var.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onError", createMap);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        Map<String, Integer> CreateMap = CreateMap("setCamera", 11, "animateCamera", 12, "animateToRegion", 1, "animateToCoordinate", 2, "animateToViewingAngle", 3, "animateToBearing", 4, "fitToElements", 5, "fitToSuppliedMarkers", 6, "fitToCoordinates", 7, "animateToNavigation", 9);
        CreateMap.putAll(yf.c.e("setMapBoundaries", 8, "setIndoorActiveLevelIndex", 10));
        return CreateMap;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map i11 = yf.c.i("onMapReady", yf.c.d("registrationName", "onMapReady"), "onPress", yf.c.d("registrationName", "onPress"), "onLongPress", yf.c.d("registrationName", "onLongPress"), "onMarkerPress", yf.c.d("registrationName", "onMarkerPress"), "onMarkerSelect", yf.c.d("registrationName", "onMarkerSelect"), "onMarkerDeselect", yf.c.d("registrationName", "onMarkerDeselect"), "onCalloutPress", yf.c.d("registrationName", "onCalloutPress"));
        i11.putAll(yf.c.i("onUserLocationChange", yf.c.d("registrationName", "onUserLocationChange"), "onMarkerDragStart", yf.c.d("registrationName", "onMarkerDragStart"), "onMarkerDrag", yf.c.d("registrationName", "onMarkerDrag"), "onMarkerDragEnd", yf.c.d("registrationName", "onMarkerDragEnd"), "onPanDrag", yf.c.d("registrationName", "onPanDrag"), "onKmlReady", yf.c.d("registrationName", "onKmlReady"), "onPoiClick", yf.c.d("registrationName", "onPoiClick")));
        i11.putAll(yf.c.g("onIndoorLevelActivated", yf.c.d("registrationName", "onIndoorLevelActivated"), "onIndoorBuildingFocused", yf.c.d("registrationName", "onIndoorBuildingFocused"), "onDoublePress", yf.c.d("registrationName", "onDoublePress"), "onMapLoaded", yf.c.d("registrationName", "onMapLoaded")));
        return i11;
    }

    public AirMapMarkerManager getMarkerManager() {
        return this.markerManager;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void pushEvent(n0 n0Var, View view, String str, WritableMap writableMap) {
        ((RCTEventEmitter) n0Var.getJSModule(RCTEventEmitter.class)).receiveEvent(view.getId(), str, writableMap);
    }

    @ng.a(defaultBoolean = false, name = "cacheEnabled")
    public void setCacheEnabled(l lVar, boolean z11) {
        lVar.setCacheEnabled(z11);
    }

    @ng.a(name = "camera")
    public void setCamera(l lVar, ReadableMap readableMap) {
        lVar.setCamera(readableMap);
    }

    @ng.a(defaultBoolean = false, name = "handlePanDrag")
    public void setHandlePanDrag(l lVar, boolean z11) {
        lVar.setHandlePanDrag(z11);
    }

    @ng.a(name = "initialCamera")
    public void setInitialCamera(l lVar, ReadableMap readableMap) {
        lVar.setInitialCamera(readableMap);
    }

    @ng.a(name = "initialRegion")
    public void setInitialRegion(l lVar, ReadableMap readableMap) {
        lVar.setInitialRegion(readableMap);
    }

    @ng.a(name = "kmlSrc")
    public void setKmlSrc(l lVar, String str) {
        if (str != null) {
            lVar.setKmlSrc(str);
        }
    }

    @ng.a(customType = "Color", name = "loadingBackgroundColor")
    public void setLoadingBackgroundColor(l lVar, Integer num) {
        lVar.setLoadingBackgroundColor(num);
    }

    @ng.a(defaultBoolean = false, name = "loadingEnabled")
    public void setLoadingEnabled(l lVar, boolean z11) {
        lVar.H(z11);
    }

    @ng.a(customType = "Color", name = "loadingIndicatorColor")
    public void setLoadingIndicatorColor(l lVar, Integer num) {
        lVar.setLoadingIndicatorColor(num);
    }

    @ng.a(name = "mapPadding")
    public void setMapPadding(l lVar, ReadableMap readableMap) {
        int i11;
        int i12;
        int i13;
        double d11 = lVar.getResources().getDisplayMetrics().density;
        if (readableMap != null) {
            int i14 = readableMap.hasKey("left") ? (int) (readableMap.getDouble("left") * d11) : 0;
            i12 = readableMap.hasKey("top") ? (int) (readableMap.getDouble("top") * d11) : 0;
            i13 = readableMap.hasKey("right") ? (int) (readableMap.getDouble("right") * d11) : 0;
            i11 = readableMap.hasKey("bottom") ? (int) (readableMap.getDouble("bottom") * d11) : 0;
            r2 = i14;
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        lVar.D(r2, i12, i13, i11);
        lVar.f9870a.setPadding(r2, i12, i13, i11);
    }

    @ng.a(name = "customMapStyleString")
    public void setMapStyle(l lVar, String str) {
        lVar.f9870a.setMapStyle(new MapStyleOptions(str));
    }

    @ng.a(name = "mapType")
    public void setMapType(l lVar, String str) {
        lVar.f9870a.setMapType(this.MAP_TYPES.get(str).intValue());
    }

    public void setMarkerManager(AirMapMarkerManager airMapMarkerManager) {
        this.markerManager = airMapMarkerManager;
    }

    @ng.a(name = "maxZoomLevel")
    public void setMaxZoomLevel(l lVar, float f11) {
        lVar.f9870a.setMaxZoomPreference(f11);
    }

    @ng.a(name = "minZoomLevel")
    public void setMinZoomLevel(l lVar, float f11) {
        lVar.f9870a.setMinZoomPreference(f11);
    }

    @ng.a(defaultBoolean = true, name = "moveOnMarkerPress")
    public void setMoveOnMarkerPress(l lVar, boolean z11) {
        lVar.setMoveOnMarkerPress(z11);
    }

    @ng.a(defaultBoolean = false, name = "pitchEnabled")
    public void setPitchEnabled(l lVar, boolean z11) {
        lVar.f9870a.getUiSettings().setTiltGesturesEnabled(z11);
    }

    @ng.a(name = "region")
    public void setRegion(l lVar, ReadableMap readableMap) {
        lVar.setRegion(readableMap);
    }

    @ng.a(defaultBoolean = false, name = "rotateEnabled")
    public void setRotateEnabled(l lVar, boolean z11) {
        lVar.f9870a.getUiSettings().setRotateGesturesEnabled(z11);
    }

    @ng.a(defaultBoolean = true, name = "scrollDuringRotateOrZoomEnabled")
    public void setScrollDuringRotateOrZoomEnabled(l lVar, boolean z11) {
        lVar.f9870a.getUiSettings().setScrollGesturesEnabledDuringRotateOrZoom(z11);
    }

    @ng.a(defaultBoolean = false, name = "scrollEnabled")
    public void setScrollEnabled(l lVar, boolean z11) {
        lVar.f9870a.getUiSettings().setScrollGesturesEnabled(z11);
    }

    @ng.a(defaultBoolean = false, name = "showsBuildings")
    public void setShowBuildings(l lVar, boolean z11) {
        lVar.f9870a.setBuildingsEnabled(z11);
    }

    @ng.a(defaultBoolean = false, name = "showsIndoors")
    public void setShowIndoors(l lVar, boolean z11) {
        lVar.f9870a.setIndoorEnabled(z11);
    }

    @ng.a(defaultBoolean = false, name = "showsTraffic")
    public void setShowTraffic(l lVar, boolean z11) {
        lVar.f9870a.setTrafficEnabled(z11);
    }

    @ng.a(defaultBoolean = false, name = "showsCompass")
    public void setShowsCompass(l lVar, boolean z11) {
        lVar.f9870a.getUiSettings().setCompassEnabled(z11);
    }

    @ng.a(defaultBoolean = false, name = "showsIndoorLevelPicker")
    public void setShowsIndoorLevelPicker(l lVar, boolean z11) {
        lVar.f9870a.getUiSettings().setIndoorLevelPickerEnabled(z11);
    }

    @ng.a(defaultBoolean = true, name = "showsMyLocationButton")
    public void setShowsMyLocationButton(l lVar, boolean z11) {
        lVar.setShowsMyLocationButton(z11);
    }

    @ng.a(defaultBoolean = false, name = "showsUserLocation")
    public void setShowsUserLocation(l lVar, boolean z11) {
        lVar.setShowsUserLocation(z11);
    }

    @ng.a(defaultBoolean = true, name = "toolbarEnabled")
    public void setToolbarEnabled(l lVar, boolean z11) {
        lVar.setToolbarEnabled(z11);
    }

    @ng.a(defaultInt = 5000, name = "userLocationFastestInterval")
    public void setUserLocationFastestInterval(l lVar, int i11) {
        lVar.setUserLocationFastestInterval(i11);
    }

    @ng.a(name = "userLocationPriority")
    public void setUserLocationPriority(l lVar, String str) {
        lVar.setUserLocationPriority(this.MY_LOCATION_PRIORITY.get(str).intValue());
    }

    @ng.a(defaultInt = 5000, name = "userLocationUpdateInterval")
    public void setUserLocationUpdateInterval(l lVar, int i11) {
        lVar.setUserLocationUpdateInterval(i11);
    }

    @ng.a(defaultBoolean = true, name = "zoomControlEnabled")
    public void setZoomControlEnabled(l lVar, boolean z11) {
        lVar.f9870a.getUiSettings().setZoomControlsEnabled(z11);
    }

    @ng.a(defaultBoolean = false, name = "zoomEnabled")
    public void setZoomEnabled(l lVar, boolean z11) {
        lVar.f9870a.getUiSettings().setZoomGesturesEnabled(z11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(l lVar, View view, int i11) {
        lVar.v(view, i11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public com.facebook.react.uimanager.i createShadowNodeInstance() {
        return new u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public l createViewInstance(n0 n0Var) {
        return new l(n0Var, this.appContext, this, this.googleMapOptions);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(l lVar, int i11) {
        return lVar.L(i11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(l lVar) {
        return lVar.getFeatureCount();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(l lVar) {
        lVar.G();
        super.onDropViewInstance((AirMapManager) lVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(l lVar, int i11, ReadableArray readableArray) {
        switch (i11) {
            case 1:
                ReadableMap map = readableArray.getMap(0);
                Integer valueOf = Integer.valueOf(readableArray.getInt(1));
                Double valueOf2 = Double.valueOf(map.getDouble("longitude"));
                Double valueOf3 = Double.valueOf(map.getDouble("latitude"));
                Double valueOf4 = Double.valueOf(map.getDouble("longitudeDelta"));
                Double valueOf5 = Double.valueOf(map.getDouble("latitudeDelta"));
                lVar.A(new LatLngBounds(new LatLng(valueOf3.doubleValue() - (valueOf5.doubleValue() / 2.0d), valueOf2.doubleValue() - (valueOf4.doubleValue() / 2.0d)), new LatLng(valueOf3.doubleValue() + (valueOf5.doubleValue() / 2.0d), valueOf2.doubleValue() + (valueOf4.doubleValue() / 2.0d))), valueOf.intValue());
                return;
            case 2:
                ReadableMap map2 = readableArray.getMap(0);
                Integer valueOf6 = Integer.valueOf(readableArray.getInt(1));
                lVar.y(new LatLng(Double.valueOf(map2.getDouble("latitude")).doubleValue(), Double.valueOf(map2.getDouble("longitude")).doubleValue()), valueOf6.intValue());
                return;
            case 3:
                lVar.B((float) readableArray.getDouble(0), Integer.valueOf(readableArray.getInt(1)).intValue());
                return;
            case 4:
                lVar.w((float) readableArray.getDouble(0), Integer.valueOf(readableArray.getInt(1)).intValue());
                return;
            case 5:
                lVar.J(readableArray.getMap(0), readableArray.getBoolean(1));
                return;
            case 6:
                lVar.K(readableArray.getArray(0), readableArray.getMap(1), readableArray.getBoolean(2));
                return;
            case 7:
                lVar.I(readableArray.getArray(0), readableArray.getMap(1), readableArray.getBoolean(2));
                return;
            case 8:
                lVar.W(readableArray.getMap(0), readableArray.getMap(1));
                return;
            case 9:
                ReadableMap map3 = readableArray.getMap(0);
                lVar.z(new LatLng(Double.valueOf(map3.getDouble("latitude")).doubleValue(), Double.valueOf(map3.getDouble("longitude")).doubleValue()), (float) readableArray.getDouble(1), (float) readableArray.getDouble(2), Integer.valueOf(readableArray.getInt(3)).intValue());
                return;
            case 10:
                lVar.setIndoorActiveLevelIndex(readableArray.getInt(0));
                return;
            case 11:
                lVar.x(readableArray.getMap(0), 0);
                return;
            case 12:
                lVar.x(readableArray.getMap(0), Integer.valueOf(readableArray.getInt(1)).intValue());
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(l lVar, int i11) {
        lVar.T(i11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(l lVar, Object obj) {
        lVar.X(obj);
    }
}