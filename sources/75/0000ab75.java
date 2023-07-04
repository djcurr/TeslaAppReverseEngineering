package pr;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class k<RenderingT> implements u<RenderingT> {

    /* renamed from: a  reason: collision with root package name */
    private final n00.d<RenderingT> f46873a;

    /* renamed from: b  reason: collision with root package name */
    private final int f46874b;

    /* renamed from: c  reason: collision with root package name */
    private final h00.l<View, i<RenderingT>> f46875c;

    /* loaded from: classes2.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.p<RenderingT, s, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i<RenderingT> f46876a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i<RenderingT> iVar) {
            super(2);
            this.f46876a = iVar;
        }

        public final void a(RenderingT rendering, s environment) {
            kotlin.jvm.internal.s.g(rendering, "rendering");
            kotlin.jvm.internal.s.g(environment, "environment");
            this.f46876a.a(rendering, environment);
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(Object obj, s sVar) {
            a(obj, sVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(n00.d<RenderingT> type, int i11, h00.l<? super View, ? extends i<RenderingT>> runnerConstructor) {
        kotlin.jvm.internal.s.g(type, "type");
        kotlin.jvm.internal.s.g(runnerConstructor, "runnerConstructor");
        this.f46873a = type;
        this.f46874b = i11;
        this.f46875c = runnerConstructor;
    }

    @Override // pr.u
    public View a(RenderingT initialRendering, s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
        kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
        kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
        kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
        View view = j.a(contextForNewView, viewGroup).inflate(this.f46874b, viewGroup, false);
        h00.l<View, i<RenderingT>> lVar = this.f46875c;
        kotlin.jvm.internal.s.f(view, "view");
        x.a(view, initialRendering, initialViewEnvironment, new a(lVar.invoke(view)));
        kotlin.jvm.internal.s.f(view, "contextForNewView.viewBindingLayoutInflater(container)\n      .inflate(layoutId, container, false)\n      .also { view ->\n        val runner = runnerConstructor(view)\n        view.bindShowRendering(initialRendering, initialViewEnvironment) { rendering, environment ->\n          runner.showRendering(rendering, environment)\n        }\n      }");
        return view;
    }

    @Override // pr.u
    public n00.d<RenderingT> getType() {
        return this.f46873a;
    }
}