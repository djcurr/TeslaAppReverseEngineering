package g30;

import e30.e;

/* loaded from: classes5.dex */
public final class u1 implements c30.b<String> {

    /* renamed from: a  reason: collision with root package name */
    public static final u1 f27647a = new u1();

    /* renamed from: b  reason: collision with root package name */
    private static final e30.f f27648b = new m1("kotlin.String", e.i.f24566a);

    private u1() {
    }

    @Override // c30.a
    /* renamed from: a */
    public String deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        return decoder.B();
    }

    @Override // c30.h
    /* renamed from: b */
    public void serialize(f30.f encoder, String value) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        kotlin.jvm.internal.s.g(value, "value");
        encoder.E(value);
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return f27648b;
    }
}