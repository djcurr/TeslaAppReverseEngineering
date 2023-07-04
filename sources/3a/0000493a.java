package com.reactlibrary;

import android.util.Log;
import androidx.fragment.app.h;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import java.util.Map;

/* loaded from: classes2.dex */
public class BacsMandateViewManager extends ViewGroupManager<a> {
    public static final String REACT_CLASS = "BacsMandateViewManager";

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        return yf.c.a().b("topChange", yf.c.d("phasedRegistrationNames", yf.c.d("bubbled", "onChange"))).b("topError", yf.c.d("phasedRegistrationNames", yf.c.d("bubbled", "onError"))).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ng.a(name = "params")
    public void setParams(a aVar, ReadableArray readableArray) {
        aVar.a(readableArray.getString(0), readableArray.getString(1), readableArray.getString(2));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(n0 n0Var) {
        return new a(n0Var, (h) n0Var.getCurrentActivity());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(a aVar) {
        Log.d("BACS", "Dropping BacsMandateView");
        aVar.c();
    }
}