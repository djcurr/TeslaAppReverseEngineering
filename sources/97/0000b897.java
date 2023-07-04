package v20;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes5.dex */
public final class a1<T> extends kotlinx.coroutines.internal.d0<T> {

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f53886d = AtomicIntegerFieldUpdater.newUpdater(a1.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public a1(zz.g gVar, zz.d<? super T> dVar) {
        super(gVar, dVar);
        this._decision = 0;
    }

    private final boolean c1() {
        do {
            int i11 = this._decision;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f53886d.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean d1() {
        do {
            int i11 = this._decision;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f53886d.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // kotlinx.coroutines.internal.d0, v20.a
    protected void W0(Object obj) {
        zz.d c11;
        if (c1()) {
            return;
        }
        c11 = a00.c.c(this.f35453c);
        kotlinx.coroutines.internal.j.c(c11, f0.a(obj, this.f35453c), null, 2, null);
    }

    public final Object b1() {
        Object d11;
        if (d1()) {
            d11 = a00.d.d();
            return d11;
        }
        Object h11 = i2.h(d0());
        if (h11 instanceof c0) {
            throw ((c0) h11).f53902a;
        }
        return h11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.internal.d0, v20.h2
    public void z(Object obj) {
        W0(obj);
    }
}