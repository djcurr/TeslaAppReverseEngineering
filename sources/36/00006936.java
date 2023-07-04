package expo.modules.core.interfaces;

import android.content.Context;
import expo.modules.core.ExportedModule;
import expo.modules.core.ViewManager;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public interface Package {
    default List<? extends ApplicationLifecycleListener> createApplicationLifecycleListeners(Context context) {
        return Collections.emptyList();
    }

    default List<? extends ExportedModule> createExportedModules(Context context) {
        return Collections.emptyList();
    }

    default List<? extends InternalModule> createInternalModules(Context context) {
        return Collections.emptyList();
    }

    default List<? extends ReactActivityHandler> createReactActivityHandlers(Context context) {
        return Collections.emptyList();
    }

    default List<? extends ReactActivityLifecycleListener> createReactActivityLifecycleListeners(Context context) {
        return Collections.emptyList();
    }

    default List<? extends ReactNativeHostHandler> createReactNativeHostHandlers(Context context) {
        return Collections.emptyList();
    }

    default List<? extends SingletonModule> createSingletonModules(Context context) {
        return Collections.emptyList();
    }

    default List<? extends ViewManager> createViewManagers(Context context) {
        return Collections.emptyList();
    }
}