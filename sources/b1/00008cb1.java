package nr;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.j0;
import v20.o0;
import v20.p1;

/* loaded from: classes2.dex */
public final class f {

    @kotlin.coroutines.jvm.internal.f(c = "com.squareup.workflow1.RenderWorkflowKt$renderWorkflowIn$1", f = "RenderWorkflow.kt", l = {139, 144}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f41795a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f41796b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ or.m<PropsT, OutputT, RenderingT> f41797c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.u<g<RenderingT>> f41798d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h00.p<OutputT, zz.d<? super vz.b0>, Object> f41799e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(or.m<PropsT, OutputT, RenderingT> mVar, kotlinx.coroutines.flow.u<g<RenderingT>> uVar, h00.p<? super OutputT, ? super zz.d<? super vz.b0>, ? extends Object> pVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f41797c = mVar;
            this.f41798d = uVar;
            this.f41799e = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            a aVar = new a(this.f41797c, this.f41798d, this.f41799e, dVar);
            aVar.f41796b = obj;
            return aVar;
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0056 -> B:12:0x0030). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = a00.b.d()
                int r1 = r8.f41795a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L28
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r8.f41796b
                v20.o0 r1 = (v20.o0) r1
                vz.r.b(r9)
                r9 = r1
                goto L2f
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f41796b
                v20.o0 r1 = (v20.o0) r1
                vz.r.b(r9)
                r4 = r8
                goto L47
            L28:
                vz.r.b(r9)
                java.lang.Object r9 = r8.f41796b
                v20.o0 r9 = (v20.o0) r9
            L2f:
                r1 = r8
            L30:
                boolean r4 = v20.p0.f(r9)
                if (r4 == 0) goto L6a
                or.m<PropsT, OutputT, RenderingT> r4 = r1.f41797c
                r1.f41796b = r9
                r1.f41795a = r3
                java.lang.Object r4 = r4.f(r1)
                if (r4 != r0) goto L43
                return r0
            L43:
                r7 = r1
                r1 = r9
                r9 = r4
                r4 = r7
            L47:
                nr.u r9 = (nr.u) r9
                kotlinx.coroutines.flow.u<nr.g<RenderingT>> r5 = r4.f41798d
                or.m<PropsT, OutputT, RenderingT> r6 = r4.f41797c
                nr.g r6 = r6.g()
                r5.setValue(r6)
                if (r9 != 0) goto L59
            L56:
                r9 = r1
                r1 = r4
                goto L30
            L59:
                h00.p<OutputT, zz.d<? super vz.b0>, java.lang.Object> r5 = r4.f41799e
                java.lang.Object r9 = r9.a()
                r4.f41796b = r1
                r4.f41795a = r2
                java.lang.Object r9 = r5.invoke(r9, r4)
                if (r9 != r0) goto L56
                return r0
            L6a:
                vz.b0 r9 = vz.b0.f54756a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: nr.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <PropsT, OutputT, RenderingT> h0<g<RenderingT>> a(p<? super PropsT, ? extends OutputT, ? extends RenderingT> workflow, o0 scope, h0<? extends PropsT> props, m mVar, List<? extends s> interceptors, h00.p<? super OutputT, ? super zz.d<? super vz.b0>, ? extends Object> onOutput) {
        kotlin.jvm.internal.s.g(workflow, "workflow");
        kotlin.jvm.internal.s.g(scope, "scope");
        kotlin.jvm.internal.s.g(props, "props");
        kotlin.jvm.internal.s.g(interceptors, "interceptors");
        kotlin.jvm.internal.s.g(onOutput, "onOutput");
        or.m mVar2 = new or.m(scope, workflow, props, mVar, or.c.a(interceptors));
        try {
            kotlinx.coroutines.flow.u a11 = j0.a(mVar2.g());
            v20.k.d(scope, null, kotlinx.coroutines.a.ATOMIC, new a(mVar2, a11, onOutput, null), 1, null);
            return a11;
        } catch (Throwable th2) {
            CancellationException cancellationException = th2 instanceof CancellationException ? th2 : null;
            if (cancellationException == null) {
                cancellationException = p1.a("Workflow runtime failed", th2);
            }
            mVar2.e(cancellationException);
            throw th2;
        }
    }
}