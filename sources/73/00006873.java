package expo.modules.adapters.react.views;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.ViewManager;
import expo.modules.core.interfaces.RegistryLifecycleListener;
import java.util.Map;
import ng.a;

/* loaded from: classes6.dex */
public class ViewGroupManagerAdapter<M extends ViewManager<V>, V extends ViewGroup> extends ViewGroupManager<V> implements RegistryLifecycleListener {
    private M mViewManager;

    public ViewGroupManagerAdapter(M m11) {
        this.mViewManager = m11;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return ViewManagerAdapterUtils.getConstants(this.mViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return ViewManagerAdapterUtils.getExportedCustomDirectEventTypeConstants(this.mViewManager);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return ViewManagerAdapterUtils.getViewManagerAdapterName(this.mViewManager);
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onCreate(ModuleRegistry moduleRegistry) {
        this.mViewManager.onCreate(moduleRegistry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
        onDropViewInstance((ViewGroupManagerAdapter<M, V>) ((ViewGroup) view));
    }

    @a(name = "proxiedProperties")
    public void setProxiedProperties(V v11, ReadableMap readableMap) {
        ViewManagerAdapterUtils.setProxiedProperties(getName(), this.mViewManager, v11, readableMap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public V createViewInstance(n0 n0Var) {
        return (V) this.mViewManager.createViewInstance(n0Var);
    }

    public void onDropViewInstance(V v11) {
        this.mViewManager.onDropViewInstance(v11);
        super.onDropViewInstance((ViewGroupManagerAdapter<M, V>) v11);
    }
}