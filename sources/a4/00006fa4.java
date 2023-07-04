package g30;

/* loaded from: classes5.dex */
public final class b2 implements c30.b<vz.y> {

    /* renamed from: a  reason: collision with root package name */
    public static final b2 f27563a = new b2();

    /* renamed from: b  reason: collision with root package name */
    private static final e30.f f27564b = h0.a("kotlin.ULong", d30.a.v(kotlin.jvm.internal.v.f34931a));

    private b2() {
    }

    public long a(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        return vz.y.b(decoder.w(getDescriptor()).k());
    }

    public void b(f30.f encoder, long j11) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        encoder.i(getDescriptor()).m(j11);
    }

    @Override // c30.a
    public /* bridge */ /* synthetic */ Object deserialize(f30.e eVar) {
        return vz.y.a(a(eVar));
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return f27564b;
    }

    @Override // c30.h
    public /* bridge */ /* synthetic */ void serialize(f30.f fVar, Object obj) {
        b(fVar, ((vz.y) obj).f());
    }
}