package kotlinx.serialization.json;

import e30.j;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* loaded from: classes5.dex */
public final class q implements c30.b<JsonNull> {

    /* renamed from: a  reason: collision with root package name */
    public static final q f35663a = new q();

    /* renamed from: b  reason: collision with root package name */
    private static final e30.f f35664b = e30.i.d("kotlinx.serialization.json.JsonNull", j.b.f24589a, new e30.f[0], null, 8, null);

    private q() {
    }

    @Override // c30.a
    /* renamed from: a */
    public JsonNull deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        j.g(decoder);
        if (!decoder.D()) {
            decoder.h();
            return JsonNull.f35610a;
        }
        throw new JsonDecodingException("Expected 'null' literal");
    }

    @Override // c30.h
    /* renamed from: b */
    public void serialize(f30.f encoder, JsonNull value) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        kotlin.jvm.internal.s.g(value, "value");
        j.h(encoder);
        encoder.o();
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return f35664b;
    }
}