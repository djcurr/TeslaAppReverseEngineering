package g30;

import e30.e;

/* loaded from: classes5.dex */
public final class p implements c30.b<Character> {

    /* renamed from: a  reason: collision with root package name */
    public static final p f27623a = new p();

    /* renamed from: b  reason: collision with root package name */
    private static final e30.f f27624b = new m1("kotlin.Char", e.c.f24560a);

    private p() {
    }

    @Override // c30.a
    /* renamed from: a */
    public Character deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        return Character.valueOf(decoder.z());
    }

    public void b(f30.f encoder, char c11) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        encoder.u(c11);
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return f27624b;
    }

    @Override // c30.h
    public /* bridge */ /* synthetic */ void serialize(f30.f fVar, Object obj) {
        b(fVar, ((Character) obj).charValue());
    }
}