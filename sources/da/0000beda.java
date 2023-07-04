package x20;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;
import v20.h2;
import vz.b0;

/* loaded from: classes5.dex */
public class f<E> extends v20.a<b0> implements e<E> {

    /* renamed from: c  reason: collision with root package name */
    private final e<E> f57008c;

    public f(zz.g gVar, e<E> eVar, boolean z11, boolean z12) {
        super(gVar, z11, z12);
        this.f57008c = eVar;
    }

    @Override // v20.h2
    public void G(Throwable th2) {
        CancellationException P0 = h2.P0(this, th2, null, 1, null);
        this.f57008c.j(P0);
        E(P0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final e<E> a1() {
        return this.f57008c;
    }

    @Override // x20.x
    public Object b(E e11, zz.d<? super b0> dVar) {
        return this.f57008c.b(e11, dVar);
    }

    @Override // x20.t
    public boolean c() {
        return this.f57008c.c();
    }

    @Override // x20.x
    public Object d(E e11) {
        return this.f57008c.d(e11);
    }

    @Override // x20.t
    public Object e(zz.d<? super E> dVar) {
        return this.f57008c.e(dVar);
    }

    @Override // x20.t
    public kotlinx.coroutines.selects.c<E> f() {
        return this.f57008c.f();
    }

    @Override // x20.t
    public kotlinx.coroutines.selects.c<i<E>> i() {
        return this.f57008c.i();
    }

    @Override // x20.t
    public g<E> iterator() {
        return this.f57008c.iterator();
    }

    @Override // v20.h2, v20.a2
    public final void j(CancellationException cancellationException) {
        if (i0()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(K(), null, this);
        }
        G(cancellationException);
    }

    @Override // x20.t
    public Object k(zz.d<? super i<? extends E>> dVar) {
        Object k11 = this.f57008c.k(dVar);
        a00.d.d();
        return k11;
    }

    @Override // x20.t
    public Object l() {
        return this.f57008c.l();
    }

    @Override // x20.x
    public boolean offer(E e11) {
        return this.f57008c.offer(e11);
    }

    @Override // x20.x
    public boolean q(Throwable th2) {
        return this.f57008c.q(th2);
    }

    @Override // x20.x
    public boolean r() {
        return this.f57008c.r();
    }
}