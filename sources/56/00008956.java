package n2;

/* loaded from: classes.dex */
public final class o {
    public static final n a(n start, n stop, float f11) {
        kotlin.jvm.internal.s.g(start, "start");
        kotlin.jvm.internal.s.g(stop, "stop");
        w2.d dVar = (w2.d) t.b(start.d(), stop.d(), f11);
        w2.f fVar = (w2.f) t.b(start.e(), stop.e(), f11);
        long c11 = t.c(start.c(), stop.c(), f11);
        w2.i f12 = start.f();
        if (f12 == null) {
            f12 = new w2.i(0L, 0L, 3, null);
        }
        w2.i f13 = stop.f();
        if (f13 == null) {
            f13 = new w2.i(0L, 0L, 3, null);
        }
        return new n(dVar, fVar, c11, w2.j.a(f12, f13, f11), null);
    }
}