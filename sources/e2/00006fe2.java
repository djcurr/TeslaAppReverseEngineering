package g30;

import e30.e;

/* loaded from: classes5.dex */
public final class t1 implements c30.b<Short> {

    /* renamed from: a  reason: collision with root package name */
    public static final t1 f27641a = new t1();

    /* renamed from: b  reason: collision with root package name */
    private static final e30.f f27642b = new m1("kotlin.Short", e.h.f24565a);

    private t1() {
    }

    @Override // c30.a
    /* renamed from: a */
    public Short deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        return Short.valueOf(decoder.s());
    }

    public void b(f30.f encoder, short s11) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        encoder.r(s11);
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return f27642b;
    }

    @Override // c30.h
    public /* bridge */ /* synthetic */ void serialize(f30.f fVar, Object obj) {
        b(fVar, ((Number) obj).shortValue());
    }
}