package com.airbnb.android.react.maps;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class AirMapWMSTileManager extends ViewGroupManager<m> {
    private DisplayMetrics metrics;

    public AirMapWMSTileManager(ReactApplicationContext reactApplicationContext) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.metrics = new DisplayMetrics();
            ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(this.metrics);
            return;
        }
        this.metrics = reactApplicationContext.getResources().getDisplayMetrics();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapWMSTile";
    }

    @ng.a(defaultFloat = 100.0f, name = "maximumZ")
    public void setMaximumZ(m mVar, float f11) {
        mVar.setMaximumZ(f11);
    }

    @ng.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "minimumZ")
    public void setMinimumZ(m mVar, float f11) {
        mVar.setMinimumZ(f11);
    }

    @ng.a(defaultInt = 512, name = "tileSize")
    public void setTileSize(m mVar, int i11) {
        mVar.setTileSize(i11);
    }

    @ng.a(name = "urlTemplate")
    public void setUrlTemplate(m mVar, String str) {
        mVar.setUrlTemplate(str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public m createViewInstance(n0 n0Var) {
        return new m(n0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @ng.a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(m mVar, float f11) {
        mVar.setOpacity(f11);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @ng.a(defaultFloat = -1.0f, name = "zIndex")
    public void setZIndex(m mVar, float f11) {
        mVar.setZIndex(f11);
    }
}