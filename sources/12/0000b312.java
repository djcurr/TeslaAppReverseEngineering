package sy;

/* loaded from: classes5.dex */
public final class i<T> extends sy.a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final ky.i<? super T> f50788b;

    /* loaded from: classes5.dex */
    static final class a<T> extends oy.a<T, T> {

        /* renamed from: f  reason: collision with root package name */
        final ky.i<? super T> f50789f;

        a(hy.k<? super T> kVar, ky.i<? super T> iVar) {
            super(kVar);
            this.f50789f = iVar;
        }

        @Override // hy.k
        public void b(T t11) {
            if (this.f45206e == 0) {
                try {
                    if (this.f50789f.test(t11)) {
                        this.f45202a.b(t11);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    h(th2);
                    return;
                }
            }
            this.f45202a.b(null);
        }

        @Override // ny.h
        public T poll() {
            T poll;
            do {
                poll = this.f45204c.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f50789f.test(poll));
            return poll;
        }

        @Override // ny.d
        public int requestFusion(int i11) {
            return i(i11);
        }
    }

    public i(hy.j<T> jVar, ky.i<? super T> iVar) {
        super(jVar);
        this.f50788b = iVar;
    }

    @Override // hy.i
    public void L(hy.k<? super T> kVar) {
        this.f50705a.c(new a(kVar, this.f50788b));
    }
}