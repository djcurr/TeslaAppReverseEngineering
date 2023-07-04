package ty;

/* loaded from: classes5.dex */
public final class r<T> extends hy.i<T> {

    /* renamed from: a  reason: collision with root package name */
    final hy.q<? extends T> f52723a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a<T> extends oy.h<T> implements hy.o<T> {

        /* renamed from: c  reason: collision with root package name */
        iy.b f52724c;

        a(hy.k<? super T> kVar) {
            super(kVar);
        }

        @Override // hy.o
        public void a(iy.b bVar) {
            if (ly.a.validate(this.f52724c, bVar)) {
                this.f52724c = bVar;
                this.f45216a.a(this);
            }
        }

        @Override // oy.h, iy.b
        public void dispose() {
            super.dispose();
            this.f52724c.dispose();
        }

        @Override // hy.o
        public void onError(Throwable th2) {
            g(th2);
        }

        @Override // hy.o
        public void onSuccess(T t11) {
            c(t11);
        }
    }

    public r(hy.q<? extends T> qVar) {
        this.f52723a = qVar;
    }

    public static <T> hy.o<T> R(hy.k<? super T> kVar) {
        return new a(kVar);
    }

    @Override // hy.i
    public void L(hy.k<? super T> kVar) {
        this.f52723a.a(R(kVar));
    }
}