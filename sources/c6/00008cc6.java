package nr;

import nr.k;
import v20.o0;

/* loaded from: classes2.dex */
public final class o<OutputT> extends k<n<? extends OutputT>, Integer, OutputT, vz.b0> implements c {

    /* renamed from: a  reason: collision with root package name */
    private final n00.p f41822a;

    /* renamed from: b  reason: collision with root package name */
    private final String f41823b;

    /* renamed from: c  reason: collision with root package name */
    private final r f41824c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.squareup.workflow1.WorkerWorkflow$render$1", f = "WorkerWorkflow.kt", l = {57}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f41825a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n<OutputT> f41826b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o<OutputT> f41827c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k<n<? extends OutputT>, Integer, OutputT, vz.b0>.a f41828d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(n<? extends OutputT> nVar, o<OutputT> oVar, k<? super n<? extends OutputT>, Integer, ? extends OutputT, vz.b0>.a aVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f41826b = nVar;
            this.f41827c = oVar;
            this.f41828d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f41826b, this.f41827c, this.f41828d, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f41825a;
            if (i11 == 0) {
                vz.r.b(obj);
                n<OutputT> nVar = this.f41826b;
                String str = ((o) this.f41827c).f41823b;
                h<q<? super n<? extends OutputT>, Integer, ? extends OutputT>> b11 = this.f41828d.b();
                this.f41825a = 1;
                if (v.h(nVar, str, b11, this) == d11) {
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

    public o(n00.p workerType, String key) {
        kotlin.jvm.internal.s.g(workerType, "workerType");
        kotlin.jvm.internal.s.g(key, "key");
        this.f41822a = workerType;
        this.f41823b = key;
        this.f41824c = v.k(workerType);
    }

    @Override // nr.c
    public String a() {
        return kotlin.jvm.internal.s.p("worker ", this.f41822a);
    }

    @Override // nr.c
    public r c() {
        return this.f41824c;
    }

    @Override // nr.k
    public /* bridge */ /* synthetic */ Integer e(Object obj, Object obj2, Integer num) {
        return j((n) obj, (n) obj2, num.intValue());
    }

    @Override // nr.k
    public /* bridge */ /* synthetic */ vz.b0 f(Object obj, Integer num, k.a aVar) {
        k((n) obj, num.intValue(), aVar);
        return vz.b0.f54756a;
    }

    @Override // nr.k
    public /* bridge */ /* synthetic */ i g(Integer num) {
        return l(num.intValue());
    }

    @Override // nr.k
    /* renamed from: i */
    public Integer d(n<? extends OutputT> props, i iVar) {
        kotlin.jvm.internal.s.g(props, "props");
        return 0;
    }

    public Integer j(n<? extends OutputT> old, n<? extends OutputT> nVar, int i11) {
        kotlin.jvm.internal.s.g(old, "old");
        kotlin.jvm.internal.s.g(nVar, "new");
        if (!old.a(nVar)) {
            i11++;
        }
        return Integer.valueOf(i11);
    }

    public void k(n<? extends OutputT> renderProps, int i11, k<? super n<? extends OutputT>, Integer, ? extends OutputT, vz.b0>.a context) {
        kotlin.jvm.internal.s.g(renderProps, "renderProps");
        kotlin.jvm.internal.s.g(context, "context");
        context.a(String.valueOf(i11), new a(renderProps, this, context, null));
    }

    public i l(int i11) {
        return null;
    }
}