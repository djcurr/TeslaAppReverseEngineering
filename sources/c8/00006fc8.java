package g30;

import e30.e;

/* loaded from: classes5.dex */
public final class l implements c30.b<Byte> {

    /* renamed from: a  reason: collision with root package name */
    public static final l f27609a = new l();

    /* renamed from: b  reason: collision with root package name */
    private static final e30.f f27610b = new m1("kotlin.Byte", e.b.f24559a);

    private l() {
    }

    @Override // c30.a
    /* renamed from: a */
    public Byte deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        return Byte.valueOf(decoder.F());
    }

    public void b(f30.f encoder, byte b11) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        encoder.g(b11);
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return f27610b;
    }

    @Override // c30.h
    public /* bridge */ /* synthetic */ void serialize(f30.f fVar, Object obj) {
        b(fVar, ((Number) obj).byteValue());
    }
}