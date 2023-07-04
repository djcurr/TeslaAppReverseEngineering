package com.airbnb.android.react.maps;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes.dex */
public class AirMapCircleManager extends ViewGroupManager<b> {
    private final DisplayMetrics metrics;

    public AirMapCircleManager(ReactApplicationContext reactApplicationContext) {
        if (Build.VERSION.SDK_INT >= 17) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.metrics = displayMetrics;
            ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            return;
        }
        this.metrics = reactApplicationContext.getResources().getDisplayMetrics();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapCircle";
    }

    @ng.a(name = "center")
    public void setCenter(b bVar, ReadableMap readableMap) {
        bVar.setCenter(new LatLng(readableMap.getDouble("latitude"), readableMap.getDouble("longitude")));
    }

    @ng.a(customType = "Color", defaultInt = -65536, name = "fillColor")
    public void setFillColor(b bVar, int i11) {
        bVar.setFillColor(i11);
    }

    @ng.a(defaultDouble = 0.0d, name = "radius")
    public void setRadius(b bVar, double d11) {
        bVar.setRadius(d11);
    }

    @ng.a(customType = "Color", defaultInt = -65536, name = "strokeColor")
    public void setStrokeColor(b bVar, int i11) {
        bVar.setStrokeColor(i11);
    }

    @ng.a(defaultFloat = 1.0f, name = "strokeWidth")
    public void setStrokeWidth(b bVar, float f11) {
        bVar.setStrokeWidth(this.metrics.density * f11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(n0 n0Var) {
        return new b(n0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @ng.a(defaultFloat = 1.0f, name = "zIndex")
    public void setZIndex(b bVar, float f11) {
        bVar.setZIndex(f11);
    }
}