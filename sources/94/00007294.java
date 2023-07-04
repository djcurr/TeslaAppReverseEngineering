package h30;

import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class r extends c {

    /* renamed from: f  reason: collision with root package name */
    private final JsonPrimitive f28861f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(kotlinx.serialization.json.a json, JsonPrimitive value) {
        super(json, value, null);
        kotlin.jvm.internal.s.g(json, "json");
        kotlin.jvm.internal.s.g(value, "value");
        this.f28861f = value;
        W("primitive");
    }

    @Override // h30.c
    protected JsonElement d0(String tag) {
        kotlin.jvm.internal.s.g(tag, "tag");
        if (tag == "primitive") {
            return r0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    @Override // f30.c
    public int p(e30.f descriptor) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        return 0;
    }

    @Override // h30.c
    /* renamed from: t0 */
    public JsonPrimitive r0() {
        return this.f28861f;
    }
}