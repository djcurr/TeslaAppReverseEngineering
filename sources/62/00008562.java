package m0;

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
import o1.f;

/* loaded from: classes.dex */
public final class o {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements f2.z {

        /* renamed from: a  reason: collision with root package name */
        public static final a f38060a = new a();

        /* renamed from: m0.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0728a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0728a f38061a = new C0728a();

            C0728a() {
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
            return b0.a.b(Layout, x2.b.p(j11), x2.b.o(j11), null, C0728a.f38061a, 4, null);
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
        final /* synthetic */ w1.b f38062a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f38063b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o1.f f38064c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ o1.a f38065d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f2.d f38066e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f38067f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ t1.b0 f38068g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f38069h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f38070i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(w1.b bVar, String str, o1.f fVar, o1.a aVar, f2.d dVar, float f11, t1.b0 b0Var, int i11, int i12) {
            super(2);
            this.f38062a = bVar;
            this.f38063b = str;
            this.f38064c = fVar;
            this.f38065d = aVar;
            this.f38066e = dVar;
            this.f38067f = f11;
            this.f38068g = b0Var;
            this.f38069h = i11;
            this.f38070i = i12;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            o.a(this.f38062a, this.f38063b, this.f38064c, this.f38065d, this.f38066e, this.f38067f, this.f38068g, iVar, this.f38069h | 1, this.f38070i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<l2.v, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f38071a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.f38071a = str;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(l2.v vVar) {
            invoke2(vVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(l2.v semantics) {
            kotlin.jvm.internal.s.g(semantics, "$this$semantics");
            l2.t.F(semantics, this.f38071a);
            l2.t.L(semantics, l2.h.f36408b.c());
        }
    }

    public static final void a(w1.b painter, String str, o1.f fVar, o1.a aVar, f2.d dVar, float f11, t1.b0 b0Var, c1.i iVar, int i11, int i12) {
        o1.f fVar2;
        kotlin.jvm.internal.s.g(painter, "painter");
        c1.i h11 = iVar.h(-816794549);
        f.a aVar2 = (i12 & 4) != 0 ? o1.f.f42062f1 : fVar;
        o1.a d11 = (i12 & 8) != 0 ? o1.a.f42039a.d() : aVar;
        f2.d a11 = (i12 & 16) != 0 ? f2.d.f25565a.a() : dVar;
        float f12 = (i12 & 32) != 0 ? 1.0f : f11;
        t1.b0 b0Var2 = (i12 & 64) != 0 ? null : b0Var;
        h11.x(-816794258);
        if (str != null) {
            f.a aVar3 = o1.f.f42062f1;
            h11.x(-3686930);
            boolean O = h11.O(str);
            Object y11 = h11.y();
            if (O || y11 == c1.i.f8486a.a()) {
                y11 = new c(str);
                h11.p(y11);
            }
            h11.N();
            fVar2 = l2.o.b(aVar3, false, (h00.l) y11, 1, null);
        } else {
            fVar2 = o1.f.f42062f1;
        }
        h11.N();
        o1.f b11 = q1.n.b(q1.d.b(aVar2.g0(fVar2)), painter, false, d11, a11, f12, b0Var2, 2, null);
        a aVar4 = a.f38060a;
        h11.x(1376089394);
        x2.d dVar2 = (x2.d) h11.A(l0.d());
        x2.q qVar = (x2.q) h11.A(l0.i());
        y1 y1Var = (y1) h11.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a12 = c0551a.a();
        h00.q<g1<h2.a>, c1.i, Integer, vz.b0> b12 = f2.u.b(b11);
        if (!(h11.k() instanceof c1.e)) {
            c1.h.c();
        }
        h11.D();
        if (h11.f()) {
            h11.s(a12);
        } else {
            h11.o();
        }
        h11.E();
        c1.i a13 = a2.a(h11);
        a2.c(a13, aVar4, c0551a.d());
        a2.c(a13, dVar2, c0551a.b());
        a2.c(a13, qVar, c0551a.c());
        a2.c(a13, y1Var, c0551a.f());
        h11.c();
        b12.invoke(g1.a(g1.b(h11)), h11, 0);
        h11.x(2058660585);
        h11.x(-820198811);
        h11.N();
        h11.N();
        h11.q();
        h11.N();
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new b(painter, str, aVar2, d11, a11, f12, b0Var2, i11, i12));
    }
}