package kotlinx.serialization.json;

import e30.f;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.m0;

/* loaded from: classes5.dex */
public final class j {

    /* loaded from: classes5.dex */
    public static final class a implements e30.f {

        /* renamed from: a */
        private final vz.k f35658a;

        a(h00.a<? extends e30.f> aVar) {
            vz.k a11;
            a11 = vz.m.a(aVar);
            this.f35658a = a11;
        }

        private final e30.f a() {
            return (e30.f) this.f35658a.getValue();
        }

        @Override // e30.f
        public boolean b() {
            return f.a.c(this);
        }

        @Override // e30.f
        public int c(String name) {
            kotlin.jvm.internal.s.g(name, "name");
            return a().c(name);
        }

        @Override // e30.f
        public int d() {
            return a().d();
        }

        @Override // e30.f
        public String e(int i11) {
            return a().e(i11);
        }

        @Override // e30.f
        public List<Annotation> f(int i11) {
            return a().f(i11);
        }

        @Override // e30.f
        public e30.f g(int i11) {
            return a().g(i11);
        }

        @Override // e30.f
        public List<Annotation> getAnnotations() {
            return f.a.a(this);
        }

        @Override // e30.f
        public e30.j getKind() {
            return a().getKind();
        }

        @Override // e30.f
        public String h() {
            return a().h();
        }

        @Override // e30.f
        public boolean i(int i11) {
            return a().i(i11);
        }

        @Override // e30.f
        public boolean isInline() {
            return f.a.b(this);
        }
    }

    public static final g d(f30.e eVar) {
        kotlin.jvm.internal.s.g(eVar, "<this>");
        g gVar = eVar instanceof g ? (g) eVar : null;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + m0.b(eVar.getClass()));
    }

    public static final k e(f30.f fVar) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        k kVar = fVar instanceof k ? (k) fVar : null;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + m0.b(fVar.getClass()));
    }

    public static final e30.f f(h00.a<? extends e30.f> aVar) {
        return new a(aVar);
    }

    public static final void g(f30.e eVar) {
        d(eVar);
    }

    public static final void h(f30.f fVar) {
        e(fVar);
    }
}