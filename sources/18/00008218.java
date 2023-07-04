package l2;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import vz.b0;

/* loaded from: classes.dex */
public final class o {

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<y0, b0> {

        /* renamed from: a */
        final /* synthetic */ boolean f36443a;

        /* renamed from: b */
        final /* synthetic */ h00.l f36444b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z11, h00.l lVar) {
            super(1);
            this.f36443a = z11;
            this.f36444b = lVar;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("semantics");
            y0Var.a().b("mergeDescendants", Boolean.valueOf(this.f36443a));
            y0Var.a().b("properties", this.f36444b);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(y0 y0Var) {
            a(y0Var);
            return b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a */
        final /* synthetic */ boolean f36445a;

        /* renamed from: b */
        final /* synthetic */ h00.l<v, b0> f36446b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z11, h00.l<? super v, b0> lVar) {
            super(3);
            this.f36445a = z11;
            this.f36446b = lVar;
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(2121191606);
            iVar.x(-3687241);
            Object y11 = iVar.y();
            if (y11 == c1.i.f8486a.a()) {
                y11 = Integer.valueOf(n.f36439c.a());
                iVar.p(y11);
            }
            iVar.N();
            n nVar = new n(((Number) y11).intValue(), this.f36445a, false, this.f36446b);
            iVar.N();
            return nVar;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final o1.f a(o1.f fVar, boolean z11, h00.l<? super v, b0> properties) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(properties, "properties");
        return o1.e.a(fVar, x0.c() ? new a(z11, properties) : x0.a(), new b(z11, properties));
    }

    public static /* synthetic */ o1.f b(o1.f fVar, boolean z11, h00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return a(fVar, z11, lVar);
    }
}