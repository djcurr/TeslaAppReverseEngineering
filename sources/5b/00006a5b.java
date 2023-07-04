package expo.modules.kotlin;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import expo.modules.core.ViewManager;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.functions.AnyFunction;
import expo.modules.kotlin.views.GroupViewManagerWrapper;
import expo.modules.kotlin.views.SimpleViewManagerWrapper;
import expo.modules.kotlin.views.ViewManagerDefinition;
import expo.modules.kotlin.views.ViewManagerWrapperDelegate;
import expo.modules.kotlin.views.ViewWrapperDelegateHolder;
import h00.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import vz.b0;
import vz.v;
import wz.r0;
import wz.s0;
import wz.w;
import wz.x;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-¢\u0006\u0004\b0\u00101J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J&\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ(\u0010\u0011\u001a$\u0012\b\u0012\u00060\u0002j\u0002`\u000f\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000ej\u0002`\u00100\u000eJb\u0010\u0016\u001a*\u0012\b\u0012\u00060\u0002j\u0002`\u000f\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000ej\u0002`\u00140\u00130\u000e22\b\u0002\u0010\u0015\u001a,\u0012\u0004\u0012\u00020\u0002\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000ej\u0002`\u00140\u0013\u0012\u0004\u0012\u00020\f0\u0012J\u0014\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00170\u0013J\u001e\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000e0\u000eJ\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00132\u0014\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00170\u0013J\u0014\u0010\u001e\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0013J\u0006\u0010\u001f\u001a\u00020\fR\u001c\u0010!\u001a\u00020 8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020%8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u00062"}, d2 = {"Lexpo/modules/kotlin/KotlinInteropModuleRegistry;", "", "", "name", "", "hasModule", "moduleName", "method", "Lcom/facebook/react/bridge/ReadableArray;", "arguments", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "callMethod", "", "Lexpo/modules/kotlin/ModuleName;", "Lexpo/modules/kotlin/ModuleConstants;", "exportedModulesConstants", "Lkotlin/Function2;", "", "Lexpo/modules/kotlin/ModuleMethodInfo;", "exportKey", "exportMethods", "Lcom/facebook/react/uimanager/ViewManager;", "exportViewManagers", "viewManagersMetadata", "viewManagers", "Lexpo/modules/kotlin/views/ViewWrapperDelegateHolder;", "extractViewManagersDelegateHolders", "viewWrapperHolders", "updateModuleHoldersInViewManagers", "onDestroy", "Lexpo/modules/kotlin/AppContext;", "appContext", "Lexpo/modules/kotlin/AppContext;", "getAppContext$expo_modules_core_release", "()Lexpo/modules/kotlin/AppContext;", "Lexpo/modules/kotlin/ModuleRegistry;", "getRegistry", "()Lexpo/modules/kotlin/ModuleRegistry;", "registry", "Lexpo/modules/kotlin/ModulesProvider;", "modulesProvider", "Lexpo/modules/core/ModuleRegistry;", "legacyModuleRegistry", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lexpo/modules/kotlin/ModulesProvider;Lexpo/modules/core/ModuleRegistry;Ljava/lang/ref/WeakReference;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class KotlinInteropModuleRegistry {
    private final AppContext appContext;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewManager.ViewManagerType.values().length];
            iArr[ViewManager.ViewManagerType.SIMPLE.ordinal()] = 1;
            iArr[ViewManager.ViewManagerType.GROUP.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KotlinInteropModuleRegistry(ModulesProvider modulesProvider, expo.modules.core.ModuleRegistry legacyModuleRegistry, WeakReference<ReactApplicationContext> reactContext) {
        s.g(modulesProvider, "modulesProvider");
        s.g(legacyModuleRegistry, "legacyModuleRegistry");
        s.g(reactContext, "reactContext");
        this.appContext = new AppContext(modulesProvider, legacyModuleRegistry, reactContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Map exportMethods$default(KotlinInteropModuleRegistry kotlinInteropModuleRegistry, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pVar = KotlinInteropModuleRegistry$exportMethods$1.INSTANCE;
        }
        return kotlinInteropModuleRegistry.exportMethods(pVar);
    }

    private final ModuleRegistry getRegistry() {
        return this.appContext.getRegistry();
    }

    public final void callMethod(String moduleName, String method, ReadableArray arguments, Promise promise) {
        s.g(moduleName, "moduleName");
        s.g(method, "method");
        s.g(arguments, "arguments");
        s.g(promise, "promise");
        try {
            ModuleHolder moduleHolder = getRegistry().getModuleHolder(moduleName);
            if (moduleHolder != null) {
                moduleHolder.call(method, arguments, promise);
                return;
            }
            throw new IllegalArgumentException(("Trying to call '" + method + "' on the non-existing module '" + moduleName + "'").toString());
        } catch (CodedException e11) {
            promise.reject(e11);
        } catch (Throwable th2) {
            promise.reject(new UnexpectedException(th2));
        }
    }

    public final Map<String, List<Map<String, Object>>> exportMethods(p<? super String, ? super List<? extends Map<String, ? extends Object>>, b0> exportKey) {
        int t11;
        Map<String, List<Map<String, Object>>> t12;
        Map l11;
        s.g(exportKey, "exportKey");
        ModuleRegistry registry = getRegistry();
        t11 = x.t(registry, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (ModuleHolder moduleHolder : registry) {
            Map<String, AnyFunction> methods = moduleHolder.getDefinition().getMethods();
            ArrayList arrayList2 = new ArrayList(methods.size());
            for (Map.Entry<String, AnyFunction> entry : methods.entrySet()) {
                l11 = s0.l(v.a("name", entry.getKey()), v.a("argumentsCount", Integer.valueOf(entry.getValue().getArgsCount())));
                arrayList2.add(l11);
            }
            exportKey.invoke(moduleHolder.getName(), arrayList2);
            arrayList.add(v.a(moduleHolder.getName(), arrayList2));
        }
        t12 = s0.t(arrayList);
        return t12;
    }

    public final List<com.facebook.react.uimanager.ViewManager<?, ?>> exportViewManagers() {
        int t11;
        BaseViewManager simpleViewManagerWrapper;
        ModuleRegistry registry = getRegistry();
        ArrayList<ModuleHolder> arrayList = new ArrayList();
        Iterator<ModuleHolder> it2 = registry.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ModuleHolder next = it2.next();
            if (next.getDefinition().getViewManagerDefinition() != null) {
                arrayList.add(next);
            }
        }
        t11 = x.t(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(t11);
        for (ModuleHolder moduleHolder : arrayList) {
            ViewManagerWrapperDelegate viewManagerWrapperDelegate = new ViewManagerWrapperDelegate(moduleHolder);
            ViewManagerDefinition viewManagerDefinition = moduleHolder.getDefinition().getViewManagerDefinition();
            s.e(viewManagerDefinition);
            int i11 = WhenMappings.$EnumSwitchMapping$0[viewManagerDefinition.getViewManagerType().ordinal()];
            if (i11 == 1) {
                simpleViewManagerWrapper = new SimpleViewManagerWrapper(viewManagerWrapperDelegate);
            } else if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                simpleViewManagerWrapper = new GroupViewManagerWrapper(viewManagerWrapperDelegate);
            }
            arrayList2.add(simpleViewManagerWrapper);
        }
        return arrayList2;
    }

    public final Map<String, Map<String, Object>> exportedModulesConstants() {
        int t11;
        Map<String, Map<String, Object>> t12;
        ModuleRegistry registry = getRegistry();
        t11 = x.t(registry, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (ModuleHolder moduleHolder : registry) {
            arrayList.add(v.a(moduleHolder.getName(), moduleHolder.getDefinition().getConstantsProvider().invoke()));
        }
        t12 = s0.t(arrayList);
        return t12;
    }

    public final List<ViewWrapperDelegateHolder> extractViewManagersDelegateHolders(List<? extends com.facebook.react.uimanager.ViewManager<?, ?>> viewManagers) {
        s.g(viewManagers, "viewManagers");
        ArrayList arrayList = new ArrayList();
        for (Object obj : viewManagers) {
            if (obj instanceof ViewWrapperDelegateHolder) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final AppContext getAppContext$expo_modules_core_release() {
        return this.appContext;
    }

    public final boolean hasModule(String name) {
        s.g(name, "name");
        return getRegistry().hasModule(name);
    }

    public final void onDestroy() {
        this.appContext.onDestroy();
    }

    public final void updateModuleHoldersInViewManagers(List<? extends ViewWrapperDelegateHolder> viewWrapperHolders) {
        int t11;
        s.g(viewWrapperHolders, "viewWrapperHolders");
        t11 = x.t(viewWrapperHolders, 10);
        ArrayList<ViewManagerWrapperDelegate> arrayList = new ArrayList(t11);
        for (ViewWrapperDelegateHolder viewWrapperDelegateHolder : viewWrapperHolders) {
            arrayList.add(viewWrapperDelegateHolder.getViewWrapperDelegate());
        }
        for (ViewManagerWrapperDelegate viewManagerWrapperDelegate : arrayList) {
            ModuleHolder moduleHolder = getRegistry().getModuleHolder(viewManagerWrapperDelegate.getModuleHolder$expo_modules_core_release().getName());
            if (moduleHolder == null) {
                String name = viewManagerWrapperDelegate.getModuleHolder$expo_modules_core_release().getName();
                throw new IllegalArgumentException(("Cannot update the module holder for " + name + ".").toString());
            }
            viewManagerWrapperDelegate.setModuleHolder$expo_modules_core_release(moduleHolder);
        }
    }

    public final Map<String, Map<String, Object>> viewManagersMetadata() {
        int t11;
        Map<String, Map<String, Object>> t12;
        Map f11;
        ModuleRegistry registry = getRegistry();
        ArrayList<ModuleHolder> arrayList = new ArrayList();
        for (ModuleHolder moduleHolder : registry) {
            if (moduleHolder.getDefinition().getViewManagerDefinition() != null) {
                arrayList.add(moduleHolder);
            }
        }
        t11 = x.t(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(t11);
        for (ModuleHolder moduleHolder2 : arrayList) {
            String name = moduleHolder2.getName();
            ViewManagerDefinition viewManagerDefinition = moduleHolder2.getDefinition().getViewManagerDefinition();
            List<String> propsNames = viewManagerDefinition == null ? null : viewManagerDefinition.getPropsNames();
            if (propsNames == null) {
                propsNames = w.i();
            }
            f11 = r0.f(v.a("propsNames", propsNames));
            arrayList2.add(v.a(name, f11));
        }
        t12 = s0.t(arrayList2);
        return t12;
    }
}