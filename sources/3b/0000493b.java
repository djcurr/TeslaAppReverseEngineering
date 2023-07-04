package com.reactlibrary;

import android.util.Log;
import androidx.fragment.app.h;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import java.util.Map;

/* loaded from: classes2.dex */
public class BacsViewManager extends ViewGroupManager<d> {
    public static final String REACT_CLASS = "BacsViewManager";

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        return yf.c.a().b("topChange", yf.c.d("phasedRegistrationNames", yf.c.d("bubbled", "onChange"))).b("topError", yf.c.d("phasedRegistrationNames", yf.c.d("bubbled", "onError"))).a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return yf.c.a().b("onConfirm", yf.c.d("registrationName", "onConfirm")).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ng.a(name = "params")
    public void setParams(d dVar, ReadableArray readableArray) {
        dVar.j(readableArray.getString(0), readableArray.getString(1), readableArray.getString(2), readableArray.getString(3), readableArray.getString(4), Integer.valueOf(readableArray.getInt(5)));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public d createViewInstance(n0 n0Var) {
        return new d(n0Var, (h) n0Var.getCurrentActivity());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(d dVar) {
        Log.d("BACS", "Dropping BacsView");
        dVar.q();
    }
}