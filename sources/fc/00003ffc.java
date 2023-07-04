package com.plaid.internal;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class c5 implements tw.e<dd> {

    /* renamed from: a  reason: collision with root package name */
    public final m4 f18246a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<w6> f18247b;

    public c5(m4 m4Var, Provider<w6> provider) {
        this.f18246a = m4Var;
        this.f18247b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        m4 m4Var = this.f18246a;
        w6 localPaneStateStore = this.f18247b.get();
        m4Var.getClass();
        kotlin.jvm.internal.s.g(localPaneStateStore, "localPaneStateStore");
        return (dd) tw.h.e(new dd(localPaneStateStore));
    }
}