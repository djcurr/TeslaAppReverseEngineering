package t1;

import t1.m0;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a  reason: collision with root package name */
    private static final c1 f51514a = new a();

    /* loaded from: classes.dex */
    public static final class a implements c1 {
        a() {
        }

        @Override // t1.c1
        /* renamed from: b */
        public m0.b a(long j11, x2.q layoutDirection, x2.d density) {
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.s.g(density, "density");
            return new m0.b(s1.m.c(j11));
        }

        public String toString() {
            return "RectangleShape";
        }
    }

    public static final c1 a() {
        return f51514a;
    }
}