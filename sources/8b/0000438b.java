package com.plaid.internal;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class d3 implements tw.e<c3> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider<cb> f18485a;

    public d3(Provider<cb> provider) {
        this.f18485a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new c3(this.f18485a.get());
    }
}