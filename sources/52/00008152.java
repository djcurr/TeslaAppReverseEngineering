package l0;

import l0.p;

/* loaded from: classes.dex */
final class e1<T, V extends p> implements d1<T, V> {

    /* renamed from: a  reason: collision with root package name */
    private final h00.l<T, V> f36106a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<V, T> f36107b;

    /* JADX WARN: Multi-variable type inference failed */
    public e1(h00.l<? super T, ? extends V> convertToVector, h00.l<? super V, ? extends T> convertFromVector) {
        kotlin.jvm.internal.s.g(convertToVector, "convertToVector");
        kotlin.jvm.internal.s.g(convertFromVector, "convertFromVector");
        this.f36106a = convertToVector;
        this.f36107b = convertFromVector;
    }

    @Override // l0.d1
    public h00.l<T, V> a() {
        return this.f36106a;
    }

    @Override // l0.d1
    public h00.l<V, T> b() {
        return this.f36107b;
    }
}