package iv;

import bu.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.s;
import kotlin.text.w;
import wz.x;

/* loaded from: classes6.dex */
public final class a {
    public static final String[] a(List<? extends k> list) {
        int t11;
        String P0;
        s.g(list, "<this>");
        t11 = x.t(list, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (k kVar : list) {
            P0 = w.P0(kVar.name(), "AUTHENTICATIONREASON_", null, 2, null);
            arrayList.add(P0);
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }
}