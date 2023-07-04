package com.plaid.internal;

import android.content.res.Resources;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class h3 implements tw.e<g3> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider<Resources> f18686a;

    public h3(Provider<Resources> provider) {
        this.f18686a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new g3(this.f18686a.get());
    }
}