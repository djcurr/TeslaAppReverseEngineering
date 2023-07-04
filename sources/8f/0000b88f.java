package v2;

import android.text.Spannable;
import java.util.List;
import kotlin.jvm.internal.s;
import n2.a;
import n2.p;
import n2.q;
import x2.r;
import x2.t;

/* loaded from: classes.dex */
public final class c {
    private static final int a(long j11) {
        long g11 = r.g(j11);
        t.a aVar = t.f56961b;
        if (t.g(g11, aVar.b())) {
            return 0;
        }
        return t.g(g11, aVar.a()) ? 1 : 2;
    }

    private static final int b(int i11) {
        q.a aVar = q.f40322a;
        if (q.i(i11, aVar.a())) {
            return 0;
        }
        if (q.i(i11, aVar.g())) {
            return 1;
        }
        if (q.i(i11, aVar.b())) {
            return 2;
        }
        if (q.i(i11, aVar.c())) {
            return 3;
        }
        if (q.i(i11, aVar.f())) {
            return 4;
        }
        if (q.i(i11, aVar.d())) {
            return 5;
        }
        if (q.i(i11, aVar.e())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
    }

    private static final void c(Spannable spannable, p pVar, int i11, int i12, x2.d dVar) {
        e.o(spannable, new q2.f(r.h(pVar.c()), a(pVar.c()), r.h(pVar.a()), a(pVar.a()), dVar.c0() * dVar.getDensity(), b(pVar.b())), i11, i12);
    }

    public static final void d(Spannable spannable, List<a.b<p>> placeholders, x2.d density) {
        s.g(spannable, "<this>");
        s.g(placeholders, "placeholders");
        s.g(density, "density");
        int size = placeholders.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            a.b<p> bVar = placeholders.get(i11);
            c(spannable, bVar.a(), bVar.b(), bVar.c(), density);
            i11 = i12;
        }
    }
}