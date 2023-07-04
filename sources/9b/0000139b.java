package com.airbnb.android.react.maps;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class AirMapUrlTileManager extends ViewGroupManager<k> {
    private DisplayMetrics metrics;

    public AirMapUrlTileManager(ReactApplicationContext reactApplicationContext) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.metrics = new DisplayMetrics();
            ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(this.metrics);
            return;
        }
        this.metrics = reactApplicationContext.getResources().getDisplayMetrics();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapUrlTile";
    }

    @ng.a(defaultBoolean = false, name = "flipY")
    public void setFlipY(k kVar, boolean z11) {
        kVar.setFlipY(z11);
    }

    @ng.a(defaultFloat = 100.0f, name = "maximumZ")
    public void setMaximumZ(k kVar, float f11) {
        kVar.setMaximumZ(f11);
    }

    @ng.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "minimumZ")
    public void setMinimumZ(k kVar, float f11) {
        kVar.setMinimumZ(f11);
    }

    @ng.a(name = "urlTemplate")
    public void setUrlTemplate(k kVar, String str) {
        kVar.setUrlTemplate(str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public k createViewInstance(n0 n0Var) {
        return new k(n0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @ng.a(defaultFloat = -1.0f, name = "zIndex")
    public void setZIndex(k kVar, float f11) {
        kVar.setZIndex(f11);
    }
}