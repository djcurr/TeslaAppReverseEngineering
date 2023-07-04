package com.plaid.internal;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class f5 implements tw.e<ce> {

    /* renamed from: a  reason: collision with root package name */
    public final m4 f18579a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<dd> f18580b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider<k3> f18581c;

    public f5(m4 m4Var, Provider<dd> provider, Provider<k3> provider2) {
        this.f18579a = m4Var;
        this.f18580b = provider;
        this.f18581c = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        m4 m4Var = this.f18579a;
        dd webviewFallbackUriStore = this.f18580b.get();
        k3 featureManager = this.f18581c.get();
        m4Var.getClass();
        kotlin.jvm.internal.s.g(webviewFallbackUriStore, "webviewFallbackUriStore");
        kotlin.jvm.internal.s.g(featureManager, "featureManager");
        return (ce) tw.h.e(webviewFallbackUriStore);
    }
}