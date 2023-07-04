package com.plaid.internal;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class y4 implements tw.e<bb> {

    /* renamed from: a  reason: collision with root package name */
    public final m4 f19886a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<l7> f19887b;

    public y4(m4 m4Var, Provider<l7> provider) {
        this.f19886a = m4Var;
        this.f19887b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        m4 m4Var = this.f19886a;
        l7 oAuthRedirectUriStore = this.f19887b.get();
        m4Var.getClass();
        kotlin.jvm.internal.s.g(oAuthRedirectUriStore, "oAuthRedirectUriStore");
        return (bb) tw.h.e(oAuthRedirectUriStore);
    }
}