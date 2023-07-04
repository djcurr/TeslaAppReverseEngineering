package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import v20.r0;
import vz.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class k0 extends y20.c<i0<?>> {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f35286a = AtomicReferenceFieldUpdater.newUpdater(k0.class, Object.class, "_state");
    volatile /* synthetic */ Object _state = null;

    @Override // y20.c
    /* renamed from: c */
    public boolean a(i0<?> i0Var) {
        kotlinx.coroutines.internal.f0 f0Var;
        if (this._state != null) {
            return false;
        }
        f0Var = j0.f35284a;
        this._state = f0Var;
        return true;
    }

    public final Object d(zz.d<? super vz.b0> dVar) {
        zz.d c11;
        kotlinx.coroutines.internal.f0 f0Var;
        Object d11;
        Object d12;
        kotlinx.coroutines.internal.f0 f0Var2;
        c11 = a00.c.c(dVar);
        v20.p pVar = new v20.p(c11, 1);
        pVar.y();
        if (!r0.a() || (!(this._state instanceof v20.p))) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35286a;
            f0Var = j0.f35284a;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, f0Var, pVar)) {
                if (r0.a()) {
                    Object obj = this._state;
                    f0Var2 = j0.f35285b;
                    if (!(obj == f0Var2)) {
                        throw new AssertionError();
                    }
                }
                q.a aVar = vz.q.f54772b;
                pVar.resumeWith(vz.q.b(vz.b0.f54756a));
            }
            Object s11 = pVar.s();
            d11 = a00.d.d();
            if (s11 == d11) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            d12 = a00.d.d();
            return s11 == d12 ? s11 : vz.b0.f54756a;
        }
        throw new AssertionError();
    }

    @Override // y20.c
    /* renamed from: e */
    public Continuation<Unit>[] b(i0<?> i0Var) {
        this._state = null;
        return y20.b.f58995a;
    }

    public final void f() {
        kotlinx.coroutines.internal.f0 f0Var;
        kotlinx.coroutines.internal.f0 f0Var2;
        kotlinx.coroutines.internal.f0 f0Var3;
        kotlinx.coroutines.internal.f0 f0Var4;
        while (true) {
            Object obj = this._state;
            if (obj == null) {
                return;
            }
            f0Var = j0.f35285b;
            if (obj == f0Var) {
                return;
            }
            f0Var2 = j0.f35284a;
            if (obj == f0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35286a;
                f0Var3 = j0.f35285b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, f0Var3)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f35286a;
                f0Var4 = j0.f35284a;
                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, f0Var4)) {
                    q.a aVar = vz.q.f54772b;
                    ((v20.p) obj).resumeWith(vz.q.b(vz.b0.f54756a));
                    return;
                }
            }
        }
    }

    public final boolean g() {
        kotlinx.coroutines.internal.f0 f0Var;
        kotlinx.coroutines.internal.f0 f0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35286a;
        f0Var = j0.f35284a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, f0Var);
        kotlin.jvm.internal.s.e(andSet);
        if (!r0.a() || (!(andSet instanceof v20.p))) {
            f0Var2 = j0.f35285b;
            return andSet == f0Var2;
        }
        throw new AssertionError();
    }
}