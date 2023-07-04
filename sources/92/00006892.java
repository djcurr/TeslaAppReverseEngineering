package expo.modules.battery;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import expo.modules.core.BasePackage;
import expo.modules.core.ExportedModule;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.v;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lexpo/modules/battery/BatteryPackage;", "Lexpo/modules/core/BasePackage;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lexpo/modules/core/ExportedModule;", "createExportedModules", "<init>", "()V", "expo-battery_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class BatteryPackage extends BasePackage {
    @Override // expo.modules.core.BasePackage, expo.modules.core.interfaces.Package
    public List<ExportedModule> createExportedModules(Context context) {
        List<ExportedModule> d11;
        s.g(context, "context");
        d11 = v.d(new BatteryModule(context));
        return d11;
    }
}