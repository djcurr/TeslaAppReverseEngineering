package expo.modules.kotlin;

import com.adyen.checkout.components.status.model.StatusResponse;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.modules.Module;
import i00.a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import v20.o0;
import vz.k;
import vz.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\tJ\u001a\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u000e\u0018\u0001H\u0086\b¢\u0006\u0004\b\r\u0010\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011J#\u0010\u0013\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0016J1\u0010\u0013\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0001¢\u0006\u0004\b\u0013\u0010\u0019J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0096\u0002J\u0006\u0010\u001c\u001a\u00020\u0005R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R.\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020!8\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lexpo/modules/kotlin/ModuleRegistry;", "", "Lexpo/modules/kotlin/ModuleHolder;", "Lexpo/modules/kotlin/modules/Module;", "module", "Lvz/b0;", "register", "Lexpo/modules/kotlin/ModulesProvider;", "provider", "", "name", "", "hasModule", "getModule", "T", "()Ljava/lang/Object;", "getModuleHolder", "Lexpo/modules/kotlin/events/EventName;", "eventName", "post", "Sender", "sender", "(Lexpo/modules/kotlin/events/EventName;Ljava/lang/Object;)V", "Payload", StatusResponse.PAYLOAD, "(Lexpo/modules/kotlin/events/EventName;Ljava/lang/Object;Ljava/lang/Object;)V", "", "iterator", "cleanUp", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/kotlin/AppContext;", "appContext", "Ljava/lang/ref/WeakReference;", "", "registry", "Ljava/util/Map;", "getRegistry", "()Ljava/util/Map;", "getRegistry$annotations", "()V", "<init>", "(Ljava/lang/ref/WeakReference;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ModuleRegistry implements Iterable<ModuleHolder>, a {
    private final WeakReference<AppContext> appContext;
    private final Map<String, ModuleHolder> registry;

    public ModuleRegistry(WeakReference<AppContext> appContext) {
        s.g(appContext, "appContext");
        this.appContext = appContext;
        this.registry = new LinkedHashMap();
    }

    public static /* synthetic */ void getRegistry$annotations() {
    }

    public final void cleanUp() {
        Iterator<ModuleHolder> it2 = iterator();
        while (it2.hasNext()) {
            it2.next().cleanUp();
        }
    }

    public final Module getModule(String name) {
        s.g(name, "name");
        ModuleHolder moduleHolder = this.registry.get(name);
        if (moduleHolder == null) {
            return null;
        }
        return moduleHolder.getModule();
    }

    public final ModuleHolder getModuleHolder(String name) {
        s.g(name, "name");
        return this.registry.get(name);
    }

    public final Map<String, ModuleHolder> getRegistry() {
        return this.registry;
    }

    public final boolean hasModule(String name) {
        s.g(name, "name");
        return this.registry.containsKey(name);
    }

    @Override // java.lang.Iterable
    public Iterator<ModuleHolder> iterator() {
        return this.registry.values().iterator();
    }

    public final void post(EventName eventName) {
        s.g(eventName, "eventName");
        Iterator<ModuleHolder> it2 = iterator();
        while (it2.hasNext()) {
            it2.next().post(eventName);
        }
    }

    public final void register(Module module) {
        k<? extends o0> a11;
        s.g(module, "module");
        ModuleHolder moduleHolder = new ModuleHolder(module);
        AppContext appContext = this.appContext.get();
        if (appContext != null) {
            module.set_appContext$expo_modules_core_release(appContext);
            a11 = m.a(new ModuleRegistry$register$2(moduleHolder));
            module.setCoroutineScopeDelegate(a11);
            moduleHolder.post(EventName.MODULE_CREATE);
            this.registry.put(moduleHolder.getName(), moduleHolder);
            return;
        }
        throw new IllegalArgumentException("Cannot create a module for invalid app context.".toString());
    }

    public final /* synthetic */ <T> T getModule() {
        T t11;
        T t12;
        Iterator<T> it2 = getRegistry().values().iterator();
        while (true) {
            t11 = null;
            if (!it2.hasNext()) {
                t12 = null;
                break;
            }
            t12 = it2.next();
            Module module = ((ModuleHolder) t12).getModule();
            s.m(3, "T");
            if (module instanceof Object) {
                break;
            }
        }
        ModuleHolder moduleHolder = (ModuleHolder) t12;
        if (moduleHolder != null) {
            t11 = (T) moduleHolder.getModule();
        }
        s.m(2, "T");
        return t11;
    }

    public final ModuleHolder getModuleHolder(Module module) {
        Object obj;
        boolean z11;
        s.g(module, "module");
        Iterator<T> it2 = this.registry.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((ModuleHolder) obj).getModule() == module) {
                z11 = true;
                continue;
            } else {
                z11 = false;
                continue;
            }
            if (z11) {
                break;
            }
        }
        return (ModuleHolder) obj;
    }

    public final <Sender> void post(EventName eventName, Sender sender) {
        s.g(eventName, "eventName");
        Iterator<ModuleHolder> it2 = iterator();
        while (it2.hasNext()) {
            it2.next().post(eventName, sender);
        }
    }

    public final <Sender, Payload> void post(EventName eventName, Sender sender, Payload payload) {
        s.g(eventName, "eventName");
        Iterator<ModuleHolder> it2 = iterator();
        while (it2.hasNext()) {
            it2.next().post(eventName, sender, payload);
        }
    }

    public final ModuleRegistry register(ModulesProvider provider) {
        s.g(provider, "provider");
        Iterator<T> it2 = provider.getModulesList().iterator();
        while (it2.hasNext()) {
            Module module = (Module) ((Class) it2.next()).newInstance();
            s.f(module, "module");
            register(module);
        }
        return this;
    }
}