package g30;

import e30.e;

/* loaded from: classes5.dex */
public final class u0 implements c30.b<Long> {

    /* renamed from: a  reason: collision with root package name */
    public static final u0 f27645a = new u0();

    /* renamed from: b  reason: collision with root package name */
    private static final e30.f f27646b = new m1("kotlin.Long", e.g.f24564a);

    private u0() {
    }

    @Override // c30.a
    /* renamed from: a */
    public Long deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        return Long.valueOf(decoder.k());
    }

    public void b(f30.f encoder, long j11) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        encoder.m(j11);
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return f27646b;
    }

    @Override // c30.h
    public /* bridge */ /* synthetic */ void serialize(f30.f fVar, Object obj) {
        b(fVar, ((Number) obj).longValue());
    }
}