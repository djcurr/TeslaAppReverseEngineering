package androidx.room;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import v20.s1;

/* loaded from: classes.dex */
public final class o {
    public static final v20.j0 a(t0 t0Var) {
        kotlin.jvm.internal.s.g(t0Var, "<this>");
        Map<String, Object> backingFieldMap = t0Var.getBackingFieldMap();
        kotlin.jvm.internal.s.f(backingFieldMap, "backingFieldMap");
        Object obj = backingFieldMap.get("QueryDispatcher");
        if (obj == null) {
            Executor queryExecutor = t0Var.getQueryExecutor();
            kotlin.jvm.internal.s.f(queryExecutor, "queryExecutor");
            obj = s1.b(queryExecutor);
            backingFieldMap.put("QueryDispatcher", obj);
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (v20.j0) obj;
    }

    public static final v20.j0 b(t0 t0Var) {
        kotlin.jvm.internal.s.g(t0Var, "<this>");
        Map<String, Object> backingFieldMap = t0Var.getBackingFieldMap();
        kotlin.jvm.internal.s.f(backingFieldMap, "backingFieldMap");
        Object obj = backingFieldMap.get("TransactionDispatcher");
        if (obj == null) {
            Executor transactionExecutor = t0Var.getTransactionExecutor();
            kotlin.jvm.internal.s.f(transactionExecutor, "transactionExecutor");
            obj = s1.b(transactionExecutor);
            backingFieldMap.put("TransactionDispatcher", obj);
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (v20.j0) obj;
    }
}