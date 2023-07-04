package g30;

/* loaded from: classes5.dex */
public final class d2 implements c30.b<vz.b0> {

    /* renamed from: b  reason: collision with root package name */
    public static final d2 f27571b = new d2();

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ b1<vz.b0> f27572a = new b1<>("kotlin.Unit", vz.b0.f54756a);

    private d2() {
    }

    public void a(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        this.f27572a.deserialize(decoder);
    }

    @Override // c30.h
    /* renamed from: b */
    public void serialize(f30.f encoder, vz.b0 value) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        kotlin.jvm.internal.s.g(value, "value");
        this.f27572a.serialize(encoder, value);
    }

    @Override // c30.a
    public /* bridge */ /* synthetic */ Object deserialize(f30.e eVar) {
        a(eVar);
        return vz.b0.f54756a;
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return this.f27572a.getDescriptor();
    }
}