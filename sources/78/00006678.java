package dz;

import b80.c;
import hy.f;
import java.util.concurrent.atomic.AtomicReference;
import yy.e;

/* loaded from: classes5.dex */
public abstract class a<T> implements f<T>, iy.b {

    /* renamed from: a  reason: collision with root package name */
    final AtomicReference<c> f24366a = new AtomicReference<>();

    protected void a() {
        this.f24366a.get().request(Long.MAX_VALUE);
    }

    @Override // hy.f, b80.b
    public final void c(c cVar) {
        if (e.c(this.f24366a, cVar, getClass())) {
            a();
        }
    }

    @Override // iy.b
    public final void dispose() {
        xy.e.cancel(this.f24366a);
    }

    @Override // iy.b
    public final boolean isDisposed() {
        return this.f24366a.get() == xy.e.CANCELLED;
    }
}