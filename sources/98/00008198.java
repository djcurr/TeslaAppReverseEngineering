package l0;

/* loaded from: classes.dex */
public final class q {
    public static final m a(float f11) {
        return new m(f11);
    }

    public static final <T extends p> T b(T t11) {
        kotlin.jvm.internal.s.g(t11, "<this>");
        T t12 = (T) d(t11);
        int b11 = t12.b();
        for (int i11 = 0; i11 < b11; i11++) {
            t12.e(i11, t11.a(i11));
        }
        return t12;
    }

    public static final <T extends p> void c(T t11, T source) {
        kotlin.jvm.internal.s.g(t11, "<this>");
        kotlin.jvm.internal.s.g(source, "source");
        int b11 = t11.b();
        for (int i11 = 0; i11 < b11; i11++) {
            t11.e(i11, source.a(i11));
        }
    }

    public static final <T extends p> T d(T t11) {
        kotlin.jvm.internal.s.g(t11, "<this>");
        return (T) t11.c();
    }
}