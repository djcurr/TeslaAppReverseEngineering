package l0;

/* loaded from: classes.dex */
final class x<T> implements w<T> {

    /* renamed from: a  reason: collision with root package name */
    private final e0 f36299a;

    public x(e0 floatDecaySpec) {
        kotlin.jvm.internal.s.g(floatDecaySpec, "floatDecaySpec");
        this.f36299a = floatDecaySpec;
    }

    @Override // l0.w
    public <V extends p> i1<V> a(d1<T, V> typeConverter) {
        kotlin.jvm.internal.s.g(typeConverter, "typeConverter");
        return new m1(this.f36299a);
    }
}