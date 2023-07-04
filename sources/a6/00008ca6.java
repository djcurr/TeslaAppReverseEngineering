package nr;

import kotlin.jvm.internal.m0;

/* loaded from: classes2.dex */
final class b<P, S, O> extends q<P, S, O> {

    /* renamed from: a  reason: collision with root package name */
    private final n<?> f41781a;

    /* renamed from: b  reason: collision with root package name */
    private final String f41782b;

    /* renamed from: c  reason: collision with root package name */
    private final O f41783c;

    public b(n<?> worker, String renderKey, O o11) {
        kotlin.jvm.internal.s.g(worker, "worker");
        kotlin.jvm.internal.s.g(renderKey, "renderKey");
        this.f41781a = worker;
        this.f41782b = renderKey;
        this.f41783c = o11;
    }

    @Override // nr.q
    public void a(q<? super P, S, ? extends O>.c cVar) {
        kotlin.jvm.internal.s.g(cVar, "<this>");
        cVar.d((O) this.f41783c);
    }

    public String toString() {
        return ((Object) m0.b(b.class).n()) + "(worker=" + this.f41781a + ", key=\"" + this.f41782b + "\")";
    }
}