package e30;

import java.lang.annotation.Annotation;
import java.util.List;
import wz.u;

/* loaded from: classes5.dex */
public interface f {

    /* loaded from: classes5.dex */
    public static final class a {
        public static List<Annotation> a(f fVar) {
            return u.i();
        }

        public static boolean b(f fVar) {
            return false;
        }

        public static boolean c(f fVar) {
            return false;
        }
    }

    boolean b();

    int c(String str);

    int d();

    String e(int i11);

    List<Annotation> f(int i11);

    f g(int i11);

    List<Annotation> getAnnotations();

    j getKind();

    String h();

    boolean i(int i11);

    boolean isInline();
}