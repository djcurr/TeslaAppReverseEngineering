package m0;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import o1.f;
import t1.c1;
import t1.m0;
import v20.o0;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a */
    private static final float f37871a = x2.g.f(30);

    /* renamed from: b */
    private static final o1.f f37872b;

    /* renamed from: c */
    private static final o1.f f37873c;

    /* loaded from: classes.dex */
    public static final class a implements c1 {
        a() {
        }

        @Override // t1.c1
        public m0 a(long j11, x2.q layoutDirection, x2.d density) {
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.s.g(density, "density");
            float G = density.G(d0.f37871a);
            return new m0.b(new s1.h(BitmapDescriptorFactory.HUE_RED, -G, s1.l.i(j11), s1.l.g(j11) + G));
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c1 {
        b() {
        }

        @Override // t1.c1
        public m0 a(long j11, x2.q layoutDirection, x2.d density) {
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.s.g(density, "density");
            float G = density.G(d0.f37871a);
            return new m0.b(new s1.h(-G, BitmapDescriptorFactory.HUE_RED, s1.l.i(j11) + G, s1.l.g(j11)));
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.a<e0> {

        /* renamed from: a */
        final /* synthetic */ int f37874a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11) {
            super(0);
            this.f37874a = i11;
        }

        @Override // h00.a
        /* renamed from: a */
        public final e0 invoke() {
            return new e0(this.f37874a);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ e0 f37875a;

        /* renamed from: b */
        final /* synthetic */ boolean f37876b;

        /* renamed from: c */
        final /* synthetic */ n0.p f37877c;

        /* renamed from: d */
        final /* synthetic */ boolean f37878d;

        /* renamed from: e */
        final /* synthetic */ boolean f37879e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e0 e0Var, boolean z11, n0.p pVar, boolean z12, boolean z13) {
            super(1);
            this.f37875a = e0Var;
            this.f37876b = z11;
            this.f37877c = pVar;
            this.f37878d = z12;
            this.f37879e = z13;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("scroll");
            y0Var.a().b("state", this.f37875a);
            y0Var.a().b("reverseScrolling", Boolean.valueOf(this.f37876b));
            y0Var.a().b("flingBehavior", this.f37877c);
            y0Var.a().b("isScrollable", Boolean.valueOf(this.f37878d));
            y0Var.a().b("isVertical", Boolean.valueOf(this.f37879e));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a */
        final /* synthetic */ boolean f37880a;

        /* renamed from: b */
        final /* synthetic */ e0 f37881b;

        /* renamed from: c */
        final /* synthetic */ boolean f37882c;

        /* renamed from: d */
        final /* synthetic */ n0.p f37883d;

        /* renamed from: e */
        final /* synthetic */ boolean f37884e;

        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<l2.v, vz.b0> {

            /* renamed from: a */
            final /* synthetic */ boolean f37885a;

            /* renamed from: b */
            final /* synthetic */ boolean f37886b;

            /* renamed from: c */
            final /* synthetic */ boolean f37887c;

            /* renamed from: d */
            final /* synthetic */ e0 f37888d;

            /* renamed from: e */
            final /* synthetic */ o0 f37889e;

            /* renamed from: m0.d0$e$a$a */
            /* loaded from: classes.dex */
            public static final class C0718a extends kotlin.jvm.internal.u implements h00.p<Float, Float, Boolean> {

                /* renamed from: a */
                final /* synthetic */ o0 f37890a;

                /* renamed from: b */
                final /* synthetic */ boolean f37891b;

                /* renamed from: c */
                final /* synthetic */ e0 f37892c;

                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", l = {284, 286}, m = "invokeSuspend")
                /* renamed from: m0.d0$e$a$a$a */
                /* loaded from: classes.dex */
                public static final class C0719a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

                    /* renamed from: a */
                    int f37893a;

                    /* renamed from: b */
                    final /* synthetic */ boolean f37894b;

                    /* renamed from: c */
                    final /* synthetic */ e0 f37895c;

                    /* renamed from: d */
                    final /* synthetic */ float f37896d;

                    /* renamed from: e */
                    final /* synthetic */ float f37897e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0719a(boolean z11, e0 e0Var, float f11, float f12, zz.d<? super C0719a> dVar) {
                        super(2, dVar);
                        this.f37894b = z11;
                        this.f37895c = e0Var;
                        this.f37896d = f11;
                        this.f37897e = f12;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                        return new C0719a(this.f37894b, this.f37895c, this.f37896d, this.f37897e, dVar);
                    }

                    @Override // h00.p
                    public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
                        return ((C0719a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object d11;
                        d11 = a00.d.d();
                        int i11 = this.f37893a;
                        if (i11 == 0) {
                            vz.r.b(obj);
                            if (this.f37894b) {
                                e0 e0Var = this.f37895c;
                                float f11 = this.f37896d;
                                this.f37893a = 1;
                                if (n0.b0.b(e0Var, f11, null, this, 2, null) == d11) {
                                    return d11;
                                }
                            } else {
                                e0 e0Var2 = this.f37895c;
                                float f12 = this.f37897e;
                                this.f37893a = 2;
                                if (n0.b0.b(e0Var2, f12, null, this, 2, null) == d11) {
                                    return d11;
                                }
                            }
                        } else if (i11 != 1 && i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            vz.r.b(obj);
                        }
                        return vz.b0.f54756a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0718a(o0 o0Var, boolean z11, e0 e0Var) {
                    super(2);
                    this.f37890a = o0Var;
                    this.f37891b = z11;
                    this.f37892c = e0Var;
                }

                public final Boolean a(float f11, float f12) {
                    v20.k.d(this.f37890a, null, null, new C0719a(this.f37891b, this.f37892c, f12, f11, null), 3, null);
                    return Boolean.TRUE;
                }

                @Override // h00.p
                public /* bridge */ /* synthetic */ Boolean invoke(Float f11, Float f12) {
                    return a(f11.floatValue(), f12.floatValue());
                }
            }

            /* loaded from: classes.dex */
            public static final class b extends kotlin.jvm.internal.u implements h00.a<Float> {

                /* renamed from: a */
                final /* synthetic */ e0 f37898a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(e0 e0Var) {
                    super(0);
                    this.f37898a = e0Var;
                }

                @Override // h00.a
                /* renamed from: a */
                public final Float invoke() {
                    return Float.valueOf(this.f37898a.j());
                }
            }

            /* loaded from: classes.dex */
            public static final class c extends kotlin.jvm.internal.u implements h00.a<Float> {

                /* renamed from: a */
                final /* synthetic */ e0 f37899a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(e0 e0Var) {
                    super(0);
                    this.f37899a = e0Var;
                }

                @Override // h00.a
                /* renamed from: a */
                public final Float invoke() {
                    return Float.valueOf(this.f37899a.i());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z11, boolean z12, boolean z13, e0 e0Var, o0 o0Var) {
                super(1);
                this.f37885a = z11;
                this.f37886b = z12;
                this.f37887c = z13;
                this.f37888d = e0Var;
                this.f37889e = o0Var;
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(l2.v vVar) {
                invoke2(vVar);
                return vz.b0.f54756a;
            }

            /* renamed from: invoke */
            public final void invoke2(l2.v semantics) {
                kotlin.jvm.internal.s.g(semantics, "$this$semantics");
                if (this.f37885a) {
                    l2.i iVar = new l2.i(new b(this.f37888d), new c(this.f37888d), this.f37886b);
                    if (this.f37887c) {
                        l2.t.W(semantics, iVar);
                    } else {
                        l2.t.I(semantics, iVar);
                    }
                    l2.t.B(semantics, null, new C0718a(this.f37889e, this.f37887c, this.f37888d), 1, null);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z11, e0 e0Var, boolean z12, n0.p pVar, boolean z13) {
            super(3);
            this.f37880a = z11;
            this.f37881b = e0Var;
            this.f37882c = z12;
            this.f37883d = pVar;
            this.f37884e = z13;
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(-1641237764);
            n0.v b11 = n0.b.b(iVar, 0);
            iVar.x(-723524056);
            iVar.x(-3687241);
            Object y11 = iVar.y();
            if (y11 == c1.i.f8486a.a()) {
                c1.s sVar = new c1.s(c1.b0.j(zz.h.f61280a, iVar));
                iVar.p(sVar);
                y11 = sVar;
            }
            iVar.N();
            o0 a11 = ((c1.s) y11).a();
            iVar.N();
            f.a aVar = o1.f.f42062f1;
            o1.f b12 = l2.o.b(aVar, false, new a(this.f37882c, this.f37884e, this.f37880a, this.f37881b, a11), 1, null);
            boolean z11 = this.f37880a;
            androidx.compose.foundation.gestures.a aVar2 = z11 ? androidx.compose.foundation.gestures.a.Vertical : androidx.compose.foundation.gestures.a.Horizontal;
            boolean z12 = !this.f37884e;
            o1.f g02 = d0.c(b12, this.f37880a).g0(n0.e0.f(aVar, this.f37881b, aVar2, b11, this.f37882c, (!(iVar.A(l0.i()) == x2.q.Rtl) || z11) ? z12 : !z12, this.f37883d, this.f37881b.h())).g0(new f0(this.f37881b, this.f37884e, this.f37880a, b11));
            iVar.N();
            return g02;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    static {
        f.a aVar = o1.f.f42062f1;
        f37872b = q1.d.a(aVar, new a());
        f37873c = q1.d.a(aVar, new b());
    }

    public static final void b(long j11, boolean z11) {
        if (z11) {
            if (!(x2.b.m(j11) != Integer.MAX_VALUE)) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
            return;
        }
        if (!(x2.b.n(j11) != Integer.MAX_VALUE)) {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
        }
    }

    public static final o1.f c(o1.f fVar, boolean z11) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        return fVar.g0(z11 ? f37873c : f37872b);
    }

    public static final e0 d(int i11, c1.i iVar, int i12, int i13) {
        iVar.x(122203352);
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        e0 e0Var = (e0) l1.b.b(new Object[0], e0.f37902f.a(), null, new c(i11), iVar, 72, 4);
        iVar.N();
        return e0Var;
    }

    private static final o1.f e(o1.f fVar, e0 e0Var, boolean z11, n0.p pVar, boolean z12, boolean z13) {
        return o1.e.a(fVar, x0.c() ? new d(e0Var, z11, pVar, z12, z13) : x0.a(), new e(z13, e0Var, z12, pVar, z11));
    }

    public static final o1.f f(o1.f fVar, e0 state, boolean z11, n0.p pVar, boolean z12) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(state, "state");
        return e(fVar, state, z12, pVar, z11, true);
    }

    public static /* synthetic */ o1.f g(o1.f fVar, e0 e0Var, boolean z11, n0.p pVar, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            pVar = null;
        }
        if ((i11 & 8) != 0) {
            z12 = false;
        }
        return f(fVar, e0Var, z11, pVar, z12);
    }
}