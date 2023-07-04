package expo.modules.constants;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.core.ExportedModule;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.ModuleRegistryDelegate;
import expo.modules.core.Promise;
import expo.modules.core.interfaces.ExpoMethod;
import expo.modules.interfaces.constants.ConstantsInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.k;
import vz.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00018\u00008\u00000\u0003\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0082\bJ\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lexpo/modules/constants/ConstantsModule;", "Lexpo/modules/core/ExportedModule;", "T", "Lvz/k;", "kotlin.jvm.PlatformType", "moduleRegistry", "", "", "", "getConstants", "getName", "Lexpo/modules/core/ModuleRegistry;", "Lvz/b0;", "onCreate", "Lexpo/modules/core/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getWebViewUserAgentAsync", "Lexpo/modules/core/ModuleRegistryDelegate;", "moduleRegistryDelegate", "Lexpo/modules/core/ModuleRegistryDelegate;", "Lexpo/modules/interfaces/constants/ConstantsInterface;", "constantsService$delegate", "Lvz/k;", "getConstantsService", "()Lexpo/modules/interfaces/constants/ConstantsInterface;", "constantsService", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Lexpo/modules/core/ModuleRegistryDelegate;)V", "expo-constants_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ConstantsModule extends ExportedModule {
    private final k constantsService$delegate;
    private final ModuleRegistryDelegate moduleRegistryDelegate;

    public /* synthetic */ ConstantsModule(Context context, ModuleRegistryDelegate moduleRegistryDelegate, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? new ModuleRegistryDelegate() : moduleRegistryDelegate);
    }

    private final ConstantsInterface getConstantsService() {
        Object value = this.constantsService$delegate.getValue();
        s.f(value, "<get-constantsService>(...)");
        return (ConstantsInterface) value;
    }

    private final /* synthetic */ <T> k<T> moduleRegistry() {
        k<T> a11;
        ModuleRegistryDelegate moduleRegistryDelegate = this.moduleRegistryDelegate;
        s.l();
        a11 = m.a(new ConstantsModule$moduleRegistry$$inlined$getFromModuleRegistry$1(moduleRegistryDelegate));
        return a11;
    }

    @Override // expo.modules.core.ExportedModule
    public Map<String, Object> getConstants() {
        Map<String, Object> constants = getConstantsService().getConstants();
        s.f(constants, "constantsService.constants");
        return constants;
    }

    @Override // expo.modules.core.ExportedModule
    public String getName() {
        return "ExponentConstants";
    }

    @ExpoMethod
    public final void getWebViewUserAgentAsync(Promise promise) {
        s.g(promise, "promise");
        promise.resolve(System.getProperty("http.agent"));
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onCreate(ModuleRegistry moduleRegistry) {
        s.g(moduleRegistry, "moduleRegistry");
        this.moduleRegistryDelegate.onCreate(moduleRegistry);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstantsModule(Context context, ModuleRegistryDelegate moduleRegistryDelegate) {
        super(context);
        k a11;
        s.g(context, "context");
        s.g(moduleRegistryDelegate, "moduleRegistryDelegate");
        this.moduleRegistryDelegate = moduleRegistryDelegate;
        a11 = m.a(new ConstantsModule$special$$inlined$moduleRegistry$1(this.moduleRegistryDelegate));
        this.constantsService$delegate = a11;
    }
}