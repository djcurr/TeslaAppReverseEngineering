package fr;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.v;
import com.reactnativemodpow.ModpowModule;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.s;
import wz.w;

/* loaded from: classes2.dex */
public final class a implements v {
    @Override // com.facebook.react.v
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        s.g(reactContext, "reactContext");
        List<NativeModule> asList = Arrays.asList(new ModpowModule(reactContext));
        s.f(asList, "asList<NativeModule>(ModpowModule(reactContext))");
        return asList;
    }

    @Override // com.facebook.react.v
    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactContext) {
        List<ViewManager<?, ?>> i11;
        s.g(reactContext, "reactContext");
        i11 = w.i();
        return i11;
    }
}