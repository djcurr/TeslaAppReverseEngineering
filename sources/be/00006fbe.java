package g30;

import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class h1 {
    public static final int a(e30.f fVar, e30.f[] typeParams) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(typeParams, "typeParams");
        int hashCode = (fVar.h().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable<e30.f> a11 = e30.h.a(fVar);
        Iterator<e30.f> it2 = a11.iterator();
        int i11 = 1;
        int i12 = 1;
        while (true) {
            int i13 = 0;
            if (!it2.hasNext()) {
                break;
            }
            int i14 = i12 * 31;
            String h11 = it2.next().h();
            if (h11 != null) {
                i13 = h11.hashCode();
            }
            i12 = i14 + i13;
        }
        for (e30.f fVar2 : a11) {
            int i15 = i11 * 31;
            e30.j kind = fVar2.getKind();
            i11 = i15 + (kind != null ? kind.hashCode() : 0);
        }
        return (((hashCode * 31) + i12) * 31) + i11;
    }
}