package nr;

import ch.qos.logback.core.CoreConstants;
import v20.n0;
import v20.o0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final /* synthetic */ class z {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.squareup.workflow1.Workflows__WorkerWorkflowKt$runWorker$2", f = "WorkerWorkflow.kt", l = {78}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f41856a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n<OutputT> f41857b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h<q<? super n<? extends OutputT>, Integer, ? extends OutputT>> f41858c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f41859d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: Add missing generic type declarations: [OutputT] */
        /* renamed from: nr.z$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0817a<OutputT> extends kotlin.jvm.internal.u implements h00.l<OutputT, q<? super n<? extends OutputT>, Integer, ? extends OutputT>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ n<OutputT> f41860a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f41861b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0817a(n<? extends OutputT> nVar, String str) {
                super(1);
                this.f41860a = nVar;
                this.f41861b = str;
            }

            @Override // h00.l
            /* renamed from: a */
            public final q<n<? extends OutputT>, Integer, OutputT> invoke(OutputT outputt) {
                return new b(this.f41860a, this.f41861b, outputt);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(n<? extends OutputT> nVar, h<? super q<? super n<? extends OutputT>, Integer, ? extends OutputT>> hVar, String str, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f41857b = nVar;
            this.f41858c = hVar;
            this.f41859d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f41857b, this.f41858c, this.f41859d, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f41856a;
            if (i11 == 0) {
                vz.r.b(obj);
                kotlinx.coroutines.flow.e c11 = z.c(this.f41857b);
                h<q<? super n<? extends OutputT>, Integer, ? extends OutputT>> hVar = this.f41858c;
                C0817a c0817a = new C0817a(this.f41857b, this.f41859d);
                this.f41856a = 1;
                if (v.f(c11, hVar, c0817a, this) == d11) {
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

    private static final String b(n<?> nVar, String str) {
        boolean w11;
        String obj = nVar.toString();
        w11 = kotlin.text.v.w(str);
        if (w11) {
            return obj;
        }
        return obj + CoreConstants.COLON_CHAR + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> kotlinx.coroutines.flow.e<T> c(n<? extends T> nVar) {
        kotlinx.coroutines.flow.e eVar = (kotlinx.coroutines.flow.e<? extends T>) nVar.run();
        if (eVar != null) {
            return eVar;
        }
        throw new NullPointerException("Worker " + nVar + " returned a null Flow. If this is a test mock, make sure you mock the run() method!");
    }

    public static final <OutputT> Object d(n<? extends OutputT> nVar, String str, h<? super q<? super n<? extends OutputT>, Integer, ? extends OutputT>> hVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object g11 = v20.i.g(new n0(b(nVar, str)), new a(nVar, hVar, str, null), dVar);
        d11 = a00.d.d();
        return g11 == d11 ? g11 : vz.b0.f54756a;
    }
}