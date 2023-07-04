package expo.modules.kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vz.k;
import vz.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lexpo/modules/kotlin/ExpoModulesHelper;", "", "<init>", "()V", "Companion", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ExpoModulesHelper {
    public static final Companion Companion = new Companion(null);
    private static final k<ModulesProvider> modulesProvider$delegate;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\bR%\u0010\t\u001a\u0004\u0018\u00010\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lexpo/modules/kotlin/ExpoModulesHelper$Companion;", "", "Lexpo/modules/kotlin/ModulesProvider;", "modulesProvider$delegate", "Lvz/k;", "getModulesProvider", "()Lexpo/modules/kotlin/ModulesProvider;", "getModulesProvider$annotations", "()V", "modulesProvider", "<init>", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getModulesProvider$annotations() {
        }

        public final ModulesProvider getModulesProvider() {
            return (ModulesProvider) ExpoModulesHelper.modulesProvider$delegate.getValue();
        }
    }

    static {
        k<ModulesProvider> a11;
        a11 = m.a(ExpoModulesHelper$Companion$modulesProvider$2.INSTANCE);
        modulesProvider$delegate = a11;
    }
}