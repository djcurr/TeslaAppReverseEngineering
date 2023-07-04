package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import v20.a2;
import v20.a3;
import v20.g3;
import v20.k1;
import v20.r0;
import vz.q;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a */
    private static final f0 f35467a = new f0("UNDEFINED");

    /* renamed from: b */
    public static final f0 f35468b = new f0("REUSABLE_CLAIMED");

    public static final /* synthetic */ f0 a() {
        return f35467a;
    }

    public static final <T> void b(zz.d<? super T> dVar, Object obj, h00.l<? super Throwable, vz.b0> lVar) {
        boolean z11;
        if (dVar instanceof i) {
            i iVar = (i) dVar;
            Object b11 = v20.f0.b(obj, lVar);
            if (iVar.f35463d.P0(iVar.getContext())) {
                iVar.f35465f = b11;
                iVar.f53896c = 1;
                iVar.f35463d.I0(iVar.getContext(), iVar);
                return;
            }
            r0.a();
            k1 b12 = a3.f53889a.b();
            if (b12.t1()) {
                iVar.f35465f = b11;
                iVar.f53896c = 1;
                b12.Z0(iVar);
                return;
            }
            b12.h1(true);
            try {
                a2 a2Var = (a2) iVar.getContext().get(a2.f53887l1);
                if (a2Var == null || a2Var.a()) {
                    z11 = false;
                } else {
                    CancellationException m11 = a2Var.m();
                    iVar.b(b11, m11);
                    q.a aVar = vz.q.f54772b;
                    iVar.resumeWith(vz.q.b(vz.r.a(m11)));
                    z11 = true;
                }
                if (!z11) {
                    zz.d<T> dVar2 = iVar.f35464e;
                    Object obj2 = iVar.f35466g;
                    zz.g context = dVar2.getContext();
                    Object c11 = j0.c(context, obj2);
                    g3<?> g11 = c11 != j0.f35469a ? v20.i0.g(dVar2, context, c11) : null;
                    iVar.f35464e.resumeWith(obj);
                    vz.b0 b0Var = vz.b0.f54756a;
                    if (g11 == null || g11.b1()) {
                        j0.a(context, c11);
                    }
                }
                do {
                } while (b12.z1());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        dVar.resumeWith(obj);
    }

    public static /* synthetic */ void c(zz.d dVar, Object obj, h00.l lVar, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        b(dVar, obj, lVar);
    }

    public static final boolean d(i<? super vz.b0> iVar) {
        vz.b0 b0Var = vz.b0.f54756a;
        r0.a();
        k1 b11 = a3.f53889a.b();
        if (b11.v1()) {
            return false;
        }
        if (b11.t1()) {
            iVar.f35465f = b0Var;
            iVar.f53896c = 1;
            b11.Z0(iVar);
            return true;
        }
        b11.h1(true);
        try {
            iVar.run();
            do {
            } while (b11.z1());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}