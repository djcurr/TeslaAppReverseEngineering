package xy;

/* loaded from: classes5.dex */
public class c<T> extends a<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final b80.b<? super T> f57761a;

    /* renamed from: b  reason: collision with root package name */
    protected T f57762b;

    public c(b80.b<? super T> bVar) {
        this.f57761a = bVar;
    }

    public void cancel() {
        set(4);
        this.f57762b = null;
    }

    @Override // ny.h
    public final void clear() {
        lazySet(32);
        this.f57762b = null;
    }

    public final void d(T t11) {
        int i11 = get();
        while (i11 != 8) {
            if ((i11 & (-3)) != 0) {
                return;
            }
            if (i11 == 2) {
                lazySet(3);
                b80.b<? super T> bVar = this.f57761a;
                bVar.b(t11);
                if (get() != 4) {
                    bVar.onComplete();
                    return;
                }
                return;
            }
            this.f57762b = t11;
            if (compareAndSet(0, 1)) {
                return;
            }
            i11 = get();
            if (i11 == 4) {
                this.f57762b = null;
                return;
            }
        }
        this.f57762b = t11;
        lazySet(16);
        b80.b<? super T> bVar2 = this.f57761a;
        bVar2.b(null);
        if (get() != 4) {
            bVar2.onComplete();
        }
    }

    @Override // ny.h
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // ny.h
    public final T poll() {
        if (get() == 16) {
            lazySet(32);
            T t11 = this.f57762b;
            this.f57762b = null;
            return t11;
        }
        return null;
    }

    @Override // b80.c
    public final void request(long j11) {
        T t11;
        if (e.validate(j11)) {
            do {
                int i11 = get();
                if ((i11 & (-2)) != 0) {
                    return;
                }
                if (i11 == 1) {
                    if (!compareAndSet(1, 3) || (t11 = this.f57762b) == null) {
                        return;
                    }
                    this.f57762b = null;
                    b80.b<? super T> bVar = this.f57761a;
                    bVar.b(t11);
                    if (get() != 4) {
                        bVar.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
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