package d;

import vz.b0;

/* loaded from: classes.dex */
public final class a<I> {

    /* renamed from: a  reason: collision with root package name */
    private androidx.activity.result.d<I> f23217a;

    public final void a(I i11, androidx.core.app.b bVar) {
        b0 b0Var;
        androidx.activity.result.d<I> dVar = this.f23217a;
        if (dVar == null) {
            b0Var = null;
        } else {
            dVar.c(i11, bVar);
            b0Var = b0.f54756a;
        }
        if (b0Var == null) {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }

    public final void b(androidx.activity.result.d<I> dVar) {
        this.f23217a = dVar;
    }

    public final void c() {
        b0 b0Var;
        androidx.activity.result.d<I> dVar = this.f23217a;
        if (dVar == null) {
            b0Var = null;
        } else {
            dVar.d();
            b0Var = b0.f54756a;
        }
        if (b0Var == null) {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }
}