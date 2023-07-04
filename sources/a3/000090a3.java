package or;

import kotlin.jvm.internal.s;
import nr.p;
import nr.q;
import or.e;

/* loaded from: classes2.dex */
public final class i<ChildPropsT, ChildOutputT, ParentPropsT, ParentStateT, ParentOutputT> implements e.a<i<?, ?, ?, ?, ?>> {

    /* renamed from: a  reason: collision with root package name */
    private final p<?, ChildOutputT, ?> f42971a;

    /* renamed from: b  reason: collision with root package name */
    private h00.l<? super ChildOutputT, ? extends q<? super ParentPropsT, ParentStateT, ? extends ParentOutputT>> f42972b;

    /* renamed from: c  reason: collision with root package name */
    private final j<ChildPropsT, ?, ChildOutputT, ?> f42973c;

    /* renamed from: d  reason: collision with root package name */
    private i<?, ?, ?, ?, ?> f42974d;

    /* JADX WARN: Multi-variable type inference failed */
    public i(p<?, ? extends ChildOutputT, ?> workflow, h00.l<? super ChildOutputT, ? extends q<? super ParentPropsT, ParentStateT, ? extends ParentOutputT>> handler, j<ChildPropsT, ?, ChildOutputT, ?> workflowNode) {
        s.g(workflow, "workflow");
        s.g(handler, "handler");
        s.g(workflowNode, "workflowNode");
        this.f42971a = workflow;
        this.f42972b = handler;
        this.f42973c = workflowNode;
    }

    public final q<ParentPropsT, ParentStateT, ParentOutputT> c(Object obj) {
        return (q) ((q<? super ParentPropsT, ParentStateT, ? extends ParentOutputT>) this.f42972b.invoke(obj));
    }

    public final k d() {
        return this.f42973c.g();
    }

    @Override // or.e.a
    /* renamed from: e */
    public i<?, ?, ?, ?, ?> a() {
        return this.f42974d;
    }

    public final p<?, ChildOutputT, ?> f() {
        return this.f42971a;
    }

    public final j<ChildPropsT, ?, ChildOutputT, ?> g() {
        return this.f42973c;
    }

    public final boolean h(p<?, ?, ?> otherWorkflow, String key) {
        s.g(otherWorkflow, "otherWorkflow");
        s.g(key, "key");
        return d().c(otherWorkflow, key);
    }

    public final <R> R i(nr.k<?, ?, ?, ?> workflow, Object obj) {
        s.g(workflow, "workflow");
        return (R) this.f42973c.l(workflow, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <CO, CP, S, O> void j(h00.l<? super CO, ? extends q<? super CP, S, ? extends O>> newHandler) {
        s.g(newHandler, "newHandler");
        this.f42972b = newHandler;
    }

    @Override // or.e.a
    /* renamed from: k */
    public void b(i<?, ?, ?, ?, ?> iVar) {
        this.f42974d = iVar;
    }
}