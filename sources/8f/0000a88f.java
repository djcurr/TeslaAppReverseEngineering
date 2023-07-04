package oy;

/* loaded from: classes5.dex */
public class h<T> extends b<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final hy.k<? super T> f45216a;

    /* renamed from: b  reason: collision with root package name */
    protected T f45217b;

    public h(hy.k<? super T> kVar) {
        this.f45216a = kVar;
    }

    public final void c(T t11) {
        int i11 = get();
        if ((i11 & 54) != 0) {
            return;
        }
        hy.k<? super T> kVar = this.f45216a;
        if (i11 == 8) {
            this.f45217b = t11;
            lazySet(16);
            kVar.b(null);
        } else {
            lazySet(2);
            kVar.b(t11);
        }
        if (get() != 4) {
            kVar.onComplete();
        }
    }

    @Override // ny.h
    public final void clear() {
        lazySet(32);
        this.f45217b = null;
    }

    @Override // iy.b
    public void dispose() {
        set(4);
        this.f45217b = null;
    }

    public final void g(Throwable th2) {
        if ((get() & 54) != 0) {
            az.a.r(th2);
            return;
        }
        lazySet(2);
        this.f45216a.onError(th2);
    }

    @Override // iy.b
    public final boolean isDisposed() {
        return get() == 4;
    }

    @Override // ny.h
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // ny.h
    public final T poll() {
        if (get() == 16) {
            T t11 = this.f45217b;
            this.f45217b = null;
            lazySet(32);
            return t11;
        }
        return null;
    }

    @Override // ny.d
    public final int requestFusion(int i11) {
        if ((i11 & 2) != 0) {
            lazySet(8);
            return 2;
        }
        return 0;
    }
}