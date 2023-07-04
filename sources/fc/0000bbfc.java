package w10;

import java.util.Collection;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class p {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.b a(Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> descriptors) {
        Integer d11;
        s.g(descriptors, "descriptors");
        descriptors.isEmpty();
        kotlin.reflect.jvm.internal.impl.descriptors.b bVar = null;
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar2 : descriptors) {
            if (bVar == null || ((d11 = w00.p.d(bVar.getVisibility(), bVar2.getVisibility())) != null && d11.intValue() < 0)) {
                bVar = bVar2;
            }
        }
        s.e(bVar);
        return bVar;
    }
}