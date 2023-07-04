package com.plaid.internal;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class w4 implements tw.e<ab> {

    /* renamed from: a  reason: collision with root package name */
    public final m4 f19663a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<j6> f19664b;

    public w4(m4 m4Var, Provider<j6> provider) {
        this.f19663a = m4Var;
        this.f19664b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        m4 m4Var = this.f19663a;
        j6 linkStateStore = this.f19664b.get();
        m4Var.getClass();
        kotlin.jvm.internal.s.g(linkStateStore, "linkStateStore");
        return (ab) tw.h.e(linkStateStore);
    }
}