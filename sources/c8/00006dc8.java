package f8;

import java.util.List;

/* loaded from: classes.dex */
public class d {
    private static <T> List<i8.a<T>> a(g8.c cVar, float f11, v7.d dVar, m0<T> m0Var) {
        return u.a(cVar, dVar, f11, m0Var, false);
    }

    private static <T> List<i8.a<T>> b(g8.c cVar, v7.d dVar, m0<T> m0Var) {
        return u.a(cVar, dVar, 1.0f, m0Var, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b8.a c(g8.c cVar, v7.d dVar) {
        return new b8.a(b(cVar, dVar, g.f26069a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b8.j d(g8.c cVar, v7.d dVar) {
        return new b8.j(b(cVar, dVar, i.f26074a));
    }

    public static b8.b e(g8.c cVar, v7.d dVar) {
        return f(cVar, dVar, true);
    }

    public static b8.b f(g8.c cVar, v7.d dVar, boolean z11) {
        return new b8.b(a(cVar, z11 ? h8.h.e() : 1.0f, dVar, l.f26092a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b8.c g(g8.c cVar, v7.d dVar, int i11) {
        return new b8.c(b(cVar, dVar, new o(i11)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b8.d h(g8.c cVar, v7.d dVar) {
        return new b8.d(b(cVar, dVar, r.f26103a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b8.f i(g8.c cVar, v7.d dVar) {
        return new b8.f(u.a(cVar, dVar, h8.h.e(), b0.f26059a, true));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b8.g j(g8.c cVar, v7.d dVar) {
        return new b8.g(b(cVar, dVar, f0.f26068a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b8.h k(g8.c cVar, v7.d dVar) {
        return new b8.h(a(cVar, h8.h.e(), dVar, g0.f26070a));
    }
}