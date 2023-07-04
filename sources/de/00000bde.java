package b10;

import java.lang.reflect.Modifier;
import w00.y0;
import w00.z0;

/* loaded from: classes5.dex */
public interface t extends l10.s {

    /* loaded from: classes5.dex */
    public static final class a {
        public static z0 a(t tVar) {
            kotlin.jvm.internal.s.g(tVar, "this");
            int G = tVar.G();
            if (Modifier.isPublic(G)) {
                return y0.h.f55340c;
            }
            if (Modifier.isPrivate(G)) {
                return y0.e.f55337c;
            }
            if (Modifier.isProtected(G)) {
                return Modifier.isStatic(G) ? z00.c.f60040c : z00.b.f60039c;
            }
            return z00.a.f60038c;
        }

        public static boolean b(t tVar) {
            kotlin.jvm.internal.s.g(tVar, "this");
            return Modifier.isAbstract(tVar.G());
        }

        public static boolean c(t tVar) {
            kotlin.jvm.internal.s.g(tVar, "this");
            return Modifier.isFinal(tVar.G());
        }

        public static boolean d(t tVar) {
            kotlin.jvm.internal.s.g(tVar, "this");
            return Modifier.isStatic(tVar.G());
        }
    }

    int G();
}