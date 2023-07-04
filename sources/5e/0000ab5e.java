package pr;

import android.view.View;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class a0<RenderingT> {

    /* loaded from: classes2.dex */
    public static final class b<RenderingT> extends a0<RenderingT> {

        /* renamed from: a  reason: collision with root package name */
        private final RenderingT f46845a;

        /* renamed from: b  reason: collision with root package name */
        private final s f46846b;

        /* renamed from: c  reason: collision with root package name */
        private final h00.p<RenderingT, s, vz.b0> f46847c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(RenderingT showing, s environment, h00.p<? super RenderingT, ? super s, vz.b0> showRendering) {
            super(null);
            kotlin.jvm.internal.s.g(showing, "showing");
            kotlin.jvm.internal.s.g(environment, "environment");
            kotlin.jvm.internal.s.g(showRendering, "showRendering");
            this.f46845a = showing;
            this.f46846b = environment;
            this.f46847c = showRendering;
        }

        @Override // pr.a0
        public s a() {
            return this.f46846b;
        }

        @Override // pr.a0
        public h00.p<RenderingT, s, vz.b0> b() {
            return this.f46847c;
        }

        @Override // pr.a0
        /* renamed from: d */
        public RenderingT c() {
            return this.f46845a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return kotlin.jvm.internal.s.c(c(), bVar.c()) && kotlin.jvm.internal.s.c(a(), bVar.a()) && kotlin.jvm.internal.s.c(b(), bVar.b());
            }
            return false;
        }

        public int hashCode() {
            return (((c().hashCode() * 31) + a().hashCode()) * 31) + b().hashCode();
        }

        public String toString() {
            return "Started(showing=" + c() + ", environment=" + a() + ", showRendering=" + b() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    private a0() {
    }

    public /* synthetic */ a0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract s a();

    public abstract h00.p<RenderingT, s, vz.b0> b();

    public abstract RenderingT c();

    /* loaded from: classes2.dex */
    public static final class a<RenderingT> extends a0<RenderingT> {

        /* renamed from: a  reason: collision with root package name */
        private final RenderingT f46840a;

        /* renamed from: b  reason: collision with root package name */
        private final s f46841b;

        /* renamed from: c  reason: collision with root package name */
        private final h00.p<RenderingT, s, vz.b0> f46842c;

        /* renamed from: d  reason: collision with root package name */
        private final h00.l<View, vz.b0> f46843d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: pr.a0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C1002a extends kotlin.jvm.internal.u implements h00.l<View, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final C1002a f46844a = new C1002a();

            C1002a() {
                super(1);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(View view) {
                invoke2(view);
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                kotlin.jvm.internal.s.g(view, "view");
                a0<?> d11 = b0.d(view);
                Object c11 = d11 == null ? null : d11.c();
                Object obj = c11 != null ? c11 : null;
                kotlin.jvm.internal.s.e(obj);
                s c12 = x.c(view);
                kotlin.jvm.internal.s.e(c12);
                x.g(view, obj, c12);
            }
        }

        public /* synthetic */ a(Object obj, s sVar, h00.p pVar, h00.l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, sVar, pVar, (i11 & 8) != 0 ? C1002a.f46844a : lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a e(a aVar, Object obj, s sVar, h00.p pVar, h00.l lVar, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = aVar.c();
            }
            if ((i11 & 2) != 0) {
                sVar = aVar.a();
            }
            if ((i11 & 4) != 0) {
                pVar = aVar.b();
            }
            if ((i11 & 8) != 0) {
                lVar = aVar.f46843d;
            }
            return aVar.d(obj, sVar, pVar, lVar);
        }

        @Override // pr.a0
        public s a() {
            return this.f46841b;
        }

        @Override // pr.a0
        public h00.p<RenderingT, s, vz.b0> b() {
            return this.f46842c;
        }

        public final a<RenderingT> d(RenderingT showing, s environment, h00.p<? super RenderingT, ? super s, vz.b0> showRendering, h00.l<? super View, vz.b0> starter) {
            kotlin.jvm.internal.s.g(showing, "showing");
            kotlin.jvm.internal.s.g(environment, "environment");
            kotlin.jvm.internal.s.g(showRendering, "showRendering");
            kotlin.jvm.internal.s.g(starter, "starter");
            return new a<>(showing, environment, showRendering, starter);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return kotlin.jvm.internal.s.c(c(), aVar.c()) && kotlin.jvm.internal.s.c(a(), aVar.a()) && kotlin.jvm.internal.s.c(b(), aVar.b()) && kotlin.jvm.internal.s.c(this.f46843d, aVar.f46843d);
            }
            return false;
        }

        @Override // pr.a0
        /* renamed from: f */
        public RenderingT c() {
            return this.f46840a;
        }

        public final h00.l<View, vz.b0> g() {
            return this.f46843d;
        }

        public int hashCode() {
            return (((((c().hashCode() * 31) + a().hashCode()) * 31) + b().hashCode()) * 31) + this.f46843d.hashCode();
        }

        public String toString() {
            return "New(showing=" + c() + ", environment=" + a() + ", showRendering=" + b() + ", starter=" + this.f46843d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(RenderingT showing, s environment, h00.p<? super RenderingT, ? super s, vz.b0> showRendering, h00.l<? super View, vz.b0> starter) {
            super(null);
            kotlin.jvm.internal.s.g(showing, "showing");
            kotlin.jvm.internal.s.g(environment, "environment");
            kotlin.jvm.internal.s.g(showRendering, "showRendering");
            kotlin.jvm.internal.s.g(starter, "starter");
            this.f46840a = showing;
            this.f46841b = environment;
            this.f46842c = showRendering;
            this.f46843d = starter;
        }
    }
}