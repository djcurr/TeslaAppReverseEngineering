package v20;

import vz.q;

/* loaded from: classes5.dex */
public abstract class b1<T> extends kotlinx.coroutines.scheduling.h {

    /* renamed from: c  reason: collision with root package name */
    public int f53896c;

    public b1(int i11) {
        this.f53896c = i11;
    }

    public void b(Object obj, Throwable th2) {
    }

    public abstract zz.d<T> c();

    public Throwable d(Object obj) {
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        if (c0Var == null) {
            return null;
        }
        return c0Var.f53902a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T e(Object obj) {
        return obj;
    }

    public final void f(Throwable th2, Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            vz.f.a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        kotlin.jvm.internal.s.e(th2);
        l0.a(c().getContext(), new q0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object g();

    @Override // java.lang.Runnable
    public final void run() {
        Object b11;
        Object b12;
        if (r0.a()) {
            if (!(this.f53896c != -1)) {
                throw new AssertionError();
            }
        }
        kotlinx.coroutines.scheduling.i iVar = this.f35561b;
        try {
            kotlinx.coroutines.internal.i iVar2 = (kotlinx.coroutines.internal.i) c();
            zz.d<T> dVar = iVar2.f35464e;
            Object obj = iVar2.f35466g;
            zz.g context = dVar.getContext();
            Object c11 = kotlinx.coroutines.internal.j0.c(context, obj);
            g3<?> g11 = c11 != kotlinx.coroutines.internal.j0.f35469a ? i0.g(dVar, context, c11) : null;
            zz.g context2 = dVar.getContext();
            Object g12 = g();
            Throwable d11 = d(g12);
            a2 a2Var = (d11 == null && c1.b(this.f53896c)) ? (a2) context2.get(a2.f53887l1) : null;
            if (a2Var != null && !a2Var.a()) {
                Throwable m11 = a2Var.m();
                b(g12, m11);
                q.a aVar = vz.q.f54772b;
                if (r0.d() && (dVar instanceof kotlin.coroutines.jvm.internal.e)) {
                    m11 = kotlinx.coroutines.internal.e0.j(m11, (kotlin.coroutines.jvm.internal.e) dVar);
                }
                dVar.resumeWith(vz.q.b(vz.r.a(m11)));
            } else if (d11 != null) {
                q.a aVar2 = vz.q.f54772b;
                dVar.resumeWith(vz.q.b(vz.r.a(d11)));
            } else {
                T e11 = e(g12);
                q.a aVar3 = vz.q.f54772b;
                dVar.resumeWith(vz.q.b(e11));
            }
            vz.b0 b0Var = vz.b0.f54756a;
            if (g11 == null || g11.b1()) {
                kotlinx.coroutines.internal.j0.a(context, c11);
            }
            try {
                q.a aVar4 = vz.q.f54772b;
                iVar.a();
                b12 = vz.q.b(b0Var);
            } catch (Throwable th2) {
                q.a aVar5 = vz.q.f54772b;
                b12 = vz.q.b(vz.r.a(th2));
            }
            f(null, vz.q.e(b12));
        } catch (Throwable th3) {
            try {
                q.a aVar6 = vz.q.f54772b;
                iVar.a();
                b11 = vz.q.b(vz.b0.f54756a);
            } catch (Throwable th4) {
                q.a aVar7 = vz.q.f54772b;
                b11 = vz.q.b(vz.r.a(th4));
            }
            f(th3, vz.q.e(b11));
        }
    }
}