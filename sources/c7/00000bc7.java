package b10;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;

/* loaded from: classes5.dex */
public interface f extends l10.d {

    /* loaded from: classes5.dex */
    public static final class a {
        public static c a(f fVar, u10.c fqName) {
            Annotation[] declaredAnnotations;
            kotlin.jvm.internal.s.g(fVar, "this");
            kotlin.jvm.internal.s.g(fqName, "fqName");
            AnnotatedElement element = fVar.getElement();
            if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
                return null;
            }
            return g.a(declaredAnnotations, fqName);
        }

        public static List<c> b(f fVar) {
            List<c> i11;
            kotlin.jvm.internal.s.g(fVar, "this");
            AnnotatedElement element = fVar.getElement();
            Annotation[] declaredAnnotations = element == null ? null : element.getDeclaredAnnotations();
            if (declaredAnnotations == null) {
                i11 = wz.w.i();
                return i11;
            }
            return g.b(declaredAnnotations);
        }

        public static boolean c(f fVar) {
            kotlin.jvm.internal.s.g(fVar, "this");
            return false;
        }
    }

    AnnotatedElement getElement();
}