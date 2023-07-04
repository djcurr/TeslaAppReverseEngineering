package androidx.camera.core.impl;

import androidx.camera.core.impl.d0;
import java.util.Set;

/* loaded from: classes.dex */
public interface f1 extends d0 {
    @Override // androidx.camera.core.impl.d0
    default <ValueT> ValueT a(d0.a<ValueT> aVar) {
        return (ValueT) l().a(aVar);
    }

    @Override // androidx.camera.core.impl.d0
    default boolean b(d0.a<?> aVar) {
        return l().b(aVar);
    }

    @Override // androidx.camera.core.impl.d0
    default void c(String str, d0.b bVar) {
        l().c(str, bVar);
    }

    @Override // androidx.camera.core.impl.d0
    default <ValueT> ValueT d(d0.a<ValueT> aVar, d0.c cVar) {
        return (ValueT) l().d(aVar, cVar);
    }

    @Override // androidx.camera.core.impl.d0
    default Set<d0.a<?>> e() {
        return l().e();
    }

    @Override // androidx.camera.core.impl.d0
    default Set<d0.c> f(d0.a<?> aVar) {
        return l().f(aVar);
    }

    @Override // androidx.camera.core.impl.d0
    default <ValueT> ValueT g(d0.a<ValueT> aVar, ValueT valuet) {
        return (ValueT) l().g(aVar, valuet);
    }

    @Override // androidx.camera.core.impl.d0
    default d0.c h(d0.a<?> aVar) {
        return l().h(aVar);
    }

    d0 l();
}