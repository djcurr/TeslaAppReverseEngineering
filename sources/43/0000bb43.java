package w0;

import c1.i;
import c1.n1;
import c1.s1;
import c1.v1;
import o1.f;

/* loaded from: classes.dex */
public final class o0 {

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<s1.f, vz.b0> f55144a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o0.m f55145b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: w0.o0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1252a extends kotlin.jvm.internal.u implements h00.l<c1.z, c1.y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c1.o0<o0.p> f55146a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ o0.m f55147b;

            /* renamed from: w0.o0$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1253a implements c1.y {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c1.o0 f55148a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ o0.m f55149b;

                public C1253a(c1.o0 o0Var, o0.m mVar) {
                    this.f55148a = o0Var;
                    this.f55149b = mVar;
                }

                @Override // c1.y
                public void dispose() {
                    o0.p pVar = (o0.p) this.f55148a.getValue();
                    if (pVar == null) {
                        return;
                    }
                    o0.o oVar = new o0.o(pVar);
                    o0.m mVar = this.f55149b;
                    if (mVar != null) {
                        mVar.a(oVar);
                    }
                    this.f55148a.setValue(null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1252a(c1.o0<o0.p> o0Var, o0.m mVar) {
                super(1);
                this.f55146a = o0Var;
                this.f55147b = mVar;
            }

            @Override // h00.l
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final c1.y mo12invoke(c1.z DisposableEffect) {
                kotlin.jvm.internal.s.g(DisposableEffect, "$this$DisposableEffect");
                return new C1253a(this.f55146a, this.f55147b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", f = "TextFieldPressGestureFilter.kt", l = {55}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<d2.c0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f55150a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f55151b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ v20.o0 f55152c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ c1.o0<o0.p> f55153d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ o0.m f55154e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ v1<h00.l<s1.f, vz.b0>> f55155f;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", l = {68}, m = "invokeSuspend")
            /* renamed from: w0.o0$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1254a extends kotlin.coroutines.jvm.internal.l implements h00.q<n0.y, s1.f, zz.d<? super vz.b0>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f55156a;

                /* renamed from: b  reason: collision with root package name */
                private /* synthetic */ Object f55157b;

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ long f55158c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ v20.o0 f55159d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ c1.o0<o0.p> f55160e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ o0.m f55161f;

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {61, 65}, m = "invokeSuspend")
                /* renamed from: w0.o0$a$b$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C1255a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

                    /* renamed from: a  reason: collision with root package name */
                    Object f55162a;

                    /* renamed from: b  reason: collision with root package name */
                    int f55163b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ c1.o0<o0.p> f55164c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ long f55165d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ o0.m f55166e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1255a(c1.o0<o0.p> o0Var, long j11, o0.m mVar, zz.d<? super C1255a> dVar) {
                        super(2, dVar);
                        this.f55164c = o0Var;
                        this.f55165d = j11;
                        this.f55166e = mVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                        return new C1255a(this.f55164c, this.f55165d, this.f55166e, dVar);
                    }

                    @Override // h00.p
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                        return ((C1255a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
                    @Override // kotlin.coroutines.jvm.internal.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                        /*
                            r7 = this;
                            java.lang.Object r0 = a00.b.d()
                            int r1 = r7.f55163b
                            r2 = 0
                            r3 = 2
                            r4 = 1
                            if (r1 == 0) goto L27
                            if (r1 == r4) goto L1f
                            if (r1 != r3) goto L17
                            java.lang.Object r0 = r7.f55162a
                            o0.p r0 = (o0.p) r0
                            vz.r.b(r8)
                            goto L69
                        L17:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r0)
                            throw r8
                        L1f:
                            java.lang.Object r1 = r7.f55162a
                            c1.o0 r1 = (c1.o0) r1
                            vz.r.b(r8)
                            goto L4d
                        L27:
                            vz.r.b(r8)
                            c1.o0<o0.p> r8 = r7.f55164c
                            java.lang.Object r8 = r8.getValue()
                            o0.p r8 = (o0.p) r8
                            if (r8 != 0) goto L35
                            goto L51
                        L35:
                            o0.m r1 = r7.f55166e
                            c1.o0<o0.p> r5 = r7.f55164c
                            o0.o r6 = new o0.o
                            r6.<init>(r8)
                            if (r1 != 0) goto L41
                            goto L4e
                        L41:
                            r7.f55162a = r5
                            r7.f55163b = r4
                            java.lang.Object r8 = r1.c(r6, r7)
                            if (r8 != r0) goto L4c
                            return r0
                        L4c:
                            r1 = r5
                        L4d:
                            r5 = r1
                        L4e:
                            r5.setValue(r2)
                        L51:
                            o0.p r8 = new o0.p
                            long r4 = r7.f55165d
                            r8.<init>(r4, r2)
                            o0.m r1 = r7.f55166e
                            if (r1 != 0) goto L5d
                            goto L6a
                        L5d:
                            r7.f55162a = r8
                            r7.f55163b = r3
                            java.lang.Object r1 = r1.c(r8, r7)
                            if (r1 != r0) goto L68
                            return r0
                        L68:
                            r0 = r8
                        L69:
                            r8 = r0
                        L6a:
                            c1.o0<o0.p> r0 = r7.f55164c
                            r0.setValue(r8)
                            vz.b0 r8 = vz.b0.f54756a
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: w0.o0.a.b.C1254a.C1255a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2", f = "TextFieldPressGestureFilter.kt", l = {77}, m = "invokeSuspend")
                /* renamed from: w0.o0$a$b$a$b  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C1256b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

                    /* renamed from: a  reason: collision with root package name */
                    Object f55167a;

                    /* renamed from: b  reason: collision with root package name */
                    int f55168b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ c1.o0<o0.p> f55169c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ boolean f55170d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ o0.m f55171e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1256b(c1.o0<o0.p> o0Var, boolean z11, o0.m mVar, zz.d<? super C1256b> dVar) {
                        super(2, dVar);
                        this.f55169c = o0Var;
                        this.f55170d = z11;
                        this.f55171e = mVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                        return new C1256b(this.f55169c, this.f55170d, this.f55171e, dVar);
                    }

                    @Override // h00.p
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                        return ((C1256b) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object d11;
                        c1.o0<o0.p> o0Var;
                        o0.j oVar;
                        c1.o0<o0.p> o0Var2;
                        d11 = a00.d.d();
                        int i11 = this.f55168b;
                        if (i11 == 0) {
                            vz.r.b(obj);
                            o0.p value = this.f55169c.getValue();
                            if (value != null) {
                                boolean z11 = this.f55170d;
                                o0.m mVar = this.f55171e;
                                o0Var = this.f55169c;
                                if (z11) {
                                    oVar = new o0.q(value);
                                } else {
                                    oVar = new o0.o(value);
                                }
                                if (mVar != null) {
                                    this.f55167a = o0Var;
                                    this.f55168b = 1;
                                    if (mVar.c(oVar, this) == d11) {
                                        return d11;
                                    }
                                    o0Var2 = o0Var;
                                }
                                o0Var.setValue(null);
                            }
                            return vz.b0.f54756a;
                        } else if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            o0Var2 = (c1.o0) this.f55167a;
                            vz.r.b(obj);
                        }
                        o0Var = o0Var2;
                        o0Var.setValue(null);
                        return vz.b0.f54756a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1254a(v20.o0 o0Var, c1.o0<o0.p> o0Var2, o0.m mVar, zz.d<? super C1254a> dVar) {
                    super(3, dVar);
                    this.f55159d = o0Var;
                    this.f55160e = o0Var2;
                    this.f55161f = mVar;
                }

                public final Object e(n0.y yVar, long j11, zz.d<? super vz.b0> dVar) {
                    C1254a c1254a = new C1254a(this.f55159d, this.f55160e, this.f55161f, dVar);
                    c1254a.f55157b = yVar;
                    c1254a.f55158c = j11;
                    return c1254a.invokeSuspend(vz.b0.f54756a);
                }

                @Override // h00.q
                public /* bridge */ /* synthetic */ Object invoke(n0.y yVar, s1.f fVar, zz.d<? super vz.b0> dVar) {
                    return e(yVar, fVar.t(), dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d11;
                    d11 = a00.d.d();
                    int i11 = this.f55156a;
                    if (i11 == 0) {
                        vz.r.b(obj);
                        v20.k.d(this.f55159d, null, null, new C1255a(this.f55160e, this.f55158c, this.f55161f, null), 3, null);
                        this.f55156a = 1;
                        obj = ((n0.y) this.f55157b).k0(this);
                        if (obj == d11) {
                            return d11;
                        }
                    } else if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        vz.r.b(obj);
                    }
                    v20.k.d(this.f55159d, null, null, new C1256b(this.f55160e, ((Boolean) obj).booleanValue(), this.f55161f, null), 3, null);
                    return vz.b0.f54756a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: w0.o0$a$b$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1257b extends kotlin.jvm.internal.u implements h00.l<s1.f, vz.b0> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ v1<h00.l<s1.f, vz.b0>> f55172a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1257b(v1<? extends h00.l<? super s1.f, vz.b0>> v1Var) {
                    super(1);
                    this.f55172a = v1Var;
                }

                @Override // h00.l
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ vz.b0 mo12invoke(s1.f fVar) {
                    m1119invokek4lQ0M(fVar.t());
                    return vz.b0.f54756a;
                }

                /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
                public final void m1119invokek4lQ0M(long j11) {
                    this.f55172a.getValue().mo12invoke(s1.f.d(j11));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(v20.o0 o0Var, c1.o0<o0.p> o0Var2, o0.m mVar, v1<? extends h00.l<? super s1.f, vz.b0>> v1Var, zz.d<? super b> dVar) {
                super(2, dVar);
                this.f55152c = o0Var;
                this.f55153d = o0Var2;
                this.f55154e = mVar;
                this.f55155f = v1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                b bVar = new b(this.f55152c, this.f55153d, this.f55154e, this.f55155f, dVar);
                bVar.f55151b = obj;
                return bVar;
            }

            @Override // h00.p
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object mo160invoke(d2.c0 c0Var, zz.d<? super vz.b0> dVar) {
                return ((b) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f55150a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    C1254a c1254a = new C1254a(this.f55152c, this.f55153d, this.f55154e, null);
                    C1257b c1257b = new C1257b(this.f55155f);
                    this.f55150a = 1;
                    if (n0.i0.i((d2.c0) this.f55151b, c1254a, c1257b, this) == d11) {
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
        a(h00.l<? super s1.f, vz.b0> lVar, o0.m mVar) {
            super(3);
            this.f55144a = lVar;
            this.f55145b = mVar;
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(-219206304);
            iVar.x(-723524056);
            iVar.x(-3687241);
            Object y11 = iVar.y();
            i.a aVar = c1.i.f8486a;
            if (y11 == aVar.a()) {
                c1.s sVar = new c1.s(c1.b0.j(zz.h.f61280a, iVar));
                iVar.p(sVar);
                y11 = sVar;
            }
            iVar.N();
            v20.o0 a11 = ((c1.s) y11).a();
            iVar.N();
            iVar.x(-3687241);
            Object y12 = iVar.y();
            if (y12 == aVar.a()) {
                y12 = s1.d(null, null, 2, null);
                iVar.p(y12);
            }
            iVar.N();
            c1.o0 o0Var = (c1.o0) y12;
            v1 m11 = n1.m(this.f55144a, iVar, 0);
            o0.m mVar = this.f55145b;
            c1.b0.a(mVar, new C1252a(o0Var, mVar), iVar, 0);
            f.a aVar2 = o1.f.f42062f1;
            o0.m mVar2 = this.f55145b;
            o1.f b11 = d2.i0.b(aVar2, mVar2, new b(a11, o0Var, mVar2, m11, null));
            iVar.N();
            return b11;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final o1.f a(o1.f fVar, o0.m mVar, boolean z11, h00.l<? super s1.f, vz.b0> onTap) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(onTap, "onTap");
        return z11 ? o1.e.b(fVar, null, new a(onTap, mVar), 1, null) : fVar;
    }
}