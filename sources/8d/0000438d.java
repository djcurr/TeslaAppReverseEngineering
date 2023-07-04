package com.plaid.internal;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class d5 implements tw.e<md> {

    /* renamed from: a  reason: collision with root package name */
    public final m4 f18489a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<ja> f18490b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider<g9> f18491c;

    public d5(m4 m4Var, Provider<ja> provider, Provider<g9> provider2) {
        this.f18489a = m4Var;
        this.f18490b = provider;
        this.f18491c = provider2;
    }

    public static md a(m4 m4Var, ja retrofitFactory, g9 plaidEnvironmentStore) {
        m4Var.getClass();
        kotlin.jvm.internal.s.g(retrofitFactory, "retrofitFactory");
        kotlin.jvm.internal.s.g(plaidEnvironmentStore, "plaidEnvironmentStore");
        Object b11 = retrofitFactory.a(plaidEnvironmentStore.c(), new la(null, null, 3)).b(md.class);
        kotlin.jvm.internal.s.f(b11, "retrofitFactory\n      .g…(WorkflowApi::class.java)");
        return (md) tw.h.e((md) b11);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return a(this.f18489a, this.f18490b.get(), this.f18491c.get());
    }
}