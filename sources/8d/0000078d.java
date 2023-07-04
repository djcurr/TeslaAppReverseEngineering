package androidx.lifecycle;

import v20.e1;
import v20.y2;

/* loaded from: classes.dex */
public final class t {
    public static final q a(p pVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        kotlin.jvm.internal.s.g(pVar, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) pVar.f5198a.get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(pVar, y2.b(null, 1, null).plus(e1.c().R0()));
        } while (!pVar.f5198a.compareAndSet(null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.f();
        return lifecycleCoroutineScopeImpl;
    }
}