package z20;

import a00.c;
import h00.l;
import h00.p;
import kotlinx.coroutines.internal.j;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;

/* loaded from: classes5.dex */
public final class a {
    private static final void a(d<?> dVar, Throwable th2) {
        q.a aVar = q.f54772b;
        dVar.resumeWith(q.b(r.a(th2)));
        throw th2;
    }

    public static final <T> void b(l<? super d<? super T>, ? extends Object> lVar, d<? super T> dVar) {
        d<b0> a11;
        d c11;
        try {
            a11 = c.a(lVar, dVar);
            c11 = c.c(a11);
            q.a aVar = q.f54772b;
            j.c(c11, q.b(b0.f54756a), null, 2, null);
        } catch (Throwable th2) {
            a(dVar, th2);
        }
    }

    public static final <R, T> void c(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r11, d<? super T> dVar, l<? super Throwable, b0> lVar) {
        d<b0> b11;
        d c11;
        try {
            b11 = c.b(pVar, r11, dVar);
            c11 = c.c(b11);
            q.a aVar = q.f54772b;
            j.b(c11, q.b(b0.f54756a), lVar);
        } catch (Throwable th2) {
            a(dVar, th2);
        }
    }

    public static final void d(d<? super b0> dVar, d<?> dVar2) {
        d c11;
        try {
            c11 = c.c(dVar);
            q.a aVar = q.f54772b;
            j.c(c11, q.b(b0.f54756a), null, 2, null);
        } catch (Throwable th2) {
            a(dVar2, th2);
        }
    }

    public static /* synthetic */ void e(p pVar, Object obj, d dVar, l lVar, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        c(pVar, obj, dVar, lVar);
    }
}