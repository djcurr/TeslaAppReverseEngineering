package com.airbnb.android.react.maps;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class AirMapGradientPolylineManager extends ViewGroupManager<d> {
    private final DisplayMetrics metrics;

    public AirMapGradientPolylineManager(ReactApplicationContext reactApplicationContext) {
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
        return "AIRMapGradientPolyline";
    }

    @ng.a(name = "coordinates")
    public void setCoordinates(d dVar, ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            ReadableMap map = readableArray.getMap(i11);
            arrayList.add(new LatLng(map.getDouble("latitude"), map.getDouble("longitude")));
        }
        dVar.setCoordinates(arrayList);
    }

    @ng.a(customType = "ColorArray", name = "strokeColors")
    public void setStrokeColors(d dVar, ReadableArray readableArray) {
        if (readableArray != null) {
            if (readableArray.size() == 0) {
                dVar.setStrokeColors(new int[]{0, 0});
                return;
            }
            if (readableArray.size() == 1) {
                dVar.setStrokeColors(new int[]{readableArray.getInt(0), readableArray.getInt(0)});
                return;
            }
            int[] iArr = new int[readableArray.size()];
            for (int i11 = 0; i11 < readableArray.size(); i11++) {
                iArr[i11] = readableArray.getInt(i11);
            }
            dVar.setStrokeColors(iArr);
            return;
        }
        dVar.setStrokeColors(new int[]{0, 0});
    }

    @ng.a(defaultFloat = 1.0f, name = "strokeWidth")
    public void setStrokeWidth(d dVar, float f11) {
        dVar.setWidth(this.metrics.density * f11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public d createViewInstance(n0 n0Var) {
        return new d(n0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @ng.a(defaultFloat = 1.0f, name = "zIndex")
    public void setZIndex(d dVar, float f11) {
        dVar.setZIndex(f11);
    }
}