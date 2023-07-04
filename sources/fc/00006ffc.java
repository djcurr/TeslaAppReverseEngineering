package g30;

/* loaded from: classes5.dex */
public final class z1 implements c30.b<vz.w> {

    /* renamed from: a  reason: collision with root package name */
    public static final z1 f27692a = new z1();

    /* renamed from: b  reason: collision with root package name */
    private static final e30.f f27693b = h0.a("kotlin.UByte", d30.a.q(kotlin.jvm.internal.e.f34899a));

    private z1() {
    }

    public byte a(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        return vz.w.b(decoder.w(getDescriptor()).F());
    }

    public void b(f30.f encoder, byte b11) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        encoder.i(getDescriptor()).g(b11);
    }

    @Override // c30.a
    public /* bridge */ /* synthetic */ Object deserialize(f30.e eVar) {
        return vz.w.a(a(eVar));
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return f27693b;
    }

    @Override // c30.h
    public /* bridge */ /* synthetic */ void serialize(f30.f fVar, Object obj) {
        b(fVar, ((vz.w) obj).f());
    }
}