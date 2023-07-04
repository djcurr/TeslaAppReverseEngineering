package com.airbnb.android.react.maps;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import com.google.android.gms.maps.model.ButtCap;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.RoundCap;
import com.google.android.gms.maps.model.SquareCap;
import java.util.Map;

/* loaded from: classes.dex */
public class AirMapPolylineManager extends ViewGroupManager<j> {
    private final DisplayMetrics metrics;

    public AirMapPolylineManager(ReactApplicationContext reactApplicationContext) {
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
        return "AIRMapPolyline";
    }

    @ng.a(name = "coordinates")
    public void setCoordinate(j jVar, ReadableArray readableArray) {
        jVar.setCoordinates(readableArray);
    }

    @ng.a(defaultBoolean = false, name = "geodesic")
    public void setGeodesic(j jVar, boolean z11) {
        jVar.setGeodesic(z11);
    }

    @ng.a(name = "lineDashPattern")
    public void setLineDashPattern(j jVar, ReadableArray readableArray) {
        jVar.setLineDashPattern(readableArray);
    }

    @ng.a(customType = "Color", defaultInt = -65536, name = "strokeColor")
    public void setStrokeColor(j jVar, int i11) {
        jVar.setColor(i11);
    }

    @ng.a(defaultFloat = 1.0f, name = "strokeWidth")
    public void setStrokeWidth(j jVar, float f11) {
        jVar.setWidth(this.metrics.density * f11);
    }

    @ng.a(defaultBoolean = false, name = "tappable")
    public void setTappable(j jVar, boolean z11) {
        jVar.setTappable(z11);
    }

    @ng.a(name = "lineCap")
    public void setlineCap(j jVar, String str) {
        Cap squareCap;
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -894674659:
                if (str.equals("square")) {
                    c11 = 0;
                    break;
                }
                break;
            case 3035667:
                if (str.equals("butt")) {
                    c11 = 1;
                    break;
                }
                break;
            case 108704142:
                if (str.equals("round")) {
                    c11 = 2;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                squareCap = new SquareCap();
                break;
            case 1:
                squareCap = new ButtCap();
                break;
            case 2:
                squareCap = new RoundCap();
                break;
            default:
                squareCap = new RoundCap();
                break;
        }
        jVar.setLineCap(squareCap);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public j createViewInstance(n0 n0Var) {
        return new j(n0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @ng.a(defaultFloat = 1.0f, name = "zIndex")
    public void setZIndex(j jVar, float f11) {
        jVar.setZIndex(f11);
    }
}