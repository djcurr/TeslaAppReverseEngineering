package kotlinx.serialization.json;

import e30.e;
import kotlin.jvm.internal.m0;
import kotlin.text.z;
import vz.y;

/* loaded from: classes5.dex */
final class o implements c30.b<n> {

    /* renamed from: a  reason: collision with root package name */
    public static final o f35661a = new o();

    /* renamed from: b  reason: collision with root package name */
    private static final e30.f f35662b = e30.i.a("kotlinx.serialization.json.JsonLiteral", e.i.f24566a);

    private o() {
    }

    @Override // c30.a
    /* renamed from: a */
    public n deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        JsonElement f11 = j.d(decoder).f();
        if (f11 instanceof n) {
            return (n) f11;
        }
        throw h30.o.f(-1, "Unexpected JSON element, expected JsonLiteral, had " + m0.b(f11.getClass()), f11.toString());
    }

    @Override // c30.h
    /* renamed from: b */
    public void serialize(f30.f encoder, n value) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        kotlin.jvm.internal.s.g(value, "value");
        j.h(encoder);
        if (value.c()) {
            encoder.E(value.b());
            return;
        }
        Long n11 = h.n(value);
        if (n11 != null) {
            encoder.m(n11.longValue());
            return;
        }
        y h11 = z.h(value.b());
        if (h11 != null) {
            encoder.i(d30.a.A(y.f54788b).getDescriptor()).m(h11.f());
            return;
        }
        Double h12 = h.h(value);
        if (h12 != null) {
            encoder.e(h12.doubleValue());
            return;
        }
        Boolean e11 = h.e(value);
        if (e11 != null) {
            encoder.s(e11.booleanValue());
        } else {
            encoder.E(value.b());
        }
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return f35662b;
    }
}