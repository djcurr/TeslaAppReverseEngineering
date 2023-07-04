package c1;

/* loaded from: classes.dex */
public final class l0<T> implements v1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final vz.k f8613a;

    public l0(h00.a<? extends T> valueProducer) {
        kotlin.jvm.internal.s.g(valueProducer, "valueProducer");
        this.f8613a = vz.l.a(valueProducer);
    }

    private final T b() {
        return (T) this.f8613a.getValue();
    }

    @Override // c1.v1
    public T getValue() {
        return b();
    }
}