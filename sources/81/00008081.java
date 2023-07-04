package kotlinx.serialization.json;

import h30.j0;

/* loaded from: classes5.dex */
public abstract class u<T> implements c30.b<T> {
    private final c30.b<T> tSerializer;

    public u(c30.b<T> tSerializer) {
        kotlin.jvm.internal.s.g(tSerializer, "tSerializer");
        this.tSerializer = tSerializer;
    }

    @Override // c30.a
    public final T deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        g d11 = j.d(decoder);
        return (T) d11.c().d(this.tSerializer, transformDeserialize(d11.f()));
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // c30.h
    public final void serialize(f30.f encoder, T value) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        kotlin.jvm.internal.s.g(value, "value");
        k e11 = j.e(encoder);
        e11.z(transformSerialize(j0.c(e11.c(), value, this.tSerializer)));
    }

    protected abstract JsonElement transformDeserialize(JsonElement jsonElement);

    protected JsonElement transformSerialize(JsonElement element) {
        kotlin.jvm.internal.s.g(element, "element");
        return element;
    }
}