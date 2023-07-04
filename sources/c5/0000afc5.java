package r1;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static final g2.f<p> f49009a = g2.c.a(a.f49010a);

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f49010a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final p invoke() {
            return r1.a.f48969a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l f49011a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h00.l lVar) {
            super(1);
            this.f49011a = lVar;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("focusProperties");
            y0Var.a().b("scope", this.f49011a);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    public static final o1.f a(o1.f fVar, h00.l<? super p, vz.b0> scope) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(scope, "scope");
        return fVar.g0(new r(scope, x0.c() ? new b(scope) : x0.a()));
    }

    public static final g2.f<p> b() {
        return f49009a;
    }

    public static final void c(h2.s sVar, p properties) {
        kotlin.jvm.internal.s.g(sVar, "<this>");
        kotlin.jvm.internal.s.g(properties, "properties");
        if (properties.b()) {
            y.a(sVar);
        } else {
            y.e(sVar);
        }
    }
}