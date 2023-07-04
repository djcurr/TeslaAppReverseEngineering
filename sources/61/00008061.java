package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;

/* loaded from: classes5.dex */
public final class b implements c30.b<JsonArray> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f35620a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final e30.f f35621b = a.f35622b;

    /* loaded from: classes5.dex */
    private static final class a implements e30.f {

        /* renamed from: b  reason: collision with root package name */
        public static final a f35622b = new a();

        /* renamed from: c  reason: collision with root package name */
        private static final String f35623c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ e30.f f35624a = d30.a.h(i.f35650a).getDescriptor();

        private a() {
        }

        @Override // e30.f
        public boolean b() {
            return this.f35624a.b();
        }

        @Override // e30.f
        public int c(String name) {
            kotlin.jvm.internal.s.g(name, "name");
            return this.f35624a.c(name);
        }

        @Override // e30.f
        public int d() {
            return this.f35624a.d();
        }

        @Override // e30.f
        public String e(int i11) {
            return this.f35624a.e(i11);
        }

        @Override // e30.f
        public List<Annotation> f(int i11) {
            return this.f35624a.f(i11);
        }

        @Override // e30.f
        public e30.f g(int i11) {
            return this.f35624a.g(i11);
        }

        @Override // e30.f
        public List<Annotation> getAnnotations() {
            return this.f35624a.getAnnotations();
        }

        @Override // e30.f
        public e30.j getKind() {
            return this.f35624a.getKind();
        }

        @Override // e30.f
        public String h() {
            return f35623c;
        }

        @Override // e30.f
        public boolean i(int i11) {
            return this.f35624a.i(i11);
        }

        @Override // e30.f
        public boolean isInline() {
            return this.f35624a.isInline();
        }
    }

    private b() {
    }

    @Override // c30.a
    /* renamed from: a */
    public JsonArray deserialize(f30.e decoder) {
        kotlin.jvm.internal.s.g(decoder, "decoder");
        j.b(decoder);
        return new JsonArray((List) d30.a.h(i.f35650a).deserialize(decoder));
    }

    @Override // c30.h
    /* renamed from: b */
    public void serialize(f30.f encoder, JsonArray value) {
        kotlin.jvm.internal.s.g(encoder, "encoder");
        kotlin.jvm.internal.s.g(value, "value");
        j.c(encoder);
        d30.a.h(i.f35650a).serialize(encoder, value);
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return f35621b;
    }
}