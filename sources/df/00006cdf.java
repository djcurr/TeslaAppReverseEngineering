package f2;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;

/* loaded from: classes.dex */
public final class g0 {

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l f25578a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h00.l lVar) {
            super(1);
            this.f25578a = lVar;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("onGloballyPositioned");
            y0Var.a().b("onGloballyPositioned", this.f25578a);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    public static final o1.f a(o1.f fVar, h00.l<? super o, vz.b0> onGloballyPositioned) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(onGloballyPositioned, "onGloballyPositioned");
        return fVar.g0(new f0(onGloballyPositioned, x0.c() ? new a(onGloballyPositioned) : x0.a()));
    }
}