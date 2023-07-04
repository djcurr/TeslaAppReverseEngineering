package androidx.lifecycle;

import v20.e1;
import v20.y2;

/* loaded from: classes.dex */
public final class q0 {
    public static final v20.o0 a(p0 p0Var) {
        kotlin.jvm.internal.s.g(p0Var, "<this>");
        v20.o0 o0Var = (v20.o0) p0Var.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (o0Var != null) {
            return o0Var;
        }
        Object tagIfAbsent = p0Var.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new e(y2.b(null, 1, null).plus(e1.c().R0())));
        kotlin.jvm.internal.s.f(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (v20.o0) tagIfAbsent;
    }
}