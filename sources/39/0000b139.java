package rz;

import io.sentry.d0;
import io.sentry.t;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class h {

    @FunctionalInterface
    /* loaded from: classes5.dex */
    public interface a<T> {
        void accept(T t11);
    }

    @FunctionalInterface
    /* loaded from: classes5.dex */
    public interface b {
        void a(Object obj, Class<?> cls);
    }

    @FunctionalInterface
    /* loaded from: classes5.dex */
    public interface c<T> {
        void accept(T t11);
    }

    public static /* synthetic */ void a(Object obj, Class cls) {
        j(obj, cls);
    }

    public static /* synthetic */ void b(d0 d0Var, Object obj, Class cls) {
        i.a(cls, obj, d0Var);
    }

    public static /* synthetic */ void c(c cVar, Object obj, Class cls) {
        cVar.accept(obj);
    }

    public static /* synthetic */ void d(Object obj) {
        h(obj);
    }

    @ApiStatus.Internal
    public static t e(Object obj) {
        t tVar = new t();
        p(tVar, obj);
        return tVar;
    }

    @ApiStatus.Internal
    public static Object f(t tVar) {
        return tVar.b("sentry:typeCheckHint");
    }

    @ApiStatus.Internal
    public static boolean g(t tVar, Class<?> cls) {
        return cls.isInstance(f(tVar));
    }

    public static /* synthetic */ void h(Object obj) {
    }

    public static /* synthetic */ void j(Object obj, Class cls) {
    }

    @ApiStatus.Internal
    public static <T> void l(t tVar, Class<T> cls, final c<Object> cVar) {
        n(tVar, cls, new a() { // from class: rz.d
            @Override // rz.h.a
            public final void accept(Object obj) {
                h.d(obj);
            }
        }, new b() { // from class: rz.f
            @Override // rz.h.b
            public final void a(Object obj, Class cls2) {
                h.c(cVar, obj, cls2);
            }
        });
    }

    @ApiStatus.Internal
    public static <T> void m(t tVar, Class<T> cls, a<T> aVar) {
        n(tVar, cls, aVar, new b() { // from class: rz.g
            @Override // rz.h.b
            public final void a(Object obj, Class cls2) {
                h.a(obj, cls2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ApiStatus.Internal
    public static <T> void n(t tVar, Class<T> cls, a<T> aVar, b bVar) {
        Object f11 = f(tVar);
        if (g(tVar, cls) && f11 != null) {
            aVar.accept(f11);
        } else {
            bVar.a(f11, cls);
        }
    }

    @ApiStatus.Internal
    public static <T> void o(t tVar, Class<T> cls, final d0 d0Var, a<T> aVar) {
        n(tVar, cls, aVar, new b() { // from class: rz.e
            @Override // rz.h.b
            public final void a(Object obj, Class cls2) {
                h.b(d0Var, obj, cls2);
            }
        });
    }

    @ApiStatus.Internal
    public static void p(t tVar, Object obj) {
        tVar.e("sentry:typeCheckHint", obj);
    }

    @ApiStatus.Internal
    public static boolean q(t tVar) {
        return !g(tVar, oz.b.class) || g(tVar, oz.a.class);
    }
}