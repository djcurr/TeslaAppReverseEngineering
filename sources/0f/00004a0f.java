package com.reactnativestripesdk;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.reactnativestripesdk.pushprovisioning.AddToWalletButtonManager;
import java.util.List;

/* loaded from: classes2.dex */
public final class r0 implements com.facebook.react.v {
    @Override // com.facebook.react.v
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> d11;
        kotlin.jvm.internal.s.g(reactContext, "reactContext");
        d11 = wz.v.d(new StripeSdkModule(reactContext));
        return d11;
    }

    @Override // com.facebook.react.v
    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactContext) {
        List<ViewManager<?, ?>> l11;
        kotlin.jvm.internal.s.g(reactContext, "reactContext");
        l11 = wz.w.l(new CardFieldViewManager(), new AuBECSDebitFormViewManager(), new StripeContainerManager(), new CardFormViewManager(), new GooglePayButtonManager(), new AddToWalletButtonManager(reactContext));
        return l11;
    }
}