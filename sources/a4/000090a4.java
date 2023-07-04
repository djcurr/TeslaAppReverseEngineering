package or;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.u;
import nr.q;
import nr.s;
import nr.t;
import nr.v;
import or.e;
import or.f;
import v20.a2;
import v20.d2;
import v20.n0;
import v20.o0;
import v20.p0;
import vz.b0;
import vz.r;

/* loaded from: classes2.dex */
public final class j<PropsT, StateT, OutputT, RenderingT> implements o0, f.b, s.c {

    /* renamed from: a  reason: collision with root package name */
    private final k f42975a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<OutputT, Object> f42976b;

    /* renamed from: c  reason: collision with root package name */
    private final s.c f42977c;

    /* renamed from: d  reason: collision with root package name */
    private final s f42978d;

    /* renamed from: e  reason: collision with root package name */
    private final zz.g f42979e;

    /* renamed from: f  reason: collision with root package name */
    private final long f42980f;

    /* renamed from: g  reason: collision with root package name */
    private final h<PropsT, StateT, OutputT> f42981g;

    /* renamed from: h  reason: collision with root package name */
    private final or.a<g> f42982h;

    /* renamed from: i  reason: collision with root package name */
    private PropsT f42983i;

    /* renamed from: j  reason: collision with root package name */
    private final x20.e<q<PropsT, StateT, OutputT>> f42984j;

    /* renamed from: k  reason: collision with root package name */
    private StateT f42985k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a extends u implements h00.l<OutputT, nr.u<? extends OutputT>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f42986a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final nr.u<OutputT> invoke(OutputT outputt) {
            return new nr.u<>(outputt);
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends u implements h00.a<Map<k, ? extends nr.m>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map<k, nr.m> f42987a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Map<k, nr.m> map) {
            super(0);
            this.f42987a = map;
        }

        @Override // h00.a
        public final Map<k, ? extends nr.m> invoke() {
            return this.f42987a;
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class c extends p implements h00.l<q<? super PropsT, StateT, ? extends OutputT>, Object> {
        c(j<PropsT, StateT, OutputT, RenderingT> jVar) {
            super(1, jVar, j.class, "applyAction", "applyAction(Lcom/squareup/workflow1/WorkflowAction;)Ljava/lang/Object;", 0);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // h00.l
        /* renamed from: d */
        public final T invoke(q<? super PropsT, StateT, ? extends OutputT> p02) {
            kotlin.jvm.internal.s.g(p02, "p0");
            return ((j) this.receiver).c(p02);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "com.squareup.workflow1.internal.WorkflowNode$tick$1$1", f = "WorkflowNode.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class d<T> extends kotlin.coroutines.jvm.internal.l implements h00.p<q<? super PropsT, StateT, ? extends OutputT>, zz.d<? super nr.u<? extends T>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f42988a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f42989b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j<PropsT, StateT, OutputT, RenderingT> f42990c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(j<PropsT, StateT, OutputT, RenderingT> jVar, zz.d<? super d> dVar) {
            super(2, dVar);
            this.f42990c = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            d dVar2 = new d(this.f42990c, dVar);
            dVar2.f42989b = obj;
            return dVar2;
        }

        @Override // h00.p
        /* renamed from: e */
        public final Object invoke(q<? super PropsT, StateT, ? extends OutputT> qVar, zz.d<? super nr.u<? extends T>> dVar) {
            return ((d) create(qVar, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f42988a == 0) {
                r.b(obj);
                return this.f42990c.c((q) this.f42989b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(k id2, nr.k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> workflow, PropsT propst, nr.m mVar, zz.g baseContext, h00.l<? super OutputT, ? extends Object> emitOutputToParent, s.c cVar, s interceptor, or.d dVar) {
        kotlin.jvm.internal.s.g(id2, "id");
        kotlin.jvm.internal.s.g(workflow, "workflow");
        kotlin.jvm.internal.s.g(baseContext, "baseContext");
        kotlin.jvm.internal.s.g(emitOutputToParent, "emitOutputToParent");
        kotlin.jvm.internal.s.g(interceptor, "interceptor");
        this.f42975a = id2;
        this.f42976b = emitOutputToParent;
        this.f42977c = cVar;
        this.f42978d = interceptor;
        this.f42979e = baseContext.plus(d2.a((a2) baseContext.get(a2.f53887l1))).plus(new n0(id2.toString()));
        this.f42980f = dVar == null ? 0L : dVar.a();
        this.f42981g = new h<>(mVar == null ? null : mVar.a(), J(), new c(this), this, interceptor, dVar);
        this.f42982h = new or.a<>();
        this.f42983i = propst;
        this.f42984j = x20.h.b(Integer.MAX_VALUE, null, null, 6, null);
        interceptor.a(this, this);
        this.f42985k = (StateT) t.a(interceptor, workflow, this).d(propst, mVar != null ? mVar.b() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T c(q<? super PropsT, StateT, ? extends OutputT> qVar) {
        vz.p e11 = v.e(qVar, this.f42983i, this.f42985k);
        nr.u uVar = (nr.u) e11.b();
        this.f42985k = (StateT) e11.a();
        if (uVar == null) {
            return null;
        }
        return (T) this.f42976b.invoke(uVar.a());
    }

    public static /* synthetic */ void e(j jVar, CancellationException cancellationException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationException = null;
        }
        jVar.d(cancellationException);
    }

    private final g f(String str, h00.p<? super o0, ? super zz.d<? super b0>, ? extends Object> pVar) {
        a2 d11;
        d11 = v20.k.d(p0.g(this, new n0("sideEffect[" + str + "] for " + this.f42975a)), null, kotlinx.coroutines.a.LAZY, pVar, 1, null);
        return new g(str, d11);
    }

    private final RenderingT m(nr.k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> kVar, PropsT propst) {
        e eVar;
        e eVar2;
        e eVar3;
        e eVar4;
        e eVar5;
        p(kVar, propst);
        f fVar = new f(this.f42981g, this, this.f42984j);
        RenderingT renderingt = (RenderingT) t.a(this.f42978d, kVar, this).f(propst, this.f42985k, v.a(fVar, kVar));
        fVar.f();
        this.f42981g.c();
        eVar = ((or.a) this.f42982h).f42924b;
        for (e.a b11 = eVar.b(); b11 != null; b11 = b11.a()) {
            ((g) b11).c().start();
        }
        or.a<g> aVar = this.f42982h;
        eVar2 = ((or.a) aVar).f42923a;
        for (e.a b12 = eVar2.b(); b12 != null; b12 = b12.a()) {
            a2.a.a(((g) b12).c(), null, 1, null);
        }
        eVar3 = ((or.a) aVar).f42923a;
        eVar4 = ((or.a) aVar).f42924b;
        ((or.a) aVar).f42923a = eVar4;
        ((or.a) aVar).f42924b = eVar3;
        eVar5 = ((or.a) aVar).f42924b;
        eVar5.a();
        return renderingt;
    }

    private final void p(nr.k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> kVar, PropsT propst) {
        if (!kotlin.jvm.internal.s.c(propst, this.f42983i)) {
            this.f42985k = (StateT) t.a(this.f42978d, kVar, this).e(this.f42983i, propst, this.f42985k);
        }
        this.f42983i = propst;
    }

    @Override // v20.o0
    public zz.g J() {
        return this.f42979e;
    }

    @Override // or.f.b
    public void a(String key, h00.p<? super o0, ? super zz.d<? super b0>, ? extends Object> sideEffect) {
        e eVar;
        e eVar2;
        e eVar3;
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(sideEffect, "sideEffect");
        eVar = ((or.a) this.f42982h).f42924b;
        for (e.a b11 = eVar.b(); b11 != null; b11 = b11.a()) {
            if (!(!kotlin.jvm.internal.s.c(key, ((g) b11).d()))) {
                throw new IllegalArgumentException(("Expected side effect keys to be unique: \"" + key + CoreConstants.DOUBLE_QUOTE_CHAR).toString());
            }
        }
        or.a<g> aVar = this.f42982h;
        eVar2 = ((or.a) aVar).f42923a;
        e.a b12 = eVar2.b();
        e.a aVar2 = null;
        e.a aVar3 = null;
        while (true) {
            if (b12 == null) {
                break;
            } else if (kotlin.jvm.internal.s.c(key, ((g) b12).d())) {
                if (aVar3 == null) {
                    eVar2.e(b12.a());
                } else {
                    aVar3.b(b12.a());
                }
                if (kotlin.jvm.internal.s.c(eVar2.c(), b12)) {
                    eVar2.f(aVar3);
                }
                b12.b(null);
                aVar2 = b12;
            } else {
                aVar3 = b12;
                b12 = b12.a();
            }
        }
        if (aVar2 == null) {
            aVar2 = f(key, sideEffect);
        }
        eVar3 = ((or.a) aVar).f42924b;
        eVar3.d(aVar2);
    }

    public final void d(CancellationException cancellationException) {
        d2.d(J(), cancellationException);
    }

    public final k g() {
        return this.f42975a;
    }

    public nr.r h() {
        return this.f42975a.a();
    }

    public s.c i() {
        return this.f42977c;
    }

    public String j() {
        return this.f42975a.b();
    }

    public long k() {
        return this.f42980f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RenderingT l(nr.k<? super PropsT, ?, ? extends OutputT, ? extends RenderingT> workflow, PropsT propst) {
        kotlin.jvm.internal.s.g(workflow, "workflow");
        return m(workflow, propst);
    }

    public final nr.m n(nr.k<?, ?, ?, ?> workflow) {
        kotlin.jvm.internal.s.g(workflow, "workflow");
        return new nr.m(t.a(this.f42978d, workflow, this).g(this.f42985k), new b(this.f42981g.f()));
    }

    public final <T> void o(kotlinx.coroutines.selects.a<? super nr.u<? extends T>> selector) {
        kotlin.jvm.internal.s.g(selector, "selector");
        this.f42981g.g(selector);
        selector.e(this.f42984j.f(), new d(this, null));
    }

    public String toString() {
        String str = i() == null ? null : "WorkflowInstance(…)";
        return "WorkflowInstance(identifier=" + h() + ", renderKey=" + j() + ", instanceId=" + k() + ", parent=" + ((Object) str) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ j(k kVar, nr.k kVar2, Object obj, nr.m mVar, zz.g gVar, h00.l lVar, s.c cVar, s sVar, or.d dVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, kVar2, obj, mVar, gVar, (i11 & 32) != 0 ? a.f42986a : lVar, (i11 & 64) != 0 ? null : cVar, (i11 & 128) != 0 ? nr.e.f41794a : sVar, (i11 & 256) != 0 ? null : dVar);
    }
}