package com.plaid.internal;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class x7 {

    /* renamed from: a  reason: collision with root package name */
    public final String f19823a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19824b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f19825c;

    public x7(String workflowId, String renderingId, byte[] model) {
        kotlin.jvm.internal.s.g(workflowId, "workflowId");
        kotlin.jvm.internal.s.g(renderingId, "renderingId");
        kotlin.jvm.internal.s.g(model, "model");
        this.f19823a = workflowId;
        this.f19824b = renderingId;
        this.f19825c = model;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x7) {
            x7 x7Var = (x7) obj;
            return kotlin.jvm.internal.s.c(this.f19823a, x7Var.f19823a) && kotlin.jvm.internal.s.c(this.f19824b, x7Var.f19824b) && kotlin.jvm.internal.s.c(this.f19825c, x7Var.f19825c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f19824b.hashCode();
        return Arrays.hashCode(this.f19825c) + ((hashCode + (this.f19823a.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder a11 = g4.a("PaneEntity(workflowId=");
        a11.append(this.f19823a);
        a11.append(", renderingId=");
        a11.append(this.f19824b);
        a11.append(", model=");
        a11.append(Arrays.toString(this.f19825c));
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }
}