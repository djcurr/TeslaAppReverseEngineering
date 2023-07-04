package h30;

import e30.j;
import g30.l0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import wz.p0;
import wz.x0;
import wz.y0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class u extends c {

    /* renamed from: f  reason: collision with root package name */
    private final JsonObject f28865f;

    /* renamed from: g  reason: collision with root package name */
    private final String f28866g;

    /* renamed from: h  reason: collision with root package name */
    private final e30.f f28867h;

    /* renamed from: i  reason: collision with root package name */
    private int f28868i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f28869j;

    /* loaded from: classes5.dex */
    /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.a<Map<String, ? extends Integer>> {
        a(Object obj) {
            super(0, obj, p.class, "buildAlternativeNamesMap", "buildAlternativeNamesMap(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", 1);
        }

        @Override // h00.a
        /* renamed from: d */
        public final Map<String, Integer> invoke() {
            return p.a((e30.f) this.receiver);
        }
    }

    public /* synthetic */ u(kotlinx.serialization.json.a aVar, JsonObject jsonObject, String str, e30.f fVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, jsonObject, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : fVar);
    }

    private final boolean t0(e30.f fVar, int i11) {
        boolean z11 = (c().e().f() || fVar.i(i11) || !fVar.g(i11).b()) ? false : true;
        this.f28869j = z11;
        return z11;
    }

    private final boolean u0(e30.f fVar, int i11, String str) {
        kotlinx.serialization.json.a c11 = c();
        e30.f g11 = fVar.g(i11);
        if (g11.b() || !(d0(str) instanceof JsonNull)) {
            if (kotlin.jvm.internal.s.c(g11.getKind(), j.b.f24589a)) {
                JsonElement d02 = d0(str);
                JsonPrimitive jsonPrimitive = d02 instanceof JsonPrimitive ? (JsonPrimitive) d02 : null;
                String f11 = jsonPrimitive != null ? kotlinx.serialization.json.h.f(jsonPrimitive) : null;
                if (f11 != null && p.d(g11, c11, f11) == -3) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // h30.c, g30.v1, f30.e
    public boolean D() {
        return !this.f28869j && super.D();
    }

    @Override // g30.y0
    protected String Z(e30.f desc, int i11) {
        Object obj;
        boolean z11;
        kotlin.jvm.internal.s.g(desc, "desc");
        String e11 = desc.e(i11);
        if (this.f28807e.j() && !r0().keySet().contains(e11)) {
            Map map = (Map) kotlinx.serialization.json.t.a(c()).b(desc, p.c(), new a(desc));
            Iterator<T> it2 = r0().keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                Integer num = (Integer) map.get((String) obj);
                if (num != null && num.intValue() == i11) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            }
            String str = (String) obj;
            return str == null ? e11 : str;
        }
        return e11;
    }

    @Override // h30.c, f30.e
    public f30.c b(e30.f descriptor) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        return descriptor == this.f28867h ? this : super.b(descriptor);
    }

    @Override // h30.c, f30.c
    public void d(e30.f descriptor) {
        Set<String> m11;
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        if (this.f28807e.g() || (descriptor.getKind() instanceof e30.d)) {
            return;
        }
        if (!this.f28807e.j()) {
            m11 = l0.a(descriptor);
        } else {
            Set<String> a11 = l0.a(descriptor);
            Map map = (Map) kotlinx.serialization.json.t.a(c()).a(descriptor, p.c());
            Set keySet = map != null ? map.keySet() : null;
            if (keySet == null) {
                keySet = x0.d();
            }
            m11 = y0.m(a11, keySet);
        }
        for (String str : r0().keySet()) {
            if (!m11.contains(str) && !kotlin.jvm.internal.s.c(str, this.f28866g)) {
                throw o.g(str, r0().toString());
            }
        }
    }

    @Override // h30.c
    protected JsonElement d0(String tag) {
        kotlin.jvm.internal.s.g(tag, "tag");
        return (JsonElement) p0.j(r0(), tag);
    }

    @Override // f30.c
    public int p(e30.f descriptor) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        while (this.f28868i < descriptor.d()) {
            int i11 = this.f28868i;
            this.f28868i = i11 + 1;
            String U = U(descriptor, i11);
            int i12 = this.f28868i - 1;
            this.f28869j = false;
            if (r0().containsKey(U) || t0(descriptor, i12)) {
                if (!this.f28807e.d() || !u0(descriptor, i12, U)) {
                    return i12;
                }
            }
        }
        return -1;
    }

    @Override // h30.c
    /* renamed from: v0 */
    public JsonObject r0() {
        return this.f28865f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(kotlinx.serialization.json.a json, JsonObject value, String str, e30.f fVar) {
        super(json, value, null);
        kotlin.jvm.internal.s.g(json, "json");
        kotlin.jvm.internal.s.g(value, "value");
        this.f28865f = value;
        this.f28866g = str;
        this.f28867h = fVar;
    }
}