package com.plaid.internal;

import android.app.Application;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class x9 implements tw.e<WorkflowDatabase> {

    /* renamed from: a  reason: collision with root package name */
    public final v9 f19834a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<Application> f19835b;

    public x9(v9 v9Var, Provider<Application> provider) {
        this.f19834a = v9Var;
        this.f19835b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        v9 v9Var = this.f19834a;
        Application application = this.f19835b.get();
        v9Var.getClass();
        kotlin.jvm.internal.s.g(application, "application");
        androidx.room.t0 d11 = androidx.room.q0.a(application, WorkflowDatabase.class, "plaid_workflow_database").e().d();
        kotlin.jvm.internal.s.f(d11, "databaseBuilder(\n      a…igration()\n      .build()");
        return (WorkflowDatabase) tw.h.e((WorkflowDatabase) d11);
    }
}