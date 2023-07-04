package g30;

import e30.e;

/* loaded from: classes5.dex */
public final class i implements c30.b<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final i f27597a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final e30.f f27598b = new m1("kotlin.Boolean", e.a.f24558a);

    private i() {
    }

    @Override // c30.a
    /* renamed from: a */
    public Boolean deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        return Boolean.valueOf(decoder.y());
    }

    public void b(f30.f encoder, boolean z11) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        encoder.s(z11);
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return f27598b;
    }

    @Override // c30.h
    public /* bridge */ /* synthetic */ void serialize(f30.f fVar, Object obj) {
        b(fVar, ((Boolean) obj).booleanValue());
    }
}