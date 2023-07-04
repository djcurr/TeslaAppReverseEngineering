package v20;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
final class d1 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final j0 f53907a;

    public d1(j0 j0Var) {
        this.f53907a = j0Var;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f53907a.I0(zz.h.f61280a, runnable);
    }

    public String toString() {
        return this.f53907a.toString();
    }
}