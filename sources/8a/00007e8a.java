package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import k20.d0;
import k20.v;
import kotlin.jvm.internal.s;
import w00.n0;

/* loaded from: classes5.dex */
public interface c {

    /* loaded from: classes5.dex */
    public static final class a {
        public static u10.c a(c cVar) {
            s.g(cVar, "this");
            w00.c f11 = a20.a.f(cVar);
            if (f11 == null) {
                return null;
            }
            if (v.r(f11)) {
                f11 = null;
            }
            if (f11 == null) {
                return null;
            }
            return a20.a.e(f11);
        }
    }

    u10.c e();

    n0 f();

    Map<u10.f, y10.g<?>> g();

    d0 getType();
}