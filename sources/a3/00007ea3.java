package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import k20.b1;
import k20.d0;
import k20.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import w00.i;
import w00.l0;
import w00.q;
import w00.s0;
import w00.v0;

/* loaded from: classes5.dex */
public interface e extends b {

    /* loaded from: classes5.dex */
    public interface a<D extends e> {
        a<D> a();

        a<D> b(q qVar);

        D build();

        a<D> c(List<v0> list);

        a<D> d();

        a<D> e();

        a<D> f(i iVar);

        a<D> g(d0 d0Var);

        a<D> h(f fVar);

        a<D> i();

        a<D> j(b bVar);

        a<D> k(boolean z11);

        a<D> l(b1 b1Var);

        a<D> m(List<s0> list);

        a<D> n(l0 l0Var);

        a<D> o(u10.f fVar);

        a<D> p(l0 l0Var);

        a<D> q(b.a aVar);

        a<D> r(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar);

        a<D> s();
    }

    boolean A();

    boolean A0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a, w00.i
    e a();

    @Override // w00.j, w00.i
    i b();

    e c(d1 d1Var);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a
    Collection<? extends e> d();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    e n0();

    a<? extends e> s();

    boolean x0();
}