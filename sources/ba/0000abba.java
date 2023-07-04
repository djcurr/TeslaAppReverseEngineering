package pv;

import androidx.camera.core.g0;
import androidx.camera.core.o;
import java.util.concurrent.CancellationException;
import pv.r;

/* loaded from: classes2.dex */
public final class n implements o.a, x20.e<r.a> {

    /* renamed from: a  reason: collision with root package name */
    private final r f46970a;

    /* renamed from: b  reason: collision with root package name */
    private final x20.e<r.a> f46971b;

    public n(r governmentIdProcessor, x20.e<r.a> channel) {
        kotlin.jvm.internal.s.g(governmentIdProcessor, "governmentIdProcessor");
        kotlin.jvm.internal.s.g(channel, "channel");
        this.f46970a = governmentIdProcessor;
        this.f46971b = channel;
    }

    @Override // androidx.camera.core.o.a
    public void a(g0 imageProxy) {
        kotlin.jvm.internal.s.g(imageProxy, "imageProxy");
        try {
            x20.j.b(this.f46971b, this.f46970a.f(imageProxy));
            f00.a.a(imageProxy, null);
        } finally {
        }
    }

    @Override // x20.t
    public boolean c() {
        return this.f46971b.c();
    }

    @Override // x20.t
    public Object e(zz.d<? super r.a> dVar) {
        return this.f46971b.e(dVar);
    }

    @Override // x20.t
    public kotlinx.coroutines.selects.c<r.a> f() {
        return this.f46971b.f();
    }

    @Override // x20.x
    /* renamed from: g */
    public boolean offer(r.a element) {
        kotlin.jvm.internal.s.g(element, "element");
        return this.f46971b.offer(element);
    }

    @Override // x20.x
    /* renamed from: h */
    public Object b(r.a aVar, zz.d<? super vz.b0> dVar) {
        return this.f46971b.b(aVar, dVar);
    }

    @Override // x20.t
    public kotlinx.coroutines.selects.c<x20.i<r.a>> i() {
        return this.f46971b.i();
    }

    @Override // x20.t
    public x20.g<r.a> iterator() {
        return this.f46971b.iterator();
    }

    @Override // x20.t
    public void j(CancellationException cancellationException) {
        this.f46971b.j(cancellationException);
    }

    @Override // x20.t
    public Object k(zz.d<? super x20.i<? extends r.a>> dVar) {
        Object k11 = this.f46971b.k(dVar);
        a00.d.d();
        return k11;
    }

    @Override // x20.t
    public Object l() {
        return this.f46971b.l();
    }

    @Override // x20.x
    /* renamed from: m */
    public Object d(r.a element) {
        kotlin.jvm.internal.s.g(element, "element");
        return this.f46971b.d(element);
    }

    @Override // x20.x
    public boolean q(Throwable th2) {
        return this.f46971b.q(th2);
    }

    @Override // x20.x
    public boolean r() {
        return this.f46971b.r();
    }
}