package f1;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class h<T> extends a<T> {

    /* renamed from: c  reason: collision with root package name */
    private final f<T> f25498c;

    /* renamed from: d  reason: collision with root package name */
    private int f25499d;

    /* renamed from: e  reason: collision with root package name */
    private k<? extends T> f25500e;

    /* renamed from: f  reason: collision with root package name */
    private int f25501f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f<T> builder, int i11) {
        super(i11, builder.size());
        s.g(builder, "builder");
        this.f25498c = builder;
        this.f25499d = builder.h();
        this.f25501f = -1;
        m();
    }

    private final void i() {
        if (this.f25499d != this.f25498c.h()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void j() {
        if (this.f25501f == -1) {
            throw new IllegalStateException();
        }
    }

    private final void k() {
        h(this.f25498c.size());
        this.f25499d = this.f25498c.h();
        this.f25501f = -1;
        m();
    }

    private final void m() {
        int i11;
        Object[] i12 = this.f25498c.i();
        if (i12 == null) {
            this.f25500e = null;
            return;
        }
        int d11 = l.d(this.f25498c.size());
        i11 = m00.l.i(c(), d11);
        int j11 = (this.f25498c.j() / 5) + 1;
        k<? extends T> kVar = this.f25500e;
        if (kVar == null) {
            this.f25500e = new k<>(i12, i11, d11, j11);
            return;
        }
        s.e(kVar);
        kVar.m(i12, i11, d11, j11);
    }

    @Override // f1.a, java.util.ListIterator
    public void add(T t11) {
        i();
        this.f25498c.add(c(), t11);
        f(c() + 1);
        k();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        i();
        a();
        this.f25501f = c();
        k<? extends T> kVar = this.f25500e;
        if (kVar == null) {
            Object[] k11 = this.f25498c.k();
            int c11 = c();
            f(c11 + 1);
            return (T) k11[c11];
        } else if (kVar.hasNext()) {
            f(c() + 1);
            return kVar.next();
        } else {
            Object[] k12 = this.f25498c.k();
            int c12 = c();
            f(c12 + 1);
            return (T) k12[c12 - kVar.e()];
        }
    }

    @Override // java.util.ListIterator
    public T previous() {
        i();
        b();
        this.f25501f = c() - 1;
        k<? extends T> kVar = this.f25500e;
        if (kVar == null) {
            Object[] k11 = this.f25498c.k();
            f(c() - 1);
            return (T) k11[c()];
        } else if (c() > kVar.e()) {
            Object[] k12 = this.f25498c.k();
            f(c() - 1);
            return (T) k12[c() - kVar.e()];
        } else {
            f(c() - 1);
            return kVar.previous();
        }
    }

    @Override // f1.a, java.util.ListIterator, java.util.Iterator
    public void remove() {
        i();
        j();
        this.f25498c.remove(this.f25501f);
        if (this.f25501f < c()) {
            f(this.f25501f);
        }
        k();
    }

    @Override // f1.a, java.util.ListIterator
    public void set(T t11) {
        i();
        j();
        this.f25498c.set(this.f25501f, t11);
        this.f25499d = this.f25498c.h();
        m();
    }
}