package p0;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;

/* loaded from: classes.dex */
public final class u {

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f45410a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w wVar) {
            super(1);
            this.f45410a = wVar;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("padding");
            y0Var.a().b("paddingValues", this.f45410a);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f45411a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f11) {
            super(1);
            this.f45411a = f11;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("padding");
            y0Var.c(x2.g.c(this.f45411a));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f45412a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f45413b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f11, float f12) {
            super(1);
            this.f45412a = f11;
            this.f45413b = f12;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("padding");
            y0Var.a().b("horizontal", x2.g.c(this.f45412a));
            y0Var.a().b("vertical", x2.g.c(this.f45413b));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f45414a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f45415b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f45416c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f45417d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f11, float f12, float f13, float f14) {
            super(1);
            this.f45414a = f11;
            this.f45415b = f12;
            this.f45416c = f13;
            this.f45417d = f14;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("padding");
            y0Var.a().b("start", x2.g.c(this.f45414a));
            y0Var.a().b("top", x2.g.c(this.f45415b));
            y0Var.a().b("end", x2.g.c(this.f45416c));
            y0Var.a().b("bottom", x2.g.c(this.f45417d));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    public static final w a(float f11) {
        return new x(f11, f11, f11, f11, null);
    }

    public static final w b(float f11, float f12) {
        return new x(f11, f12, f11, f12, null);
    }

    public static /* synthetic */ w c(float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = x2.g.f(0);
        }
        if ((i11 & 2) != 0) {
            f12 = x2.g.f(0);
        }
        return b(f11, f12);
    }

    public static final w d(float f11, float f12, float f13, float f14) {
        return new x(f11, f12, f13, f14, null);
    }

    public static final float e(w wVar, x2.q layoutDirection) {
        kotlin.jvm.internal.s.g(wVar, "<this>");
        kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
        if (layoutDirection == x2.q.Ltr) {
            return wVar.b(layoutDirection);
        }
        return wVar.c(layoutDirection);
    }

    public static final float f(w wVar, x2.q layoutDirection) {
        kotlin.jvm.internal.s.g(wVar, "<this>");
        kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
        if (layoutDirection == x2.q.Ltr) {
            return wVar.c(layoutDirection);
        }
        return wVar.b(layoutDirection);
    }

    public static final o1.f g(o1.f fVar, w paddingValues) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(paddingValues, "paddingValues");
        return fVar.g0(new y(paddingValues, x0.c() ? new a(paddingValues) : x0.a()));
    }

    public static final o1.f h(o1.f padding, float f11) {
        kotlin.jvm.internal.s.g(padding, "$this$padding");
        return padding.g0(new v(f11, f11, f11, f11, true, x0.c() ? new b(f11) : x0.a(), null));
    }

    public static final o1.f i(o1.f padding, float f11, float f12) {
        kotlin.jvm.internal.s.g(padding, "$this$padding");
        return padding.g0(new v(f11, f12, f11, f12, true, x0.c() ? new c(f11, f12) : x0.a(), null));
    }

    public static /* synthetic */ o1.f j(o1.f fVar, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = x2.g.f(0);
        }
        if ((i11 & 2) != 0) {
            f12 = x2.g.f(0);
        }
        return i(fVar, f11, f12);
    }

    public static final o1.f k(o1.f padding, float f11, float f12, float f13, float f14) {
        kotlin.jvm.internal.s.g(padding, "$this$padding");
        return padding.g0(new v(f11, f12, f13, f14, true, x0.c() ? new d(f11, f12, f13, f14) : x0.a(), null));
    }

    public static /* synthetic */ o1.f l(o1.f fVar, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = x2.g.f(0);
        }
        if ((i11 & 2) != 0) {
            f12 = x2.g.f(0);
        }
        if ((i11 & 4) != 0) {
            f13 = x2.g.f(0);
        }
        if ((i11 & 8) != 0) {
            f14 = x2.g.f(0);
        }
        return k(fVar, f11, f12, f13, f14);
    }
}