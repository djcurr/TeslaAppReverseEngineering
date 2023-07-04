package h30;

import java.util.ArrayList;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes5.dex */
final class x extends d {

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<JsonElement> f28874f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kotlinx.serialization.json.a json, h00.l<? super JsonElement, vz.b0> nodeConsumer) {
        super(json, nodeConsumer, null);
        kotlin.jvm.internal.s.g(json, "json");
        kotlin.jvm.internal.s.g(nodeConsumer, "nodeConsumer");
        this.f28874f = new ArrayList<>();
    }

    @Override // g30.z0
    protected String a0(e30.f descriptor, int i11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        return String.valueOf(i11);
    }

    @Override // h30.d
    public JsonElement q0() {
        return new JsonArray(this.f28874f);
    }

    @Override // h30.d
    public void r0(String key, JsonElement element) {
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(element, "element");
        this.f28874f.add(Integer.parseInt(key), element);
    }
}