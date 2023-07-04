package com.plaid.internal;

import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInput$UserInputPane;

/* loaded from: classes2.dex */
public final class ya {

    /* renamed from: a  reason: collision with root package name */
    public final UserInput$UserInputPane.Rendering.Prompt f19897a;

    /* renamed from: b  reason: collision with root package name */
    public String f19898b;

    public ya(UserInput$UserInputPane.Rendering.Prompt prompt, String str) {
        kotlin.jvm.internal.s.g(prompt, "prompt");
        this.f19897a = prompt;
        this.f19898b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ya) {
            ya yaVar = (ya) obj;
            return kotlin.jvm.internal.s.c(this.f19897a, yaVar.f19897a) && kotlin.jvm.internal.s.c(this.f19898b, yaVar.f19898b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f19897a.hashCode() * 31;
        String str = this.f19898b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder a11 = g4.a("PromptWithOutput(prompt=");
        a11.append(this.f19897a);
        a11.append(", output=");
        a11.append((Object) this.f19898b);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }
}