package y20;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes5.dex */
public final class m {
    public static final void a(AbortFlowException abortFlowException, kotlinx.coroutines.flow.f<?> fVar) {
        if (abortFlowException.a() != fVar) {
            throw abortFlowException;
        }
    }
}