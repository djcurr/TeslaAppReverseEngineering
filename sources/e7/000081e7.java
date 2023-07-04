package l10;

import java.util.Iterator;

/* loaded from: classes5.dex */
public interface e0 extends d {

    /* loaded from: classes5.dex */
    public static final class a {
        public static l10.a a(e0 e0Var, u10.c fqName) {
            Object obj;
            kotlin.jvm.internal.s.g(e0Var, "this");
            kotlin.jvm.internal.s.g(fqName, "fqName");
            Iterator<T> it2 = e0Var.getAnnotations().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                u10.b j11 = ((l10.a) next).j();
                if (kotlin.jvm.internal.s.c(j11 != null ? j11.b() : null, fqName)) {
                    obj = next;
                    break;
                }
            }
            return (l10.a) obj;
        }
    }
}