package pv;

import androidx.camera.core.g0;
import androidx.camera.core.o;
import java.util.concurrent.CancellationException;
import pv.r;

/* loaded from: classes2.dex */
public final class v implements o.a, x20.e<r.a> {

    /* renamed from: a  reason: collision with root package name */
    private final x20.e<r.a> f46993a;

    public v(x20.e<r.a> channel) {
        kotlin.jvm.internal.s.g(channel, "channel");
        this.f46993a = channel;
    }

    @Override // androidx.camera.core.o.a
    public void a(g0 imageProxy) {
        kotlin.jvm.internal.s.g(imageProxy, "imageProxy");
    }

    @Override // x20.t
    public boolean c() {
        return this.f46993a.c();
    }

    @Override // x20.t
    public Object e(zz.d<? super r.a> dVar) {
        return this.f46993a.e(dVar);
    }

    @Override // x20.t
    public kotlinx.coroutines.selects.c<r.a> f() {
        return this.f46993a.f();
    }

    @Override // x20.x
    /* renamed from: g */
    public boolean offer(r.a element) {
        kotlin.jvm.internal.s.g(element, "element");
        return this.f46993a.offer(element);
    }

    @Override // x20.x
    /* renamed from: h */
    public Object b(r.a aVar, zz.d<? super vz.b0> dVar) {
        return this.f46993a.b(aVar, dVar);
    }

    @Override // x20.t
    public kotlinx.coroutines.selects.c<x20.i<r.a>> i() {
        return this.f46993a.i();
    }

    @Override // x20.t
    public x20.g<r.a> iterator() {
        return this.f46993a.iterator();
    }

    @Override // x20.t
    public void j(CancellationException cancellationException) {
        this.f46993a.j(cancellationException);
    }

    @Override // x20.t
    public Object k(zz.d<? super x20.i<? extends r.a>> dVar) {
        Object k11 = this.f46993a.k(dVar);
        a00.d.d();
        return k11;
    }

    @Override // x20.t
    public Object l() {
        return this.f46993a.l();
    }

    @Override // x20.x
    /* renamed from: m */
    public Object d(r.a element) {
        kotlin.jvm.internal.s.g(element, "element");
        return this.f46993a.d(element);
    }

    @Override // x20.x
    public boolean q(Throwable th2) {
        return this.f46993a.q(th2);
    }

    @Override // x20.x
    public boolean r() {
        return this.f46993a.r();
    }
}