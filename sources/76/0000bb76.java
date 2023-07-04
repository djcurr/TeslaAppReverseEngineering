package w0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import o1.f;
import r2.d;

/* loaded from: classes.dex */
public final class y {

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<androidx.compose.ui.platform.y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f55270a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n2.a0 f55271b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, n2.a0 a0Var) {
            super(1);
            this.f55270a = i11;
            this.f55271b = a0Var;
        }

        public final void a(androidx.compose.ui.platform.y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("maxLinesHeight");
            y0Var.a().b("maxLines", Integer.valueOf(this.f55270a));
            y0Var.a().b("textStyle", this.f55271b);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(androidx.compose.ui.platform.y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f55272a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n2.a0 f55273b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, n2.a0 a0Var) {
            super(3);
            this.f55272a = i11;
            this.f55273b = a0Var;
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(-1924217056);
            int i12 = this.f55272a;
            int i13 = 0;
            if (i12 > 0) {
                if (i12 == Integer.MAX_VALUE) {
                    f.a aVar = o1.f.f42062f1;
                    iVar.N();
                    return aVar;
                }
                x2.d dVar = (x2.d) iVar.A(androidx.compose.ui.platform.l0.d());
                d.a aVar2 = (d.a) iVar.A(androidx.compose.ui.platform.l0.f());
                x2.q qVar = (x2.q) iVar.A(androidx.compose.ui.platform.l0.i());
                n2.a0 a0Var = this.f55273b;
                Object[] objArr = {dVar, aVar2, a0Var, qVar};
                iVar.x(-3685570);
                int i14 = 0;
                boolean z11 = false;
                while (i14 < 4) {
                    Object obj = objArr[i14];
                    i14++;
                    z11 |= iVar.O(obj);
                }
                Object y11 = iVar.y();
                if (z11 || y11 == c1.i.f8486a.a()) {
                    y11 = Integer.valueOf(x2.o.f(h0.a(n2.b0.b(a0Var, qVar), dVar, aVar2, h0.c(), 1)));
                    iVar.p(y11);
                }
                iVar.N();
                int intValue = ((Number) y11).intValue();
                n2.a0 a0Var2 = this.f55273b;
                Object[] objArr2 = {dVar, aVar2, a0Var2, qVar};
                iVar.x(-3685570);
                boolean z12 = false;
                while (i13 < 4) {
                    Object obj2 = objArr2[i13];
                    i13++;
                    z12 |= iVar.O(obj2);
                }
                Object y12 = iVar.y();
                if (z12 || y12 == c1.i.f8486a.a()) {
                    y12 = Integer.valueOf(x2.o.f(h0.a(n2.b0.b(a0Var2, qVar), dVar, aVar2, h0.c() + '\n' + h0.c(), 2)));
                    iVar.p(y12);
                }
                iVar.N();
                o1.f q11 = p0.e0.q(o1.f.f42062f1, BitmapDescriptorFactory.HUE_RED, dVar.b0(intValue + ((((Number) y12).intValue() - intValue) * (this.f55272a - 1))), 1, null);
                iVar.N();
                return q11;
            }
            throw new IllegalArgumentException("maxLines must be greater than 0".toString());
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final o1.f a(o1.f fVar, int i11, n2.a0 textStyle) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(textStyle, "textStyle");
        return o1.e.a(fVar, androidx.compose.ui.platform.x0.c() ? new a(i11, textStyle) : androidx.compose.ui.platform.x0.a(), new b(i11, textStyle));
    }
}