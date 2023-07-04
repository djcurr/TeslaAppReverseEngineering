package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.List;
import k20.d0;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final w00.w<q<h>> f35152a = new w00.w<>("KotlinTypeRefiner");

    public static final w00.w<q<h>> a() {
        return f35152a;
    }

    public static final List<d0> b(h hVar, Iterable<? extends d0> types) {
        int t11;
        kotlin.jvm.internal.s.g(hVar, "<this>");
        kotlin.jvm.internal.s.g(types, "types");
        t11 = wz.x.t(types, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (d0 d0Var : types) {
            arrayList.add(hVar.g(d0Var));
        }
        return arrayList;
    }
}