package or;

import java.util.List;
import nr.s;
import wz.u;

/* loaded from: classes2.dex */
public final class c {
    public static final s a(List<? extends s> list) {
        kotlin.jvm.internal.s.g(list, "<this>");
        return list.isEmpty() ? nr.e.f41794a : list.size() == 1 ? (s) u.C0(list) : new b(list);
    }
}