package w00;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public final class d0 {
    public static final void a(b0 b0Var, u10.c fqName, Collection<a0> packageFragments) {
        kotlin.jvm.internal.s.g(b0Var, "<this>");
        kotlin.jvm.internal.s.g(fqName, "fqName");
        kotlin.jvm.internal.s.g(packageFragments, "packageFragments");
        if (b0Var instanceof e0) {
            ((e0) b0Var).c(fqName, packageFragments);
        } else {
            packageFragments.addAll(b0Var.a(fqName));
        }
    }

    public static final boolean b(b0 b0Var, u10.c fqName) {
        kotlin.jvm.internal.s.g(b0Var, "<this>");
        kotlin.jvm.internal.s.g(fqName, "fqName");
        return b0Var instanceof e0 ? ((e0) b0Var).b(fqName) : c(b0Var, fqName).isEmpty();
    }

    public static final List<a0> c(b0 b0Var, u10.c fqName) {
        kotlin.jvm.internal.s.g(b0Var, "<this>");
        kotlin.jvm.internal.s.g(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        a(b0Var, fqName, arrayList);
        return arrayList;
    }
}