package i20;

import java.util.List;
import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import w00.u;

/* loaded from: classes5.dex */
public interface g extends w00.i, u {

    /* loaded from: classes5.dex */
    public enum a {
        COMPATIBLE,
        NEEDS_WRAPPER,
        INCOMPATIBLE
    }

    /* loaded from: classes5.dex */
    public static final class b {
        public static List<r10.h> a(g gVar) {
            s.g(gVar, "this");
            return r10.h.f49063f.a(gVar.b0(), gVar.G(), gVar.F());
        }
    }

    r10.g C();

    List<r10.h> D0();

    r10.i F();

    r10.c G();

    f H();

    o b0();
}