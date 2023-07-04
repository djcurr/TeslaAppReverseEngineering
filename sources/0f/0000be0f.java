package x0;

/* loaded from: classes.dex */
public final class n {
    public static final boolean a(s1.h containsInclusive, long j11) {
        kotlin.jvm.internal.s.g(containsInclusive, "$this$containsInclusive");
        float i11 = containsInclusive.i();
        float j12 = containsInclusive.j();
        float l11 = s1.f.l(j11);
        if (i11 <= l11 && l11 <= j12) {
            float l12 = containsInclusive.l();
            float e11 = containsInclusive.e();
            float m11 = s1.f.m(j11);
            if (l12 <= m11 && m11 <= e11) {
                return true;
            }
        }
        return false;
    }

    public static final s1.h b(f2.o oVar) {
        kotlin.jvm.internal.s.g(oVar, "<this>");
        s1.h c11 = f2.p.c(oVar);
        return s1.i.a(oVar.o(c11.m()), oVar.o(c11.f()));
    }
}