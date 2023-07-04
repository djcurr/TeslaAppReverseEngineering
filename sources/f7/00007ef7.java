package kotlin.reflect.jvm.internal.impl.renderer;

import ch.qos.logback.core.joran.action.Action;
import java.util.Set;
import k20.d0;
import k20.y0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.renderer.b;
import vz.b0;
import w00.r0;
import w00.v0;
import wz.x0;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a */
    public static final k f35079a;

    /* renamed from: b */
    public static final c f35080b;

    /* renamed from: c */
    public static final c f35081c;

    /* loaded from: classes5.dex */
    static final class a extends u implements h00.l<kotlin.reflect.jvm.internal.impl.renderer.f, b0> {

        /* renamed from: a */
        public static final a f35082a = new a();

        a() {
            super(1);
        }

        public final void a(kotlin.reflect.jvm.internal.impl.renderer.f withOptions) {
            Set<? extends kotlin.reflect.jvm.internal.impl.renderer.e> d11;
            s.g(withOptions, "$this$withOptions");
            withOptions.c(false);
            d11 = x0.d();
            withOptions.l(d11);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            a(fVar);
            return b0.f54756a;
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends u implements h00.l<kotlin.reflect.jvm.internal.impl.renderer.f, b0> {

        /* renamed from: a */
        public static final b f35083a = new b();

        b() {
            super(1);
        }

        public final void a(kotlin.reflect.jvm.internal.impl.renderer.f withOptions) {
            Set<? extends kotlin.reflect.jvm.internal.impl.renderer.e> d11;
            s.g(withOptions, "$this$withOptions");
            withOptions.c(false);
            d11 = x0.d();
            withOptions.l(d11);
            withOptions.e(true);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            a(fVar);
            return b0.f54756a;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.c$c */
    /* loaded from: classes5.dex */
    static final class C0656c extends u implements h00.l<kotlin.reflect.jvm.internal.impl.renderer.f, b0> {

        /* renamed from: a */
        public static final C0656c f35084a = new C0656c();

        C0656c() {
            super(1);
        }

        public final void a(kotlin.reflect.jvm.internal.impl.renderer.f withOptions) {
            s.g(withOptions, "$this$withOptions");
            withOptions.c(false);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            a(fVar);
            return b0.f54756a;
        }
    }

    /* loaded from: classes5.dex */
    static final class d extends u implements h00.l<kotlin.reflect.jvm.internal.impl.renderer.f, b0> {

        /* renamed from: a */
        public static final d f35085a = new d();

        d() {
            super(1);
        }

        public final void a(kotlin.reflect.jvm.internal.impl.renderer.f withOptions) {
            Set<? extends kotlin.reflect.jvm.internal.impl.renderer.e> d11;
            s.g(withOptions, "$this$withOptions");
            d11 = x0.d();
            withOptions.l(d11);
            withOptions.m(b.C0655b.f35077a);
            withOptions.b(kotlin.reflect.jvm.internal.impl.renderer.k.ONLY_NON_SYNTHESIZED);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            a(fVar);
            return b0.f54756a;
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends u implements h00.l<kotlin.reflect.jvm.internal.impl.renderer.f, b0> {

        /* renamed from: a */
        public static final e f35086a = new e();

        e() {
            super(1);
        }

        public final void a(kotlin.reflect.jvm.internal.impl.renderer.f withOptions) {
            s.g(withOptions, "$this$withOptions");
            withOptions.n(true);
            withOptions.m(b.a.f35076a);
            withOptions.l(kotlin.reflect.jvm.internal.impl.renderer.e.ALL);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            a(fVar);
            return b0.f54756a;
        }
    }

    /* loaded from: classes5.dex */
    static final class f extends u implements h00.l<kotlin.reflect.jvm.internal.impl.renderer.f, b0> {

        /* renamed from: a */
        public static final f f35087a = new f();

        f() {
            super(1);
        }

        public final void a(kotlin.reflect.jvm.internal.impl.renderer.f withOptions) {
            s.g(withOptions, "$this$withOptions");
            withOptions.l(kotlin.reflect.jvm.internal.impl.renderer.e.ALL_EXCEPT_ANNOTATIONS);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            a(fVar);
            return b0.f54756a;
        }
    }

    /* loaded from: classes5.dex */
    static final class g extends u implements h00.l<kotlin.reflect.jvm.internal.impl.renderer.f, b0> {

        /* renamed from: a */
        public static final g f35088a = new g();

        g() {
            super(1);
        }

        public final void a(kotlin.reflect.jvm.internal.impl.renderer.f withOptions) {
            s.g(withOptions, "$this$withOptions");
            withOptions.l(kotlin.reflect.jvm.internal.impl.renderer.e.ALL);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            a(fVar);
            return b0.f54756a;
        }
    }

    /* loaded from: classes5.dex */
    static final class h extends u implements h00.l<kotlin.reflect.jvm.internal.impl.renderer.f, b0> {

        /* renamed from: a */
        public static final h f35089a = new h();

        h() {
            super(1);
        }

        public final void a(kotlin.reflect.jvm.internal.impl.renderer.f withOptions) {
            s.g(withOptions, "$this$withOptions");
            withOptions.g(m.HTML);
            withOptions.l(kotlin.reflect.jvm.internal.impl.renderer.e.ALL);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            a(fVar);
            return b0.f54756a;
        }
    }

    /* loaded from: classes5.dex */
    static final class i extends u implements h00.l<kotlin.reflect.jvm.internal.impl.renderer.f, b0> {

        /* renamed from: a */
        public static final i f35090a = new i();

        i() {
            super(1);
        }

        public final void a(kotlin.reflect.jvm.internal.impl.renderer.f withOptions) {
            Set<? extends kotlin.reflect.jvm.internal.impl.renderer.e> d11;
            s.g(withOptions, "$this$withOptions");
            withOptions.c(false);
            d11 = x0.d();
            withOptions.l(d11);
            withOptions.m(b.C0655b.f35077a);
            withOptions.p(true);
            withOptions.b(kotlin.reflect.jvm.internal.impl.renderer.k.NONE);
            withOptions.f(true);
            withOptions.o(true);
            withOptions.e(true);
            withOptions.a(true);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            a(fVar);
            return b0.f54756a;
        }
    }

    /* loaded from: classes5.dex */
    static final class j extends u implements h00.l<kotlin.reflect.jvm.internal.impl.renderer.f, b0> {

        /* renamed from: a */
        public static final j f35091a = new j();

        j() {
            super(1);
        }

        public final void a(kotlin.reflect.jvm.internal.impl.renderer.f withOptions) {
            s.g(withOptions, "$this$withOptions");
            withOptions.m(b.C0655b.f35077a);
            withOptions.b(kotlin.reflect.jvm.internal.impl.renderer.k.ONLY_NON_SYNTHESIZED);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            a(fVar);
            return b0.f54756a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class k {

        /* loaded from: classes5.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f35092a;

            static {
                int[] iArr = new int[kotlin.reflect.jvm.internal.impl.descriptors.c.values().length];
                iArr[kotlin.reflect.jvm.internal.impl.descriptors.c.CLASS.ordinal()] = 1;
                iArr[kotlin.reflect.jvm.internal.impl.descriptors.c.INTERFACE.ordinal()] = 2;
                iArr[kotlin.reflect.jvm.internal.impl.descriptors.c.ENUM_CLASS.ordinal()] = 3;
                iArr[kotlin.reflect.jvm.internal.impl.descriptors.c.OBJECT.ordinal()] = 4;
                iArr[kotlin.reflect.jvm.internal.impl.descriptors.c.ANNOTATION_CLASS.ordinal()] = 5;
                iArr[kotlin.reflect.jvm.internal.impl.descriptors.c.ENUM_ENTRY.ordinal()] = 6;
                f35092a = iArr;
            }
        }

        private k() {
        }

        public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(w00.f classifier) {
            s.g(classifier, "classifier");
            if (classifier instanceof r0) {
                return "typealias";
            }
            if (classifier instanceof w00.c) {
                w00.c cVar = (w00.c) classifier;
                if (cVar.X()) {
                    return "companion object";
                }
                switch (a.f35092a[cVar.getKind().ordinal()]) {
                    case 1:
                        return Action.CLASS_ATTRIBUTE;
                    case 2:
                        return "interface";
                    case 3:
                        return "enum class";
                    case 4:
                        return "object";
                    case 5:
                        return "annotation class";
                    case 6:
                        return "enum entry";
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            throw new AssertionError(s.p("Unexpected classifier: ", classifier));
        }

        public final c b(h00.l<? super kotlin.reflect.jvm.internal.impl.renderer.f, b0> changeOptions) {
            s.g(changeOptions, "changeOptions");
            kotlin.reflect.jvm.internal.impl.renderer.g gVar = new kotlin.reflect.jvm.internal.impl.renderer.g();
            changeOptions.invoke(gVar);
            gVar.l0();
            return new kotlin.reflect.jvm.internal.impl.renderer.d(gVar);
        }
    }

    /* loaded from: classes5.dex */
    public interface l {

        /* loaded from: classes5.dex */
        public static final class a implements l {

            /* renamed from: a */
            public static final a f35093a = new a();

            private a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.c.l
            public void a(v0 parameter, int i11, int i12, StringBuilder builder) {
                s.g(parameter, "parameter");
                s.g(builder, "builder");
                if (i11 != i12 - 1) {
                    builder.append(", ");
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.c.l
            public void b(int i11, StringBuilder builder) {
                s.g(builder, "builder");
                builder.append("(");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.c.l
            public void c(v0 parameter, int i11, int i12, StringBuilder builder) {
                s.g(parameter, "parameter");
                s.g(builder, "builder");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.c.l
            public void d(int i11, StringBuilder builder) {
                s.g(builder, "builder");
                builder.append(")");
            }
        }

        void a(v0 v0Var, int i11, int i12, StringBuilder sb2);

        void b(int i11, StringBuilder sb2);

        void c(v0 v0Var, int i11, int i12, StringBuilder sb2);

        void d(int i11, StringBuilder sb2);
    }

    static {
        k kVar = new k(null);
        f35079a = kVar;
        kVar.b(C0656c.f35084a);
        kVar.b(a.f35082a);
        kVar.b(b.f35083a);
        kVar.b(d.f35085a);
        kVar.b(i.f35090a);
        f35080b = kVar.b(f.f35087a);
        kVar.b(g.f35088a);
        kVar.b(j.f35091a);
        f35081c = kVar.b(e.f35086a);
        kVar.b(h.f35089a);
    }

    public static /* synthetic */ String s(c cVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                eVar = null;
            }
            return cVar.r(cVar2, eVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
    }

    public abstract String q(w00.i iVar);

    public abstract String r(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar);

    public abstract String t(String str, String str2, t00.h hVar);

    public abstract String u(u10.d dVar);

    public abstract String v(u10.f fVar, boolean z11);

    public abstract String w(d0 d0Var);

    public abstract String x(y0 y0Var);

    public final c y(h00.l<? super kotlin.reflect.jvm.internal.impl.renderer.f, b0> changeOptions) {
        s.g(changeOptions, "changeOptions");
        kotlin.reflect.jvm.internal.impl.renderer.g q11 = ((kotlin.reflect.jvm.internal.impl.renderer.d) this).h0().q();
        changeOptions.invoke(q11);
        q11.l0();
        return new kotlin.reflect.jvm.internal.impl.renderer.d(q11);
    }
}