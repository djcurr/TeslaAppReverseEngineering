package kotlinx.coroutines.flow;

/* loaded from: classes5.dex */
class c<T> extends y20.d<T> {

    /* renamed from: d  reason: collision with root package name */
    private final h00.p<x20.r<? super T>, zz.d<? super vz.b0>, Object> f35242d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(h00.p<? super x20.r<? super T>, ? super zz.d<? super vz.b0>, ? extends Object> pVar, zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar) {
        super(gVar, i11, aVar);
        this.f35242d = pVar;
    }

    static /* synthetic */ Object m(c cVar, x20.r rVar, zz.d dVar) {
        Object d11;
        Object invoke = cVar.f35242d.invoke(rVar, dVar);
        d11 = a00.d.d();
        return invoke == d11 ? invoke : vz.b0.f54756a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y20.d
    public Object g(x20.r<? super T> rVar, zz.d<? super vz.b0> dVar) {
        return m(this, rVar, dVar);
    }

    @Override // y20.d
    public String toString() {
        return "block[" + this.f35242d + "] -> " + super.toString();
    }
}