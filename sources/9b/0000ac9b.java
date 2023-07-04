package q1;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import h00.q;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes.dex */
public final class i {

    /* loaded from: classes.dex */
    public static final class a extends u implements h00.l<y0, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l f47299a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h00.l lVar) {
            super(1);
            this.f47299a = lVar;
        }

        public final void a(y0 y0Var) {
            s.g(y0Var, "$this$null");
            y0Var.b("drawBehind");
            y0Var.a().b("onDraw", this.f47299a);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(y0 y0Var) {
            a(y0Var);
            return b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends u implements h00.l<y0, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l f47300a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h00.l lVar) {
            super(1);
            this.f47300a = lVar;
        }

        public final void a(y0 y0Var) {
            s.g(y0Var, "$this$null");
            y0Var.b("drawWithCache");
            y0Var.a().b("onBuildDrawCache", this.f47300a);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(y0 y0Var) {
            a(y0Var);
            return b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class c extends u implements q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<q1.c, j> f47301a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(h00.l<? super q1.c, j> lVar) {
            super(3);
            this.f47301a = lVar;
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            s.g(composed, "$this$composed");
            iVar.x(514408810);
            iVar.x(-3687241);
            Object y11 = iVar.y();
            if (y11 == c1.i.f8486a.a()) {
                y11 = new q1.c();
                iVar.p(y11);
            }
            iVar.N();
            o1.f g02 = composed.g0(new g((q1.c) y11, this.f47301a));
            iVar.N();
            return g02;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends u implements h00.l<y0, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l f47302a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h00.l lVar) {
            super(1);
            this.f47302a = lVar;
        }

        public final void a(y0 y0Var) {
            s.g(y0Var, "$this$null");
            y0Var.b("drawWithContent");
            y0Var.a().b("onDraw", this.f47302a);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(y0 y0Var) {
            a(y0Var);
            return b0.f54756a;
        }
    }

    public static final o1.f a(o1.f fVar, h00.l<? super v1.e, b0> onDraw) {
        s.g(fVar, "<this>");
        s.g(onDraw, "onDraw");
        return fVar.g0(new e(onDraw, x0.c() ? new a(onDraw) : x0.a()));
    }

    public static final o1.f b(o1.f fVar, h00.l<? super q1.c, j> onBuildDrawCache) {
        s.g(fVar, "<this>");
        s.g(onBuildDrawCache, "onBuildDrawCache");
        return o1.e.a(fVar, x0.c() ? new b(onBuildDrawCache) : x0.a(), new c(onBuildDrawCache));
    }

    public static final o1.f c(o1.f fVar, h00.l<? super v1.c, b0> onDraw) {
        s.g(fVar, "<this>");
        s.g(onDraw, "onDraw");
        return fVar.g0(new k(onDraw, x0.c() ? new d(onDraw) : x0.a()));
    }
}