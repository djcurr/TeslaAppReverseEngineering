package com.plaid.internal;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ba implements tw.e<t8> {

    /* renamed from: a  reason: collision with root package name */
    public final v9 f18231a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<ma> f18232b;

    public ba(v9 v9Var, Provider<ma> provider) {
        this.f18231a = v9Var;
        this.f18232b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        v9 v9Var = this.f18231a;
        ma storage = this.f18232b.get();
        v9Var.getClass();
        kotlin.jvm.internal.s.g(storage, "storage");
        return (t8) tw.h.e(new t8(storage));
    }
}