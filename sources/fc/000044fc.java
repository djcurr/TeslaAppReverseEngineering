package com.plaid.internal;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class p6 implements tw.e<m6> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider<md> f19215a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<o6> f19216b;

    public p6(Provider<md> provider, Provider<o6> provider2) {
        this.f19215a = provider;
        this.f19216b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new m6(this.f19215a.get(), this.f19216b.get());
    }
}