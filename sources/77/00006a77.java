package expo.modules.kotlin.defaultmodules;

import android.os.Bundle;
import expo.modules.kotlin.events.EventEmitter;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lexpo/modules/kotlin/defaultmodules/ErrorManagerModule;", "Lexpo/modules/kotlin/modules/Module;", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "Lexpo/modules/kotlin/exception/CodedException;", "codedException", "Lvz/b0;", "reportExceptionToLogBox", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ErrorManagerModule extends Module {
    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
        moduleDefinitionBuilder.name("ExpoModulesCoreErrorManager");
        moduleDefinitionBuilder.events("ExpoModulesCoreErrorManager.onNewException");
        return moduleDefinitionBuilder.build();
    }

    public final void reportExceptionToLogBox(CodedException codedException) {
        s.g(codedException, "codedException");
        EventEmitter eventEmitter = getAppContext().eventEmitter(this);
        if (eventEmitter == null) {
            return;
        }
        Bundle bundle = new Bundle();
        String message = codedException.getMessage();
        if (message == null) {
            message = codedException.toString();
        }
        bundle.putString("message", message);
        b0 b0Var = b0.f54756a;
        eventEmitter.emit("ExpoModulesCoreErrorManager.onNewException", bundle);
    }
}