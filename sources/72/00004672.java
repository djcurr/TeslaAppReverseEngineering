package com.plaid.internal;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class z3 implements tw.e<y3> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider<ma> f19956a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<kotlinx.serialization.json.a> f19957b;

    public z3(Provider<ma> provider, Provider<kotlinx.serialization.json.a> provider2) {
        this.f19956a = provider;
        this.f19957b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new y3(this.f19956a.get(), tw.d.a(this.f19957b));
    }
}