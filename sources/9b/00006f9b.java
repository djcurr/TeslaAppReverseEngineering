package g30;

import e30.e;

/* loaded from: classes5.dex */
public final class a0 implements c30.b<Float> {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f27551a = new a0();

    /* renamed from: b  reason: collision with root package name */
    private static final e30.f f27552b = new m1("kotlin.Float", e.C0475e.f24562a);

    private a0() {
    }

    @Override // c30.a
    /* renamed from: a */
    public Float deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        return Float.valueOf(decoder.t());
    }

    public void b(f30.f encoder, float f11) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        encoder.t(f11);
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return f27552b;
    }

    @Override // c30.h
    public /* bridge */ /* synthetic */ void serialize(f30.f fVar, Object obj) {
        b(fVar, ((Number) obj).floatValue());
    }
}