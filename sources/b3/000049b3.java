package com.reactnativestripesdk;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0007J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¨\u0006\u0014"}, d2 = {"Lcom/reactnativestripesdk/AuBECSDebitFormViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/reactnativestripesdk/a;", "", "getName", "", "", "getExportedCustomDirectEventTypeConstants", "view", "name", "Lvz/b0;", "setCompanyName", "Lcom/facebook/react/bridge/ReadableMap;", "style", "setFormStyle", "Lcom/facebook/react/uimanager/n0;", "reactContext", "createViewInstance", "<init>", "()V", "stripe_stripe-react-native_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class AuBECSDebitFormViewManager extends SimpleViewManager<a> {
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> d11 = yf.c.d("onCompleteAction", yf.c.d("registrationName", "onCompleteAction"));
        kotlin.jvm.internal.s.f(d11, "of(\n      FormCompleteEv…me\", \"onCompleteAction\"))");
        return d11;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AuBECSDebitForm";
    }

    @ng.a(name = "companyName")
    public final void setCompanyName(a view, String str) {
        kotlin.jvm.internal.s.g(view, "view");
        view.setCompanyName(str);
    }

    @ng.a(name = "formStyle")
    public final void setFormStyle(a view, ReadableMap style) {
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(style, "style");
        view.setFormStyle(style);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(com.facebook.react.uimanager.n0 reactContext) {
        kotlin.jvm.internal.s.g(reactContext, "reactContext");
        return new a(reactContext);
    }
}