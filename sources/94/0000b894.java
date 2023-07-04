package v2;

import android.text.style.TtsSpan;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import n2.c0;
import n2.d0;

/* loaded from: classes.dex */
public final class g {
    public static final TtsSpan a(c0 c0Var) {
        s.g(c0Var, "<this>");
        if (c0Var instanceof d0) {
            return b((d0) c0Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TtsSpan b(d0 d0Var) {
        s.g(d0Var, "<this>");
        TtsSpan build = new TtsSpan.VerbatimBuilder(d0Var.a()).build();
        s.f(build, "builder.build()");
        return build;
    }
}