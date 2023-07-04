package androidx.lifecycle;

import androidx.lifecycle.p;
import v20.a2;

/* loaded from: classes.dex */
public final class LifecycleController {

    /* renamed from: a  reason: collision with root package name */
    private final p f5027a;

    /* renamed from: b  reason: collision with root package name */
    private final p.c f5028b;

    /* renamed from: c  reason: collision with root package name */
    private final h f5029c;

    /* renamed from: d  reason: collision with root package name */
    private final s f5030d;

    public LifecycleController(p lifecycle, p.c minState, h dispatchQueue, final a2 parentJob) {
        kotlin.jvm.internal.s.g(lifecycle, "lifecycle");
        kotlin.jvm.internal.s.g(minState, "minState");
        kotlin.jvm.internal.s.g(dispatchQueue, "dispatchQueue");
        kotlin.jvm.internal.s.g(parentJob, "parentJob");
        this.f5027a = lifecycle;
        this.f5028b = minState;
        this.f5029c = dispatchQueue;
        s sVar = new s() { // from class: androidx.lifecycle.LifecycleController$observer$1
            @Override // androidx.lifecycle.s
            public final void g(v source, p.b noName_1) {
                p.c cVar;
                h hVar;
                h hVar2;
                kotlin.jvm.internal.s.g(source, "source");
                kotlin.jvm.internal.s.g(noName_1, "$noName_1");
                if (source.getLifecycle().b() == p.c.DESTROYED) {
                    LifecycleController lifecycleController = LifecycleController.this;
                    a2.a.a(parentJob, null, 1, null);
                    lifecycleController.c();
                    return;
                }
                p.c b11 = source.getLifecycle().b();
                cVar = LifecycleController.this.f5028b;
                if (b11.compareTo(cVar) < 0) {
                    hVar2 = LifecycleController.this.f5029c;
                    hVar2.g();
                    return;
                }
                hVar = LifecycleController.this.f5029c;
                hVar.h();
            }
        };
        this.f5030d = sVar;
        if (lifecycle.b() == p.c.DESTROYED) {
            a2.a.a(parentJob, null, 1, null);
            c();
            return;
        }
        lifecycle.a(sVar);
    }

    public final void c() {
        this.f5027a.c(this.f5030d);
        this.f5029c.f();
    }
}