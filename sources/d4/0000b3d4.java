package t00;

import java.util.Set;
import kotlin.jvm.internal.s;
import wz.e0;

/* loaded from: classes5.dex */
public final class d {
    public static final boolean a(c cVar, w00.c classDescriptor) {
        boolean T;
        s.g(cVar, "<this>");
        s.g(classDescriptor, "classDescriptor");
        if (w10.d.x(classDescriptor)) {
            Set<u10.b> b11 = cVar.b();
            u10.b h11 = a20.a.h(classDescriptor);
            T = e0.T(b11, h11 == null ? null : h11.g());
            if (T) {
                return true;
            }
        }
        return false;
    }
}