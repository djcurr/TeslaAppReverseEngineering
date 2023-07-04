package com.facebook.react.uimanager;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.EditText;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;

/* loaded from: classes3.dex */
public class t0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12409a = "com.facebook.react.uimanager.t0";

    public static float[] a(n0 n0Var) {
        EditText editText = new EditText(n0Var);
        return new float[]{p.a(androidx.core.view.a0.K(editText)), p.a(androidx.core.view.a0.J(editText)), p.a(editText.getPaddingTop()), p.a(editText.getPaddingBottom())};
    }

    public static com.facebook.react.uimanager.events.d b(ReactContext reactContext, int i11) {
        if (reactContext.isBridgeless()) {
            if (reactContext instanceof n0) {
                reactContext = ((n0) reactContext).b();
            }
            return ((com.facebook.react.uimanager.events.g) reactContext).getEventDispatcher();
        }
        UIManager h11 = h(reactContext, i11, false);
        if (h11 == null) {
            String str = f12409a;
            ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Unable to find UIManager for UIManagerType " + i11));
            return null;
        }
        com.facebook.react.uimanager.events.d dVar = (com.facebook.react.uimanager.events.d) h11.getEventDispatcher();
        if (dVar == null) {
            String str2 = f12409a;
            ReactSoftExceptionLogger.logSoftException(str2, new IllegalStateException("Cannot get EventDispatcher for UIManagerType " + i11));
        }
        return dVar;
    }

    public static com.facebook.react.uimanager.events.d c(ReactContext reactContext, int i11) {
        com.facebook.react.uimanager.events.d b11 = b(reactContext, og.a.a(i11));
        if (b11 == null) {
            String str = f12409a;
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Cannot get EventDispatcher for reactTag " + i11));
        }
        return b11;
    }

    public static ReactContext d(View view) {
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    public static int e(Context context) {
        if (context instanceof n0) {
            return ((n0) context).c();
        }
        return -1;
    }

    public static int f(View view) {
        if (view instanceof a0) {
            a0 a0Var = (a0) view;
            if (a0Var.getUIManagerType() == 2) {
                return a0Var.getRootViewTag();
            }
            return -1;
        }
        int id2 = view.getId();
        if (og.a.a(id2) == 1) {
            return -1;
        }
        Context context = view.getContext();
        if (!(context instanceof n0) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        int e11 = e(context);
        if (e11 == -1) {
            String str = f12409a;
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Fabric View [" + id2 + "] does not have SurfaceId associated with it"));
        }
        return e11;
    }

    public static UIManager g(ReactContext reactContext, int i11) {
        return h(reactContext, i11, true);
    }

    private static UIManager h(ReactContext reactContext, int i11, boolean z11) {
        if (reactContext.isBridgeless()) {
            UIManager uIManager = (UIManager) reactContext.getJSIModule(JSIModuleType.UIManager);
            if (uIManager == null) {
                ReactSoftExceptionLogger.logSoftException(f12409a, new ReactNoCrashSoftException("Cannot get UIManager because the instance hasn't been initialized yet."));
                return null;
            }
            return uIManager;
        } else if (!reactContext.hasCatalystInstance()) {
            ReactSoftExceptionLogger.logSoftException(f12409a, new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain a CatalystInstance."));
            return null;
        } else {
            if (!reactContext.hasActiveReactInstance()) {
                ReactSoftExceptionLogger.logSoftException(f12409a, new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain an active CatalystInstance."));
                if (z11) {
                    return null;
                }
            }
            CatalystInstance catalystInstance = reactContext.getCatalystInstance();
            try {
                if (i11 == 2) {
                    return (UIManager) catalystInstance.getJSIModule(JSIModuleType.UIManager);
                }
                return (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
            } catch (IllegalArgumentException unused) {
                String str = f12409a;
                ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Cannot get UIManager for UIManagerType: " + i11));
                return (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
            }
        }
    }

    public static UIManager i(ReactContext reactContext, int i11) {
        return g(reactContext, og.a.a(i11));
    }
}