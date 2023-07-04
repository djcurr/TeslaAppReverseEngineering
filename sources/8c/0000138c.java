package com.airbnb.android.react.maps;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;

/* loaded from: classes.dex */
public class AirMapLocalTileManager extends ViewGroupManager<f> {
    private DisplayMetrics metrics;

    public AirMapLocalTileManager(ReactApplicationContext reactApplicationContext) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.metrics = new DisplayMetrics();
            ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(this.metrics);
            return;
        }
        this.metrics = reactApplicationContext.getResources().getDisplayMetrics();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapLocalTile";
    }

    @ng.a(name = "pathTemplate")
    public void setPathTemplate(f fVar, String str) {
        fVar.setPathTemplate(str);
    }

    @ng.a(defaultFloat = 256.0f, name = "tileSize")
    public void setTileSize(f fVar, float f11) {
        fVar.setTileSize(f11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public f createViewInstance(n0 n0Var) {
        return new f(n0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @ng.a(defaultFloat = -1.0f, name = "zIndex")
    public void setZIndex(f fVar, float f11) {
        fVar.setZIndex(f11);
    }
}