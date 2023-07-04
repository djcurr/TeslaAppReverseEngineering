package com.plaid.internal;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class u4 implements tw.e<l7> {

    /* renamed from: a  reason: collision with root package name */
    public final m4 f19576a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<w6> f19577b;

    public u4(m4 m4Var, Provider<w6> provider) {
        this.f19576a = m4Var;
        this.f19577b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        m4 m4Var = this.f19576a;
        w6 localPaneStateStore = this.f19577b.get();
        m4Var.getClass();
        kotlin.jvm.internal.s.g(localPaneStateStore, "localPaneStateStore");
        return (l7) tw.h.e(new l7(localPaneStateStore));
    }
}