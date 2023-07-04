package kotlinx.coroutines.flow;

import v20.a2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class v<T> implements y<T>, y20.n<T>, y20.n {

    /* renamed from: a  reason: collision with root package name */
    private final a2 f35420a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ y<T> f35421b;

    /* JADX WARN: Multi-variable type inference failed */
    public v(y<? extends T> yVar, a2 a2Var) {
        this.f35420a = a2Var;
        this.f35421b = yVar;
    }

    @Override // y20.n
    public e<T> a(zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar) {
        return a0.e(this, gVar, i11, aVar);
    }

    @Override // kotlinx.coroutines.flow.y, kotlinx.coroutines.flow.e
    public Object collect(f<? super T> fVar, zz.d<?> dVar) {
        return this.f35421b.collect(fVar, dVar);
    }
}