package pr;

import androidx.lifecycle.l0;
import java.util.List;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.h0;
import v20.o0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: pr.a$a */
    /* loaded from: classes2.dex */
    public static final class C0999a<RenderingT> implements kotlinx.coroutines.flow.e<RenderingT> {

        /* renamed from: a */
        final /* synthetic */ kotlinx.coroutines.flow.e f46831a;

        /* renamed from: pr.a$a$a */
        /* loaded from: classes2.dex */
        public static final class C1000a implements kotlinx.coroutines.flow.f<nr.g<? extends RenderingT>> {

            /* renamed from: a */
            final /* synthetic */ kotlinx.coroutines.flow.f f46832a;

            @kotlin.coroutines.jvm.internal.f(c = "com.squareup.workflow1.ui.AndroidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2", f = "AndroidRenderWorkflow.kt", l = {137}, m = "emit")
            /* renamed from: pr.a$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C1001a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a */
                /* synthetic */ Object f46833a;

                /* renamed from: b */
                int f46834b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1001a(zz.d dVar) {
                    super(dVar);
                    C1000a.this = r1;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f46833a = obj;
                    this.f46834b |= Integer.MIN_VALUE;
                    return C1000a.this.emit(null, this);
                }
            }

            public C1000a(kotlinx.coroutines.flow.f fVar) {
                this.f46832a = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
            @Override // kotlinx.coroutines.flow.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object emit(java.lang.Object r5, zz.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof pr.a.C0999a.C1000a.C1001a
                    if (r0 == 0) goto L13
                    r0 = r6
                    pr.a$a$a$a r0 = (pr.a.C0999a.C1000a.C1001a) r0
                    int r1 = r0.f46834b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f46834b = r1
                    goto L18
                L13:
                    pr.a$a$a$a r0 = new pr.a$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f46833a
                    java.lang.Object r1 = a00.b.d()
                    int r2 = r0.f46834b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    vz.r.b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    vz.r.b(r6)
                    kotlinx.coroutines.flow.f r6 = r4.f46832a
                    nr.g r5 = (nr.g) r5
                    java.lang.Object r5 = r5.a()
                    r0.f46834b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    vz.b0 r5 = vz.b0.f54756a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: pr.a.C0999a.C1000a.emit(java.lang.Object, zz.d):java.lang.Object");
            }
        }

        public C0999a(kotlinx.coroutines.flow.e eVar) {
            this.f46831a = eVar;
        }

        @Override // kotlinx.coroutines.flow.e
        public Object collect(kotlinx.coroutines.flow.f fVar, zz.d dVar) {
            Object d11;
            Object collect = this.f46831a.collect(new C1000a(fVar), dVar);
            d11 = a00.d.d();
            return collect == d11 ? collect : vz.b0.f54756a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.squareup.workflow1.ui.AndroidRenderWorkflowKt$renderWorkflowIn$3", f = "AndroidRenderWorkflow.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b<OutputT> extends kotlin.coroutines.jvm.internal.l implements h00.p<OutputT, zz.d<? super vz.b0>, Object> {

        /* renamed from: a */
        int f46836a;

        b(zz.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new b(dVar);
        }

        @Override // h00.p
        /* renamed from: e */
        public final Object invoke(OutputT outputt, zz.d<? super vz.b0> dVar) {
            return ((b) create(outputt, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f46836a == 0) {
                vz.r.b(obj);
                return vz.b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.squareup.workflow1.ui.AndroidRenderWorkflowKt$renderWorkflowIn$4", f = "AndroidRenderWorkflow.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c<RenderingT> extends kotlin.coroutines.jvm.internal.l implements h00.p<nr.g<? extends RenderingT>, zz.d<? super vz.b0>, Object> {

        /* renamed from: a */
        int f46837a;

        /* renamed from: b */
        /* synthetic */ Object f46838b;

        /* renamed from: c */
        final /* synthetic */ l0 f46839c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(l0 l0Var, zz.d<? super c> dVar) {
            super(2, dVar);
            this.f46839c = l0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            c cVar = new c(this.f46839c, dVar);
            cVar.f46838b = obj;
            return cVar;
        }

        @Override // h00.p
        /* renamed from: e */
        public final Object invoke(nr.g<? extends RenderingT> gVar, zz.d<? super vz.b0> dVar) {
            return ((c) create(gVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f46837a == 0) {
                vz.r.b(obj);
                nr.g gVar = (nr.g) this.f46838b;
                l0 l0Var = this.f46839c;
                if (l0Var != null) {
                    l0Var.h("com.squareup.workflow1.ui.renderWorkflowIn-snapshot", new n(gVar.b()));
                }
                return vz.b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final <PropsT, OutputT, RenderingT> h0<RenderingT> a(nr.p<? super PropsT, ? extends OutputT, ? extends RenderingT> workflow, o0 scope, h0<? extends PropsT> props, l0 l0Var, List<? extends nr.s> interceptors, h00.p<? super OutputT, ? super zz.d<? super vz.b0>, ? extends Object> onOutput) {
        n nVar;
        kotlin.jvm.internal.s.g(workflow, "workflow");
        kotlin.jvm.internal.s.g(scope, "scope");
        kotlin.jvm.internal.s.g(props, "props");
        kotlin.jvm.internal.s.g(interceptors, "interceptors");
        kotlin.jvm.internal.s.g(onOutput, "onOutput");
        h0 a11 = nr.f.a(workflow, scope, props, (l0Var == null || (nVar = (n) l0Var.c("com.squareup.workflow1.ui.renderWorkflowIn-snapshot")) == null) ? null : nVar.a(), interceptors, onOutput);
        return kotlinx.coroutines.flow.g.E(new C0999a(kotlinx.coroutines.flow.g.B(a11, new c(l0Var, null))), scope, e0.f35254a.a(), ((nr.g) a11.getValue()).a());
    }

    public static /* synthetic */ h0 b(nr.p pVar, o0 o0Var, h0 h0Var, l0 l0Var, List list, h00.p pVar2, int i11, Object obj) {
        l0 l0Var2 = (i11 & 8) != 0 ? null : l0Var;
        if ((i11 & 16) != 0) {
            list = wz.w.i();
        }
        List list2 = list;
        if ((i11 & 32) != 0) {
            pVar2 = new b(null);
        }
        return a(pVar, o0Var, h0Var, l0Var2, list2, pVar2);
    }
}