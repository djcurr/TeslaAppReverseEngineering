package or;

import kotlin.jvm.internal.s;
import nr.p;
import nr.q;
import v20.o0;
import vz.b0;
import x20.x;

/* loaded from: classes2.dex */
public final class f<PropsT, StateT, OutputT> implements nr.a<PropsT, StateT, OutputT>, nr.h<q<? super PropsT, StateT, ? extends OutputT>> {

    /* renamed from: a  reason: collision with root package name */
    private final a<PropsT, StateT, OutputT> f42955a;

    /* renamed from: b  reason: collision with root package name */
    private final b f42956b;

    /* renamed from: c  reason: collision with root package name */
    private final x<q<? super PropsT, StateT, ? extends OutputT>> f42957c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f42958d;

    /* loaded from: classes2.dex */
    public interface a<PropsT, StateT, OutputT> {
        <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT a(p<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> pVar, ChildPropsT childpropst, String str, h00.l<? super ChildOutputT, ? extends q<? super PropsT, StateT, ? extends OutputT>> lVar);
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(String str, h00.p<? super o0, ? super zz.d<? super b0>, ? extends Object> pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(a<PropsT, StateT, OutputT> renderer, b sideEffectRunner, x<? super q<? super PropsT, StateT, ? extends OutputT>> eventActionsChannel) {
        s.g(renderer, "renderer");
        s.g(sideEffectRunner, "sideEffectRunner");
        s.g(eventActionsChannel, "eventActionsChannel");
        this.f42955a = renderer;
        this.f42956b = sideEffectRunner;
        this.f42957c = eventActionsChannel;
    }

    private final void e() {
        if (!(!this.f42958d)) {
            throw new IllegalStateException("RenderContext cannot be used after render method returns.".toString());
        }
    }

    @Override // nr.a
    public void a(String key, h00.p<? super o0, ? super zz.d<? super b0>, ? extends Object> sideEffect) {
        s.g(key, "key");
        s.g(sideEffect, "sideEffect");
        e();
        this.f42956b.a(key, sideEffect);
    }

    @Override // nr.a
    public nr.h<q<? super PropsT, StateT, ? extends OutputT>> b() {
        return this;
    }

    @Override // nr.a
    public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT c(p<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT childpropst, String key, h00.l<? super ChildOutputT, ? extends q<? super PropsT, StateT, ? extends OutputT>> handler) {
        s.g(child, "child");
        s.g(key, "key");
        s.g(handler, "handler");
        e();
        return (ChildRenderingT) this.f42955a.a(child, childpropst, key, handler);
    }

    public final void f() {
        e();
        this.f42958d = true;
    }

    @Override // nr.h
    /* renamed from: g */
    public void d(q<? super PropsT, StateT, ? extends OutputT> value) {
        s.g(value, "value");
        if (this.f42958d) {
            this.f42957c.offer(value);
            return;
        }
        throw new UnsupportedOperationException(s.p("Expected sink to not be sent to until after the render pass. Received action: ", value));
    }
}