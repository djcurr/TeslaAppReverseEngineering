package h30;

import kotlinx.serialization.json.JsonElement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class s extends d {

    /* renamed from: f  reason: collision with root package name */
    private JsonElement f28862f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(kotlinx.serialization.json.a json, h00.l<? super JsonElement, vz.b0> nodeConsumer) {
        super(json, nodeConsumer, null);
        kotlin.jvm.internal.s.g(json, "json");
        kotlin.jvm.internal.s.g(nodeConsumer, "nodeConsumer");
        Y("primitive");
    }

    @Override // h30.d
    public JsonElement q0() {
        JsonElement jsonElement = this.f28862f;
        if (jsonElement != null) {
            return jsonElement;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?".toString());
    }

    @Override // h30.d
    public void r0(String key, JsonElement element) {
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(element, "element");
        if (key == "primitive") {
            if (this.f28862f == null) {
                this.f28862f = element;
                return;
            }
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?".toString());
        }
        throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag".toString());
    }
}