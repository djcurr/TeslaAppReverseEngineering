package x20;

import vz.b0;

/* loaded from: classes5.dex */
public final class z<E> extends y<E> {

    /* renamed from: f  reason: collision with root package name */
    public final h00.l<E, b0> f57022f;

    /* JADX WARN: Multi-variable type inference failed */
    public z(E e11, v20.o<? super b0> oVar, h00.l<? super E, b0> lVar) {
        super(e11, oVar);
        this.f57022f = lVar;
    }

    @Override // kotlinx.coroutines.internal.s
    public boolean N() {
        if (super.N()) {
            Z();
            return true;
        }
        return false;
    }

    @Override // x20.w
    public void Z() {
        kotlinx.coroutines.internal.z.b(this.f57022f, W(), this.f57021e.getContext());
    }
}