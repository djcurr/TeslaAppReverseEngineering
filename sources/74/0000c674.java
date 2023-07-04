package zz;

import h00.l;
import h00.p;
import kotlin.jvm.internal.s;
import vz.b0;
import vz.q;

/* loaded from: classes5.dex */
public final class f {
    public static final <R, T> d<b0> a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r11, d<? super T> completion) {
        d<b0> b11;
        d c11;
        Object d11;
        s.g(pVar, "<this>");
        s.g(completion, "completion");
        b11 = a00.c.b(pVar, r11, completion);
        c11 = a00.c.c(b11);
        d11 = a00.d.d();
        return new i(c11, d11);
    }

    public static final <T> void b(l<? super d<? super T>, ? extends Object> lVar, d<? super T> completion) {
        d<b0> a11;
        d c11;
        s.g(lVar, "<this>");
        s.g(completion, "completion");
        a11 = a00.c.a(lVar, completion);
        c11 = a00.c.c(a11);
        q.a aVar = q.f54772b;
        c11.resumeWith(q.b(b0.f54756a));
    }

    public static final <R, T> void c(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r11, d<? super T> completion) {
        d<b0> b11;
        d c11;
        s.g(pVar, "<this>");
        s.g(completion, "completion");
        b11 = a00.c.b(pVar, r11, completion);
        c11 = a00.c.c(b11);
        q.a aVar = q.f54772b;
        c11.resumeWith(q.b(b0.f54756a));
    }
}