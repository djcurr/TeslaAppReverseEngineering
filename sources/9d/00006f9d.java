package g30;

/* loaded from: classes5.dex */
public final class a2 implements c30.b<vz.x> {

    /* renamed from: a  reason: collision with root package name */
    public static final a2 f27555a = new a2();

    /* renamed from: b  reason: collision with root package name */
    private static final e30.f f27556b = h0.a("kotlin.UInt", d30.a.u(kotlin.jvm.internal.r.f34922a));

    private a2() {
    }

    public int a(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        return vz.x.b(decoder.w(getDescriptor()).g());
    }

    public void b(f30.f encoder, int i11) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        encoder.i(getDescriptor()).A(i11);
    }

    @Override // c30.a
    public /* bridge */ /* synthetic */ Object deserialize(f30.e eVar) {
        return vz.x.a(a(eVar));
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return f27556b;
    }

    @Override // c30.h
    public /* bridge */ /* synthetic */ void serialize(f30.f fVar, Object obj) {
        b(fVar, ((vz.x) obj).f());
    }
}