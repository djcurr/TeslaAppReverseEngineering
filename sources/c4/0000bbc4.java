package w00;

import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public interface x extends i {

    /* loaded from: classes5.dex */
    public static final class a {
        public static <R, D> R a(x xVar, k<R, D> visitor, D d11) {
            kotlin.jvm.internal.s.g(xVar, "this");
            kotlin.jvm.internal.s.g(visitor, "visitor");
            return visitor.f(xVar, d11);
        }

        public static i b(x xVar) {
            kotlin.jvm.internal.s.g(xVar, "this");
            return null;
        }
    }

    f0 R(u10.c cVar);

    t00.h l();

    <T> T l0(w<T> wVar);

    Collection<u10.c> r(u10.c cVar, h00.l<? super u10.f, Boolean> lVar);

    List<x> t0();

    boolean y(x xVar);
}