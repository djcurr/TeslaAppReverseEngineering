package v20;

import vz.q;

/* loaded from: classes5.dex */
public final class c1 {
    public static final <T> void a(b1<? super T> b1Var, int i11) {
        if (r0.a()) {
            if (!(i11 != -1)) {
                throw new AssertionError();
            }
        }
        zz.d<? super T> c11 = b1Var.c();
        boolean z11 = i11 == 4;
        if (!z11 && (c11 instanceof kotlinx.coroutines.internal.i) && b(i11) == b(b1Var.f53896c)) {
            j0 j0Var = ((kotlinx.coroutines.internal.i) c11).f35463d;
            zz.g context = c11.getContext();
            if (j0Var.P0(context)) {
                j0Var.I0(context, b1Var);
                return;
            } else {
                e(b1Var);
                return;
            }
        }
        d(b1Var, c11, z11);
    }

    public static final boolean b(int i11) {
        return i11 == 1 || i11 == 2;
    }

    public static final boolean c(int i11) {
        return i11 == 2;
    }

    public static final <T> void d(b1<? super T> b1Var, zz.d<? super T> dVar, boolean z11) {
        Object e11;
        boolean b12;
        Object g11 = b1Var.g();
        Throwable d11 = b1Var.d(g11);
        if (d11 != null) {
            q.a aVar = vz.q.f54772b;
            e11 = vz.r.a(d11);
        } else {
            q.a aVar2 = vz.q.f54772b;
            e11 = b1Var.e(g11);
        }
        Object b11 = vz.q.b(e11);
        if (z11) {
            kotlinx.coroutines.internal.i iVar = (kotlinx.coroutines.internal.i) dVar;
            zz.d<T> dVar2 = iVar.f35464e;
            Object obj = iVar.f35466g;
            zz.g context = dVar2.getContext();
            Object c11 = kotlinx.coroutines.internal.j0.c(context, obj);
            g3<?> g12 = c11 != kotlinx.coroutines.internal.j0.f35469a ? i0.g(dVar2, context, c11) : null;
            try {
                iVar.f35464e.resumeWith(b11);
                vz.b0 b0Var = vz.b0.f54756a;
                if (g12 != null) {
                    if (!b12) {
                        return;
                    }
                }
                return;
            } finally {
                if (g12 == null || g12.b1()) {
                    kotlinx.coroutines.internal.j0.a(context, c11);
                }
            }
        }
        dVar.resumeWith(b11);
    }

    private static final void e(b1<?> b1Var) {
        k1 b11 = a3.f53889a.b();
        if (b11.t1()) {
            b11.Z0(b1Var);
            return;
        }
        b11.h1(true);
        try {
            d(b1Var, b1Var.c(), true);
            do {
            } while (b11.z1());
        } finally {
            try {
            } finally {
            }
        }
    }
}