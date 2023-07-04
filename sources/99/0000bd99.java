package wy;

/* loaded from: classes5.dex */
public abstract class b<T, R> implements hy.f<T>, ny.e<R> {

    /* renamed from: a  reason: collision with root package name */
    protected final b80.b<? super R> f56442a;

    /* renamed from: b  reason: collision with root package name */
    protected b80.c f56443b;

    /* renamed from: c  reason: collision with root package name */
    protected ny.e<T> f56444c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f56445d;

    /* renamed from: e  reason: collision with root package name */
    protected int f56446e;

    public b(b80.b<? super R> bVar) {
        this.f56442a = bVar;
    }

    protected void a() {
    }

    @Override // hy.f, b80.b
    public final void c(b80.c cVar) {
        if (xy.e.validate(this.f56443b, cVar)) {
            this.f56443b = cVar;
            if (cVar instanceof ny.e) {
                this.f56444c = (ny.e) cVar;
            }
            if (d()) {
                this.f56442a.c(this);
                a();
            }
        }
    }

    @Override // b80.c
    public void cancel() {
        this.f56443b.cancel();
    }

    @Override // ny.h
    public void clear() {
        this.f56444c.clear();
    }

    protected boolean d() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(Throwable th2) {
        jy.a.b(th2);
        this.f56443b.cancel();
        onError(th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int f(int i11) {
        ny.e<T> eVar = this.f56444c;
        if (eVar == null || (i11 & 4) != 0) {
            return 0;
        }
        int requestFusion = eVar.requestFusion(i11);
        if (requestFusion != 0) {
            this.f56446e = requestFusion;
        }
        return requestFusion;
    }

    @Override // ny.h
    public boolean isEmpty() {
        return this.f56444c.isEmpty();
    }

    @Override // ny.h
    public final boolean offer(R r11) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // b80.b
    public abstract void onError(Throwable th2);

    @Override // b80.c
    public void request(long j11) {
        this.f56443b.request(j11);
    }
}