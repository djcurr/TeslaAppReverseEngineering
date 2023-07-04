package m0;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import c1.o0;
import c1.s1;
import d2.c;
import d2.i0;
import o1.f;

/* loaded from: classes.dex */
public final class n {

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o0.m f38034a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f38035b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o0.m mVar, boolean z11) {
            super(1);
            this.f38034a = mVar;
            this.f38035b = z11;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("hoverable");
            y0Var.a().b("interactionSource", this.f38034a);
            y0Var.a().b("enabled", Boolean.valueOf(this.f38035b));
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o0.m f38036a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f38037b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<c1.z, c1.y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o0<o0.g> f38038a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ o0.m f38039b;

            /* renamed from: m0.n$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0726a implements c1.y {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ o0 f38040a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ o0.m f38041b;

                public C0726a(o0 o0Var, o0.m mVar) {
                    this.f38040a = o0Var;
                    this.f38041b = mVar;
                }

                @Override // c1.y
                public void dispose() {
                    b.i(this.f38040a, this.f38041b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o0<o0.g> o0Var, o0.m mVar) {
                super(1);
                this.f38038a = o0Var;
                this.f38039b = mVar;
            }

            @Override // h00.l
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final c1.y mo12invoke(c1.z DisposableEffect) {
                kotlin.jvm.internal.s.g(DisposableEffect, "$this$DisposableEffect");
                return new C0726a(this.f38038a, this.f38039b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.HoverableKt$hoverable$2$2", f = "Hoverable.kt", l = {85}, m = "invokeSuspend")
        /* renamed from: m0.n$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0727b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f38042a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f38043b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ o0<o0.g> f38044c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ o0.m f38045d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0727b(boolean z11, o0<o0.g> o0Var, o0.m mVar, zz.d<? super C0727b> dVar) {
                super(2, dVar);
                this.f38043b = z11;
                this.f38044c = o0Var;
                this.f38045d = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                return new C0727b(this.f38043b, this.f38044c, this.f38045d, dVar);
            }

            @Override // h00.p
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                return ((C0727b) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f38042a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    if (!this.f38043b) {
                        o0<o0.g> o0Var = this.f38044c;
                        o0.m mVar = this.f38045d;
                        this.f38042a = 1;
                        if (b.f(o0Var, mVar, this) == d11) {
                            return d11;
                        }
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    vz.r.b(obj);
                }
                return vz.b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3", f = "Hoverable.kt", l = {100, 102, 103}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<d2.c0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            Object f38046a;

            /* renamed from: b  reason: collision with root package name */
            int f38047b;

            /* renamed from: c  reason: collision with root package name */
            private /* synthetic */ Object f38048c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ o0.m f38049d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ o0<o0.g> f38050e;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$event$1", f = "Hoverable.kt", l = {100}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class a extends kotlin.coroutines.jvm.internal.k implements h00.p<d2.c, zz.d<? super d2.m>, Object> {

                /* renamed from: b  reason: collision with root package name */
                int f38051b;

                /* renamed from: c  reason: collision with root package name */
                private /* synthetic */ Object f38052c;

                a(zz.d<? super a> dVar) {
                    super(2, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                    a aVar = new a(dVar);
                    aVar.f38052c = obj;
                    return aVar;
                }

                @Override // h00.p
                /* renamed from: e */
                public final Object mo160invoke(d2.c cVar, zz.d<? super d2.m> dVar) {
                    return ((a) create(cVar, dVar)).invokeSuspend(vz.b0.f54756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d11;
                    d11 = a00.d.d();
                    int i11 = this.f38051b;
                    if (i11 == 0) {
                        vz.r.b(obj);
                        this.f38051b = 1;
                        obj = c.a.a((d2.c) this.f38052c, null, this, 1, null);
                        if (obj == d11) {
                            return d11;
                        }
                    } else if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        vz.r.b(obj);
                    }
                    return obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(o0.m mVar, o0<o0.g> o0Var, zz.d<? super c> dVar) {
                super(2, dVar);
                this.f38049d = mVar;
                this.f38050e = o0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                c cVar = new c(this.f38049d, this.f38050e, dVar);
                cVar.f38048c = obj;
                return cVar;
            }

            @Override // h00.p
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object mo160invoke(d2.c0 c0Var, zz.d<? super vz.b0> dVar) {
                return ((c) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009b -> B:14:0x0040). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = a00.b.d()
                    int r1 = r10.f38047b
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L34
                    if (r1 == r4) goto L27
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    goto L1a
                L12:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1a:
                    java.lang.Object r1 = r10.f38046a
                    zz.g r1 = (zz.g) r1
                    java.lang.Object r5 = r10.f38048c
                    d2.c0 r5 = (d2.c0) r5
                    vz.r.b(r11)
                    r11 = r5
                    goto L3f
                L27:
                    java.lang.Object r1 = r10.f38046a
                    zz.g r1 = (zz.g) r1
                    java.lang.Object r5 = r10.f38048c
                    d2.c0 r5 = (d2.c0) r5
                    vz.r.b(r11)
                    r6 = r10
                    goto L5d
                L34:
                    vz.r.b(r11)
                    java.lang.Object r11 = r10.f38048c
                    d2.c0 r11 = (d2.c0) r11
                    zz.g r1 = r10.getContext()
                L3f:
                    r5 = r10
                L40:
                    boolean r6 = v20.d2.o(r1)
                    if (r6 == 0) goto L9e
                    m0.n$b$c$a r6 = new m0.n$b$c$a
                    r7 = 0
                    r6.<init>(r7)
                    r5.f38048c = r11
                    r5.f38046a = r1
                    r5.f38047b = r4
                    java.lang.Object r6 = r11.E(r6, r5)
                    if (r6 != r0) goto L59
                    return r0
                L59:
                    r9 = r5
                    r5 = r11
                    r11 = r6
                    r6 = r9
                L5d:
                    d2.m r11 = (d2.m) r11
                    int r11 = r11.d()
                    d2.o$a r7 = d2.o.f23387a
                    int r8 = r7.a()
                    boolean r8 = d2.o.i(r11, r8)
                    if (r8 == 0) goto L80
                    o0.m r11 = r6.f38049d
                    c1.o0<o0.g> r7 = r6.f38050e
                    r6.f38048c = r5
                    r6.f38046a = r1
                    r6.f38047b = r3
                    java.lang.Object r11 = m0.n.b.a(r11, r7, r6)
                    if (r11 != r0) goto L9b
                    return r0
                L80:
                    int r7 = r7.b()
                    boolean r11 = d2.o.i(r11, r7)
                    if (r11 == 0) goto L9b
                    c1.o0<o0.g> r11 = r6.f38050e
                    o0.m r7 = r6.f38049d
                    r6.f38048c = r5
                    r6.f38046a = r1
                    r6.f38047b = r2
                    java.lang.Object r11 = m0.n.b.b(r11, r7, r6)
                    if (r11 != r0) goto L9b
                    return r0
                L9b:
                    r11 = r5
                    r5 = r6
                    goto L40
                L9e:
                    vz.b0 r11 = vz.b0.f54756a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: m0.n.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.HoverableKt$hoverable$2", f = "Hoverable.kt", l = {59}, m = "invoke$emitEnter")
        /* loaded from: classes.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f38053a;

            /* renamed from: b  reason: collision with root package name */
            Object f38054b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f38055c;

            /* renamed from: d  reason: collision with root package name */
            int f38056d;

            d(zz.d<? super d> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f38055c = obj;
                this.f38056d |= Integer.MIN_VALUE;
                return b.e(null, null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.HoverableKt$hoverable$2", f = "Hoverable.kt", l = {67}, m = "invoke$emitExit")
        /* loaded from: classes.dex */
        public static final class e extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f38057a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f38058b;

            /* renamed from: c  reason: collision with root package name */
            int f38059c;

            e(zz.d<? super e> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f38058b = obj;
                this.f38059c |= Integer.MIN_VALUE;
                return b.f(null, null, this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o0.m mVar, boolean z11) {
            super(3);
            this.f38036a = mVar;
            this.f38037b = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final java.lang.Object e(o0.m r4, c1.o0<o0.g> r5, zz.d<? super vz.b0> r6) {
            /*
                boolean r0 = r6 instanceof m0.n.b.d
                if (r0 == 0) goto L13
                r0 = r6
                m0.n$b$d r0 = (m0.n.b.d) r0
                int r1 = r0.f38056d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f38056d = r1
                goto L18
            L13:
                m0.n$b$d r0 = new m0.n$b$d
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f38055c
                java.lang.Object r1 = a00.b.d()
                int r2 = r0.f38056d
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r4 = r0.f38054b
                o0.g r4 = (o0.g) r4
                java.lang.Object r5 = r0.f38053a
                c1.o0 r5 = (c1.o0) r5
                vz.r.b(r6)
                goto L55
            L31:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L39:
                vz.r.b(r6)
                o0.g r6 = g(r5)
                if (r6 != 0) goto L58
                o0.g r6 = new o0.g
                r6.<init>()
                r0.f38053a = r5
                r0.f38054b = r6
                r0.f38056d = r3
                java.lang.Object r4 = r4.c(r6, r0)
                if (r4 != r1) goto L54
                return r1
            L54:
                r4 = r6
            L55:
                h(r5, r4)
            L58:
                vz.b0 r4 = vz.b0.f54756a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.n.b.e(o0.m, c1.o0, zz.d):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final java.lang.Object f(c1.o0<o0.g> r4, o0.m r5, zz.d<? super vz.b0> r6) {
            /*
                boolean r0 = r6 instanceof m0.n.b.e
                if (r0 == 0) goto L13
                r0 = r6
                m0.n$b$e r0 = (m0.n.b.e) r0
                int r1 = r0.f38059c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f38059c = r1
                goto L18
            L13:
                m0.n$b$e r0 = new m0.n$b$e
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f38058b
                java.lang.Object r1 = a00.b.d()
                int r2 = r0.f38059c
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r4 = r0.f38057a
                c1.o0 r4 = (c1.o0) r4
                vz.r.b(r6)
                goto L4f
            L2d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L35:
                vz.r.b(r6)
                o0.g r6 = g(r4)
                if (r6 != 0) goto L3f
                goto L53
            L3f:
                o0.h r2 = new o0.h
                r2.<init>(r6)
                r0.f38057a = r4
                r0.f38059c = r3
                java.lang.Object r5 = r5.c(r2, r0)
                if (r5 != r1) goto L4f
                return r1
            L4f:
                r5 = 0
                h(r4, r5)
            L53:
                vz.b0 r4 = vz.b0.f54756a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.n.b.f(c1.o0, o0.m, zz.d):java.lang.Object");
        }

        private static final o0.g g(o0<o0.g> o0Var) {
            return o0Var.getValue();
        }

        private static final void h(o0<o0.g> o0Var, o0.g gVar) {
            o0Var.setValue(gVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(o0<o0.g> o0Var, o0.m mVar) {
            o0.g g11 = g(o0Var);
            if (g11 == null) {
                return;
            }
            mVar.a(new o0.h(g11));
            h(o0Var, null);
        }

        public final o1.f d(o1.f composed, c1.i iVar, int i11) {
            o1.f fVar;
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(-222579755);
            iVar.x(-3687241);
            Object y11 = iVar.y();
            if (y11 == c1.i.f8486a.a()) {
                y11 = s1.d(null, null, 2, null);
                iVar.p(y11);
            }
            iVar.N();
            o0 o0Var = (o0) y11;
            o0.m mVar = this.f38036a;
            c1.b0.a(mVar, new a(o0Var, mVar), iVar, 0);
            c1.b0.d(Boolean.valueOf(this.f38037b), new C0727b(this.f38037b, o0Var, this.f38036a, null), iVar, 0);
            if (this.f38037b) {
                f.a aVar = o1.f.f42062f1;
                o0.m mVar2 = this.f38036a;
                fVar = i0.b(aVar, mVar2, new c(mVar2, o0Var, null));
            } else {
                fVar = o1.f.f42062f1;
            }
            iVar.N();
            return fVar;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return d(fVar, iVar, num.intValue());
        }
    }

    public static final o1.f a(o1.f fVar, o0.m interactionSource, boolean z11) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(interactionSource, "interactionSource");
        return o1.e.a(fVar, x0.c() ? new a(interactionSource, z11) : x0.a(), new b(interactionSource, z11));
    }
}