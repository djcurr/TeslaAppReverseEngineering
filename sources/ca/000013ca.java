package com.airbnb.android.react.maps;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class s implements com.facebook.react.v {
    @Override // com.facebook.react.v
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new AirMapModule(reactApplicationContext));
    }

    @Override // com.facebook.react.v
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        AirMapCalloutManager airMapCalloutManager = new AirMapCalloutManager();
        AirMapMarkerManager airMapMarkerManager = new AirMapMarkerManager();
        AirMapPolylineManager airMapPolylineManager = new AirMapPolylineManager(reactApplicationContext);
        AirMapGradientPolylineManager airMapGradientPolylineManager = new AirMapGradientPolylineManager(reactApplicationContext);
        AirMapPolygonManager airMapPolygonManager = new AirMapPolygonManager(reactApplicationContext);
        AirMapCircleManager airMapCircleManager = new AirMapCircleManager(reactApplicationContext);
        AirMapManager airMapManager = new AirMapManager(reactApplicationContext);
        AirMapLiteManager airMapLiteManager = new AirMapLiteManager(reactApplicationContext);
        AirMapUrlTileManager airMapUrlTileManager = new AirMapUrlTileManager(reactApplicationContext);
        AirMapWMSTileManager airMapWMSTileManager = new AirMapWMSTileManager(reactApplicationContext);
        AirMapLocalTileManager airMapLocalTileManager = new AirMapLocalTileManager(reactApplicationContext);
        AirMapOverlayManager airMapOverlayManager = new AirMapOverlayManager(reactApplicationContext);
        AirMapHeatmapManager airMapHeatmapManager = new AirMapHeatmapManager();
        airMapManager.setMarkerManager(airMapMarkerManager);
        return Arrays.asList(airMapCalloutManager, airMapMarkerManager, airMapPolylineManager, airMapGradientPolylineManager, airMapPolygonManager, airMapCircleManager, airMapManager, airMapLiteManager, airMapUrlTileManager, airMapWMSTileManager, airMapLocalTileManager, airMapOverlayManager, airMapHeatmapManager);
    }
}