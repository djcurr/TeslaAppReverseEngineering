package com.plaid.internal;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class o4 implements tw.e<k3> {

    /* renamed from: a  reason: collision with root package name */
    public final m4 f19133a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<l3> f19134b;

    public o4(m4 m4Var, Provider<l3> provider) {
        this.f19133a = m4Var;
        this.f19134b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        m4 m4Var = this.f19133a;
        l3 featureStore = this.f19134b.get();
        m4Var.getClass();
        kotlin.jvm.internal.s.g(featureStore, "featureStore");
        return (k3) tw.h.e(new k3(featureStore));
    }
}