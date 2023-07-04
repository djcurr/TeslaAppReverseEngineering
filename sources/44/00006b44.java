package expo.modules.kotlin.views;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import h00.l;
import h00.p;
import h00.q;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import ng.a;
import vz.b0;
import wz.s0;
import yf.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0016\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0016J \u0010\u0017\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016R\u001c\u0010\u001d\u001a\u00020\u001c8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lexpo/modules/kotlin/views/GroupViewManagerWrapper;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Landroid/view/ViewGroup;", "Lexpo/modules/kotlin/views/ViewWrapperDelegateHolder;", "", "getName", "Lcom/facebook/react/uimanager/n0;", "reactContext", "createViewInstance", "Landroid/view/View;", "view", "Lcom/facebook/react/bridge/ReadableMap;", "proxiedProperties", "Lvz/b0;", "setProxiedProperties", "onDropViewInstance", "", "", "getExportedCustomDirectEventTypeConstants", "parent", "child", "", "index", "addView", "getChildCount", "getChildAt", "removeViewAt", "removeView", "Lexpo/modules/kotlin/views/ViewManagerWrapperDelegate;", "viewWrapperDelegate", "Lexpo/modules/kotlin/views/ViewManagerWrapperDelegate;", "getViewWrapperDelegate", "()Lexpo/modules/kotlin/views/ViewManagerWrapperDelegate;", "<init>", "(Lexpo/modules/kotlin/views/ViewManagerWrapperDelegate;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class GroupViewManagerWrapper extends ViewGroupManager<ViewGroup> implements ViewWrapperDelegateHolder {
    private final ViewManagerWrapperDelegate viewWrapperDelegate;

    public GroupViewManagerWrapper(ViewManagerWrapperDelegate viewWrapperDelegate) {
        s.g(viewWrapperDelegate, "viewWrapperDelegate");
        this.viewWrapperDelegate = viewWrapperDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(ViewGroup parent, View child, int i11) {
        q<ViewGroup, View, Integer, b0> addViewAction;
        s.g(parent, "parent");
        s.g(child, "child");
        ViewGroupDefinition viewGroupDefinition$expo_modules_core_release = getViewWrapperDelegate().getViewGroupDefinition$expo_modules_core_release();
        b0 b0Var = null;
        if (viewGroupDefinition$expo_modules_core_release != null && (addViewAction = viewGroupDefinition$expo_modules_core_release.getAddViewAction()) != null) {
            addViewAction.invoke(parent, child, Integer.valueOf(i11));
            b0Var = b0.f54756a;
        }
        if (b0Var == null) {
            super.addView(parent, child, i11);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(ViewGroup parent, int i11) {
        p<ViewGroup, Integer, View> getChildAtAction;
        s.g(parent, "parent");
        ViewGroupDefinition viewGroupDefinition$expo_modules_core_release = getViewWrapperDelegate().getViewGroupDefinition$expo_modules_core_release();
        if (viewGroupDefinition$expo_modules_core_release == null || (getChildAtAction = viewGroupDefinition$expo_modules_core_release.getGetChildAtAction()) == null) {
            return super.getChildAt(parent, i11);
        }
        return getChildAtAction.invoke(parent, Integer.valueOf(i11));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(ViewGroup parent) {
        l<ViewGroup, Integer> getChildCountAction;
        s.g(parent, "parent");
        ViewGroupDefinition viewGroupDefinition$expo_modules_core_release = getViewWrapperDelegate().getViewGroupDefinition$expo_modules_core_release();
        Integer num = null;
        if (viewGroupDefinition$expo_modules_core_release != null && (getChildCountAction = viewGroupDefinition$expo_modules_core_release.getGetChildCountAction()) != null) {
            num = getChildCountAction.invoke(parent);
        }
        if (num == null) {
            num = Integer.valueOf(super.getChildCount(parent));
        }
        return num.intValue();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = getViewWrapperDelegate().getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            return super.getExportedCustomDirectEventTypeConstants();
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants2 = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants2 == null) {
            exportedCustomDirectEventTypeConstants2 = s0.i();
        }
        c.b a11 = c.a();
        for (Map.Entry<String, Object> entry : exportedCustomDirectEventTypeConstants2.entrySet()) {
            a11.b(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Object> entry2 : exportedCustomDirectEventTypeConstants.entrySet()) {
            a11.b(entry2.getKey(), entry2.getValue());
        }
        return a11.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        String name = getViewWrapperDelegate().getName();
        return "ViewManagerAdapter_" + name;
    }

    @Override // expo.modules.kotlin.views.ViewWrapperDelegateHolder
    public ViewManagerWrapperDelegate getViewWrapperDelegate() {
        return this.viewWrapperDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(ViewGroup parent, View view) {
        p<ViewGroup, View, b0> removeViewAction;
        s.g(parent, "parent");
        s.g(view, "view");
        ViewGroupDefinition viewGroupDefinition$expo_modules_core_release = getViewWrapperDelegate().getViewGroupDefinition$expo_modules_core_release();
        b0 b0Var = null;
        if (viewGroupDefinition$expo_modules_core_release != null && (removeViewAction = viewGroupDefinition$expo_modules_core_release.getRemoveViewAction()) != null) {
            removeViewAction.invoke(parent, view);
            b0Var = b0.f54756a;
        }
        if (b0Var == null) {
            super.removeView(parent, view);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(ViewGroup parent, int i11) {
        p<ViewGroup, Integer, b0> removeViewAtAction;
        s.g(parent, "parent");
        ViewGroupDefinition viewGroupDefinition$expo_modules_core_release = getViewWrapperDelegate().getViewGroupDefinition$expo_modules_core_release();
        b0 b0Var = null;
        if (viewGroupDefinition$expo_modules_core_release != null && (removeViewAtAction = viewGroupDefinition$expo_modules_core_release.getRemoveViewAtAction()) != null) {
            removeViewAtAction.invoke(parent, Integer.valueOf(i11));
            b0Var = b0.f54756a;
        }
        if (b0Var == null) {
            super.removeViewAt(parent, i11);
        }
    }

    @a(name = "proxiedProperties")
    public final void setProxiedProperties(View view, ReadableMap proxiedProperties) {
        s.g(view, "view");
        s.g(proxiedProperties, "proxiedProperties");
        getViewWrapperDelegate().setProxiedProperties(view, proxiedProperties);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ViewGroup createViewInstance(n0 reactContext) {
        s.g(reactContext, "reactContext");
        return (ViewGroup) getViewWrapperDelegate().createView(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(ViewGroup view) {
        s.g(view, "view");
        super.onDropViewInstance((GroupViewManagerWrapper) view);
        getViewWrapperDelegate().onDestroy(view);
    }
}