package expo.modules.kotlin.views;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.n0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import ng.a;
import wz.s0;
import yf.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0016\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0016R\u001c\u0010\u0013\u001a\u00020\u00128\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lexpo/modules/kotlin/views/SimpleViewManagerWrapper;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Landroid/view/View;", "Lexpo/modules/kotlin/views/ViewWrapperDelegateHolder;", "", "getName", "Lcom/facebook/react/uimanager/n0;", "reactContext", "createViewInstance", "view", "Lcom/facebook/react/bridge/ReadableMap;", "proxiedProperties", "Lvz/b0;", "setProxiedProperties", "onDropViewInstance", "", "", "getExportedCustomDirectEventTypeConstants", "Lexpo/modules/kotlin/views/ViewManagerWrapperDelegate;", "viewWrapperDelegate", "Lexpo/modules/kotlin/views/ViewManagerWrapperDelegate;", "getViewWrapperDelegate", "()Lexpo/modules/kotlin/views/ViewManagerWrapperDelegate;", "<init>", "(Lexpo/modules/kotlin/views/ViewManagerWrapperDelegate;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class SimpleViewManagerWrapper extends SimpleViewManager<View> implements ViewWrapperDelegateHolder {
    private final ViewManagerWrapperDelegate viewWrapperDelegate;

    public SimpleViewManagerWrapper(ViewManagerWrapperDelegate viewWrapperDelegate) {
        s.g(viewWrapperDelegate, "viewWrapperDelegate");
        this.viewWrapperDelegate = viewWrapperDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected View createViewInstance(n0 reactContext) {
        s.g(reactContext, "reactContext");
        return getViewWrapperDelegate().createView(reactContext);
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

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(View view) {
        s.g(view, "view");
        super.onDropViewInstance(view);
        getViewWrapperDelegate().onDestroy(view);
    }

    @a(name = "proxiedProperties")
    public final void setProxiedProperties(View view, ReadableMap proxiedProperties) {
        s.g(view, "view");
        s.g(proxiedProperties, "proxiedProperties");
        getViewWrapperDelegate().setProxiedProperties(view, proxiedProperties);
    }
}