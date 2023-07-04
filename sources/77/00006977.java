package expo.modules.filesystem;

import expo.modules.core.ModuleRegistry;
import expo.modules.core.ModuleRegistryDelegate;
import expo.modules.interfaces.filesystem.FilePermissionModuleInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¨\u0006\u0002"}, d2 = {"T", "kotlin.jvm.PlatformType", "expo/modules/filesystem/FileSystemModule$moduleRegistry$$inlined$getFromModuleRegistry$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class FileSystemModule$permissionsForPath$$inlined$moduleRegistry$1 extends u implements h00.a<FilePermissionModuleInterface> {
    final /* synthetic */ ModuleRegistryDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemModule$permissionsForPath$$inlined$moduleRegistry$1(ModuleRegistryDelegate moduleRegistryDelegate) {
        super(0);
        this.this$0 = moduleRegistryDelegate;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [expo.modules.interfaces.filesystem.FilePermissionModuleInterface, java.lang.Object] */
    @Override // h00.a
    public final FilePermissionModuleInterface invoke() {
        ModuleRegistry moduleRegistry = this.this$0.getModuleRegistry();
        s.e(moduleRegistry);
        return moduleRegistry.getModule(FilePermissionModuleInterface.class);
    }
}