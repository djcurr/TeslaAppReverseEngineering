package e30;

import g30.p1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b {
    public static final n00.d<?> a(f fVar) {
        s.g(fVar, "<this>");
        if (fVar instanceof c) {
            return ((c) fVar).f24554b;
        }
        if (fVar instanceof p1) {
            return a(((p1) fVar).j());
        }
        return null;
    }

    public static final f b(i30.c cVar, f descriptor) {
        c30.b c11;
        s.g(cVar, "<this>");
        s.g(descriptor, "descriptor");
        n00.d<?> a11 = a(descriptor);
        if (a11 == null || (c11 = i30.c.c(cVar, a11, null, 2, null)) == null) {
            return null;
        }
        return c11.getDescriptor();
    }

    public static final f c(f fVar, n00.d<?> context) {
        s.g(fVar, "<this>");
        s.g(context, "context");
        return new c(fVar, context);
    }
}