package c2;

import h00.l;
import h00.p;
import kotlin.jvm.internal.s;
import o1.f;

/* loaded from: classes.dex */
public interface e extends f.c {

    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(e eVar, l<? super f.c, Boolean> predicate) {
            s.g(eVar, "this");
            s.g(predicate, "predicate");
            return f.c.a.a(eVar, predicate);
        }

        public static <R> R b(e eVar, R r11, p<? super R, ? super f.c, ? extends R> operation) {
            s.g(eVar, "this");
            s.g(operation, "operation");
            return (R) f.c.a.b(eVar, r11, operation);
        }

        public static <R> R c(e eVar, R r11, p<? super f.c, ? super R, ? extends R> operation) {
            s.g(eVar, "this");
            s.g(operation, "operation");
            return (R) f.c.a.c(eVar, r11, operation);
        }

        public static o1.f d(e eVar, o1.f other) {
            s.g(eVar, "this");
            s.g(other, "other");
            return f.c.a.d(eVar, other);
        }
    }

    c2.a getConnection();

    d q0();
}