package com.plaid.internal;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class z4 implements tw.e<db> {

    /* renamed from: a  reason: collision with root package name */
    public final m4 f19958a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<dd> f19959b;

    public z4(m4 m4Var, Provider<dd> provider) {
        this.f19958a = m4Var;
        this.f19959b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        m4 m4Var = this.f19958a;
        dd webviewFallbackUriStore = this.f19959b.get();
        m4Var.getClass();
        kotlin.jvm.internal.s.g(webviewFallbackUriStore, "webviewFallbackUriStore");
        return (db) tw.h.e(webviewFallbackUriStore);
    }
}