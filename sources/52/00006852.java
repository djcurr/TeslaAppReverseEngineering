package expo.modules.adapters.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.v;
import expo.modules.adapters.react.views.SimpleViewManagerAdapter;
import expo.modules.adapters.react.views.ViewGroupManagerAdapter;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.ViewManager;
import expo.modules.core.interfaces.InternalModule;
import expo.modules.core.interfaces.Package;
import expo.modules.kotlin.KotlinInteropModuleRegistry;
import expo.modules.kotlin.ModulesProvider;
import expo.modules.kotlin.views.ViewWrapperDelegateHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
public class ModuleRegistryAdapter implements v {
    protected ReactModuleRegistryProvider mModuleRegistryProvider;
    protected ModulesProvider mModulesProvider;
    private NativeModulesProxy mModulesProxy;
    protected ReactAdapterPackage mReactAdapterPackage = new ReactAdapterPackage();
    private List<ViewWrapperDelegateHolder> mWrapperDelegateHolders = null;

    /* renamed from: expo.modules.adapters.react.ModuleRegistryAdapter$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$expo$modules$core$ViewManager$ViewManagerType;

        static {
            int[] iArr = new int[ViewManager.ViewManagerType.values().length];
            $SwitchMap$expo$modules$core$ViewManager$ViewManagerType = iArr;
            try {
                iArr[ViewManager.ViewManagerType.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$expo$modules$core$ViewManager$ViewManagerType[ViewManager.ViewManagerType.SIMPLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ModuleRegistryAdapter(List<Package> list) {
        this.mModuleRegistryProvider = new ReactModuleRegistryProvider(list, null);
    }

    private NativeModulesProxy createNativeModulesProxy(ReactApplicationContext reactApplicationContext, ModuleRegistry moduleRegistry) {
        ModulesProvider modulesProvider = this.mModulesProvider;
        if (modulesProvider != null) {
            return new NativeModulesProxy(reactApplicationContext, moduleRegistry, modulesProvider);
        }
        return new NativeModulesProxy(reactApplicationContext, moduleRegistry);
    }

    @Override // com.facebook.react.v
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ModuleRegistry moduleRegistry = this.mModuleRegistryProvider.get(reactApplicationContext);
        for (InternalModule internalModule : this.mReactAdapterPackage.createInternalModules(reactApplicationContext)) {
            moduleRegistry.registerInternalModule(internalModule);
        }
        List<NativeModule> nativeModulesFromModuleRegistry = getNativeModulesFromModuleRegistry(reactApplicationContext, moduleRegistry);
        if (this.mWrapperDelegateHolders != null) {
            this.mModulesProxy.getKotlinInteropModuleRegistry().updateModuleHoldersInViewManagers(this.mWrapperDelegateHolders);
        }
        return nativeModulesFromModuleRegistry;
    }

    @Override // com.facebook.react.v
    public List<com.facebook.react.uimanager.ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList(this.mModuleRegistryProvider.getReactViewManagers(reactApplicationContext));
        for (ViewManager viewManager : this.mModuleRegistryProvider.getViewManagers(reactApplicationContext)) {
            int i11 = AnonymousClass1.$SwitchMap$expo$modules$core$ViewManager$ViewManagerType[viewManager.getViewManagerType().ordinal()];
            if (i11 == 1) {
                arrayList.add(new ViewGroupManagerAdapter(viewManager));
            } else if (i11 == 2) {
                arrayList.add(new SimpleViewManagerAdapter(viewManager));
            }
        }
        NativeModulesProxy nativeModulesProxy = this.mModulesProxy;
        Objects.requireNonNull(nativeModulesProxy);
        KotlinInteropModuleRegistry kotlinInteropModuleRegistry = nativeModulesProxy.getKotlinInteropModuleRegistry();
        List<com.facebook.react.uimanager.ViewManager<?, ?>> exportViewManagers = kotlinInteropModuleRegistry.exportViewManagers();
        this.mWrapperDelegateHolders = kotlinInteropModuleRegistry.extractViewManagersDelegateHolders(exportViewManagers);
        arrayList.addAll(exportViewManagers);
        return arrayList;
    }

    protected List<NativeModule> getNativeModulesFromModuleRegistry(ReactApplicationContext reactApplicationContext, ModuleRegistry moduleRegistry) {
        ArrayList arrayList = new ArrayList(2);
        NativeModulesProxy createNativeModulesProxy = createNativeModulesProxy(reactApplicationContext, moduleRegistry);
        this.mModulesProxy = createNativeModulesProxy;
        arrayList.add(createNativeModulesProxy);
        arrayList.add(new ModuleRegistryReadyNotifier(moduleRegistry));
        for (v vVar : ((ReactPackagesProvider) moduleRegistry.getModule(ReactPackagesProvider.class)).getReactPackages()) {
            arrayList.addAll(vVar.createNativeModules(reactApplicationContext));
        }
        return arrayList;
    }

    public ModuleRegistryAdapter(ReactModuleRegistryProvider reactModuleRegistryProvider) {
        this.mModuleRegistryProvider = reactModuleRegistryProvider;
    }

    public ModuleRegistryAdapter(ReactModuleRegistryProvider reactModuleRegistryProvider, ModulesProvider modulesProvider) {
        this.mModuleRegistryProvider = reactModuleRegistryProvider;
        this.mModulesProvider = modulesProvider;
    }
}