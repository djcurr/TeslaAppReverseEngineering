package f2;

import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e1;
import h2.a;

/* loaded from: classes.dex */
public final class t0 {

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.a<h2.k> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.a f25601a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h00.a aVar) {
            super(0);
            this.f25601a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [h2.k, java.lang.Object] */
        @Override // h00.a
        public final h2.k invoke() {
            return this.f25601a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1.f f25602a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.p<v0, x2.b, a0> f25603b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f25604c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f25605d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(o1.f fVar, h00.p<? super v0, ? super x2.b, ? extends a0> pVar, int i11, int i12) {
            super(2);
            this.f25602a = fVar;
            this.f25603b = pVar;
            this.f25604c = i11;
            this.f25605d = i12;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            t0.b(this.f25602a, this.f25603b, iVar, this.f25604c | 1, this.f25605d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<c1.z, c1.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u0 f25606a;

        /* loaded from: classes.dex */
        public static final class a implements c1.y {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ u0 f25607a;

            public a(u0 u0Var) {
                this.f25607a = u0Var;
            }

            @Override // c1.y
            public void dispose() {
                this.f25607a.t();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(u0 u0Var) {
            super(1);
            this.f25606a = u0Var;
        }

        @Override // h00.l
        public final c1.y invoke(c1.z DisposableEffect) {
            kotlin.jvm.internal.s.g(DisposableEffect, "$this$DisposableEffect");
            return new a(this.f25606a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u0 f25608a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(u0 u0Var) {
            super(0);
            this.f25608a = u0Var;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f25608a.v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u0 f25609a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1.f f25610b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<v0, x2.b, a0> f25611c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f25612d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f25613e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(u0 u0Var, o1.f fVar, h00.p<? super v0, ? super x2.b, ? extends a0> pVar, int i11, int i12) {
            super(2);
            this.f25609a = u0Var;
            this.f25610b = fVar;
            this.f25611c = pVar;
            this.f25612d = i11;
            this.f25613e = i12;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            t0.a(this.f25609a, this.f25610b, this.f25611c, iVar, this.f25612d | 1, this.f25613e);
        }
    }

    public static final void a(u0 state, o1.f fVar, h00.p<? super v0, ? super x2.b, ? extends a0> measurePolicy, c1.i iVar, int i11, int i12) {
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(measurePolicy, "measurePolicy");
        c1.i h11 = iVar.h(-607850265);
        if ((i12 & 2) != 0) {
            fVar = o1.f.f42062f1;
        }
        o1.f fVar2 = fVar;
        state.E(c1.h.d(h11, 0));
        c1.b0.a(state, new c(state), h11, 8);
        o1.f c11 = o1.e.c(h11, fVar2);
        x2.d dVar = (x2.d) h11.A(androidx.compose.ui.platform.l0.d());
        x2.q qVar = (x2.q) h11.A(androidx.compose.ui.platform.l0.i());
        y1 y1Var = (y1) h11.A(androidx.compose.ui.platform.l0.m());
        h00.a<h2.k> a11 = h2.k.f28686g1.a();
        h11.x(-2103250935);
        if (!(h11.k() instanceof c1.e)) {
            c1.h.c();
        }
        h11.m();
        if (h11.f()) {
            h11.s(new a(a11));
        } else {
            h11.o();
        }
        c1.i a12 = a2.a(h11);
        a2.b(a12, state.z());
        a.C0551a c0551a = h2.a.Y0;
        a2.c(a12, c11, c0551a.e());
        a2.c(a12, measurePolicy, state.y());
        a2.c(a12, dVar, c0551a.b());
        a2.c(a12, qVar, c0551a.c());
        a2.c(a12, y1Var, c0551a.f());
        h11.q();
        h11.N();
        if (!h11.i()) {
            c1.b0.h(new d(state), h11, 0);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new e(state, fVar2, measurePolicy, i11, i12));
    }

    public static final void b(o1.f fVar, h00.p<? super v0, ? super x2.b, ? extends a0> measurePolicy, c1.i iVar, int i11, int i12) {
        int i13;
        kotlin.jvm.internal.s.g(measurePolicy, "measurePolicy");
        c1.i h11 = iVar.h(-607851684);
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
            i13 |= h11.O(measurePolicy) ? 32 : 16;
        }
        if (((i13 & 91) ^ 18) == 0 && h11.i()) {
            h11.G();
        } else {
            if (i14 != 0) {
                fVar = o1.f.f42062f1;
            }
            h11.x(-3687241);
            Object y11 = h11.y();
            if (y11 == c1.i.f8486a.a()) {
                y11 = new u0();
                h11.p(y11);
            }
            h11.N();
            int i15 = i13 << 3;
            a((u0) y11, fVar, measurePolicy, h11, (i15 & 112) | 8 | (i15 & 896), 0);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new b(fVar, measurePolicy, i11, i12));
    }
}