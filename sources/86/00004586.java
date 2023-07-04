package com.plaid.internal;

import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class t4 implements tw.e<w6> {

    /* renamed from: a  reason: collision with root package name */
    public final m4 f19500a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<WorkflowDatabase> f19501b;

    public t4(m4 m4Var, Provider<WorkflowDatabase> provider) {
        this.f19500a = m4Var;
        this.f19501b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        m4 m4Var = this.f19500a;
        WorkflowDatabase database = this.f19501b.get();
        m4Var.getClass();
        kotlin.jvm.internal.s.g(database, "database");
        return (w6) tw.h.e(new v6(database, new c7()));
    }
}