package f2;

import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e1;
import c1.g1;
import h2.a;

/* loaded from: classes.dex */
public final class u {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<h2.k, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f25614a = new a();

        a() {
            super(1);
        }

        public final void a(h2.k init) {
            kotlin.jvm.internal.s.g(init, "$this$init");
            init.Q0(true);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(h2.k kVar) {
            a(kVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1.f f25615a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f25616b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z f25617c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f25618d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f25619e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(o1.f fVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, z zVar, int i11, int i12) {
            super(2);
            this.f25615a = fVar;
            this.f25616b = pVar;
            this.f25617c = zVar;
            this.f25618d = i11;
            this.f25619e = i12;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            u.a(this.f25615a, this.f25616b, this.f25617c, iVar, this.f25618d | 1, this.f25619e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.q<g1<h2.a>, c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1.f f25620a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o1.f fVar) {
            super(3);
            this.f25620a = fVar;
        }

        public final void a(c1.i iVar, c1.i iVar2, int i11) {
            kotlin.jvm.internal.s.g(iVar, "$this$null");
            o1.f c11 = o1.e.c(iVar2, this.f25620a);
            iVar.x(509942095);
            a2.c(a2.a(iVar), c11, h2.a.Y0.e());
            iVar.N();
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(g1<h2.a> g1Var, c1.i iVar, Integer num) {
            a(g1Var.f(), iVar, num.intValue());
            return vz.b0.f54756a;
        }
    }

    public static final void a(o1.f fVar, h00.p<? super c1.i, ? super Integer, vz.b0> content, z measurePolicy, c1.i iVar, int i11, int i12) {
        int i13;
        kotlin.jvm.internal.s.g(content, "content");
        kotlin.jvm.internal.s.g(measurePolicy, "measurePolicy");
        c1.i h11 = iVar.h(-850547527);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (h11.O(fVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= h11.O(content) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            i13 |= h11.O(measurePolicy) ? 256 : 128;
        }
        if (((i13 & 731) ^ 146) == 0 && h11.i()) {
            h11.G();
        } else {
            if (i14 != 0) {
                fVar = o1.f.f42062f1;
            }
            o1.f c11 = o1.e.c(h11, fVar);
            x2.d dVar = (x2.d) h11.A(androidx.compose.ui.platform.l0.d());
            x2.q qVar = (x2.q) h11.A(androidx.compose.ui.platform.l0.i());
            y1 y1Var = (y1) h11.A(androidx.compose.ui.platform.l0.m());
            h00.a<h2.k> a11 = h2.k.f28686g1.a();
            int i15 = ((i13 << 3) & 896) | 6;
            h11.x(1546167803);
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
            a.C0551a c0551a = h2.a.Y0;
            a2.c(a12, c11, c0551a.e());
            a2.c(a12, measurePolicy, c0551a.d());
            a2.c(a12, dVar, c0551a.b());
            a2.c(a12, qVar, c0551a.c());
            a2.c(a12, y1Var, c0551a.f());
            a2.b(a12, a.f25614a);
            h11.c();
            content.invoke(h11, Integer.valueOf((i15 >> 6) & 14));
            h11.q();
            h11.N();
        }
        o1.f fVar2 = fVar;
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new b(fVar2, content, measurePolicy, i11, i12));
    }

    public static final h00.q<g1<h2.a>, c1.i, Integer, vz.b0> b(o1.f modifier) {
        kotlin.jvm.internal.s.g(modifier, "modifier");
        return j1.c.c(-985542424, true, new c(modifier));
    }
}