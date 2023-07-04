package p0;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import o1.a;

/* loaded from: classes.dex */
public final class d0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final d0 f45271a = new d0();

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.c f45272a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a.c cVar) {
            super(1);
            this.f45272a = cVar;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("align");
            y0Var.c(this.f45272a);
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
        final /* synthetic */ float f45273a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f45274b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f11, boolean z11) {
            super(1);
            this.f45273a = f11;
            this.f45274b = z11;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("weight");
            y0Var.c(Float.valueOf(this.f45273a));
            y0Var.a().b("weight", Float.valueOf(this.f45273a));
            y0Var.a().b("fill", Boolean.valueOf(this.f45274b));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    private d0() {
    }

    @Override // p0.c0
    public o1.f a(o1.f fVar, float f11, boolean z11) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        if (((double) f11) > 0.0d) {
            return fVar.g0(new q(f11, z11, x0.c() ? new b(f11, z11) : x0.a()));
        }
        throw new IllegalArgumentException(("invalid weight " + f11 + "; must be greater than zero").toString());
    }

    @Override // p0.c0
    public o1.f b(o1.f fVar, a.c alignment) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(alignment, "alignment");
        return fVar.g0(new j0(alignment, x0.c() ? new a(alignment) : x0.a()));
    }
}