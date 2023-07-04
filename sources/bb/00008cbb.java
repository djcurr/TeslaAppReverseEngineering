package nr;

import v20.o0;

/* loaded from: classes2.dex */
public abstract class k<PropsT, StateT, OutputT, RenderingT> implements p<PropsT, OutputT, RenderingT> {

    /* loaded from: classes2.dex */
    public final class a implements nr.a<PropsT, StateT, OutputT> {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ nr.a<PropsT, StateT, OutputT> f41808a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(k this$0, nr.a<? extends PropsT, StateT, ? super OutputT> baseContext) {
            kotlin.jvm.internal.s.g(this$0, "this$0");
            kotlin.jvm.internal.s.g(baseContext, "baseContext");
            this.f41808a = baseContext;
        }

        @Override // nr.a
        public void a(String key, h00.p<? super o0, ? super zz.d<? super vz.b0>, ? extends Object> sideEffect) {
            kotlin.jvm.internal.s.g(key, "key");
            kotlin.jvm.internal.s.g(sideEffect, "sideEffect");
            this.f41808a.a(key, sideEffect);
        }

        @Override // nr.a
        public h<q<? super PropsT, StateT, ? extends OutputT>> b() {
            return this.f41808a.b();
        }

        @Override // nr.a
        public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT c(p<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT childpropst, String key, h00.l<? super ChildOutputT, ? extends q<? super PropsT, StateT, ? extends OutputT>> handler) {
            kotlin.jvm.internal.s.g(child, "child");
            kotlin.jvm.internal.s.g(key, "key");
            kotlin.jvm.internal.s.g(handler, "handler");
            return (ChildRenderingT) this.f41808a.c(child, childpropst, key, handler);
        }
    }

    @Override // nr.p
    public final k<PropsT, StateT, OutputT, RenderingT> b() {
        return this;
    }

    public abstract StateT d(PropsT propst, i iVar);

    public StateT e(PropsT propst, PropsT propst2, StateT statet) {
        return statet;
    }

    public abstract RenderingT f(PropsT propst, StateT statet, k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT>.a aVar);

    public abstract i g(StateT statet);
}