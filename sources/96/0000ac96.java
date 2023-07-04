package q1;

import kotlin.jvm.internal.s;
import o1.f;
import q1.h;

/* loaded from: classes.dex */
public interface f extends h {

    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(f fVar, h00.l<? super f.c, Boolean> predicate) {
            s.g(fVar, "this");
            s.g(predicate, "predicate");
            return h.a.a(fVar, predicate);
        }

        public static <R> R b(f fVar, R r11, h00.p<? super R, ? super f.c, ? extends R> operation) {
            s.g(fVar, "this");
            s.g(operation, "operation");
            return (R) h.a.b(fVar, r11, operation);
        }

        public static <R> R c(f fVar, R r11, h00.p<? super f.c, ? super R, ? extends R> operation) {
            s.g(fVar, "this");
            s.g(operation, "operation");
            return (R) h.a.c(fVar, r11, operation);
        }

        public static o1.f d(f fVar, o1.f other) {
            s.g(fVar, "this");
            s.g(other, "other");
            return h.a.d(fVar, other);
        }
    }

    void U(b bVar);
}