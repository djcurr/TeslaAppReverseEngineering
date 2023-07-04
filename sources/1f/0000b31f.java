package sy;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class p<T, U> extends sy.a<T, U> {

    /* renamed from: b  reason: collision with root package name */
    final ky.h<? super T, ? extends U> f50828b;

    /* loaded from: classes5.dex */
    static final class a<T, U> extends oy.a<T, U> {

        /* renamed from: f  reason: collision with root package name */
        final ky.h<? super T, ? extends U> f50829f;

        a(hy.k<? super U> kVar, ky.h<? super T, ? extends U> hVar) {
            super(kVar);
            this.f50829f = hVar;
        }

        @Override // hy.k
        public void b(T t11) {
            if (this.f45205d) {
                return;
            }
            if (this.f45206e != 0) {
                this.f45202a.b(null);
                return;
            }
            try {
                U apply = this.f50829f.apply(t11);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                this.f45202a.b(apply);
            } catch (Throwable th2) {
                h(th2);
            }
        }

        @Override // ny.h
        public U poll() {
            T poll = this.f45204c.poll();
            if (poll != null) {
                U apply = this.f50829f.apply(poll);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                return apply;
            }
            return null;
        }

        @Override // ny.d
        public int requestFusion(int i11) {
            return i(i11);
        }
    }

    public p(hy.j<T> jVar, ky.h<? super T, ? extends U> hVar) {
        super(jVar);
        this.f50828b = hVar;
    }

    @Override // hy.i
    public void L(hy.k<? super U> kVar) {
        this.f50705a.c(new a(kVar, this.f50828b));
    }
}