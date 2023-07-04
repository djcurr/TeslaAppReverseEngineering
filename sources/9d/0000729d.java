package h30;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes5.dex */
final class z extends v {

    /* renamed from: g  reason: collision with root package name */
    private String f28879g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f28880h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(kotlinx.serialization.json.a json, h00.l<? super JsonElement, vz.b0> nodeConsumer) {
        super(json, nodeConsumer);
        kotlin.jvm.internal.s.g(json, "json");
        kotlin.jvm.internal.s.g(nodeConsumer, "nodeConsumer");
        this.f28880h = true;
    }

    @Override // h30.v, h30.d
    public JsonElement q0() {
        return new JsonObject(s0());
    }

    @Override // h30.v, h30.d
    public void r0(String key, JsonElement element) {
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(element, "element");
        if (this.f28880h) {
            if (element instanceof JsonPrimitive) {
                this.f28879g = ((JsonPrimitive) element).b();
                this.f28880h = false;
                return;
            } else if (!(element instanceof JsonObject)) {
                if (!(element instanceof JsonArray)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw o.d(kotlinx.serialization.json.b.f35620a.getDescriptor());
            } else {
                throw o.d(kotlinx.serialization.json.r.f35665a.getDescriptor());
            }
        }
        Map<String, JsonElement> s02 = s0();
        String str = this.f28879g;
        if (str == null) {
            kotlin.jvm.internal.s.x("tag");
            str = null;
        }
        s02.put(str, element);
        this.f28880h = true;
    }
}