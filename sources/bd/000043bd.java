package com.plaid.internal;

import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.g6;

/* loaded from: classes2.dex */
public final class f3 {

    /* renamed from: a  reason: collision with root package name */
    public final g6.h f18573a;

    /* renamed from: b  reason: collision with root package name */
    public final Pane$PaneRendering f18574b;

    public f3(g6.h state, Pane$PaneRendering rendering) {
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(rendering, "rendering");
        this.f18573a = state;
        this.f18574b = rendering;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f3) {
            f3 f3Var = (f3) obj;
            return kotlin.jvm.internal.s.c(this.f18573a, f3Var.f18573a) && kotlin.jvm.internal.s.c(this.f18574b, f3Var.f18574b);
        }
        return false;
    }

    public int hashCode() {
        return this.f18574b.hashCode() + (this.f18573a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a11 = g4.a("ErrorStateWithRendering(state=");
        a11.append(this.f18573a);
        a11.append(", rendering=");
        a11.append(this.f18574b);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }
}