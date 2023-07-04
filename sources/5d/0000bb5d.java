package w0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.b0;
import f2.m0;
import r2.d;

/* loaded from: classes.dex */
public final class s0 {

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n2.a0 f55202a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: w0.s0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1258a extends kotlin.jvm.internal.u implements h00.q<f2.b0, f2.y, x2.b, f2.a0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r0 f55203a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: w0.s0$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1259a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f2.m0 f55204a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1259a(f2.m0 m0Var) {
                    super(1);
                    this.f55204a = m0Var;
                }

                @Override // h00.l
                public /* bridge */ /* synthetic */ vz.b0 invoke(m0.a aVar) {
                    invoke2(aVar);
                    return vz.b0.f54756a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(m0.a layout) {
                    kotlin.jvm.internal.s.g(layout, "$this$layout");
                    m0.a.n(layout, this.f55204a, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1258a(r0 r0Var) {
                super(3);
                this.f55203a = r0Var;
            }

            public final f2.a0 a(f2.b0 layout, f2.y measurable, long j11) {
                int m11;
                int m12;
                kotlin.jvm.internal.s.g(layout, "$this$layout");
                kotlin.jvm.internal.s.g(measurable, "measurable");
                p0.e0.h(o1.f.f42062f1, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 3, null);
                long b11 = this.f55203a.b();
                m11 = m00.l.m(x2.o.g(b11), x2.b.p(j11), x2.b.n(j11));
                m12 = m00.l.m(x2.o.f(b11), x2.b.o(j11), x2.b.m(j11));
                f2.m0 X = measurable.X(x2.b.e(j11, m11, 0, m12, 0, 10, null));
                return b0.a.b(layout, X.B0(), X.w0(), null, new C1259a(X), 4, null);
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ f2.a0 invoke(f2.b0 b0Var, f2.y yVar, x2.b bVar) {
                return a(b0Var, yVar, bVar.s());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n2.a0 a0Var) {
            super(3);
            this.f55202a = a0Var;
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(31601380);
            x2.d dVar = (x2.d) iVar.A(androidx.compose.ui.platform.l0.d());
            d.a aVar = (d.a) iVar.A(androidx.compose.ui.platform.l0.f());
            x2.q qVar = (x2.q) iVar.A(androidx.compose.ui.platform.l0.i());
            n2.a0 a0Var = this.f55202a;
            iVar.x(-3687241);
            Object y11 = iVar.y();
            if (y11 == c1.i.f8486a.a()) {
                y11 = new r0(qVar, dVar, aVar, a0Var);
                iVar.p(y11);
            }
            iVar.N();
            r0 r0Var = (r0) y11;
            r0Var.c(qVar, dVar, aVar, this.f55202a);
            o1.f a11 = f2.x.a(o1.f.f42062f1, new C1258a(r0Var));
            iVar.N();
            return a11;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final o1.f a(o1.f fVar, n2.a0 style) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(style, "style");
        return o1.e.b(fVar, null, new a(style), 1, null);
    }
}