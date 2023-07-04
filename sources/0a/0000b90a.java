package v20;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class u2<T, R> extends g2 {

    /* renamed from: e  reason: collision with root package name */
    private final kotlinx.coroutines.selects.d<R> f54008e;

    /* renamed from: f  reason: collision with root package name */
    private final h00.p<T, zz.d<? super R>, Object> f54009f;

    /* JADX WARN: Multi-variable type inference failed */
    public u2(kotlinx.coroutines.selects.d<? super R> dVar, h00.p<? super T, ? super zz.d<? super R>, ? extends Object> pVar) {
        this.f54008e = dVar;
        this.f54009f = pVar;
    }

    @Override // v20.e0
    public void V(Throwable th2) {
        if (this.f54008e.k()) {
            W().K0(this.f54008e, this.f54009f);
        }
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(Throwable th2) {
        V(th2);
        return vz.b0.f54756a;
    }
}