package pv;

import androidx.camera.core.g0;
import androidx.camera.core.o;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class x implements o.a, x20.e<z> {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f46995a;

    /* renamed from: b  reason: collision with root package name */
    private final x20.e<z> f46996b;

    public x(a0 selfieProcessor, x20.e<z> channel) {
        kotlin.jvm.internal.s.g(selfieProcessor, "selfieProcessor");
        kotlin.jvm.internal.s.g(channel, "channel");
        this.f46995a = selfieProcessor;
        this.f46996b = channel;
    }

    @Override // androidx.camera.core.o.a
    public void a(g0 imageProxy) {
        kotlin.jvm.internal.s.g(imageProxy, "imageProxy");
        try {
            x20.j.b(this.f46996b, this.f46995a.a(imageProxy));
            f00.a.a(imageProxy, null);
        } finally {
        }
    }

    @Override // x20.t
    public boolean c() {
        return this.f46996b.c();
    }

    @Override // x20.t
    public Object e(zz.d<? super z> dVar) {
        return this.f46996b.e(dVar);
    }

    @Override // x20.t
    public kotlinx.coroutines.selects.c<z> f() {
        return this.f46996b.f();
    }

    @Override // x20.x
    /* renamed from: g */
    public boolean offer(z element) {
        kotlin.jvm.internal.s.g(element, "element");
        return this.f46996b.offer(element);
    }

    @Override // x20.x
    /* renamed from: h */
    public Object b(z zVar, zz.d<? super vz.b0> dVar) {
        return this.f46996b.b(zVar, dVar);
    }

    @Override // x20.t
    public kotlinx.coroutines.selects.c<x20.i<z>> i() {
        return this.f46996b.i();
    }

    @Override // x20.t
    public x20.g<z> iterator() {
        return this.f46996b.iterator();
    }

    @Override // x20.t
    public void j(CancellationException cancellationException) {
        this.f46996b.j(cancellationException);
    }

    @Override // x20.t
    public Object k(zz.d<? super x20.i<? extends z>> dVar) {
        Object k11 = this.f46996b.k(dVar);
        a00.d.d();
        return k11;
    }

    @Override // x20.t
    public Object l() {
        return this.f46996b.l();
    }

    @Override // x20.x
    /* renamed from: m */
    public Object d(z element) {
        kotlin.jvm.internal.s.g(element, "element");
        return this.f46996b.d(element);
    }

    @Override // x20.x
    public boolean q(Throwable th2) {
        return this.f46996b.q(th2);
    }

    @Override // x20.x
    public boolean r() {
        return this.f46996b.r();
    }
}