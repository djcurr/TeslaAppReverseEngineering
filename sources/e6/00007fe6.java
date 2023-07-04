package kotlinx.coroutines.flow;

import v20.a2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class w<T> implements h0<T>, y20.n<T>, y20.n {

    /* renamed from: a  reason: collision with root package name */
    private final a2 f35422a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ h0<T> f35423b;

    /* JADX WARN: Multi-variable type inference failed */
    public w(h0<? extends T> h0Var, a2 a2Var) {
        this.f35422a = a2Var;
        this.f35423b = h0Var;
    }

    @Override // y20.n
    public e<T> a(zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar) {
        return j0.d(this, gVar, i11, aVar);
    }

    @Override // kotlinx.coroutines.flow.y, kotlinx.coroutines.flow.e
    public Object collect(f<? super T> fVar, zz.d<?> dVar) {
        return this.f35423b.collect(fVar, dVar);
    }

    @Override // kotlinx.coroutines.flow.h0
    public T getValue() {
        return this.f35423b.getValue();
    }
}