package pr;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class d<RenderingT> implements u<RenderingT> {

    /* renamed from: a  reason: collision with root package name */
    private final n00.d<RenderingT> f46849a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.r<RenderingT, s, Context, ViewGroup, View> f46850b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(n00.d<RenderingT> type, h00.r<? super RenderingT, ? super s, ? super Context, ? super ViewGroup, ? extends View> viewConstructor) {
        kotlin.jvm.internal.s.g(type, "type");
        kotlin.jvm.internal.s.g(viewConstructor, "viewConstructor");
        this.f46849a = type;
        this.f46850b = viewConstructor;
    }

    @Override // pr.u
    public View a(RenderingT initialRendering, s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
        kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
        kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
        kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
        return this.f46850b.invoke(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
    }

    @Override // pr.u
    public n00.d<RenderingT> getType() {
        return this.f46849a;
    }
}