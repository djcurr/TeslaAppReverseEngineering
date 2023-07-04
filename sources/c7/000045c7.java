package com.plaid.internal;

import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class v4 implements tw.e<a8> {

    /* renamed from: a  reason: collision with root package name */
    public final m4 f19616a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<WorkflowDatabase> f19617b;

    public v4(m4 m4Var, Provider<WorkflowDatabase> provider) {
        this.f19616a = m4Var;
        this.f19617b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        m4 m4Var = this.f19616a;
        WorkflowDatabase database = this.f19617b.get();
        m4Var.getClass();
        kotlin.jvm.internal.s.g(database, "database");
        return (a8) tw.h.e(new a3(database, new c7()));
    }
}