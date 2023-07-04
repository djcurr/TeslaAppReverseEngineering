package p00;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import n00.f;
import n00.p;
import n00.q;
import q00.b0;
import q00.x;
import wz.u;

/* loaded from: classes5.dex */
public final class b {
    public static final n00.d<?> a(f jvmErasure) {
        Object obj;
        n00.d<?> b11;
        boolean z11;
        s.g(jvmErasure, "$this$jvmErasure");
        if (jvmErasure instanceof n00.d) {
            return (n00.d) jvmErasure;
        }
        if (jvmErasure instanceof q) {
            List<p> upperBounds = ((q) jvmErasure).getUpperBounds();
            Iterator<T> it2 = upperBounds.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                p pVar = (p) next;
                Objects.requireNonNull(pVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
                Object n11 = ((x) pVar).r().H0().n();
                w00.c cVar = (w00.c) (n11 instanceof w00.c ? n11 : null);
                if (cVar == null || cVar.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.c.INTERFACE || cVar.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.c.ANNOTATION_CLASS) {
                    z11 = false;
                    continue;
                } else {
                    z11 = true;
                    continue;
                }
                if (z11) {
                    obj = next;
                    break;
                }
            }
            p pVar2 = (p) obj;
            if (pVar2 == null) {
                pVar2 = (p) u.d0(upperBounds);
            }
            return (pVar2 == null || (b11 = b(pVar2)) == null) ? m0.b(Object.class) : b11;
        }
        throw new b0("Cannot calculate JVM erasure for type: " + jvmErasure);
    }

    public static final n00.d<?> b(p jvmErasure) {
        n00.d<?> a11;
        s.g(jvmErasure, "$this$jvmErasure");
        f c11 = jvmErasure.c();
        if (c11 == null || (a11 = a(c11)) == null) {
            throw new b0("Cannot calculate JVM erasure for type: " + jvmErasure);
        }
        return a11;
    }
}