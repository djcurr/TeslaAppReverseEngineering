package kotlinx.coroutines.scheduling;

import v20.j0;

/* loaded from: classes5.dex */
final class m extends j0 {

    /* renamed from: b  reason: collision with root package name */
    public static final m f35571b = new m();

    private m() {
    }

    @Override // v20.j0
    public void I0(zz.g gVar, Runnable runnable) {
        c.f35553g.X0(runnable, l.f35570g, false);
    }

    @Override // v20.j0
    public void J0(zz.g gVar, Runnable runnable) {
        c.f35553g.X0(runnable, l.f35570g, true);
    }
}