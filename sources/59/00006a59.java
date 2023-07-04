package expo.modules.kotlin;

import android.util.Log;
import expo.modules.ExpoModulesPackageList;
import h00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lexpo/modules/kotlin/ModulesProvider;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
final class ExpoModulesHelper$Companion$modulesProvider$2 extends u implements a<ModulesProvider> {
    public static final ExpoModulesHelper$Companion$modulesProvider$2 INSTANCE = new ExpoModulesHelper$Companion$modulesProvider$2();

    ExpoModulesHelper$Companion$modulesProvider$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final ModulesProvider invoke() {
        try {
            Object newInstance = ExpoModulesPackageList.class.newInstance();
            if (newInstance != null) {
                return (ModulesProvider) newInstance;
            }
            throw new NullPointerException("null cannot be cast to non-null type expo.modules.kotlin.ModulesProvider");
        } catch (Exception e11) {
            Log.e("ExpoModulesHelper", "Couldn't get expo modules list.", e11);
            return null;
        }
    }
}