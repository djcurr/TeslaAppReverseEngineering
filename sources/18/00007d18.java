package k20;

import ch.qos.logback.classic.spi.CallerData;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class k0 extends j1 implements m20.j, m20.k {
    public k0() {
        super(null);
    }

    public abstract k0 O0(boolean z11);

    public abstract k0 P0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar);

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> it2 = getAnnotations().iterator();
        while (it2.hasNext()) {
            kotlin.text.s.j(sb2, "[", kotlin.reflect.jvm.internal.impl.renderer.c.s(kotlin.reflect.jvm.internal.impl.renderer.c.f35081c, it2.next(), null, 2, null), "] ");
        }
        sb2.append(H0());
        if (!G0().isEmpty()) {
            wz.e0.j0(G0(), sb2, ", ", "<", ">", 0, null, null, 112, null);
        }
        if (I0()) {
            sb2.append(CallerData.NA);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}