package com.plaid.internal;

import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class s4 implements tw.e<o6> {

    /* renamed from: a  reason: collision with root package name */
    public final m4 f19419a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<WorkflowDatabase> f19420b;

    public s4(m4 m4Var, Provider<WorkflowDatabase> provider) {
        this.f19419a = m4Var;
        this.f19420b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        m4 m4Var = this.f19419a;
        WorkflowDatabase database = this.f19420b.get();
        m4Var.getClass();
        kotlin.jvm.internal.s.g(database, "database");
        return (o6) tw.h.e(new n6(database));
    }
}