package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public class u<E> {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f35512a = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public u(boolean z11) {
        this._cur = new v(8, z11);
    }

    public final boolean a(E e11) {
        while (true) {
            v vVar = (v) this._cur;
            int a11 = vVar.a(e11);
            if (a11 == 0) {
                return true;
            }
            if (a11 == 1) {
                f35512a.compareAndSet(this, vVar, vVar.i());
            } else if (a11 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            v vVar = (v) this._cur;
            if (vVar.d()) {
                return;
            }
            f35512a.compareAndSet(this, vVar, vVar.i());
        }
    }

    public final int c() {
        return ((v) this._cur).f();
    }

    public final E d() {
        while (true) {
            v vVar = (v) this._cur;
            E e11 = (E) vVar.j();
            if (e11 != v.f35516h) {
                return e11;
            }
            f35512a.compareAndSet(this, vVar, vVar.i());
        }
    }
}