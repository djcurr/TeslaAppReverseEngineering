package kotlinx.coroutines.flow;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class x<T> extends a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final h00.p<f<? super T>, zz.d<? super vz.b0>, Object> f35424a;

    /* JADX WARN: Multi-variable type inference failed */
    public x(h00.p<? super f<? super T>, ? super zz.d<? super vz.b0>, ? extends Object> pVar) {
        this.f35424a = pVar;
    }

    @Override // kotlinx.coroutines.flow.a
    public Object e(f<? super T> fVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object invoke = this.f35424a.invoke(fVar, dVar);
        d11 = a00.d.d();
        return invoke == d11 ? invoke : vz.b0.f54756a;
    }
}