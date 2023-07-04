package kotlinx.serialization.json;

import e30.d;
import vz.b0;

/* loaded from: classes5.dex */
public final class i implements c30.b<JsonElement> {

    /* renamed from: a  reason: collision with root package name */
    public static final i f35650a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final e30.f f35651b = e30.i.c("kotlinx.serialization.json.JsonElement", d.b.f24557a, new e30.f[0], a.f35652a);

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<e30.a, b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f35652a = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: kotlinx.serialization.json.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0678a extends kotlin.jvm.internal.u implements h00.a<e30.f> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0678a f35653a = new C0678a();

            C0678a() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final e30.f invoke() {
                return s.f35670a.getDescriptor();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.a<e30.f> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f35654a = new b();

            b() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final e30.f invoke() {
                return q.f35663a.getDescriptor();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class c extends kotlin.jvm.internal.u implements h00.a<e30.f> {

            /* renamed from: a  reason: collision with root package name */
            public static final c f35655a = new c();

            c() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final e30.f invoke() {
                return o.f35661a.getDescriptor();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class d extends kotlin.jvm.internal.u implements h00.a<e30.f> {

            /* renamed from: a  reason: collision with root package name */
            public static final d f35656a = new d();

            d() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final e30.f invoke() {
                return r.f35665a.getDescriptor();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class e extends kotlin.jvm.internal.u implements h00.a<e30.f> {

            /* renamed from: a  reason: collision with root package name */
            public static final e f35657a = new e();

            e() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final e30.f invoke() {
                return kotlinx.serialization.json.b.f35620a.getDescriptor();
            }
        }

        a() {
            super(1);
        }

        public final void a(e30.a buildSerialDescriptor) {
            e30.f f11;
            e30.f f12;
            e30.f f13;
            e30.f f14;
            e30.f f15;
            kotlin.jvm.internal.s.g(buildSerialDescriptor, "$this$buildSerialDescriptor");
            f11 = j.f(C0678a.f35653a);
            e30.a.b(buildSerialDescriptor, "JsonPrimitive", f11, null, false, 12, null);
            f12 = j.f(b.f35654a);
            e30.a.b(buildSerialDescriptor, "JsonNull", f12, null, false, 12, null);
            f13 = j.f(c.f35655a);
            e30.a.b(buildSerialDescriptor, "JsonLiteral", f13, null, false, 12, null);
            f14 = j.f(d.f35656a);
            e30.a.b(buildSerialDescriptor, "JsonObject", f14, null, false, 12, null);
            f15 = j.f(e.f35657a);
            e30.a.b(buildSerialDescriptor, "JsonArray", f15, null, false, 12, null);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(e30.a aVar) {
            a(aVar);
            return b0.f54756a;
        }
    }

    private i() {
    }

    @Override // c30.a
    /* renamed from: a */
    public JsonElement deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        return j.d(decoder).f();
    }

    @Override // c30.h
    /* renamed from: b */
    public void serialize(f30.f encoder, JsonElement value) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        kotlin.jvm.internal.s.g(value, "value");
        j.h(encoder);
        if (value instanceof JsonPrimitive) {
            encoder.F(s.f35670a, value);
        } else if (value instanceof JsonObject) {
            encoder.F(r.f35665a, value);
        } else if (value instanceof JsonArray) {
            encoder.F(b.f35620a, value);
        }
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return f35651b;
    }
}