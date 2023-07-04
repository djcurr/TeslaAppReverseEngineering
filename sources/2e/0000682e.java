package expo.modules;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.v;
import expo.modules.adapters.react.ModuleRegistryAdapter;
import expo.modules.core.interfaces.Package;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.k;
import vz.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\n\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lexpo/modules/ExpoModulesPackage;", "Lcom/facebook/react/v;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "Lcom/facebook/react/bridge/NativeModule;", "createNativeModules", "Lcom/facebook/react/uimanager/ViewManager;", "createViewManagers", "Lexpo/modules/adapters/react/ModuleRegistryAdapter;", "moduleRegistryAdapter", "Lexpo/modules/adapters/react/ModuleRegistryAdapter;", "getModuleRegistryAdapter", "()Lexpo/modules/adapters/react/ModuleRegistryAdapter;", "<init>", "()V", "Companion", "expo_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ExpoModulesPackage implements v {
    public static final Companion Companion = new Companion(null);
    private static final k<List<Package>> packageList$delegate;
    private final ModuleRegistryAdapter moduleRegistryAdapter = new ModuleRegistryAdapter(Companion.getPackageList());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\tR)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lexpo/modules/ExpoModulesPackage$Companion;", "", "", "Lexpo/modules/core/interfaces/Package;", "packageList$delegate", "Lvz/k;", "getPackageList", "()Ljava/util/List;", "getPackageList$annotations", "()V", "packageList", "<init>", "expo_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getPackageList$annotations() {
        }

        public final List<Package> getPackageList() {
            return (List) ExpoModulesPackage.packageList$delegate.getValue();
        }
    }

    static {
        k<List<Package>> a11;
        a11 = m.a(ExpoModulesPackage$Companion$packageList$2.INSTANCE);
        packageList$delegate = a11;
    }

    @Override // com.facebook.react.v
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        s.g(reactContext, "reactContext");
        List<NativeModule> createNativeModules = this.moduleRegistryAdapter.createNativeModules(reactContext);
        s.f(createNativeModules, "moduleRegistryAdapter.cr…tiveModules(reactContext)");
        return createNativeModules;
    }

    @Override // com.facebook.react.v
    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactContext) {
        s.g(reactContext, "reactContext");
        List<ViewManager<?, ?>> createViewManagers = this.moduleRegistryAdapter.createViewManagers(reactContext);
        s.f(createViewManagers, "moduleRegistryAdapter.cr…iewManagers(reactContext)");
        return createViewManagers;
    }

    public final ModuleRegistryAdapter getModuleRegistryAdapter() {
        return this.moduleRegistryAdapter;
    }
}