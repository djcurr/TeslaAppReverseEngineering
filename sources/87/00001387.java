package com.airbnb.android.react.maps;

import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Map;

/* loaded from: classes.dex */
public class AirMapCalloutManager extends ViewGroupManager<a> {
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return yf.c.d("onPress", yf.c.d("registrationName", "onPress"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapCallout";
    }

    @ng.a(defaultBoolean = false, name = "tooltip")
    public void setTooltip(a aVar, boolean z11) {
        aVar.setTooltip(z11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public com.facebook.react.uimanager.i createShadowNodeInstance() {
        return new u();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(n0 n0Var) {
        return new a(n0Var);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(a aVar, Object obj) {
        Map map = (Map) obj;
        float floatValue = ((Float) map.get(Snapshot.WIDTH)).floatValue();
        float floatValue2 = ((Float) map.get(Snapshot.HEIGHT)).floatValue();
        aVar.f9760b = (int) floatValue;
        aVar.f9761c = (int) floatValue2;
    }
}