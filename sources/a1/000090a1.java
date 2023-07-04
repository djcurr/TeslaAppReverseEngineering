package or;

import ch.qos.logback.core.CoreConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import nr.q;
import nr.s;
import nr.u;
import nr.v;
import or.e;
import or.f;

/* loaded from: classes2.dex */
public final class h<PropsT, StateT, OutputT> implements f.a<PropsT, StateT, OutputT> {

    /* renamed from: a  reason: collision with root package name */
    private Map<k, nr.m> f42962a;

    /* renamed from: b  reason: collision with root package name */
    private final zz.g f42963b;

    /* renamed from: c  reason: collision with root package name */
    private final h00.l<q<? super PropsT, StateT, ? extends OutputT>, Object> f42964c;

    /* renamed from: d  reason: collision with root package name */
    private final s.c f42965d;

    /* renamed from: e  reason: collision with root package name */
    private final s f42966e;

    /* renamed from: f  reason: collision with root package name */
    private final d f42967f;

    /* renamed from: g  reason: collision with root package name */
    private or.a<i<?, ?, ?, ?, ?>> f42968g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [ChildOutputT] */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a<ChildOutputT> extends p implements h00.l<ChildOutputT, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l0<i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>> f42969a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h<PropsT, StateT, OutputT> f42970b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l0<i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>> l0Var, h<PropsT, StateT, OutputT> hVar) {
            super(1, s.a.class, "acceptChildOutput", "createChildNode$acceptChildOutput(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/squareup/workflow1/internal/SubtreeManager;Ljava/lang/Object;)Ljava/lang/Object;", 0);
            this.f42969a = l0Var;
            this.f42970b = hVar;
        }

        @Override // h00.l
        public final Object invoke(ChildOutputT childoutputt) {
            return h.e(this.f42969a, this.f42970b, childoutputt);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(Map<k, nr.m> map, zz.g contextForChildren, h00.l<? super q<? super PropsT, StateT, ? extends OutputT>, ? extends Object> emitActionToParent, s.c cVar, nr.s interceptor, d dVar) {
        kotlin.jvm.internal.s.g(contextForChildren, "contextForChildren");
        kotlin.jvm.internal.s.g(emitActionToParent, "emitActionToParent");
        kotlin.jvm.internal.s.g(interceptor, "interceptor");
        this.f42962a = map;
        this.f42963b = contextForChildren;
        this.f42964c = emitActionToParent;
        this.f42965d = cVar;
        this.f42966e = interceptor;
        this.f42967f = dVar;
        this.f42968g = new or.a<>();
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [or.i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>, T, or.i] */
    private final <ChildPropsT, ChildOutputT, ChildRenderingT> i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT> d(nr.p<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> pVar, ChildPropsT childpropst, String str, h00.l<? super ChildOutputT, ? extends q<? super PropsT, StateT, ? extends OutputT>> lVar) {
        k a11 = l.a(pVar, str);
        l0 l0Var = new l0();
        Map<k, nr.m> map = this.f42962a;
        ?? r13 = (i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>) new i(pVar, lVar, new j(a11, pVar.b(), childpropst, map == null ? null : map.get(a11), this.f42963b, new a(l0Var, this), this.f42965d, this.f42966e, this.f42967f));
        l0Var.f34916a = r13;
        return r13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <ChildOutputT, PropsT, StateT, OutputT, ChildPropsT> Object e(l0<i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>> l0Var, h<PropsT, StateT, OutputT> hVar, ChildOutputT childoutputt) {
        i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT> iVar = l0Var.f34916a;
        if (iVar != null) {
            return ((h) hVar).f42964c.invoke(iVar.c(childoutputt));
        }
        kotlin.jvm.internal.s.x("node");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // or.f.a
    public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT a(nr.p<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT childpropst, String key, h00.l<? super ChildOutputT, ? extends q<? super PropsT, StateT, ? extends OutputT>> handler) {
        e eVar;
        e eVar2;
        e eVar3;
        kotlin.jvm.internal.s.g(child, "child");
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(handler, "handler");
        eVar = ((or.a) this.f42968g).f42924b;
        for (e.a b11 = eVar.b(); b11 != null; b11 = b11.a()) {
            if (!(!((i) b11).h(child, key))) {
                throw new IllegalArgumentException(("Expected keys to be unique for " + v.g(child) + ": key=\"" + key + CoreConstants.DOUBLE_QUOTE_CHAR).toString());
            }
        }
        or.a<i<?, ?, ?, ?, ?>> aVar = this.f42968g;
        eVar2 = ((or.a) aVar).f42923a;
        e.a b12 = eVar2.b();
        i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT> iVar = null;
        e.a aVar2 = null;
        while (true) {
            if (b12 == null) {
                break;
            } else if (((i) b12).h(child, key)) {
                if (aVar2 == null) {
                    eVar2.e(b12.a());
                } else {
                    aVar2.b(b12.a());
                }
                if (kotlin.jvm.internal.s.c(eVar2.c(), b12)) {
                    eVar2.f(aVar2);
                }
                b12.b(null);
                iVar = b12;
            } else {
                aVar2 = b12;
                b12 = b12.a();
            }
        }
        if (iVar == null) {
            iVar = d(child, childpropst, key, handler);
        }
        eVar3 = ((or.a) aVar).f42924b;
        eVar3.d(iVar);
        i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT> iVar2 = iVar;
        iVar2.j(handler);
        return (ChildRenderingT) iVar2.i(child.b(), childpropst);
    }

    public final void c() {
        e eVar;
        e eVar2;
        e eVar3;
        e eVar4;
        or.a<i<?, ?, ?, ?, ?>> aVar = this.f42968g;
        eVar = ((or.a) aVar).f42923a;
        for (e.a b11 = eVar.b(); b11 != null; b11 = b11.a()) {
            j.e(((i) b11).g(), null, 1, null);
        }
        eVar2 = ((or.a) aVar).f42923a;
        eVar3 = ((or.a) aVar).f42924b;
        ((or.a) aVar).f42923a = eVar3;
        ((or.a) aVar).f42924b = eVar2;
        eVar4 = ((or.a) aVar).f42924b;
        eVar4.a();
        this.f42962a = null;
    }

    public final Map<k, nr.m> f() {
        e eVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        eVar = ((or.a) this.f42968g).f42923a;
        for (e.a b11 = eVar.b(); b11 != null; b11 = b11.a()) {
            i iVar = (i) b11;
            linkedHashMap.put(iVar.d(), iVar.g().n(iVar.f().b()));
        }
        return linkedHashMap;
    }

    public final <T> void g(kotlinx.coroutines.selects.a<? super u<? extends T>> selector) {
        e eVar;
        kotlin.jvm.internal.s.g(selector, "selector");
        eVar = ((or.a) this.f42968g).f42923a;
        for (e.a b11 = eVar.b(); b11 != null; b11 = b11.a()) {
            ((i) b11).g().o(selector);
        }
    }
}