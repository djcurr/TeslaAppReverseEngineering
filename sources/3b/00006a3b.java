package expo.modules.keepawake;

import android.app.Activity;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.ModuleRegistryDelegate;
import expo.modules.core.errors.CurrentActivityNotFoundException;
import expo.modules.core.interfaces.ActivityProvider;
import expo.modules.core.interfaces.InternalModule;
import expo.modules.core.interfaces.services.KeepAwakeManager;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.k;
import vz.m;
import wz.v;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\u0006\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00018\u00008\u00000\u0004\"\u0006\b\u0000\u0010\u0003\u0018\u0001H\u0082\bJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00130\u0012H\u0016R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001b8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006#²\u0006\u000e\u0010\"\u001a\u00020!8\n@\nX\u008a\u0084\u0002"}, d2 = {"Lexpo/modules/keepawake/ExpoKeepAwakeManager;", "Lexpo/modules/core/interfaces/services/KeepAwakeManager;", "Lexpo/modules/core/interfaces/InternalModule;", "T", "Lvz/k;", "kotlin.jvm.PlatformType", "moduleRegistry", "Lexpo/modules/core/ModuleRegistry;", "Lvz/b0;", "onCreate", "", "tag", "Ljava/lang/Runnable;", "done", "activate", "deactivate", "", "isActivated", "", "Ljava/lang/Class;", "getExportedInterfaces", "Lexpo/modules/core/ModuleRegistryDelegate;", "moduleRegistryDelegate", "Lexpo/modules/core/ModuleRegistryDelegate;", "", "tags", "Ljava/util/Set;", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "currentActivity", "<init>", "(Lexpo/modules/core/ModuleRegistryDelegate;)V", "Lexpo/modules/core/interfaces/ActivityProvider;", "activityProvider", "expo-keep-awake_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ExpoKeepAwakeManager implements KeepAwakeManager, InternalModule {
    private final ModuleRegistryDelegate moduleRegistryDelegate;
    private final Set<String> tags;

    public ExpoKeepAwakeManager() {
        this(null, 1, null);
    }

    public ExpoKeepAwakeManager(ModuleRegistryDelegate moduleRegistryDelegate) {
        s.g(moduleRegistryDelegate, "moduleRegistryDelegate");
        this.moduleRegistryDelegate = moduleRegistryDelegate;
        this.tags = new HashSet();
    }

    /* renamed from: _get_currentActivity_$lambda-0 */
    private static final ActivityProvider m607_get_currentActivity_$lambda0(k<? extends ActivityProvider> kVar) {
        ActivityProvider value = kVar.getValue();
        s.f(value, "_get_currentActivity_$lambda-0(...)");
        return value;
    }

    public static /* synthetic */ void a(Activity activity) {
        m608activate$lambda1(activity);
    }

    /* renamed from: activate$lambda-1 */
    public static final void m608activate$lambda1(Activity activity) {
        s.g(activity, "$activity");
        activity.getWindow().addFlags(128);
    }

    public static /* synthetic */ void b(Activity activity) {
        m609deactivate$lambda2(activity);
    }

    /* renamed from: deactivate$lambda-2 */
    public static final void m609deactivate$lambda2(Activity activity) {
        s.g(activity, "$activity");
        activity.getWindow().clearFlags(128);
    }

    private final Activity getCurrentActivity() {
        k a11;
        a11 = m.a(new ExpoKeepAwakeManager$special$$inlined$moduleRegistry$1(this.moduleRegistryDelegate));
        if (m607_get_currentActivity_$lambda0(a11).getCurrentActivity() != null) {
            Activity currentActivity = m607_get_currentActivity_$lambda0(a11).getCurrentActivity();
            s.f(currentActivity, "{\n        activityProvider.currentActivity\n      }");
            return currentActivity;
        }
        throw new CurrentActivityNotFoundException();
    }

    private final /* synthetic */ <T> k<T> moduleRegistry() {
        k<T> a11;
        ModuleRegistryDelegate moduleRegistryDelegate = this.moduleRegistryDelegate;
        s.l();
        a11 = m.a(new ExpoKeepAwakeManager$moduleRegistry$$inlined$getFromModuleRegistry$1(moduleRegistryDelegate));
        return a11;
    }

    @Override // expo.modules.core.interfaces.services.KeepAwakeManager
    public void activate(String tag, Runnable done) {
        s.g(tag, "tag");
        s.g(done, "done");
        final Activity currentActivity = getCurrentActivity();
        if (!isActivated()) {
            currentActivity.runOnUiThread(new Runnable() { // from class: expo.modules.keepawake.a
                @Override // java.lang.Runnable
                public final void run() {
                    ExpoKeepAwakeManager.a(currentActivity);
                }
            });
        }
        this.tags.add(tag);
        done.run();
    }

    @Override // expo.modules.core.interfaces.services.KeepAwakeManager
    public void deactivate(String tag, Runnable done) {
        s.g(tag, "tag");
        s.g(done, "done");
        final Activity currentActivity = getCurrentActivity();
        if (this.tags.size() == 1 && this.tags.contains(tag)) {
            currentActivity.runOnUiThread(new Runnable() { // from class: expo.modules.keepawake.b
                @Override // java.lang.Runnable
                public final void run() {
                    ExpoKeepAwakeManager.b(currentActivity);
                }
            });
        }
        this.tags.remove(tag);
        done.run();
    }

    @Override // expo.modules.core.interfaces.InternalModule
    public List<Class<?>> getExportedInterfaces() {
        List<Class<?>> d11;
        d11 = v.d(KeepAwakeManager.class);
        return d11;
    }

    @Override // expo.modules.core.interfaces.services.KeepAwakeManager
    public boolean isActivated() {
        return !this.tags.isEmpty();
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onCreate(ModuleRegistry moduleRegistry) {
        s.g(moduleRegistry, "moduleRegistry");
        this.moduleRegistryDelegate.onCreate(moduleRegistry);
    }

    public /* synthetic */ ExpoKeepAwakeManager(ModuleRegistryDelegate moduleRegistryDelegate, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new ModuleRegistryDelegate() : moduleRegistryDelegate);
    }
}