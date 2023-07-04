package com.airbnb.android.react.maps;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes.dex */
public class AirMapHeatmapManager extends ViewGroupManager<e> {
    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapHeatmap";
    }

    @ng.a(name = "gradient")
    public void setGradient(e eVar, ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray("colors");
        int[] iArr = new int[array.size()];
        for (int i11 = 0; i11 < array.size(); i11++) {
            iArr[i11] = array.getInt(i11);
        }
        ReadableArray array2 = readableMap.getArray("startPoints");
        float[] fArr = new float[array2.size()];
        for (int i12 = 0; i12 < array2.size(); i12++) {
            fArr[i12] = (float) array2.getDouble(i12);
        }
        if (readableMap.hasKey("colorMapSize")) {
            eVar.setGradient(new zn.a(iArr, fArr, readableMap.getInt("colorMapSize")));
        } else {
            eVar.setGradient(new zn.a(iArr, fArr));
        }
    }

    @ng.a(name = "opacity")
    public void setOpacity(e eVar, double d11) {
        eVar.setOpacity(d11);
    }

    @ng.a(name = "points")
    public void setPoints(e eVar, ReadableArray readableArray) {
        zn.c cVar;
        zn.c[] cVarArr = new zn.c[readableArray.size()];
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            ReadableMap map = readableArray.getMap(i11);
            LatLng latLng = new LatLng(map.getDouble("latitude"), map.getDouble("longitude"));
            if (map.hasKey("weight")) {
                cVar = new zn.c(latLng, map.getDouble("weight"));
            } else {
                cVar = new zn.c(latLng);
            }
            cVarArr[i11] = cVar;
        }
        eVar.setPoints(cVarArr);
    }

    @ng.a(name = "radius")
    public void setRadius(e eVar, int i11) {
        eVar.setRadius(i11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public e createViewInstance(n0 n0Var) {
        return new e(n0Var);
    }
}