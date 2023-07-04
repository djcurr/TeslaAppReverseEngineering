package g30;

/* loaded from: classes5.dex */
public final class c2 implements c30.b<vz.a0> {

    /* renamed from: a  reason: collision with root package name */
    public static final c2 f27568a = new c2();

    /* renamed from: b  reason: collision with root package name */
    private static final e30.f f27569b = h0.a("kotlin.UShort", d30.a.w(kotlin.jvm.internal.o0.f34919a));

    private c2() {
    }

    public short a(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        return vz.a0.b(decoder.w(getDescriptor()).s());
    }

    public void b(f30.f encoder, short s11) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        encoder.i(getDescriptor()).r(s11);
    }

    @Override // c30.a
    public /* bridge */ /* synthetic */ Object deserialize(f30.e eVar) {
        return vz.a0.a(a(eVar));
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return f27569b;
    }

    @Override // c30.h
    public /* bridge */ /* synthetic */ void serialize(f30.f fVar, Object obj) {
        b(fVar, ((vz.a0) obj).f());
    }
}