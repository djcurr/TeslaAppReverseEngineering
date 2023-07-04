package expo.modules.core;

import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.k;
import vz.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001f\u0010\t\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00018\u00008\u00000\u0007\"\u0006\b\u0000\u0010\u0006\u0018\u0001H\u0086\bR(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lexpo/modules/core/ModuleRegistryDelegate;", "", "Lexpo/modules/core/ModuleRegistry;", "moduleRegistry", "Lvz/b0;", "onCreate", "T", "Lvz/k;", "kotlin.jvm.PlatformType", "getFromModuleRegistry", "<set-?>", "Lexpo/modules/core/ModuleRegistry;", "getModuleRegistry", "()Lexpo/modules/core/ModuleRegistry;", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ModuleRegistryDelegate {
    private ModuleRegistry moduleRegistry;

    public final /* synthetic */ <T> k<T> getFromModuleRegistry() {
        k<T> a11;
        s.l();
        a11 = m.a(new ModuleRegistryDelegate$getFromModuleRegistry$1(this));
        return a11;
    }

    public final ModuleRegistry getModuleRegistry() {
        return this.moduleRegistry;
    }

    public final void onCreate(ModuleRegistry moduleRegistry) {
        s.g(moduleRegistry, "moduleRegistry");
        this.moduleRegistry = moduleRegistry;
    }
}