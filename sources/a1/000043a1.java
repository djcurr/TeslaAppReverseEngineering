package com.plaid.internal;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class e5 implements tw.e<be> {

    /* renamed from: a  reason: collision with root package name */
    public final m4 f18521a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<l7> f18522b;

    public e5(m4 m4Var, Provider<l7> provider) {
        this.f18521a = m4Var;
        this.f18522b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        m4 m4Var = this.f18521a;
        l7 oAuthRedirectUriStore = this.f18522b.get();
        m4Var.getClass();
        kotlin.jvm.internal.s.g(oAuthRedirectUriStore, "oAuthRedirectUriStore");
        return (be) tw.h.e(oAuthRedirectUriStore);
    }
}