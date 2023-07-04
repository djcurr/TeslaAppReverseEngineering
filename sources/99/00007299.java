package h30;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes5.dex */
class v extends d {

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, JsonElement> f28870f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kotlinx.serialization.json.a json, h00.l<? super JsonElement, vz.b0> nodeConsumer) {
        super(json, nodeConsumer, null);
        kotlin.jvm.internal.s.g(json, "json");
        kotlin.jvm.internal.s.g(nodeConsumer, "nodeConsumer");
        this.f28870f = new LinkedHashMap();
    }

    @Override // g30.w1, f30.d
    public <T> void D(e30.f descriptor, int i11, c30.h<? super T> serializer, T t11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        kotlin.jvm.internal.s.g(serializer, "serializer");
        if (t11 != null || this.f28812d.f()) {
            super.D(descriptor, i11, serializer, t11);
        }
    }

    @Override // h30.d
    public JsonElement q0() {
        return new JsonObject(this.f28870f);
    }

    @Override // h30.d
    public void r0(String key, JsonElement element) {
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(element, "element");
        this.f28870f.put(key, element);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Map<String, JsonElement> s0() {
        return this.f28870f;
    }
}