package kotlinx.serialization.json;

import e30.e;
import kotlin.jvm.internal.m0;

/* loaded from: classes5.dex */
public final class s implements c30.b<JsonPrimitive> {

    /* renamed from: a  reason: collision with root package name */
    public static final s f35670a = new s();

    /* renamed from: b  reason: collision with root package name */
    private static final e30.f f35671b = e30.i.d("kotlinx.serialization.json.JsonPrimitive", e.i.f24566a, new e30.f[0], null, 8, null);

    private s() {
    }

    @Override // c30.a
    /* renamed from: a */
    public JsonPrimitive deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        JsonElement f11 = j.d(decoder).f();
        if (f11 instanceof JsonPrimitive) {
            return (JsonPrimitive) f11;
        }
        throw h30.o.f(-1, "Unexpected JSON element, expected JsonPrimitive, had " + m0.b(f11.getClass()), f11.toString());
    }

    @Override // c30.h
    /* renamed from: b */
    public void serialize(f30.f encoder, JsonPrimitive value) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        kotlin.jvm.internal.s.g(value, "value");
        j.h(encoder);
        if (value instanceof JsonNull) {
            encoder.F(q.f35663a, JsonNull.f35610a);
        } else {
            encoder.F(o.f35661a, (n) value);
        }
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return f35671b;
    }
}