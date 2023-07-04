package com.th3rdwave.safeareacontext;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import com.th3rdwave.safeareacontext.e;
import java.util.Map;

/* loaded from: classes6.dex */
public class SafeAreaProviderManager extends ViewGroupManager<e> {
    private final ReactApplicationContext mContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a implements e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.uimanager.events.d f22262a;

        a(SafeAreaProviderManager safeAreaProviderManager, com.facebook.react.uimanager.events.d dVar) {
            this.f22262a = dVar;
        }

        @Override // com.th3rdwave.safeareacontext.e.a
        public void a(e eVar, com.th3rdwave.safeareacontext.a aVar, c cVar) {
            this.f22262a.g(new b(eVar.getId(), aVar, cVar));
        }
    }

    public SafeAreaProviderManager(ReactApplicationContext reactApplicationContext) {
        this.mContext = reactApplicationContext;
    }

    private Map<String, Object> getInitialWindowMetrics() {
        ViewGroup viewGroup;
        View findViewById;
        Activity currentActivity = this.mContext.getCurrentActivity();
        if (currentActivity == null || (viewGroup = (ViewGroup) currentActivity.getWindow().getDecorView()) == null || (findViewById = viewGroup.findViewById(16908290)) == null) {
            return null;
        }
        com.th3rdwave.safeareacontext.a c11 = f.c(viewGroup);
        c a11 = f.a(viewGroup, findViewById);
        if (c11 == null || a11 == null) {
            return null;
        }
        return yf.c.e("insets", l.a(c11), "frame", l.c(a11));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return yf.c.a().b("topInsetsChange", yf.c.d("registrationName", "onInsetsChange")).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return yf.c.d("initialWindowMetrics", getInitialWindowMetrics());
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCSafeAreaProvider";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(n0 n0Var, e eVar) {
        eVar.setOnInsetsChangeListener(new a(this, ((UIManagerModule) n0Var.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public e createViewInstance(n0 n0Var) {
        return new e(n0Var);
    }
}