package h30;

import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class w extends c {

    /* renamed from: f  reason: collision with root package name */
    private final JsonArray f28871f;

    /* renamed from: g  reason: collision with root package name */
    private final int f28872g;

    /* renamed from: h  reason: collision with root package name */
    private int f28873h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(kotlinx.serialization.json.a json, JsonArray value) {
        super(json, value, null);
        kotlin.jvm.internal.s.g(json, "json");
        kotlin.jvm.internal.s.g(value, "value");
        this.f28871f = value;
        this.f28872g = r0().size();
        this.f28873h = -1;
    }

    @Override // g30.y0
    protected String Z(e30.f desc, int i11) {
        kotlin.jvm.internal.s.g(desc, "desc");
        return String.valueOf(i11);
    }

    @Override // h30.c
    protected JsonElement d0(String tag) {
        kotlin.jvm.internal.s.g(tag, "tag");
        return r0().get(Integer.parseInt(tag));
    }

    @Override // f30.c
    public int p(e30.f descriptor) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        int i11 = this.f28873h;
        if (i11 < this.f28872g - 1) {
            int i12 = i11 + 1;
            this.f28873h = i12;
            return i12;
        }
        return -1;
    }

    @Override // h30.c
    /* renamed from: t0 */
    public JsonArray r0() {
        return this.f28871f;
    }
}