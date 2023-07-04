package oy;

/* loaded from: classes5.dex */
public abstract class a<T, R> implements hy.k<T>, ny.c<R> {

    /* renamed from: a  reason: collision with root package name */
    protected final hy.k<? super R> f45202a;

    /* renamed from: b  reason: collision with root package name */
    protected iy.b f45203b;

    /* renamed from: c  reason: collision with root package name */
    protected ny.c<T> f45204c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f45205d;

    /* renamed from: e  reason: collision with root package name */
    protected int f45206e;

    public a(hy.k<? super R> kVar) {
        this.f45202a = kVar;
    }

    @Override // hy.k
    public final void a(iy.b bVar) {
        if (ly.a.validate(this.f45203b, bVar)) {
            this.f45203b = bVar;
            if (bVar instanceof ny.c) {
                this.f45204c = (ny.c) bVar;
            }
            if (g()) {
                this.f45202a.a(this);
                c();
            }
        }
    }

    protected void c() {
    }

    @Override // ny.h
    public void clear() {
        this.f45204c.clear();
    }

    @Override // iy.b
    public void dispose() {
        this.f45203b.dispose();
    }

    protected boolean g() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(Throwable th2) {
        jy.a.b(th2);
        this.f45203b.dispose();
        onError(th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int i(int i11) {
        ny.c<T> cVar = this.f45204c;
        if (cVar == null || (i11 & 4) != 0) {
            return 0;
        }
        int requestFusion = cVar.requestFusion(i11);
        if (requestFusion != 0) {
            this.f45206e = requestFusion;
        }
        return requestFusion;
    }

    @Override // iy.b
    public boolean isDisposed() {
        return this.f45203b.isDisposed();
    }

    @Override // ny.h
    public boolean isEmpty() {
        return this.f45204c.isEmpty();
    }

    @Override // ny.h
    public final boolean offer(R r11) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // hy.k
    public void onComplete() {
        if (this.f45205d) {
            return;
        }
        this.f45205d = true;
        this.f45202a.onComplete();
    }

    @Override // hy.k
    public void onError(Throwable th2) {
        if (this.f45205d) {
            az.a.r(th2);
            return;
        }
        this.f45205d = true;
        this.f45202a.onError(th2);
    }
}