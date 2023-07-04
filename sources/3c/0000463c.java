package com.plaid.internal;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class x4 implements tw.e<cb> {

    /* renamed from: a  reason: collision with root package name */
    public final m4 f19819a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<a8> f19820b;

    public x4(m4 m4Var, Provider<a8> provider) {
        this.f19819a = m4Var;
        this.f19820b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        m4 m4Var = this.f19819a;
        a8 paneStore = this.f19820b.get();
        m4Var.getClass();
        kotlin.jvm.internal.s.g(paneStore, "paneStore");
        return (cb) tw.h.e(paneStore);
    }
}