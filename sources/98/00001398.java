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
public class AirMapOverlayManager extends ViewGroupManager<h> {
    private final DisplayMetrics metrics;

    public AirMapOverlayManager(ReactApplicationContext reactApplicationContext) {
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
        return "AIRMapOverlay";
    }

    @ng.a(name = "bearing")
    public void setBearing(h hVar, float f11) {
        hVar.setBearing(f11);
    }

    @ng.a(name = "bounds")
    public void setBounds(h hVar, ReadableArray readableArray) {
        hVar.setBounds(readableArray);
    }

    @ng.a(name = "image")
    public void setImage(h hVar, String str) {
        hVar.setImage(str);
    }

    @ng.a(defaultBoolean = false, name = "tappable")
    public void setTappable(h hVar, boolean z11) {
        hVar.setTappable(z11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public h createViewInstance(n0 n0Var) {
        return new h(n0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @ng.a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(h hVar, float f11) {
        hVar.setTransparency(1.0f - f11);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @ng.a(defaultFloat = 1.0f, name = "zIndex")
    public void setZIndex(h hVar, float f11) {
        hVar.setZIndex(f11);
    }
}