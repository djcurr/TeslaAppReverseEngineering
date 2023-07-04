package expo.modules.keepawake;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import expo.modules.core.ExportedModule;
import expo.modules.core.interfaces.InternalModule;
import expo.modules.core.interfaces.Package;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.v;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lexpo/modules/keepawake/KeepAwakePackage;", "Lexpo/modules/core/interfaces/Package;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lexpo/modules/core/ExportedModule;", "createExportedModules", "Lexpo/modules/core/interfaces/InternalModule;", "createInternalModules", "<init>", "()V", "expo-keep-awake_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class KeepAwakePackage implements Package {
    @Override // expo.modules.core.interfaces.Package
    public List<ExportedModule> createExportedModules(Context context) {
        List<ExportedModule> d11;
        s.g(context, "context");
        d11 = v.d(new KeepAwakeModule(context, null, 2, null));
        return d11;
    }

    @Override // expo.modules.core.interfaces.Package
    public List<InternalModule> createInternalModules(Context context) {
        List<InternalModule> d11;
        s.g(context, "context");
        d11 = v.d(new ExpoKeepAwakeManager(null, 1, null));
        return d11;
    }
}