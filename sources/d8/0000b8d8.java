package v20;

/* loaded from: classes5.dex */
public abstract class k1 extends j0 {

    /* renamed from: b  reason: collision with root package name */
    private long f53962b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f53963c;

    /* renamed from: d  reason: collision with root package name */
    private kotlinx.coroutines.internal.a<b1<?>> f53964d;

    public static /* synthetic */ void S0(k1 k1Var, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        k1Var.R0(z11);
    }

    private final long X0(boolean z11) {
        return z11 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void p1(k1 k1Var, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        k1Var.h1(z11);
    }

    public boolean D1() {
        return false;
    }

    @Override // v20.j0
    public final j0 Q0(int i11) {
        kotlinx.coroutines.internal.p.a(i11);
        return this;
    }

    public final void R0(boolean z11) {
        long X0 = this.f53962b - X0(z11);
        this.f53962b = X0;
        if (X0 > 0) {
            return;
        }
        if (r0.a()) {
            if (!(this.f53962b == 0)) {
                throw new AssertionError();
            }
        }
        if (this.f53963c) {
            shutdown();
        }
    }

    public final void Z0(b1<?> b1Var) {
        kotlinx.coroutines.internal.a<b1<?>> aVar = this.f53964d;
        if (aVar == null) {
            aVar = new kotlinx.coroutines.internal.a<>();
            this.f53964d = aVar;
        }
        aVar.a(b1Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long b1() {
        kotlinx.coroutines.internal.a<b1<?>> aVar = this.f53964d;
        return (aVar == null || aVar.c()) ? Long.MAX_VALUE : 0L;
    }

    public final void h1(boolean z11) {
        this.f53962b += X0(z11);
        if (z11) {
            return;
        }
        this.f53963c = true;
    }

    public void shutdown() {
    }

    public final boolean t1() {
        return this.f53962b >= X0(true);
    }

    public final boolean v1() {
        kotlinx.coroutines.internal.a<b1<?>> aVar = this.f53964d;
        if (aVar == null) {
            return true;
        }
        return aVar.c();
    }

    public long y1() {
        return !z1() ? Long.MAX_VALUE : 0L;
    }

    public final boolean z1() {
        b1<?> d11;
        kotlinx.coroutines.internal.a<b1<?>> aVar = this.f53964d;
        if (aVar == null || (d11 = aVar.d()) == null) {
            return false;
        }
        d11.run();
        return true;
    }
}