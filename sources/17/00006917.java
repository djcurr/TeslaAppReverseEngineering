package expo.modules.core;

import java.util.Map;
import kotlin.Metadata;
import vz.v;
import wz.r0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lexpo/modules/core/ModulePriorities;", "", "", "packageName", "", "get", "", "SUPPORTED_MODULES", "Ljava/util/Map;", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ModulePriorities {
    public static final ModulePriorities INSTANCE = new ModulePriorities();
    private static final Map<String, Integer> SUPPORTED_MODULES;

    static {
        Map<String, Integer> f11;
        f11 = r0.f(v.a("expo.modules.updates.UpdatesPackage", 10));
        SUPPORTED_MODULES = f11;
    }

    private ModulePriorities() {
    }

    public final int get(String str) {
        Integer num;
        if (str == null || (num = SUPPORTED_MODULES.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}