package r1;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;

/* loaded from: classes.dex */
public final class v {

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f49020a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s sVar) {
            super(1);
            this.f49020a = sVar;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("focusRequester");
            y0Var.a().b("focusRequester", this.f49020a);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    public static final o1.f a(o1.f fVar, s focusRequester) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(focusRequester, "focusRequester");
        return fVar.g0(new u(focusRequester, x0.c() ? new a(focusRequester) : x0.a()));
    }
}