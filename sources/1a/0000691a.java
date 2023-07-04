package expo.modules.core;

import h00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n"}, d2 = {"T", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ModuleRegistryDelegate$getFromModuleRegistry$1<T> extends u implements a<T> {
    final /* synthetic */ ModuleRegistryDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleRegistryDelegate$getFromModuleRegistry$1(ModuleRegistryDelegate moduleRegistryDelegate) {
        super(0);
        this.this$0 = moduleRegistryDelegate;
    }

    @Override // h00.a
    public final T invoke() {
        ModuleRegistry moduleRegistry = this.this$0.getModuleRegistry();
        s.e(moduleRegistry);
        s.m(4, "T");
        return (T) moduleRegistry.getModule(Object.class);
    }
}