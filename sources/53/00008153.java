package l0;

/* loaded from: classes.dex */
public final class f {
    public static final <T, V extends p> z0<T, V> a(i<T> animationSpec, d1<T, V> typeConverter, T t11, T t12, T t13) {
        kotlin.jvm.internal.s.g(animationSpec, "animationSpec");
        kotlin.jvm.internal.s.g(typeConverter, "typeConverter");
        return new z0<>(animationSpec, typeConverter, t11, t12, typeConverter.a().invoke(t13));
    }

    public static final long b(d<?, ?> dVar) {
        kotlin.jvm.internal.s.g(dVar, "<this>");
        return dVar.d() / 1000000;
    }
}