package c1;

/* loaded from: classes.dex */
final class v0<T> implements u0<T>, o0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final zz.g f8708a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ o0<T> f8709b;

    public v0(o0<T> state, zz.g coroutineContext) {
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(coroutineContext, "coroutineContext");
        this.f8708a = coroutineContext;
        this.f8709b = state;
    }

    @Override // v20.o0
    public zz.g J() {
        return this.f8708a;
    }

    @Override // c1.o0, c1.v1
    public T getValue() {
        return this.f8709b.getValue();
    }

    @Override // c1.o0
    public void setValue(T t11) {
        this.f8709b.setValue(t11);
    }
}