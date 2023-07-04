package p0;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e1;
import c1.g1;
import f2.b0;
import f2.m0;
import f2.z;
import h2.a;
import java.util.List;

/* loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements f2.z {

        /* renamed from: a  reason: collision with root package name */
        public static final a f45334a = new a();

        /* renamed from: p0.h0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0966a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0966a f45335a = new C0966a();

            C0966a() {
                super(1);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(m0.a aVar) {
                invoke2(aVar);
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(m0.a layout) {
                kotlin.jvm.internal.s.g(layout, "$this$layout");
            }
        }

        a() {
        }

        @Override // f2.z
        public int a(f2.k kVar, List<? extends f2.j> list, int i11) {
            return z.a.d(this, kVar, list, i11);
        }

        @Override // f2.z
        public final f2.a0 b(f2.b0 Layout, List<? extends f2.y> noName_0, long j11) {
            kotlin.jvm.internal.s.g(Layout, "$this$Layout");
            kotlin.jvm.internal.s.g(noName_0, "$noName_0");
            return b0.a.b(Layout, x2.b.l(j11) ? x2.b.n(j11) : 0, x2.b.k(j11) ? x2.b.m(j11) : 0, null, C0966a.f45335a, 4, null);
        }

        @Override // f2.z
        public int c(f2.k kVar, List<? extends f2.j> list, int i11) {
            return z.a.b(this, kVar, list, i11);
        }

        @Override // f2.z
        public int d(f2.k kVar, List<? extends f2.j> list, int i11) {
            return z.a.a(this, kVar, list, i11);
        }

        @Override // f2.z
        public int e(f2.k kVar, List<? extends f2.j> list, int i11) {
            return z.a.c(this, kVar, list, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1.f f45336a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f45337b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o1.f fVar, int i11) {
            super(2);
            this.f45336a = fVar;
            this.f45337b = i11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            h0.a(this.f45336a, iVar, this.f45337b | 1);
        }
    }

    public static final void a(o1.f modifier, c1.i iVar, int i11) {
        int i12;
        kotlin.jvm.internal.s.g(modifier, "modifier");
        c1.i h11 = iVar.h(220050211);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (((i12 & 11) ^ 2) == 0 && h11.i()) {
            h11.G();
        } else {
            a aVar = a.f45334a;
            h11.x(1376089394);
            x2.d dVar = (x2.d) h11.A(l0.d());
            x2.q qVar = (x2.q) h11.A(l0.i());
            y1 y1Var = (y1) h11.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a11 = c0551a.a();
            h00.q<g1<h2.a>, c1.i, Integer, vz.b0> b11 = f2.u.b(modifier);
            int i13 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
            if (!(h11.k() instanceof c1.e)) {
                c1.h.c();
            }
            h11.D();
            if (h11.f()) {
                h11.s(a11);
            } else {
                h11.o();
            }
            h11.E();
            c1.i a12 = a2.a(h11);
            a2.c(a12, aVar, c0551a.d());
            a2.c(a12, dVar, c0551a.b());
            a2.c(a12, qVar, c0551a.c());
            a2.c(a12, y1Var, c0551a.f());
            h11.c();
            b11.invoke(g1.a(g1.b(h11)), h11, Integer.valueOf((i13 >> 3) & 112));
            h11.x(2058660585);
            h11.x(348366449);
            if (((((i13 >> 9) & 14) & 11) ^ 2) == 0 && h11.i()) {
                h11.G();
            }
            h11.N();
            h11.N();
            h11.q();
            h11.N();
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new b(modifier, i11));
    }
}