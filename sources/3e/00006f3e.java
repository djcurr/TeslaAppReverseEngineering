package g2;

import h00.l;
import h00.p;
import kotlin.jvm.internal.s;
import o1.f;

/* loaded from: classes.dex */
public interface b extends f.c {

    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(b bVar, l<? super f.c, Boolean> predicate) {
            s.g(bVar, "this");
            s.g(predicate, "predicate");
            return f.c.a.a(bVar, predicate);
        }

        public static <R> R b(b bVar, R r11, p<? super R, ? super f.c, ? extends R> operation) {
            s.g(bVar, "this");
            s.g(operation, "operation");
            return (R) f.c.a.b(bVar, r11, operation);
        }

        public static <R> R c(b bVar, R r11, p<? super f.c, ? super R, ? extends R> operation) {
            s.g(bVar, "this");
            s.g(operation, "operation");
            return (R) f.c.a.c(bVar, r11, operation);
        }

        public static o1.f d(b bVar, o1.f other) {
            s.g(bVar, "this");
            s.g(other, "other");
            return f.c.a.d(bVar, other);
        }
    }

    void n0(e eVar);
}