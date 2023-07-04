package f2;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;

/* loaded from: classes.dex */
public final class x {

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.q f25657a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h00.q qVar) {
            super(1);
            this.f25657a = qVar;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("layout");
            y0Var.a().b("measure", this.f25657a);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    public static final o1.f a(o1.f fVar, h00.q<? super b0, ? super y, ? super x2.b, ? extends a0> measure) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(measure, "measure");
        return fVar.g0(new w(measure, x0.c() ? new a(measure) : x0.a()));
    }
}