package expo.modules.keepawake;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.core.ExportedModule;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.ModuleRegistryDelegate;
import expo.modules.core.Promise;
import expo.modules.core.errors.CurrentActivityNotFoundException;
import expo.modules.core.interfaces.ExpoMethod;
import expo.modules.core.interfaces.services.KeepAwakeManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.k;
import vz.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00018\u00008\u00000\u0003\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0082\bJ\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0007R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u001a\u001a\u00020\u00198F@\u0006¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lexpo/modules/keepawake/KeepAwakeModule;", "Lexpo/modules/core/ExportedModule;", "T", "Lvz/k;", "kotlin.jvm.PlatformType", "moduleRegistry", "Lexpo/modules/core/ModuleRegistry;", "Lvz/b0;", "onCreate", "", "getName", "tag", "Lexpo/modules/core/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "activate", "deactivate", "Lexpo/modules/core/ModuleRegistryDelegate;", "moduleRegistryDelegate", "Lexpo/modules/core/ModuleRegistryDelegate;", "Lexpo/modules/core/interfaces/services/KeepAwakeManager;", "keepAwakeManager$delegate", "Lvz/k;", "getKeepAwakeManager", "()Lexpo/modules/core/interfaces/services/KeepAwakeManager;", "keepAwakeManager", "", "isActivated", "()Z", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Lexpo/modules/core/ModuleRegistryDelegate;)V", "expo-keep-awake_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class KeepAwakeModule extends ExportedModule {
    private final k keepAwakeManager$delegate;
    private final ModuleRegistryDelegate moduleRegistryDelegate;

    public /* synthetic */ KeepAwakeModule(Context context, ModuleRegistryDelegate moduleRegistryDelegate, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? new ModuleRegistryDelegate() : moduleRegistryDelegate);
    }

    public static /* synthetic */ void a(Promise promise) {
        m611deactivate$lambda1(promise);
    }

    /* renamed from: activate$lambda-0 */
    public static final void m610activate$lambda0(Promise promise) {
        s.g(promise, "$promise");
        promise.resolve(Boolean.TRUE);
    }

    public static /* synthetic */ void b(Promise promise) {
        m610activate$lambda0(promise);
    }

    /* renamed from: deactivate$lambda-1 */
    public static final void m611deactivate$lambda1(Promise promise) {
        s.g(promise, "$promise");
        promise.resolve(Boolean.TRUE);
    }

    private final KeepAwakeManager getKeepAwakeManager() {
        Object value = this.keepAwakeManager$delegate.getValue();
        s.f(value, "<get-keepAwakeManager>(...)");
        return (KeepAwakeManager) value;
    }

    private final /* synthetic */ <T> k<T> moduleRegistry() {
        k<T> a11;
        ModuleRegistryDelegate moduleRegistryDelegate = this.moduleRegistryDelegate;
        s.l();
        a11 = m.a(new KeepAwakeModule$moduleRegistry$$inlined$getFromModuleRegistry$1(moduleRegistryDelegate));
        return a11;
    }

    @ExpoMethod
    public final void activate(String tag, final Promise promise) {
        s.g(tag, "tag");
        s.g(promise, "promise");
        try {
            getKeepAwakeManager().activate(tag, new Runnable() { // from class: expo.modules.keepawake.d
                @Override // java.lang.Runnable
                public final void run() {
                    KeepAwakeModule.b(promise);
                }
            });
        } catch (CurrentActivityNotFoundException unused) {
            promise.reject("NO_CURRENT_ACTIVITY", "Unable to activate keep awake");
        }
    }

    @ExpoMethod
    public final void deactivate(String tag, final Promise promise) {
        s.g(tag, "tag");
        s.g(promise, "promise");
        try {
            getKeepAwakeManager().deactivate(tag, new Runnable() { // from class: expo.modules.keepawake.c
                @Override // java.lang.Runnable
                public final void run() {
                    KeepAwakeModule.a(promise);
                }
            });
        } catch (CurrentActivityNotFoundException unused) {
            promise.reject("NO_CURRENT_ACTIVITY", "Unable to deactivate keep awake. However, it probably is deactivated already.");
        }
    }

    @Override // expo.modules.core.ExportedModule
    public String getName() {
        return "ExpoKeepAwake";
    }

    public final boolean isActivated() {
        return getKeepAwakeManager().isActivated();
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onCreate(ModuleRegistry moduleRegistry) {
        s.g(moduleRegistry, "moduleRegistry");
        this.moduleRegistryDelegate.onCreate(moduleRegistry);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeepAwakeModule(Context context, ModuleRegistryDelegate moduleRegistryDelegate) {
        super(context);
        k a11;
        s.g(context, "context");
        s.g(moduleRegistryDelegate, "moduleRegistryDelegate");
        this.moduleRegistryDelegate = moduleRegistryDelegate;
        a11 = m.a(new KeepAwakeModule$special$$inlined$moduleRegistry$1(this.moduleRegistryDelegate));
        this.keepAwakeManager$delegate = a11;
    }
}