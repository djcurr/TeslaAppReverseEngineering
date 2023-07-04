package q1;

import kotlin.jvm.internal.s;
import o1.f;

/* loaded from: classes.dex */
public interface h extends f.c {

    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(h hVar, h00.l<? super f.c, Boolean> predicate) {
            s.g(hVar, "this");
            s.g(predicate, "predicate");
            return f.c.a.a(hVar, predicate);
        }

        public static <R> R b(h hVar, R r11, h00.p<? super R, ? super f.c, ? extends R> operation) {
            s.g(hVar, "this");
            s.g(operation, "operation");
            return (R) f.c.a.b(hVar, r11, operation);
        }

        public static <R> R c(h hVar, R r11, h00.p<? super f.c, ? super R, ? extends R> operation) {
            s.g(hVar, "this");
            s.g(operation, "operation");
            return (R) f.c.a.c(hVar, r11, operation);
        }

        public static o1.f d(h hVar, o1.f other) {
            s.g(hVar, "this");
            s.g(other, "other");
            return f.c.a.d(hVar, other);
        }
    }

    void X(v1.c cVar);
}