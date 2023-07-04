package expo.modules.core.interfaces;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.r;

/* loaded from: classes5.dex */
public interface ReactNativeHostHandler {
    default r createReactInstanceManager(boolean z11) {
        return null;
    }

    default String getBundleAssetName(boolean z11) {
        return null;
    }

    default Object getDevSupportManagerFactory() {
        return null;
    }

    default String getJSBundleFile(boolean z11) {
        return null;
    }

    default JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        return null;
    }

    default Boolean getUseDeveloperSupport() {
        return null;
    }

    default void onDidCreateReactInstanceManager(r rVar, boolean z11) {
    }

    default void onRegisterJSIModules(ReactApplicationContext reactApplicationContext, JavaScriptContextHolder javaScriptContextHolder, boolean z11) {
    }

    default void onWillCreateReactInstanceManager(boolean z11) {
    }
}