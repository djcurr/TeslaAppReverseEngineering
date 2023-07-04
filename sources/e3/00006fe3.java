package g30;

import e30.e;

/* loaded from: classes5.dex */
public final class u implements c30.b<Double> {

    /* renamed from: a  reason: collision with root package name */
    public static final u f27643a = new u();

    /* renamed from: b  reason: collision with root package name */
    private static final e30.f f27644b = new m1("kotlin.Double", e.d.f24561a);

    private u() {
    }

    @Override // c30.a
    /* renamed from: a */
    public Double deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        return Double.valueOf(decoder.v());
    }

    public void b(f30.f encoder, double d11) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        encoder.e(d11);
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return f27644b;
    }

    @Override // c30.h
    public /* bridge */ /* synthetic */ void serialize(f30.f fVar, Object obj) {
        b(fVar, ((Number) obj).doubleValue());
    }
}