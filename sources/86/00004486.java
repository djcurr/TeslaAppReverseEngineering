package com.plaid.internal;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ld {

    /* renamed from: a  reason: collision with root package name */
    public final String f18984a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18985b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f18986c;

    public ld(String workflowId, String id2, byte[] model) {
        kotlin.jvm.internal.s.g(workflowId, "workflowId");
        kotlin.jvm.internal.s.g(id2, "id");
        kotlin.jvm.internal.s.g(model, "model");
        this.f18984a = workflowId;
        this.f18985b = id2;
        this.f18986c = model;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (kotlin.jvm.internal.s.c(ld.class, obj == null ? null : obj.getClass())) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.plaid.internal.workflow.persistence.database.model.WorkflowAnalyticsEntity");
            ld ldVar = (ld) obj;
            return kotlin.jvm.internal.s.c(this.f18984a, ldVar.f18984a) && kotlin.jvm.internal.s.c(this.f18985b, ldVar.f18985b) && Arrays.equals(this.f18986c, ldVar.f18986c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f18985b.hashCode();
        return Arrays.hashCode(this.f18986c) + ((hashCode + (this.f18984a.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder a11 = g4.a("WorkflowAnalyticsEntity(workflowId=");
        a11.append(this.f18984a);
        a11.append(", id=");
        a11.append(this.f18985b);
        a11.append(", model=");
        a11.append(Arrays.toString(this.f18986c));
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }
}