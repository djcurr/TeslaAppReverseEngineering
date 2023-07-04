package q1;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import t1.c1;
import t1.f0;
import t1.g0;
import vz.b0;

/* loaded from: classes.dex */
public final class p {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends u implements h00.l<g0, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f47322a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c1 f47323b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f47324c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f11, c1 c1Var, boolean z11) {
            super(1);
            this.f47322a = f11;
            this.f47323b = c1Var;
            this.f47324c = z11;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(g0 g0Var) {
            invoke2(g0Var);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(g0 graphicsLayer) {
            s.g(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.Q(graphicsLayer.i0(this.f47322a));
            graphicsLayer.x(this.f47323b);
            graphicsLayer.B(this.f47324c);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends u implements h00.l<y0, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f47325a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c1 f47326b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f47327c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f11, c1 c1Var, boolean z11) {
            super(1);
            this.f47325a = f11;
            this.f47326b = c1Var;
            this.f47327c = z11;
        }

        public final void a(y0 y0Var) {
            s.g(y0Var, "$this$null");
            y0Var.b("shadow");
            y0Var.a().b("elevation", x2.g.c(this.f47325a));
            y0Var.a().b("shape", this.f47326b);
            y0Var.a().b("clip", Boolean.valueOf(this.f47327c));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(y0 y0Var) {
            a(y0Var);
            return b0.f54756a;
        }
    }

    public static final o1.f a(o1.f shadow, float f11, c1 shape, boolean z11) {
        s.g(shadow, "$this$shadow");
        s.g(shape, "shape");
        if (x2.g.e(f11, x2.g.f(0)) > 0 || z11) {
            return x0.b(shadow, x0.c() ? new b(f11, shape, z11) : x0.a(), f0.a(o1.f.f42062f1, new a(f11, shape, z11)));
        }
        return shadow;
    }
}