package h30;

import java.util.List;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import wz.p0;

/* loaded from: classes5.dex */
final class y extends u {

    /* renamed from: k  reason: collision with root package name */
    private final JsonObject f28875k;

    /* renamed from: l  reason: collision with root package name */
    private final List<String> f28876l;

    /* renamed from: m  reason: collision with root package name */
    private final int f28877m;

    /* renamed from: n  reason: collision with root package name */
    private int f28878n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(kotlinx.serialization.json.a json, JsonObject value) {
        super(json, value, null, null, 12, null);
        List<String> O0;
        kotlin.jvm.internal.s.g(json, "json");
        kotlin.jvm.internal.s.g(value, "value");
        this.f28875k = value;
        O0 = wz.e0.O0(r0().keySet());
        this.f28876l = O0;
        this.f28877m = O0.size() * 2;
        this.f28878n = -1;
    }

    @Override // h30.u, g30.y0
    protected String Z(e30.f desc, int i11) {
        kotlin.jvm.internal.s.g(desc, "desc");
        return this.f28876l.get(i11 / 2);
    }

    @Override // h30.u, h30.c, f30.c
    public void d(e30.f descriptor) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
    }

    @Override // h30.u, h30.c
    protected JsonElement d0(String tag) {
        kotlin.jvm.internal.s.g(tag, "tag");
        return this.f28878n % 2 == 0 ? kotlinx.serialization.json.h.c(tag) : (JsonElement) p0.j(r0(), tag);
    }

    @Override // h30.u, f30.c
    public int p(e30.f descriptor) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        int i11 = this.f28878n;
        if (i11 < this.f28877m - 1) {
            int i12 = i11 + 1;
            this.f28878n = i12;
            return i12;
        }
        return -1;
    }

    @Override // h30.u, h30.c
    /* renamed from: v0 */
    public JsonObject r0() {
        return this.f28875k;
    }
}