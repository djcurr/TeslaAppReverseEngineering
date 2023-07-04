package g2;

import h00.l;
import h00.p;
import kotlin.jvm.internal.s;
import o1.f;

/* loaded from: classes.dex */
public interface d<T> extends f.c {

    /* loaded from: classes.dex */
    public static final class a {
        public static <T> boolean a(d<T> dVar, l<? super f.c, Boolean> predicate) {
            s.g(dVar, "this");
            s.g(predicate, "predicate");
            return f.c.a.a(dVar, predicate);
        }

        public static <T, R> R b(d<T> dVar, R r11, p<? super R, ? super f.c, ? extends R> operation) {
            s.g(dVar, "this");
            s.g(operation, "operation");
            return (R) f.c.a.b(dVar, r11, operation);
        }

        public static <T, R> R c(d<T> dVar, R r11, p<? super f.c, ? super R, ? extends R> operation) {
            s.g(dVar, "this");
            s.g(operation, "operation");
            return (R) f.c.a.c(dVar, r11, operation);
        }

        public static <T> o1.f d(d<T> dVar, o1.f other) {
            s.g(dVar, "this");
            s.g(other, "other");
            return f.c.a.d(dVar, other);
        }
    }

    f<T> getKey();

    T getValue();
}