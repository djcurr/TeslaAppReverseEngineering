package com.airbnb.android.react.maps;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import java.util.Map;

/* loaded from: classes.dex */
public class AirMapPolygonManager extends ViewGroupManager<i> {
    private final DisplayMetrics metrics;

    public AirMapPolygonManager(ReactApplicationContext reactApplicationContext) {
        if (Build.VERSION.SDK_INT >= 17) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.metrics = displayMetrics;
            ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            return;
        }
        this.metrics = reactApplicationContext.getResources().getDisplayMetrics();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return yf.c.d("onPress", yf.c.d("registrationName", "onPress"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapPolygon";
    }

    @ng.a(name = "coordinates")
    public void setCoordinate(i iVar, ReadableArray readableArray) {
        iVar.setCoordinates(readableArray);
    }

    @ng.a(customType = "Color", defaultInt = -65536, name = "fillColor")
    public void setFillColor(i iVar, int i11) {
        iVar.setFillColor(i11);
    }

    @ng.a(defaultBoolean = false, name = "geodesic")
    public void setGeodesic(i iVar, boolean z11) {
        iVar.setGeodesic(z11);
    }

    @ng.a(name = "holes")
    public void setHoles(i iVar, ReadableArray readableArray) {
        iVar.setHoles(readableArray);
    }

    @ng.a(customType = "Color", defaultInt = -65536, name = "strokeColor")
    public void setStrokeColor(i iVar, int i11) {
        iVar.setStrokeColor(i11);
    }

    @ng.a(defaultFloat = 1.0f, name = "strokeWidth")
    public void setStrokeWidth(i iVar, float f11) {
        iVar.setStrokeWidth(this.metrics.density * f11);
    }

    @ng.a(defaultBoolean = false, name = "tappable")
    public void setTappable(i iVar, boolean z11) {
        iVar.setTappable(z11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public i createViewInstance(n0 n0Var) {
        return new i(n0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @ng.a(defaultFloat = 1.0f, name = "zIndex")
    public void setZIndex(i iVar, float f11) {
        iVar.setZIndex(f11);
    }
}