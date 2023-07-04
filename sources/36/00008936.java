package n10;

import java.util.Collection;
import k20.d0;

/* loaded from: classes5.dex */
public interface w<T> {

    /* loaded from: classes5.dex */
    public static final class a {
        public static <T> String a(w<? extends T> wVar, w00.c classDescriptor) {
            kotlin.jvm.internal.s.g(wVar, "this");
            kotlin.jvm.internal.s.g(classDescriptor, "classDescriptor");
            return null;
        }

        public static <T> d0 b(w<? extends T> wVar, d0 kotlinType) {
            kotlin.jvm.internal.s.g(wVar, "this");
            kotlin.jvm.internal.s.g(kotlinType, "kotlinType");
            return null;
        }

        public static <T> boolean c(w<? extends T> wVar) {
            kotlin.jvm.internal.s.g(wVar, "this");
            return true;
        }
    }

    String a(w00.c cVar);

    boolean b();

    d0 c(d0 d0Var);

    void d(d0 d0Var, w00.c cVar);

    String e(w00.c cVar);

    d0 f(Collection<d0> collection);

    T g(w00.c cVar);
}