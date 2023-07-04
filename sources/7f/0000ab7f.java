package pr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import b5.a;

/* loaded from: classes2.dex */
public final class r<BindingT extends b5.a, RenderingT> implements u<RenderingT> {

    /* renamed from: a  reason: collision with root package name */
    private final n00.d<RenderingT> f46891a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.q<LayoutInflater, ViewGroup, Boolean, BindingT> f46892b;

    /* renamed from: c  reason: collision with root package name */
    private final h00.l<BindingT, i<RenderingT>> f46893c;

    /* loaded from: classes2.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.p<RenderingT, s, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i<RenderingT> f46894a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i<RenderingT> iVar) {
            super(2);
            this.f46894a = iVar;
        }

        public final void a(RenderingT rendering, s environment) {
            kotlin.jvm.internal.s.g(rendering, "rendering");
            kotlin.jvm.internal.s.g(environment, "environment");
            this.f46894a.a(rendering, environment);
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(Object obj, s sVar) {
            a(obj, sVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(n00.d<RenderingT> type, h00.q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends BindingT> bindingInflater, h00.l<? super BindingT, ? extends i<RenderingT>> runnerConstructor) {
        kotlin.jvm.internal.s.g(type, "type");
        kotlin.jvm.internal.s.g(bindingInflater, "bindingInflater");
        kotlin.jvm.internal.s.g(runnerConstructor, "runnerConstructor");
        this.f46891a = type;
        this.f46892b = bindingInflater;
        this.f46893c = runnerConstructor;
    }

    @Override // pr.u
    public View a(RenderingT initialRendering, s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
        kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
        kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
        kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
        h00.q<LayoutInflater, ViewGroup, Boolean, BindingT> qVar = this.f46892b;
        LayoutInflater a11 = j.a(contextForNewView, viewGroup);
        kotlin.jvm.internal.s.f(a11, "contextForNewView.viewBindingLayoutInflater(container)");
        BindingT invoke = qVar.invoke(a11, viewGroup, Boolean.FALSE);
        View root = invoke.getRoot();
        kotlin.jvm.internal.s.f(root, "binding.root");
        x.a(root, initialRendering, initialViewEnvironment, new a(this.f46893c.invoke(invoke)));
        View root2 = invoke.getRoot();
        kotlin.jvm.internal.s.f(root2, "bindingInflater(contextForNewView.viewBindingLayoutInflater(container), container, false)\n      .also { binding ->\n        val runner = runnerConstructor(binding)\n        binding.root.bindShowRendering(\n          initialRendering,\n          initialViewEnvironment\n        ) { rendering, environment ->\n          runner.showRendering(rendering, environment)\n        }\n      }\n      .root");
        return root2;
    }

    @Override // pr.u
    public n00.d<RenderingT> getType() {
        return this.f46891a;
    }
}