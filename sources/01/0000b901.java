package v20;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class s1 {
    public static final Executor a(j0 j0Var) {
        q1 q1Var = j0Var instanceof q1 ? (q1) j0Var : null;
        Executor R0 = q1Var != null ? q1Var.R0() : null;
        return R0 == null ? new d1(j0Var) : R0;
    }

    public static final j0 b(Executor executor) {
        d1 d1Var = executor instanceof d1 ? (d1) executor : null;
        j0 j0Var = d1Var != null ? d1Var.f53907a : null;
        return j0Var == null ? new r1(executor) : j0Var;
    }

    public static final q1 c(ExecutorService executorService) {
        return new r1(executorService);
    }
}