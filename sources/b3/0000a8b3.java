package p0;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e1;
import c1.g1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.b0;
import f2.m0;
import f2.z;
import h2.a;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final f2.z f45249a = d(o1.a.f42039a.k(), false);

    /* renamed from: b  reason: collision with root package name */
    private static final f2.z f45250b = b.f45253a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1.f f45251a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f45252b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o1.f fVar, int i11) {
            super(2);
            this.f45251a = fVar;
            this.f45252b = i11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            c.a(this.f45251a, iVar, this.f45252b | 1);
        }
    }

    /* loaded from: classes.dex */
    static final class b implements f2.z {

        /* renamed from: a  reason: collision with root package name */
        public static final b f45253a = new b();

        /* loaded from: classes.dex */
        static final class a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f45254a = new a();

            a() {
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

        b() {
        }

        @Override // f2.z
        public int a(f2.k kVar, List<? extends f2.j> list, int i11) {
            return z.a.d(this, kVar, list, i11);
        }

        @Override // f2.z
        public final f2.a0 b(f2.b0 MeasurePolicy, List<? extends f2.y> noName_0, long j11) {
            kotlin.jvm.internal.s.g(MeasurePolicy, "$this$MeasurePolicy");
            kotlin.jvm.internal.s.g(noName_0, "$noName_0");
            return b0.a.b(MeasurePolicy, x2.b.p(j11), x2.b.o(j11), null, a.f45254a, 4, null);
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
    /* renamed from: p0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0963c implements f2.z {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f45255a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1.a f45256b;

        /* renamed from: p0.c$c$a */
        /* loaded from: classes.dex */
        static final class a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f45257a = new a();

            a() {
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

        /* renamed from: p0.c$c$b */
        /* loaded from: classes.dex */
        static final class b extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m0 f45258a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f2.y f45259b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ f2.b0 f45260c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f45261d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f45262e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ o1.a f45263f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(m0 m0Var, f2.y yVar, f2.b0 b0Var, int i11, int i12, o1.a aVar) {
                super(1);
                this.f45258a = m0Var;
                this.f45259b = yVar;
                this.f45260c = b0Var;
                this.f45261d = i11;
                this.f45262e = i12;
                this.f45263f = aVar;
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(m0.a aVar) {
                invoke2(aVar);
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(m0.a layout) {
                kotlin.jvm.internal.s.g(layout, "$this$layout");
                c.h(layout, this.f45258a, this.f45259b, this.f45260c.getLayoutDirection(), this.f45261d, this.f45262e, this.f45263f);
            }
        }

        /* renamed from: p0.c$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0964c extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m0[] f45264a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List<f2.y> f45265b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ f2.b0 f45266c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.j0 f45267d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.j0 f45268e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ o1.a f45269f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0964c(Placeable[] placeableArr, List<? extends f2.y> list, f2.b0 b0Var, kotlin.jvm.internal.j0 j0Var, kotlin.jvm.internal.j0 j0Var2, o1.a aVar) {
                super(1);
                this.f45264a = placeableArr;
                this.f45265b = list;
                this.f45266c = b0Var;
                this.f45267d = j0Var;
                this.f45268e = j0Var2;
                this.f45269f = aVar;
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(m0.a aVar) {
                invoke2(aVar);
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(m0.a layout) {
                kotlin.jvm.internal.s.g(layout, "$this$layout");
                m0[] m0VarArr = this.f45264a;
                List<f2.y> list = this.f45265b;
                f2.b0 b0Var = this.f45266c;
                kotlin.jvm.internal.j0 j0Var = this.f45267d;
                kotlin.jvm.internal.j0 j0Var2 = this.f45268e;
                o1.a aVar = this.f45269f;
                int length = m0VarArr.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    m0 m0Var = m0VarArr[i11];
                    Objects.requireNonNull(m0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    c.h(layout, m0Var, list.get(i12), b0Var.getLayoutDirection(), j0Var.f34912a, j0Var2.f34912a, aVar);
                    i11++;
                    i12++;
                }
            }
        }

        C0963c(boolean z11, o1.a aVar) {
            this.f45255a = z11;
            this.f45256b = aVar;
        }

        @Override // f2.z
        public int a(f2.k kVar, List<? extends f2.j> list, int i11) {
            return z.a.d(this, kVar, list, i11);
        }

        @Override // f2.z
        public final f2.a0 b(f2.b0 MeasurePolicy, List<? extends f2.y> measurables, long j11) {
            int p11;
            m0 X;
            int i11;
            kotlin.jvm.internal.s.g(MeasurePolicy, "$this$MeasurePolicy");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            if (measurables.isEmpty()) {
                return b0.a.b(MeasurePolicy, x2.b.p(j11), x2.b.o(j11), null, a.f45257a, 4, null);
            }
            long e11 = this.f45255a ? j11 : x2.b.e(j11, 0, 0, 0, 0, 10, null);
            int i12 = 0;
            if (measurables.size() == 1) {
                f2.y yVar = measurables.get(0);
                if (!c.g(yVar)) {
                    m0 X2 = yVar.X(e11);
                    int max = Math.max(x2.b.p(j11), X2.B0());
                    i11 = Math.max(x2.b.o(j11), X2.w0());
                    X = X2;
                    p11 = max;
                } else {
                    p11 = x2.b.p(j11);
                    int o11 = x2.b.o(j11);
                    X = yVar.X(x2.b.f56930b.c(x2.b.p(j11), x2.b.o(j11)));
                    i11 = o11;
                }
                return b0.a.b(MeasurePolicy, p11, i11, null, new b(X, yVar, MeasurePolicy, p11, i11, this.f45256b), 4, null);
            }
            m0[] m0VarArr = new m0[measurables.size()];
            kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
            j0Var.f34912a = x2.b.p(j11);
            kotlin.jvm.internal.j0 j0Var2 = new kotlin.jvm.internal.j0();
            j0Var2.f34912a = x2.b.o(j11);
            int size = measurables.size();
            int i13 = 0;
            boolean z11 = false;
            while (i13 < size) {
                int i14 = i13 + 1;
                f2.y yVar2 = measurables.get(i13);
                if (c.g(yVar2)) {
                    z11 = true;
                } else {
                    m0 X3 = yVar2.X(e11);
                    m0VarArr[i13] = X3;
                    j0Var.f34912a = Math.max(j0Var.f34912a, X3.B0());
                    j0Var2.f34912a = Math.max(j0Var2.f34912a, X3.w0());
                }
                i13 = i14;
            }
            if (z11) {
                int i15 = j0Var.f34912a;
                int i16 = i15 != Integer.MAX_VALUE ? i15 : 0;
                int i17 = j0Var2.f34912a;
                long a11 = x2.c.a(i16, i15, i17 != Integer.MAX_VALUE ? i17 : 0, i17);
                int size2 = measurables.size();
                while (i12 < size2) {
                    int i18 = i12 + 1;
                    f2.y yVar3 = measurables.get(i12);
                    if (c.g(yVar3)) {
                        m0VarArr[i12] = yVar3.X(a11);
                    }
                    i12 = i18;
                }
            }
            return b0.a.b(MeasurePolicy, j0Var.f34912a, j0Var2.f34912a, null, new C0964c(m0VarArr, measurables, MeasurePolicy, j0Var, j0Var2, this.f45256b), 4, null);
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

    public static final void a(o1.f modifier, c1.i iVar, int i11) {
        int i12;
        kotlin.jvm.internal.s.g(modifier, "modifier");
        c1.i h11 = iVar.h(-1990469439);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (((i12 & 11) ^ 2) == 0 && h11.i()) {
            h11.G();
        } else {
            f2.z zVar = f45250b;
            h11.x(1376089394);
            x2.d dVar = (x2.d) h11.A(l0.d());
            x2.q qVar = (x2.q) h11.A(l0.i());
            y1 y1Var = (y1) h11.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a11 = c0551a.a();
            h00.q<g1<h2.a>, c1.i, Integer, vz.b0> b11 = f2.u.b(modifier);
            int i13 = (((((i12 << 3) & 112) | 384) << 9) & 7168) | 6;
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
            a2.c(a12, zVar, c0551a.d());
            a2.c(a12, dVar, c0551a.b());
            a2.c(a12, qVar, c0551a.c());
            a2.c(a12, y1Var, c0551a.f());
            h11.c();
            b11.invoke(g1.a(g1.b(h11)), h11, Integer.valueOf((i13 >> 3) & 112));
            h11.x(2058660585);
            h11.x(-1253624692);
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
        l11.a(new a(modifier, i11));
    }

    public static final f2.z d(o1.a alignment, boolean z11) {
        kotlin.jvm.internal.s.g(alignment, "alignment");
        return new C0963c(z11, alignment);
    }

    private static final p0.b e(f2.y yVar) {
        Object t11 = yVar.t();
        if (t11 instanceof p0.b) {
            return (p0.b) t11;
        }
        return null;
    }

    public static final f2.z f() {
        return f45249a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(f2.y yVar) {
        p0.b e11 = e(yVar);
        if (e11 == null) {
            return false;
        }
        return e11.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(m0.a aVar, m0 m0Var, f2.y yVar, x2.q qVar, int i11, int i12, o1.a aVar2) {
        o1.a b11;
        p0.b e11 = e(yVar);
        m0.a.l(aVar, m0Var, ((e11 == null || (b11 = e11.b()) == null) ? aVar2 : b11).a(x2.p.a(m0Var.B0(), m0Var.w0()), x2.p.a(i11, i12), qVar), BitmapDescriptorFactory.HUE_RED, 2, null);
    }

    public static final f2.z i(o1.a alignment, boolean z11, c1.i iVar, int i11) {
        f2.z d11;
        kotlin.jvm.internal.s.g(alignment, "alignment");
        iVar.x(2076429144);
        iVar.x(-3686930);
        boolean O = iVar.O(alignment);
        Object y11 = iVar.y();
        if (O || y11 == c1.i.f8486a.a()) {
            if (kotlin.jvm.internal.s.c(alignment, o1.a.f42039a.k()) && !z11) {
                d11 = f();
            } else {
                d11 = d(alignment, z11);
            }
            y11 = d11;
            iVar.p(y11);
        }
        iVar.N();
        f2.z zVar = (f2.z) y11;
        iVar.N();
        return zVar;
    }
}