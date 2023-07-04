package h30;

import ch.qos.logback.core.CoreConstants;
import e30.j;
import e30.k;
import g30.y0;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class c extends y0 implements kotlinx.serialization.json.g {

    /* renamed from: c  reason: collision with root package name */
    private final kotlinx.serialization.json.a f28805c;

    /* renamed from: d  reason: collision with root package name */
    private final JsonElement f28806d;

    /* renamed from: e  reason: collision with root package name */
    protected final kotlinx.serialization.json.e f28807e;

    private c(kotlinx.serialization.json.a aVar, JsonElement jsonElement) {
        this.f28805c = aVar;
        this.f28806d = jsonElement;
        this.f28807e = c().e();
    }

    public /* synthetic */ c(kotlinx.serialization.json.a aVar, JsonElement jsonElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, jsonElement);
    }

    private final kotlinx.serialization.json.n c0(JsonPrimitive jsonPrimitive, String str) {
        kotlinx.serialization.json.n nVar = jsonPrimitive instanceof kotlinx.serialization.json.n ? (kotlinx.serialization.json.n) jsonPrimitive : null;
        if (nVar != null) {
            return nVar;
        }
        throw o.e(-1, "Unexpected 'null' when " + str + " was expected");
    }

    private final JsonElement e0() {
        JsonElement d02;
        String T = T();
        return (T == null || (d02 = d0(T)) == null) ? r0() : d02;
    }

    private final Void s0(String str) {
        throw o.f(-1, "Failed to parse '" + str + CoreConstants.SINGLE_QUOTE_CHAR, e0().toString());
    }

    @Override // g30.v1, f30.e
    public boolean D() {
        return !(e0() instanceof JsonNull);
    }

    @Override // g30.y0
    protected String Y(String parentName, String childName) {
        kotlin.jvm.internal.s.g(parentName, "parentName");
        kotlin.jvm.internal.s.g(childName, "childName");
        return childName;
    }

    @Override // f30.c
    public i30.c a() {
        return c().a();
    }

    @Override // f30.e
    public f30.c b(e30.f descriptor) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        JsonElement e02 = e0();
        e30.j kind = descriptor.getKind();
        if (kotlin.jvm.internal.s.c(kind, k.b.f24591a) ? true : kind instanceof e30.d) {
            kotlinx.serialization.json.a c11 = c();
            if (e02 instanceof JsonArray) {
                return new w(c11, (JsonArray) e02);
            }
            throw o.e(-1, "Expected " + m0.b(JsonArray.class) + " as the serialized body of " + descriptor.h() + ", but had " + m0.b(e02.getClass()));
        } else if (kotlin.jvm.internal.s.c(kind, k.c.f24592a)) {
            kotlinx.serialization.json.a c12 = c();
            e30.f a11 = k0.a(descriptor.g(0), c12.a());
            e30.j kind2 = a11.getKind();
            if (!(kind2 instanceof e30.e) && !kotlin.jvm.internal.s.c(kind2, j.b.f24589a)) {
                if (c12.e().b()) {
                    kotlinx.serialization.json.a c13 = c();
                    if (e02 instanceof JsonArray) {
                        return new w(c13, (JsonArray) e02);
                    }
                    throw o.e(-1, "Expected " + m0.b(JsonArray.class) + " as the serialized body of " + descriptor.h() + ", but had " + m0.b(e02.getClass()));
                }
                throw o.d(a11);
            }
            kotlinx.serialization.json.a c14 = c();
            if (e02 instanceof JsonObject) {
                return new y(c14, (JsonObject) e02);
            }
            throw o.e(-1, "Expected " + m0.b(JsonObject.class) + " as the serialized body of " + descriptor.h() + ", but had " + m0.b(e02.getClass()));
        } else {
            kotlinx.serialization.json.a c15 = c();
            if (e02 instanceof JsonObject) {
                return new u(c15, (JsonObject) e02, null, null, 12, null);
            }
            throw o.e(-1, "Expected " + m0.b(JsonObject.class) + " as the serialized body of " + descriptor.h() + ", but had " + m0.b(e02.getClass()));
        }
    }

    @Override // kotlinx.serialization.json.g
    public kotlinx.serialization.json.a c() {
        return this.f28805c;
    }

    @Override // f30.c
    public void d(e30.f descriptor) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
    }

    protected abstract JsonElement d0(String str);

    @Override // kotlinx.serialization.json.g
    public JsonElement f() {
        return e0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.v1
    /* renamed from: f0 */
    public boolean I(String tag) {
        kotlin.jvm.internal.s.g(tag, "tag");
        JsonPrimitive q02 = q0(tag);
        if (!c().e().l() && c0(q02, "boolean").c()) {
            throw o.f(-1, "Boolean literal for key '" + tag + "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", e0().toString());
        }
        try {
            Boolean e11 = kotlinx.serialization.json.h.e(q02);
            if (e11 != null) {
                return e11.booleanValue();
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            s0("boolean");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.v1
    /* renamed from: g0 */
    public byte J(String tag) {
        kotlin.jvm.internal.s.g(tag, "tag");
        try {
            int j11 = kotlinx.serialization.json.h.j(q0(tag));
            boolean z11 = false;
            if (-128 <= j11 && j11 <= 127) {
                z11 = true;
            }
            Byte valueOf = z11 ? Byte.valueOf((byte) j11) : null;
            if (valueOf != null) {
                return valueOf.byteValue();
            }
            s0("byte");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            s0("byte");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.v1
    /* renamed from: h0 */
    public char K(String tag) {
        char h12;
        kotlin.jvm.internal.s.g(tag, "tag");
        try {
            h12 = kotlin.text.y.h1(q0(tag).b());
            return h12;
        } catch (IllegalArgumentException unused) {
            s0("char");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.v1
    /* renamed from: i0 */
    public double L(String tag) {
        kotlin.jvm.internal.s.g(tag, "tag");
        try {
            double g11 = kotlinx.serialization.json.h.g(q0(tag));
            if (!c().e().a()) {
                if (!((Double.isInfinite(g11) || Double.isNaN(g11)) ? false : true)) {
                    throw o.a(Double.valueOf(g11), tag, e0().toString());
                }
            }
            return g11;
        } catch (IllegalArgumentException unused) {
            s0("double");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.v1
    /* renamed from: j0 */
    public int M(String tag, e30.f enumDescriptor) {
        kotlin.jvm.internal.s.g(tag, "tag");
        kotlin.jvm.internal.s.g(enumDescriptor, "enumDescriptor");
        return p.f(enumDescriptor, c(), q0(tag).b(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.v1
    /* renamed from: k0 */
    public float N(String tag) {
        kotlin.jvm.internal.s.g(tag, "tag");
        try {
            float i11 = kotlinx.serialization.json.h.i(q0(tag));
            if (!c().e().a()) {
                if (!((Float.isInfinite(i11) || Float.isNaN(i11)) ? false : true)) {
                    throw o.a(Float.valueOf(i11), tag, e0().toString());
                }
            }
            return i11;
        } catch (IllegalArgumentException unused) {
            s0("float");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.v1
    /* renamed from: l0 */
    public f30.e O(String tag, e30.f inlineDescriptor) {
        kotlin.jvm.internal.s.g(tag, "tag");
        kotlin.jvm.internal.s.g(inlineDescriptor, "inlineDescriptor");
        return f0.a(inlineDescriptor) ? new m(new g0(q0(tag).b()), c()) : super.O(tag, inlineDescriptor);
    }

    @Override // g30.v1, f30.e
    public <T> T m(c30.a<T> deserializer) {
        kotlin.jvm.internal.s.g(deserializer, "deserializer");
        return (T) b0.d(this, deserializer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.v1
    /* renamed from: m0 */
    public int P(String tag) {
        kotlin.jvm.internal.s.g(tag, "tag");
        try {
            return kotlinx.serialization.json.h.j(q0(tag));
        } catch (IllegalArgumentException unused) {
            s0("int");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.v1
    /* renamed from: n0 */
    public long Q(String tag) {
        kotlin.jvm.internal.s.g(tag, "tag");
        try {
            return kotlinx.serialization.json.h.m(q0(tag));
        } catch (IllegalArgumentException unused) {
            s0("long");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.v1
    /* renamed from: o0 */
    public short R(String tag) {
        kotlin.jvm.internal.s.g(tag, "tag");
        try {
            int j11 = kotlinx.serialization.json.h.j(q0(tag));
            boolean z11 = false;
            if (-32768 <= j11 && j11 <= 32767) {
                z11 = true;
            }
            Short valueOf = z11 ? Short.valueOf((short) j11) : null;
            if (valueOf != null) {
                return valueOf.shortValue();
            }
            s0("short");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            s0("short");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.v1
    /* renamed from: p0 */
    public String S(String tag) {
        kotlin.jvm.internal.s.g(tag, "tag");
        JsonPrimitive q02 = q0(tag);
        if (!c().e().l() && !c0(q02, "string").c()) {
            throw o.f(-1, "String literal for key '" + tag + "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", e0().toString());
        } else if (!(q02 instanceof JsonNull)) {
            return q02.b();
        } else {
            throw o.f(-1, "Unexpected 'null' value instead of string literal", e0().toString());
        }
    }

    protected final JsonPrimitive q0(String tag) {
        kotlin.jvm.internal.s.g(tag, "tag");
        JsonElement d02 = d0(tag);
        JsonPrimitive jsonPrimitive = d02 instanceof JsonPrimitive ? (JsonPrimitive) d02 : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        throw o.f(-1, "Expected JsonPrimitive at " + tag + ", found " + d02, e0().toString());
    }

    public abstract JsonElement r0();
}