package g30;

import e30.e;

/* loaded from: classes5.dex */
public final class k0 implements c30.b<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final k0 f27606a = new k0();

    /* renamed from: b  reason: collision with root package name */
    private static final e30.f f27607b = new m1("kotlin.Int", e.f.f24563a);

    private k0() {
    }

    @Override // c30.a
    /* renamed from: a */
    public Integer deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        return Integer.valueOf(decoder.g());
    }

    public void b(f30.f encoder, int i11) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        encoder.A(i11);
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return f27607b;
    }

    @Override // c30.h
    public /* bridge */ /* synthetic */ void serialize(f30.f fVar, Object obj) {
        b(fVar, ((Number) obj).intValue());
    }
}