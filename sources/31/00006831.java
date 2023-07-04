package expo.modules;

import android.util.Log;
import expo.modules.core.ModulePriorities;
import expo.modules.core.interfaces.Package;
import h00.a;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.u;
import wz.e0;
import wz.w;
import yz.b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lexpo/modules/core/interfaces/Package;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes6.dex */
final class ExpoModulesPackage$Companion$packageList$2 extends u implements a<List<? extends Package>> {
    public static final ExpoModulesPackage$Companion$packageList$2 INSTANCE = new ExpoModulesPackage$Companion$packageList$2();

    ExpoModulesPackage$Companion$packageList$2() {
        super(0);
    }

    @Override // h00.a
    public final List<? extends Package> invoke() {
        List<? extends Package> i11;
        List<? extends Package> G0;
        try {
            Object invoke = ExpoModulesPackageList.class.getMethod("getPackageList", new Class[0]).invoke(null, new Object[0]);
            if (invoke != null) {
                G0 = e0.G0((List) invoke, new Comparator() { // from class: expo.modules.ExpoModulesPackage$Companion$packageList$2$invoke$$inlined$sortedByDescending$1
                    @Override // java.util.Comparator
                    public final int compare(T t11, T t12) {
                        int a11;
                        ModulePriorities modulePriorities = ModulePriorities.INSTANCE;
                        a11 = b.a(Integer.valueOf(modulePriorities.get(m0.b(((Package) t12).getClass()).n())), Integer.valueOf(modulePriorities.get(m0.b(((Package) t11).getClass()).n())));
                        return a11;
                    }
                });
                return G0;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<expo.modules.core.interfaces.Package>");
        } catch (Exception e11) {
            Log.e("ExpoModulesPackage", "Couldn't get expo package list.", e11);
            i11 = w.i();
            return i11;
        }
    }
}