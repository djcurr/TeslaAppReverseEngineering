package g30;

/* loaded from: classes5.dex */
public final class a1<T> implements c30.b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final c30.b<T> f27553a;

    /* renamed from: b  reason: collision with root package name */
    private final e30.f f27554b;

    public a1(c30.b<T> serializer) {
        kotlin.jvm.internal.s.g(serializer, "serializer");
        this.f27553a = serializer;
        this.f27554b = new p1(serializer.getDescriptor());
    }

    @Override // c30.a
    public T deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        return decoder.D() ? (T) decoder.m(this.f27553a) : (T) decoder.h();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && kotlin.jvm.internal.s.c(kotlin.jvm.internal.m0.b(a1.class), kotlin.jvm.internal.m0.b(obj.getClass())) && kotlin.jvm.internal.s.c(this.f27553a, ((a1) obj).f27553a);
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return this.f27554b;
    }

    public int hashCode() {
        return this.f27553a.hashCode();
    }

    @Override // c30.h
    public void serialize(f30.f encoder, T t11) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        if (t11 != null) {
            encoder.v();
            encoder.F(this.f27553a, t11);
            return;
        }
        encoder.o();
    }
}