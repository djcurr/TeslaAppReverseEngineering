package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q0;

/* loaded from: classes5.dex */
public final class r implements c30.b<JsonObject> {

    /* renamed from: a  reason: collision with root package name */
    public static final r f35665a = new r();

    /* renamed from: b  reason: collision with root package name */
    private static final e30.f f35666b = a.f35667b;

    /* loaded from: classes5.dex */
    private static final class a implements e30.f {

        /* renamed from: b  reason: collision with root package name */
        public static final a f35667b = new a();

        /* renamed from: c  reason: collision with root package name */
        private static final String f35668c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ e30.f f35669a = d30.a.k(d30.a.x(q0.f34921a), i.f35650a).getDescriptor();

        private a() {
        }

        @Override // e30.f
        public boolean b() {
            return this.f35669a.b();
        }

        @Override // e30.f
        public int c(String name) {
            kotlin.jvm.internal.s.g(name, "name");
            return this.f35669a.c(name);
        }

        @Override // e30.f
        public int d() {
            return this.f35669a.d();
        }

        @Override // e30.f
        public String e(int i11) {
            return this.f35669a.e(i11);
        }

        @Override // e30.f
        public List<Annotation> f(int i11) {
            return this.f35669a.f(i11);
        }

        @Override // e30.f
        public e30.f g(int i11) {
            return this.f35669a.g(i11);
        }

        @Override // e30.f
        public List<Annotation> getAnnotations() {
            return this.f35669a.getAnnotations();
        }

        @Override // e30.f
        public e30.j getKind() {
            return this.f35669a.getKind();
        }

        @Override // e30.f
        public String h() {
            return f35668c;
        }

        @Override // e30.f
        public boolean i(int i11) {
            return this.f35669a.i(i11);
        }

        @Override // e30.f
        public boolean isInline() {
            return this.f35669a.isInline();
        }
    }

    private r() {
    }

    @Override // c30.a
    /* renamed from: a */
    public JsonObject deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        j.g(decoder);
        return new JsonObject((Map) d30.a.k(d30.a.x(q0.f34921a), i.f35650a).deserialize(decoder));
    }

    @Override // c30.h
    /* renamed from: b */
    public void serialize(f30.f encoder, JsonObject value) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        kotlin.jvm.internal.s.g(value, "value");
        j.h(encoder);
        d30.a.k(d30.a.x(q0.f34921a), i.f35650a).serialize(encoder, value);
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return f35666b;
    }
}