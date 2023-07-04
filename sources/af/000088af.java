package n0;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import c1.i;
import c1.n1;
import c1.s1;
import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.l0;
import n0.i;
import v20.o0;
import v20.p0;

/* loaded from: classes.dex */
public final class m {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", l = {309, 318, 327, 329}, m = "awaitDownAndSlop")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        Object f40012a;

        /* renamed from: b */
        Object f40013b;

        /* renamed from: c */
        Object f40014c;

        /* renamed from: d */
        Object f40015d;

        /* renamed from: e */
        Object f40016e;

        /* renamed from: f */
        /* synthetic */ Object f40017f;

        /* renamed from: g */
        int f40018g;

        a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40017f = obj;
            this.f40018g |= Integer.MIN_VALUE;
            return m.f(null, null, null, null, null, this);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<d2.u, Float, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ e2.f f40019a;

        /* renamed from: b */
        final /* synthetic */ kotlin.jvm.internal.i0 f40020b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e2.f fVar, kotlin.jvm.internal.i0 i0Var) {
            super(2);
            this.f40019a = fVar;
            this.f40020b = i0Var;
        }

        public final void a(d2.u event, float f11) {
            kotlin.jvm.internal.s.g(event, "event");
            e2.g.a(this.f40019a, event);
            d2.n.g(event);
            this.f40020b.f34910a = f11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(d2.u uVar, Float f11) {
            a(uVar, f11.floatValue());
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<d2.u, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ e2.f f40021a;

        /* renamed from: b */
        final /* synthetic */ androidx.compose.foundation.gestures.a f40022b;

        /* renamed from: c */
        final /* synthetic */ x20.x<n0.i> f40023c;

        /* renamed from: d */
        final /* synthetic */ boolean f40024d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(e2.f fVar, androidx.compose.foundation.gestures.a aVar, x20.x<? super n0.i> xVar, boolean z11) {
            super(1);
            this.f40021a = fVar;
            this.f40022b = aVar;
            this.f40023c = xVar;
            this.f40024d = z11;
        }

        public final void a(d2.u event) {
            kotlin.jvm.internal.s.g(event, "event");
            e2.g.a(this.f40021a, event);
            float l11 = m.l(d2.n.j(event), this.f40022b);
            d2.n.g(event);
            x20.x<n0.i> xVar = this.f40023c;
            if (this.f40024d) {
                l11 *= -1;
            }
            xVar.d(new i.b(l11, event.h(), null));
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(d2.u uVar) {
            a(uVar);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ h00.l f40025a;

        /* renamed from: b */
        final /* synthetic */ androidx.compose.foundation.gestures.a f40026b;

        /* renamed from: c */
        final /* synthetic */ boolean f40027c;

        /* renamed from: d */
        final /* synthetic */ boolean f40028d;

        /* renamed from: e */
        final /* synthetic */ o0.m f40029e;

        /* renamed from: f */
        final /* synthetic */ h00.a f40030f;

        /* renamed from: g */
        final /* synthetic */ h00.q f40031g;

        /* renamed from: h */
        final /* synthetic */ h00.q f40032h;

        /* renamed from: i */
        final /* synthetic */ h00.p f40033i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h00.l lVar, androidx.compose.foundation.gestures.a aVar, boolean z11, boolean z12, o0.m mVar, h00.a aVar2, h00.q qVar, h00.q qVar2, h00.p pVar) {
            super(1);
            this.f40025a = lVar;
            this.f40026b = aVar;
            this.f40027c = z11;
            this.f40028d = z12;
            this.f40029e = mVar;
            this.f40030f = aVar2;
            this.f40031g = qVar;
            this.f40032h = qVar2;
            this.f40033i = pVar;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("draggable");
            y0Var.a().b("canDrag", this.f40025a);
            y0Var.a().b("orientation", this.f40026b);
            y0Var.a().b("enabled", Boolean.valueOf(this.f40027c));
            y0Var.a().b("reverseDirection", Boolean.valueOf(this.f40028d));
            y0Var.a().b("interactionSource", this.f40029e);
            y0Var.a().b("startDragImmediately", this.f40030f);
            y0Var.a().b("onDragStarted", this.f40031g);
            y0Var.a().b("onDragStopped", this.f40032h);
            y0Var.a().b("stateFactory", this.f40033i);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements h00.q<o0, s1.f, zz.d<? super vz.b0>, Object> {

        /* renamed from: a */
        int f40034a;

        e(zz.d<? super e> dVar) {
            super(3, dVar);
        }

        public final Object e(o0 o0Var, long j11, zz.d<? super vz.b0> dVar) {
            return new e(dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, s1.f fVar, zz.d<? super vz.b0> dVar) {
            return e(o0Var, fVar.t(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f40034a == 0) {
                vz.r.b(obj);
                return vz.b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$2", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements h00.q<o0, Float, zz.d<? super vz.b0>, Object> {

        /* renamed from: a */
        int f40035a;

        f(zz.d<? super f> dVar) {
            super(3, dVar);
        }

        public final Object e(o0 o0Var, float f11, zz.d<? super vz.b0> dVar) {
            return new f(dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, Float f11, zz.d<? super vz.b0> dVar) {
            return e(o0Var, f11.floatValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f40035a == 0) {
                vz.r.b(obj);
                return vz.b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, x> {

        /* renamed from: a */
        final /* synthetic */ n f40036a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(n nVar) {
            super(2);
            this.f40036a = nVar;
        }

        public final x a(c1.i iVar, int i11) {
            iVar.x(-1197727804);
            n nVar = this.f40036a;
            iVar.x(-3686930);
            boolean O = iVar.O(nVar);
            Object y11 = iVar.y();
            if (O || y11 == c1.i.f8486a.a()) {
                y11 = new r(nVar);
                iVar.p(y11);
            }
            iVar.N();
            r rVar = (r) y11;
            iVar.N();
            return rVar;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ x mo160invoke(c1.i iVar, Integer num) {
            return a(iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.u implements h00.l<d2.u, Boolean> {

        /* renamed from: a */
        public static final h f40037a = new h();

        h() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean mo12invoke(d2.u it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.u implements h00.a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ boolean f40038a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(boolean z11) {
            super(0);
            this.f40038a = z11;
        }

        @Override // h00.a
        /* renamed from: invoke */
        public final Boolean mo11invoke() {
            return Boolean.valueOf(this.f40038a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$6", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements h00.q<o0, s1.f, zz.d<? super vz.b0>, Object> {

        /* renamed from: a */
        int f40039a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public j(zz.d<? super j> dVar) {
            super(3, dVar);
        }

        public final Object e(o0 o0Var, long j11, zz.d<? super vz.b0> dVar) {
            return new j(dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, s1.f fVar, zz.d<? super vz.b0> dVar) {
            return e(o0Var, fVar.t(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f40039a == 0) {
                vz.r.b(obj);
                return vz.b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$7", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements h00.q<o0, Float, zz.d<? super vz.b0>, Object> {

        /* renamed from: a */
        int f40040a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public k(zz.d<? super k> dVar) {
            super(3, dVar);
        }

        public final Object e(o0 o0Var, float f11, zz.d<? super vz.b0> dVar) {
            return new k(dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, Float f11, zz.d<? super vz.b0> dVar) {
            return e(o0Var, f11.floatValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f40040a == 0) {
                vz.r.b(obj);
                return vz.b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a */
        final /* synthetic */ h00.p<c1.i, Integer, x> f40041a;

        /* renamed from: b */
        final /* synthetic */ o0.m f40042b;

        /* renamed from: c */
        final /* synthetic */ h00.a<Boolean> f40043c;

        /* renamed from: d */
        final /* synthetic */ h00.l<d2.u, Boolean> f40044d;

        /* renamed from: e */
        final /* synthetic */ h00.q<o0, s1.f, zz.d<? super vz.b0>, Object> f40045e;

        /* renamed from: f */
        final /* synthetic */ h00.q<o0, Float, zz.d<? super vz.b0>, Object> f40046f;

        /* renamed from: g */
        final /* synthetic */ androidx.compose.foundation.gestures.a f40047g;

        /* renamed from: h */
        final /* synthetic */ boolean f40048h;

        /* renamed from: i */
        final /* synthetic */ boolean f40049i;

        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<c1.z, c1.y> {

            /* renamed from: a */
            final /* synthetic */ c1.o0<o0.b> f40050a;

            /* renamed from: b */
            final /* synthetic */ o0.m f40051b;

            /* renamed from: n0.m$l$a$a */
            /* loaded from: classes.dex */
            public static final class C0778a implements c1.y {

                /* renamed from: a */
                final /* synthetic */ c1.o0 f40052a;

                /* renamed from: b */
                final /* synthetic */ o0.m f40053b;

                public C0778a(c1.o0 o0Var, o0.m mVar) {
                    this.f40052a = o0Var;
                    this.f40053b = mVar;
                }

                @Override // c1.y
                public void dispose() {
                    o0.b bVar = (o0.b) this.f40052a.getValue();
                    if (bVar == null) {
                        return;
                    }
                    o0.m mVar = this.f40053b;
                    if (mVar != null) {
                        mVar.a(new o0.a(bVar));
                    }
                    this.f40052a.setValue(null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c1.o0<o0.b> o0Var, o0.m mVar) {
                super(1);
                this.f40050a = o0Var;
                this.f40051b = mVar;
            }

            @Override // h00.l
            public final c1.y mo12invoke(c1.z DisposableEffect) {
                kotlin.jvm.internal.s.g(DisposableEffect, "$this$DisposableEffect");
                return new C0778a(this.f40050a, this.f40051b);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2", f = "Draggable.kt", l = {237, 239, 241, 251, 253, 257}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a */
            Object f40054a;

            /* renamed from: b */
            Object f40055b;

            /* renamed from: c */
            int f40056c;

            /* renamed from: d */
            private /* synthetic */ Object f40057d;

            /* renamed from: e */
            final /* synthetic */ x20.e<n0.i> f40058e;

            /* renamed from: f */
            final /* synthetic */ x f40059f;

            /* renamed from: g */
            final /* synthetic */ v1<n0.k> f40060g;

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2", f = "Draggable.kt", l = {246}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<w, zz.d<? super vz.b0>, Object> {

                /* renamed from: a */
                Object f40061a;

                /* renamed from: b */
                int f40062b;

                /* renamed from: c */
                private /* synthetic */ Object f40063c;

                /* renamed from: d */
                final /* synthetic */ l0<n0.i> f40064d;

                /* renamed from: e */
                final /* synthetic */ x20.e<n0.i> f40065e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(l0<n0.i> l0Var, x20.e<n0.i> eVar, zz.d<? super a> dVar) {
                    super(2, dVar);
                    this.f40064d = l0Var;
                    this.f40065e = eVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                    a aVar = new a(this.f40064d, this.f40065e, dVar);
                    aVar.f40063c = obj;
                    return aVar;
                }

                @Override // h00.p
                /* renamed from: e */
                public final Object mo160invoke(w wVar, zz.d<? super vz.b0> dVar) {
                    return ((a) create(wVar, dVar)).invokeSuspend(vz.b0.f54756a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0034  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x005f -> B:51:0x0065). Please submit an issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                    /*
                        r8 = this;
                        java.lang.Object r0 = a00.b.d()
                        int r1 = r8.f40062b
                        r2 = 1
                        if (r1 == 0) goto L23
                        if (r1 != r2) goto L1b
                        java.lang.Object r1 = r8.f40061a
                        kotlin.jvm.internal.l0 r1 = (kotlin.jvm.internal.l0) r1
                        java.lang.Object r3 = r8.f40063c
                        n0.w r3 = (n0.w) r3
                        vz.r.b(r9)
                        r4 = r3
                        r3 = r1
                        r1 = r0
                        r0 = r8
                        goto L65
                    L1b:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L23:
                        vz.r.b(r9)
                        java.lang.Object r9 = r8.f40063c
                        n0.w r9 = (n0.w) r9
                        r3 = r9
                        r9 = r8
                    L2c:
                        kotlin.jvm.internal.l0<n0.i> r1 = r9.f40064d
                        T r1 = r1.f34916a
                        boolean r4 = r1 instanceof n0.i.d
                        if (r4 != 0) goto L6b
                        boolean r4 = r1 instanceof n0.i.a
                        if (r4 != 0) goto L6b
                        boolean r4 = r1 instanceof n0.i.b
                        if (r4 == 0) goto L3f
                        n0.i$b r1 = (n0.i.b) r1
                        goto L40
                    L3f:
                        r1 = 0
                    L40:
                        if (r1 != 0) goto L43
                        goto L4e
                    L43:
                        float r4 = r1.a()
                        long r5 = r1.b()
                        r3.b(r4, r5)
                    L4e:
                        kotlin.jvm.internal.l0<n0.i> r1 = r9.f40064d
                        x20.e<n0.i> r4 = r9.f40065e
                        r9.f40063c = r3
                        r9.f40061a = r1
                        r9.f40062b = r2
                        java.lang.Object r4 = r4.e(r9)
                        if (r4 != r0) goto L5f
                        return r0
                    L5f:
                        r7 = r0
                        r0 = r9
                        r9 = r4
                        r4 = r3
                        r3 = r1
                        r1 = r7
                    L65:
                        r3.f34916a = r9
                        r9 = r0
                        r0 = r1
                        r3 = r4
                        goto L2c
                    L6b:
                        vz.b0 r9 = vz.b0.f54756a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: n0.m.l.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(x20.e<n0.i> eVar, x xVar, v1<n0.k> v1Var, zz.d<? super b> dVar) {
                super(2, dVar);
                this.f40058e = eVar;
                this.f40059f = xVar;
                this.f40060g = v1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                b bVar = new b(this.f40058e, this.f40059f, this.f40060g, dVar);
                bVar.f40057d = obj;
                return bVar;
            }

            @Override // h00.p
            public final Object mo160invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
                return ((b) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:100:0x0096  */
            /* JADX WARN: Removed duplicated region for block: B:106:0x00c9 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:107:0x00ca  */
            /* JADX WARN: Removed duplicated region for block: B:110:0x00d8 A[Catch: CancellationException -> 0x0104, TryCatch #3 {CancellationException -> 0x0104, blocks: (B:108:0x00cc, B:110:0x00d8, B:115:0x00ee, B:117:0x00f2), top: B:136:0x00cc }] */
            /* JADX WARN: Removed duplicated region for block: B:115:0x00ee A[Catch: CancellationException -> 0x0104, TryCatch #3 {CancellationException -> 0x0104, blocks: (B:108:0x00cc, B:110:0x00d8, B:115:0x00ee, B:117:0x00f2), top: B:136:0x00cc }] */
            /* JADX WARN: Removed duplicated region for block: B:125:0x011b A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:126:0x011c  */
            /* JADX WARN: Removed duplicated region for block: B:127:0x0120  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:99:0x0093  */
            /* JADX WARN: Type inference failed for: r10v12, types: [T] */
            /* JADX WARN: Type inference failed for: r10v21 */
            /* JADX WARN: Type inference failed for: r10v29 */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1 */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v35 */
            /* JADX WARN: Type inference failed for: r1v43 */
            /* JADX WARN: Type inference failed for: r1v44 */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x00e9 -> B:91:0x0068). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x0100 -> B:91:0x0068). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x011c -> B:91:0x0068). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0093 -> B:91:0x0068). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    Method dump skipped, instructions count: 310
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: n0.m.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3", f = "Draggable.kt", l = {263}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<d2.c0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a */
            int f40066a;

            /* renamed from: b */
            private /* synthetic */ Object f40067b;

            /* renamed from: c */
            final /* synthetic */ boolean f40068c;

            /* renamed from: d */
            final /* synthetic */ v1<h00.l<d2.u, Boolean>> f40069d;

            /* renamed from: e */
            final /* synthetic */ v1<h00.a<Boolean>> f40070e;

            /* renamed from: f */
            final /* synthetic */ androidx.compose.foundation.gestures.a f40071f;

            /* renamed from: g */
            final /* synthetic */ x20.e<n0.i> f40072g;

            /* renamed from: h */
            final /* synthetic */ boolean f40073h;

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1", f = "Draggable.kt", l = {264}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

                /* renamed from: a */
                int f40074a;

                /* renamed from: b */
                private /* synthetic */ Object f40075b;

                /* renamed from: c */
                final /* synthetic */ d2.c0 f40076c;

                /* renamed from: d */
                final /* synthetic */ v1<h00.l<d2.u, Boolean>> f40077d;

                /* renamed from: e */
                final /* synthetic */ v1<h00.a<Boolean>> f40078e;

                /* renamed from: f */
                final /* synthetic */ androidx.compose.foundation.gestures.a f40079f;

                /* renamed from: g */
                final /* synthetic */ x20.e<n0.i> f40080g;

                /* renamed from: h */
                final /* synthetic */ boolean f40081h;

                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1", f = "Draggable.kt", l = {265}, m = "invokeSuspend")
                /* renamed from: n0.m$l$c$a$a */
                /* loaded from: classes.dex */
                public static final class C0779a extends kotlin.coroutines.jvm.internal.l implements h00.p<d2.c0, zz.d<? super vz.b0>, Object> {

                    /* renamed from: a */
                    int f40082a;

                    /* renamed from: b */
                    private /* synthetic */ Object f40083b;

                    /* renamed from: c */
                    final /* synthetic */ v1<h00.l<d2.u, Boolean>> f40084c;

                    /* renamed from: d */
                    final /* synthetic */ v1<h00.a<Boolean>> f40085d;

                    /* renamed from: e */
                    final /* synthetic */ androidx.compose.foundation.gestures.a f40086e;

                    /* renamed from: f */
                    final /* synthetic */ x20.e<n0.i> f40087f;

                    /* renamed from: g */
                    final /* synthetic */ boolean f40088g;

                    /* renamed from: h */
                    final /* synthetic */ o0 f40089h;

                    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1$1", f = "Draggable.kt", l = {267, 275}, m = "invokeSuspend")
                    /* renamed from: n0.m$l$c$a$a$a */
                    /* loaded from: classes.dex */
                    public static final class C0780a extends kotlin.coroutines.jvm.internal.k implements h00.p<d2.c, zz.d<? super vz.b0>, Object> {

                        /* renamed from: b */
                        Object f40090b;

                        /* renamed from: c */
                        Object f40091c;

                        /* renamed from: d */
                        Object f40092d;

                        /* renamed from: e */
                        boolean f40093e;

                        /* renamed from: f */
                        int f40094f;

                        /* renamed from: g */
                        int f40095g;

                        /* renamed from: h */
                        private /* synthetic */ Object f40096h;

                        /* renamed from: i */
                        final /* synthetic */ v1<h00.l<d2.u, Boolean>> f40097i;

                        /* renamed from: j */
                        final /* synthetic */ v1<h00.a<Boolean>> f40098j;

                        /* renamed from: k */
                        final /* synthetic */ androidx.compose.foundation.gestures.a f40099k;

                        /* renamed from: l */
                        final /* synthetic */ x20.e<n0.i> f40100l;

                        /* renamed from: m */
                        final /* synthetic */ boolean f40101m;

                        /* renamed from: n */
                        final /* synthetic */ o0 f40102n;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C0780a(v1<? extends h00.l<? super d2.u, Boolean>> v1Var, v1<? extends h00.a<Boolean>> v1Var2, androidx.compose.foundation.gestures.a aVar, x20.e<n0.i> eVar, boolean z11, o0 o0Var, zz.d<? super C0780a> dVar) {
                            super(2, dVar);
                            this.f40097i = v1Var;
                            this.f40098j = v1Var2;
                            this.f40099k = aVar;
                            this.f40100l = eVar;
                            this.f40101m = z11;
                            this.f40102n = o0Var;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                            C0780a c0780a = new C0780a(this.f40097i, this.f40098j, this.f40099k, this.f40100l, this.f40101m, this.f40102n, dVar);
                            c0780a.f40096h = obj;
                            return c0780a;
                        }

                        @Override // h00.p
                        /* renamed from: e */
                        public final Object mo160invoke(d2.c cVar, zz.d<? super vz.b0> dVar) {
                            return ((C0780a) create(cVar, dVar)).invokeSuspend(vz.b0.f54756a);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:114:0x00b6  */
                        /* JADX WARN: Removed duplicated region for block: B:119:0x00ca  */
                        /* JADX WARN: Removed duplicated region for block: B:134:0x00ee  */
                        /* JADX WARN: Removed duplicated region for block: B:137:0x00f6 A[Catch: all -> 0x00f7, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00f7, blocks: (B:132:0x00e8, B:137:0x00f6), top: B:150:0x00e8 }] */
                        /* JADX WARN: Removed duplicated region for block: B:140:0x00fa  */
                        /* JADX WARN: Removed duplicated region for block: B:145:0x010e  */
                        @Override // kotlin.coroutines.jvm.internal.a
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                            /*
                                Method dump skipped, instructions count: 276
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: n0.m.l.c.a.C0779a.C0780a.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0779a(v1<? extends h00.l<? super d2.u, Boolean>> v1Var, v1<? extends h00.a<Boolean>> v1Var2, androidx.compose.foundation.gestures.a aVar, x20.e<n0.i> eVar, boolean z11, o0 o0Var, zz.d<? super C0779a> dVar) {
                        super(2, dVar);
                        this.f40084c = v1Var;
                        this.f40085d = v1Var2;
                        this.f40086e = aVar;
                        this.f40087f = eVar;
                        this.f40088g = z11;
                        this.f40089h = o0Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                        C0779a c0779a = new C0779a(this.f40084c, this.f40085d, this.f40086e, this.f40087f, this.f40088g, this.f40089h, dVar);
                        c0779a.f40083b = obj;
                        return c0779a;
                    }

                    @Override // h00.p
                    public final Object mo160invoke(d2.c0 c0Var, zz.d<? super vz.b0> dVar) {
                        return ((C0779a) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object d11;
                        d11 = a00.d.d();
                        int i11 = this.f40082a;
                        if (i11 == 0) {
                            vz.r.b(obj);
                            C0780a c0780a = new C0780a(this.f40084c, this.f40085d, this.f40086e, this.f40087f, this.f40088g, this.f40089h, null);
                            this.f40082a = 1;
                            if (((d2.c0) this.f40083b).E(c0780a, this) == d11) {
                                return d11;
                            }
                        } else if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            vz.r.b(obj);
                        }
                        return vz.b0.f54756a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                a(d2.c0 c0Var, v1<? extends h00.l<? super d2.u, Boolean>> v1Var, v1<? extends h00.a<Boolean>> v1Var2, androidx.compose.foundation.gestures.a aVar, x20.e<n0.i> eVar, boolean z11, zz.d<? super a> dVar) {
                    super(2, dVar);
                    this.f40076c = c0Var;
                    this.f40077d = v1Var;
                    this.f40078e = v1Var2;
                    this.f40079f = aVar;
                    this.f40080g = eVar;
                    this.f40081h = z11;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                    a aVar = new a(this.f40076c, this.f40077d, this.f40078e, this.f40079f, this.f40080g, this.f40081h, dVar);
                    aVar.f40075b = obj;
                    return aVar;
                }

                @Override // h00.p
                public final Object mo160invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
                    return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d11;
                    d11 = a00.d.d();
                    int i11 = this.f40074a;
                    if (i11 == 0) {
                        vz.r.b(obj);
                        o0 o0Var = (o0) this.f40075b;
                        d2.c0 c0Var = this.f40076c;
                        C0779a c0779a = new C0779a(this.f40077d, this.f40078e, this.f40079f, this.f40080g, this.f40081h, o0Var, null);
                        this.f40074a = 1;
                        if (q.d(c0Var, c0779a, this) == d11) {
                            return d11;
                        }
                    } else if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        vz.r.b(obj);
                    }
                    return vz.b0.f54756a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(boolean z11, v1<? extends h00.l<? super d2.u, Boolean>> v1Var, v1<? extends h00.a<Boolean>> v1Var2, androidx.compose.foundation.gestures.a aVar, x20.e<n0.i> eVar, boolean z12, zz.d<? super c> dVar) {
                super(2, dVar);
                this.f40068c = z11;
                this.f40069d = v1Var;
                this.f40070e = v1Var2;
                this.f40071f = aVar;
                this.f40072g = eVar;
                this.f40073h = z12;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                c cVar = new c(this.f40068c, this.f40069d, this.f40070e, this.f40071f, this.f40072g, this.f40073h, dVar);
                cVar.f40067b = obj;
                return cVar;
            }

            @Override // h00.p
            public final Object mo160invoke(d2.c0 c0Var, zz.d<? super vz.b0> dVar) {
                return ((c) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f40066a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    d2.c0 c0Var = (d2.c0) this.f40067b;
                    if (!this.f40068c) {
                        return vz.b0.f54756a;
                    }
                    a aVar = new a(c0Var, this.f40069d, this.f40070e, this.f40071f, this.f40072g, this.f40073h, null);
                    this.f40066a = 1;
                    if (p0.e(aVar, this) == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    vz.r.b(obj);
                }
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(h00.p<? super c1.i, ? super Integer, ? extends x> pVar, o0.m mVar, h00.a<Boolean> aVar, h00.l<? super d2.u, Boolean> lVar, h00.q<? super o0, ? super s1.f, ? super zz.d<? super vz.b0>, ? extends Object> qVar, h00.q<? super o0, ? super Float, ? super zz.d<? super vz.b0>, ? extends Object> qVar2, androidx.compose.foundation.gestures.a aVar2, boolean z11, boolean z12) {
            super(3);
            this.f40041a = pVar;
            this.f40042b = mVar;
            this.f40043c = aVar;
            this.f40044d = lVar;
            this.f40045e = qVar;
            this.f40046f = qVar2;
            this.f40047g = aVar2;
            this.f40048h = z11;
            this.f40049i = z12;
        }

        public static final n0.k c(v1<n0.k> v1Var) {
            return v1Var.getValue();
        }

        public final o1.f b(o1.f composed, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(-1197726397);
            x mo160invoke = this.f40041a.mo160invoke(iVar, 0);
            iVar.x(-3687241);
            Object y11 = iVar.y();
            i.a aVar = c1.i.f8486a;
            if (y11 == aVar.a()) {
                y11 = s1.d(null, null, 2, null);
                iVar.p(y11);
            }
            iVar.N();
            c1.o0 o0Var = (c1.o0) y11;
            o0.m mVar = this.f40042b;
            c1.b0.a(mVar, new a(o0Var, mVar), iVar, 0);
            iVar.x(-3687241);
            Object y12 = iVar.y();
            if (y12 == aVar.a()) {
                y12 = x20.h.b(Integer.MAX_VALUE, null, null, 6, null);
                iVar.p(y12);
            }
            iVar.N();
            x20.e eVar = (x20.e) y12;
            v1 m11 = n1.m(this.f40043c, iVar, 0);
            v1 m12 = n1.m(this.f40044d, iVar, 0);
            c1.b0.d(mo160invoke, new b(eVar, mo160invoke, n1.m(new n0.k(this.f40045e, this.f40046f, o0Var, this.f40042b), iVar, 0), null), iVar, 0);
            o1.f d11 = d2.i0.d(o1.f.f42062f1, new Object[]{this.f40047g, Boolean.valueOf(this.f40048h), Boolean.valueOf(this.f40049i)}, new c(this.f40048h, m12, m11, this.f40047g, eVar, this.f40049i, null));
            iVar.N();
            return d11;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return b(fVar, iVar, num.intValue());
        }
    }

    public static final n a(h00.l<? super Float, vz.b0> onDelta) {
        kotlin.jvm.internal.s.g(onDelta, "onDelta");
        return new n0.f(onDelta);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(d2.c r9, c1.v1<? extends h00.l<? super d2.u, java.lang.Boolean>> r10, c1.v1<? extends h00.a<java.lang.Boolean>> r11, e2.f r12, androidx.compose.foundation.gestures.a r13, zz.d<? super vz.p<d2.u, java.lang.Float>> r14) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.m.f(d2.c, c1.v1, c1.v1, e2.f, androidx.compose.foundation.gestures.a, zz.d):java.lang.Object");
    }

    public static final Object g(d2.c cVar, vz.p<d2.u, Float> pVar, e2.f fVar, x20.x<? super n0.i> xVar, boolean z11, androidx.compose.foundation.gestures.a aVar, zz.d<? super Boolean> dVar) {
        float floatValue = pVar.d().floatValue();
        d2.u c11 = pVar.c();
        long p11 = s1.f.p(c11.h(), s1.f.r(n(floatValue, aVar), Math.signum(l(c11.h(), aVar))));
        xVar.d(new i.c(p11, null));
        if (z11) {
            floatValue *= -1;
        }
        xVar.d(new i.b(floatValue, p11, null));
        c cVar2 = new c(fVar, aVar, xVar, z11);
        if (aVar == androidx.compose.foundation.gestures.a.Vertical) {
            return n0.j.n(cVar, c11.g(), cVar2, dVar);
        }
        return n0.j.k(cVar, c11.g(), cVar2, dVar);
    }

    public static final o1.f h(o1.f fVar, h00.p<? super c1.i, ? super Integer, ? extends x> stateFactory, h00.l<? super d2.u, Boolean> canDrag, androidx.compose.foundation.gestures.a orientation, boolean z11, o0.m mVar, h00.a<Boolean> startDragImmediately, h00.q<? super o0, ? super s1.f, ? super zz.d<? super vz.b0>, ? extends Object> onDragStarted, h00.q<? super o0, ? super Float, ? super zz.d<? super vz.b0>, ? extends Object> onDragStopped, boolean z12) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(stateFactory, "stateFactory");
        kotlin.jvm.internal.s.g(canDrag, "canDrag");
        kotlin.jvm.internal.s.g(orientation, "orientation");
        kotlin.jvm.internal.s.g(startDragImmediately, "startDragImmediately");
        kotlin.jvm.internal.s.g(onDragStarted, "onDragStarted");
        kotlin.jvm.internal.s.g(onDragStopped, "onDragStopped");
        return o1.e.a(fVar, x0.c() ? new d(canDrag, orientation, z11, z12, mVar, startDragImmediately, onDragStarted, onDragStopped, stateFactory) : x0.a(), new l(stateFactory, mVar, startDragImmediately, canDrag, onDragStarted, onDragStopped, orientation, z11, z12));
    }

    public static final o1.f i(o1.f fVar, n state, androidx.compose.foundation.gestures.a orientation, boolean z11, o0.m mVar, boolean z12, h00.q<? super o0, ? super s1.f, ? super zz.d<? super vz.b0>, ? extends Object> onDragStarted, h00.q<? super o0, ? super Float, ? super zz.d<? super vz.b0>, ? extends Object> onDragStopped, boolean z13) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(orientation, "orientation");
        kotlin.jvm.internal.s.g(onDragStarted, "onDragStarted");
        kotlin.jvm.internal.s.g(onDragStopped, "onDragStopped");
        return h(fVar, new g(state), h.f40037a, orientation, z11, mVar, new i(z12), onDragStarted, onDragStopped, z13);
    }

    public static /* synthetic */ o1.f k(o1.f fVar, n nVar, androidx.compose.foundation.gestures.a aVar, boolean z11, o0.m mVar, boolean z12, h00.q qVar, h00.q qVar2, boolean z13, int i11, Object obj) {
        return i(fVar, nVar, aVar, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? null : mVar, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? new e(null) : qVar, (i11 & 64) != 0 ? new f(null) : qVar2, (i11 & 128) != 0 ? false : z13);
    }

    public static final float l(long j11, androidx.compose.foundation.gestures.a aVar) {
        return aVar == androidx.compose.foundation.gestures.a.Vertical ? s1.f.m(j11) : s1.f.l(j11);
    }

    public static final float m(long j11, androidx.compose.foundation.gestures.a aVar) {
        return aVar == androidx.compose.foundation.gestures.a.Vertical ? x2.u.i(j11) : x2.u.h(j11);
    }

    private static final long n(float f11, androidx.compose.foundation.gestures.a aVar) {
        return aVar == androidx.compose.foundation.gestures.a.Vertical ? s1.g.a(BitmapDescriptorFactory.HUE_RED, f11) : s1.g.a(f11, BitmapDescriptorFactory.HUE_RED);
    }
}