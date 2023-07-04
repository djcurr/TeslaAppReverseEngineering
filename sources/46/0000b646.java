package ty;

/* loaded from: classes5.dex */
public final class f<T> extends hy.m<T> {

    /* renamed from: a  reason: collision with root package name */
    final ky.j<? extends Throwable> f52676a;

    public f(ky.j<? extends Throwable> jVar) {
        this.f52676a = jVar;
    }

    @Override // hy.m
    protected void v(hy.o<? super T> oVar) {
        try {
            th = (Throwable) yy.g.c(this.f52676a.get(), "Supplier returned a null Throwable.");
        } catch (Throwable th2) {
            th = th2;
            jy.a.b(th);
        }
        ly.b.error(th, oVar);
    }
}