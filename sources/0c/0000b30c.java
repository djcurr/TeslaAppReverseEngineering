package sy;

/* loaded from: classes5.dex */
public final class e<T, K> extends sy.a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final ky.h<? super T, K> f50768b;

    /* renamed from: c  reason: collision with root package name */
    final ky.d<? super K, ? super K> f50769c;

    /* loaded from: classes5.dex */
    static final class a<T, K> extends oy.a<T, T> {

        /* renamed from: f  reason: collision with root package name */
        final ky.h<? super T, K> f50770f;

        /* renamed from: g  reason: collision with root package name */
        final ky.d<? super K, ? super K> f50771g;

        /* renamed from: h  reason: collision with root package name */
        K f50772h;

        /* renamed from: i  reason: collision with root package name */
        boolean f50773i;

        a(hy.k<? super T> kVar, ky.h<? super T, K> hVar, ky.d<? super K, ? super K> dVar) {
            super(kVar);
            this.f50770f = hVar;
            this.f50771g = dVar;
        }

        @Override // hy.k
        public void b(T t11) {
            if (this.f45205d) {
                return;
            }
            if (this.f45206e != 0) {
                this.f45202a.b(t11);
                return;
            }
            try {
                K apply = this.f50770f.apply(t11);
                if (this.f50773i) {
                    boolean a11 = this.f50771g.a((K) this.f50772h, apply);
                    this.f50772h = apply;
                    if (a11) {
                        return;
                    }
                } else {
                    this.f50773i = true;
                    this.f50772h = apply;
                }
                this.f45202a.b(t11);
            } catch (Throwable th2) {
                h(th2);
            }
        }

        @Override // ny.h
        public T poll() {
            while (true) {
                T poll = this.f45204c.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f50770f.apply(poll);
                if (!this.f50773i) {
                    this.f50773i = true;
                    this.f50772h = apply;
                    return poll;
                } else if (!this.f50771g.a((K) this.f50772h, apply)) {
                    this.f50772h = apply;
                    return poll;
                } else {
                    this.f50772h = apply;
                }
            }
        }

        @Override // ny.d
        public int requestFusion(int i11) {
            return i(i11);
        }
    }

    public e(hy.j<T> jVar, ky.h<? super T, K> hVar, ky.d<? super K, ? super K> dVar) {
        super(jVar);
        this.f50768b = hVar;
        this.f50769c = dVar;
    }

    @Override // hy.i
    protected void L(hy.k<? super T> kVar) {
        this.f50705a.c(new a(kVar, this.f50768b, this.f50769c));
    }
}