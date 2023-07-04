package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public interface f {

    /* loaded from: classes5.dex */
    public static final class a {
        public static boolean a(f fVar) {
            s.g(fVar, "this");
            return fVar.j().getIncludeAnnotationArguments();
        }

        public static boolean b(f fVar) {
            s.g(fVar, "this");
            return fVar.j().getIncludeEmptyAnnotationArguments();
        }
    }

    void a(boolean z11);

    void b(k kVar);

    void c(boolean z11);

    boolean d();

    void e(boolean z11);

    void f(boolean z11);

    void g(m mVar);

    Set<u10.c> h();

    boolean i();

    kotlin.reflect.jvm.internal.impl.renderer.a j();

    void k(Set<u10.c> set);

    void l(Set<? extends e> set);

    void m(b bVar);

    void n(boolean z11);

    void o(boolean z11);

    void p(boolean z11);
}