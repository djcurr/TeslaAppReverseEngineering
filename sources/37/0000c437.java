package z20;

import h00.l;
import h00.p;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.r0;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.internal.e0;
import kotlinx.coroutines.internal.j0;
import v20.c0;
import v20.i2;
import vz.q;
import vz.r;
import zz.d;
import zz.g;

/* loaded from: classes5.dex */
public final class b {
    public static final <T> void a(l<? super d<? super T>, ? extends Object> lVar, d<? super T> dVar) {
        Object d11;
        d a11 = h.a(dVar);
        try {
            g context = dVar.getContext();
            Object c11 = j0.c(context, null);
            Object invoke = ((l) r0.f(lVar, 1)).invoke(a11);
            j0.a(context, c11);
            d11 = a00.d.d();
            if (invoke != d11) {
                q.a aVar = q.f54772b;
                a11.resumeWith(q.b(invoke));
            }
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            a11.resumeWith(q.b(r.a(th2)));
        }
    }

    public static final <R, T> void b(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r11, d<? super T> dVar) {
        Object d11;
        d a11 = h.a(dVar);
        try {
            g context = dVar.getContext();
            Object c11 = j0.c(context, null);
            Object invoke = ((p) r0.f(pVar, 2)).invoke(r11, a11);
            j0.a(context, c11);
            d11 = a00.d.d();
            if (invoke != d11) {
                q.a aVar = q.f54772b;
                a11.resumeWith(q.b(invoke));
            }
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            a11.resumeWith(q.b(r.a(th2)));
        }
    }

    public static final <R, T> void c(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r11, d<? super T> dVar) {
        Object d11;
        d a11 = h.a(dVar);
        try {
            Object invoke = ((p) r0.f(pVar, 2)).invoke(r11, a11);
            d11 = a00.d.d();
            if (invoke != d11) {
                q.a aVar = q.f54772b;
                a11.resumeWith(q.b(invoke));
            }
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            a11.resumeWith(q.b(r.a(th2)));
        }
    }

    public static final <T, R> Object d(d0<? super T> d0Var, R r11, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object c0Var;
        Object d11;
        Throwable j11;
        Object d12;
        Object d13;
        try {
            c0Var = ((p) r0.f(pVar, 2)).invoke(r11, d0Var);
        } catch (Throwable th2) {
            c0Var = new c0(th2, false, 2, null);
        }
        d11 = a00.d.d();
        if (c0Var == d11) {
            d13 = a00.d.d();
            return d13;
        }
        Object r02 = d0Var.r0(c0Var);
        if (r02 == i2.f53949b) {
            d12 = a00.d.d();
            return d12;
        } else if (r02 instanceof c0) {
            Throwable th3 = ((c0) r02).f53902a;
            d<? super T> dVar = d0Var.f35453c;
            if (v20.r0.d() && (dVar instanceof e)) {
                j11 = e0.j(th3, (e) dVar);
                throw j11;
            }
            throw th3;
        } else {
            return i2.h(r02);
        }
    }

    public static final <T, R> Object e(d0<? super T> d0Var, R r11, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object c0Var;
        Object d11;
        Throwable j11;
        Throwable j12;
        Object d12;
        Object d13;
        boolean z11 = false;
        try {
            c0Var = ((p) r0.f(pVar, 2)).invoke(r11, d0Var);
        } catch (Throwable th2) {
            c0Var = new c0(th2, false, 2, null);
        }
        d11 = a00.d.d();
        if (c0Var == d11) {
            d13 = a00.d.d();
            return d13;
        }
        Object r02 = d0Var.r0(c0Var);
        if (r02 == i2.f53949b) {
            d12 = a00.d.d();
            return d12;
        }
        if (r02 instanceof c0) {
            Throwable th3 = ((c0) r02).f53902a;
            if (((th3 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th3).f35228a == d0Var) ? true : true) {
                d<? super T> dVar = d0Var.f35453c;
                if (v20.r0.d() && (dVar instanceof e)) {
                    j12 = e0.j(th3, (e) dVar);
                    throw j12;
                }
                throw th3;
            } else if (c0Var instanceof c0) {
                Throwable th4 = ((c0) c0Var).f53902a;
                d<? super T> dVar2 = d0Var.f35453c;
                if (v20.r0.d() && (dVar2 instanceof e)) {
                    j11 = e0.j(th4, (e) dVar2);
                    throw j11;
                }
                throw th4;
            }
        } else {
            c0Var = i2.h(r02);
        }
        return c0Var;
    }
}