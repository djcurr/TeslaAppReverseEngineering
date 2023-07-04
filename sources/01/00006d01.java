package f2;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;

/* loaded from: classes.dex */
public final class r {

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f25599a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj) {
            super(1);
            this.f25599a = obj;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("layoutId");
            y0Var.c(this.f25599a);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    public static final Object a(y yVar) {
        kotlin.jvm.internal.s.g(yVar, "<this>");
        Object t11 = yVar.t();
        s sVar = t11 instanceof s ? (s) t11 : null;
        if (sVar == null) {
            return null;
        }
        return sVar.a();
    }

    public static final o1.f b(o1.f fVar, Object layoutId) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(layoutId, "layoutId");
        return fVar.g0(new q(layoutId, x0.c() ? new a(layoutId) : x0.a()));
    }
}