package sy;

/* loaded from: classes5.dex */
public final class g<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    private final ky.f<? super iy.b> f50785b;

    /* renamed from: c  reason: collision with root package name */
    private final ky.a f50786c;

    public g(hy.i<T> iVar, ky.f<? super iy.b> fVar, ky.a aVar) {
        super(iVar);
        this.f50785b = fVar;
        this.f50786c = aVar;
    }

    @Override // hy.i
    protected void L(hy.k<? super T> kVar) {
        this.f50705a.c(new oy.i(kVar, this.f50785b, this.f50786c));
    }
}